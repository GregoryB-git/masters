package K1;

import K1.j;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: r, reason: collision with root package name */
    public static final a f3166r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    public static final Map f3167s = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final WeakReference f3168o;

    /* renamed from: p, reason: collision with root package name */
    public final Handler f3169p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f3170q;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            Map b7 = g.b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b7.get(valueOf);
            if (obj == null) {
                obj = new g(activity, null);
                b7.put(valueOf, obj);
            }
            g.c((g) obj);
        }

        public final void b(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            g gVar = (g) g.b().remove(Integer.valueOf(activity.hashCode()));
            if (gVar == null) {
                return;
            }
            g.d(gVar);
        }
    }

    public g(Activity activity) {
        this.f3168o = new WeakReference(activity);
        this.f3169p = new Handler(Looper.getMainLooper());
        this.f3170q = new AtomicBoolean(false);
    }

    public static final /* synthetic */ Map b() {
        if (T1.a.d(g.class)) {
            return null;
        }
        try {
            return f3167s;
        } catch (Throwable th) {
            T1.a.b(th, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(g gVar) {
        if (T1.a.d(g.class)) {
            return;
        }
        try {
            gVar.g();
        } catch (Throwable th) {
            T1.a.b(th, g.class);
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (T1.a.d(g.class)) {
            return;
        }
        try {
            gVar.h();
        } catch (Throwable th) {
            T1.a.b(th, g.class);
        }
    }

    public static final void f(g this$0) {
        if (T1.a.d(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                G1.g gVar = G1.g.f2041a;
                View e7 = G1.g.e((Activity) this$0.f3168o.get());
                Activity activity = (Activity) this$0.f3168o.get();
                if (e7 != null && activity != null) {
                    for (View view : c.a(e7)) {
                        if (!C1.d.g(view)) {
                            String d7 = c.d(view);
                            if (d7.length() > 0 && d7.length() <= 300) {
                                j.a aVar = j.f3177s;
                                String localClassName = activity.getLocalClassName();
                                Intrinsics.checkNotNullExpressionValue(localClassName, "activity.localClassName");
                                aVar.d(view, e7, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            T1.a.b(th, g.class);
        }
    }

    public final void e() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: K1.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.f(g.this);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f3169p.post(runnable);
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void g() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (this.f3170q.getAndSet(true)) {
                return;
            }
            G1.g gVar = G1.g.f2041a;
            View e7 = G1.g.e((Activity) this.f3168o.get());
            if (e7 == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = e7.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                e();
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void h() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (this.f3170q.getAndSet(false)) {
                G1.g gVar = G1.g.f2041a;
                View e7 = G1.g.e((Activity) this.f3168o.get());
                if (e7 == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = e7.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            e();
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public /* synthetic */ g(Activity activity, kotlin.jvm.internal.g gVar) {
        this(activity);
    }
}
