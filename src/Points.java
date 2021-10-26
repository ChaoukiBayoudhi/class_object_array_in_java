public class Points {
    private Point[] tab;
    private int taille;
    public Points(int taille)
    {
       tab=new Point[taille];
       this.taille=0;
    }
    public Points()
    {
        tab=new Point[200];
        this.taille=0;
    }
    public void afficher()
    {
        System.out.println("La liste des points :");
        //Affiche le tableaux des Points
//        for (int i = 0; i < this.taille; i++) {
//            tab[i].afficher();
//        }
        //ou bien
        for (Point x:tab) {
            x.afficher();
        }
    }
    public int chercher(Point p) {
        //cherche le point p et retourne soit son indice s'il existe

        //ou bien -1 si le point p n'est pas dans le tableau
        int i=0;
        boolean trouve=false;
        while(i<this.taille && !trouve)
        {
            if(p.comparer(tab[i])) {
                trouve = true;
            }
            else
                i++;
        }
        if(!trouve)
            return -1;
        return i;
    }
    public void ajouter(Point p)
    {
        //Ajout du point p à la fin du tableau
        //Ajout sans repetition
    }
    public void supprimer(Point p)
    {

    }

}
