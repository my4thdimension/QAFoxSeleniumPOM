package practice;

import java.util.Date;

public class ee {

	public static void main(String[] args) {
		System.out.println("om ganesh");
		Date dt = new Date();
		System.out.println(dt.toString().replace(" ", "_").replace(":", "_"));
		System.out.println(System.getProperty("user.dir"));
	}

}
