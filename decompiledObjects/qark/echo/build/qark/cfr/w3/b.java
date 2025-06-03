/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 */
package w3;

import A2.n;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import s3.e;
import w3.a;
import w3.c;
import w3.d;
import x3.f;

public class b
implements a {
    public static volatile a c;
    public final Q2.a a;
    public final Map b;

    public b(Q2.a a8) {
        n.i(a8);
        this.a = a8;
        this.b = new ConcurrentHashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a h(e e8, Context context, n4.d d8) {
        n.i(e8);
        n.i((Object)context);
        n.i(d8);
        n.i((Object)context.getApplicationContext());
        if (c != null) return c;
        synchronized (b.class) {
            try {
                if (c != null) return c;
                Bundle bundle = new Bundle(1);
                if (e8.y()) {
                    d8.b(s3.b.class, c.o, d.a);
                    bundle.putBoolean("dataCollectionDefaultEnabled", e8.x());
                }
                c = new b(J0.f(context, null, null, null, bundle).z());
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void i(n4.a a8) {
        boolean bl = ((s3.b)a8.a()).a;
        synchronized (b.class) {
            ((b)n.i((Object)b.c)).a.i(bl);
            return;
        }
    }

    @Override
    public Map a(boolean bl) {
        return this.a.d(null, null, bl);
    }

    @Override
    public void b(a.c c8) {
        if (!x3.a.h(c8)) {
            return;
        }
        this.a.g(x3.a.a(c8));
    }

    @Override
    public List c(String string2, String string3) {
        ArrayList arrayList = new ArrayList();
        string2 = this.a.b(string2, string3).iterator();
        while (string2.hasNext()) {
            arrayList.add((Object)x3.a.c((Bundle)string2.next()));
        }
        return arrayList;
    }

    @Override
    public void clearConditionalUserProperty(String string2, String string3, Bundle bundle) {
        if (string3 != null && !x3.a.e(string3, bundle)) {
            return;
        }
        this.a.a(string2, string3, bundle);
    }

    @Override
    public void d(String string2, String string3, Object object) {
        if (!x3.a.j(string2)) {
            return;
        }
        if (!x3.a.f(string2, string3)) {
            return;
        }
        this.a.h(string2, string3, object);
    }

    @Override
    public void e(String string2, String string3, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        if (!x3.a.j(string2)) {
            return;
        }
        if (!x3.a.e(string3, bundle2)) {
            return;
        }
        if (!x3.a.g(string2, string3, bundle2)) {
            return;
        }
        x3.a.d(string2, string3, bundle2);
        this.a.e(string2, string3, bundle2);
    }

    @Override
    public int f(String string2) {
        return this.a.c(string2);
    }

    @Override
    public a.a g(final String string2, a.b object) {
        n.i(object);
        if (!x3.a.j(string2)) {
            return null;
        }
        if (this.j(string2)) {
            return null;
        }
        Q2.a a8 = this.a;
        object = "fiam".equals((Object)string2) ? new x3.d(a8, (a.b)object) : ("clx".equals((Object)string2) ? new Object(a8, (a.b)object) : null);
        if (object != null) {
            this.b.put((Object)string2, object);
            return new a.a(){};
        }
        return null;
    }

    public final boolean j(String string2) {
        if (!string2.isEmpty() && this.b.containsKey((Object)string2) && this.b.get((Object)string2) != null) {
            return true;
        }
        return false;
    }

}

