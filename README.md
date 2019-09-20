# afptext
Eclipse text editor for creating fully composed AFP

Update Site: https://afpworx--builds.s3.eu-central-1.amazonaws.com/afptext/

AFPText is an eclipse feature that provides a text editor able to edit AFP (Advanced Function Presentation - https://en.wikipedia.org/wiki/Advanced_Function_Presentation) files. It "compiles" text to AFP and vice versa.

## Installation
Like any other eclipse plugin you install AFP Text via the "Install new software" Help menu action, using the update site mentioned above:

![alt installation](https://afpworx--static.s3.eu-central-1.amazonaws.com/install-afptext.gif)

## Quick Start

1. Create a new project
2. Add a file to that project ending with .afptext
3. Say yes to the popup to convert the project into an xtext project (enable automatic compile)
4. Add some structured fields (the editor will help you with content assist)
5. Save the file and see that in src-gen there is a new AFP file
6. If you want to change the location from src-gen to something else go to the project preferences (AfpText)

![alt first test](https://afpworx--static.s3.eu-central-1.amazonaws.com/test-afptext.gif)

## AFP to Text

1. Copy an AFP file to your project
2. Right-Click and select convert to text
3. Open the .afptext and make some changes
4. Find your modified AFP in the output folder.

![convert AFP to text](https://afpworx--static.s3.eu-central-1.amazonaws.com/convert-afp2text.gif)

## Advertisement

To view the composed AFP you need an AFP viewer. Maybe you want to try out a commercial product the auther of AFPText built: https://afpworx.com an analyzing tool for AFP files. If you want to understand how your AFP is structured give it a shot - Free trials are available on the website.
