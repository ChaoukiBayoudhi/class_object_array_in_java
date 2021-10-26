import java.util.Scanner;

public class Point {
    //Attributs
    private double abscisse;
    private double ordonnée;

    ////methodes
    public void initialiser()//initialise le point par defaut à l'origine
    {
        abscisse=0.0;
        ordonnée=0.0;
    }
    public void saisir()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Abscisse  ? = ");
        this.abscisse=sc.nextDouble();
        System.out.print("Ordonnée  ? = ");
        this.ordonnée=sc.nextDouble();
    }
    public void afficher()
    {
        System.out.println("Point("+this.abscisse+", "+this.ordonnée+")");
    }
    public void déplacer(double dx, double dy)
            //delace this à une autre position
    {
        //this.abscisse=this.abscisse+dx;
        //ou bien
        this.abscisse+=dx;
        this.ordonnée+=dy;
    }
    public Point copier()//créer une copie du Point this
    {
        Point pc=new Point();
        pc.abscisse=this.abscisse;
        pc.ordonnée=this.ordonnée;
        return pc;

    }
    public boolean comparer(Point p)
        //compare this avec le Point p
    {
//        if(this.abscisse==p.abscisse && this.ordonnée==p.ordonnée)
//            return true;
//        return false;
        //ou bien
        return (this.abscisse==p.abscisse && this.ordonnée==p.ordonnée)?true:false;
    }

}
