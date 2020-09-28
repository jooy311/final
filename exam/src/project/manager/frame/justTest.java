package project.manager.frame;

import java.text.SimpleDateFormat;
import java.util.Date;

public class justTest {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat pattern = new SimpleDateFormat(("yyyy-MM-dd"));
		System.out.println(	pattern.format(now));
	}
}
