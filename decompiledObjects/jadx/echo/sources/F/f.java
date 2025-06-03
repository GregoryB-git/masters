package F;

import F.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final t.g f1704a = new t.g(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f1705b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1706c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final t.h f1707d = new t.h();

    public class a implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f1708o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Context f1709p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ F.e f1710q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f1711r;

        public a(String str, Context context, F.e eVar, int i7) {
            this.f1708o = str;
            this.f1709p = context;
            this.f1710q = eVar;
            this.f1711r = i7;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f1708o, this.f1709p, this.f1710q, this.f1711r);
        }
    }

    public class b implements H.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F.a f1712a;

        public b(F.a aVar) {
            this.f1712a = aVar;
        }

        @Override // H.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f1712a.b(eVar);
        }
    }

    public class c implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f1713o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Context f1714p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ F.e f1715q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f1716r;

        public c(String str, Context context, F.e eVar, int i7) {
            this.f1713o = str;
            this.f1714p = context;
            this.f1715q = eVar;
            this.f1716r = i7;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f1713o, this.f1714p, this.f1715q, this.f1716r);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    public class d implements H.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1717a;

        public d(String str) {
            this.f1717a = str;
        }

        @Override // H.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f1706c) {
                try {
                    t.h hVar = f.f1707d;
                    ArrayList arrayList = (ArrayList) hVar.get(this.f1717a);
                    if (arrayList == null) {
                        return;
                    }
                    hVar.remove(this.f1717a);
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        ((H.a) arrayList.get(i7)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f1718a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1719b;

        public e(int i7) {
            this.f1718a = null;
            this.f1719b = i7;
        }

        public boolean a() {
            return this.f1719b == 0;
        }

        public e(Typeface typeface) {
            this.f1718a = typeface;
            this.f1719b = 0;
        }
    }

    public static String a(F.e eVar, int i7) {
        return eVar.d() + "-" + i7;
    }

    public static int b(g.a aVar) {
        int i7 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b7 = aVar.b();
        if (b7 != null && b7.length != 0) {
            i7 = 0;
            for (g.b bVar : b7) {
                int b8 = bVar.b();
                if (b8 != 0) {
                    if (b8 < 0) {
                        return -3;
                    }
                    return b8;
                }
            }
        }
        return i7;
    }

    public static e c(String str, Context context, F.e eVar, int i7) {
        t.g gVar = f1704a;
        Typeface typeface = (Typeface) gVar.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a e7 = F.d.e(context, eVar, null);
            int b7 = b(e7);
            if (b7 != 0) {
                return new e(b7);
            }
            Typeface b8 = A.h.b(context, null, e7.b(), i7);
            if (b8 == null) {
                return new e(-3);
            }
            gVar.d(str, b8);
            return new e(b8);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(Context context, F.e eVar, int i7, Executor executor, F.a aVar) {
        String a7 = a(eVar, i7);
        Typeface typeface = (Typeface) f1704a.c(a7);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f1706c) {
            try {
                t.h hVar = f1707d;
                ArrayList arrayList = (ArrayList) hVar.get(a7);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                hVar.put(a7, arrayList2);
                c cVar = new c(a7, context, eVar, i7);
                if (executor == null) {
                    executor = f1705b;
                }
                h.b(executor, cVar, new d(a7));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(Context context, F.e eVar, F.a aVar, int i7, int i8) {
        String a7 = a(eVar, i7);
        Typeface typeface = (Typeface) f1704a.c(a7);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i8 == -1) {
            e c7 = c(a7, context, eVar, i7);
            aVar.b(c7);
            return c7.f1718a;
        }
        try {
            e eVar2 = (e) h.c(f1705b, new a(a7, context, eVar, i7), i8);
            aVar.b(eVar2);
            return eVar2.f1718a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }
}
