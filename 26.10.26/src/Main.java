//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double Vize1 = 60.0;
    double Vize2 = 70.0;
    double Final = 75.0;
    double Ort = (int) (Vize1/4) + (Vize2/4) + (Final/2);
    System.out.println(Ort);
    if (Ort>=85) {
        System.out.println("Taktir");
    }else if (Ort<85 && Ort>=75){
        System.out.println("Teşekkür");
    }else if (Ort<75 && Ort>=50){
     System.out.println("Geçtin");
    }else{
        System.out.println("Kaldın");
    }
}
