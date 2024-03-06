package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-03-06");
		LocalDateTime d05 = LocalDateTime.parse("2024-03-06T18:13:05");
		Instant d06 = Instant.parse("2024-03-06T18:13:05Z");
		
		Instant d07 = Instant.parse("2024-03-06T18:13:05-03:00");
		
		LocalDate d08 = LocalDate.parse("06/03/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("06/03/2024 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2024, 03, 06);
		LocalDateTime d11 = LocalDateTime.of(2024, 3, 6, 19, 18);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d05 = " + d05);
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		System.out.println("d06 = " + d06); 
		System.out.println("d06 = " + fmt3.format(d06)); 
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println("d07 = " + d07); 
		System.out.println("d08 = " + d08); 
		System.out.println("d09 = " + d09); 
		System.out.println("d10 = " + d10); 
		System.out.println("d11 = " + d11); 
	}
}