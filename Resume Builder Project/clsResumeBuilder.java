import java.sql.SQLOutput;
import java.util.Scanner;

public class clsResumeBuilder {
    public static void main(String[] args) {//entrypoint
        //creating the reader
        Scanner reader = new Scanner(System.in);

        // collecting data from user
        String fullName; //declaration: declaring a variable with name and type
        fullName = getName(reader); //initialization: setting it equal to a value for the first time

        String contactInfo = getContactInfo(reader); //doing the declaration and initialization in one step
        String education = getEducation(reader);
        String workExperience = getWorkExperience(reader);
        String skills = getSkills(reader);

        //output formatted resume
        buildResume(fullName, contactInfo, education, workExperience, skills);

        reader.close();

    }

    public static void buildResume(String fullName, String contactInfo, String education, String workExperience, String skills) {
        System.out.print("\n\n**************************** \n          RESUME \n****************************");
        System.out.print("\nResume for: " + fullName);
        System.out.print("\nContact Info: " + contactInfo);
        System.out.print("\nEducation Info: " + education);
        System.out.print("\nWork Experience Info: " + workExperience);
        System.out.print("\nList of skills: " + skills);
        System.out.print("\n**************************** \n       END OF RESUME \n****************************");


    }

    public static String getName(Scanner reader) {
        System.out.print("Welcome to your Resume Builder!" + "\nPlease type in your first name, then hit enter: ");// prompting the user
        String firstName = reader.nextLine();//storing input

        System.out.print("Please type in your last name, then hit enter: ");// prompting the user
        String lastName = reader.nextLine();//storing input

        return firstName + " " + lastName;//returning the variable name back to main
    }

    public static String getContactInfo(Scanner reader) {
        System.out.print("Please type in your phone number, then hit enter:");
        String phoneInfo = reader.nextLine();

        System.out.print("Please type in your email, then hit enter:");
        String emailInfo = reader.nextLine();

        return "\n  Phone number: " + phoneInfo + "\n  Email: " + emailInfo;
    }

    public static String getEducation(Scanner reader) { //school, major, grad year
        System.out.print("Please type in college name, then hit enter: ");
        String collegeEducation = reader.nextLine();

        System.out.print("Please type in your major, then hit enter: ");
        String majorEducation = reader.nextLine();

        System.out.print("Please type in your grad year, then hit enter: ");
        String gradEducation = reader.nextLine();

        return "\n  College Name: " + collegeEducation + "\n  Major: " + majorEducation + "\n  Grad Year: " + gradEducation;
    }

    public static String getWorkExperience(Scanner reader) {//todo what is he looking for in work experience? ex: number of years, name of company?
        System.out.print("Please type in most recent work experience, then hit enter: ");
        String workExperience = reader.nextLine();

        return "\n  Most recent work experience: " + workExperience;
    }


    public static String getSkills(Scanner reader) { //todo how many skills does he want? or what type of skills? does he want different types of skills?
        System.out.print("Enter three skills you would like printed on your resume," + "\ntype in first skill,then hit enter: ");
        String firstSkill = reader.nextLine();

        System.out.print("Type in second skill,then hit enter: ");
        String secondSkill = reader.nextLine();

        System.out.print("Type in third skill,then hit enter: ");
        String thirdSkill = reader.nextLine();

        return "\n     -" + firstSkill + "\n     -" + secondSkill + "\n     -" + thirdSkill;

    }


}

