/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryfraccion;

/**
 *
 * @author ESFOT
 */
public class ClsFraccion {
    private int _numerador;
    private int _denominador;

    public ClsFraccion(int n, int d) {
        this._numerador = _numerador;
        this._denominador = (d==0)?1:d;
    }
    public ClsFraccion( ) {
        this._numerador =0;
        this._denominador =1;
    }
    public ClsFraccion(ClsFraccion q) {
        this._numerador =q._numerador;
        this._denominador =q._denominador;
    }
     
//getter y setter
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
    //metodos unarios
    @Override
   public  String toString (){
       this.simplificar();
       String p=_numerador+"/"+_denominador;
       if (_numerador>_denominador)
           p=(int)(_numerador/_denominador)+" "+(_numerador%_denominador)+"/"+(_denominador);
           return p;
   }
   public float valor (){
       return _numerador/_denominador;
   }
   public void Ala (int k){//potencia
       this._numerador =(int) Math.pow(_numerador,k);
        this._denominador =(int) Math.pow(_denominador,k);
   }
//   private int mcd (){
//       int u=Math.abs(_numerador);//valor absoluto
//       int v=Math.abs(_denominador);
//       int r;
//       while (v!=0){
//           r=u%v;
//           u=v;
//           v=r;
//       }
//        return u;
//   }
//   public void Simplificar (){
//     int dividir=mcd();
//     _numerador/=dividir;
//     _denominador/=dividir;
//     
//   }
   public void simplificar(){
       int divisor=2;
       while(divisor<=_numerador && divisor<=_denominador){
           while(_numerador % divisor == 0 && _denominador % divisor==0)
               _numerador/=divisor;
           _denominador/=divisor;
       }
       divisor+=1;
   }
   public ClsFraccion inversa(ClsFraccion a) {
        return new ClsFraccion(a._denominador, a._numerador);
    }
   
}
