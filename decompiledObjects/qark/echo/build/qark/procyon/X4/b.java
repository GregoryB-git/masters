// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X4;

import Y4.a;

public final class b extends g
{
    public final short c;
    public final short d;
    
    public b(final g g, final int n, final int n2) {
        super(g);
        this.c = (short)n;
        this.d = (short)n2;
    }
    
    @Override
    public void c(final a a, final byte[] array) {
        int n = 0;
        while (true) {
            final short d = this.d;
            if (n >= d) {
                break;
            }
            Label_0105: {
                if (n == 0 || (n == 31 && d <= 62)) {
                    int n2 = 5;
                    a.d(31, 5);
                    final short d2 = this.d;
                    int n3;
                    if (d2 > 62) {
                        n3 = d2 - 31;
                        n2 = 16;
                    }
                    else {
                        if (n == 0) {
                            a.d(Math.min(d2, 31), 5);
                            break Label_0105;
                        }
                        n3 = d2 - 31;
                    }
                    a.d(n3, n2);
                }
            }
            a.d(array[this.c + n], 8);
            ++n;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("<");
        sb.append(this.c);
        sb.append("::");
        sb.append(this.c + this.d - 1);
        sb.append('>');
        return sb.toString();
    }
}
