package section5_1;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		Path[] paths = new Path[5];
		paths[0] = Paths.get("C:\\java_programming\\NIO2\\DemoFile.txt");
		paths[1] = Paths.get("C:/java_programming/NIO2/DemoFile.txt");
		paths[2] = Paths.get("C:","java_programming","NIO2", "DemoFile.txt");
		paths[3] = Paths.get("DemoFile.txt");
		paths[4] = Paths.get(URI.create("file:///C:/java_programming/~/DemoFile.txt"));
	
		for(int i = 0; i<paths.length; i++) {
			System.out.println("Caminho do path [" +  i + "]" + paths[i]);
			
			System.out.println();
		}
		
		System.out.println(paths[0].getFileName());
		System.out.println(paths[0].getParent());
		System.out.println(paths[0].getNameCount());
		System.out.println(paths[4].isAbsolute());
		System.out.println(paths[3].toAbsolutePath());
		System.out.println(paths[0].toFile());
		System.out.println(paths[0].toUri());
		
		Path rp = Paths.get("C:/java_programning/IO/../NIO2//DemoFile.txt");
		System.out.println("rp.normalize() [" + rp.normalize() + "]");
		
		Path sp = Paths.get("C:/java_programning/IO/../NIO2//DemoFile.txt");
		System.out.println( sp.normalize() + " " + sp.subpath(0, 3));
	}
	
	public static void teste1() {
		
	}
	

}
