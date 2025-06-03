// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X4;

import Y4.a;

public final class e extends g
{
    public final short c;
    public final short d;
    
    public e(final g g, final int n, final int n2) {
        super(g);
        this.c = (short)n;
        this.d = (short)n2;
    }
    
    @Override
    public void c(final a a, final byte[] array) {
        a.d(this.c, this.d);
    }
    
    @Override
    public String toString() {
        final short c = this.c;
        final short d = this.d;
        final StringBuilder sb = new StringBuilder("<");
        sb.append(Integer.toBinaryString((c & (1 << d) - 1) | 1 << d | 1 << this.d).substring(1));
        sb.append('>');
        return sb.toString();
    }
}
