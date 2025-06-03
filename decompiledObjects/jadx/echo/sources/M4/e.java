package M4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class e implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3537a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f3538b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f3539c;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(e.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public e(View view, Runnable runnable) {
        this.f3538b = new AtomicReference(view);
        this.f3539c = runnable;
    }

    public static boolean b(View view) {
        return view.getViewTreeObserver().isAlive() && c(view);
    }

    public static boolean c(View view) {
        return view.isAttachedToWindow();
    }

    public static void e(View view, Runnable runnable) {
        e eVar = new e(view, runnable);
        if (Build.VERSION.SDK_INT >= 26 || b(view)) {
            view.getViewTreeObserver().addOnDrawListener(eVar);
        } else {
            view.addOnAttachStateChangeListener(eVar.new a());
        }
    }

    public final /* synthetic */ void d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View view = (View) this.f3538b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: M4.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e.this.d(view);
            }
        });
        this.f3537a.postAtFrontOfQueue(this.f3539c);
    }
}
