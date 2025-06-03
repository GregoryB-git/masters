// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c1;

import java.util.Collection;
import java.util.List;
import X2.v;

public class e
{
    public final v a;
    public final long b;
    public final long c;
    public final long d;
    
    public e(final List list, final long b, final long c) {
        this.a = v.U(list);
        this.b = b;
        this.c = c;
        long d = -9223372036854775807L;
        if (b != -9223372036854775807L) {
            if (c == -9223372036854775807L) {
                d = d;
            }
            else {
                d = b + c;
            }
        }
        this.d = d;
    }
}
