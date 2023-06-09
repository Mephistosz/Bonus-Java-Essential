package enumeracoes_composicao.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import enumeracoes_composicao.entities.Comment;
import enumeracoes_composicao.entities.Post;

public class ProgramPost {
  public static void main(String[] args) {

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    Comment c1 = new Comment("Have a nice trip");
    Comment c2 = new Comment("Wow that's awesome!");

    Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", fmt),
        "Traveling to New Zealand",
        "I'm going to visit this wonderful country!",
        12);

    p1.addComments(c1);
    p1.addComments(c2);

    System.out.println(p1);

    Comment c3 = new Comment("Have a nice trip");
    Comment c4 = new Comment("Wow that's awesome!");

    Post p2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19", fmt),
        "Good night guys",
        "See you tomorrow",
        5);

    p2.addComments(c3);
    p2.addComments(c4);

    System.out.println(p2);
  }
}