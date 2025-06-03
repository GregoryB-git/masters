package T1;

import Q1.b;
import Q1.c;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6059a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Set f6060b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c, reason: collision with root package name */
    public static boolean f6061c;

    /* renamed from: T1.a$a, reason: collision with other inner class name */
    public static final class RunnableC0100a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Throwable f6062o;

        public RunnableC0100a(Throwable th) {
            this.f6062o = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException(this.f6062o);
        }
    }

    public static final void a() {
        f6061c = true;
    }

    public static final void b(Throwable th, Object o7) {
        Intrinsics.checkNotNullParameter(o7, "o");
        if (f6061c) {
            f6060b.add(o7);
            if (C2146B.p()) {
                b.c(th);
                c.a aVar = c.a.f4333a;
                c.a.b(th, c.EnumC0081c.CrashShield).g();
            }
            e(th);
        }
    }

    public static final boolean c() {
        return false;
    }

    public static final boolean d(Object o7) {
        Intrinsics.checkNotNullParameter(o7, "o");
        return f6060b.contains(o7);
    }

    public static final void e(Throwable th) {
        if (c()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0100a(th));
        }
    }
}
