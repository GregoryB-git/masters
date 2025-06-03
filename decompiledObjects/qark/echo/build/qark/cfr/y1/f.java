/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package y1;

import O1.a;
import android.content.Context;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import y1.G;
import y1.H;
import y1.a;
import y1.e;
import y1.p;

public final class f {
    public final HashMap a = new HashMap();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(a object, e e8) {
        synchronized (this) {
            void var2_2;
            Intrinsics.checkNotNullParameter(object, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(var2_2, "appEvent");
            object = this.e((a)object);
            if (object != null) {
                object.a((e)var2_2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(G g8) {
        synchronized (this) {
            Throwable throwable2;
            block6 : {
                if (g8 == null) {
                    return;
                }
                try {
                    g8 = g8.b().iterator();
                    while (g8.hasNext()) {
                        Map.Entry entry = (Map.Entry)g8.next();
                        H h8 = this.e((a)entry.getKey());
                        if (h8 == null) continue;
                        entry = ((List)entry.getValue()).iterator();
                        while (entry.hasNext()) {
                            h8.a((e)entry.next());
                        }
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final H c(a object) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(object, "accessTokenAppIdPair");
            object = (H)this.a.get(object);
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int d() {
        synchronized (this) {
            int n8;
            Iterator iterator;
            block4 : {
                try {
                    iterator = this.a.values().iterator();
                    n8 = 0;
                    break block4;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
            while (iterator.hasNext()) {
                int n9 = ((H)iterator.next()).c();
                n8 += n9;
            }
            return n8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final H e(a a8) {
        synchronized (this) {
            Throwable throwable2;
            H h8;
            block6 : {
                try {
                    H h9;
                    h8 = h9 = (H)this.a.get((Object)a8);
                    if (h9 == null) {
                        Context context = B.l();
                        O1.a a9 = O1.a.f.e(context);
                        h8 = h9;
                        if (a9 != null) {
                            h8 = new H(a9, p.b.d(context));
                        }
                    }
                    if (h8 != null) break block6;
                }
                catch (Throwable throwable2) {}
                return null;
            }
            this.a.put((Object)a8, (Object)h8);
            return h8;
            throw throwable2;
        }
    }

    public final Set f() {
        synchronized (this) {
            Set set = this.a.keySet();
            Intrinsics.checkNotNullExpressionValue((Object)set, "stateMap.keys");
            return set;
        }
    }
}

