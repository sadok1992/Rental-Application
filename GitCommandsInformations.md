# Steps to push the file to the master: you can always check the status in each step by doing (git status)
1) add the file inside your Git Repository. 
2) Move the file create to the git staging area by using the command (git add "file name")
3) Commit our file by moving it to our local Repository using the command (git commit -m "commit message")
4) Push the changes to the remote Repository by using the command (git push origin "branch name")
5) In good practices while working on a team it's always better to do a pull (git pull) before doing push.
6) In case you add a file to the staging area and you want to revert the changes you can use (git reset HEAD "file name")

# Steps that can be done to compare between files for different areas (I'm using p4merge as comparaison tool)
1) To compare between the Working Directory area and the stating area, I use the command (git difftool)
2) To compare between the Working Directory area and the local repository area, I use the command (git difftool HEAD) 
3) To compare between the Staging area and the local repository, I use the command (git difftool --staged HEAD)
4) To compare between the Local Repository area and the Remote Repository area, I use the command (git difftool master origin/master)

# Steps that can be done for Branching (In good practice while working in a project it's always better to create a new branch for every feature and then merge it in Master)
1) To list all current branches use (git branch -a)
2) To create a new branch use (git branch "Name of the Branch")
3) To move to another branch use (git checkout "branch name to move to")
4) To delete a branch use (git branch -d "branch name to be deleted")
5) To merge the different modifications in one branch to the master we need to point to the master branch then use (git merge "branch name to be merged with the master")
6) In case of conflict happening while merging we can use our tool p4merge by using the command (git mergetool)

# Steps that can be done in Rebasing (Rebasing is the concept one the master is updated but the current branch doesn't have this modification which want to push them to the current branch)
1) Point to the branch where you want the rebase to happen use (git checkout "branch name to move to")
2) Rebase use (git rebase "source frome where we will take the changes") the source in most of the case will be master.