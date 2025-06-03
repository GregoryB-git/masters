package B1;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f710a = new h();

    public static final class a implements View.OnTouchListener {

        /* renamed from: o, reason: collision with root package name */
        public final C1.a f711o;

        /* renamed from: p, reason: collision with root package name */
        public final WeakReference f712p;

        /* renamed from: q, reason: collision with root package name */
        public final WeakReference f713q;

        /* renamed from: r, reason: collision with root package name */
        public final View.OnTouchListener f714r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f715s;

        public a(C1.a mapping, View rootView, View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f711o = mapping;
            this.f712p = new WeakReference(hostView);
            this.f713q = new WeakReference(rootView);
            this.f714r = C1.f.h(hostView);
            this.f715s = true;
        }

        public final boolean a() {
            return this.f715s;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            View view2 = (View) this.f713q.get();
            View view3 = (View) this.f712p.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                b bVar = b.f671a;
                b.d(this.f711o, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f714r;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    public static final a a(C1.a mapping, View rootView, View hostView) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th) {
            T1.a.b(th, h.class);
            return null;
        }
    }
}
