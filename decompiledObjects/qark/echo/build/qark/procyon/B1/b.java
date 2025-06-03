// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B1;

import android.os.BaseBundle;
import android.widget.AdapterView$OnItemClickListener;
import C1.f;
import java.lang.ref.WeakReference;
import android.view.View$OnClickListener;
import y1.p;
import x1.B;
import android.widget.AdapterView;
import kotlin.jvm.internal.Intrinsics;
import android.view.View;
import C1.a;
import android.os.Bundle;

public final class b
{
    public static final b a;
    
    static {
        a = new b();
    }
    
    public static final a b(final C1.a a, final View view, final View view2) {
        if (T1.a.d(b.class)) {
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
            T1.a.b(t, b.class);
            return null;
        }
    }
    
    public static final b c(final C1.a a, final View view, final AdapterView adapterView) {
        if (T1.a.d(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(a, "mapping");
            Intrinsics.checkNotNullParameter(view, "rootView");
            Intrinsics.checkNotNullParameter(adapterView, "hostView");
            return new b(a, view, adapterView);
        }
        finally {
            final Throwable t;
            T1.a.b(t, b.class);
            return null;
        }
    }
    
    public static final void d(final C1.a a, final View view, final View view2) {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(a, "mapping");
            Intrinsics.checkNotNullParameter(view, "rootView");
            Intrinsics.checkNotNullParameter(view2, "hostView");
            final String b = a.b();
            final Bundle b2 = g.f.b(a, view, view2);
            B1.b.a.f(b2);
            B.t().execute(new B1.a(b, b2));
        }
        finally {
            final Throwable t;
            T1.a.b(t, b.class);
        }
    }
    
    public static final void e(final String s, final Bundle bundle) {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(s, "$eventName");
            Intrinsics.checkNotNullParameter(bundle, "$parameters");
            p.b.h(B.l()).f(s, bundle);
        }
        finally {
            final Throwable t;
            T1.a.b(t, b.class);
        }
    }
    
    public final void f(final Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(bundle, "parameters");
                final String string = ((BaseBundle)bundle).getString("_valueToSum");
                if (string != null) {
                    ((BaseBundle)bundle).putDouble("_valueToSum", G1.g.g(string));
                }
                ((BaseBundle)bundle).putString("_is_fb_codeless", "1");
                return;
                final Throwable t;
                T1.a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final class a implements View$OnClickListener
    {
        public C1.a o;
        public WeakReference p;
        public WeakReference q;
        public View$OnClickListener r;
        public boolean s;
        
        public a(final C1.a o, final View referent, final View referent2) {
            Intrinsics.checkNotNullParameter(o, "mapping");
            Intrinsics.checkNotNullParameter(referent, "rootView");
            Intrinsics.checkNotNullParameter(referent2, "hostView");
            this.o = o;
            this.p = new WeakReference((T)referent2);
            this.q = new WeakReference((T)referent);
            this.r = f.g(referent2);
            this.s = true;
        }
        
        public final boolean a() {
            return this.s;
        }
        
        public void onClick(View view) {
            if (T1.a.d(this)) {
                return;
            }
            Label_0082: {
                try {
                    Intrinsics.checkNotNullParameter(view, "view");
                    final View$OnClickListener r = this.r;
                    if (r != null) {
                        r.onClick(view);
                    }
                    view = (View)this.q.get();
                    final View view2 = (View)this.p.get();
                    if (view != null && view2 != null) {
                        final b a = b.a;
                        b.d(this.o, view, view2);
                        return;
                    }
                }
                finally {
                    break Label_0082;
                }
                return;
            }
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public static final class b implements AdapterView$OnItemClickListener
    {
        public C1.a o;
        public WeakReference p;
        public WeakReference q;
        public AdapterView$OnItemClickListener r;
        public boolean s;
        
        public b(final C1.a o, final View referent, final AdapterView referent2) {
            Intrinsics.checkNotNullParameter(o, "mapping");
            Intrinsics.checkNotNullParameter(referent, "rootView");
            Intrinsics.checkNotNullParameter(referent2, "hostView");
            this.o = o;
            this.p = new WeakReference((T)referent2);
            this.q = new WeakReference((T)referent);
            this.r = referent2.getOnItemClickListener();
            this.s = true;
        }
        
        public final boolean a() {
            return this.s;
        }
        
        public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
            Intrinsics.checkNotNullParameter(view, "view");
            final AdapterView$OnItemClickListener r = this.r;
            if (r != null) {
                r.onItemClick(adapterView, view, n, n2);
            }
            final View view2 = (View)this.q.get();
            final AdapterView adapterView2 = (AdapterView)this.p.get();
            if (view2 != null && adapterView2 != null) {
                final B1.b a = B1.b.a;
                B1.b.d(this.o, view2, (View)adapterView2);
            }
        }
    }
}
