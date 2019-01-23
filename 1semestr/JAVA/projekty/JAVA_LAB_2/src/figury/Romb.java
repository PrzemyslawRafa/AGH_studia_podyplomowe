/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figury;

/**
 *
 * @author przemek
 */
public class Romb extends Figura {
    private double a, h;

    public Romb(Punkt p, double na, double nh) {
        super(p);
        a = na;
        h = nh;
    }

    @Override
    public double pole() {
        return a*h;
    }

    @Override
    public void powieksz(double ile) {
        a *= ile;
        h *= ile;
    }
    
    @Override
    public String toString() {
	return "Romb(" + a + ", " + h + ")" + super.toString();
    }
}
