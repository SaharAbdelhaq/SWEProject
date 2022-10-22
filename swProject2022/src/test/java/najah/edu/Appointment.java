package najah.edu;

import java.util.ArrayList;

public class Appointment{
	private String Date;
	private String Time;
	private String Aid;
	//private String isbn;
	private boolean Booked;
	private User inUser;
	
	private  ArrayList <Appointment> B1= new ArrayList <Appointment>();

	
	public Appointment(String Date, String Time, String Aid, boolean Booked) {
	
		this.Date = Date;
		this.Time = Time;
		this.Aid = Aid;
		this.Booked = Booked;
	}
	
	public String getDate() {
		return Date;
	}
	public void setDate(String Date) {
		this.Date = Date;
	}
	
	public String getTime() {
		return Time;
	}
	public void setTime(String Time) {
		this.Time = Time;
	}
	
	public String getAid() {
		return Aid;
	}
	public void setSignature(String Aid) {
		this.Aid = Aid;
	}
	

	public boolean isBooked() {
		return Booked;
	}
	public void setBooked(boolean Booked) {
		this.Booked = Booked;
	}
	
	public void AddAppointment(ArrayList<User> u1,ArrayList<Appointment> b1,String string, String string2, String string3,String string4, String string5) {
		
		boolean check = false;
		
		for(int i=0;i<u1.size();i++) {
			if(string.equals(u1.get(i).getUsername())&&u1.get(i).isAnAAdmin()) {
				inUser=u1.get(i);
				if(inUser.isStatus()) {
					 check=checkAid(string3);
					if(check) {
						b1.add(new Appointment(string,string2,string3,false));
						break;
					}
										
					
				}
			}			
		}
		
	}
	
	
	public boolean checkAid(String Aid) {
		int sum=0;
		int t;
		int result;
		String [] sp=Aid.split("");
		if(Aid.length()==10) {
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
	
	public void SearchDate(ArrayList<Appointment> b1,String g) {
		for(int i=0;i<b1.size();i++) {

    	 if(b1.get(i).getDate().contains(g)) {
    	
    		 break;
    		
    	 }

     }
}
	
//public void SearchAuthor(ArrayList<Appointment> b1,String g) {
//	Appointment b2=new Appointment(null,g,null,null,true);
//ArrayList<Appointment> L1=new ArrayList<Appointment>();
//
//		for(int i=0;i<b1.size();i++) {
//
//    	 if(b1.get(i).getAuthor().contains(g)) {
//
//    		L1.add(b2);
//
//    			if(b2.CheckIfThereisMoreThanABook(L1.get(0).getTitle())) {
//    				b2.CheckIfThereisMoreThanABook(L1.get(0).getTitle());
//    				break;
//    			}
//
//    	
//    		 break;
//    		
//    		 
//    	 }
//
//
//     }
//}
	
public void SearchAid(ArrayList<Appointment> b1,String g) {
	for(int i=0;i<b1.size();i++) {
	    	 if(b1.get(i).getAid().contains(g)) {    	
	    		 break;    		
	    	 }
	     }
}

public void SearchForAppointmentWhileIn(ArrayList<Appointment> b1,ArrayList<User> U1,String g1,String g2,String g3) {

for(int i=0;i<U1.size();i++) {
if(g1.equals(U1.get(i).getUsername())&&g2.equals(U1.get(i).getPassword())&&b1.get(1).getDate().contains(g3)) {
break;
}
}

}

public void SearchForUnExsictAppointment(ArrayList<Appointment> b1,String g) {
Appointment E1=new Appointment(g,null,null,false);

for(int i=0;i<b1.size();i++) {
if(!(b1.get(i).getDate().contains(g)&&b1.get(i).getTime().contains(g)&&b1.get(i).getAid().contains(g))) {
if(!E1.getDate().equals(b1.get(i).getDate())) {
E1.CheckWhenThereIsNoAppointment(g);

}
break;
}
}
}


public void searching_for_more_than_book(ArrayList<Appointment> b1,String g) {
Appointment N1=new Appointment(g,null,null,true);

ArrayList<Appointment> L1=new ArrayList<Appointment>();
for(int i=0;i<b1.size();i++) {
if(b1.get(i).getDate().contains(g)){
L1.add(N1);

if(N1.CheckIfThereisMoreThanAppointment(L1.get(0).getDate())) {
	N1.CheckIfThereisMoreThanAppointment(L1.get(0).getDate());
}
}
}

}	


public boolean CheckIfThereisMoreThanAppointment(String string) {
if(string!=null) {
return true;

}
return false;
}

public boolean CheckWhenThereIsNoAppointment(String string) {
if(string!=null) {
return false;

}
return true;	

}
	
}