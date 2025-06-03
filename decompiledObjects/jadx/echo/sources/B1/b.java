package B1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;
import y1.C2259p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f671a = new b();

    public static final class a implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        public C1.a f672o;

        /* renamed from: p, reason: collision with root package name */
        public WeakReference f673p;

        /* renamed from: q, reason: collision with root package name */
        public WeakReference f674q;

        /* renamed from: r, reason: collision with root package name */
        public View.OnClickListener f675r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f676s;

        public a(C1.a mapping, View rootView, View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f672o = mapping;
            this.f673p = new WeakReference(hostView);
            this.f674q = new WeakReference(rootView);
            this.f675r = C1.f.g(hostView);
            this.f676s = true;
        }

        public final boolean a() {
            return this.f676s;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (T1.a.d(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(view, "view");
                View.OnClickListener onClickListener = this.f675r;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = (View) this.f674q.get();
                View view3 = (View) this.f673p.get();
                if (view2 == null || view3 == null) {
                    return;
                }
                b bVar = b.f671a;
                b.d(this.f672o, view2, view3);
            } catch (Throwable th) {
                T1.a.b(th, this);
            }
        }
    }

    /* renamed from: B1.b$b, reason: collision with other inner class name */
    public static final class C0009b implements AdapterView.OnItemClickListener {

        /* renamed from: o, reason: collision with root package name */
        public C1.a f677o;

        /* renamed from: p, reason: collision with root package name */
        public WeakReference f678p;

        /* renamed from: q, reason: collision with root package name */
        public WeakReference f679q;

        /* renamed from: r, reason: collision with root package name */
        public AdapterView.OnItemClickListener f680r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f681s;

        public C0009b(C1.a mapping, View rootView, AdapterView hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f677o = mapping;
            this.f678p = new WeakReference(hostView);
            this.f679q = new WeakReference(rootView);
            this.f680r = hostView.getOnItemClickListener();
            this.f681s = true;
        }

        public final boolean a() {
            return this.f681s;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
            Intrinsics.checkNotNullParameter(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f680r;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i7, j7);
            }
            View view2 = (View) this.f679q.get();
            AdapterView adapterView2 = (AdapterView) this.f678p.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            b bVar = b.f671a;
            b.d(this.f677o, view2, adapterView2);
        }
    }

    public static final a b(C1.a mapping, View rootView, View hostView) {
        if (T1.a.d(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th) {
            T1.a.b(th, b.class);
            return null;
        }
    }

    public static final C0009b c(C1.a mapping, View rootView, AdapterView hostView) {
        if (T1.a.d(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new C0009b(mapping, rootView, hostView);
        } catch (Throwable th) {
            T1.a.b(th, b.class);
            return null;
        }
    }

    public static final void d(C1.a mapping, View rootView, View hostView) {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            final String b7 = mapping.b();
            final Bundle b8 = g.f694f.b(mapping, rootView, hostView);
            f671a.f(b8);
            C2146B.t().execute(new Runnable() { // from class: B1.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.e(b7, b8);
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, b.class);
        }
    }

    public static final void e(String eventName, Bundle parameters) {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "$eventName");
            Intrinsics.checkNotNullParameter(parameters, "$parameters");
            C2259p.f21393b.h(C2146B.l()).f(eventName, parameters);
        } catch (Throwable th) {
            T1.a.b(th, b.class);
        }
    }

    public final void f(Bundle parameters) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                parameters.putDouble("_valueToSum", G1.g.g(string));
            }
            parameters.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
