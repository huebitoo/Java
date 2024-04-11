import java.util.ArrayList;

public class Ejercicio{
	public static void main(String[] args){
		Expendedor exp = new Expendedor(4,200);
		Moneda m = null;
		Comprador c=null;
		m = new Moneda1000();
		c = new Comprador(m,Expendedor.COCA,exp);
		System.out.println(c.queBebiste()+", "+ c.cuantoVuelto());
		m = new Moneda1000();
		c = new Comprador(m,Expendedor.COCA,exp);
		System.out.println(c.queBebiste()+", " +c.cuantoVuelto());
		m = new Moneda1000();
		c = new Comprador(m,Expendedor.COCA,exp);
		System.out.println(c.queBebiste()+", "+ c.cuantoVuelto());
		m = new Moneda1000();
		c = new Comprador(m,Expendedor.COCA,exp);
		System.out.println(c.queBebiste()+", "+ c.cuantoVuelto());

		m = new Moneda500();
		c = new Comprador(m,Expendedor.SPRITE,exp);
		System.out.println(c.queBebiste()+", "+ c.cuantoVuelto());
		m = new Moneda500();
		c = new Comprador(m,Expendedor.SPRITE,exp);
		System.out.println(c.queBebiste()+", "+ c.cuantoVuelto());
		m = new Moneda500();
		c = new Comprador(m,Expendedor.SPRITE,exp);
		System.out.println(c.queBebiste()+", "+ c.cuantoVuelto());
		m = new Moneda500();
		c = new Comprador(m,Expendedor.SPRITE,exp);
		System.out.println(c.queBebiste()+", "+ c.cuantoVuelto());
	}
}

class Expendedor{
	private Deposito coca; 
	private Deposito sprite;
	private DepositoM monVu;
	public static final int  COCA=1;
	public static final int  SPRITE=2;
	public int precio;

	public Expendedor(int numBebidas, int precioBebidas){
		coca = new Deposito();
		sprite = new Deposito();
		monVu = new DepositoM();
		this.precio = precioBebidas;

		for (int i = 0; i < numBebidas; i++){
			coca.addBebida(new CocaCola(100 + i));
			sprite.addBebida(new Sprite(200 + i));
		}
	}

	public Bebida comprarBebida(Moneda m, int cual){
		if(m != null){
			monVu.addMoneda(m);
			if(cual == COCA){
				if(m.getValor() >= precio){
					Bebida b = coca.getBebida();
					return b;
				} else {
					Bebida b = null;
					return b;
				}
				
			}
			else if (cual == SPRITE){
				if(m.getValor() >= precio){
					Bebida b = sprite.getBebida();
					return b;
				} else {
					Bebida b = null;
					return b;
				}
			}
			else {
				Bebida b = null;
				return b;
			}
		}
		else{
			return null;
		}
		
	}

	public Moneda getVuelto(){
		return monVu.getMoneda();
	}
}

class Comprador{
	private String sonido;
	private int vuelto = 0;

	public Comprador(Moneda m, int cualBebida, Expendedor exp){
		Bebida b = exp.comprarBebida(m, cualBebida);
		
		if(b == null){
			sonido = null;
			vuelto = exp.getVuelto().getValor();
		} else {
			this.sonido = b.beber();
			while(true){
				Moneda a = exp.getVuelto();
				if(a == null){
					this.vuelto -= exp.precio;
					break;
				} else {
					this.vuelto += a.getValor();	
				}
			}
		}
	}
    public int cuantoVuelto(){
 		return vuelto;
    }
    public String queBebiste(){
    	return sonido;
    }
}

abstract class Moneda{
	
	public Moneda(){

	}

	public Moneda getSerie(){
		return this;
	}
    public abstract int getValor();
}


abstract class Bebida{
	private int serie;

	public Bebida(int numSerie){
		this.serie = numSerie;
	}
    public int getSerie(){
    	return this.serie;
    }
    public abstract String beber();
}

class Deposito{
	private ArrayList<Bebida> array;

	public Deposito(){
		array = new ArrayList<Bebida>();
	}

	public Bebida getBebida(){
		if(array.size() > 0){
			return array.remove(0);
		}
		return null;
	}

	public void addBebida(Bebida pe){
		array.add(pe);
	}
}

class DepositoM{
	private ArrayList<Moneda> array;
	
	public DepositoM(){
		array = new ArrayList<Moneda>();
	}
	public Moneda getMoneda(){
		if(array.size() > 0){
			return array.remove(0);
		}
		return null;
	}

	public void addMoneda(Moneda pe){
		array.add(pe);
	}
}

class CocaCola extends Bebida{
	public CocaCola(int serie){
		super(serie);
	}

	public String beber(){
		return "cocacola";
	}
}

class Sprite extends Bebida{
	public Sprite(int serie){
		super(serie);
	}

	public String beber(){
		return "sprite";
	}
}


class Moneda1500 extends Moneda{
	public Moneda1500(){
		super();
	}

	public int getValor(){
		return 1500;
	}
}

class Moneda1000 extends Moneda{
	public Moneda1000(){
		super();
	}

	public int getValor(){
		return 1000;
	}
}

class Moneda500 extends Moneda{
	public Moneda500(){
		super();
	}

	public int getValor(){
		return 500;
	}
}

class Moneda100 extends Moneda{
	public Moneda100(){
		super();
	}

	public int getValor(){
		return 100;
	}
}