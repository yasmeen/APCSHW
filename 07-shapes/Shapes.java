public class Shapes {
    public String box(int r, int c) {
	String s = "";

	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }

    public String tri1(int h){
	String x = "";
	int c = 0;
	while (c <= h) {
	    int cc = 0;
	    while (cc < c) {
		x += "*";
		cc += 1;
	    }
	    x += "\n";
	    c += 1;
	}
	return x;
    }

    public String tri2(int h){
	String x = "";
	int c = 1;
	while (c <= h) {
	    int cc = 0;
	    int d = h - c;
	    while (cc < d) {
		x += " ";
		cc += 1;
	    }
	    int e = 1;
	    while (e <= c) {
		x += "*";
		e += 1;
	    }
	    x += "\n";
	    c += 1;
	}
	return x;
    }
	
}
