package mcq_task;

import java.util.*;
class Question
{
private String question;
private char answer,chosenAnswer;
private int marksAwarded;
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public char getAnswer() {
	return answer;
}
public void setAnswer(char answer) {
	this.answer = answer;
}
public char getChosenAnswer() {
	return chosenAnswer;
}
public void setChosenAnswer(char chosenAnswer) {
	this.chosenAnswer = chosenAnswer;
}
public int getMarksAwarded() {
	return marksAwarded;
}
public void setMarksAwarded(int marksAwarded) {
	this.marksAwarded = marksAwarded;
}
}
class Student
{
private String name;
private String rollno;
private int mathsMarks;
private int capitalsMarks;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRollno() {
	return rollno;
}
public void setRollno(String rollno) {
	this.rollno = rollno;
}
public int getMathsMarks() {
	return mathsMarks;
}
public void setMathsMarks(int mathsMarks) {
	this.mathsMarks = mathsMarks;
}
public int getCapitalsMarks() {
	return capitalsMarks;
}
public void setCapitalsMarks(int capitalsMarks) {
	this.capitalsMarks = capitalsMarks;
}
}
class Options
{
	LinkedHashMap<Character,String> options=new LinkedHashMap<>();
}
class Test1
{
	LinkedHashMap<Question, Options> subject=new LinkedHashMap<>();
}
class Test2
{
	LinkedHashMap<Question, Options> subject=new LinkedHashMap<>();
}
public class MainClass
{
	public static void main(String[] args)
	{
		System.out.println("Enter your Details:");
		System.out.println("----------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll no:");
		String rollno=sc.next();
		System.out.println("Enter Name:");
		String name=sc.next();
		Student student=new Student();
		student.setRollno(rollno);
		student.setName(name);
		Questions q1=new Questions();
		System.out.println("1.Capitals of Indian states 2.Mathematics");
		System.out.println("Which subject you want to choose first:");
		int subjectOption=sc.nextInt();
		if(subjectOption==2)
		{
			Questions.mathematicsQuestions();
			System.out.println("-------------------------------------------------\n");
			Questions.capitalsQuestions();
		}
		else
		{
			Questions.capitalsQuestions();
			System.out.println("-------------------------------------------------\n");
			Questions.mathematicsQuestions();
		}
		System.out.println("Your score in Mathematics Subject is:"+Questions.student.getMathsMarks());
		System.out.println("Your score in Capitals of India Subject is:"+Questions.student.getCapitalsMarks());
		if((Questions.student.getMathsMarks()+Questions.student.getCapitalsMarks())>10) 
		{
			System.out.println("Congratulations, overall you got more than 50% marks...");
		}
		else
		{
			System.out.println("Your performance is too low. All the best for the next time...");
		}
		System.out.println("Do you want key paper?(1/0)");
		int option=sc.nextInt();
		if(option==1)
		{
			Questions.printKeyPaper();
		}
	}
}
