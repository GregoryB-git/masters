/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 */
package B1;

import B1.g;
import C1.f;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import y1.p;

public final class b {
    public static final b a = new b();

    public static /* synthetic */ void a(String string2, Bundle bundle) {
        b.e(string2, bundle);
    }

    public static final a b(C1.a object, View view, View view2) {
        if (T1.a.d(b.class)) {
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
            T1.a.b(throwable, b.class);
            return null;
        }
    }

    public static final b c(C1.a object, View view, AdapterView adapterView) {
        if (T1.a.d(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(object, "mapping");
            Intrinsics.checkNotNullParameter((Object)view, "rootView");
            Intrinsics.checkNotNullParameter((Object)adapterView, "hostView");
            object = new b((C1.a)object, view, adapterView);
            return object;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, b.class);
            return null;
        }
    }

    public static final void d(C1.a a8, View view, View view2) {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(a8, "mapping");
            Intrinsics.checkNotNullParameter((Object)view, "rootView");
            Intrinsics.checkNotNullParameter((Object)view2, "hostView");
            String string2 = a8.b();
            a8 = g.f.b(a8, view, view2);
            a.f((Bundle)a8);
            B.t().execute((Runnable)new B1.a(string2, (Bundle)a8));
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, b.class);
            return;
        }
    }

    public static final void e(String string2, Bundle bundle) {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "$eventName");
            Intrinsics.checkNotNullParameter((Object)bundle, "$parameters");
            Context context = B.l();
            p.b.h(context).f(string2, bundle);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, b.class);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)bundle, "parameters");
            String string2 = bundle.getString("_valueToSum");
            if (string2 != null) {
                bundle.putDouble("_valueToSum", G1.g.g(string2));
            }
            bundle.putString("_is_fb_codeless", "1");
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    public static final class a
    implements View.OnClickListener {
        public C1.a o;
        public WeakReference p;
        public WeakReference q;
        public View.OnClickListener r;
        public boolean s;

        public a(C1.a a8, View view, View view2) {
            Intrinsics.checkNotNullParameter(a8, "mapping");
            Intrinsics.checkNotNullParameter((Object)view, "rootView");
            Intrinsics.checkNotNullParameter((Object)view2, "hostView");
            this.o = a8;
            this.p = new WeakReference((Object)view2);
            this.q = new WeakReference((Object)view);
            this.r = f.g(view2);
            this.s = true;
        }

        public final boolean a() {
            return this.s;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onClick(View view) {
            if (T1.a.d(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter((Object)view, "view");
                View.OnClickListener onClickListener = this.r;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                view = (View)this.q.get();
                onClickListener = (View)this.p.get();
                if (view == null) return;
                if (onClickListener == null) return;
                b b8 = b.a;
                b.d(this.o, view, (View)onClickListener);
                return;
            }
            catch (Throwable throwable) {}
            T1.a.b(throwable, this);
        }
    }

    public static final class b
    implements AdapterView.OnItemClickListener {
        public C1.a o;
        public WeakReference p;
        public WeakReference q;
        public AdapterView.OnItemClickListener r;
        public boolean s;

        public b(C1.a a8, View view, AdapterView adapterView) {
            Intrinsics.checkNotNullParameter(a8, "mapping");
            Intrinsics.checkNotNullParameter((Object)view, "rootView");
            Intrinsics.checkNotNullParameter((Object)adapterView, "hostView");
            this.o = a8;
            this.p = new WeakReference((Object)adapterView);
            this.q = new WeakReference((Object)view);
            this.r = adapterView.getOnItemClickListener();
            this.s = true;
        }

        public final boolean a() {
            return this.s;
        }

        public void onItemClick(AdapterView adapterView, View view, int n8, long l8) {
            Intrinsics.checkNotNullParameter((Object)view, "view");
            Object object = this.r;
            if (object != null) {
                object.onItemClick(adapterView, view, n8, l8);
            }
            adapterView = (View)this.q.get();
            view = (AdapterView)this.p.get();
            if (adapterView != null && view != null) {
                object = b.a;
                b.d(this.o, (View)adapterView, view);
            }
        }
    }

}

