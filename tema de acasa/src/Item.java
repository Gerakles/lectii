public class Item {
    char color;

    // Declare and code the setColor method.
    public boolean setColor(char colorCode) {
        if (colorCode == ' ') {
            return false;
        } else {
            this.color = colorCode;
            return true;
        }
    }

    //public Item(char culoareaItemului){

        //this.color = culoareaItemului;

    public Item(char color) {
        this.color = color;
    }
}



}
