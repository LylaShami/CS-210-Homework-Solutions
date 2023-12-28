import java.util.IllformedLocaleException;

public class Team {
    private String teamName;
    private String coachName;
    private String conferenceName;


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }


    public static void main(String[] args) {


        Person arousa = new Person("Arousa", "206-471-3091", "December 3th, 1998", 23);
        Person hifza = new Person("Hifza", "206-928-1224", "April 18th, 2008", 13);
        Person nadia = new Person("Nadia", "206-471-3092", "October 29th,1996", 25);

        Person[] personArray = {arousa, hifza, nadia};
        String targetName = "nadia";
        String targetPhoneNumber = "206-928-1224";
        String targetBirthDate = "December 3th, 1998";
        int targetJerseyNumber = 25;

        searchName(targetName, personArray);
        searchPhoneNumber(targetPhoneNumber, personArray);
        searchBirthDate(targetBirthDate, personArray);
        searchJerseyNumber(targetJerseyNumber, personArray);
        displayRoster(personArray);


    }


    public static void displayRoster(Person[] personArray) {
        System.out.println("Displaying the roster: ");
        for (int i = 0; i < personArray.length; i++) {
            System.out.println("Person " + (i+1) + ":");
            System.out.println(personArray[i].getName());
            System.out.println(personArray[i].getPhoneNumber());
            System.out.println(personArray[i].getBirthDate());
            System.out.println("Jersey number:" + personArray[i].getJerseyNumber());
            System.out.println();

        }

    }

    public static void searchName(String targetName, Person[] personArray) {
        for (int i = 0; i < personArray.length; i++) {
            //if targetname is in the array, then output it.
            if (targetName.equalsIgnoreCase(personArray[i].getName())) {
                outputFound(personArray[i]);
                return;
            }
        }
        System.out.println("Person with the name " + targetName + " was not found in the following roster: ");
        displayRoster(personArray);
        System.out.println();
    }

    private static void outputFound(Person personArray) {
        System.out.println("Person found: ");
        System.out.println("Name: " + personArray.getName());
        System.out.println("Jersey number: " + personArray.getJerseyNumber());
        System.out.println();
    }

    public static void searchPhoneNumber(String targetPhoneNumber, Person[] personArray) {
        for (int i = 0; i < personArray.length; i++) {
            if (targetPhoneNumber.equals(personArray[i].getPhoneNumber())) {
                outputFound(personArray[i]);
                return;
            }

        }
        System.out.println("Person with the number" + targetPhoneNumber + "was not found in the following roster: ");
        displayRoster(personArray);
        System.out.println();
    }

    public static void searchBirthDate(String targetBirthDate, Person[] personArray) {
        for (int i = 0; i < personArray.length; i++) {
            if (targetBirthDate.equalsIgnoreCase(personArray[i].getBirthDate())) {
                outputFound(personArray[i]);
                return;
            }

        }
        System.out.println("Person with the number" + targetBirthDate + "was not found in the following roster: ");
        displayRoster(personArray);
        System.out.println();
    }

    public static void searchJerseyNumber(int targetJerseyNumber, Person[] personArray) {
        for (int i = 0; i < personArray.length; i++) {
            if (targetJerseyNumber == (personArray[i].getJerseyNumber())) {
                outputFound(personArray[i]);
                return;
            }
        }
        System.out.println("Person with the number" + targetJerseyNumber + "was not found in the following roster: ");
        displayRoster(personArray);
        System.out.println();

    }
}




