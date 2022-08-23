package home;

import userprofile.Person;

public class Help extends TermsConditions {
    static int [][][] allButtonList= new int[5][4][50];
    Person person;
    String labelText1 ="<html>"+"<br>For any query please feel free to contact.<br><br> 1. Shakib Hasan<br>2. Sajin Alam<br> 3. Wahid Shuvo<br> 4. Moon Jalal"+"</html>";

    Help(Person person, int[][][] allButtonList){
        super(person, allButtonList);
        super.jimJLabel.setText(labelText1);
        this.person=person;
        Help.allButtonList=allButtonList;
    }
    
}
