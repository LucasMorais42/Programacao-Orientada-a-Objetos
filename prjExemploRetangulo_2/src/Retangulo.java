/**
 *
 * @author Nicolas Ap
 */
public class Retangulo {
    
    private double altura;
    private double base;
    
    public void setAltura(double a){
        altura = a;
    }
    
    //retorna o conteúdo do atríbuto altura
    public double getAltura(){
        return (altura);
    }
    
    public void setBase(double b){
        base = b;
    }
    
    //retorna o conteúdo do atríbuto base
    public double getBase(){
        return (base);
    }
    
    public double calcArea(){
        return (altura*base);
    }
    
    public double calcPerimetro(){
        return (2*(base+altura));
    }
    
    public double calcDiagonal(){
        return (Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2)));
    }

    
}
