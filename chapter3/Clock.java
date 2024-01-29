public class Clock{

	private int hour;
	private int minutes;
	private int seconds;

public clock (int hour, int minutes, int seconds){
this.hour = hour;
this.minutes = minutes;
this.seconds = seconds;
}
public void setHour(int hour){
	this.hour = hour;
}
public int getHour(){
	return hour;
}
public void setMinutes(int minutes){
	this.minutes = minutes;
}
public int getMinutes(){
	return minutes;
}
public void setSeconds(int seconds){
	this.seconds = seconds;
}
public int getSeconds(){
	return secoonds = seconds;
}

public static void main(String[] args){

CLock myClock = new Clock(23, 59, 59);

System.out.printf("The current Time is %d:%d:%d", myClock.getHour(), myClock.getMinutes, myClock.getSeconds());
  }
}