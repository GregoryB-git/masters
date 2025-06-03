// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import Y3.m;

public class b implements Comparable
{
    public static final b p;
    public static final b q;
    public static final b r;
    public static final b s;
    public final String o;
    
    static {
        p = new b("[MIN_NAME]");
        q = new b("[MAX_KEY]");
        r = new b(".priority");
        s = new b(".info");
    }
    
    public b(final String o) {
        this.o = o;
    }
    
    public static /* synthetic */ String c(final b b) {
        return b.o;
    }
    
    public static b j(final String s) {
        final Integer k = m.k(s);
        if (k != null) {
            return new b(s, k);
        }
        if (s.equals(".priority")) {
            return b.r;
        }
        m.f(s.contains("/") ^ true);
        return new b(s);
    }
    
    public static b l() {
        return b.s;
    }
    
    public static b m() {
        return b.q;
    }
    
    public static b n() {
        return b.p;
    }
    
    public static b o() {
        return b.r;
    }
    
    public String e() {
        return this.o;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof b && (this == o || this.o.equals(((b)o).o));
    }
    
    public int h(final b b) {
        if (this == b) {
            return 0;
        }
        if (this.o.equals("[MIN_NAME]")) {
            return -1;
        }
        if (b.o.equals("[MAX_KEY]")) {
            return -1;
        }
        if (b.o.equals("[MIN_NAME]")) {
            return 1;
        }
        if (this.o.equals("[MAX_KEY]")) {
            return 1;
        }
        if (this.r()) {
            if (b.r()) {
                int n;
                if ((n = m.a(this.p(), b.p())) == 0) {
                    n = m.a(this.o.length(), b.o.length());
                }
                return n;
            }
            return -1;
        }
        else {
            if (b.r()) {
                return 1;
            }
            return this.o.compareTo(b.o);
        }
    }
    
    @Override
    public int hashCode() {
        return this.o.hashCode();
    }
    
    public int p() {
        return 0;
    }
    
    public boolean r() {
        return false;
    }
    
    public boolean s() {
        return this.equals(b.r);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ChildKey(\"");
        sb.append(this.o);
        sb.append("\")");
        return sb.toString();
    }
    
    public static class b extends d4.b
    {
        public final int t;
        
        public b(final String s, final int t) {
            super(s, null);
            this.t = t;
        }
        
        @Override
        public int p() {
            return this.t;
        }
        
        @Override
        public boolean r() {
            return true;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("IntegerChildName(\"");
            sb.append(d4.b.c(this));
            sb.append("\")");
            return sb.toString();
        }
    }
}
