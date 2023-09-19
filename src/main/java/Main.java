//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        Ticket t1 = new Ticket(
//                "Madrid",
//                "Barcelona",
//                1000,
//                12,
//                14
//        );
//        Ticket t2 = new Ticket(
//                "London",
//                "Bolton",
//                795,
//                12,
//                15
//        );
//                                                                                                Ticket t3 = new Ticket(
//                                                                                                                                                                                          "Paris",
//                "Kiev",
//                                                                                                                                                                                                                        850,
//                10,
//                15
//                                                                                                                );
//
//        TicketTimeComparator timeComparator = new TicketTimeComparator();
//
//        System.out.println(t1.compareTo(t2));
//        System.out.println(t2.compareTo(t1));
//        System.out.println(t3.compareTo(t2));
//
//                                                    Ticket[] tickets = {t1, t2, t3};
//            Arrays.sort(result);
//        Arrays.sort(tickets, timeComparator);
//    }
//}