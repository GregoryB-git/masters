package androidx.fragment.app;

import E.c;
import I.AbstractC0421s;
import I.AbstractC0424v;
import I.ViewTreeObserverOnPreDrawListenerC0420q;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.B;
import androidx.fragment.app.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t.C1958a;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0781c extends B {

    /* renamed from: androidx.fragment.app.c$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9341a;

        static {
            int[] iArr = new int[B.e.c.values().length];
            f9341a = iArr;
            try {
                iArr[B.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9341a[B.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9341a[B.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9341a[B.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    public class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List f9342o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ B.e f9343p;

        public b(List list, B.e eVar) {
            this.f9342o = list;
            this.f9343p = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9342o.contains(this.f9343p)) {
                this.f9342o.remove(this.f9343p);
                C0781c.this.s(this.f9343p);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    public class C0158c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f9345a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f9346b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f9347c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ B.e f9348d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k f9349e;

        public C0158c(ViewGroup viewGroup, View view, boolean z7, B.e eVar, k kVar) {
            this.f9345a = viewGroup;
            this.f9346b = view;
            this.f9347c = z7;
            this.f9348d = eVar;
            this.f9349e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9345a.endViewTransition(this.f9346b);
            if (this.f9347c) {
                this.f9348d.e().c(this.f9346b);
            }
            this.f9349e.a();
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    public class d implements c.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Animator f9351a;

        public d(Animator animator) {
            this.f9351a = animator;
        }

        @Override // E.c.b
        public void a() {
            this.f9351a.end();
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    public class e implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f9353a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f9354b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f9355c;

        /* renamed from: androidx.fragment.app.c$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f9353a.endViewTransition(eVar.f9354b);
                e.this.f9355c.a();
            }
        }

        public e(ViewGroup viewGroup, View view, k kVar) {
            this.f9353a = viewGroup;
            this.f9354b = view;
            this.f9355c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f9353a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.c$f */
    public class f implements c.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f9358a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f9359b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f9360c;

        public f(View view, ViewGroup viewGroup, k kVar) {
            this.f9358a = view;
            this.f9359b = viewGroup;
            this.f9360c = kVar;
        }

        @Override // E.c.b
        public void a() {
            this.f9358a.clearAnimation();
            this.f9359b.endViewTransition(this.f9358a);
            this.f9360c.a();
        }
    }

    /* renamed from: androidx.fragment.app.c$g */
    public class g implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ B.e f9362o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ B.e f9363p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f9364q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C1958a f9365r;

        public g(B.e eVar, B.e eVar2, boolean z7, C1958a c1958a) {
            this.f9362o = eVar;
            this.f9363p = eVar2;
            this.f9364q = z7;
            this.f9365r = c1958a;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.f(this.f9362o.f(), this.f9363p.f(), this.f9364q, this.f9365r, false);
        }
    }

    /* renamed from: androidx.fragment.app.c$h */
    public class h implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ y f9367o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ View f9368p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Rect f9369q;

        public h(y yVar, View view, Rect rect) {
            this.f9367o = yVar;
            this.f9368p = view;
            this.f9369q = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9367o.k(this.f9368p, this.f9369q);
        }
    }

    /* renamed from: androidx.fragment.app.c$i */
    public class i implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9371o;

        public i(ArrayList arrayList) {
            this.f9371o = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.A(this.f9371o, 4);
        }
    }

    /* renamed from: androidx.fragment.app.c$j */
    public class j implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ m f9373o;

        public j(m mVar) {
            this.f9373o = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9373o.a();
        }
    }

    /* renamed from: androidx.fragment.app.c$k */
    public static class k extends l {

        /* renamed from: c, reason: collision with root package name */
        public boolean f9375c;

        /* renamed from: d, reason: collision with root package name */
        public f.d f9376d;

        public k(B.e eVar, E.c cVar) {
            super(eVar, cVar);
            this.f9375c = false;
        }

        public f.d e(Context context) {
            if (this.f9375c) {
                return this.f9376d;
            }
            f.d b7 = androidx.fragment.app.f.b(context, b().f(), b().e() == B.e.c.VISIBLE);
            this.f9376d = b7;
            this.f9375c = true;
            return b7;
        }
    }

    /* renamed from: androidx.fragment.app.c$l */
    public static class l {

        /* renamed from: a, reason: collision with root package name */
        public final B.e f9377a;

        /* renamed from: b, reason: collision with root package name */
        public final E.c f9378b;

        public l(B.e eVar, E.c cVar) {
            this.f9377a = eVar;
            this.f9378b = cVar;
        }

        public void a() {
            this.f9377a.d(this.f9378b);
        }

        public B.e b() {
            return this.f9377a;
        }

        public E.c c() {
            return this.f9378b;
        }

        public boolean d() {
            B.e.c cVar;
            B.e.c h7 = B.e.c.h(this.f9377a.f().f9257V);
            B.e.c e7 = this.f9377a.e();
            return h7 == e7 || !(h7 == (cVar = B.e.c.VISIBLE) || e7 == cVar);
        }
    }

    /* renamed from: androidx.fragment.app.c$m */
    public static class m extends l {

        /* renamed from: c, reason: collision with root package name */
        public final Object f9379c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f9380d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f9381e;

        public m(B.e eVar, E.c cVar, boolean z7, boolean z8) {
            super(eVar, cVar);
            boolean z9;
            Object obj;
            if (eVar.e() == B.e.c.VISIBLE) {
                Fragment f7 = eVar.f();
                this.f9379c = z7 ? f7.H() : f7.u();
                Fragment f8 = eVar.f();
                z9 = z7 ? f8.p() : f8.o();
            } else {
                Fragment f9 = eVar.f();
                this.f9379c = z7 ? f9.K() : f9.w();
                z9 = true;
            }
            this.f9380d = z9;
            if (z8) {
                Fragment f10 = eVar.f();
                obj = z7 ? f10.M() : f10.L();
            } else {
                obj = null;
            }
            this.f9381e = obj;
        }

        public y e() {
            y f7 = f(this.f9379c);
            y f8 = f(this.f9381e);
            if (f7 == null || f8 == null || f7 == f8) {
                return f7 != null ? f7 : f8;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f9379c + " which uses a different Transition  type than its shared element transition " + this.f9381e);
        }

        public final y f(Object obj) {
            if (obj == null) {
                return null;
            }
            y yVar = w.f9578b;
            if (yVar != null && yVar.e(obj)) {
                return yVar;
            }
            y yVar2 = w.f9579c;
            if (yVar2 != null && yVar2.e(obj)) {
                return yVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        public Object g() {
            return this.f9381e;
        }

        public Object h() {
            return this.f9379c;
        }

        public boolean i() {
            return this.f9381e != null;
        }

        public boolean j() {
            return this.f9380d;
        }
    }

    public C0781c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    @Override // androidx.fragment.app.B
    public void f(List list, boolean z7) {
        Iterator it = list.iterator();
        B.e eVar = null;
        B.e eVar2 = null;
        while (it.hasNext()) {
            B.e eVar3 = (B.e) it.next();
            B.e.c h7 = B.e.c.h(eVar3.f().f9257V);
            int i7 = a.f9341a[eVar3.e().ordinal()];
            if (i7 == 1 || i7 == 2 || i7 == 3) {
                if (h7 == B.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i7 == 4 && h7 != B.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            B.e eVar4 = (B.e) it2.next();
            E.c cVar = new E.c();
            eVar4.j(cVar);
            arrayList.add(new k(eVar4, cVar));
            E.c cVar2 = new E.c();
            eVar4.j(cVar2);
            boolean z8 = false;
            if (z7) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, cVar2, z7, z8));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z8 = true;
                arrayList2.add(new m(eVar4, cVar2, z7, z8));
                eVar4.a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, cVar2, z7, z8));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z8 = true;
                arrayList2.add(new m(eVar4, cVar2, z7, z8));
                eVar4.a(new b(arrayList3, eVar4));
            }
        }
        Map x7 = x(arrayList2, z7, eVar, eVar2);
        w(arrayList, arrayList3, x7.containsValue(Boolean.TRUE), x7);
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            s((B.e) it3.next());
        }
        arrayList3.clear();
    }

    public void s(B.e eVar) {
        eVar.e().c(eVar.f().f9257V);
    }

    public void t(ArrayList arrayList, View view) {
        boolean z7 = view instanceof ViewGroup;
        View view2 = view;
        if (z7) {
            ViewGroup viewGroup = (ViewGroup) view;
            boolean a7 = AbstractC0424v.a(viewGroup);
            view2 = viewGroup;
            if (!a7) {
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    if (childAt.getVisibility() == 0) {
                        t(arrayList, childAt);
                    }
                }
                return;
            }
        }
        arrayList.add(view2);
    }

    public void u(Map map, View view) {
        String q7 = AbstractC0421s.q(view);
        if (q7 != null) {
            map.put(q7, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    public void v(C1958a c1958a, Collection collection) {
        Iterator it = c1958a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(AbstractC0421s.q((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    public final void w(List list, List list2, boolean z7, Map map) {
        StringBuilder sb;
        String str;
        f.d e7;
        ViewGroup m7 = m();
        Context context = m7.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.d() || (e7 = kVar.e(context)) == null) {
                kVar.a();
            } else {
                Animator animator = e7.f9424b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    B.e b7 = kVar.b();
                    Fragment f7 = b7.f();
                    if (Boolean.TRUE.equals(map.get(b7))) {
                        if (n.D0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + f7 + " as this Fragment was involved in a Transition.");
                        }
                        kVar.a();
                    } else {
                        boolean z9 = b7.e() == B.e.c.GONE;
                        if (z9) {
                            list2.remove(b7);
                        }
                        View view = f7.f9257V;
                        m7.startViewTransition(view);
                        animator.addListener(new C0158c(m7, view, z9, b7, kVar));
                        animator.setTarget(view);
                        animator.start();
                        kVar.c().c(new d(animator));
                        z8 = true;
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar2 = (k) it2.next();
            B.e b8 = kVar2.b();
            Fragment f8 = b8.f();
            if (z7) {
                if (n.D0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f8);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else if (z8) {
                if (n.D0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f8);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else {
                View view2 = f8.f9257V;
                Animation animation = (Animation) H.e.b(((f.d) H.e.b(kVar2.e(context))).f9423a);
                if (b8.e() != B.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.a();
                } else {
                    m7.startViewTransition(view2);
                    f.e eVar = new f.e(animation, m7, view2);
                    eVar.setAnimationListener(new e(m7, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().c(new f(view2, m7, kVar2));
            }
        }
    }

    public final Map x(List list, boolean z7, B.e eVar, B.e eVar2) {
        View view;
        Object obj;
        B.e eVar3;
        ArrayList arrayList;
        Object obj2;
        ArrayList arrayList2;
        B.e eVar4;
        View view2;
        C1958a c1958a;
        ArrayList arrayList3;
        B.e eVar5;
        ArrayList arrayList4;
        Rect rect;
        View view3;
        y yVar;
        B.e eVar6;
        View view4;
        boolean z8 = z7;
        B.e eVar7 = eVar;
        B.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        y yVar2 = null;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!mVar.d()) {
                y e7 = mVar.e();
                if (yVar2 == null) {
                    yVar2 = e7;
                } else if (e7 != null && yVar2 != e7) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (yVar2 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m mVar2 = (m) it2.next();
                hashMap.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap;
        }
        View view5 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C1958a c1958a2 = new C1958a();
        Iterator it3 = list.iterator();
        Object obj3 = null;
        View view6 = null;
        boolean z9 = false;
        while (it3.hasNext()) {
            m mVar3 = (m) it3.next();
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                c1958a = c1958a2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                yVar = yVar2;
                eVar6 = eVar8;
                view6 = view6;
            } else {
                Object B7 = yVar2.B(yVar2.g(mVar3.g()));
                ArrayList N6 = eVar2.f().N();
                ArrayList N7 = eVar.f().N();
                ArrayList O6 = eVar.f().O();
                View view7 = view6;
                int i7 = 0;
                while (i7 < O6.size()) {
                    int indexOf = N6.indexOf(O6.get(i7));
                    ArrayList arrayList7 = O6;
                    if (indexOf != -1) {
                        N6.set(indexOf, N7.get(i7));
                    }
                    i7++;
                    O6 = arrayList7;
                }
                ArrayList O7 = eVar2.f().O();
                Fragment f7 = eVar.f();
                if (z8) {
                    f7.v();
                    eVar2.f().x();
                } else {
                    f7.x();
                    eVar2.f().v();
                }
                int i8 = 0;
                for (int size = N6.size(); i8 < size; size = size) {
                    c1958a2.put((String) N6.get(i8), (String) O7.get(i8));
                    i8++;
                }
                C1958a c1958a3 = new C1958a();
                u(c1958a3, eVar.f().f9257V);
                c1958a3.p(N6);
                c1958a2.p(c1958a3.keySet());
                C1958a c1958a4 = new C1958a();
                u(c1958a4, eVar2.f().f9257V);
                c1958a4.p(O7);
                c1958a4.p(c1958a2.values());
                w.x(c1958a2, c1958a4);
                v(c1958a3, c1958a2.keySet());
                v(c1958a4, c1958a2.values());
                if (c1958a2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    c1958a = c1958a2;
                    arrayList3 = arrayList6;
                    eVar5 = eVar7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    yVar = yVar2;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    w.f(eVar2.f(), eVar.f(), z8, c1958a3, true);
                    c1958a = c1958a2;
                    ArrayList arrayList8 = arrayList6;
                    ViewTreeObserverOnPreDrawListenerC0420q.a(m(), new g(eVar2, eVar, z7, c1958a4));
                    Iterator it4 = c1958a3.values().iterator();
                    while (it4.hasNext()) {
                        t(arrayList5, (View) it4.next());
                    }
                    if (N6.isEmpty()) {
                        view6 = view7;
                    } else {
                        view6 = (View) c1958a3.get((String) N6.get(0));
                        yVar2.v(B7, view6);
                    }
                    Iterator it5 = c1958a4.values().iterator();
                    while (it5.hasNext()) {
                        t(arrayList8, (View) it5.next());
                    }
                    arrayList3 = arrayList8;
                    if (!O7.isEmpty() && (view4 = (View) c1958a4.get((String) O7.get(0))) != null) {
                        ViewTreeObserverOnPreDrawListenerC0420q.a(m(), new h(yVar2, view4, rect2));
                        z9 = true;
                    }
                    yVar2.z(B7, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    yVar = yVar2;
                    yVar2.t(B7, null, null, null, null, B7, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = B7;
                }
            }
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar6;
            c1958a2 = c1958a;
            z8 = z7;
            arrayList6 = arrayList3;
            yVar2 = yVar;
        }
        View view8 = view6;
        C1958a c1958a5 = c1958a2;
        ArrayList arrayList9 = arrayList6;
        B.e eVar9 = eVar7;
        ArrayList arrayList10 = arrayList5;
        Rect rect3 = rect2;
        View view9 = view5;
        y yVar3 = yVar2;
        boolean z10 = false;
        B.e eVar10 = eVar8;
        ArrayList arrayList11 = new ArrayList();
        Iterator it6 = list.iterator();
        Object obj4 = null;
        Object obj5 = null;
        while (it6.hasNext()) {
            m mVar4 = (m) it6.next();
            if (mVar4.d()) {
                hashMap.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object g7 = yVar3.g(mVar4.h());
                B.e b7 = mVar4.b();
                boolean z11 = (obj3 == null || !(b7 == eVar9 || b7 == eVar10)) ? z10 : true;
                if (g7 == null) {
                    if (!z11) {
                        hashMap.put(b7, Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                    view = view9;
                    eVar4 = eVar10;
                    view2 = view8;
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    Object obj6 = obj4;
                    t(arrayList12, b7.f().f9257V);
                    if (z11) {
                        if (b7 == eVar9) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        yVar3.a(g7, view9);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view9;
                        obj2 = obj5;
                        eVar4 = eVar10;
                        obj = obj6;
                        eVar3 = b7;
                    } else {
                        yVar3.b(g7, arrayList12);
                        view = view9;
                        obj = obj6;
                        eVar3 = b7;
                        arrayList = arrayList10;
                        obj2 = obj5;
                        arrayList2 = arrayList9;
                        eVar4 = eVar10;
                        yVar3.t(g7, g7, arrayList12, null, null, null, null);
                        if (eVar3.e() == B.e.c.GONE) {
                            yVar3.r(g7, eVar3.f().f9257V, arrayList12);
                            ViewTreeObserverOnPreDrawListenerC0420q.a(m(), new i(arrayList12));
                        }
                    }
                    if (eVar3.e() == B.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z9) {
                            yVar3.u(g7, rect3);
                        }
                        view2 = view8;
                    } else {
                        view2 = view8;
                        yVar3.v(g7, view2);
                    }
                    hashMap.put(eVar3, Boolean.TRUE);
                    if (mVar4.j()) {
                        obj5 = yVar3.n(obj2, g7, null);
                        obj4 = obj;
                    } else {
                        obj4 = yVar3.n(obj, g7, null);
                        obj5 = obj2;
                    }
                }
                eVar10 = eVar4;
                view8 = view2;
                view9 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
                z10 = false;
            }
        }
        ArrayList arrayList13 = arrayList9;
        ArrayList arrayList14 = arrayList10;
        B.e eVar11 = eVar10;
        Object m7 = yVar3.m(obj5, obj4, obj3);
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            m mVar5 = (m) it7.next();
            if (!mVar5.d()) {
                Object h7 = mVar5.h();
                B.e b8 = mVar5.b();
                boolean z12 = obj3 != null && (b8 == eVar9 || b8 == eVar11);
                if (h7 != null || z12) {
                    yVar3.w(mVar5.b().f(), m7, mVar5.c(), new j(mVar5));
                }
            }
        }
        w.A(arrayList11, 4);
        ArrayList o7 = yVar3.o(arrayList13);
        yVar3.c(m(), m7);
        yVar3.y(m(), arrayList14, arrayList13, o7, c1958a5);
        w.A(arrayList11, 0);
        yVar3.A(obj3, arrayList14, arrayList13);
        return hashMap;
    }
}
