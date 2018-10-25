/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryrectangulo;

public class ClsRectangulo {
    private float _largo;
    private float _altura;
    
    public ClsRectangulo(){
        _largo=0;
        _altura=0;
    }
    //cosntructores
     public ClsRectangulo(float largo, float altura){
      this._largo = largo;
      this._altura = altura;
    }
     //creamos un rectangulo clonando otro rectangulo
     public ClsRectangulo(ClsRectangulo p){
      this._largo = p._largo;
      this._altura =p._altura;
    }
    //getter & setter
    public float Largo() {
        return _largo;
    }

    public void Largo(float _largo) {
        this._largo = _largo;
    }

    public float Altura() {
        return _altura;
    }

    public void Altura(float _altura) {
        this._altura = _altura;
    }
    
    //metodos de area y perimetros
    public float perimetro() {
        return 2*_altura +2*_largo;
    }
    public float area() {
        return _altura*_largo;
    }
    public String que_es() {
        String nombre ="RECTANGULO";
        if (_largo==_altura)
            nombre="CUADRADO";
        return nombre;
    }
    //sobrecarga podemos poner to String o Ver
    public String toString(){
        return "LARGO:"+_largo +"ALTURA:"+_altura;
    }
}
