// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P4;

public class r extends o
{
    public final int p;
    
    public r(final int p2, final String s) {
        super(s);
        this.p = p2;
    }
    
    public r(final int p3, final String s, final a a) {
        super(s, a);
        this.p = p3;
    }
    
    public r(final int p3, final String s, final Throwable t) {
        super(s, t);
        this.p = p3;
    }
    
    public r(final String s, final a a) {
        super(s, a);
        this.p = -1;
    }
    
    public int a() {
        return this.p;
    }
}
