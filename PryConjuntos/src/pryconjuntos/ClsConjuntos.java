/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryconjuntos;


public class ClsConjuntos {
    //atributos
private int _card;
private String _elem [];

//constructores

    public ClsConjuntos(int _card, String[] _elem) {
        this._card = _card;
        this._elem = _elem;
    }
    public ClsConjuntos(ClsConjuntos a) {
        this._card = a._card;
        this._elem = a._elem;
    }
    public ClsConjuntos() {
        _card=0;
        _elem=new String [10];
    }
    public ClsConjuntos (int card){
        _card=card;
        _elem=new String [_card];
    }
    
    //Getters y Setters

    public int card() {
        return _card;
    }

    public void card(int _card) {
        this._card = _card;
    }

    public String[] elem() {
        return _elem;
    }

    public void elem(String[] _elem) {
        this._elem = _elem;
    }
    //get y set direccionados a un punto en especifico
     public String elem (int i) {
        return _elem [i];
    }
     public void elem(int i, String valor){
         _elem [i]=valor;
     }
     public ClsConjuntos union (ClsConjuntos c){//bandera tiene doble estatutus dada una condicion es verdadero dada otra condicion es falso 
        ClsConjuntos a;
         boolean existe;
         ClsConjuntos r=new ClsConjuntos (this._card+c._card);
         int cr=this._card;//usar this._card o solo _card es lo mismo
         //comparaciones
         for (int i=0; i<_card; i++){
             r._elem [i]=_elem[i];
         }
         for (int i = 0; i <c._card; i++) {
             existe=false;
             for (int j = 0; j < _card; j++) {
                 if (c._elem[i].equals(_elem [j])){
                     existe=true;
                 }
                 if (!existe){
                     cr++;
                     r._elem [cr-1]=c._elem [i];
                 }
             }
         }
         a=new ClsConjuntos (cr, r._elem );
         return a;
     }
    // interseccion
      public ClsConjuntos interseccion (ClsConjuntos c){//bandera tiene doble estatutus dada una condicion es verdadero dada otra condicion es falso 
        ClsConjuntos a;
         boolean existe;
         ClsConjuntos r=new ClsConjuntos (this._card);
         int cr=0;
         //comparaciones
        
         for (int i = 0; i <c._card; i++) {
             existe=false;
             for (int j = 0; j < _card; j++) {
                 if (c._elem[i].equals(_elem [j])){
                     existe=true;
                 }
                 if (existe){//si existe es parte de la interseccion 
                     cr++;
                     r._elem [cr-1]=c._elem [i];
                 }
             }
         }
         a=new ClsConjuntos (cr, r._elem );
         return a;
     }
      //diferencia 
       public ClsConjuntos diferencia (ClsConjuntos c){//bandera tiene doble estatutus dada una condicion es verdadero dada otra condicion es falso 
        ClsConjuntos a;
         boolean existe;
         ClsConjuntos r=new ClsConjuntos (this._card);
         int cr=0;
         //comparaciones
        
         for (int i = 0; i <_card; i++) {//llamado a a b a.diferencia(b)
             existe=false;
             for (int j = 0; j < c._card; j++) {
                 if (_elem[i].equals(c._elem [j])){
                     existe=true;
                 }
                 if (!existe){
                     cr++;
                     r._elem [cr-1]=_elem [i];
                 }
             }
         }
         a=new ClsConjuntos (cr, r._elem );
         return a;
     }
       //diferencia simetrica
       public ClsConjuntos difSimetrica (ClsConjuntos c){
           ClsConjuntos r=new ClsConjuntos (this.diferencia(c));
           ClsConjuntos s =new ClsConjuntos (c.diferencia(this));
           return r.union (s);
       }
       //producto cartesiano
       public ClsConjuntos prodCartesiano (ClsConjuntos c){
           ClsConjuntos r=new ClsConjuntos (_card*c._card);//conjunto solucion
           int ne=0; //numero de elementos
           for (int i=0; i<_card;i++){
               for (int j = 0; j < c._card; j++) {
                   ne++;
                   r._elem [ne-1]="("+_elem[i]+","+c._elem[j]+")";//utilizacion de sentencias
                   
               }
               
           }
           return r;
       }
       //visualizar metodos de un conjunto

    @Override
    public String toString() {
        String linea="{";
        for (int i = 0; i <_card-1; i++) {
            linea+=_elem[i]+",";
            linea+=_elem[_card-1]+"}";
        }
        return "ClsConjuntos{" + "_card=" + _card + ", _elem=" + _elem + '}';
    }

    
}
