/**
  Represent a date
 */
public class Date{
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }
	
	public double inYears() {
		return y + m / 12 + d / 365;
	}
	
	public int compareTo(Object otherObj) {
		Date other = (Date) otherObj;
		return Double.compare(this.inYears(), other.inYears());
	}

}