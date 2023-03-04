package HW8;

import java.util.Random;

public class MakeAuto {
    static Random rand = new Random();
    static String[] tmCivil = {"Toyota", "Vaz", "UAZ", "Honda", "AUDI"};
    static String[] tmTrack = {"SCANIA", "MERCEDES", "URAL", "KAMAZ", "TATRA"};
    static String[] tmBus = {"TOYOTA", "MERCEDES", "PAZ", "GAZ"};



    public static Auto getCar(){
        Auto res = null;
            int sw = rand.nextInt(1, 3);
            switch (sw){
                case 1:
                    res = new Track(tmTrack[rand.nextInt(tmTrack.length)],
                            rand.nextInt(3000, 5000), rand.nextInt(100, 140));
                    break;
                case 2:
                    res = new Civil(tmCivil[rand.nextInt(tmCivil.length )],
                            rand.nextInt(1000, 1500), rand.nextInt(150, 200));
                    break;
                case 3:
                    res = new Bus(tmBus[rand.nextInt(tmBus.length)],
                            rand.nextInt(3000, 5000), rand.nextInt(100, 140));
                break;
                        }
             return res;
            }
        }


