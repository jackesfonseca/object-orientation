package aplication;

import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.Post;
import entities.Comment;

public class Program 
{
	public static void main(String[] args) throws ParseException
	{
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post post = new Post(12, sdf.parse("11/11/2000 13:29:00"), "Beach travel");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		post.addComments(c1);
		post.addComments(c2);
		
		System.out.println(post);
		
	}
}
