
package pryfraccion;


public class ClsFraccion {
    private int _numerador;
    private int _denominador;

   public ClsFraccion() {
      this._numerador = 0;
      this._denominador = 1;
    }
    
    public ClsFraccion(int n, int d) {
        this._numerador = n;
        this._denominador =(d==0)?1:d;//primero analiza di d es 0 y lo transforma en 1
    }
    public ClsFraccion(ClsFraccion q) {
      this._numerador = q._numerador;
      this._denominador = q._denominador;
                
    }
//GET & SET
    public int numerador() {
        return _numerador;
    }

    public void numerador(int _numerador) {
        this._numerador = _numerador;
    }

    public int denominador() {
        return _denominador;
    }

    public void denominador(int _denominador) {
        this._denominador = _denominador;
    }
    
 //METODOS UNARIOS

    @Override
    public String toString() {
        this.simplificar();
        String p=_numerador +"/"+_denominador;
        if (_numerador > _denominador) {
            p= (int)(_numerador / _denominador)+"  "+ (_numerador % _denominador)+" / "+ (_denominador);
        }
        return p;
    }
     public float valor() {
        
        return ((float)_numerador /(float) _denominador);//cast float para decimales
    }
     public void Ala(int k) {
         this._numerador = (int)Math.pow(_numerador, k);
         this._denominador = (int)Math.pow(_denominador, k);
         
    }

  
    public void simplificar(){
    int divisor = 2;
    while (divisor<=_numerador && divisor <=_denominador){
      while (_numerador% divisor == 0 && _denominador %divisor ==0){
          _numerador/=divisor;
          _denominador/=divisor;
      }
     divisor +=1;
    }
    
    }
    
    public int mcd(){
    
        int num=_numerador, den=_denominador;//creamos variables auxiliares
        if(num==0){
            return 1;// la fraccion no puede simplificar
        }else{
            if(num<0){
                num = num * -1; //- * - = +  cambia de signo a positivo
            }
            if(den<0){
                den = den * -1; //- * - = +  cambia de signo a positivo
            }
            if(den>num){ 
                int aux = num;
                num=den;
                den=aux;
            }
            int mcd=1;//guarda el valos del ciclo
            while(den!=0){
                
                mcd=den;    
                den = num % den;  
                num = mcd;
            }
            return mcd;
        }
    }
     
  public  ClsFraccion inversa(ClsFraccion a){
     return new ClsFraccion(a._denominador, a._numerador);
  }
  
  //METODOS BINARIOS 
     //SUMA
  
//  public ClsFraccion sumar(ClsFraccion a, ClsFraccion b){
//     ClsFraccion c = new ClsFraccion();
//     c._numerador = a._numerador*b._denominador+b._numerador*a._denominador;
//     c._denominador = a._denominador*b._denominador;
//     return c;
//  }
  public void  mas(ClsFraccion f) {
        this._numerador = this._numerador * f._denominador + this._denominador * f._numerador;
        this._denominador = this._denominador * f._denominador;
        this.simplificar();  //se simplifica antes de devolverla
        
}
  
  //RESTA
//   public ClsFraccion restar(ClsFraccion a, ClsFraccion b){
//     ClsFraccion c = new ClsFraccion();
//     c._numerador = a._numerador*b._denominador-(b._numerador*a._denominador);
//     c._denominador = a._denominador*b._denominador;
//     return c;
//  }
  
   public void  menos(ClsFraccion f) {
        this._numerador = -this._numerador * f._denominador + this._denominador * f._numerador;
        this._denominador = this._denominador * f._denominador;
        this.simplificar();  //se simplifica antes de devolverla
        
}
  //MULTIPLICACION
//   public ClsFraccion multiplicar(ClsFraccion a, ClsFraccion b){
//     return new ClsFraccion(a._numerador*b._numerador, a._denominador*b._denominador);
//  }
   
    public void  por(ClsFraccion f) {
        this._numerador = this._numerador * f._denominador * this._denominador * f._numerador;
        this._denominador = this._denominador * f._denominador;
        this.simplificar();  //se simplifica antes de devolverla
        
}
   
   // DIVIDIR
//   public ClsFraccion dividir(ClsFraccion a, ClsFraccion b){
//     return multiplicar(a, inversa(b));
//  }
     public void  para(ClsFraccion f) {
        this._numerador = f._numerador * this._denominador ;
        this._denominador = this._denominador *f._denominador;
        this.simplificar();  //se simplifica antes de devolverla
        
}

    
  
  
  
  
      
}
