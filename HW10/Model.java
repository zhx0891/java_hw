package HW9;

public class Model {

    public static String makeIt(String geek) {
        DeveloperFactory devFactory = createDeveloperBySpecialty(geek);
        Developer developer = devFactory.createDeveloper();
        return developer.report();
    }

    private static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equals("java")) {
            return new JavaDevoperFactory();
        } else {
            return new CppDeveloperFactory();
        }
    }
}

