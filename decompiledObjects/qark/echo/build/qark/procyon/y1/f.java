// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import java.util.Set;
import android.content.Context;
import x1.B;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import java.util.HashMap;

public final class f
{
    public final HashMap a;
    
    public f() {
        this.a = new HashMap();
    }
    
    public final void a(final a a, final e e) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(a, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(e, "appEvent");
            final H e2 = this.e(a);
            if (e2 != null) {
                e2.a(e);
            }
        }
    }
    
    public final void b(final G g) {
        // monitorenter(this)
        if (g == null) {
            // monitorexit(this)
            return;
        }
        // monitorexit(this)
        Label_0103: {
            try {
                for (final Map.Entry<a, V> entry : g.b()) {
                    final H e = this.e(entry.getKey());
                    if (e != null) {
                        final Iterator iterator2 = ((List)entry.getValue()).iterator();
                        while (iterator2.hasNext()) {
                            e.a(iterator2.next());
                        }
                    }
                }
            }
            finally {
                break Label_0103;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public final H c(final a key) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(key, "accessTokenAppIdPair");
            return this.a.get(key);
        }
    }
    
    public final int d() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0054: {
            int n;
            try {
                final Iterator<H> iterator = this.a.values().iterator();
                n = 0;
                while (iterator.hasNext()) {
                    n += iterator.next().c();
                }
            }
            finally {
                break Label_0054;
            }
            return n;
        }
    }
    // monitorexit(this)
    
    public final H e(final a key) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0091: {
            H h2;
            try {
                final H h = h2 = this.a.get(key);
                if (h == null) {
                    final Context l = B.l();
                    final O1.a e = O1.a.f.e(l);
                    h2 = h;
                    if (e != null) {
                        h2 = new H(e, p.b.d(l));
                    }
                }
            }
            finally {
                break Label_0091;
            }
            if (h2 == null) {
                // monitorexit(this)
                return null;
            }
            final Throwable t;
            this.a.put(t, h2);
            return h2;
        }
    }
    // monitorexit(this)
    
    public final Set f() {
        synchronized (this) {
            final Set keySet = this.a.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "stateMap.keys");
            return keySet;
        }
    }
}
