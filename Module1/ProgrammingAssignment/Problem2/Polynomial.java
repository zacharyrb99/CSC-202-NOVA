package Problem2;

public class Polynomial {
    private int[] coef;
    private int deg;

    public Polynomial( int deg, int[] coef ){
        this.coef = coef;
        this.deg = deg;
    }


    public int degree(){
        int d = 0;
        for(int i = 0; i < coef.length; i++) if( coef[ i ] != 0 ) d = i;
        return d;
    }

    public int[] getCoefficients() {
        return this.coef;
    }


    // return c = a + b
    public Polynomial plus(Polynomial p) {
        if (p.deg > this.deg) {
            int[] newCoefs = new int[p.coef.length];

            for (int i = 0; i < this.coef.length; i++) {
                newCoefs[i] = this.coef[i];
            }
            
            this.coef = newCoefs;
            this.deg = p.deg;
        }

        if (this.deg > p.deg) {
            int[] newCoefs = new int[this.coef.length];

            for (int i = 0; i < p.coef.length; i++) {
                newCoefs[i] = p.coef[i];
            }
            
            p.coef = newCoefs;
        }

        int[] finalCoefs = new int[this.coef.length];

        for (int i = 0; i < this.coef.length; i++) {
            finalCoefs[i] = this.coef[i] + p.coef[i];
        }

        this.coef = finalCoefs;

        return this;
    }

    public Polynomial minus (Polynomial p) {
        if (p.deg > this.deg) {
            int[] newCoefs = new int[p.coef.length];

            for (int i = 0; i < this.coef.length; i++) {
                newCoefs[i] = this.coef[i];
            }
            
            this.coef = newCoefs;
            this.deg = p.deg;
        }

        if (this.deg > p.deg) {
            int[] newCoefs = new int[this.coef.length];

            for (int i = 0; i < p.coef.length; i++) {
                newCoefs[i] = p.coef[i];
            }
            
            p.coef = newCoefs;
        }

        int[] finalCoefs = new int[this.coef.length];

        for (int i = 0; i < this.coef.length; i++) {
            finalCoefs[i] = this.coef[i] - p.coef[i];
        }

        this.coef = finalCoefs;

        return this;
    }

    public int evaluate (int x) {
        int result = 0;
        int degree = this.deg;

        for(int i = this.deg; i >= 0; i--) {
            if (degree == 0) {
                result += this.coef[i];
            } else {
                result += this.coef[i] * Math.pow(x, degree);
                degree--;
            }
        }

        return result;
    }

    public Polynomial derivative () {
        int[] newCoefs = new int[this.deg + 1];

        for (int i = this.deg; i > 0; i--) {
            newCoefs[i] = i * this.coef[i];
        }

        for (int i = 0; i < newCoefs.length - 1; i++) {
            newCoefs[i] = newCoefs[i + 1];
        }

        return new Polynomial(this.deg - 1, newCoefs);
    }

    public boolean equals(Polynomial p) {
        String currPolynomailStr = this.toString();
        String pPolynomialStr = p.toString();

        return currPolynomailStr.equals(pPolynomialStr);
    }

    public String toString(){
        if( deg == 0 ) return "" + coef[ 0 ];
        if( deg == 1 ) return coef[ 1 ] + "x + " + coef[ 0 ];
        String s = coef[ deg ] + "x^" + deg;
        for( int i = deg - 1; i >= 0; i-- ){
            if( coef[ i ] == 0 ){
                continue;
            }else if( coef[ i ] > 0 ){
                s = s + " + " + ( coef[ i ] );
            }else if( coef[ i ] < 0 ) s = s + " - " + ( -coef[ i ] );
            if( i == 1 ){
                s = s + "x";
            }else if( i > 1 ) s = s + "x^" + i;
        }
        return s;
    }
}
