// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B6;

import D6.a;
import D6.b;
import java.io.Closeable;

public abstract class h implements Closeable
{
    public static h a(final d d, final long n, final b b) {
        if (b != null) {
            return new h(d) {
                @Override
                public b c() {
                    return b;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
    
    public static h b(final d d, final byte[] array) {
        return a(d, array.length, new a().B(array));
    }
    
    public abstract b c();
    
    @Override
    public void close() {
        C6.a.c(this.c());
    }
}
