//package HW9;
//
//public class Program {
//    public static void main(String[] args) {
//        DeveloperFactory  devFactory = createDeveloperBySpecialty("c++");
//        Developer developer = devFactory.createDeveloper();
//        developer.writeCode();
//
//    }
//
//    private static DeveloperFactory createDeveloperBySpecialty(String specialty) {
//        if(specialty.equalsIgnoreCase("java")) {
//            return new JavaDevoperFactory();
//        }else if(specialty.equalsIgnoreCase("c++")){
//            return new CppDeveloperFactory();
//        }else {
//            throw new RuntimeException(specialty + "is unknow specialty");
//        }
//      }
//    }
//
