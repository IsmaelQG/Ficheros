package ejercicio_1;

import java.io.File;

public class AskFile {
	
	private String URL;
	
	public AskFile(String URL) {
		this.URL = URL;
	}
	
	public String showFile() {
		File file = new File(URL);
		if(file.exists()) {
			return String.format("%s\n%s\n%s\n%s\n%s", file.getName(), file.canExecute(), file.isHidden(), file.getAbsolutePath(), file.getTotalSpace());
		}
		else {
			return "No existe";
		}
	}

}
