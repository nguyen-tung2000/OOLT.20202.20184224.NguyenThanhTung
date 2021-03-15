public class Oder {
    public static final int MAX_NUMBER_ODERED = 10;
    private DigitalVideoDisc [] itemOdered =new DigitalVideoDisc[MAX_NUMBER_ODERED];
    private int qtyOdered=0;
    public int getQtyOdered(){
        return qtyOdered;
    }
    public void setQtyOdered(int qtyOdered){
        this.qtyOdered=qtyOdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dia){
        if(qtyOdered<MAX_NUMBER_ODERED){
            itemOdered[qtyOdered]=dia;
            qtyOdered++;
        }
        else{
            System.out.println("Gio hang day toi da chi chua 10 DVD");
        }
    } 
    public void removeDigitalVideoDisc(DigitalVideoDisc dia){
        for(int i=0;i<=qtyOdered;i++){
            if(dia == itemOdered[i]){
                for(int j=i;j<qtyOdered-1;j++){
                    itemOdered[j]=itemOdered[j+1];
                }
                qtyOdered--;
            }
        }
    }
    public float totalCost(){
        float tongTien =0.0f;
        for(int i=0;i<qtyOdered;i++){
            tongTien = tongTien + itemOdered[i].getCost();
        }
        return tongTien;
    }
}
