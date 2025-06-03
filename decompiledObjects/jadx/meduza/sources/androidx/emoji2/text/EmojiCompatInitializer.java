package androidx.emoji2.text;

import a0.n;
import android.content.Context;
import android.os.Trace;
import androidx.emoji2.text.d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import b1.k;
import b1.o;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements w1.b<Boolean> {

    public static class a extends d.c {
        public a(Context context) {
            super(new b(context));
            this.f990b = 1;
        }
    }

    public static class b implements d.g {

        /* renamed from: a, reason: collision with root package name */
        public final Context f973a;

        public b(Context context) {
            this.f973a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.d.g
        public final void a(d.h hVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new t0.a("EmojiCompatInitializer", 0));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new t0.d(this, hVar, threadPoolExecutor, 0));
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i10 = n.f13a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (d.f978j != null) {
                    d.a().c();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i11 = n.f13a;
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // w1.b
    public final List<Class<? extends w1.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // w1.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean b(Context context) {
        Object obj;
        a aVar = new a(context);
        if (d.f978j == null) {
            synchronized (d.f977i) {
                if (d.f978j == null) {
                    d.f978j = new d(aVar);
                }
            }
        }
        w1.a c10 = w1.a.c(context);
        c10.getClass();
        synchronized (w1.a.f16185e) {
            try {
                obj = c10.f16186a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c10.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        k lifecycle = ((o) obj).getLifecycle();
        lifecycle.a(new t0.c(this, lifecycle));
        return Boolean.TRUE;
    }
}
