/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.WeakHashMap
 */
package z2;

import V2.j;
import V2.k;
import android.support.v4.media.a;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import y2.b;
import z2.e;
import z2.n;

public final class o {
    public final Map a = Collections.synchronizedMap((Map)new WeakHashMap());
    public final Map b = Collections.synchronizedMap((Map)new WeakHashMap());

    public final void b(k k8, boolean bl) {
        this.b.put((Object)k8, (Object)bl);
        k8.a().b(new n(this, k8));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void c(int n8, String string2) {
        StringBuilder stringBuilder;
        block6 : {
            String string3;
            block5 : {
                block4 : {
                    stringBuilder = new StringBuilder("The connection to Google Play services was lost");
                    if (n8 != 1) break block4;
                    string3 = " due to service disconnection.";
                    break block5;
                }
                if (n8 != 3) break block6;
                string3 = " due to dead object exception.";
            }
            stringBuilder.append(string3);
        }
        if (string2 != null) {
            stringBuilder.append(" Last reason for disconnect: ");
            stringBuilder.append(string2);
        }
        this.f(true, new Status(20, stringBuilder.toString()));
    }

    public final void d() {
        this.f(false, e.F);
    }

    public final boolean e() {
        if (this.a.isEmpty() && this.b.isEmpty()) {
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(boolean bl, Status status) {
        HashMap hashMap;
        Map map = this.a;
        synchronized (map) {
            hashMap = new HashMap(this.a);
        }
        Map map22 = this.b;
        synchronized (map22) {
            map = new HashMap(this.b);
        }
        for (Map map22 : hashMap.entrySet()) {
            if (!bl && !((Boolean)map22.getValue()).booleanValue()) continue;
            a.a(map22.getKey());
            throw null;
        }
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            hashMap = (Map.Entry)map.next();
            if (!bl && !((Boolean)hashMap.getValue()).booleanValue()) continue;
            ((k)hashMap.getKey()).d(new b(status));
        }
        return;
    }
}

