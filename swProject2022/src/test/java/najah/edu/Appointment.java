package najah.edu;

import java.util.ArrayList;

public class Appointment{
	private String title;
	private String author;
	private String signature;
	private String isbn;
	private boolean borrowed;
	private User inUser;
	
	private  ArrayList <Appointment> B1= new ArrayList <Appointment>();

	
	public Appointment(String title, String author, String signature, String isbn, boolean borrowed) {
	
		this.title = title;
		this.author = author;
		this.signature = signature;
		this.isbn = isbn;
		this.borrowed = borrowed;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isBorrowed() {
		return borrowed;
	}
	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}
	
	public void Addbook(ArrayList<User> u1,ArrayList<Appointment> b1,String string, String string2, String string3, String string4, String string5, String string6) {
		
		boolean check = false;
		for(int i=0;i<u1.size();i++) {
			if(string.equals(u1.get(i).getUsername())&&u1.get(i).isAnAAdmin()) {
				inUser=u1.get(i);
				if(inUser.isStatus()) {
					 check=checkisbn(string5);
					if(check) {
						b1.add(new Appointment(string2,string3,string4,string5,false));
						break;
					}
						
				}
				}			
		}
		
	}
	public boolean checkisbn(String ISBN) {
		int sum=0;
		int t;
		int result;
		String [] sp=ISBN.split("");
		if(ISBN.length()==10) {
		  int m=10;
		for (int i=0;i<sp.length;i++) {
		  t=Integer.parseInt(sp[i]);
		  result= t*m;
		  m--;
		  sum+=result;
		}
		if(sum%11==0) {
			return true;
		}
		else {
			return false;
		}
		}
		else {
			return false;
		}
		
	}
	
	public void NotAdmin(ArrayList<User> u1,String string) {
		
		 
		for(int i=0;i<u1.size();i++) {
			if(string.equals(u1.get(i).getUsername())) {
				inUser=u1.get(i);
				if(inUser.isAnAAdmin()) {
					if(!inUser.isStatus()) {
						break;
					}					
				}
			}		 				
		}			

		
	}
	public void SearchTitle(ArrayList<Appointment> b1,String g) {
		for(int i=0;i<b1.size();i++) {

    	 if(b1.get(i).getTitle().contains(g)) {


    	
    		 break;
    		
    	 }

     }
}
public void SearchAuthor(ArrayList<Appointment> b1,String g) {
	Appointment b2=new Appointment(null,g,null,null,true);
ArrayList<Appointment> L1=new ArrayList<Appointment>();

		for(int i=0;i<b1.size();i++) {

    	 if(b1.get(i).getAuthor().contains(g)) {

    		L1.add(b2);

    			if(b2.CheckIfThereisMoreThanABook(L1.get(0).getTitle())) {
    				b2.CheckIfThereisMoreThanABook(L1.get(0).getTitle());
    				break;
    			}

    	
    		 break;
    		
    		 
    	 }


     }
}
public void SearchIsbn(ArrayList<Appointment> b1,String g) {
	for(int i=0;i<b1.size();i++) {

	    	 if(b1.get(i).getIsbn().contains(g)) {


	    	
	    		 break;
	    		
	    	 }

	     }
}

public void SearchForBookWhileIn(ArrayList<Appointment> b1,ArrayList<User> U1,String g1,String g2,String g3) {


for(int i=0;i<U1.size();i++) {
if(g1.equals(U1.get(i).getUsername())&&g2.equals(U1.get(i).getPassword())&&b1.get(1).getTitle().contains(g3)) {
break;
}
}

}

public void SearchForUnExsictBook(ArrayList<Appointment> b1,String g) {
Appointment E1=new Appointment(g,null,null,null,false);

for(int i=0;i<b1.size();i++) {
if(!(b1.get(i).getTitle().contains(g)&&b1.get(i).getAuthor().contains(g)&&b1.get(i).getIsbn().contains(g))) {
if(!E1.getTitle().equals(b1.get(i).getTitle())) {
E1.CheckWhenThereIsNoBook(g);

}

break;
}
}




}
public void searching_for_more_than_book(ArrayList<Appointment> b1,String g) {
Appointment N1=new Appointment(g,null,null,null,true);

ArrayList<Appointment> L1=new ArrayList<Appointment>();
for(int i=0;i<b1.size();i++) {
if(b1.get(i).getTitle().contains(g)){
L1.add(N1);

if(N1.CheckIfThereisMoreThanABook(L1.get(0).getTitle())) {
	N1.CheckIfThereisMoreThanABook(L1.get(0).getTitle());
}
}
}

}	

public boolean CheckIfThereisAbook(String string) {
if(string!=null) {
   return true;

}
return false;
}
public boolean CheckIfThereisMoreThanABook(String string) {
if(string!=null) {
return true;

}
return false;
}
public boolean CheckWhenThereIsNoBook(String string) {
if(string!=null) {
return false;

}
return true;	

}
	
}