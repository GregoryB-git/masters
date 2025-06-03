// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w3;

import android.os.BaseBundle;
import x3.f;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.internal.measurement.J0;
import java.util.concurrent.Executor;
import android.os.Bundle;
import n4.d;
import android.content.Context;
import s3.e;
import java.util.concurrent.ConcurrentHashMap;
import A2.n;
import java.util.Map;

public class b implements a
{
    public static volatile a c;
    public final Q2.a a;
    public final Map b;
    
    public b(final Q2.a a) {
        n.i(a);
        this.a = a;
        this.b = new ConcurrentHashMap();
    }
    
    public static a h(final e e, final Context context, final d d) {
        n.i(e);
        n.i(context);
        n.i(d);
        n.i(context.getApplicationContext());
        while (true) {
            if (b.c == null) {
                // monitorenter(b.class)
                while (true) {
                    try {
                        if (b.c == null) {
                            final Bundle bundle = new Bundle(1);
                            if (e.y()) {
                                d.b(s3.b.class, w3.c.o, d.a);
                                ((BaseBundle)bundle).putBoolean("dataCollectionDefaultEnabled", e.x());
                            }
                            b.c = new b(J0.f(context, null, null, null, bundle).z());
                        }
                        // monitorexit(b.class)
                        return b.c;
                    }
                    // monitorexit(b.class)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    @Override
    public Map a(final boolean b) {
        return this.a.d(null, null, b);
    }
    
    @Override
    public void b(final c c) {
        if (!x3.a.h(c)) {
            return;
        }
        this.a.g(x3.a.a(c));
    }
    
    @Override
    public List c(final String s, final String s2) {
        final ArrayList<c> list = new ArrayList<c>();
        final Iterator<Bundle> iterator = this.a.b(s, s2).iterator();
        while (iterator.hasNext()) {
            list.add(x3.a.c(iterator.next()));
        }
        return list;
    }
    
    @Override
    public void clearConditionalUserProperty(final String s, final String s2, final Bundle bundle) {
        if (s2 != null && !x3.a.e(s2, bundle)) {
            return;
        }
        this.a.a(s, s2, bundle);
    }
    
    @Override
    public void d(final String s, final String s2, final Object o) {
        if (!x3.a.j(s)) {
            return;
        }
        if (!x3.a.f(s, s2)) {
            return;
        }
        this.a.h(s, s2, o);
    }
    
    @Override
    public void e(final String s, final String s2, final Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        if (!x3.a.j(s)) {
            return;
        }
        if (!x3.a.e(s2, bundle2)) {
            return;
        }
        if (!x3.a.g(s, s2, bundle2)) {
            return;
        }
        x3.a.d(s, s2, bundle2);
        this.a.e(s, s2, bundle2);
    }
    
    @Override
    public int f(final String s) {
        return this.a.c(s);
    }
    
    @Override
    public a g(final String s, final w3.a.b b) {
        n.i(b);
        if (!x3.a.j(s)) {
            return null;
        }
        if (this.j(s)) {
            return null;
        }
        final Q2.a a = this.a;
        Object o;
        if ("fiam".equals(s)) {
            o = new x3.d(a, b);
        }
        else if ("clx".equals(s)) {
            o = new f(a, b);
        }
        else {
            o = null;
        }
        if (o != null) {
            this.b.put(s, o);
            return new a() {};
        }
        return null;
    }
    
    public final boolean j(final String s) {
        return !s.isEmpty() && this.b.containsKey(s) && this.b.get(s) != null;
    }
}
