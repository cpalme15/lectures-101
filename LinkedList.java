import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Format;

public class LinkedList
{


	private class Node
	{
		private int data;
		private Node link;
		public Node(int stuff,Node n)
		{
			data=stuff;
			link=n;
			/*
			 * head= new Node('A',head) puts it at the beginning
			 * as new head.
			 * temp.link=new node('E', null)put it at the end
			 */
		}


	}	
	private Node head;

	public LinkedList()
	{
		head =null;
	}
	public void addFirst(int c)
	{
		head=new Node(c,head);

	}
	public void addLast(int c)
	{
		
		if(head==null)
		{
			addFirst(c);
		}
		else
		{
			Node temp=head;
			while(temp.link!=null)
				temp=temp.link;
			
			temp.link=new Node(c,null);
		}
	}
	public void Remove(int x)
		{
			Node temp=head;
			Node prev=head;
			Node temp2=null;
			if(head.getData()==x)
			{
				head=temp.getNext();
				temp.getNext()=null;
				return;
			}
			while(temp!=null && temp.getData()!= x)
			{
				prev=temp;
				temp=temp.getNext();
			}
			if(temp==null)
				return(x+" not found");
		
					temps2=temp.getNext();
					prev=temps2;
			temp.getNext()=null;
			
		}
	public void Display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" --> ");
			temp=temp.link;

		}
	}
	public  String find(int x)
	{
		int counter =0;
		Node temp=head;
		
		while(temp!=null)
		{
			counter++;
			if(temp.data==x)
			{
				return "Found at node position "+counter;
			}
				temp=temp.link;
		}
		return "Not Found";
		
	}
	public  String average()
	{
		Node temp=head;
		String sum="";
		double runtotal=0.0;
		int counter=0;
		if(head==null)
		{
			return "Empty";
		}
		while(temp!=null)
		{	counter++;
			runtotal+=temp.data;
			temp=temp.link;
			
		}
		runtotal=runtotal/counter;
		
	
		sum=String.format("%.2f", runtotal);
		return "avg: "+sum;
		
	}
	public String insertbe(int m, int n)
	{
		
		   if(head.getData()==m)
		   {
			   head=new Node(n,head);
			   return"insert before "+ m+" "+n +" done";		   }

		   Node prev = null;
		   Node cur = head;

		   while(cur != null && !(cur.getData()==m))
		   {
		      prev = cur;
		      cur = cur.getNext();
		   }
		   if(cur != null){
			   prev = new Node(n, cur);
			   return"insert before "+ m+" "+n +" done";
		   }
		return m+" not Found";
		}
}