<<<<<<< HEAD
class hello{
  public static void main(String args[]){
    System.out.println("Hello, World");
  }
}
=======
git init                                                           // start tracking current directory
git add -A                                                         // add all files in current directory to staging area, making them available for commit
git commit -m "commit message"                                     // commit your changes
git remote add origin https://github.com/username/repo-name.git    // add remote repository URL which contains the required details
git pull origin master                                             // always pull from remote before pushing
git push -u origin master
>>>>>>> 8bef54b (commit)
