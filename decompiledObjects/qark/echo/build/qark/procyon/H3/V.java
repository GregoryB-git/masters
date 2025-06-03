// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.io.File;
import java.util.SortedSet;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import P3.d;
import M3.g;
import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.IOException;
import E3.f;
import android.app.ApplicationExitInfo;
import V2.j;
import J3.B;
import I3.i;
import I3.c;
import N3.b;
import M3.e;

public class V
{
    public final u a;
    public final e b;
    public final b c;
    public final c d;
    public final i e;
    public final C f;
    
    public V(final u a, final e b, final b c, final c d, final i e, final C f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static B.a e(final ApplicationExitInfo applicationExitInfo) {
        final String s = null;
        String f;
        try {
            final InputStream a = L.a(applicationExitInfo);
            f = s;
            if (a != null) {
                f = f(a);
            }
        }
        catch (IOException obj) {
            final f f2 = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not get input trace in application exit info: ");
            sb.append(M.a(applicationExitInfo));
            sb.append(" Error: ");
            sb.append(obj);
            f2.k(sb.toString());
            f = s;
        }
        return B.a.a().c(N.a(applicationExitInfo)).e(O.a(applicationExitInfo)).g(K.a(applicationExitInfo)).i(J.a(applicationExitInfo)).d(P.a(applicationExitInfo)).f(Q.a(applicationExitInfo)).h(S.a(applicationExitInfo)).j(f).a();
    }
    
    public static String f(final InputStream inputStream) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[8192];
        while (true) {
            final int read = inputStream.read(array);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
        return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
    }
    
    public static V g(final Context context, final C c, final g g, final a a, final c c2, final i i, final d d, final O3.i j, final H h, final m m) {
        return new V(new u(context, c, a, d, j), new e(g, j, m), b.b(context, j, h), c2, i, c);
    }
    
    public static List l(final Map map) {
        final ArrayList<Object> list = new ArrayList<Object>();
        list.ensureCapacity(map.size());
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            list.add(B.c.a().b(entry.getKey()).c((String)entry.getValue()).a());
        }
        Collections.sort(list, new T());
        return list;
    }
    
    public final B.e.d c(final B.e.d d) {
        return this.d(d, this.d, this.e);
    }
    
    public final B.e.d d(final B.e.d d, final c c, final i i) {
        final B.e.d.b g = d.g();
        final String c2 = c.c();
        if (c2 != null) {
            g.d(B.e.d.d.a().b(c2).a());
        }
        else {
            E3.f.f().i("No log data to include with this event.");
        }
        final List l = l(i.e());
        final List j = l(i.f());
        if (!l.isEmpty() || !j.isEmpty()) {
            g.b(d.b().g().c(J3.C.a(l)).e(J3.C.a(j)).a());
        }
        return g.a();
    }
    
    public final v h(final v v) {
        v a = v;
        if (v.b().g() == null) {
            a = v.a(v.b().r(this.f.d()), v.d(), v.c());
        }
        return a;
    }
    
    public void i(final String s, final List list, final B.a a) {
        E3.f.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        final ArrayList<B.d.b> list2 = new ArrayList<B.d.b>();
        final Iterator<F> iterator = list.iterator();
        while (iterator.hasNext()) {
            final B.d.b k = iterator.next().k();
            if (k != null) {
                list2.add(k);
            }
        }
        this.b.l(s, B.d.a().b(J3.C.a(list2)).a(), a);
    }
    
    public void j(final long n, final String s) {
        this.b.k(s, n);
    }
    
    public final ApplicationExitInfo k(final String s, final List list) {
        final long q = this.b.q(s);
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            final ApplicationExitInfo a = I.a(iterator.next());
            if (J.a(a) < q) {
                return null;
            }
            if (K.a(a) != 6) {
                continue;
            }
            return a;
        }
        return null;
    }
    
    public boolean m() {
        return this.b.r();
    }
    
    public SortedSet o() {
        return this.b.p();
    }
    
    public void p(final String s, final long n) {
        this.b.z(this.a.e(s, n));
    }
    
    public final boolean q(final j j) {
        if (j.n()) {
            final v v = (v)j.j();
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Crashlytics report successfully enqueued to DataTransport: ");
            sb.append(v.d());
            f.b(sb.toString());
            final File c = v.c();
            if (c.delete()) {
                final f f2 = E3.f.f();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Deleted report file: ");
                sb2.append(c.getPath());
                f2.b(sb2.toString());
            }
            else {
                final f f3 = E3.f.f();
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Crashlytics could not delete report file: ");
                sb3.append(c.getPath());
                f3.k(sb3.toString());
            }
            return true;
        }
        E3.f.f().l("Crashlytics report could not be enqueued to DataTransport", j.i());
        return false;
    }
    
    public final void r(final Throwable t, final Thread thread, final String s, final String s2, final long n, final boolean b) {
        this.b.y(this.c(this.a.d(t, thread, s2, n, 4, 8, b)), s, s2.equals("crash"));
    }
    
    public void s(final Throwable t, final Thread thread, final String str, final long n) {
        final f f = E3.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Persisting fatal event for session ");
        sb.append(str);
        f.i(sb.toString());
        this.r(t, thread, str, "crash", n, true);
    }
    
    public void t(final Throwable t, final Thread thread, final String str, final long n) {
        final f f = E3.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Persisting non-fatal event for session ");
        sb.append(str);
        f.i(sb.toString());
        this.r(t, thread, str, "error", n, false);
    }
    
    public void u(final String s, final List list, final c c, final i i) {
        final ApplicationExitInfo k = this.k(s, list);
        if (k == null) {
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("No relevant ApplicationExitInfo occurred during session: ");
            sb.append(s);
            f.i(sb.toString());
            return;
        }
        final B.e.d c2 = this.a.c(e(k));
        final f f2 = E3.f.f();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Persisting anr for session ");
        sb2.append(s);
        f2.b(sb2.toString());
        this.b.y(this.d(c2, c, i), s, true);
    }
    
    public void v() {
        this.b.i();
    }
    
    public j w(final Executor executor) {
        return this.x(executor, null);
    }
    
    public j x(final Executor executor, final String s) {
        final List w = this.b.w();
        final ArrayList<j> list = new ArrayList<j>();
        for (final v v : w) {
            if (s == null || s.equals(v.d())) {
                list.add(this.c.c(this.h(v), s != null).g(executor, new U(this)));
            }
        }
        return V2.m.f(list);
    }
}
