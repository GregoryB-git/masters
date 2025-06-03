// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B1;

import android.view.MotionEvent;
import C1.f;
import java.lang.ref.WeakReference;
import android.view.View$OnTouchListener;
import kotlin.jvm.internal.Intrinsics;
import android.view.View;
import C1.a;

public final class h
{
    public static final h a;
    
    static {
        a = new h();
    }
    
    public static final a a(final C1.a a, final View view, final View view2) {
        if (T1.a.d(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(a, "mapping");
            Intrinsics.checkNotNullParameter(view, "rootView");
            Intrinsics.checkNotNullParameter(view2, "hostView");
            return new a(a, view, view2);
        }
        finally {
            final Throwable t;
            T1.a.b(t, h.class);
            return null;
        }
    }
    
    public static final class a implements View$OnTouchListener
    {
        public final C1.a o;
        public final WeakReference p;
        public final WeakReference q;
        public final View$OnTouchListener r;
        public boolean s;
        
        public a(final C1.a o, final View referent, final View referent2) {
            Intrinsics.checkNotNullParameter(o, "mapping");
            Intrinsics.checkNotNullParameter(referent, "rootView");
            Intrinsics.checkNotNullParameter(referent2, "hostView");
            this.o = o;
            this.p = new WeakReference((T)referent2);
            this.q = new WeakReference((T)referent);
            this.r = f.h(referent2);
            this.s = true;
        }
        
        public final boolean a() {
            return this.s;
        }
        
        public boolean onTouch(final View view, final MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            final View view2 = (View)this.q.get();
            final View view3 = (View)this.p.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                final b a = b.a;
                b.d(this.o, view2, view3);
            }
            final View$OnTouchListener r = this.r;
            return r != null && r.onTouch(view, motionEvent);
        }
    }
}
