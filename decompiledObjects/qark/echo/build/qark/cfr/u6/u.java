/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ClassLoader
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ServiceLoader
 */
package u6;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import n6.c;
import p6.B0;
import u6.G;
import u6.t;
import u6.v;

public final class u {
    public static final u a;
    public static final B0 b;

    static {
        u u8;
        a = u8 = new u();
        G.f("kotlinx.coroutines.fast.service.loader", true);
        b = u8.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final B0 a() {
        try {
            Object object;
            Object object2;
            List list = c.e(c.a(ServiceLoader.load(t.class, (ClassLoader)t.class.getClassLoader()).iterator()));
            Iterator iterator = ((Iterable)list).iterator();
            if (!iterator.hasNext()) {
                object = null;
            } else {
                object = iterator.next();
                if (iterator.hasNext()) {
                    int n8 = ((t)object).c();
                    object2 = object;
                    do {
                        Object object3 = iterator.next();
                        int n9 = ((t)object3).c();
                        object = object2;
                        int n10 = n8;
                        if (n8 < n9) {
                            object = object3;
                            n10 = n9;
                        }
                        object2 = object;
                        n8 = n10;
                    } while (iterator.hasNext());
                }
            }
            object = (t)object;
            if (object == null) return v.b(null, null, 3, null);
            object = object2 = v.e((t)object, list);
            if (object2 != null) return object;
            return v.b(null, null, 3, null);
        }
        catch (Throwable throwable) {}
        return v.b(throwable, null, 2, null);
    }
}

