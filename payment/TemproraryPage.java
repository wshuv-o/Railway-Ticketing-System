package payment;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

import home.Home;
import seattype.ShovanSeat;
import trainsearch.Train;
import userprofile.Person;


public class TemproraryPage implements ActionListener {
  Person person;
  Train train;
  String date;
  String seatType;
  String from;
  String to;
  int ns;
  static int indexOfDate;
  static int indexOfSeatType;
  int []ArrayOfSelectedSeats=new int[4];
  static int [][][] allButtonList= new int[5][4][50];
  String c="";


  JFrame frame;
  JButton button= new JButton("Save");
  JButton buttonBack;

  public TemproraryPage(Person person, Train train, String date, String seatType, String from, String to, int ns, int[] arrayOfSelectedSeats, int[][][] allButtonList2, int indexOfDate, int indexOfSeatType){
    this.person=person;
    this.train=train;
    this.date=date;
    this.seatType=seatType;
    this.from=from;
    this.to=to;
    this.ns=ns;
    TemproraryPage.indexOfDate=indexOfDate;
    TemproraryPage.indexOfSeatType=indexOfSeatType;
    ArrayOfSelectedSeats=arrayOfSelectedSeats;
    allButtonList=allButtonList2;


    button.setBounds(200, 300, 300, 70);
    button.setFocusable(false);
    button.setBackground(Color.GRAY);
    button.setFont(new Font("Times new roman", Font.BOLD, 35));
    button.addActionListener(this);

    buttonBack = new JButton("Go to Home");
    buttonBack.setBounds(200, 400, 300, 70);
    buttonBack.setFocusable(false);
    buttonBack.setBackground(Color.GRAY);
    buttonBack.setFont(new Font("Times new roman", Font.BOLD, 35));
    buttonBack.addActionListener(this);
    

    JLabel Label= new JLabel("Click to save your ticket.");
    Label.setFont(new Font("Times new roman", Font.BOLD, 45));
    Label.setBounds(200, 150, 500, 200);

    JPanel lowerPanel = new JPanel();
    lowerPanel.setBackground(Color.GREEN);
    lowerPanel.setBounds(400, 200, 1160, 500);
    lowerPanel.add(Label);
    lowerPanel.add(button);
    lowerPanel.add(buttonBack);
    lowerPanel.setLayout(null);

  
      
   frame= new JFrame();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLayout(null);
   frame.setSize(1960,1040);
   frame.add(lowerPanel);
   frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    BufferedReader reader=null;
		String line="";

    String info="Booking Details : "+"\n"+"From "+from+" - "+"To " +to +"\n"+"Passenger Details :\n" +"Name : "+person.getFirstName()+" "+person.getLastName()+"\n"+"Mobile Number : "+person.getMobileNumber()+"\n"+"Email : " +person.getEmail()+"\n"+"\n\n\n"+"Train info : "+"\n"+"Name : "+train.getTrainName()+train.getTrainId()+"\n"+"Arrival Time : "+train.getArrivalAtFinalStation()+"\n"+ "Departure Time : "+train.getDepartureFromFirstStation()+"\n"+"\n\n\n"+"Journey Date : "+date+"\n"+"Total Seat : "+ns+"\n"+"Seat Type : "+seatType+"\n";
    String filename=person.getFirstName()+date+".txt";
    String filenameForCSV=person.getFirstName()+".csv";
    String fileUser=person.getNidNumber();

    String fromTo= from+" - "+to+","+train.getTrainName()+train.getTrainId()+","+date+"\n";

    if(e.getSource()==button){

      int j=0;
      for (int i=0; i<50;i++) {
        if(allButtonList[indexOfDate][indexOfSeatType][i]==0){
          if(ArrayOfSelectedSeats[j]!=0){
            allButtonList[indexOfDate][indexOfSeatType][i]=ArrayOfSelectedSeats[j];
            j++;
            
          }
        }
      }

      String directory="C:\\Users\\Shuvo\\OneDrive\\Documents\\Eticketing - Copy\\GeneratedTicket\\"+fileUser;
      File file = new File(directory);
      boolean bool = file.mkdir();
      if(bool){
        System.out.println("succsesssssss");
      }

      try {
          File myObj = new File("GeneratedTicket/"+fileUser+"/"+filename);
          if (myObj.createNewFile()) {} else {}
      }catch (IOException eio) {eio.printStackTrace();}



      try{
          FileWriter myWriter = new FileWriter("GeneratedTicket/"+fileUser+"/"+filename);
          myWriter.write(info);
          myWriter.close();
      }catch (IOException eio) {eio.printStackTrace();}


      try {
      File csvFile = new File("GeneratedTicket/"+fileUser+"/"+filenameForCSV);
        if(csvFile.createNewFile()){}
      } catch (IOException e2) {

        e2.printStackTrace();
      }

        

		
		try{
		   reader = new BufferedReader(new FileReader("GeneratedTicket/"+fileUser+"/"+filenameForCSV));
		   while((line= reader.readLine())!=null){
			  String []row= line.split(",");
			  for(int i=0; i<3;i++){
				 if(i==2)
				 c= c+row[i]+"";
				 else
				 c= c+row[i]+",";
			  }
			  c=c+"\n";
		   }
		}
		catch(Exception ee){ee.printStackTrace();}
		finally{
            try{ reader.close();
                 }catch (IOException ee) { ee.printStackTrace();
            }
		}


        try {
          FileWriter csvFileWriter= new FileWriter("GeneratedTicket/"+fileUser+"/"+filenameForCSV);
          csvFileWriter.write(fromTo);
          csvFileWriter.append(c);
          csvFileWriter.close();
        }catch (IOException e1) {e1.printStackTrace();}
        finally{     button.setEnabled(false);
        }
    }
      if(e.getSource()==buttonBack){
        frame.setVisible(false);
        new Home(person, allButtonList);
      }
}

}
