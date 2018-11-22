
package prypolinomios;


public class ClsPolinomio {
//Atributos
   private int _grado;
   private float _coef[];//vector
   //constructores

    public ClsPolinomio(int grado, float coef []) {
        this._grado = grado;
        this._coef = coef;
    }
     public ClsPolinomio(ClsPolinomio g) {//clonacion
        this._grado = g._grado;
        this._coef = g._coef;
    } 
     
     public ClsPolinomio(int g){
     _grado= g;
     _coef= new float [g+1];
     }
     //get y set

    public int grado() {//get
        return _grado;
    }

    public void grado(int grado) {//set
        this._grado = grado;
    }

    public float[] coef() {//get
        return _coef;
    }

    public void coef(float[] coef) {//set
        this._coef = coef;
    }
    //individuales
    public float coef(int i) {//get
        return _coef[i];
    }
    public void coef(int i, float v) {//set
        this._coef[i] = v;
    }   
    
    //METODOS
    //evaluar
    public float Fx(float valorx){ 
    float Fk = 0;
    for (int i = this._grado; i >= 0; i--){
        Fk+=_coef[i]*(float)(Math.pow(valorx, i));
    	//Fk = (this._coef[i] + (valorx * Fk)); //otra 
       
    }
    return Fk;   
  }
    //WEVALUACION 
  public float []evalua (float vi, float vf, float dx)  {
      int lim = (int)((vf-vi)/dx+1);
      int i=0;
      float []r = new float [(int)((vf-vi)/dx+1)];
      for (float x = vi; x <= vf; x+=dx) {//estos valores deben convertirse en enteros
          r[i]=Fx(x);//A ES EL VALOR Q TOMA DE fX
          //r[i++]=Fx(a);otra forma
          i++;
      }              
   return r; 
}
  //suma
//  public ClsPolinomio suma(ClsPolinomio b) {
//    ClsPolinomio a = this;
//    int grado = Math.max(a._grado, b._grado);
//    ClsPolinomio c = new ClsPolinomio(a);//_grado
//    for (int i = 0; i <= a._grado; i++){
//    	c._coef[i] += a._coef[i];
//    }
//    for (int i = 0; i <= b._grado; i++){
//    	c._coef[i] += b._coef[i];
//    }
//    return c;
//}
  public ClsPolinomio suma(ClsPolinomio b) {
      ClsPolinomio r;
      if (_grado >b._grado) {
          r= new ClsPolinomio(this);
          for (int i = 0; i < b._grado; i++) {
              r._coef[i]+=b._coef[i];
          }
      }else{
      r=new ClsPolinomio(b);
          for (int i = 0; i < _grado; i++) {
              r._coef[i]+=this._coef[i];
              
          }
      }
    return r;
}

    @Override
    public String toString() {
        String linea=_coef [_grado]+"x^"+_grado;
        for (int i=_grado-1;i>0;i--){
            if (_coef [i]!=0){
            if (_coef [i]>0) linea +="+";
            linea +=_coef[i]+"x"+i;
            }
        }
        if (_coef [0]>0)linea +="+";
        linea +=_coef [0];
        return linea;
    }
  
 
  
}
    
    
   
