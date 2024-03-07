package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		LocalDateTime d05 = LocalDateTime.parse("2024-03-06T18:13:05");
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		Instant d06 = Instant.parse("2024-03-06T18:13:05Z");
		Instant pastWeekLocalInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekLocalInstant = d06.plus(7, ChronoUnit.DAYS);
		
		Instant d07 = Instant.parse("2024-03-06T18:13:05-03:00");
		
		LocalDate d08 = LocalDate.parse("06/03/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("06/03/2024 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2024, 03, 06);
		LocalDateTime d11 = LocalDateTime.of(2024, 3, 6, 19, 18);
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t3 = Duration.between(pastWeekLocalInstant, d03);
		Duration t4 = Duration.between(d03, pastWeekLocalInstant);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mes = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		System.out.println("d04 past week = " + pastWeekLocalDate);
		System.out.println("d04 next week = " + nextWeekLocalDate);
		System.out.println("d05 = " + d05);
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minuto = " + d05.getMinute());
		System.out.println("d05 past week = " + pastWeekLocalDateTime);
		System.out.println("d05 next week = " + nextWeekLocalDateTime);
		System.out.println("d06 = " + d06); 
		System.out.println("d06 = " + fmt3.format(d06)); 
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println("d06 past week = " + pastWeekLocalInstant);
		System.out.println("d06 next week = " + nextWeekLocalInstant);
		System.out.println("r1 = " + r1); 
		System.out.println("r2 = " + r2); 
		System.out.println("r3 = " + r3); 
		System.out.println("r4 = " + r4); 
		System.out.println("d07 = " + d07); 
		System.out.println("d08 = " + d08); 
		System.out.println("d09 = " + d09); 
		System.out.println("d10 = " + d10); 
		System.out.println("d11 = " + d11); 
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}
}