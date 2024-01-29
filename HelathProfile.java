public class HealthProfile{

	
  private String firstName;
  private String lastName;
  private String dateOfBirth;
  private String gender;
  private String month;
  private int day;
  private int YOB;
  private int height;
  private int weight;

  public HealthProfile(String firstName, String lastName, String dateOfBirth, String gender, String month, int day, int YOB, int height, int weight)
{
  this.firstName = firstName; 
  this.lastName = lastName; 
  this.dateOfBirth = dateOfBirth; 
  this.gender = gender; 
  this.month = month; 
  this.day = day; 
  this.YOB = YOB; 
 this.height = height; 
 this.weight = weight; 
  } 

  public void setfirstName(String firstName){
            this.firstName = firstName;
	}

  public void setLastName(String lastName){
	     this.lastName = lastName;
	}

  public void setDateOfBirth(String dateOfBirth){
	     this.dateOfBirth = dateOfBirth;
	}

  public void setGender(String gender){
	     this.gender = gender;
	}

public void setMonth(String month){
	     this.month = month;
	}
public void setDay(int day){
	     this.day = day;
	}
public void setYOB(int YOB){
     	      this.YOB = YOB;
	}

public void setHeight(int height){
             this.height = height;
	}
public void setWeight(int weight){
	     this.weight = weight;
	}
	
public String getFirstName(){
	      return firstName;
	}

  
public String getLastName(){
	      return lastName;
	}
  
  public String getGender (){
	   return gender;
	}

  public String getDateOfBirth(){
	     return dateOfBirth;
	}

  public int getHeight(){
	   return height;
	}

  public int getWeight(){
	   return weight;
	}

  public String getMonth(){
           return month;
	}

  public int getDay(){
	   return day;
	}
						
  public int getYOB(){
     	  return YOB;
	}

  public int getAge(){
	int age = 2023 - getYOB();
	return age;
	}

  public int getMaxHR(){
	int maxHR = 220 - getAge();
	return maxHR;
	}
	
  public double getMaxTHR(){
	double maxTHR = 0.85 * getMaxHR();
	return maxTHR;
	}

  public double getMinHR(){
	double minTHR = 0.50 * getMinHR();
	return minTHR;
	}
  

}