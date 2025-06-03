package androidx.fragment.app;

import E.c;
import I.AbstractC0421s;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f9206a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9207b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9208c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f9209d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9210e = false;

    public class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ d f9211o;

        public a(d dVar) {
            this.f9211o = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (B.this.f9207b.contains(this.f9211o)) {
                this.f9211o.e().c(this.f9211o.f().f9257V);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ d f9213o;

        public b(d dVar) {
            this.f9213o = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            B.this.f9207b.remove(this.f9213o);
            B.this.f9208c.remove(this.f9213o);
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9215a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9216b;

        static {
            int[] iArr = new int[e.b.values().length];
            f9216b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9216b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9216b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f9215a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9215a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9215a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9215a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class d extends e {

        /* renamed from: h, reason: collision with root package name */
        public final t f9217h;

        public d(e.c cVar, e.b bVar, t tVar, E.c cVar2) {
            super(cVar, bVar, tVar.k(), cVar2);
            this.f9217h = tVar;
        }

        @Override // androidx.fragment.app.B.e
        public void c() {
            super.c();
            this.f9217h.m();
        }

        @Override // androidx.fragment.app.B.e
        public void l() {
            Fragment k7 = this.f9217h.k();
            View findFocus = k7.f9257V.findFocus();
            if (findFocus != null) {
                k7.x1(findFocus);
                if (n.D0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k7);
                }
            }
            if (g() == e.b.ADDING) {
                View q12 = f().q1();
                if (q12.getParent() == null) {
                    this.f9217h.b();
                    q12.setAlpha(0.0f);
                }
                if (q12.getAlpha() == 0.0f && q12.getVisibility() == 0) {
                    q12.setVisibility(4);
                }
                q12.setAlpha(k7.G());
            }
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public c f9218a;

        /* renamed from: b, reason: collision with root package name */
        public b f9219b;

        /* renamed from: c, reason: collision with root package name */
        public final Fragment f9220c;

        /* renamed from: d, reason: collision with root package name */
        public final List f9221d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public final HashSet f9222e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        public boolean f9223f = false;

        /* renamed from: g, reason: collision with root package name */
        public boolean f9224g = false;

        public class a implements c.b {
            public a() {
            }

            @Override // E.c.b
            public void a() {
                e.this.b();
            }
        }

        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c e(int i7) {
                if (i7 == 0) {
                    return VISIBLE;
                }
                if (i7 == 4) {
                    return INVISIBLE;
                }
                if (i7 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i7);
            }

            public static c h(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : e(view.getVisibility());
            }

            public void c(View view) {
                int i7;
                int i8 = c.f9215a[ordinal()];
                if (i8 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (n.D0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i8 == 2) {
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i7 = 0;
                } else {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            return;
                        }
                        if (n.D0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i7 = 8;
                }
                view.setVisibility(i7);
            }
        }

        public e(c cVar, b bVar, Fragment fragment, E.c cVar2) {
            this.f9218a = cVar;
            this.f9219b = bVar;
            this.f9220c = fragment;
            cVar2.c(new a());
        }

        public final void a(Runnable runnable) {
            this.f9221d.add(runnable);
        }

        public final void b() {
            if (h()) {
                return;
            }
            this.f9223f = true;
            if (this.f9222e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f9222e).iterator();
            while (it.hasNext()) {
                ((E.c) it.next()).a();
            }
        }

        public void c() {
            if (this.f9224g) {
                return;
            }
            if (n.D0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f9224g = true;
            Iterator it = this.f9221d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void d(E.c cVar) {
            if (this.f9222e.remove(cVar) && this.f9222e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f9218a;
        }

        public final Fragment f() {
            return this.f9220c;
        }

        public b g() {
            return this.f9219b;
        }

        public final boolean h() {
            return this.f9223f;
        }

        public final boolean i() {
            return this.f9224g;
        }

        public final void j(E.c cVar) {
            l();
            this.f9222e.add(cVar);
        }

        public final void k(c cVar, b bVar) {
            b bVar2;
            int i7 = c.f9216b[bVar.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3 && this.f9218a != c.REMOVED) {
                        if (n.D0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f9220c + " mFinalState = " + this.f9218a + " -> " + cVar + ". ");
                        }
                        this.f9218a = cVar;
                        return;
                    }
                    return;
                }
                if (n.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f9220c + " mFinalState = " + this.f9218a + " -> REMOVED. mLifecycleImpact  = " + this.f9219b + " to REMOVING.");
                }
                this.f9218a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else {
                if (this.f9218a != c.REMOVED) {
                    return;
                }
                if (n.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f9220c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f9219b + " to ADDING.");
                }
                this.f9218a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f9219b = bVar2;
        }

        public abstract void l();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f9218a + "} {mLifecycleImpact = " + this.f9219b + "} {mFragment = " + this.f9220c + "}";
        }
    }

    public B(ViewGroup viewGroup) {
        this.f9206a = viewGroup;
    }

    public static B n(ViewGroup viewGroup, n nVar) {
        return o(viewGroup, nVar.x0());
    }

    public static B o(ViewGroup viewGroup, C c7) {
        Object tag = viewGroup.getTag(U.b.f6289b);
        if (tag instanceof B) {
            return (B) tag;
        }
        B a7 = c7.a(viewGroup);
        viewGroup.setTag(U.b.f6289b, a7);
        return a7;
    }

    public final void a(e.c cVar, e.b bVar, t tVar) {
        synchronized (this.f9207b) {
            try {
                E.c cVar2 = new E.c();
                e h7 = h(tVar.k());
                if (h7 != null) {
                    h7.k(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, tVar, cVar2);
                this.f9207b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(e.c cVar, t tVar) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + tVar.k());
        }
        a(cVar, e.b.ADDING, tVar);
    }

    public void c(t tVar) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + tVar.k());
        }
        a(e.c.GONE, e.b.NONE, tVar);
    }

    public void d(t tVar) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + tVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, tVar);
    }

    public void e(t tVar) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + tVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, tVar);
    }

    public abstract void f(List list, boolean z7);

    public void g() {
        if (this.f9210e) {
            return;
        }
        if (!AbstractC0421s.t(this.f9206a)) {
            j();
            this.f9209d = false;
            return;
        }
        synchronized (this.f9207b) {
            try {
                if (!this.f9207b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f9208c);
                    this.f9208c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (n.D0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f9208c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f9207b);
                    this.f9207b.clear();
                    this.f9208c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).l();
                    }
                    f(arrayList2, this.f9209d);
                    this.f9209d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e h(Fragment fragment) {
        Iterator it = this.f9207b.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    public final e i(Fragment fragment) {
        Iterator it = this.f9208c.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    public void j() {
        String str;
        String str2;
        boolean t7 = AbstractC0421s.t(this.f9206a);
        synchronized (this.f9207b) {
            try {
                q();
                Iterator it = this.f9207b.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).l();
                }
                Iterator it2 = new ArrayList(this.f9208c).iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    if (n.D0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (t7) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f9206a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(eVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    eVar.b();
                }
                Iterator it3 = new ArrayList(this.f9207b).iterator();
                while (it3.hasNext()) {
                    e eVar2 = (e) it3.next();
                    if (n.D0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (t7) {
                            str = "";
                        } else {
                            str = "Container " + this.f9206a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    eVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k() {
        if (this.f9210e) {
            this.f9210e = false;
            g();
        }
    }

    public e.b l(t tVar) {
        e h7 = h(tVar.k());
        if (h7 != null) {
            return h7.g();
        }
        e i7 = i(tVar.k());
        if (i7 != null) {
            return i7.g();
        }
        return null;
    }

    public ViewGroup m() {
        return this.f9206a;
    }

    public void p() {
        synchronized (this.f9207b) {
            try {
                q();
                this.f9210e = false;
                int size = this.f9207b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = (e) this.f9207b.get(size);
                    e.c h7 = e.c.h(eVar.f().f9257V);
                    e.c e7 = eVar.e();
                    e.c cVar = e.c.VISIBLE;
                    if (e7 == cVar && h7 != cVar) {
                        this.f9210e = eVar.f().a0();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        Iterator it = this.f9207b.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.e(eVar.f().q1().getVisibility()), e.b.NONE);
            }
        }
    }

    public void r(boolean z7) {
        this.f9209d = z7;
    }
}
