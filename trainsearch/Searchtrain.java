package trainsearch;
import userprofile.*;
import seattype.*;
import trainsearch.*;

import java.awt.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import Home.*;

public class Searchtrain implements ActionListener{
  static Train[] trainFromButton;
  static Person person;
  //static Train train;
  Calendar calendar = Calendar.getInstance();
  int day= calendar.get(Calendar.DATE);
  int month= calendar.get(Calendar.MONTH)+1;
  int year= calendar.get(Calendar.YEAR);

  JButton buttonConfirm= new JButton("Search Train");
  Font myFont = new Font("Times New Roman", Font.PLAIN, 20);
  static String allStations[]= new String[]{"Abdulpur","Akhaura","Alamdanga","Arani","Ashuganj","Azampur","BBSetu_E","BBSetu_W","Bhairab_Bazar","Bhanugach","Bheramara","Biman_Bandar","Boral_Bridge","Brahmanbaria","Chatmohar","Chilahati","Chittagong","Chuadanga","Cumilla","Darshana_Halt","Dhaka","Domar","Feni","Fulbari","Gafargaon","Harashpur","Hasanpur","Hili","Ishwardi","Ishwardi Bypass","Jamalpur_Town","Jessore","JoydebPur","Joypurhat","Khulna","Kotchandpur","Kulaura","Kumira","Laksam","Maijgaon","Methikanda","Montola","Mukundapur","Muladhuli","Mymensingh","Nangolkot","Narsingdi","Natore","Nayapara","Nilphamari","Noapara","Parbatipur","Poradaha","Quasba","Rajshahi","Saidpur","Santahar","Sarishabari","Sh M Monsur Ali","Shahaji_Bazar","Shashidal","Sreemangal","Sreepur","Sylhet","Tangail","Tarakandi","FALSE"};
  String [] date= new String[]{day+"-"+month+"-"+year, day+1+"-"+month+"-"+year, day+2+"-"+month+"-"+year, day+3+"-"+month+"-"+year, day+4+"-"+month+"-"+year, };
  String seatType[]= new String[]{"SHOVAN", "S_CHAIR", "AC_BERTH", "SNIGDHA"};

  JComboBox fromComboField, toComboField, dateComboField, seatTypeComboBox;
  
  static String route1Forward[]=new String[]{"Chilahati", "Domar", "Nilphamari", "Saidpur", "Parbatipur","Fulbari", "Hili" ,  "Joypurhat", "Santahar", "Natore", "Abdulpur","Ishwardi Bypass", "Ishwardi", "Bheramara", "Poradaha", "Alamdanga", "Chuadanga", "Darshana_Halt","Kotchandpur" ,"Jessore","Noapara","Khulna"};
  static String route1Reverse[]=new String[]{"Khulna","Noapara","Jessore","Kotchandpur","Darshana_Halt","Chuadanga","Alamdanga","Poradaha","Bheramara","Ishwardi","Ishwardi Bypass","Abdulpur","Natore","Santahar","Joypurhat","Hili","Fulbari","Parbatipur","Saidpur","Nilphamari","Domar","Chilahati"};
  static String route2Forward[]=new String[]{"Dhaka", "JoydebPur", "Tangail", "BBSetu_E", "BBSetu_W", "Muladhuli", "Abdulpur", "Natore", "Santahar", "Joypurhat", "Hili", "Fulbari", "Parbatipur", "Saidpur", "Nilphamari", "Domar", "Chilahati"};
  static String route2Reverse[]=new String[]{"Chilahati","Domar","Nilphamari","Saidpur","Parbatipur","Fulbari","Hili","Joypurhat","Santahar","Natore","Abdulpur","Muladhuli","BBSetu_W","BBSetu_E","Tangail","JoydebPur","Dhaka"};
  static String route3Forward[]=new String[]{"Rajshahi","Arani","Abdulpur","Chatmohar","Boral_Bridge","Sh M Monsur Ali","BBSetu_E","Joydebpur","Dhaka"};
  static String route3Reverse[]=new String[]{"Dhaka","Joydebpur","BBSetu_E","Sh M Monsur Ali","Boral_Bridge","Chatmohar","Abdulpur","Arani","Rajshahi"};
  static String route4Forward[]=new String[]{"Sylhet","Maijgaon","Kulaura","Bhanugach","Sreemangal","Shahaji_Bazar","Nayapara","Montola","Harashpur","Mukundapur","Azampur","Brahmanbaria","Ashuganj","Biman_Bandar","Dhaka"};
  static String route4Reverse[]=new String[]{"Dhaka","Biman_Bandar","Ashuganj","Brahmanbaria","Azampur","Mukundapur","Harashpur","Montola","Nayapara","Shahaji_Bazar","Sreemangal","Bhanugach","Kulaura","Maijgaon","Sylhet"};
  static String route5Forward[]=new String[]{"Chittagong","Kumira","Feni","Hasanpur","Nangolkot","Laksam","Cumilla","Shashidal","Quasba","Akhaura","Brahmanbaria","Bhairab_Bazar","Methikanda","Narsingdi","Dhaka" };
  static String route5Reverse[]=new String[]{"Dhaka","Narsingdi","Methikanda","Bhairab_Bazar","Brahmanbaria","Akhaura","Quasba","Shashidal","Cumilla","Laksam","Nangolkot","Hasanpur","Feni","Kumira","Chittagong"};
  static String route6Forward[]=new String[]{"Tarakandi","Sarishabari","Jamalpur_Town","Mymensingh","Gafargaon","Sreepur","Dhaka"};
  static String route6Reverse[]=new String[]{"Dhaka","Sreepur","Gafargaon ","Mymensingh","Jamalpur_Town","Sarishabari","Tarakandi"};

  static Train availableTrainForRoute1Forward[]= new Train[]{new Train("Rupsha Express", "(728)",	"8:30",	"18:30"), new Train("Simanta Express", "(748)", "18:45",	"4:10")};
  static Train availableTrainForRoute1Reverse[]= new Train[]{new Train("Rupsha Express", "(727)",	"7:10",	"16:40"), new Train("Simanta Express", "(747)", "21:15",	"6:20")};
  static Train availableTrainForRoute2Forward[]= new Train[]{new Train("Nilsagar express", "(765)",	"06:40",	"16:00")};
  static Train availableTrainForRoute2Reverse[]= new Train[]{new Train("Nilsagar express", "(766)",	"20:00",	"05:30")};
  static Train availableTrainForRoute3Forward[]= new Train[]{new Train("BANALATA EXPRESS", "(792)", "07:00", "11:30"), new Train("SILKCITY EXPRESS", "(754)", "07:40", "13:30"),new Train("PADMA EXPRESS", "(760)", "16:00", "21:40")};
  static Train availableTrainForRoute3Reverse[]= new Train[]{new Train("DHUMKETU", "(769)", "06:00", "11:40"),new Train("BANALATA EXPRESS", "(791)", "13:30", "18:15"), new Train("SILKCITY EXPRESS", "(753)", "14:45", "20:30"),new Train("PADMA EXPRESS", "(759)", "23:00", "04:40")};
  static Train availableTrainForRoute4Forward[]= new Train[]{new Train("KALNI EXPRESS", "(774)", "06:15", "13:00"), new Train("JAYENTIKA EXPRESS", "(718)"	,"11.15" , "18.25"),new Train("PARABAT EXPRESS", "(710)", "3.45",  "10.45"),new Train("UPABAN EXPRESS", "(740)"	,"23.30",  "6.45")};
  static Train availableTrainForRoute4Reverse[]= new Train[]{new Train("PARABAT EXPRESS" ,"(709)", "06:20"   ,"13.00"),new Train("JAYENTIKA EXPRESS", "(717)", "11:15" ,"19.00"),new Train("KALNI EXPRESS" ,"(773)", "03:00","21.30")};
  static Train availableTrainForRoute5Forward[]= new Train[]{new Train("SUBORNO EXPRESS" ,"(701)", "7:00 ", "12.20"),new Train("CHATTALA EXPRESS ", "(801)", "8.30","15:50"),new Train("MOHANAGAR EXPRESS", "(721)", "1230","19:10"),new Train("MAHANAGAR GODHULI", "(703)", "15:0","21.25")};
  static Train availableTrainForRoute5Reverse[]= new Train[]{new Train("MAHANAGAR PROVATI", "(704)"	,"07:45 ","14:00"), new Train("CHATTALA EXPRESS", "(802)"	,"13:00 "," 08:30 "), new Train("SUBORNO EXPRESS","(702)"	,"16:30 "," 21:50 "),new Train("MOHANAGAR EXPRESS",  "(722)"	,"21:20 ","04:50")};
  static Train availableTrainForRoute6Forward[]= new Train[]{new Train("JAMUNA EXPRESS" ,"(746)"	,"03:15",  "07:45" ), new Train("BHRAMMAPUTRA EXPRESS" ,"(744)"	,"07:38"  ,"12:40 "), new Train("TISTA EXPRESS" ,"(708)"    ,"15:57" , "20:25"), new Train("JAMALPUR EXPRESS" ,"(800)"	,"17:45","00:45" )};
  static Train availableTrainForRoute6Reverse[]= new Train[]{new Train("TISTA EXPRESS ","(707)",	"07.30"," 11.29") ,new Train("JAMALPUR EXPRESS ","(799)",	"10.30"," 16.30 "), new Train("AGHNIBINA EXPRESS ","(735)",	"11.00 "," 15.00 "),new Train("JAMUNA EXPRESS ","(745)",	"16.45 "," 21.20 ")};
  
  
  JButton backButton, BuyTicket;
  static JFrame frame; 
  
  static int indexOfDate=0;
  static int indexOfSeatType=0;
  protected static JButton []trainButton= new JButton[4];
  static int [][][] allButtonList= new int[5][4][50];


 public Searchtrain(Person p, int[][][] allButtonList){
  person=p;
  Searchtrain.allButtonList=allButtonList;
  
  frame = new JFrame();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(1960, 1000);
  frame.setMinimumSize(new Dimension(600,600));
  frame.setLayout(new BorderLayout());

  for(int i=0; i<trainButton.length; i++){
    trainButton[i]=new JButton("No More Train");
    trainButton[i].setFocusable(false);
    trainButton[i].setBackground(Color.white);
    trainButton[i].setFont(myFont);
    trainButton[i].addActionListener(this);
  }

  JLabel search= new JLabel("Search Train");
  search.setFont(new Font("Times new roman", Font.BOLD, 70));
  search.setBounds(760, 20, 400,80);

  backButton = new JButton();
  backButton.setIcon(new ImageIcon("images/Back.png"));
  backButton.setBounds(0,0, 200, 100);
  backButton.setFocusable(false);
  backButton.setBackground(new Color(98, 174, 239));
  backButton.setBorder(BorderFactory.createEmptyBorder());
  backButton.addActionListener(this);

  buttonConfirm.setBounds(75,656, 250, 40);
  buttonConfirm.setBackground(new Color(255,255,255));
  buttonConfirm.setFocusable(false);
  buttonConfirm.setBorder(BorderFactory.createEtchedBorder());
  buttonConfirm.setFont(myFont);
  buttonConfirm.addActionListener(this);

  JLabel fromLabel=new JLabel();
  fromLabel.setText("From");
  fromLabel.setBounds(75,311,200,30);
  fromLabel.setFont(myFont);

  fromComboField = new JComboBox<>(allStations);
  fromComboField.setLayout(null);
  fromComboField.setBounds(75,341, 250, 30);
  fromComboField.setFont(myFont);
  fromComboField.setOpaque(false);
  fromComboField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));

  JLabel toLabel =new JLabel();
  toLabel.setText("To");
  toLabel.setBounds( 75,386,100,30);
  toLabel.setFont(myFont);

  toComboField = new JComboBox<>(allStations);
  toComboField.setLayout(null);
  toComboField.setBounds(75,416, 250, 30);
  toComboField.setFont(myFont);
  toComboField.setOpaque(false);
  toComboField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));


  JLabel dateLabel=new JLabel();
  dateLabel.setText("Select Date");
  dateLabel.setBounds(75,466,200,30);
  dateLabel.setFont(myFont);

  dateComboField = new JComboBox<>(date);
  dateComboField.setLayout(null);
  dateComboField.setBounds(75,496, 250, 30);
  dateComboField.setFont(myFont);
  dateComboField.setOpaque(false);
  dateComboField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));

  JLabel seatTypeLabel =new JLabel();
  seatTypeLabel.setText("Select Seat Type");
  seatTypeLabel.setBounds( 75,546,200,30);
  seatTypeLabel.setFont(myFont);

  seatTypeComboBox = new JComboBox<>(seatType);
  seatTypeComboBox.setLayout(null);
  seatTypeComboBox.setBounds(75,576, 250, 30);
  seatTypeComboBox.setFont(myFont);
  seatTypeComboBox.setOpaque(false);
  seatTypeComboBox.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));

  JPanel panel1= new JPanel();
  panel1.setPreferredSize(new Dimension(400,800));
  panel1.setBackground(new Color(100, 167, 166 ));
  panel1.setLayout(null);
  panel1.setMinimumSize(new DimensionUIResource(600, 1000));
  panel1.add(fromLabel);
  panel1.add(fromComboField);
  panel1.add(toLabel);
  panel1.add(toComboField);
  panel1.add(dateLabel);
  panel1.add(dateComboField);
  panel1.add(seatTypeLabel);
  panel1.add(seatTypeComboBox);
  panel1.add(buttonConfirm);

  JPanel upperPanel = new JPanel();
  upperPanel.setBackground(new Color(98, 174, 239));
  upperPanel.setBounds(0,0, 1960, 100);
  upperPanel.setLayout(null);
  upperPanel.add(backButton);

  JPanel upperNextPanel = new JPanel();
  upperNextPanel.setBackground(Color.white);
  upperNextPanel.setBounds(0,100, 1960, 166);
  upperNextPanel.setLayout(null);
  upperNextPanel.add(search);

  JPanel upperNextNextPanel = new JPanel();
  upperNextNextPanel.setBackground(Color.white);
  upperNextNextPanel.setBounds(0,800, 1960, 100);
  upperNextNextPanel.setLayout(null);

  JPanel basePanel = new JPanel();
  basePanel.setBackground(Color.white);
  basePanel.setPreferredSize(new Dimension(400, 800));
  basePanel.add(panel1);
  basePanel.setLayout(new GridBagLayout());

  JPanel whitePanel = new JPanel();
  whitePanel.setBackground(Color.white);
  whitePanel.setPreferredSize(new Dimension(800, 800));
  whitePanel.setLayout(new GridLayout(3,1));

  JPanel yellowPanel = new JPanel();
  yellowPanel.setBackground(Color.white);
  yellowPanel.setBounds(0, 0, 800,200);
  yellowPanel.setLayout(new GridLayout());

  JPanel yellowPanel2 = new JPanel();
  yellowPanel2.setBackground(Color.white);
  yellowPanel2.setBounds(0, 0, 800,200);
  yellowPanel2.add(trainButton[0]);
  yellowPanel2.add(trainButton[1]);
  yellowPanel2.setLayout(new GridLayout(2,1));

  JPanel blackPanel = new JPanel();
  blackPanel.setBackground(Color.white);
  blackPanel.setPreferredSize(new Dimension(800,500));
  blackPanel.add(trainButton[2]);
  blackPanel.add(trainButton[3]);
  blackPanel.setLayout(new GridLayout(2,1));

  whitePanel.add(yellowPanel);
  whitePanel.add(yellowPanel2);
  whitePanel.add(blackPanel);
  

  JPanel lowerPanel =new JPanel();
  lowerPanel.setBackground(Color.white);
  lowerPanel.setBounds(0,100, 1960, 800);
  lowerPanel.setLayout(new FlowLayout());
  lowerPanel.add(basePanel);
  lowerPanel.add(whitePanel);

  frame.add(upperPanel);
  frame.add(upperNextPanel);
  frame.add(upperNextNextPanel);
  frame.add(lowerPanel);
  frame.setVisible(true);


 }


@Override
public void actionPerformed(ActionEvent e) {
    //Train [] train;
    String from= fromComboField.getSelectedItem().toString();
    String to= toComboField.getSelectedItem().toString();
    String date=dateComboField.getSelectedItem().toString();
    String sType= seatTypeComboBox.getSelectedItem().toString();
    indexOfDate=dateComboField.getSelectedIndex();
    indexOfSeatType=seatTypeComboBox.getSelectedIndex();

    if(e.getSource()==buttonConfirm){
        trainFromButton=SearchStation(from, to);
    }
    if(e.getSource()==trainButton[0]){
        if(trainButton[0].getText()!="No More Train"){
            DirectingToSeatpage(person, trainFromButton[0], date, sType, from, to, indexOfDate, indexOfSeatType);
        }
    }
    if(e.getSource()==trainButton[1]){
        if(trainButton[1].getText()!="No More Train"){
            DirectingToSeatpage(person, trainFromButton[1], date, sType, from, to, indexOfDate, indexOfSeatType);
        }
    }
    if(e.getSource()==trainButton[2]){
        if(trainButton[2].getText()!="No More Train"){
            DirectingToSeatpage(person, trainFromButton[2], date, sType, from, to, indexOfDate, indexOfSeatType);
        }
    }
    if(e.getSource()==trainButton[3]){
        if(trainButton[3].getText()!="No More Train"){
            DirectingToSeatpage(person, trainFromButton[3], date, sType, from, to, indexOfDate, indexOfSeatType);
        }
    }
    if(e.getSource()==backButton){
        frame.setVisible(false);
        new Home(person, allButtonList);
    }
    
}

public static void DirectingToSeatpage( Person p, Train tr, String date, String gc, String f, String t, int indexOfDate, int indexOfSeatType ){
    if(gc=="SHOVAN"){
        frame.setVisible(false);
        new ShovanSeat(p, tr, date, gc, f, t, allButtonList, indexOfDate, indexOfSeatType);
    }
    if(gc=="S_CHAIR"){
        frame.setVisible(false);
        new S_Chair(p, tr, date, gc, f, t, allButtonList, indexOfDate, indexOfSeatType);
    }
    if(gc=="AC_BERTH"){
        frame.setVisible(false);
        new AcSeat(p, tr, date, gc, f, t , allButtonList, indexOfDate, indexOfSeatType);
    }
    if(gc=="SNIGDHA"){
        frame.setVisible(false);
        new SnigdhaSeat(p, tr, date, gc, f, t , allButtonList, indexOfDate, indexOfSeatType);
    }
}


public static int SearchRoute(String [] station, String from, String to, int a){
    int flag=0;
    for(int i=0; i<station.length; i++){
        if(from.equals(station[i])){
            for(int j=i+1; j<station.length; j++){
                if(to.equals(station[j])){
                    System.out.println("Yes! possible.");
                    flag=flag+a;
                    break;
                }
                else{
                    if(j==station.length-1)
                    break;
                }  
            }
        }
    }
    return flag;
}
public static Train[] SearchStation(String from, String to){
    if(SearchRoute(route1Forward, from, to, 1)!=1){
        if(SearchRoute(route1Reverse, from, to, 2)!=2){
           if(SearchRoute(route2Forward, from, to, 3)!=3){
              if(SearchRoute(route2Reverse, from, to, 4)!=4){
                 if(SearchRoute(route3Forward, from, to, 5)!=5){
                    if(SearchRoute(route3Reverse, from, to, 6)!=6){
                        if(SearchRoute(route4Forward, from, to, 7)!=7){
                            if(SearchRoute(route4Reverse, from, to, 8)!=8){
                                if(SearchRoute(route5Forward, from, to, 9)!=9){
                                    if(SearchRoute(route5Reverse, from, to, 10)!=10){
                                        if(SearchRoute(route6Forward, from, to, 11)!=11){
                                            if(SearchRoute(route6Reverse, from, to, 12)!=12){
                                                JOptionPane.showMessageDialog(null, "No Train Found!" );
                                                for(int i=0; i<trainButton.length; i++){
                                                    trainButton[i].setText("No More Train");
                                                }
                                                }
                                                else{
                                                    for(int i=0; i<trainButton.length; i++){
                                                        trainButton[i].setText(availableTrainForRoute6Reverse[i].getTrainName()+" "+availableTrainForRoute6Reverse[i].getTrainId()+", Departure Time: "+availableTrainForRoute6Reverse[i].getDepartureFromFirstStation()+", Reaching time at Final Station: "+availableTrainForRoute6Reverse[i].getArrivalAtFinalStation());
                                                        if(i==availableTrainForRoute6Reverse.length-1){
                                                            break;
                                                        }
                                                        
                                                    }
                                                    trainFromButton=availableTrainForRoute6Reverse;
                                                }
                                            }
                                            else{
                                                for(int i=0; i<trainButton.length; i++){
                                                    trainButton[i].setText(availableTrainForRoute6Forward[i].getTrainName()+" "+availableTrainForRoute6Forward[i].getTrainId()+", Departure Time: "+availableTrainForRoute6Forward[i].getDepartureFromFirstStation()+", Reaching time at Final Station: "+availableTrainForRoute6Forward[i].getArrivalAtFinalStation());
                                                    if(i==availableTrainForRoute6Forward.length-1){
                                                        break;
                                                    }
                                                }
                                                trainFromButton=availableTrainForRoute6Forward;
                                            }
                                        }
                                        else{
                                            for(int i=0; i<trainButton.length; i++){
                                                trainButton[i].setText(availableTrainForRoute5Reverse[i].getTrainName()+" "+availableTrainForRoute5Reverse[i].getTrainId()+", Departure Time: "+availableTrainForRoute5Reverse[i].getDepartureFromFirstStation()+", Reaching time at Final Station: "+availableTrainForRoute5Reverse[i].getArrivalAtFinalStation());
                                                if(i==availableTrainForRoute5Reverse.length-1){
                                                    break;
                                                }
                                            }
                                            trainFromButton=availableTrainForRoute5Reverse;
                                        }
                                    }
                                    else{
                                        for(int i=0; i<trainButton.length; i++){
                                            trainButton[i].setText(availableTrainForRoute5Forward[i].getTrainName()+" "+availableTrainForRoute5Forward[i].getTrainId()+", Departure Time: "+availableTrainForRoute5Forward[i].getDepartureFromFirstStation()+", Reaching time at Final Station: "+availableTrainForRoute5Forward[i].getArrivalAtFinalStation());
                                            if(i==availableTrainForRoute5Forward.length-1){
                                                break;
                                            }
                                        }
                                        trainFromButton=availableTrainForRoute5Forward;
                                        
                                    }
                                }
                                else{
                                    for(int i=0; i<trainButton.length; i++){
                                        trainButton[i].setText(availableTrainForRoute4Reverse[i].getTrainName()+" "+availableTrainForRoute4Reverse[i].getTrainId()+", Departure Time: "+availableTrainForRoute4Reverse[i].getDepartureFromFirstStation()+", Reaching time at Final Station: "+availableTrainForRoute4Reverse[i].getArrivalAtFinalStation());
                                        if(i==availableTrainForRoute4Reverse.length-1){
                                            break;
                                        }
                                    }
                                    trainFromButton=availableTrainForRoute5Reverse;
                                }
                            }
                            else{
                                for(int i=0; i<trainButton.length; i++){
                                    trainButton[i].setText(availableTrainForRoute4Forward[i].getTrainName()+" "+availableTrainForRoute4Forward[i].getTrainId()+", Departure Time: "+availableTrainForRoute4Forward[i].getDepartureFromFirstStation()+", Reaching time at Final Station: "+availableTrainForRoute4Forward[i].getArrivalAtFinalStation());
                                    if(i==availableTrainForRoute4Forward.length-1){
                                        break;
                                    }
                                }
                                trainFromButton=availableTrainForRoute4Forward;
                            }
                       }
                       else{
                        for(int i=0; i<trainButton.length; i++){
                            trainButton[i].setText(availableTrainForRoute3Reverse[i].getTrainName()+" "+availableTrainForRoute3Reverse[i].getTrainId()+", Departure Time: "+availableTrainForRoute3Reverse[i].getDepartureFromFirstStation()+", Reaching time at Final Station: "+availableTrainForRoute3Reverse[i].getArrivalAtFinalStation());
                            if(i==availableTrainForRoute3Reverse.length-1){
                                break;
                            }
                        }
                        trainFromButton=availableTrainForRoute3Reverse;
                        }
                   }
                   else{
                    for(int i=0; i<trainButton.length; i++){
                        trainButton[i].setText(availableTrainForRoute3Forward[i].getTrainName()+" "+availableTrainForRoute3Forward[i].getTrainId()+", Departure Time: "+availableTrainForRoute3Forward[i].getDepartureFromFirstStation()+", Reaching time at Final Station: "+availableTrainForRoute3Forward[i].getArrivalAtFinalStation());
                        if(i==availableTrainForRoute3Forward.length-1){
                            break;
                        }
                    }
                    trainFromButton=availableTrainForRoute3Forward;
                }
                }
                else{
                    for(int i=0; i<trainButton.length; i++){
                        trainButton[i].setText(availableTrainForRoute2Reverse[i].getTrainName()+" "+availableTrainForRoute2Reverse[i].getTrainId()+", Departure Time: "+availableTrainForRoute2Reverse[i].getDepartureFromFirstStation()+", Reaching time at Final Station: "+availableTrainForRoute2Reverse[i].getArrivalAtFinalStation());
                        if(i==availableTrainForRoute2Reverse.length-1){
                            break;
                        }
                    }
                    trainFromButton=availableTrainForRoute2Reverse;
                }
            }
            else{
                for(int i=0; i<trainButton.length; i++){
                    trainButton[i].setText(availableTrainForRoute2Forward[i].getTrainName()+" "+availableTrainForRoute2Forward[i].getTrainId()+", Departure Time: "+availableTrainForRoute2Forward[i].getDepartureFromFirstStation()+", Reaching time at Final Station: "+availableTrainForRoute2Forward[i].getArrivalAtFinalStation());
                    if(i==availableTrainForRoute2Forward.length-1){
                        break;
                    }
                }
                trainFromButton=availableTrainForRoute2Forward;
            }
        }
        else{
            for(int i=0; i<trainButton.length; i++){
                trainButton[i].setText(availableTrainForRoute1Reverse[i].getTrainName()+" "+availableTrainForRoute1Reverse[i].getTrainId()+", Departure Time: "+availableTrainForRoute1Reverse[i].getDepartureFromFirstStation()+", Reaching time at Final Station: "+availableTrainForRoute1Reverse[i].getArrivalAtFinalStation());
            if(i==availableTrainForRoute1Reverse.length-1){
                break;
            }
            }
            trainFromButton=availableTrainForRoute1Reverse;
        }
    }
    else{
        for(int i=0; i<trainButton.length; i++){
            trainButton[i].setText(availableTrainForRoute1Forward[i].getTrainName()+" "+availableTrainForRoute1Forward[i].getTrainId()+", Departure Time: "+availableTrainForRoute1Forward[i].getDepartureFromFirstStation()+", Reaching time at Final Station: "+availableTrainForRoute1Forward[i].getArrivalAtFinalStation());
            if(i==availableTrainForRoute1Forward.length-1){
                break;
            }
        }
        trainFromButton=availableTrainForRoute1Forward;
    }
    return trainFromButton;       
}

}
