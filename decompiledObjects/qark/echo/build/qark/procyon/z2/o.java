// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import java.util.Iterator;
import y2.b;
import android.support.v4.media.a;
import java.util.HashMap;
import com.google.android.gms.common.api.Status;
import V2.e;
import V2.k;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Map;

public final class o
{
    public final Map a;
    public final Map b;
    
    public o() {
        this.a = Collections.synchronizedMap(new WeakHashMap<Object, Object>());
        this.b = Collections.synchronizedMap(new WeakHashMap<Object, Object>());
    }
    
    public final void b(final k k, final boolean b) {
        this.b.put(k, b);
        k.a().b(new n(this, k));
    }
    
    public final void c(final int n, final String str) {
        final StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        Label_0040: {
            String str2;
            if (n == 1) {
                str2 = " due to service disconnection.";
            }
            else {
                if (n != 3) {
                    break Label_0040;
                }
                str2 = " due to dead object exception.";
            }
            sb.append(str2);
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        this.f(true, new Status(20, sb.toString()));
    }
    
    public final void d() {
        this.f(false, z2.e.F);
    }
    
    public final boolean e() {
        return !this.a.isEmpty() || !this.b.isEmpty();
    }
    
    public final void f(final boolean b, final Status status) {
        Object o = this.a;
        synchronized (o) {
            final HashMap<Object, Object> hashMap = new HashMap<Object, Object>(this.a);
            // monitorexit(o)
            Object b2 = this.b;
            synchronized (b2) {
                o = new HashMap<Object, Object>(this.b);
                // monitorexit(b2)
                final Iterator<Map.Entry<Object, Object>> iterator = hashMap.entrySet().iterator();
                while (iterator.hasNext()) {
                    b2 = iterator.next();
                    if (!b && !((Map.Entry<K, Boolean>)b2).getValue()) {
                        continue;
                    }
                    android.support.v4.media.a.a(((Map.Entry)b2).getKey());
                    throw null;
                }
                o = ((Map<Object, Object>)o).entrySet().iterator();
                while (((Iterator)o).hasNext()) {
                    final Map.Entry<K, Boolean> entry = ((Iterator<Map.Entry<K, Boolean>>)o).next();
                    if (b || entry.getValue()) {
                        ((k)entry.getKey()).d(new b(status));
                    }
                }
            }
        }
    }
}
