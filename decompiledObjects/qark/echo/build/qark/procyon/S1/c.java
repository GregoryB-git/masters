// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S1;

import java.io.File;
import x1.F;
import l6.d;
import org.json.JSONArray;
import java.util.Comparator;
import W5.m;
import java.util.ArrayList;
import O1.P;
import android.util.Log;
import x1.B;
import java.util.Iterator;
import org.json.JSONObject;
import org.json.JSONException;
import x1.K;
import java.util.List;
import Q1.b;
import Q1.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class c implements UncaughtExceptionHandler
{
    public static final a b;
    public static final String c;
    public static c d;
    public final UncaughtExceptionHandler a;
    
    static {
        b = new a(null);
        c = c.class.getCanonicalName();
    }
    
    public c(final UncaughtExceptionHandler a) {
        this.a = a;
    }
    
    public static final /* synthetic */ c a() {
        return S1.c.d;
    }
    
    public static final /* synthetic */ String b() {
        return S1.c.c;
    }
    
    public static final /* synthetic */ void c(final c d) {
        S1.c.d = d;
    }
    
    @Override
    public void uncaughtException(final Thread thread, final Throwable t) {
        Intrinsics.checkNotNullParameter(thread, "t");
        Intrinsics.checkNotNullParameter(t, "e");
        if (k.j(t)) {
            Q1.b.c(t);
            final Q1.c.a a = Q1.c.a.a;
            Q1.c.a.b(t, Q1.c.c.r).g();
        }
        final UncaughtExceptionHandler a2 = this.a;
        if (a2 == null) {
            return;
        }
        a2.uncaughtException(thread, t);
    }
    
    public static final class a
    {
        public static final int e(final Q1.c c, final Q1.c c2) {
            Intrinsics.checkNotNullExpressionValue(c2, "o2");
            return c.b(c2);
        }
        
        public static final void f(final List list, final K k) {
            Intrinsics.checkNotNullParameter(list, "$validReports");
            Intrinsics.checkNotNullParameter(k, "response");
            try {
                if (k.b() == null) {
                    final JSONObject d = k.d();
                    Object value;
                    if (d == null) {
                        value = null;
                    }
                    else {
                        value = d.getBoolean("success");
                    }
                    if (Intrinsics.a(value, Boolean.TRUE)) {
                        final Iterator<Q1.c> iterator = (Iterator<Q1.c>)((List<Q1.c>)list).iterator();
                        while (iterator.hasNext()) {
                            iterator.next().a();
                        }
                    }
                }
            }
            catch (JSONException ex) {}
        }
        
        public final void c() {
            // monitorenter(this)
            while (true) {
                try {
                    if (B.p()) {
                        this.d();
                    }
                    if (S1.c.a() != null) {
                        Log.w(S1.c.b(), "Already enabled!");
                        // monitorexit(this)
                        return;
                    }
                    S1.c.c(new c(Thread.getDefaultUncaughtExceptionHandler(), null));
                    Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)S1.c.a());
                    // monitorexit(this)
                    return;
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        public final void d() {
            if (P.Z()) {
                return;
            }
            final File[] p = k.p();
            final ArrayList list = new ArrayList<Object>(p.length);
            for (int length = p.length, i = 0; i < length; ++i) {
                list.add(Q1.c.a.d(p[i]));
            }
            final ArrayList<Q1.c> list2 = new ArrayList<Q1.c>();
            for (final Q1.c next : list) {
                if (next.f()) {
                    list2.add(next);
                }
            }
            final List e = m.E(list2, new S1.a());
            final JSONArray jsonArray = new JSONArray();
            final Iterator<Object> iterator2 = l6.d.g(0, Math.min(e.size(), 5)).iterator();
            while (iterator2.hasNext()) {
                jsonArray.put(e.get(((W5.B)iterator2).b()));
            }
            final k a = k.a;
            k.s("crash_reports", jsonArray, new S1.b(e));
        }
    }
}
