// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L5;

import V2.j;
import Q3.b;
import Q3.c;
import android.util.Log;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import Q3.m;
import E5.k;
import Q3.r;

public class D implements b
{
    public final k a;
    public final V2.k b;
    public final int c;
    
    public D(final k a, final int c) {
        this.a = a;
        this.c = c;
        this.b = new V2.k();
    }
    
    @Override
    public c a(final m m) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final HashMap<String, HashMap<String, String>> hashMap2 = new HashMap<String, HashMap<String, String>>();
        hashMap.put("key", m.a());
        hashMap.put("value", (String)m.c());
        hashMap2.put("snapshot", hashMap);
        hashMap2.put("transactionKey", (HashMap<String, String>)this.c);
        while (true) {
            try {
                final Object c = new C(this.a).c(hashMap2);
                Objects.requireNonNull(c);
                final Map<K, Object> map = (Map<K, Object>)c;
                final Object value = map.get("aborted");
                Objects.requireNonNull(value);
                final boolean booleanValue = (boolean)value;
                final Object value2 = map.get("exception");
                Objects.requireNonNull(value2);
                final boolean booleanValue2 = (boolean)value2;
                if (!booleanValue && !booleanValue2) {
                    m.d(map.get("value"));
                    return r.b(m);
                }
                return r.a();
                final Exception ex;
                Log.e("firebase_database", "An unexpected exception occurred for a transaction.", (Throwable)ex);
                return r.a();
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void b(final Q3.c c, final boolean b, final Q3.b b2) {
        if (c != null) {
            this.b.b(y.a(c));
            return;
        }
        if (b2 != null) {
            final x x = new x(b2);
            final HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
            hashMap.put("committed", b);
            this.b.c(x.b(hashMap).a());
        }
    }
    
    public j c() {
        return this.b.a();
    }
}
