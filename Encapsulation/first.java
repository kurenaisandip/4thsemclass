package Encapsulation;

public class first {

   private int id;
    private String name;


//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public int getId(){
//        return id;
//    }
//
//    public void setId(int id){
//        this.id = id;
//    }

    public first (int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {

        first s = new first(121, "Ashmi");
//        s.setId(132);             used in normal way
//        s.setName("Sandy");
        System.out.println("Subject name is " + s.getName() + "id is: " + s.getId());
    }



}
