package GENERICS.GB.Ex004.V1;

import java.util.ArrayList;
import java.util.List;


public class Repository <T extends  Content> {
    List<T> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }


    public void add(T content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public Content get(Integer index) {
        return ds.get(index);
    }

    // В качестве тренировки реализуйте возможность работы с foreach
    void play(){
        for (Content track: this.ds) {
            System.out.println(track.name);
        }
    }


    List<T> getDs(){
    return this.ds;
    }


    <T extends Content> void merge( repa){
        for (int i = 0; i < repa.; i++) {

        }
    }

}
