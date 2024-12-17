public class Agua {
    private final double temperatura;

    public Agua(double temperatura){
        this.temperatura = temperatura;
    }

    public void determinarEstado(){
        if(this.temperatura <= 0){
            System.out.println("Estado Sólido");

        }else if(this.temperatura < 100){
            System.out.println("Estado líquido");

        } else if (this.temperatura >=100){
            System.out.println("Estado Gaseoso");
        }
    }
}