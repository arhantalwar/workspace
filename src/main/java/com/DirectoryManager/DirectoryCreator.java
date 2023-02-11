package com.DirectoryManager;

import java.io.File;
import java.nio.file.Files;

public class DirectoryCreator {
	
	static int FileCountKeeper;
	
	public void MakeDir(String username) {
		
		String path = "C:\\Users\\ADMIN\\eclipse-workspace-EE\\WorkSpace Mk 0\\src\\main\\webapp\\UserDataBase\\" + username;
		File Dir = new File(path);
		
		if(!Dir.exists()) {
			if(Dir.mkdir()) {
				System.out.println("Folder is Created Successfully");
			}else {
				System.out.println("Folder was not Created");
			}
		}else {
			System.out.println("Folder already exist");
		}
		
		FileCountKeeper = Dir.list().length;
		
		String Projectpath = "C:\\Users\\ADMIN\\eclipse-workspace-EE\\WorkSpace Mk 0\\src\\main\\webapp\\UserDataBase\\" + username + "\\Project" + FileCountKeeper;
		File Projects = new File(Projectpath);
		Projects.mkdir();
		
		File originalFileHTML = new File("C:\\Users\\ADMIN\\eclipse-workspace-EE\\WorkSpace Mk 0\\src\\main\\webapp\\UserDataBase\\BoilerTemplate\\Workspace.html");
		File originalFileCSS = new File("C:\\Users\\ADMIN\\eclipse-workspace-EE\\WorkSpace Mk 0\\src\\main\\webapp\\UserDataBase\\BoilerTemplate\\Workspace.css");
		File originalFileJS = new File("C:\\Users\\ADMIN\\eclipse-workspace-EE\\WorkSpace Mk 0\\src\\main\\webapp\\UserDataBase\\BoilerTemplate\\Workspace.js");
		
		File newFileHTML = new File("C:\\Users\\ADMIN\\eclipse-workspace-EE\\WorkSpace Mk 0\\src\\main\\webapp\\UserDataBase\\" + username + "\\Project" + FileCountKeeper + "\\Workspace.html");
		File newFileCSS = new File("C:\\Users\\ADMIN\\eclipse-workspace-EE\\WorkSpace Mk 0\\src\\main\\webapp\\UserDataBase\\" + username + "\\Project" + FileCountKeeper + "\\Workspace.css");
		File newFileJS = new File("C:\\Users\\ADMIN\\eclipse-workspace-EE\\WorkSpace Mk 0\\src\\main\\webapp\\UserDataBase\\" + username + "\\Project" + FileCountKeeper + "\\Workspace.js");
		
		
		try {
			
			Files.copy(originalFileHTML.toPath(), newFileHTML.toPath());
			Files.copy(originalFileCSS.toPath(), newFileCSS.toPath());
			Files.copy(originalFileJS.toPath(), newFileJS.toPath());
			
		}catch(Exception e) {
			
			System.out.println("Error copying files");
			
		}
		
	}
	
}
