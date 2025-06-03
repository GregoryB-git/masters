// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import android.os.Build$VERSION;
import android.os.StatFs;
import android.os.Environment;
import android.app.ActivityManager$RunningAppProcessInfo;
import P3.e;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import J3.B;
import android.text.TextUtils;
import android.os.Build;
import java.util.Locale;
import java.util.HashMap;
import O3.i;
import P3.d;
import android.content.Context;
import java.util.Map;

public class u
{
    public static final Map f;
    public static final String g;
    public final Context a;
    public final C b;
    public final a c;
    public final d d;
    public final i e;
    
    static {
        final HashMap<String, Integer> f2 = new HashMap<String, Integer>();
        (f = f2).put("armeabi", 5);
        f2.put("armeabi-v7a", 6);
        f2.put("arm64-v8a", 9);
        f2.put("x86", 0);
        f2.put("x86_64", 1);
        g = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.5.1");
    }
    
    public u(final Context a, final C b, final a c, final d d, final i e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static long f(final long n) {
        if (n > 0L) {
            return n;
        }
        return 0L;
    }
    
    public static int g() {
        final String cpu_ABI = Build.CPU_ABI;
        if (TextUtils.isEmpty((CharSequence)cpu_ABI)) {
            return 7;
        }
        final Integer n = u.f.get(cpu_ABI.toLowerCase(Locale.US));
        if (n == null) {
            return 7;
        }
        return n;
    }
    
    public final B.a a(final B.a a) {
        J3.C a2;
        if (this.e.b().b.c && this.c.c.size() > 0) {
            final ArrayList<B.a.a> list = new ArrayList<B.a.a>();
            for (final f f : this.c.c) {
                list.add(B.a.a.a().d(f.c()).b(f.a()).c(f.b()).a());
            }
            a2 = J3.C.a(list);
        }
        else {
            a2 = null;
        }
        return B.a.a().c(a.c()).e(a.e()).g(a.g()).i(a.i()).d(a.d()).f(a.f()).h(a.h()).j(a.j()).b(a2).a();
    }
    
    public final B.b b() {
        return B.b().k("18.5.1").g(this.c.a).h(this.b.a().c()).f(this.b.a().d()).d(this.c.f).e(this.c.g).j(4);
    }
    
    public B.e.d c(final B.a a) {
        final int orientation = this.a.getResources().getConfiguration().orientation;
        return B.e.d.a().f("anr").e(a.i()).b(this.j(orientation, this.a(a))).c(this.l(orientation)).a();
    }
    
    public B.e.d d(final Throwable t, final Thread thread, final String s, final long n, final int n2, final int n3, final boolean b) {
        final int orientation = this.a.getResources().getConfiguration().orientation;
        return B.e.d.a().f(s).e(n).b(this.k(orientation, P3.e.a(t, this.d), thread, n2, n3, b)).c(this.l(orientation)).a();
    }
    
    public B e(final String s, final long n) {
        return this.b().l(this.t(s, n)).a();
    }
    
    public final B.e.d.a.b.a h() {
        return B.e.d.a.b.a.a().b(0L).d(0L).c(this.c.e).e(this.c.b).a();
    }
    
    public final J3.C i() {
        return J3.C.d(this.h());
    }
    
    public final B.e.d.a j(final int n, final B.a a) {
        return B.e.d.a.a().b(a.c() != 100).f(n).d(this.o(a)).a();
    }
    
    public final B.e.d.a k(final int n, final e e, final Thread thread, final int n2, final int n3, final boolean b) {
        final ActivityManager$RunningAppProcessInfo i = H3.i.i(this.c.e, this.a);
        Boolean value;
        if (i != null) {
            value = (i.importance != 100);
        }
        else {
            value = null;
        }
        return B.e.d.a.a().b(value).f(n).d(this.p(e, thread, n2, n3, b)).a();
    }
    
    public final B.e.d.c l(final int n) {
        final H3.e a = H3.e.a(this.a);
        final Float b = a.b();
        Double value;
        if (b != null) {
            value = (double)b;
        }
        else {
            value = null;
        }
        return B.e.d.c.a().b(value).c(a.c()).f(H3.i.o(this.a)).e(n).g(f(H3.i.b(this.a) - H3.i.a(this.a))).d(H3.i.c(Environment.getDataDirectory().getPath())).a();
    }
    
    public final B.e.d.a.b.c m(final e e, final int n, final int n2) {
        return this.n(e, n, n2, 0);
    }
    
    public final B.e.d.a.b.c n(e d, final int n, final int n2, final int n3) {
        final String b = d.b;
        final String a = d.a;
        StackTraceElement[] c = d.c;
        int n4 = 0;
        int n5 = 0;
        if (c == null) {
            c = new StackTraceElement[0];
        }
        final e d2 = d.d;
        if (n3 >= n2) {
            d = d2;
            while (true) {
                n4 = n5;
                if (d == null) {
                    break;
                }
                d = d.d;
                ++n5;
            }
        }
        final B.e.d.a.b.c.a d3 = B.e.d.a.b.c.a().f(b).e(a).c(J3.C.a(this.r(c, n))).d(n4);
        if (d2 != null && n4 == 0) {
            d3.b(this.n(d2, n, n2, n3 + 1));
        }
        return d3.a();
    }
    
    public final B.e.d.a.b o(final B.a a) {
        return B.e.d.a.b.a().b(a).e(this.w()).c(this.i()).a();
    }
    
    public final B.e.d.a.b p(final e e, final Thread thread, final int n, final int n2, final boolean b) {
        return B.e.d.a.b.a().f(this.z(e, thread, n, b)).d(this.m(e, n, n2)).e(this.w()).c(this.i()).a();
    }
    
    public final B.e.d.a.b.e.b q(final StackTraceElement stackTraceElement, final B.e.d.a.b.e.b.a a) {
        final boolean nativeMethod = stackTraceElement.isNativeMethod();
        final long n = 0L;
        long max;
        if (nativeMethod) {
            max = Math.max(stackTraceElement.getLineNumber(), 0L);
        }
        else {
            max = 0L;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        final String string = sb.toString();
        final String fileName = stackTraceElement.getFileName();
        long n2 = n;
        if (!stackTraceElement.isNativeMethod()) {
            n2 = n;
            if (stackTraceElement.getLineNumber() > 0) {
                n2 = stackTraceElement.getLineNumber();
            }
        }
        return a.e(max).f(string).b(fileName).d(n2).a();
    }
    
    public final J3.C r(final StackTraceElement[] array, final int n) {
        final ArrayList<B.e.d.a.b.e.b> list = new ArrayList<B.e.d.a.b.e.b>();
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(this.q(array[i], B.e.d.a.b.e.b.a().c(n)));
        }
        return J3.C.a(list);
    }
    
    public final B.e.a s() {
        return B.e.a.a().e(this.b.f()).g(this.c.f).d(this.c.g).f(this.b.a().c()).b(this.c.h.d()).c(this.c.h.e()).a();
    }
    
    public final B.e t(final String s, final long n) {
        return B.e.a().m(n).j(s).h(u.g).b(this.s()).l(this.v()).e(this.u()).i(3).a();
    }
    
    public final B.e.c u() {
        final StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return B.e.c.a().b(g()).f(Build.MODEL).c(Runtime.getRuntime().availableProcessors()).h(H3.i.b(this.a)).d(statFs.getBlockCount() * (long)statFs.getBlockSize()).i(H3.i.x()).j(H3.i.m()).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }
    
    public final B.e.e v() {
        return B.e.e.a().d(3).e(Build$VERSION.RELEASE).b(Build$VERSION.CODENAME).c(H3.i.y()).a();
    }
    
    public final B.e.d.a.b.d w() {
        return B.e.d.a.b.d.a().d("0").c("0").b(0L).a();
    }
    
    public final B.e.d.a.b.e x(final Thread thread, final StackTraceElement[] array) {
        return this.y(thread, array, 0);
    }
    
    public final B.e.d.a.b.e y(final Thread thread, final StackTraceElement[] array, final int n) {
        return B.e.d.a.b.e.a().d(thread.getName()).c(n).b(J3.C.a(this.r(array, n))).a();
    }
    
    public final J3.C z(final e e, final Thread obj, final int n, final boolean b) {
        final ArrayList<B.e.d.a.b.e> list = new ArrayList<B.e.d.a.b.e>();
        list.add(this.y(obj, e.c, n));
        if (b) {
            for (final Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                final Thread thread = entry.getKey();
                if (!thread.equals(obj)) {
                    list.add(this.x(thread, this.d.a(entry.getValue())));
                }
            }
        }
        return J3.C.a(list);
    }
}
