/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.ApplicationExitInfo
 *  android.content.Context
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.nio.charset.StandardCharsets
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.SortedSet
 *  java.util.concurrent.Executor
 */
package H3;

import E3.f;
import H3.C;
import H3.F;
import H3.H;
import H3.I;
import H3.J;
import H3.K;
import H3.L;
import H3.M;
import H3.N;
import H3.O;
import H3.P;
import H3.Q;
import H3.S;
import H3.T;
import H3.U;
import H3.a;
import H3.m;
import H3.u;
import H3.v;
import I3.c;
import I3.i;
import J3.B;
import M3.e;
import M3.g;
import P3.d;
import V2.b;
import V2.j;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Executor;

public class V {
    public final u a;
    public final e b;
    public final N3.b c;
    public final c d;
    public final i e;
    public final C f;

    public V(u u8, e e8, N3.b b8, c c8, i i8, C c9) {
        this.a = u8;
        this.b = e8;
        this.c = b8;
        this.d = c8;
        this.e = i8;
        this.f = c9;
    }

    public static /* synthetic */ int a(B.c c8, B.c c9) {
        return V.n(c8, c9);
    }

    public static /* synthetic */ boolean b(V v8, j j8) {
        return v8.q(j8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static B.a e(ApplicationExitInfo applicationExitInfo) {
        String string2 = null;
        Object object = L.a(applicationExitInfo);
        String string3 = string2;
        if (object == null) return B.a.a().c(N.a(applicationExitInfo)).e(O.a(applicationExitInfo)).g(K.a(applicationExitInfo)).i(J.a(applicationExitInfo)).d(P.a(applicationExitInfo)).f(Q.a(applicationExitInfo)).h(S.a(applicationExitInfo)).j(string3).a();
        try {
            string3 = V.f((InputStream)object);
            return B.a.a().c(N.a(applicationExitInfo)).e(O.a(applicationExitInfo)).g(K.a(applicationExitInfo)).i(J.a(applicationExitInfo)).d(P.a(applicationExitInfo)).f(Q.a(applicationExitInfo)).h(S.a(applicationExitInfo)).j(string3).a();
        }
        catch (IOException iOException) {
            object = f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not get input trace in application exit info: ");
            stringBuilder.append(M.a(applicationExitInfo));
            stringBuilder.append(" Error: ");
            stringBuilder.append((Object)iOException);
            object.k(stringBuilder.toString());
            string3 = string2;
        }
        return B.a.a().c(N.a(applicationExitInfo)).e(O.a(applicationExitInfo)).g(K.a(applicationExitInfo)).i(J.a(applicationExitInfo)).d(P.a(applicationExitInfo)).f(Q.a(applicationExitInfo)).h(S.a(applicationExitInfo)).j(string3).a();
    }

    public static String f(InputStream inputStream) {
        int n8;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrby = new byte[8192];
        while ((n8 = inputStream.read(arrby)) != -1) {
            byteArrayOutputStream.write(arrby, 0, n8);
        }
        return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
    }

    public static V g(Context context, C c8, g g8, a a8, c c9, i i8, d d8, O3.i i9, H h8, m m8) {
        return new V(new u(context, c8, a8, d8, i9), new e(g8, i9, m8), N3.b.b(context, i9, h8), c9, i8, c8);
    }

    public static List l(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add((Object)B.c.a().b((String)entry.getKey()).c((String)entry.getValue()).a());
        }
        Collections.sort((List)arrayList, (Comparator)new T());
        return arrayList;
    }

    public static /* synthetic */ int n(B.c c8, B.c c9) {
        return c8.b().compareTo(c9.b());
    }

    public final B.e.d c(B.e.d d8) {
        return this.d(d8, this.d, this.e);
    }

    public final B.e.d d(B.e.d d8, c object, i i8) {
        B.e.d.b b8 = d8.g();
        if ((object = object.c()) != null) {
            b8.d(B.e.d.d.a().b((String)object).a());
        } else {
            f.f().i("No log data to include with this event.");
        }
        object = V.l(i8.e());
        i8 = V.l(i8.f());
        if (!object.isEmpty() || !i8.isEmpty()) {
            b8.b(d8.b().g().c(J3.C.a((List)object)).e(J3.C.a((List)i8)).a());
        }
        return b8.a();
    }

    public final v h(v v8) {
        Object object = v8;
        if (v8.b().g() == null) {
            object = this.f.d();
            object = v.a(v8.b().r((String)object), v8.d(), v8.c());
        }
        return object;
    }

    public void i(String string2, List list, B.a a8) {
        f.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        list = list.iterator();
        while (list.hasNext()) {
            B.d.b b8 = ((F)list.next()).k();
            if (b8 == null) continue;
            arrayList.add((Object)b8);
        }
        this.b.l(string2, B.d.a().b(J3.C.a((List)arrayList)).a(), a8);
    }

    public void j(long l8, String string2) {
        this.b.k(string2, l8);
    }

    public final ApplicationExitInfo k(String string2, List list) {
        long l8 = this.b.q(string2);
        string2 = list.iterator();
        while (string2.hasNext()) {
            list = I.a(string2.next());
            if (J.a((ApplicationExitInfo)list) < l8) {
                return null;
            }
            if (K.a((ApplicationExitInfo)list) != 6) continue;
            return list;
        }
        return null;
    }

    public boolean m() {
        return this.b.r();
    }

    public SortedSet o() {
        return this.b.p();
    }

    public void p(String object, long l8) {
        object = this.a.e((String)object, l8);
        this.b.z((B)object);
    }

    public final boolean q(j object) {
        if (object.n()) {
            object = (v)object.j();
            f f8 = f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Crashlytics report successfully enqueued to DataTransport: ");
            stringBuilder.append(object.d());
            f8.b(stringBuilder.toString());
            object = object.c();
            if (object.delete()) {
                f8 = f.f();
                stringBuilder = new StringBuilder();
                stringBuilder.append("Deleted report file: ");
                stringBuilder.append(object.getPath());
                f8.b(stringBuilder.toString());
            } else {
                f8 = f.f();
                stringBuilder = new StringBuilder();
                stringBuilder.append("Crashlytics could not delete report file: ");
                stringBuilder.append(object.getPath());
                f8.k(stringBuilder.toString());
            }
            return true;
        }
        f.f().l("Crashlytics report could not be enqueued to DataTransport", (Throwable)object.i());
        return false;
    }

    public final void r(Throwable object, Thread thread, String string2, String string3, long l8, boolean bl) {
        boolean bl2 = string3.equals((Object)"crash");
        object = this.a.d((Throwable)object, thread, string3, l8, 4, 8, bl);
        this.b.y(this.c((B.e.d)object), string2, bl2);
    }

    public void s(Throwable throwable, Thread thread, String string2, long l8) {
        f f8 = f.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Persisting fatal event for session ");
        stringBuilder.append(string2);
        f8.i(stringBuilder.toString());
        this.r(throwable, thread, string2, "crash", l8, true);
    }

    public void t(Throwable throwable, Thread thread, String string2, long l8) {
        f f8 = f.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Persisting non-fatal event for session ");
        stringBuilder.append(string2);
        f8.i(stringBuilder.toString());
        this.r(throwable, thread, string2, "error", l8, false);
    }

    public void u(String string2, List object, c c8, i i8) {
        if ((object = this.k(string2, (List)object)) == null) {
            object = f.f();
            c8 = new StringBuilder();
            c8.append("No relevant ApplicationExitInfo occurred during session: ");
            c8.append(string2);
            object.i(c8.toString());
            return;
        }
        object = this.a.c(V.e((ApplicationExitInfo)object));
        f f8 = f.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Persisting anr for session ");
        stringBuilder.append(string2);
        f8.b(stringBuilder.toString());
        this.b.y(this.d((B.e.d)object, c8, i8), string2, true);
    }

    public void v() {
        this.b.i();
    }

    public j w(Executor executor) {
        return this.x(executor, null);
    }

    public j x(Executor executor, String string2) {
        List list = this.b.w();
        ArrayList arrayList = new ArrayList();
        list = list.iterator();
        while (list.hasNext()) {
            v v8 = (v)list.next();
            if (string2 != null && !string2.equals((Object)v8.d())) continue;
            N3.b b8 = this.c;
            v8 = this.h(v8);
            boolean bl = string2 != null;
            arrayList.add((Object)b8.c(v8, bl).g(executor, new U(this)));
        }
        return V2.m.f((Collection)arrayList);
    }
}

