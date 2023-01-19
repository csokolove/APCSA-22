function newMod
{
cd "C:\APCS Course Files"; $modNum = Read-Host -Prompt "Module #"; if ( $modNum.length -ilt 2) { $modNum = "0" + $modNum}; $moduleFolder = "Module " + $modNum; mkdir $moduleFolder; cd $moduleFolder; $modAssignments = "Mod" + $modNum + " Assignments"; mkdir $modAssignments; $modDocuments = "Mod" + $modNum + " Documents"; mkdir $modDocuments; $modLessons = "Mod" + $modNum + " Lessons"; mkdir $modLessons; clear;
} 