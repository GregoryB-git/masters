package androidx.fragment.app;

import I.AbstractC0421s;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.B;
import androidx.lifecycle.d;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final m f9539a;

    /* renamed from: b, reason: collision with root package name */
    public final u f9540b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f9541c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9542d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f9543e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ View f9544o;

        public a(View view) {
            this.f9544o = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f9544o.removeOnAttachStateChangeListener(this);
            AbstractC0421s.A(this.f9544o);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9546a;

        static {
            int[] iArr = new int[d.c.values().length];
            f9546a = iArr;
            try {
                iArr[d.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9546a[d.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9546a[d.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9546a[d.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public t(m mVar, u uVar, Fragment fragment) {
        this.f9539a = mVar;
        this.f9540b = uVar;
        this.f9541c = fragment;
    }

    public void a() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f9541c);
        }
        Fragment fragment = this.f9541c;
        fragment.N0(fragment.f9276p);
        m mVar = this.f9539a;
        Fragment fragment2 = this.f9541c;
        mVar.a(fragment2, fragment2.f9276p, false);
    }

    public void b() {
        int j7 = this.f9540b.j(this.f9541c);
        Fragment fragment = this.f9541c;
        fragment.f9256U.addView(fragment.f9257V, j7);
    }

    public void c() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f9541c);
        }
        Fragment fragment = this.f9541c;
        Fragment fragment2 = fragment.f9282v;
        t tVar = null;
        if (fragment2 != null) {
            t m7 = this.f9540b.m(fragment2.f9280t);
            if (m7 == null) {
                throw new IllegalStateException("Fragment " + this.f9541c + " declared target fragment " + this.f9541c.f9282v + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f9541c;
            fragment3.f9283w = fragment3.f9282v.f9280t;
            fragment3.f9282v = null;
            tVar = m7;
        } else {
            String str = fragment.f9283w;
            if (str != null && (tVar = this.f9540b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f9541c + " declared target fragment " + this.f9541c.f9283w + " that does not belong to this FragmentManager!");
            }
        }
        if (tVar != null && (n.f9446P || tVar.k().f9275o < 1)) {
            tVar.m();
        }
        Fragment fragment4 = this.f9541c;
        fragment4.f9243H = fragment4.f9242G.s0();
        Fragment fragment5 = this.f9541c;
        fragment5.f9245J = fragment5.f9242G.v0();
        this.f9539a.g(this.f9541c, false);
        this.f9541c.O0();
        this.f9539a.b(this.f9541c, false);
    }

    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f9541c;
        if (fragment2.f9242G == null) {
            return fragment2.f9275o;
        }
        int i7 = this.f9543e;
        int i8 = b.f9546a[fragment2.f9267f0.ordinal()];
        if (i8 != 1) {
            i7 = i8 != 2 ? i8 != 3 ? i8 != 4 ? Math.min(i7, -1) : Math.min(i7, 0) : Math.min(i7, 1) : Math.min(i7, 5);
        }
        Fragment fragment3 = this.f9541c;
        if (fragment3.f9237B) {
            if (fragment3.f9238C) {
                i7 = Math.max(this.f9543e, 2);
                View view = this.f9541c.f9257V;
                if (view != null && view.getParent() == null) {
                    i7 = Math.min(i7, 2);
                }
            } else {
                i7 = this.f9543e < 4 ? Math.min(i7, fragment3.f9275o) : Math.min(i7, 1);
            }
        }
        if (!this.f9541c.f9286z) {
            i7 = Math.min(i7, 1);
        }
        B.e.b l7 = (!n.f9446P || (viewGroup = (fragment = this.f9541c).f9256U) == null) ? null : B.n(viewGroup, fragment.F()).l(this);
        if (l7 == B.e.b.ADDING) {
            i7 = Math.min(i7, 6);
        } else if (l7 == B.e.b.REMOVING) {
            i7 = Math.max(i7, 3);
        } else {
            Fragment fragment4 = this.f9541c;
            if (fragment4.f9236A) {
                i7 = fragment4.Y() ? Math.min(i7, 1) : Math.min(i7, -1);
            }
        }
        Fragment fragment5 = this.f9541c;
        if (fragment5.f9258W && fragment5.f9275o < 5) {
            i7 = Math.min(i7, 4);
        }
        if (n.D0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i7 + " for " + this.f9541c);
        }
        return i7;
    }

    public void e() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f9541c);
        }
        Fragment fragment = this.f9541c;
        if (fragment.f9266e0) {
            fragment.r1(fragment.f9276p);
            this.f9541c.f9275o = 1;
            return;
        }
        this.f9539a.h(fragment, fragment.f9276p, false);
        Fragment fragment2 = this.f9541c;
        fragment2.R0(fragment2.f9276p);
        m mVar = this.f9539a;
        Fragment fragment3 = this.f9541c;
        mVar.c(fragment3, fragment3.f9276p, false);
    }

    public void f() {
        String str;
        if (this.f9541c.f9237B) {
            return;
        }
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f9541c);
        }
        Fragment fragment = this.f9541c;
        LayoutInflater X02 = fragment.X0(fragment.f9276p);
        Fragment fragment2 = this.f9541c;
        ViewGroup viewGroup = fragment2.f9256U;
        if (viewGroup == null) {
            int i7 = fragment2.f9247L;
            if (i7 == 0) {
                viewGroup = null;
            } else {
                if (i7 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f9541c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.f9242G.n0().e(this.f9541c.f9247L);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f9541c;
                    if (!fragment3.f9239D) {
                        try {
                            str = fragment3.I().getResourceName(this.f9541c.f9247L);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f9541c.f9247L) + " (" + str + ") for fragment " + this.f9541c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f9541c;
        fragment4.f9256U = viewGroup;
        fragment4.T0(X02, viewGroup, fragment4.f9276p);
        View view = this.f9541c.f9257V;
        if (view != null) {
            boolean z7 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f9541c;
            fragment5.f9257V.setTag(U.b.f6288a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f9541c;
            if (fragment6.f9249N) {
                fragment6.f9257V.setVisibility(8);
            }
            if (AbstractC0421s.t(this.f9541c.f9257V)) {
                AbstractC0421s.A(this.f9541c.f9257V);
            } else {
                View view2 = this.f9541c.f9257V;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f9541c.k1();
            m mVar = this.f9539a;
            Fragment fragment7 = this.f9541c;
            mVar.m(fragment7, fragment7.f9257V, fragment7.f9276p, false);
            int visibility = this.f9541c.f9257V.getVisibility();
            float alpha = this.f9541c.f9257V.getAlpha();
            if (n.f9446P) {
                this.f9541c.C1(alpha);
                Fragment fragment8 = this.f9541c;
                if (fragment8.f9256U != null && visibility == 0) {
                    View findFocus = fragment8.f9257V.findFocus();
                    if (findFocus != null) {
                        this.f9541c.x1(findFocus);
                        if (n.D0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f9541c);
                        }
                    }
                    this.f9541c.f9257V.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f9541c;
                if (visibility == 0 && fragment9.f9256U != null) {
                    z7 = true;
                }
                fragment9.f9262a0 = z7;
            }
        }
        this.f9541c.f9275o = 2;
    }

    public void g() {
        Fragment f7;
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f9541c);
        }
        Fragment fragment = this.f9541c;
        boolean z7 = true;
        boolean z8 = fragment.f9236A && !fragment.Y();
        if (!z8 && !this.f9540b.o().o(this.f9541c)) {
            String str = this.f9541c.f9283w;
            if (str != null && (f7 = this.f9540b.f(str)) != null && f7.f9251P) {
                this.f9541c.f9282v = f7;
            }
            this.f9541c.f9275o = 0;
            return;
        }
        k kVar = this.f9541c.f9243H;
        if (kVar instanceof androidx.lifecycle.u) {
            z7 = this.f9540b.o().l();
        } else if (kVar.i() instanceof Activity) {
            z7 = true ^ ((Activity) kVar.i()).isChangingConfigurations();
        }
        if (z8 || z7) {
            this.f9540b.o().f(this.f9541c);
        }
        this.f9541c.U0();
        this.f9539a.d(this.f9541c, false);
        for (t tVar : this.f9540b.k()) {
            if (tVar != null) {
                Fragment k7 = tVar.k();
                if (this.f9541c.f9280t.equals(k7.f9283w)) {
                    k7.f9282v = this.f9541c;
                    k7.f9283w = null;
                }
            }
        }
        Fragment fragment2 = this.f9541c;
        String str2 = fragment2.f9283w;
        if (str2 != null) {
            fragment2.f9282v = this.f9540b.f(str2);
        }
        this.f9540b.q(this);
    }

    public void h() {
        View view;
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f9541c);
        }
        Fragment fragment = this.f9541c;
        ViewGroup viewGroup = fragment.f9256U;
        if (viewGroup != null && (view = fragment.f9257V) != null) {
            viewGroup.removeView(view);
        }
        this.f9541c.V0();
        this.f9539a.n(this.f9541c, false);
        Fragment fragment2 = this.f9541c;
        fragment2.f9256U = null;
        fragment2.f9257V = null;
        fragment2.f9269h0 = null;
        fragment2.f9270i0.j(null);
        this.f9541c.f9238C = false;
    }

    public void i() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f9541c);
        }
        this.f9541c.W0();
        this.f9539a.e(this.f9541c, false);
        Fragment fragment = this.f9541c;
        fragment.f9275o = -1;
        fragment.f9243H = null;
        fragment.f9245J = null;
        fragment.f9242G = null;
        if ((!fragment.f9236A || fragment.Y()) && !this.f9540b.o().o(this.f9541c)) {
            return;
        }
        if (n.D0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f9541c);
        }
        this.f9541c.U();
    }

    public void j() {
        Fragment fragment = this.f9541c;
        if (fragment.f9237B && fragment.f9238C && !fragment.f9240E) {
            if (n.D0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f9541c);
            }
            Fragment fragment2 = this.f9541c;
            fragment2.T0(fragment2.X0(fragment2.f9276p), null, this.f9541c.f9276p);
            View view = this.f9541c.f9257V;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f9541c;
                fragment3.f9257V.setTag(U.b.f6288a, fragment3);
                Fragment fragment4 = this.f9541c;
                if (fragment4.f9249N) {
                    fragment4.f9257V.setVisibility(8);
                }
                this.f9541c.k1();
                m mVar = this.f9539a;
                Fragment fragment5 = this.f9541c;
                mVar.m(fragment5, fragment5.f9257V, fragment5.f9276p, false);
                this.f9541c.f9275o = 2;
            }
        }
    }

    public Fragment k() {
        return this.f9541c;
    }

    public final boolean l(View view) {
        if (view == this.f9541c.f9257V) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f9541c.f9257V) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f9542d) {
            if (n.D0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f9542d = true;
            while (true) {
                int d7 = d();
                Fragment fragment = this.f9541c;
                int i7 = fragment.f9275o;
                if (d7 == i7) {
                    if (n.f9446P && fragment.f9263b0) {
                        if (fragment.f9257V != null && (viewGroup = fragment.f9256U) != null) {
                            B n7 = B.n(viewGroup, fragment.F());
                            if (this.f9541c.f9249N) {
                                n7.c(this);
                            } else {
                                n7.e(this);
                            }
                        }
                        Fragment fragment2 = this.f9541c;
                        fragment2.f9263b0 = false;
                        fragment2.w0(fragment2.f9249N);
                    }
                    this.f9542d = false;
                    return;
                }
                if (d7 <= i7) {
                    switch (i7 - 1) {
                        case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                            i();
                            break;
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            g();
                            break;
                        case 1:
                            h();
                            this.f9541c.f9275o = 1;
                            break;
                        case 2:
                            fragment.f9238C = false;
                            fragment.f9275o = 2;
                            break;
                        case 3:
                            if (n.D0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f9541c);
                            }
                            Fragment fragment3 = this.f9541c;
                            if (fragment3.f9257V != null && fragment3.f9277q == null) {
                                s();
                            }
                            Fragment fragment4 = this.f9541c;
                            if (fragment4.f9257V != null && (viewGroup3 = fragment4.f9256U) != null) {
                                B.n(viewGroup3, fragment4.F()).d(this);
                            }
                            this.f9541c.f9275o = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.f9275o = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i7 + 1) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.f9257V != null && (viewGroup2 = fragment.f9256U) != null) {
                                B.n(viewGroup2, fragment.F()).b(B.e.c.e(this.f9541c.f9257V.getVisibility()), this);
                            }
                            this.f9541c.f9275o = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.f9275o = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            this.f9542d = false;
            throw th;
        }
    }

    public void n() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f9541c);
        }
        this.f9541c.c1();
        this.f9539a.f(this.f9541c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f9541c.f9276p;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f9541c;
        fragment.f9277q = fragment.f9276p.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f9541c;
        fragment2.f9278r = fragment2.f9276p.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f9541c;
        fragment3.f9283w = fragment3.f9276p.getString("android:target_state");
        Fragment fragment4 = this.f9541c;
        if (fragment4.f9283w != null) {
            fragment4.f9284x = fragment4.f9276p.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f9541c;
        Boolean bool = fragment5.f9279s;
        if (bool != null) {
            fragment5.f9259X = bool.booleanValue();
            this.f9541c.f9279s = null;
        } else {
            fragment5.f9259X = fragment5.f9276p.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f9541c;
        if (fragment6.f9259X) {
            return;
        }
        fragment6.f9258W = true;
    }

    public void p() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f9541c);
        }
        View y7 = this.f9541c.y();
        if (y7 != null && l(y7)) {
            boolean requestFocus = y7.requestFocus();
            if (n.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(y7);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f9541c);
                sb.append(" resulting in focused view ");
                sb.append(this.f9541c.f9257V.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f9541c.x1(null);
        this.f9541c.g1();
        this.f9539a.i(this.f9541c, false);
        Fragment fragment = this.f9541c;
        fragment.f9276p = null;
        fragment.f9277q = null;
        fragment.f9278r = null;
    }

    public final Bundle q() {
        Bundle bundle = new Bundle();
        this.f9541c.h1(bundle);
        this.f9539a.j(this.f9541c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f9541c.f9257V != null) {
            s();
        }
        if (this.f9541c.f9277q != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f9541c.f9277q);
        }
        if (this.f9541c.f9278r != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f9541c.f9278r);
        }
        if (!this.f9541c.f9259X) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f9541c.f9259X);
        }
        return bundle;
    }

    public s r() {
        s sVar = new s(this.f9541c);
        Fragment fragment = this.f9541c;
        if (fragment.f9275o <= -1 || sVar.f9526A != null) {
            sVar.f9526A = fragment.f9276p;
        } else {
            Bundle q7 = q();
            sVar.f9526A = q7;
            if (this.f9541c.f9283w != null) {
                if (q7 == null) {
                    sVar.f9526A = new Bundle();
                }
                sVar.f9526A.putString("android:target_state", this.f9541c.f9283w);
                int i7 = this.f9541c.f9284x;
                if (i7 != 0) {
                    sVar.f9526A.putInt("android:target_req_state", i7);
                }
            }
        }
        return sVar;
    }

    public void s() {
        if (this.f9541c.f9257V == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f9541c.f9257V.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f9541c.f9277q = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f9541c.f9269h0.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f9541c.f9278r = bundle;
    }

    public void t(int i7) {
        this.f9543e = i7;
    }

    public void u() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f9541c);
        }
        this.f9541c.i1();
        this.f9539a.k(this.f9541c, false);
    }

    public void v() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f9541c);
        }
        this.f9541c.j1();
        this.f9539a.l(this.f9541c, false);
    }

    public t(m mVar, u uVar, Fragment fragment, s sVar) {
        this.f9539a = mVar;
        this.f9540b = uVar;
        this.f9541c = fragment;
        fragment.f9277q = null;
        fragment.f9278r = null;
        fragment.f9241F = 0;
        fragment.f9238C = false;
        fragment.f9286z = false;
        Fragment fragment2 = fragment.f9282v;
        fragment.f9283w = fragment2 != null ? fragment2.f9280t : null;
        fragment.f9282v = null;
        Bundle bundle = sVar.f9526A;
        fragment.f9276p = bundle == null ? new Bundle() : bundle;
    }

    public t(m mVar, u uVar, ClassLoader classLoader, j jVar, s sVar) {
        this.f9539a = mVar;
        this.f9540b = uVar;
        Fragment a7 = jVar.a(classLoader, sVar.f9527o);
        this.f9541c = a7;
        Bundle bundle = sVar.f9536x;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a7.w1(sVar.f9536x);
        a7.f9280t = sVar.f9528p;
        a7.f9237B = sVar.f9529q;
        a7.f9239D = true;
        a7.f9246K = sVar.f9530r;
        a7.f9247L = sVar.f9531s;
        a7.f9248M = sVar.f9532t;
        a7.f9251P = sVar.f9533u;
        a7.f9236A = sVar.f9534v;
        a7.f9250O = sVar.f9535w;
        a7.f9249N = sVar.f9537y;
        a7.f9267f0 = d.c.values()[sVar.f9538z];
        Bundle bundle2 = sVar.f9526A;
        a7.f9276p = bundle2 == null ? new Bundle() : bundle2;
        if (n.D0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a7);
        }
    }
}
