
    public static void main(String[] args) {
        double Vize1 = 60.0;
        double Vize2 = 70.0;
        double Final = 75.0;

        String CY = "Taktir";
        String Y = "Teşekkür";
        String A = "Geçtin";
        String CA = "Kaldın";

        int Ort = (int) (Vize1/4 + Vize2/4 + Final/2);
        System.out.println("Ortalamanız: " + Ort);

        if (Ort >= 85) {
            System.out.println(CY);
        } else if (Ort < 85 && Ort >= 75) {
            System.out.println(Y);
        } else if (Ort < 75 && Ort >= 50) {
            System.out.println(A);
        } else if (Ort < 50) {
            System.out.println(CA);
        }
    }
