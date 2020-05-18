package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post
{
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Integer like;
	private Date date;
	private String description;
	
	private List <Comment> comments = new ArrayList<>();
	
	public Post() {
		
	}
	public Post(int like, Date date, String description)
	{
		this.like = like;
		this.date = date;
		this.description = description;
	}
	
	public void setLike(int like)
	{
		this.like = like;
	}
	
	public Integer getLike()
	{
		return like;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDate(Date date)
	{
		this.date = date;
	}
	
	public Date getDate()
	{
		return date;
	}
	
	public List<Comment> getComments()
	{
		return comments;
	}
	
	public void addComments(Comment comments)
	{
		this.comments.add(comments);
	}
	
	public void removeComments(Comment comments)
	{
		this.comments.add(comments);
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Description: " + description);
		sb.append(like + " - Likes\n");
		sb.append("Date: " + sdf.format(date));
		
		for(Comment c : comments)
		{
			sb.append(c.getComment() + "\n");
		}
		
		//converter o StringBuilder para toString
		return sb.toString();
	}	
}
