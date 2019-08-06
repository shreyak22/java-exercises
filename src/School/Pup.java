package School;

public class Pup {
    Integer pupage;
    String name;

    public Pup(Integer pupage, String name){
        this.name = name;
        this.pupage = pupage;
        System.out.println ("My pup aage " +pupage+ " his name is "+name );
    }

    public String getName(){
        System.out.println ("His name "+name );
        return name;
    }

    public void setName(String aNew){
        name = aNew;
    }

    public Integer getAge(){
        return pupage;
    }

    public void setPupage(Integer pupage){
        this.pupage = pupage;
    }

    public static void main(String[] args) {
        Pup cutee = new Pup (2, "tommm");

        cutee.setName ( "loll" );
        cutee.setPupage ( 9 );
        System.out.println (cutee.getAge () );
        System.out.println (cutee.getName ( ) );
    }
}
