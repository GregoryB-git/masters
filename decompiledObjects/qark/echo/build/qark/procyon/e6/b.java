// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e6;

import V5.a;
import java.io.Closeable;

public abstract class b
{
    public static final void a(final Closeable closeable, final Throwable t) {
        if (closeable != null) {
            if (t == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            }
            finally {
                final Throwable t2;
                a.a(t, t2);
            }
        }
    }
}
