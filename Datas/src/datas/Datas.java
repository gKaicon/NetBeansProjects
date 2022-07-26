package datas;

import java.time.*;

/**
 * @author KAICON
 */
public class Datas {

    public static void main(String[] args) {

// 1 - Crie objetos contendo datas, horas e datas/horas com as informações do momento da criação dos objetos.
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("1-"+localDate+"\n"+localTime+"\n"+localDateTime);

// 2 - Crie objetos contendo datas, horas e datas/horas com informações específicas de data e hora.
        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 21);
        LocalTime time1 = LocalTime.of(11, 23);
        LocalDateTime dateTime = LocalDateTime.of(2004, Month.JANUARY, 21, 8, 43, 24);
        System.out.println("2-"+date1+"\n"+time1+"\n"+dateTime);

//3 - Adicione a uma determinada data três semanas.
        LocalDate date2 = LocalDate.of(2015, Month.JANUARY, 20);
        date2 = date2.plusWeeks(3);
        System.out.println("3-"+date2);
//4 - Adicione a uma determinada data cinco meses.
        LocalDate date3 = LocalDate.of(2010, Month.JUNE, 15);
        System.out.println(date3);
        date3 = date3.plusMonths(5);
        System.out.println("4-"+date3);
        
// 5 - Adicione a uma determinada data cento e quarenta anos cinco meses e quatorze dias.
        LocalDate date4 = LocalDate.of(1879, Month.JULY, 17);
        System.out.println("5-"+date4);
        date4 = date4.plusYears(140);
        date4 = date4.plusMonths(5);
        date4 = date4.plusDays(14);
        System.out.println("5-"+date4);

//6 - Adicione a uma determinada hora quarenta e cinco minutos
        LocalTime localTime2 = LocalTime.of(9, 16, 21);
        localTime2 = localTime2.plusHours(1);
        localTime2 = localTime2.plusMinutes(45);
        System.out.println("6-"+localTime2);
//7 - Adicione a uma determinada hora trinta e sete horas
        localTime2 = localTime2.plusHours(37);
        System.out.println("7-"+localTime2);
//8 - Adicione a uma determinada hora cinquenta e quatro horas dez minutos e cinquenta e um segundos.
        localTime2 = localTime2.plusHours(54);
        localTime2 = localTime2.plusMinutes(10);
        localTime2 = localTime2.plusSeconds(51);
        System.out.println("8-"+localTime2);

//9 - Quantos dias há entre as datas 01/01/1980 e 12/12/2021?
//10 - Quantos anos há entre as datas 01/01/1980 e 12/12/2021?
//11 - Quantos segundos há entre as datas 01/01/1980 e 12/12/2021?
        LocalDate from = LocalDate.of(1980, Month.JANUARY, 1);
        LocalDate to = LocalDate.of(2021, 12, 21);
        Period period = Period.between(from, to);

        System.out.print("9-"+period.getYears()+" yearsn\n" );
        System.out.print("10-"+period.getMonths()+" months\n");
        System.out.print("11-"+period.getDays() +" days\n");

// 9 - R: 15.321 dias
//10 -R: 503 meses
//11 - R: 42 anos
//12 - Quanto anos, meses e dias já se passaram desde que nasceram?
        
        LocalDate dateI = LocalDate.of(2004, Month.JANUARY, 21);
        LocalDate dateII = LocalDate.now();
       
        Period pp;
        pp = Period.between(dateII, dateI);
        System.out.println("12-");
        
        System.out.print(period.getYears() + "years");
        System.out.print(period.getMonths() + "months" );
        System.out.print(period.getDays() + "days");
//12 - R: 17 anos, 205 meses, 6240 dias
    }
}
