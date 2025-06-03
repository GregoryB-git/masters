package H3;

import J3.B;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: H3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0398u {

    /* renamed from: f, reason: collision with root package name */
    public static final Map f2369f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f2370g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2371a;

    /* renamed from: b, reason: collision with root package name */
    public final C f2372b;

    /* renamed from: c, reason: collision with root package name */
    public final C0379a f2373c;

    /* renamed from: d, reason: collision with root package name */
    public final P3.d f2374d;

    /* renamed from: e, reason: collision with root package name */
    public final O3.i f2375e;

    static {
        HashMap hashMap = new HashMap();
        f2369f = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f2370g = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.5.1");
    }

    public C0398u(Context context, C c7, C0379a c0379a, P3.d dVar, O3.i iVar) {
        this.f2371a = context;
        this.f2372b = c7;
        this.f2373c = c0379a;
        this.f2374d = dVar;
        this.f2375e = iVar;
    }

    public static long f(long j7) {
        if (j7 > 0) {
            return j7;
        }
        return 0L;
    }

    public static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f2369f.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    public final B.a a(B.a aVar) {
        J3.C c7;
        if (!this.f2375e.b().f3977b.f3986c || this.f2373c.f2241c.size() <= 0) {
            c7 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C0384f c0384f : this.f2373c.f2241c) {
                arrayList.add(B.a.AbstractC0042a.a().d(c0384f.c()).b(c0384f.a()).c(c0384f.b()).a());
            }
            c7 = J3.C.a(arrayList);
        }
        return B.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(c7).a();
    }

    public final B.b b() {
        return J3.B.b().k("18.5.1").g(this.f2373c.f2239a).h(this.f2372b.a().c()).f(this.f2372b.a().d()).d(this.f2373c.f2244f).e(this.f2373c.f2245g).j(4);
    }

    public B.e.d c(B.a aVar) {
        int i7 = this.f2371a.getResources().getConfiguration().orientation;
        return B.e.d.a().f("anr").e(aVar.i()).b(j(i7, a(aVar))).c(l(i7)).a();
    }

    public B.e.d d(Throwable th, Thread thread, String str, long j7, int i7, int i8, boolean z7) {
        int i9 = this.f2371a.getResources().getConfiguration().orientation;
        return B.e.d.a().f(str).e(j7).b(k(i9, P3.e.a(th, this.f2374d), thread, i7, i8, z7)).c(l(i9)).a();
    }

    public J3.B e(String str, long j7) {
        return b().l(t(str, j7)).a();
    }

    public final B.e.d.a.b.AbstractC0046a h() {
        return B.e.d.a.b.AbstractC0046a.a().b(0L).d(0L).c(this.f2373c.f2243e).e(this.f2373c.f2240b).a();
    }

    public final J3.C i() {
        return J3.C.d(h());
    }

    public final B.e.d.a j(int i7, B.a aVar) {
        return B.e.d.a.a().b(Boolean.valueOf(aVar.c() != 100)).f(i7).d(o(aVar)).a();
    }

    public final B.e.d.a k(int i7, P3.e eVar, Thread thread, int i8, int i9, boolean z7) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo i10 = AbstractC0387i.i(this.f2373c.f2243e, this.f2371a);
        if (i10 != null) {
            bool = Boolean.valueOf(i10.importance != 100);
        } else {
            bool = null;
        }
        return B.e.d.a.a().b(bool).f(i7).d(p(eVar, thread, i8, i9, z7)).a();
    }

    public final B.e.d.c l(int i7) {
        C0383e a7 = C0383e.a(this.f2371a);
        Float b7 = a7.b();
        Double valueOf = b7 != null ? Double.valueOf(b7.doubleValue()) : null;
        int c7 = a7.c();
        boolean o7 = AbstractC0387i.o(this.f2371a);
        return B.e.d.c.a().b(valueOf).c(c7).f(o7).e(i7).g(f(AbstractC0387i.b(this.f2371a) - AbstractC0387i.a(this.f2371a))).d(AbstractC0387i.c(Environment.getDataDirectory().getPath())).a();
    }

    public final B.e.d.a.b.c m(P3.e eVar, int i7, int i8) {
        return n(eVar, i7, i8, 0);
    }

    public final B.e.d.a.b.c n(P3.e eVar, int i7, int i8, int i9) {
        String str = eVar.f4235b;
        String str2 = eVar.f4234a;
        StackTraceElement[] stackTraceElementArr = eVar.f4236c;
        int i10 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        P3.e eVar2 = eVar.f4237d;
        if (i9 >= i8) {
            P3.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f4237d;
                i10++;
            }
        }
        B.e.d.a.b.c.AbstractC0049a d7 = B.e.d.a.b.c.a().f(str).e(str2).c(J3.C.a(r(stackTraceElementArr, i7))).d(i10);
        if (eVar2 != null && i10 == 0) {
            d7.b(n(eVar2, i7, i8, i9 + 1));
        }
        return d7.a();
    }

    public final B.e.d.a.b o(B.a aVar) {
        return B.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    public final B.e.d.a.b p(P3.e eVar, Thread thread, int i7, int i8, boolean z7) {
        return B.e.d.a.b.a().f(z(eVar, thread, i7, z7)).d(m(eVar, i7, i8)).e(w()).c(i()).a();
    }

    public final B.e.d.a.b.AbstractC0052e.AbstractC0054b q(StackTraceElement stackTraceElement, B.e.d.a.b.AbstractC0052e.AbstractC0054b.AbstractC0055a abstractC0055a) {
        long j7 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j7 = stackTraceElement.getLineNumber();
        }
        return abstractC0055a.e(max).f(str).b(fileName).d(j7).a();
    }

    public final J3.C r(StackTraceElement[] stackTraceElementArr, int i7) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, B.e.d.a.b.AbstractC0052e.AbstractC0054b.a().c(i7)));
        }
        return J3.C.a(arrayList);
    }

    public final B.e.a s() {
        return B.e.a.a().e(this.f2372b.f()).g(this.f2373c.f2244f).d(this.f2373c.f2245g).f(this.f2372b.a().c()).b(this.f2373c.f2246h.d()).c(this.f2373c.f2246h.e()).a();
    }

    public final B.e t(String str, long j7) {
        return B.e.a().m(j7).j(str).h(f2370g).b(s()).l(v()).e(u()).i(3).a();
    }

    public final B.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int g7 = g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b7 = AbstractC0387i.b(this.f2371a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean x7 = AbstractC0387i.x();
        int m7 = AbstractC0387i.m();
        return B.e.c.a().b(g7).f(Build.MODEL).c(availableProcessors).h(b7).d(blockCount).i(x7).j(m7).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    public final B.e.AbstractC0057e v() {
        return B.e.AbstractC0057e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(AbstractC0387i.y()).a();
    }

    public final B.e.d.a.b.AbstractC0050d w() {
        return B.e.d.a.b.AbstractC0050d.a().d("0").c("0").b(0L).a();
    }

    public final B.e.d.a.b.AbstractC0052e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    public final B.e.d.a.b.AbstractC0052e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i7) {
        return B.e.d.a.b.AbstractC0052e.a().d(thread.getName()).c(i7).b(J3.C.a(r(stackTraceElementArr, i7))).a();
    }

    public final J3.C z(P3.e eVar, Thread thread, int i7, boolean z7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f4236c, i7));
        if (z7) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f2374d.a(entry.getValue())));
                }
            }
        }
        return J3.C.a(arrayList);
    }
}
