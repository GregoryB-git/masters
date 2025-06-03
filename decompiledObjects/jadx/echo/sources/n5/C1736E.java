package n5;

import A5.a;
import E5.k;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import o5.AbstractC1765a;
import p5.C1831d;

/* renamed from: n5.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1736E implements A5.a, k.c {

    /* renamed from: h, reason: collision with root package name */
    public static String f17981h;

    /* renamed from: l, reason: collision with root package name */
    public static q f17985l;

    /* renamed from: a, reason: collision with root package name */
    public Context f17986a;

    /* renamed from: b, reason: collision with root package name */
    public E5.k f17987b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f17976c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final Map f17977d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f17978e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f17979f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static int f17980g = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f17982i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f17983j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static int f17984k = 0;

    /* renamed from: n5.E$a */
    public class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ k f17988o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ k.d f17989p;

        public a(k kVar, k.d dVar) {
            this.f17988o = kVar;
            this.f17989p = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C1736E.f17979f) {
                C1736E.this.l(this.f17988o);
            }
            this.f17989p.a(null);
        }
    }

    /* renamed from: n5.E$b */
    public class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ k f17991o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f17992p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ k.d f17993q;

        public b(k kVar, String str, k.d dVar) {
            this.f17991o = kVar;
            this.f17992p = str;
            this.f17993q = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C1736E.f17979f) {
                k kVar = this.f17991o;
                if (kVar != null) {
                    C1736E.this.l(kVar);
                }
                try {
                    if (t.c(C1736E.f17980g)) {
                        Log.d("Sqflite", "delete database " + this.f17992p);
                    }
                    k.o(this.f17992p);
                } catch (Exception e7) {
                    Log.e("Sqflite", "error " + e7 + " while closing database " + C1736E.f17984k);
                }
            }
            this.f17993q.a(null);
        }
    }

    public static boolean o(String str) {
        return str == null || str.equals(":memory:");
    }

    public static /* synthetic */ void q(E5.j jVar, k.d dVar, k kVar) {
        kVar.v(new C1831d(jVar, dVar));
    }

    public static /* synthetic */ void r(E5.j jVar, k.d dVar, k kVar) {
        kVar.E(new C1831d(jVar, dVar));
    }

    public static /* synthetic */ void s(boolean z7, String str, k.d dVar, Boolean bool, k kVar, E5.j jVar, boolean z8, int i7) {
        synchronized (f17979f) {
            if (!z7) {
                File file = new File(new File(str).getParent());
                if (!file.exists() && !file.mkdirs() && !file.exists()) {
                    dVar.b("sqlite_error", "open_failed " + str, null);
                    return;
                }
            }
            try {
                if (Boolean.TRUE.equals(bool)) {
                    kVar.N();
                } else {
                    kVar.M();
                }
                synchronized (f17978e) {
                    if (z8) {
                        try {
                            f17976c.put(str, Integer.valueOf(i7));
                        } finally {
                        }
                    }
                    f17977d.put(Integer.valueOf(i7), kVar);
                }
                if (t.b(kVar.f18014d)) {
                    Log.d("Sqflite", kVar.A() + "opened " + i7 + " " + str);
                }
                dVar.a(x(i7, false, false));
            } catch (Exception e7) {
                kVar.D(e7, new C1831d(jVar, dVar));
            }
        }
    }

    public static /* synthetic */ void t(E5.j jVar, k.d dVar, k kVar) {
        kVar.O(new C1831d(jVar, dVar));
    }

    public static /* synthetic */ void u(E5.j jVar, k.d dVar, k kVar) {
        kVar.P(new C1831d(jVar, dVar));
    }

    public static /* synthetic */ void v(E5.j jVar, k kVar, k.d dVar) {
        try {
            kVar.f18019i.setLocale(AbstractC1738G.d((String) jVar.a("locale")));
            dVar.a(null);
        } catch (Exception e7) {
            dVar.b("sqlite_error", "Error calling setLocale: " + e7.getMessage(), null);
        }
    }

    public static /* synthetic */ void w(E5.j jVar, k.d dVar, k kVar) {
        kVar.R(new C1831d(jVar, dVar));
    }

    public static Map x(int i7, boolean z7, boolean z8) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i7));
        if (z7) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z8) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    public final void A(E5.j jVar, k.d dVar) {
        Integer num = (Integer) jVar.a("id");
        int intValue = num.intValue();
        k n7 = n(jVar, dVar);
        if (n7 == null) {
            return;
        }
        if (t.b(n7.f18014d)) {
            Log.d("Sqflite", n7.A() + "closing " + intValue + " " + n7.f18012b);
        }
        String str = n7.f18012b;
        synchronized (f17978e) {
            try {
                f17977d.remove(num);
                if (n7.f18011a) {
                    f17976c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f17985l.b(n7, new a(n7, dVar));
    }

    public final void B(E5.j jVar, k.d dVar) {
        dVar.a(Boolean.valueOf(k.x((String) jVar.a("path"))));
    }

    public final void C(E5.j jVar, k.d dVar) {
        String str = (String) jVar.a("cmd");
        HashMap hashMap = new HashMap();
        if ("get".equals(str)) {
            int i7 = f17980g;
            if (i7 > 0) {
                hashMap.put("logLevel", Integer.valueOf(i7));
            }
            Map map = f17977d;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    k kVar = (k) entry.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", kVar.f18012b);
                    hashMap3.put("singleInstance", Boolean.valueOf(kVar.f18011a));
                    int i8 = kVar.f18014d;
                    if (i8 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i8));
                    }
                    hashMap2.put(((Integer) entry.getKey()).toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        dVar.a(hashMap);
    }

    public final void D(E5.j jVar, k.d dVar) {
        AbstractC1765a.f18194a = Boolean.TRUE.equals(jVar.b());
        AbstractC1765a.f18196c = AbstractC1765a.f18195b && AbstractC1765a.f18194a;
        if (!AbstractC1765a.f18194a) {
            f17980g = 0;
        } else if (AbstractC1765a.f18196c) {
            f17980g = 2;
        } else if (AbstractC1765a.f18194a) {
            f17980g = 1;
        }
        dVar.a(null);
    }

    public final void E(E5.j jVar, k.d dVar) {
        k kVar;
        String str = (String) jVar.a("path");
        synchronized (f17978e) {
            try {
                if (t.c(f17980g)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f17976c.keySet());
                }
                Map map = f17976c;
                Integer num = (Integer) map.get(str);
                if (num != null) {
                    Map map2 = f17977d;
                    kVar = (k) map2.get(num);
                    if (kVar != null && kVar.f18019i.isOpen()) {
                        if (t.c(f17980g)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(kVar.A());
                            sb.append("found single instance ");
                            sb.append(kVar.F() ? "(in transaction) " : "");
                            sb.append(num);
                            sb.append(" ");
                            sb.append(str);
                            Log.d("Sqflite", sb.toString());
                        }
                        map2.remove(num);
                        map.remove(str);
                    }
                }
                kVar = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        b bVar = new b(kVar, str, dVar);
        q qVar = f17985l;
        if (qVar != null) {
            qVar.b(kVar, bVar);
        } else {
            bVar.run();
        }
    }

    public final void F(final E5.j jVar, final k.d dVar) {
        final k n7 = n(jVar, dVar);
        if (n7 == null) {
            return;
        }
        f17985l.b(n7, new Runnable() { // from class: n5.B
            @Override // java.lang.Runnable
            public final void run() {
                C1736E.q(E5.j.this, dVar, n7);
            }
        });
    }

    public void G(E5.j jVar, k.d dVar) {
        if (f17981h == null) {
            f17981h = this.f17986a.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.a(f17981h);
    }

    public final void H(final E5.j jVar, final k.d dVar) {
        final k n7 = n(jVar, dVar);
        if (n7 == null) {
            return;
        }
        f17985l.b(n7, new Runnable() { // from class: n5.x
            @Override // java.lang.Runnable
            public final void run() {
                C1736E.r(E5.j.this, dVar, n7);
            }
        });
    }

    public final void I(final E5.j jVar, final k.d dVar) {
        final int i7;
        k kVar;
        final String str = (String) jVar.a("path");
        final Boolean bool = (Boolean) jVar.a("readOnly");
        final boolean o7 = o(str);
        boolean z7 = (Boolean.FALSE.equals(jVar.a("singleInstance")) || o7) ? false : true;
        if (z7) {
            synchronized (f17978e) {
                try {
                    if (t.c(f17980g)) {
                        Log.d("Sqflite", "Look for " + str + " in " + f17976c.keySet());
                    }
                    Integer num = (Integer) f17976c.get(str);
                    if (num != null && (kVar = (k) f17977d.get(num)) != null) {
                        if (kVar.f18019i.isOpen()) {
                            if (t.c(f17980g)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(kVar.A());
                                sb.append("re-opened single instance ");
                                sb.append(kVar.F() ? "(in transaction) " : "");
                                sb.append(num);
                                sb.append(" ");
                                sb.append(str);
                                Log.d("Sqflite", sb.toString());
                            }
                            dVar.a(x(num.intValue(), true, kVar.F()));
                            return;
                        }
                        if (t.c(f17980g)) {
                            Log.d("Sqflite", kVar.A() + "single instance database of " + str + " not opened");
                        }
                    }
                } finally {
                }
            }
        }
        Object obj = f17978e;
        synchronized (obj) {
            i7 = f17984k + 1;
            f17984k = i7;
        }
        final k kVar2 = new k(this.f17986a, str, i7, z7, f17980g);
        synchronized (obj) {
            try {
                if (f17985l == null) {
                    q b7 = p.b("Sqflite", f17983j, f17982i);
                    f17985l = b7;
                    b7.start();
                    if (t.b(kVar2.f18014d)) {
                        Log.d("Sqflite", kVar2.A() + "starting worker pool with priority " + f17982i);
                    }
                }
                kVar2.f18018h = f17985l;
                if (t.b(kVar2.f18014d)) {
                    Log.d("Sqflite", kVar2.A() + "opened " + i7 + " " + str);
                }
                final boolean z8 = z7;
                f17985l.b(kVar2, new Runnable() { // from class: n5.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1736E.s(o7, str, dVar, bool, kVar2, jVar, z8, i7);
                    }
                });
            } finally {
            }
        }
    }

    public void J(E5.j jVar, k.d dVar) {
        Object a7 = jVar.a("androidThreadPriority");
        if (a7 != null) {
            f17982i = ((Integer) a7).intValue();
        }
        Object a8 = jVar.a("androidThreadCount");
        if (a8 != null && !a8.equals(Integer.valueOf(f17983j))) {
            f17983j = ((Integer) a8).intValue();
            q qVar = f17985l;
            if (qVar != null) {
                qVar.a();
                f17985l = null;
            }
        }
        Integer a9 = t.a(jVar);
        if (a9 != null) {
            f17980g = a9.intValue();
        }
        dVar.a(null);
    }

    public final void K(final E5.j jVar, final k.d dVar) {
        final k n7 = n(jVar, dVar);
        if (n7 == null) {
            return;
        }
        f17985l.b(n7, new Runnable() { // from class: n5.y
            @Override // java.lang.Runnable
            public final void run() {
                C1736E.t(E5.j.this, dVar, n7);
            }
        });
    }

    public final void L(final E5.j jVar, final k.d dVar) {
        final k n7 = n(jVar, dVar);
        if (n7 == null) {
            return;
        }
        f17985l.b(n7, new Runnable() { // from class: n5.w
            @Override // java.lang.Runnable
            public final void run() {
                C1736E.u(E5.j.this, dVar, n7);
            }
        });
    }

    public final void M(final E5.j jVar, final k.d dVar) {
        final k n7 = n(jVar, dVar);
        if (n7 == null) {
            return;
        }
        f17985l.b(n7, new Runnable() { // from class: n5.z
            @Override // java.lang.Runnable
            public final void run() {
                C1736E.v(E5.j.this, n7, dVar);
            }
        });
    }

    public final void N(final E5.j jVar, final k.d dVar) {
        final k n7 = n(jVar, dVar);
        if (n7 == null) {
            return;
        }
        f17985l.b(n7, new Runnable() { // from class: n5.C
            @Override // java.lang.Runnable
            public final void run() {
                C1736E.w(E5.j.this, dVar, n7);
            }
        });
    }

    public final void l(k kVar) {
        try {
            if (t.b(kVar.f18014d)) {
                Log.d("Sqflite", kVar.A() + "closing database ");
            }
            kVar.k();
        } catch (Exception e7) {
            Log.e("Sqflite", "error " + e7 + " while closing database " + f17984k);
        }
        synchronized (f17978e) {
            try {
                if (f17977d.isEmpty() && f17985l != null) {
                    if (t.b(kVar.f18014d)) {
                        Log.d("Sqflite", kVar.A() + "stopping thread");
                    }
                    f17985l.a();
                    f17985l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final k m(int i7) {
        return (k) f17977d.get(Integer.valueOf(i7));
    }

    public final k n(E5.j jVar, k.d dVar) {
        int intValue = ((Integer) jVar.a("id")).intValue();
        k m7 = m(intValue);
        if (m7 != null) {
            return m7;
        }
        dVar.b("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        y(bVar.a(), bVar.b());
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f17986a = null;
        this.f17987b.e(null);
        this.f17987b = null;
    }

    @Override // E5.k.c
    public void onMethodCall(E5.j jVar, k.d dVar) {
        String str = jVar.f1670a;
        str.hashCode();
        switch (str) {
            case "execute":
                F(jVar, dVar);
                break;
            case "closeDatabase":
                A(jVar, dVar);
                break;
            case "options":
                J(jVar, dVar);
                break;
            case "insert":
                H(jVar, dVar);
                break;
            case "update":
                N(jVar, dVar);
                break;
            case "androidSetLocale":
                M(jVar, dVar);
                break;
            case "deleteDatabase":
                E(jVar, dVar);
                break;
            case "debugMode":
                D(jVar, dVar);
                break;
            case "openDatabase":
                I(jVar, dVar);
                break;
            case "batch":
                z(jVar, dVar);
                break;
            case "debug":
                C(jVar, dVar);
                break;
            case "query":
                K(jVar, dVar);
                break;
            case "databaseExists":
                B(jVar, dVar);
                break;
            case "queryCursorNext":
                L(jVar, dVar);
                break;
            case "getPlatformVersion":
                dVar.a("Android " + Build.VERSION.RELEASE);
                break;
            case "getDatabasesPath":
                G(jVar, dVar);
                break;
            default:
                dVar.c();
                break;
        }
    }

    public final void y(Context context, E5.c cVar) {
        this.f17986a = context;
        E5.k kVar = new E5.k(cVar, "com.tekartik.sqflite", E5.q.f1685b, cVar.b());
        this.f17987b = kVar;
        kVar.e(this);
    }

    public final void z(final E5.j jVar, final k.d dVar) {
        final k n7 = n(jVar, dVar);
        if (n7 == null) {
            return;
        }
        f17985l.b(n7, new Runnable() { // from class: n5.D
            @Override // java.lang.Runnable
            public final void run() {
                k.this.h(jVar, dVar);
            }
        });
    }
}
