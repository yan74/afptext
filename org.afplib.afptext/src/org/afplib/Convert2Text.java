package org.afplib;

import java.io.FileNotFoundException;
import java.nio.charset.Charset;

import org.afplib.generator.AFP2Text;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.jobs.JobStatus;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class Convert2Text extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelectionService service = window.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
	 
		//check if it is an IFile
		if (structured.getFirstElement() instanceof IFile) {
			// get the selected file
			IFile file = (IFile) structured.getFirstElement();
			// get the path
			IPath path = file.getLocation();
			System.out.println(path.toPortableString());

			IFile afp = file.getProject().getFile(file.getProjectRelativePath().removeFileExtension().addFileExtension("afptext"));
			
			if(afp.exists()) {
				System.out.println("afptext exists");
			} else {
				System.out.println("afptext does not exist");
			}
			
			Job job = new Job("convert "+path.lastSegment()+" to AFP.") {
				
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					Charset charset = Charset.forName("UTF-8");
					try {
						afp.delete(true, monitor);
						AFP2Text converter = new AFP2Text(file, charset , monitor);
						afp.create(converter, true, null);
						afp.setCharset(charset.name(), monitor);
					} catch (FileNotFoundException e) {
						return new Status(IStatus.ERROR, "org.afplib.afptext", e.getLocalizedMessage(), e);
					} catch (CoreException e) {
						return new Status(IStatus.ERROR, "org.afplib.afptext", e.getLocalizedMessage(), e);
					}

					return new Status(IStatus.OK, "org.afplib.afptext", "");
				}
				
			};
			
			job.schedule();
		}
	 
		return null;
	}

}
