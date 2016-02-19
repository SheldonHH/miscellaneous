####1. Delete a folder (not empty)
`rmdir -rf `   + "directory"

FYI: you can use letters -f, -r, -v:

-r: to remove directories and their contents recursively
-f: to ignore non-existent files, never prompt
-v: to explain what is being done

In Case *User doesnot have permission to delete the folder:*

`su rmdir -rf`



####2. Terminate and Clear
`Ctrl + C` to terminate a process
`Command + k` to clear the screen



####3. Show Hidden Files and Hide Hidden Files
defaults write com.apple.finder AppleShowAllFiles YES
Press `Option` and Write 