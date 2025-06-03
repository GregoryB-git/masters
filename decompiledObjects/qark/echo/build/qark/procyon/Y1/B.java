// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public enum B
{
    public static final a p;
    
    q("FACEBOOK", 0, "facebook"), 
    r("INSTAGRAM", 1, "instagram");
    
    public final String o;
    
    static {
        s = c();
        p = new a(null);
    }
    
    public B(final String name, final int ordinal, final String o) {
        this.o = o;
    }
    
    public static final /* synthetic */ B[] c() {
        return new B[] { B.q, B.r };
    }
    
    @Override
    public String toString() {
        return this.o;
    }
    
    public static final class a
    {
        public final B a(final String s) {
            final B[] values = B.values();
            final int length = values.length;
            int i = 0;
            while (i < length) {
                final B b = values[i];
                ++i;
                if (Intrinsics.a(b.toString(), s)) {
                    return b;
                }
            }
            return B.q;
        }
    }
}
