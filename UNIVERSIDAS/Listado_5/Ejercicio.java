import java.util.ArrayList;

public class Ejercicio{
	public static void main(String[] args){
		Expendedor exp = new Expendedor(3,1000);
		Moneda m = null;
		Comprador c=null;

		m = new Moneda1500();
		c = new Comprador(m,Expendedor.SPRITE,exp);
		System.out.println(c.queBebiste()+", " + c.cuantoVuelto());
		m = new Moneda1500();
		c = new Comprador(m,Expendedor.SPRITE,exp);
		System.out.println(c.queBebiste()+", " + c.cuantoVuelto());
		m = new Moneda1500();
		c = new Comprador(m,Expendedor.SPRITE,exp);
		System.out.println(c.queBebiste()+", " + c.cuantoVuelto());

		m = new Moneda1500();
		c = new Comprador(m,Expendedor.SPRITE,exp);
		System.out.println(c.queBebiste()+", " + c.cuantoVuelto());
		m = new Moneda1500();
		c = new Comprador(m,Expendedor.SPRITE,exp);
		System.out.println(c.queBebiste()+", " + c.cuantoVuelto());
		m = new Moneda1500();
		c = new Comprador(m,Expendedor.SPRITE,exp);
		System.out.println(c.queBebiste()+", " + c.cuantoVuelto());
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
			if(cual == COCA){
				if(m.getValor() >= precio){
					Bebida b = coca.getBebida();
					if (b == null){
						monVu.addMoneda(m);
						return null;
					}
					for(int i = 0; i < (m.getValor()-precio)/100; i++){
						monVu.addMoneda(new Moneda100());
					}
					return b;
				} else {
					monVu.addMoneda(m);
					Bebida b = null;
					return b;
				}
				
			}
			else if (cual == SPRITE){
				if(m.getValor() >= precio){
					Bebida b = sprite.getBebida();
					if (b == null){
						monVu.addMoneda(m);
						return null;
					}
					System.out.println(m.getValor());
					for(int i = 0; i < (m.getValor()-precio)/100; i++){
						monVu.addMoneda(new Moneda100());
					}
					return b;
				} else {
					monVu.addMoneda(m);
					Bebida b = null;
					return b;
				}
				
			}
			else {
				monVu.addMoneda(m);
				Bebida b = null;
				return b;
			}
		}
		else{
			return null;
		}
		
	}

	public Moneda getVuelto(){
		Moneda m = monVu.getMoneda();
		if (m == null){
			return null;
		}
		else{
			return m;
		}
	}
}

class Comprador{
	private String sonido;
	private int vuelto = 0;

	public Comprador(Moneda m, int cualBebida, Expendedor exp){
		Bebida b = exp.comprarBebida(m, cualBebida);
		
		if(b == null){
			Moneda m1= exp.getVuelto();
			if(m1 == null){
				vuelto = 0;
			} else {
				vuelto = m1.getValor();
			}
			sonido = null;
		} else {
			this.sonido = b.beber();
			while(true){
				Moneda a = exp.getVuelto();
				if(a == null){
					// this.vuelto -= exp.precio;
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