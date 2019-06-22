#Steps to push the file to the master: you can always check the status in each step by doing (git status)
1) add the file inside your Git Repository. 
2) Move the file create to the git staging area by using the command (git add "file name")
3) Commit our file by moving it to our local Repository using the command (git commit -m "commit message")
4) Push the changes to the remote Repository by using the command (git push origin "branch name")
5) In good practices while working on a team it's always better to do a pull (git pull) before doing push.
6) In case you add a file to the staging area and you want to revert the changes you can use (git reset HEAD "file name")
