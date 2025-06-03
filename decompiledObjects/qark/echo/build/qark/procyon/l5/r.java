// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l5;

import java.util.Objects;

public class r
{
    public final String a;
    public final String b;
    public final long c;
    public final p d;
    
    public r(final String a, final String b, final long c, final p d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof r;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final r r = (r)o;
            b3 = b2;
            if (this.a.equals(r.a)) {
                b3 = b2;
                if (this.b.equals(r.b)) {
                    b3 = b2;
                    if (this.c == r.c) {
                        b3 = b2;
                        if (Objects.equals(this.d, r.d)) {
                            b3 = true;
                        }
                    }
                }
            }
        }
        return b3;
    }
}
