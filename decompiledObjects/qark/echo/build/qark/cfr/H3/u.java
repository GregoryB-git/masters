/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.os.StatFs
 *  android.text.TextUtils
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package H3;

import H3.C;
import H3.D;
import H3.a;
import H3.e;
import H3.f;
import H3.i;
import J3.B;
import O3.d;
import P3.d;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class u {
    public static final Map f;
    public static final String g;
    public final Context a;
    public final C b;
    public final a c;
    public final d d;
    public final O3.i e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put((Object)"armeabi", (Object)5);
        hashMap.put((Object)"armeabi-v7a", (Object)6);
        hashMap.put((Object)"arm64-v8a", (Object)9);
        hashMap.put((Object)"x86", (Object)0);
        hashMap.put((Object)"x86_64", (Object)1);
        g = String.format((Locale)Locale.US, (String)"Crashlytics Android SDK/%s", (Object[])new Object[]{"18.5.1"});
    }

    public u(Context context, C c8, a a8, d d8, O3.i i8) {
        this.a = context;
        this.b = c8;
        this.c = a8;
        this.d = d8;
        this.e = i8;
    }

    public static long f(long l8) {
        if (l8 > 0L) {
            return l8;
        }
        return 0L;
    }

    public static int g() {
        String string2 = Build.CPU_ABI;
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return 7;
        }
        if ((string2 = (Integer)f.get((Object)string2.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return string2.intValue();
    }

    public final B.a a(B.a a8) {
        Object object;
        if (this.e.b().b.c && this.c.c.size() > 0) {
            object = new ArrayList();
            for (f f8 : this.c.c) {
                object.add((Object)B.a.a.a().d(f8.c()).b(f8.a()).c(f8.b()).a());
            }
            object = J3.C.a((List)object);
        } else {
            object = null;
        }
        return B.a.a().c(a8.c()).e(a8.e()).g(a8.g()).i(a8.i()).d(a8.d()).f(a8.f()).h(a8.h()).j(a8.j()).b((J3.C)object).a();
    }

    public final B.b b() {
        return B.b().k("18.5.1").g(this.c.a).h(this.b.a().c()).f(this.b.a().d()).d(this.c.f).e(this.c.g).j(4);
    }

    public B.e.d c(B.a a8) {
        int n8 = this.a.getResources().getConfiguration().orientation;
        return B.e.d.a().f("anr").e(a8.i()).b(this.j(n8, this.a(a8))).c(this.l(n8)).a();
    }

    public B.e.d d(Throwable object, Thread thread, String string2, long l8, int n8, int n9, boolean bl) {
        int n10 = this.a.getResources().getConfiguration().orientation;
        object = P3.e.a((Throwable)object, this.d);
        return B.e.d.a().f(string2).e(l8).b(this.k(n10, (P3.e)object, thread, n8, n9, bl)).c(this.l(n10)).a();
    }

    public B e(String string2, long l8) {
        return this.b().l(this.t(string2, l8)).a();
    }

    public final B.e.d.a.b.a h() {
        return B.e.d.a.b.a.a().b(0L).d(0L).c(this.c.e).e(this.c.b).a();
    }

    public final J3.C i() {
        return J3.C.d(this.h());
    }

    public final B.e.d.a j(int n8, B.a a8) {
        boolean bl = a8.c() != 100;
        return B.e.d.a.a().b(bl).f(n8).d(this.o(a8)).a();
    }

    public final B.e.d.a k(int n8, P3.e e8, Thread thread, int n9, int n10, boolean bl) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = i.i(this.c.e, this.a);
        if (runningAppProcessInfo != null) {
            boolean bl2 = runningAppProcessInfo.importance != 100;
            runningAppProcessInfo = Boolean.valueOf((boolean)bl2);
        } else {
            runningAppProcessInfo = null;
        }
        return B.e.d.a.a().b((Boolean)runningAppProcessInfo).f(n8).d(this.p(e8, thread, n9, n10, bl)).a();
    }

    public final B.e.d.c l(int n8) {
        e e8 = e.a(this.a);
        Float f8 = e8.b();
        f8 = f8 != null ? Double.valueOf((double)f8.doubleValue()) : null;
        int n9 = e8.c();
        boolean bl = i.o(this.a);
        long l8 = u.f(i.b(this.a) - i.a(this.a));
        long l9 = i.c(Environment.getDataDirectory().getPath());
        return B.e.d.c.a().b((Double)f8).c(n9).f(bl).e(n8).g(l8).d(l9).a();
    }

    public final B.e.d.a.b.c m(P3.e e8, int n8, int n9) {
        return this.n(e8, n8, n9, 0);
    }

    public final B.e.d.a.b.c n(P3.e object, int n8, int n9, int n10) {
        String string2 = object.b;
        String string3 = object.a;
        StackTraceElement[] arrstackTraceElement = object.c;
        int n11 = 0;
        int n12 = 0;
        if (arrstackTraceElement == null) {
            arrstackTraceElement = new StackTraceElement[]{};
        }
        P3.e e8 = object.d;
        if (n10 >= n9) {
            object = e8;
            do {
                n11 = n12++;
                if (object == null) break;
                object = object.d;
            } while (true);
        }
        object = B.e.d.a.b.c.a().f(string2).e(string3).c(J3.C.a(this.r(arrstackTraceElement, n8))).d(n11);
        if (e8 != null && n11 == 0) {
            object.b(this.n(e8, n8, n9, n10 + 1));
        }
        return object.a();
    }

    public final B.e.d.a.b o(B.a a8) {
        return B.e.d.a.b.a().b(a8).e(this.w()).c(this.i()).a();
    }

    public final B.e.d.a.b p(P3.e e8, Thread thread, int n8, int n9, boolean bl) {
        return B.e.d.a.b.a().f(this.z(e8, thread, n8, bl)).d(this.m(e8, n8, n9)).e(this.w()).c(this.i()).a();
    }

    public final B.e.d.a.b.e.b q(StackTraceElement stackTraceElement, B.e.d.a.b.e.b.a a8) {
        boolean bl = stackTraceElement.isNativeMethod();
        long l8 = 0L;
        long l9 = bl ? Math.max((long)stackTraceElement.getLineNumber(), (long)0L) : 0L;
        Object object = new StringBuilder();
        object.append(stackTraceElement.getClassName());
        object.append(".");
        object.append(stackTraceElement.getMethodName());
        object = object.toString();
        String string2 = stackTraceElement.getFileName();
        long l10 = l8;
        if (!stackTraceElement.isNativeMethod()) {
            l10 = l8;
            if (stackTraceElement.getLineNumber() > 0) {
                l10 = stackTraceElement.getLineNumber();
            }
        }
        return a8.e(l9).f((String)object).b(string2).d(l10).a();
    }

    public final J3.C r(StackTraceElement[] arrstackTraceElement, int n8) {
        ArrayList arrayList = new ArrayList();
        int n9 = arrstackTraceElement.length;
        for (int i8 = 0; i8 < n9; ++i8) {
            arrayList.add((Object)this.q(arrstackTraceElement[i8], B.e.d.a.b.e.b.a().c(n8)));
        }
        return J3.C.a((List)arrayList);
    }

    public final B.e.a s() {
        return B.e.a.a().e(this.b.f()).g(this.c.f).d(this.c.g).f(this.b.a().c()).b(this.c.h.d()).c(this.c.h.e()).a();
    }

    public final B.e t(String string2, long l8) {
        return B.e.a().m(l8).j(string2).h(g).b(this.s()).l(this.v()).e(this.u()).i(3).a();
    }

    public final B.e.c u() {
        Object object = new StatFs(Environment.getDataDirectory().getPath());
        int n8 = u.g();
        int n9 = Runtime.getRuntime().availableProcessors();
        long l8 = i.b(this.a);
        long l9 = object.getBlockCount();
        long l10 = object.getBlockSize();
        boolean bl = i.x();
        int n10 = i.m();
        object = Build.MANUFACTURER;
        String string2 = Build.PRODUCT;
        return B.e.c.a().b(n8).f(Build.MODEL).c(n9).h(l8).d(l9 * l10).i(bl).j(n10).e((String)object).g(string2).a();
    }

    public final B.e.e v() {
        return B.e.e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(i.y()).a();
    }

    public final B.e.d.a.b.d w() {
        return B.e.d.a.b.d.a().d("0").c("0").b(0L).a();
    }

    public final B.e.d.a.b.e x(Thread thread, StackTraceElement[] arrstackTraceElement) {
        return this.y(thread, arrstackTraceElement, 0);
    }

    public final B.e.d.a.b.e y(Thread thread, StackTraceElement[] arrstackTraceElement, int n8) {
        return B.e.d.a.b.e.a().d(thread.getName()).c(n8).b(J3.C.a(this.r(arrstackTraceElement, n8))).a();
    }

    public final J3.C z(P3.e e8, Thread thread, int n8, boolean bl) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)this.y(thread, e8.c, n8));
        if (bl) {
            for (Map.Entry entry : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread)entry.getKey();
                if (thread2.equals((Object)thread)) continue;
                arrayList.add((Object)this.x(thread2, this.d.a((StackTraceElement[])entry.getValue())));
            }
        }
        return J3.C.a((List)arrayList);
    }
}

