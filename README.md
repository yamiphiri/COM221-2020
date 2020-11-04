# x1
# Steps taken
## 1. create repository online
```bash
go to new --> enter repository name --> toggle private -->check add readme 
```
## 2. make the invitation
```bash
go to settings --> manage access --> click invite collaborators (yamiphiri)  
```
## 3. clone the repository
###### 3.1 in your reposotory online

```bash

go to code --> code (the one in green) --> copy the link that starts with https(make sure is has the name of you repository)  

```
###### 2 in your pc, go to a folder where you want to put you repository right click and select git bash here 
```bash
git clone link copied in step 3.1
    git clone https://github.com/yamiphiri/x1.git
cd name of the repository
    cd x1
```
## 4. add files to the folder
```bash
git status
    to check if the are untracked files   or uncommited changes
git add *
    to add all untracked files
git commit -m "commit messege"
    to commit the changes
```
## 5. pushing the changes to the online repository
```bash
    git push 
```
# *** Issues***
if your computer has two or more account and your commit online is showing the name on the different user beside the one you authenticated with chane git user and email for the cloned repository on your computer 
```bash
git config user.email "email@cc.ac.mw"
```


