/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 */
package B1;

import B1.b;
import C1.f;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class h {
    public static final h a = new h();

    public static final a a(C1.a object, View view, View view2) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(object, "mapping");
            Intrinsics.checkNotNullParameter((Object)view, "rootView");
            Intrinsics.checkNotNullParameter((Object)view2, "hostView");
            object = new a((C1.a)object, view, view2);
            return object;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, h.class);
            return null;
        }
    }

    public static final class a
    implements View.OnTouchListener {
        public final C1.a o;
        public final WeakReference p;
        public final WeakReference q;
        public final View.OnTouchListener r;
        public boolean s;

        public a(C1.a a8, View view, View view2) {
            Intrinsics.checkNotNullParameter(a8, "mapping");
            Intrinsics.checkNotNullParameter((Object)view, "rootView");
            Intrinsics.checkNotNullParameter((Object)view2, "hostView");
            this.o = a8;
            this.p = new WeakReference((Object)view2);
            this.q = new WeakReference((Object)view);
            this.r = f.h(view2);
            this.s = true;
        }

        public final boolean a() {
            return this.s;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter((Object)view, "view");
            Intrinsics.checkNotNullParameter((Object)motionEvent, "motionEvent");
            View view2 = (View)this.q.get();
            View view3 = (View)this.p.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                b b8 = b.a;
                b.d(this.o, view2, view3);
            }
            if ((view2 = this.r) != null && view2.onTouch(view, motionEvent)) {
                return true;
            }
            return false;
        }
    }

}

