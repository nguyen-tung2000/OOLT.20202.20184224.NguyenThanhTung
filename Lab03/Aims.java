public class Aims{
    public static void main(String[] args){
        Oder DVDOfTung = new Oder();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King","Animation","Geogre Lucas",87,19.95f);
        DVDOfTung.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 =new DigitalVideoDisc("Star War","Science Fiction","Geogre Lucas",124,24.95f);
        DVDOfTung.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 =new DigitalVideoDisc("Alladin","Animation","John Musker",90,18.99f);
        DVDOfTung.addDigitalVideoDisc(dvd3);
        System.out.println(dvd3.getCost());
        System.out.println(DVDOfTung.getQtyOdered());
        System.out.println("Total cost is: "+DVDOfTung.totalCost()+"$");
    }
}
