package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.fragment.app.v;
import androidx.fragment.app.w;
import androidx.lifecycle.d;
import d.AbstractC1161a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import t.C1959b;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: O, reason: collision with root package name */
    public static boolean f9445O = false;

    /* renamed from: P, reason: collision with root package name */
    public static boolean f9446P = true;

    /* renamed from: A, reason: collision with root package name */
    public androidx.activity.result.c f9447A;

    /* renamed from: B, reason: collision with root package name */
    public androidx.activity.result.c f9448B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f9450D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9451E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f9452F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f9453G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f9454H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f9455I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f9456J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f9457K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f9458L;

    /* renamed from: M, reason: collision with root package name */
    public q f9459M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9462b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f9464d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f9465e;

    /* renamed from: g, reason: collision with root package name */
    public OnBackPressedDispatcher f9467g;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f9472l;

    /* renamed from: r, reason: collision with root package name */
    public androidx.fragment.app.k f9478r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.fragment.app.g f9479s;

    /* renamed from: t, reason: collision with root package name */
    public Fragment f9480t;

    /* renamed from: u, reason: collision with root package name */
    public Fragment f9481u;

    /* renamed from: z, reason: collision with root package name */
    public androidx.activity.result.c f9486z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9461a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final u f9463c = new u();

    /* renamed from: f, reason: collision with root package name */
    public final androidx.fragment.app.l f9466f = new androidx.fragment.app.l(this);

    /* renamed from: h, reason: collision with root package name */
    public final androidx.activity.b f9468h = new c(false);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f9469i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f9470j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f9471k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public Map f9473m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public final w.g f9474n = new d();

    /* renamed from: o, reason: collision with root package name */
    public final androidx.fragment.app.m f9475o = new androidx.fragment.app.m(this);

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f9476p = new CopyOnWriteArrayList();

    /* renamed from: q, reason: collision with root package name */
    public int f9477q = -1;

    /* renamed from: v, reason: collision with root package name */
    public androidx.fragment.app.j f9482v = null;

    /* renamed from: w, reason: collision with root package name */
    public androidx.fragment.app.j f9483w = new e();

    /* renamed from: x, reason: collision with root package name */
    public C f9484x = null;

    /* renamed from: y, reason: collision with root package name */
    public C f9485y = new f();

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f9449C = new ArrayDeque();

    /* renamed from: N, reason: collision with root package name */
    public Runnable f9460N = new g();

    public class a implements androidx.activity.result.b {
        public a() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            m mVar = (m) n.this.f9449C.pollFirst();
            if (mVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = mVar.f9501o;
            int i7 = mVar.f9502p;
            Fragment i8 = n.this.f9463c.i(str);
            if (i8 != null) {
                i8.h0(i7, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public class b implements androidx.activity.result.b {
        public b() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
            }
            m mVar = (m) n.this.f9449C.pollFirst();
            if (mVar == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = mVar.f9501o;
                int i8 = mVar.f9502p;
                Fragment i9 = n.this.f9463c.i(str);
                if (i9 != null) {
                    i9.G0(i8, strArr, iArr);
                    return;
                } else {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public class c extends androidx.activity.b {
        public c(boolean z7) {
            super(z7);
        }

        @Override // androidx.activity.b
        public void b() {
            n.this.A0();
        }
    }

    public class d implements w.g {
        public d() {
        }

        @Override // androidx.fragment.app.w.g
        public void a(Fragment fragment, E.c cVar) {
            if (cVar.b()) {
                return;
            }
            n.this.X0(fragment, cVar);
        }

        @Override // androidx.fragment.app.w.g
        public void b(Fragment fragment, E.c cVar) {
            n.this.f(fragment, cVar);
        }
    }

    public class e extends androidx.fragment.app.j {
        public e() {
        }

        @Override // androidx.fragment.app.j
        public Fragment a(ClassLoader classLoader, String str) {
            return n.this.s0().b(n.this.s0().i(), str, null);
        }
    }

    public class f implements C {
        public f() {
        }

        @Override // androidx.fragment.app.C
        public B a(ViewGroup viewGroup) {
            return new C0781c(viewGroup);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.a0(true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f9494a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f9495b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f9496c;

        public h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f9494a = viewGroup;
            this.f9495b = view;
            this.f9496c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9494a.endViewTransition(this.f9495b);
            animator.removeListener(this);
            Fragment fragment = this.f9496c;
            View view = fragment.f9257V;
            if (view == null || !fragment.f9249N) {
                return;
            }
            view.setVisibility(8);
        }
    }

    public class i implements r {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Fragment f9498o;

        public i(Fragment fragment) {
            this.f9498o = fragment;
        }

        @Override // androidx.fragment.app.r
        public void a(n nVar, Fragment fragment) {
            this.f9498o.k0(fragment);
        }
    }

    public class j implements androidx.activity.result.b {
        public j() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            m mVar = (m) n.this.f9449C.pollFirst();
            if (mVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = mVar.f9501o;
            int i7 = mVar.f9502p;
            Fragment i8 = n.this.f9463c.i(str);
            if (i8 != null) {
                i8.h0(i7, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public static class k extends AbstractC1161a {
        @Override // d.AbstractC1161a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, androidx.activity.result.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a7 = eVar.a();
            if (a7 != null && (bundleExtra = a7.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a7.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a7.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new e.b(eVar.d()).b(null).c(eVar.c(), eVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (n.D0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // d.AbstractC1161a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a c(int i7, Intent intent) {
            return new androidx.activity.result.a(i7, intent);
        }
    }

    public static abstract class l {
        public void a(n nVar, Fragment fragment, Bundle bundle) {
        }

        public void b(n nVar, Fragment fragment, Context context) {
        }

        public void c(n nVar, Fragment fragment, Bundle bundle) {
        }

        public void d(n nVar, Fragment fragment) {
        }

        public void e(n nVar, Fragment fragment) {
        }

        public void f(n nVar, Fragment fragment) {
        }

        public void g(n nVar, Fragment fragment, Context context) {
        }

        public void h(n nVar, Fragment fragment, Bundle bundle) {
        }

        public void i(n nVar, Fragment fragment) {
        }

        public void j(n nVar, Fragment fragment, Bundle bundle) {
        }

        public void k(n nVar, Fragment fragment) {
        }

        public void l(n nVar, Fragment fragment) {
        }

        public void m(n nVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void n(n nVar, Fragment fragment) {
        }
    }

    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        public String f9501o;

        /* renamed from: p, reason: collision with root package name */
        public int f9502p;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i7) {
                return new m[i7];
            }
        }

        public m(Parcel parcel) {
            this.f9501o = parcel.readString();
            this.f9502p = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f9501o);
            parcel.writeInt(this.f9502p);
        }

        public m(String str, int i7) {
            this.f9501o = str;
            this.f9502p = i7;
        }
    }

    /* renamed from: androidx.fragment.app.n$n, reason: collision with other inner class name */
    public interface InterfaceC0160n {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    public class o implements InterfaceC0160n {

        /* renamed from: a, reason: collision with root package name */
        public final String f9503a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9504b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9505c;

        public o(String str, int i7, int i8) {
            this.f9503a = str;
            this.f9504b = i7;
            this.f9505c = i8;
        }

        @Override // androidx.fragment.app.n.InterfaceC0160n
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = n.this.f9481u;
            if (fragment == null || this.f9504b >= 0 || this.f9503a != null || !fragment.s().S0()) {
                return n.this.U0(arrayList, arrayList2, this.f9503a, this.f9504b, this.f9505c);
            }
            return false;
        }
    }

    public static class p implements Fragment.k {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f9507a;

        /* renamed from: b, reason: collision with root package name */
        public final C0779a f9508b;

        /* renamed from: c, reason: collision with root package name */
        public int f9509c;

        public p(C0779a c0779a, boolean z7) {
            this.f9507a = z7;
            this.f9508b = c0779a;
        }

        @Override // androidx.fragment.app.Fragment.k
        public void a() {
            int i7 = this.f9509c - 1;
            this.f9509c = i7;
            if (i7 != 0) {
                return;
            }
            this.f9508b.f9324t.f1();
        }

        @Override // androidx.fragment.app.Fragment.k
        public void b() {
            this.f9509c++;
        }

        public void c() {
            C0779a c0779a = this.f9508b;
            c0779a.f9324t.t(c0779a, this.f9507a, false, false);
        }

        public void d() {
            boolean z7 = this.f9509c > 0;
            for (Fragment fragment : this.f9508b.f9324t.r0()) {
                fragment.B1(null);
                if (z7 && fragment.a0()) {
                    fragment.G1();
                }
            }
            C0779a c0779a = this.f9508b;
            c0779a.f9324t.t(c0779a, this.f9507a, !z7, true);
        }

        public boolean e() {
            return this.f9509c == 0;
        }
    }

    public static boolean D0(int i7) {
        return f9445O || Log.isLoggable("FragmentManager", i7);
    }

    public static void c0(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        while (i7 < i8) {
            C0779a c0779a = (C0779a) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                c0779a.m(-1);
                c0779a.r(i7 == i8 + (-1));
            } else {
                c0779a.m(1);
                c0779a.q();
            }
            i7++;
        }
    }

    public static int d1(int i7) {
        if (i7 == 4097) {
            return 8194;
        }
        if (i7 != 4099) {
            return i7 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    public static Fragment y0(View view) {
        Object tag = view.getTag(U.b.f6288a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public void A(Configuration configuration) {
        for (Fragment fragment : this.f9463c.n()) {
            if (fragment != null) {
                fragment.P0(configuration);
            }
        }
    }

    public void A0() {
        a0(true);
        if (this.f9468h.c()) {
            S0();
        } else {
            this.f9467g.c();
        }
    }

    public boolean B(MenuItem menuItem) {
        if (this.f9477q < 1) {
            return false;
        }
        for (Fragment fragment : this.f9463c.n()) {
            if (fragment != null && fragment.Q0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void B0(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f9249N) {
            return;
        }
        fragment.f9249N = true;
        fragment.f9263b0 = true ^ fragment.f9263b0;
        j1(fragment);
    }

    public void C() {
        this.f9451E = false;
        this.f9452F = false;
        this.f9459M.n(false);
        S(1);
    }

    public boolean C0() {
        return this.f9453G;
    }

    public boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.f9477q < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z7 = false;
        for (Fragment fragment : this.f9463c.n()) {
            if (fragment != null && F0(fragment) && fragment.S0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z7 = true;
            }
        }
        if (this.f9465e != null) {
            for (int i7 = 0; i7 < this.f9465e.size(); i7++) {
                Fragment fragment2 = (Fragment) this.f9465e.get(i7);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.s0();
                }
            }
        }
        this.f9465e = arrayList;
        return z7;
    }

    public void E() {
        this.f9453G = true;
        a0(true);
        X();
        S(-1);
        this.f9478r = null;
        this.f9479s = null;
        this.f9480t = null;
        if (this.f9467g != null) {
            this.f9468h.d();
            this.f9467g = null;
        }
        androidx.activity.result.c cVar = this.f9486z;
        if (cVar != null) {
            cVar.c();
            this.f9447A.c();
            this.f9448B.c();
        }
    }

    public final boolean E0(Fragment fragment) {
        return (fragment.f9253R && fragment.f9254S) || fragment.f9244I.o();
    }

    public void F() {
        S(1);
    }

    public boolean F0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.Z();
    }

    public void G() {
        for (Fragment fragment : this.f9463c.n()) {
            if (fragment != null) {
                fragment.Y0();
            }
        }
    }

    public boolean G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.f9242G;
        return fragment.equals(nVar.w0()) && G0(nVar.f9480t);
    }

    public void H(boolean z7) {
        for (Fragment fragment : this.f9463c.n()) {
            if (fragment != null) {
                fragment.Z0(z7);
            }
        }
    }

    public boolean H0(int i7) {
        return this.f9477q >= i7;
    }

    public void I(Fragment fragment) {
        Iterator it = this.f9476p.iterator();
        while (it.hasNext()) {
            ((r) it.next()).a(this, fragment);
        }
    }

    public boolean I0() {
        return this.f9451E || this.f9452F;
    }

    public boolean J(MenuItem menuItem) {
        if (this.f9477q < 1) {
            return false;
        }
        for (Fragment fragment : this.f9463c.n()) {
            if (fragment != null && fragment.a1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void J0(Fragment fragment, Intent intent, int i7, Bundle bundle) {
        if (this.f9486z == null) {
            this.f9478r.p(fragment, intent, i7, bundle);
            return;
        }
        this.f9449C.addLast(new m(fragment.f9280t, i7));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f9486z.a(intent);
    }

    public void K(Menu menu) {
        if (this.f9477q < 1) {
            return;
        }
        for (Fragment fragment : this.f9463c.n()) {
            if (fragment != null) {
                fragment.b1(menu);
            }
        }
    }

    public final void K0(C1959b c1959b) {
        int size = c1959b.size();
        for (int i7 = 0; i7 < size; i7++) {
            Fragment fragment = (Fragment) c1959b.s(i7);
            if (!fragment.f9286z) {
                View q12 = fragment.q1();
                fragment.f9264c0 = q12.getAlpha();
                q12.setAlpha(0.0f);
            }
        }
    }

    public final void L(Fragment fragment) {
        if (fragment == null || !fragment.equals(f0(fragment.f9280t))) {
            return;
        }
        fragment.f1();
    }

    public void L0(Fragment fragment) {
        if (!this.f9463c.c(fragment.f9280t)) {
            if (D0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f9477q + "since it is not added to " + this);
                return;
            }
            return;
        }
        N0(fragment);
        View view = fragment.f9257V;
        if (view != null && fragment.f9262a0 && fragment.f9256U != null) {
            float f7 = fragment.f9264c0;
            if (f7 > 0.0f) {
                view.setAlpha(f7);
            }
            fragment.f9264c0 = 0.0f;
            fragment.f9262a0 = false;
            f.d b7 = androidx.fragment.app.f.b(this.f9478r.i(), fragment, true);
            if (b7 != null) {
                Animation animation = b7.f9423a;
                if (animation != null) {
                    fragment.f9257V.startAnimation(animation);
                } else {
                    b7.f9424b.setTarget(fragment.f9257V);
                    b7.f9424b.start();
                }
            }
        }
        if (fragment.f9263b0) {
            u(fragment);
        }
    }

    public void M() {
        S(5);
    }

    public void M0(int i7, boolean z7) {
        androidx.fragment.app.k kVar;
        if (this.f9478r == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z7 || i7 != this.f9477q) {
            this.f9477q = i7;
            if (f9446P) {
                this.f9463c.r();
            } else {
                Iterator it = this.f9463c.n().iterator();
                while (it.hasNext()) {
                    L0((Fragment) it.next());
                }
                for (t tVar : this.f9463c.k()) {
                    Fragment k7 = tVar.k();
                    if (!k7.f9262a0) {
                        L0(k7);
                    }
                    if (k7.f9236A && !k7.Y()) {
                        this.f9463c.q(tVar);
                    }
                }
            }
            l1();
            if (this.f9450D && (kVar = this.f9478r) != null && this.f9477q == 7) {
                kVar.q();
                this.f9450D = false;
            }
        }
    }

    public void N(boolean z7) {
        for (Fragment fragment : this.f9463c.n()) {
            if (fragment != null) {
                fragment.d1(z7);
            }
        }
    }

    public void N0(Fragment fragment) {
        O0(fragment, this.f9477q);
    }

    public boolean O(Menu menu) {
        boolean z7 = false;
        if (this.f9477q < 1) {
            return false;
        }
        for (Fragment fragment : this.f9463c.n()) {
            if (fragment != null && F0(fragment) && fragment.e1(menu)) {
                z7 = true;
            }
        }
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r2 != 5) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void O0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.O0(androidx.fragment.app.Fragment, int):void");
    }

    public void P() {
        n1();
        L(this.f9481u);
    }

    public void P0() {
        if (this.f9478r == null) {
            return;
        }
        this.f9451E = false;
        this.f9452F = false;
        this.f9459M.n(false);
        for (Fragment fragment : this.f9463c.n()) {
            if (fragment != null) {
                fragment.f0();
            }
        }
    }

    public void Q() {
        this.f9451E = false;
        this.f9452F = false;
        this.f9459M.n(false);
        S(7);
    }

    public void Q0(t tVar) {
        Fragment k7 = tVar.k();
        if (k7.f9258W) {
            if (this.f9462b) {
                this.f9454H = true;
                return;
            }
            k7.f9258W = false;
            if (f9446P) {
                tVar.m();
            } else {
                N0(k7);
            }
        }
    }

    public void R() {
        this.f9451E = false;
        this.f9452F = false;
        this.f9459M.n(false);
        S(5);
    }

    public void R0(int i7, int i8) {
        if (i7 >= 0) {
            Y(new o(null, i7, i8), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i7);
    }

    public final void S(int i7) {
        try {
            this.f9462b = true;
            this.f9463c.d(i7);
            M0(i7, false);
            if (f9446P) {
                Iterator it = r().iterator();
                while (it.hasNext()) {
                    ((B) it.next()).j();
                }
            }
            this.f9462b = false;
            a0(true);
        } catch (Throwable th) {
            this.f9462b = false;
            throw th;
        }
    }

    public boolean S0() {
        return T0(null, -1, 0);
    }

    public void T() {
        this.f9452F = true;
        this.f9459M.n(true);
        S(4);
    }

    public final boolean T0(String str, int i7, int i8) {
        a0(false);
        Z(true);
        Fragment fragment = this.f9481u;
        if (fragment != null && i7 < 0 && str == null && fragment.s().S0()) {
            return true;
        }
        boolean U02 = U0(this.f9455I, this.f9456J, str, i7, i8);
        if (U02) {
            this.f9462b = true;
            try {
                Z0(this.f9455I, this.f9456J);
            } finally {
                q();
            }
        }
        n1();
        V();
        this.f9463c.b();
        return U02;
    }

    public void U() {
        S(2);
    }

    public boolean U0(ArrayList arrayList, ArrayList arrayList2, String str, int i7, int i8) {
        int i9;
        ArrayList arrayList3 = this.f9464d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i7 < 0 && (i8 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f9464d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i7 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0779a c0779a = (C0779a) this.f9464d.get(size2);
                    if ((str != null && str.equals(c0779a.t())) || (i7 >= 0 && i7 == c0779a.f9326v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i8 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0779a c0779a2 = (C0779a) this.f9464d.get(size2);
                        if (str == null || !str.equals(c0779a2.t())) {
                            if (i7 < 0 || i7 != c0779a2.f9326v) {
                                break;
                            }
                        }
                    }
                }
                i9 = size2;
            } else {
                i9 = -1;
            }
            if (i9 == this.f9464d.size() - 1) {
                return false;
            }
            for (int size3 = this.f9464d.size() - 1; size3 > i9; size3--) {
                arrayList.add(this.f9464d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public final void V() {
        if (this.f9454H) {
            this.f9454H = false;
            l1();
        }
    }

    public final int V0(ArrayList arrayList, ArrayList arrayList2, int i7, int i8, C1959b c1959b) {
        int i9 = i8;
        for (int i10 = i8 - 1; i10 >= i7; i10--) {
            C0779a c0779a = (C0779a) arrayList.get(i10);
            boolean booleanValue = ((Boolean) arrayList2.get(i10)).booleanValue();
            if (c0779a.x() && !c0779a.v(arrayList, i10 + 1, i8)) {
                if (this.f9458L == null) {
                    this.f9458L = new ArrayList();
                }
                p pVar = new p(c0779a, booleanValue);
                this.f9458L.add(pVar);
                c0779a.z(pVar);
                if (booleanValue) {
                    c0779a.q();
                } else {
                    c0779a.r(false);
                }
                i9--;
                if (i10 != i9) {
                    arrayList.remove(i10);
                    arrayList.add(i9, c0779a);
                }
                d(c1959b);
            }
        }
        return i9;
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f9463c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f9465e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i7 = 0; i7 < size2; i7++) {
                Fragment fragment = (Fragment) this.f9465e.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f9464d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i8 = 0; i8 < size; i8++) {
                C0779a c0779a = (C0779a) this.f9464d.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(c0779a.toString());
                c0779a.o(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f9469i.get());
        synchronized (this.f9461a) {
            try {
                int size3 = this.f9461a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i9 = 0; i9 < size3; i9++) {
                        InterfaceC0160n interfaceC0160n = (InterfaceC0160n) this.f9461a.get(i9);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i9);
                        printWriter.print(": ");
                        printWriter.println(interfaceC0160n);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f9478r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f9479s);
        if (this.f9480t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f9480t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f9477q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f9451E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f9452F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f9453G);
        if (this.f9450D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f9450D);
        }
    }

    public void W0(l lVar, boolean z7) {
        this.f9475o.o(lVar, z7);
    }

    public final void X() {
        if (f9446P) {
            Iterator it = r().iterator();
            while (it.hasNext()) {
                ((B) it.next()).j();
            }
        } else {
            if (this.f9473m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f9473m.keySet()) {
                n(fragment);
                N0(fragment);
            }
        }
    }

    public void X0(Fragment fragment, E.c cVar) {
        HashSet hashSet = (HashSet) this.f9473m.get(fragment);
        if (hashSet != null && hashSet.remove(cVar) && hashSet.isEmpty()) {
            this.f9473m.remove(fragment);
            if (fragment.f9275o < 5) {
                w(fragment);
                N0(fragment);
            }
        }
    }

    public void Y(InterfaceC0160n interfaceC0160n, boolean z7) {
        if (!z7) {
            if (this.f9478r == null) {
                if (!this.f9453G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            p();
        }
        synchronized (this.f9461a) {
            try {
                if (this.f9478r == null) {
                    if (!z7) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f9461a.add(interfaceC0160n);
                    f1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void Y0(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f9241F);
        }
        boolean z7 = !fragment.Y();
        if (!fragment.f9250O || z7) {
            this.f9463c.s(fragment);
            if (E0(fragment)) {
                this.f9450D = true;
            }
            fragment.f9236A = true;
            j1(fragment);
        }
    }

    public final void Z(boolean z7) {
        if (this.f9462b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f9478r == null) {
            if (!this.f9453G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f9478r.l().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z7) {
            p();
        }
        if (this.f9455I == null) {
            this.f9455I = new ArrayList();
            this.f9456J = new ArrayList();
        }
        this.f9462b = true;
        try {
            e0(null, null);
        } finally {
            this.f9462b = false;
        }
    }

    public final void Z0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        e0(arrayList, arrayList2);
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            if (!((C0779a) arrayList.get(i7)).f9567r) {
                if (i8 != i7) {
                    d0(arrayList, arrayList2, i8, i7);
                }
                i8 = i7 + 1;
                if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                    while (i8 < size && ((Boolean) arrayList2.get(i8)).booleanValue() && !((C0779a) arrayList.get(i8)).f9567r) {
                        i8++;
                    }
                }
                d0(arrayList, arrayList2, i7, i8);
                i7 = i8 - 1;
            }
            i7++;
        }
        if (i8 != size) {
            d0(arrayList, arrayList2, i8, size);
        }
    }

    public boolean a0(boolean z7) {
        Z(z7);
        boolean z8 = false;
        while (k0(this.f9455I, this.f9456J)) {
            z8 = true;
            this.f9462b = true;
            try {
                Z0(this.f9455I, this.f9456J);
            } finally {
                q();
            }
        }
        n1();
        V();
        this.f9463c.b();
        return z8;
    }

    public void a1(Fragment fragment) {
        this.f9459M.m(fragment);
    }

    public void b0(InterfaceC0160n interfaceC0160n, boolean z7) {
        if (z7 && (this.f9478r == null || this.f9453G)) {
            return;
        }
        Z(z7);
        if (interfaceC0160n.a(this.f9455I, this.f9456J)) {
            this.f9462b = true;
            try {
                Z0(this.f9455I, this.f9456J);
            } finally {
                q();
            }
        }
        n1();
        V();
        this.f9463c.b();
    }

    public final void b1() {
        ArrayList arrayList = this.f9472l;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.a.a(this.f9472l.get(0));
        throw null;
    }

    public void c1(Parcelable parcelable) {
        t tVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.p pVar = (androidx.fragment.app.p) parcelable;
        if (pVar.f9510o == null) {
            return;
        }
        this.f9463c.t();
        Iterator it = pVar.f9510o.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar != null) {
                Fragment g7 = this.f9459M.g(sVar.f9528p);
                if (g7 != null) {
                    if (D0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + g7);
                    }
                    tVar = new t(this.f9475o, this.f9463c, g7, sVar);
                } else {
                    tVar = new t(this.f9475o, this.f9463c, this.f9478r.i().getClassLoader(), p0(), sVar);
                }
                Fragment k7 = tVar.k();
                k7.f9242G = this;
                if (D0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k7.f9280t + "): " + k7);
                }
                tVar.o(this.f9478r.i().getClassLoader());
                this.f9463c.p(tVar);
                tVar.t(this.f9477q);
            }
        }
        for (Fragment fragment : this.f9459M.j()) {
            if (!this.f9463c.c(fragment.f9280t)) {
                if (D0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + pVar.f9510o);
                }
                this.f9459M.m(fragment);
                fragment.f9242G = this;
                t tVar2 = new t(this.f9475o, this.f9463c, fragment);
                tVar2.t(1);
                tVar2.m();
                fragment.f9236A = true;
                tVar2.m();
            }
        }
        this.f9463c.u(pVar.f9511p);
        if (pVar.f9512q != null) {
            this.f9464d = new ArrayList(pVar.f9512q.length);
            int i7 = 0;
            while (true) {
                C0780b[] c0780bArr = pVar.f9512q;
                if (i7 >= c0780bArr.length) {
                    break;
                }
                C0779a a7 = c0780bArr[i7].a(this);
                if (D0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + a7.f9326v + "): " + a7);
                    PrintWriter printWriter = new PrintWriter(new A("FragmentManager"));
                    a7.p("  ", printWriter, false);
                    printWriter.close();
                }
                this.f9464d.add(a7);
                i7++;
            }
        } else {
            this.f9464d = null;
        }
        this.f9469i.set(pVar.f9513r);
        String str = pVar.f9514s;
        if (str != null) {
            Fragment f02 = f0(str);
            this.f9481u = f02;
            L(f02);
        }
        ArrayList arrayList = pVar.f9515t;
        if (arrayList != null) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                this.f9470j.put(arrayList.get(i8), pVar.f9516u.get(i8));
            }
        }
        this.f9449C = new ArrayDeque(pVar.f9517v);
    }

    public final void d(C1959b c1959b) {
        int i7 = this.f9477q;
        if (i7 < 1) {
            return;
        }
        int min = Math.min(i7, 5);
        for (Fragment fragment : this.f9463c.n()) {
            if (fragment.f9275o < min) {
                O0(fragment, min);
                if (fragment.f9257V != null && !fragment.f9249N && fragment.f9262a0) {
                    c1959b.add(fragment);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0143  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d0(java.util.ArrayList r18, java.util.ArrayList r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.d0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public void e(C0779a c0779a) {
        if (this.f9464d == null) {
            this.f9464d = new ArrayList();
        }
        this.f9464d.add(c0779a);
    }

    public final void e0(ArrayList arrayList, ArrayList arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList arrayList3 = this.f9458L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i7 = 0;
        while (i7 < size) {
            p pVar = (p) this.f9458L.get(i7);
            if (arrayList == null || pVar.f9507a || (indexOf2 = arrayList.indexOf(pVar.f9508b)) == -1 || arrayList2 == null || !((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                if (pVar.e() || (arrayList != null && pVar.f9508b.v(arrayList, 0, arrayList.size()))) {
                    this.f9458L.remove(i7);
                    i7--;
                    size--;
                    if (arrayList == null || pVar.f9507a || (indexOf = arrayList.indexOf(pVar.f9508b)) == -1 || arrayList2 == null || !((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                        pVar.d();
                    }
                }
                i7++;
            } else {
                this.f9458L.remove(i7);
                i7--;
                size--;
            }
            pVar.c();
            i7++;
        }
    }

    public Parcelable e1() {
        int size;
        j0();
        X();
        a0(true);
        this.f9451E = true;
        this.f9459M.n(true);
        ArrayList v7 = this.f9463c.v();
        C0780b[] c0780bArr = null;
        if (v7.isEmpty()) {
            if (D0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList w7 = this.f9463c.w();
        ArrayList arrayList = this.f9464d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            c0780bArr = new C0780b[size];
            for (int i7 = 0; i7 < size; i7++) {
                c0780bArr[i7] = new C0780b((C0779a) this.f9464d.get(i7));
                if (D0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i7 + ": " + this.f9464d.get(i7));
                }
            }
        }
        androidx.fragment.app.p pVar = new androidx.fragment.app.p();
        pVar.f9510o = v7;
        pVar.f9511p = w7;
        pVar.f9512q = c0780bArr;
        pVar.f9513r = this.f9469i.get();
        Fragment fragment = this.f9481u;
        if (fragment != null) {
            pVar.f9514s = fragment.f9280t;
        }
        pVar.f9515t.addAll(this.f9470j.keySet());
        pVar.f9516u.addAll(this.f9470j.values());
        pVar.f9517v = new ArrayList(this.f9449C);
        return pVar;
    }

    public void f(Fragment fragment, E.c cVar) {
        if (this.f9473m.get(fragment) == null) {
            this.f9473m.put(fragment, new HashSet());
        }
        ((HashSet) this.f9473m.get(fragment)).add(cVar);
    }

    public Fragment f0(String str) {
        return this.f9463c.f(str);
    }

    public void f1() {
        synchronized (this.f9461a) {
            try {
                ArrayList arrayList = this.f9458L;
                boolean z7 = (arrayList == null || arrayList.isEmpty()) ? false : true;
                boolean z8 = this.f9461a.size() == 1;
                if (z7 || z8) {
                    this.f9478r.l().removeCallbacks(this.f9460N);
                    this.f9478r.l().post(this.f9460N);
                    n1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        t v7 = v(fragment);
        fragment.f9242G = this;
        this.f9463c.p(v7);
        if (fragment.f9250O) {
            return;
        }
        this.f9463c.a(fragment);
        fragment.f9236A = false;
        if (fragment.f9257V == null) {
            fragment.f9263b0 = false;
        }
        if (E0(fragment)) {
            this.f9450D = true;
        }
    }

    public Fragment g0(int i7) {
        return this.f9463c.g(i7);
    }

    public void g1(Fragment fragment, boolean z7) {
        ViewGroup o02 = o0(fragment);
        if (o02 == null || !(o02 instanceof androidx.fragment.app.h)) {
            return;
        }
        ((androidx.fragment.app.h) o02).setDrawDisappearingViewsLast(!z7);
    }

    public void h(r rVar) {
        this.f9476p.add(rVar);
    }

    public Fragment h0(String str) {
        return this.f9463c.h(str);
    }

    public void h1(Fragment fragment, d.c cVar) {
        if (fragment.equals(f0(fragment.f9280t)) && (fragment.f9243H == null || fragment.f9242G == this)) {
            fragment.f9267f0 = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void i(Fragment fragment) {
        this.f9459M.e(fragment);
    }

    public Fragment i0(String str) {
        return this.f9463c.i(str);
    }

    public void i1(Fragment fragment) {
        if (fragment == null || (fragment.equals(f0(fragment.f9280t)) && (fragment.f9243H == null || fragment.f9242G == this))) {
            Fragment fragment2 = this.f9481u;
            this.f9481u = fragment;
            L(fragment2);
            L(this.f9481u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public int j() {
        return this.f9469i.getAndIncrement();
    }

    public final void j0() {
        if (f9446P) {
            Iterator it = r().iterator();
            while (it.hasNext()) {
                ((B) it.next()).k();
            }
        } else if (this.f9458L != null) {
            while (!this.f9458L.isEmpty()) {
                ((p) this.f9458L.remove(0)).d();
            }
        }
    }

    public final void j1(Fragment fragment) {
        ViewGroup o02 = o0(fragment);
        if (o02 == null || fragment.C() <= 0) {
            return;
        }
        if (o02.getTag(U.b.f6290c) == null) {
            o02.setTag(U.b.f6290c, fragment);
        }
        ((Fragment) o02.getTag(U.b.f6290c)).z1(fragment.C());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(androidx.fragment.app.k r3, androidx.fragment.app.g r4, androidx.fragment.app.Fragment r5) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.k(androidx.fragment.app.k, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    public final boolean k0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f9461a) {
            try {
                if (this.f9461a.isEmpty()) {
                    return false;
                }
                int size = this.f9461a.size();
                boolean z7 = false;
                for (int i7 = 0; i7 < size; i7++) {
                    z7 |= ((InterfaceC0160n) this.f9461a.get(i7)).a(arrayList, arrayList2);
                }
                this.f9461a.clear();
                this.f9478r.l().removeCallbacks(this.f9460N);
                return z7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k1(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f9249N) {
            fragment.f9249N = false;
            fragment.f9263b0 = !fragment.f9263b0;
        }
    }

    public void l(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f9250O) {
            fragment.f9250O = false;
            if (fragment.f9286z) {
                return;
            }
            this.f9463c.a(fragment);
            if (D0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (E0(fragment)) {
                this.f9450D = true;
            }
        }
    }

    public int l0() {
        ArrayList arrayList = this.f9464d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final void l1() {
        Iterator it = this.f9463c.k().iterator();
        while (it.hasNext()) {
            Q0((t) it.next());
        }
    }

    public v m() {
        return new C0779a(this);
    }

    public final q m0(Fragment fragment) {
        return this.f9459M.h(fragment);
    }

    public void m1(l lVar) {
        this.f9475o.p(lVar);
    }

    public final void n(Fragment fragment) {
        HashSet hashSet = (HashSet) this.f9473m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((E.c) it.next()).a();
            }
            hashSet.clear();
            w(fragment);
            this.f9473m.remove(fragment);
        }
    }

    public androidx.fragment.app.g n0() {
        return this.f9479s;
    }

    public final void n1() {
        synchronized (this.f9461a) {
            try {
                if (this.f9461a.isEmpty()) {
                    this.f9468h.f(l0() > 0 && G0(this.f9480t));
                } else {
                    this.f9468h.f(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean o() {
        boolean z7 = false;
        for (Fragment fragment : this.f9463c.l()) {
            if (fragment != null) {
                z7 = E0(fragment);
            }
            if (z7) {
                return true;
            }
        }
        return false;
    }

    public final ViewGroup o0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f9256U;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f9247L > 0 && this.f9479s.f()) {
            View e7 = this.f9479s.e(fragment.f9247L);
            if (e7 instanceof ViewGroup) {
                return (ViewGroup) e7;
            }
        }
        return null;
    }

    public final void p() {
        if (I0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public androidx.fragment.app.j p0() {
        androidx.fragment.app.j jVar = this.f9482v;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.f9480t;
        return fragment != null ? fragment.f9242G.p0() : this.f9483w;
    }

    public final void q() {
        this.f9462b = false;
        this.f9456J.clear();
        this.f9455I.clear();
    }

    public u q0() {
        return this.f9463c;
    }

    public final Set r() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f9463c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((t) it.next()).k().f9256U;
            if (viewGroup != null) {
                hashSet.add(B.o(viewGroup, x0()));
            }
        }
        return hashSet;
    }

    public List r0() {
        return this.f9463c.n();
    }

    public final Set s(ArrayList arrayList, int i7, int i8) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i7 < i8) {
            Iterator it = ((C0779a) arrayList.get(i7)).f9552c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((v.a) it.next()).f9570b;
                if (fragment != null && (viewGroup = fragment.f9256U) != null) {
                    hashSet.add(B.n(viewGroup, this));
                }
            }
            i7++;
        }
        return hashSet;
    }

    public androidx.fragment.app.k s0() {
        return this.f9478r;
    }

    public void t(C0779a c0779a, boolean z7, boolean z8, boolean z9) {
        if (z7) {
            c0779a.r(z9);
        } else {
            c0779a.q();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0779a);
        arrayList2.add(Boolean.valueOf(z7));
        if (z8 && this.f9477q >= 1) {
            w.B(this.f9478r.i(), this.f9479s, arrayList, arrayList2, 0, 1, true, this.f9474n);
        }
        if (z9) {
            M0(this.f9477q, true);
        }
        for (Fragment fragment : this.f9463c.l()) {
            if (fragment != null && fragment.f9257V != null && fragment.f9262a0 && c0779a.u(fragment.f9247L)) {
                float f7 = fragment.f9264c0;
                if (f7 > 0.0f) {
                    fragment.f9257V.setAlpha(f7);
                }
                if (z9) {
                    fragment.f9264c0 = 0.0f;
                } else {
                    fragment.f9264c0 = -1.0f;
                    fragment.f9262a0 = false;
                }
            }
        }
    }

    public LayoutInflater.Factory2 t0() {
        return this.f9466f;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f9480t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f9480t;
        } else {
            androidx.fragment.app.k kVar = this.f9478r;
            if (kVar == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(kVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f9478r;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public final void u(Fragment fragment) {
        Animator animator;
        if (fragment.f9257V != null) {
            f.d b7 = androidx.fragment.app.f.b(this.f9478r.i(), fragment, !fragment.f9249N);
            if (b7 == null || (animator = b7.f9424b) == null) {
                if (b7 != null) {
                    fragment.f9257V.startAnimation(b7.f9423a);
                    b7.f9423a.start();
                }
                fragment.f9257V.setVisibility((!fragment.f9249N || fragment.X()) ? 0 : 8);
                if (fragment.X()) {
                    fragment.y1(false);
                }
            } else {
                animator.setTarget(fragment.f9257V);
                if (!fragment.f9249N) {
                    fragment.f9257V.setVisibility(0);
                } else if (fragment.X()) {
                    fragment.y1(false);
                } else {
                    ViewGroup viewGroup = fragment.f9256U;
                    View view = fragment.f9257V;
                    viewGroup.startViewTransition(view);
                    b7.f9424b.addListener(new h(viewGroup, view, fragment));
                }
                b7.f9424b.start();
            }
        }
        if (fragment.f9286z && E0(fragment)) {
            this.f9450D = true;
        }
        fragment.f9263b0 = false;
        fragment.w0(fragment.f9249N);
    }

    public androidx.fragment.app.m u0() {
        return this.f9475o;
    }

    public t v(Fragment fragment) {
        t m7 = this.f9463c.m(fragment.f9280t);
        if (m7 != null) {
            return m7;
        }
        t tVar = new t(this.f9475o, this.f9463c, fragment);
        tVar.o(this.f9478r.i().getClassLoader());
        tVar.t(this.f9477q);
        return tVar;
    }

    public Fragment v0() {
        return this.f9480t;
    }

    public final void w(Fragment fragment) {
        fragment.V0();
        this.f9475o.n(fragment, false);
        fragment.f9256U = null;
        fragment.f9257V = null;
        fragment.f9269h0 = null;
        fragment.f9270i0.j(null);
        fragment.f9238C = false;
    }

    public Fragment w0() {
        return this.f9481u;
    }

    public void x(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.f9250O) {
            return;
        }
        fragment.f9250O = true;
        if (fragment.f9286z) {
            if (D0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f9463c.s(fragment);
            if (E0(fragment)) {
                this.f9450D = true;
            }
            j1(fragment);
        }
    }

    public C x0() {
        C c7 = this.f9484x;
        if (c7 != null) {
            return c7;
        }
        Fragment fragment = this.f9480t;
        return fragment != null ? fragment.f9242G.x0() : this.f9485y;
    }

    public void y() {
        this.f9451E = false;
        this.f9452F = false;
        this.f9459M.n(false);
        S(4);
    }

    public void z() {
        this.f9451E = false;
        this.f9452F = false;
        this.f9459M.n(false);
        S(0);
    }

    public androidx.lifecycle.t z0(Fragment fragment) {
        return this.f9459M.k(fragment);
    }
}
