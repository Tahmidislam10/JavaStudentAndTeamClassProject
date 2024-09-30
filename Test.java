public class Test {


    public static void main(String[] args) {
        //Created an Object//
        Student Tahmid = new Student("Tahmid",220005783);
        //Displaying Boolean value for true or false//
        System.out.println(Tahmid.isPassJava());
        Tahmid.setPassJava(true);
        System.out.println(Tahmid.isPassJava());
        //Objects for Other students//
        Student jesse = new Student("jesse", 44444);
        Student Ali = new Student("Ali", 55555);
        //Created a Team called one which has 3 members//
        Team team1 = new Team(Tahmid, jesse, Ali);
        //Displayed the name of Student//
        System.out.println(Tahmid.getName());
        System.out.println(onePass(team1));
        System.out.println(Team.getNumberOfTeams());
    }
    //Static Method//
    public static boolean onePass(Team team1) {
        if (team1.getMember1().isPassJava() ||
                team1.getMember2().isPassJava() ||
                team1.getMember3().isPassJava()){
            return true;
        }
        else {
            return false;
        }


    }



}

