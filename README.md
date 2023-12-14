[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=10187765&assignment_repo_type=AssignmentRepo)
# Welcome to the course CSYE6200 - Object Oriented Design
> Northeastern University, College of Engineering


## Professor: Daniel Peters

### Requirements
1. Eclipse or VS Code or IntelliJ.

Note: If you are using Eclipse, please have git CLI installed on your system or GitHub Desktop to commit the code in this repository

### SetUp Instructions
1. Please clone the repository on your local system
2. For Eclipse Import the project as Existing Maven Project, For IntelliJ you can directlty open it using 'Get from VCS'.
4. All code should be pushed to the main branch
3. Ensure the GitHub actions are successful post push

Submissions will have deadlines, failed GitHub Actions would result in point deductions.

### References
1. Cloning a Repository: <https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository>
2. Any GitHub Setup: Please refer to the Git & GitHub Fundamentals Repository shared to you by your respective TA and refer the README.md section

Please reach out to your respective TA if you need any help in regards with submission/ GitHub

Author:
- Aditya Mulik (mulik.a@northeastern.edu)
- Sai Akhil Vemula (vemula.v@northeastern.edu)

### Specification of Assignment
100 TOTAL POINTS

Design a simple Auto Ordering system so a User can configure their auto for purchase with their choice of options (chosen from below:
10 POINTS –AC: Air Conditioning

10 POINTS –AWD: All Wheel Drive

10 POINTS –ABS: Anti-lock Braking system

10 POINTS –BB: Bumper to Bumper warrantee

10 POINTS –BDM: Blind-side Detection Monitor

These options are your decorators
Design an AutoAPI  10 POINTS
–getPrice()

–getDescription()

Design an Auto subclass which implements the AutoAPI:
–SportyCoupeAuto 10 POINTS

The object created from SportyCoupeAuto is your original object to be modified by your decorators
Your program must show user configured auto
15 POINTS: –Price (with all user options) in dollars

Sum cost of all selected user options
15 POINTS –Description as configured with all user options

Concatenate description of all user options
NOTE: SHOW THREE DIFFERENT USER CONFIGURATIONS (base car with user options)

