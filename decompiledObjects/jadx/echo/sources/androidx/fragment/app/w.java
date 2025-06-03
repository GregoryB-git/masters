package androidx.fragment.app;

import I.AbstractC0421s;
import I.ViewTreeObserverOnPreDrawListenerC0420q;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import t.C1958a;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f9577a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    public static final y f9578b = new x();

    /* renamed from: c, reason: collision with root package name */
    public static final y f9579c = w();

    public class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ g f9580o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Fragment f9581p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ E.c f9582q;

        public a(g gVar, Fragment fragment, E.c cVar) {
            this.f9580o = gVar;
            this.f9581p = fragment;
            this.f9582q = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9580o.a(this.f9581p, this.f9582q);
        }
    }

    public class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9583o;

        public b(ArrayList arrayList) {
            this.f9583o = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.A(this.f9583o, 4);
        }
    }

    public class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ g f9584o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Fragment f9585p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ E.c f9586q;

        public c(g gVar, Fragment fragment, E.c cVar) {
            this.f9584o = gVar;
            this.f9585p = fragment;
            this.f9586q = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9584o.a(this.f9585p, this.f9586q);
        }
    }

    public class d implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Object f9587o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ y f9588p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ View f9589q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Fragment f9590r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9591s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9592t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9593u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Object f9594v;

        public d(Object obj, y yVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f9587o = obj;
            this.f9588p = yVar;
            this.f9589q = view;
            this.f9590r = fragment;
            this.f9591s = arrayList;
            this.f9592t = arrayList2;
            this.f9593u = arrayList3;
            this.f9594v = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f9587o;
            if (obj != null) {
                this.f9588p.p(obj, this.f9589q);
                this.f9592t.addAll(w.k(this.f9588p, this.f9587o, this.f9590r, this.f9591s, this.f9589q));
            }
            if (this.f9593u != null) {
                if (this.f9594v != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f9589q);
                    this.f9588p.q(this.f9594v, this.f9593u, arrayList);
                }
                this.f9593u.clear();
                this.f9593u.add(this.f9589q);
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Fragment f9595o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Fragment f9596p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f9597q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C1958a f9598r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ View f9599s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ y f9600t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Rect f9601u;

        public e(Fragment fragment, Fragment fragment2, boolean z7, C1958a c1958a, View view, y yVar, Rect rect) {
            this.f9595o = fragment;
            this.f9596p = fragment2;
            this.f9597q = z7;
            this.f9598r = c1958a;
            this.f9599s = view;
            this.f9600t = yVar;
            this.f9601u = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.f(this.f9595o, this.f9596p, this.f9597q, this.f9598r, false);
            View view = this.f9599s;
            if (view != null) {
                this.f9600t.k(view, this.f9601u);
            }
        }
    }

    public class f implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ y f9602o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C1958a f9603p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Object f9604q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ h f9605r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9606s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ View f9607t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Fragment f9608u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Fragment f9609v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f9610w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9611x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Object f9612y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Rect f9613z;

        public f(y yVar, C1958a c1958a, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z7, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f9602o = yVar;
            this.f9603p = c1958a;
            this.f9604q = obj;
            this.f9605r = hVar;
            this.f9606s = arrayList;
            this.f9607t = view;
            this.f9608u = fragment;
            this.f9609v = fragment2;
            this.f9610w = z7;
            this.f9611x = arrayList2;
            this.f9612y = obj2;
            this.f9613z = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1958a h7 = w.h(this.f9602o, this.f9603p, this.f9604q, this.f9605r);
            if (h7 != null) {
                this.f9606s.addAll(h7.values());
                this.f9606s.add(this.f9607t);
            }
            w.f(this.f9608u, this.f9609v, this.f9610w, h7, false);
            Object obj = this.f9604q;
            if (obj != null) {
                this.f9602o.A(obj, this.f9611x, this.f9606s);
                View s7 = w.s(h7, this.f9605r, this.f9612y, this.f9610w);
                if (s7 != null) {
                    this.f9602o.k(s7, this.f9613z);
                }
            }
        }
    }

    public interface g {
        void a(Fragment fragment, E.c cVar);

        void b(Fragment fragment, E.c cVar);
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public Fragment f9614a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f9615b;

        /* renamed from: c, reason: collision with root package name */
        public C0779a f9616c;

        /* renamed from: d, reason: collision with root package name */
        public Fragment f9617d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f9618e;

        /* renamed from: f, reason: collision with root package name */
        public C0779a f9619f;
    }

    public static void A(ArrayList arrayList, int i7) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i7);
        }
    }

    public static void B(Context context, androidx.fragment.app.g gVar, ArrayList arrayList, ArrayList arrayList2, int i7, int i8, boolean z7, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i9 = i7; i9 < i8; i9++) {
            C0779a c0779a = (C0779a) arrayList.get(i9);
            if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                e(c0779a, sparseArray, z7);
            } else {
                c(c0779a, sparseArray, z7);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                C1958a d7 = d(keyAt, arrayList, arrayList2, i7, i8);
                h hVar = (h) sparseArray.valueAt(i10);
                if (gVar.f() && (viewGroup = (ViewGroup) gVar.e(keyAt)) != null) {
                    if (z7) {
                        o(viewGroup, hVar, view, d7, gVar2);
                    } else {
                        n(viewGroup, hVar, view, d7, gVar2);
                    }
                }
            }
        }
    }

    public static void a(ArrayList arrayList, C1958a c1958a, Collection collection) {
        for (int size = c1958a.size() - 1; size >= 0; size--) {
            View view = (View) c1958a.l(size);
            if (collection.contains(AbstractC0421s.q(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0039, code lost:
    
        if (r0.f9286z != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x003b, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0053, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x008e, code lost:
    
        if (r0.f9249N == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(androidx.fragment.app.C0779a r8, androidx.fragment.app.v.a r9, android.util.SparseArray r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.b(androidx.fragment.app.a, androidx.fragment.app.v$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(C0779a c0779a, SparseArray sparseArray, boolean z7) {
        int size = c0779a.f9552c.size();
        for (int i7 = 0; i7 < size; i7++) {
            b(c0779a, (v.a) c0779a.f9552c.get(i7), sparseArray, false, z7);
        }
    }

    public static C1958a d(int i7, ArrayList arrayList, ArrayList arrayList2, int i8, int i9) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        C1958a c1958a = new C1958a();
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            C0779a c0779a = (C0779a) arrayList.get(i10);
            if (c0779a.u(i7)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i10)).booleanValue();
                ArrayList arrayList5 = c0779a.f9565p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = c0779a.f9565p;
                        arrayList4 = c0779a.f9566q;
                    } else {
                        ArrayList arrayList6 = c0779a.f9565p;
                        arrayList3 = c0779a.f9566q;
                        arrayList4 = arrayList6;
                    }
                    for (int i11 = 0; i11 < size; i11++) {
                        String str = (String) arrayList4.get(i11);
                        String str2 = (String) arrayList3.get(i11);
                        String str3 = (String) c1958a.remove(str2);
                        if (str3 != null) {
                            c1958a.put(str, str3);
                        } else {
                            c1958a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c1958a;
    }

    public static void e(C0779a c0779a, SparseArray sparseArray, boolean z7) {
        if (c0779a.f9324t.n0().f()) {
            for (int size = c0779a.f9552c.size() - 1; size >= 0; size--) {
                b(c0779a, (v.a) c0779a.f9552c.get(size), sparseArray, true, z7);
            }
        }
    }

    public static void f(Fragment fragment, Fragment fragment2, boolean z7, C1958a c1958a, boolean z8) {
        if (z7) {
            fragment2.v();
        } else {
            fragment.v();
        }
    }

    public static boolean g(y yVar, List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!yVar.e(list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public static C1958a h(y yVar, C1958a c1958a, Object obj, h hVar) {
        ArrayList arrayList;
        Fragment fragment = hVar.f9614a;
        View R6 = fragment.R();
        if (c1958a.isEmpty() || obj == null || R6 == null) {
            c1958a.clear();
            return null;
        }
        C1958a c1958a2 = new C1958a();
        yVar.j(c1958a2, R6);
        C0779a c0779a = hVar.f9616c;
        if (hVar.f9615b) {
            fragment.x();
            arrayList = c0779a.f9565p;
        } else {
            fragment.v();
            arrayList = c0779a.f9566q;
        }
        if (arrayList != null) {
            c1958a2.p(arrayList);
            c1958a2.p(c1958a.values());
        }
        x(c1958a, c1958a2);
        return c1958a2;
    }

    public static C1958a i(y yVar, C1958a c1958a, Object obj, h hVar) {
        ArrayList arrayList;
        if (c1958a.isEmpty() || obj == null) {
            c1958a.clear();
            return null;
        }
        Fragment fragment = hVar.f9617d;
        C1958a c1958a2 = new C1958a();
        yVar.j(c1958a2, fragment.q1());
        C0779a c0779a = hVar.f9619f;
        if (hVar.f9618e) {
            fragment.v();
            arrayList = c0779a.f9566q;
        } else {
            fragment.x();
            arrayList = c0779a.f9565p;
        }
        if (arrayList != null) {
            c1958a2.p(arrayList);
        }
        c1958a.p(c1958a2.keySet());
        return c1958a2;
    }

    public static y j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object w7 = fragment.w();
            if (w7 != null) {
                arrayList.add(w7);
            }
            Object K6 = fragment.K();
            if (K6 != null) {
                arrayList.add(K6);
            }
            Object M6 = fragment.M();
            if (M6 != null) {
                arrayList.add(M6);
            }
        }
        if (fragment2 != null) {
            Object u7 = fragment2.u();
            if (u7 != null) {
                arrayList.add(u7);
            }
            Object H6 = fragment2.H();
            if (H6 != null) {
                arrayList.add(H6);
            }
            Object L6 = fragment2.L();
            if (L6 != null) {
                arrayList.add(L6);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        y yVar = f9578b;
        if (yVar != null && g(yVar, arrayList)) {
            return yVar;
        }
        y yVar2 = f9579c;
        if (yVar2 != null && g(yVar2, arrayList)) {
            return yVar2;
        }
        if (yVar == null && yVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList k(y yVar, Object obj, Fragment fragment, ArrayList arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View R6 = fragment.R();
        if (R6 != null) {
            yVar.f(arrayList2, R6);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        yVar.b(obj, arrayList2);
        return arrayList2;
    }

    public static Object l(y yVar, ViewGroup viewGroup, View view, C1958a c1958a, h hVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Object t7;
        C1958a c1958a2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f9614a;
        Fragment fragment2 = hVar.f9617d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z7 = hVar.f9615b;
        if (c1958a.isEmpty()) {
            c1958a2 = c1958a;
            t7 = null;
        } else {
            t7 = t(yVar, fragment, fragment2, z7);
            c1958a2 = c1958a;
        }
        C1958a i7 = i(yVar, c1958a2, t7, hVar);
        if (c1958a.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(i7.values());
            obj3 = t7;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z7, i7, true);
        if (obj3 != null) {
            rect = new Rect();
            yVar.z(obj3, view, arrayList);
            z(yVar, obj3, obj2, i7, hVar.f9618e, hVar.f9619f);
            if (obj != null) {
                yVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0420q.a(viewGroup, new f(yVar, c1958a, obj3, hVar, arrayList2, view, fragment, fragment2, z7, arrayList, obj, rect));
        return obj3;
    }

    public static Object m(y yVar, ViewGroup viewGroup, View view, C1958a c1958a, h hVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f9614a;
        Fragment fragment2 = hVar.f9617d;
        if (fragment != null) {
            fragment.q1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z7 = hVar.f9615b;
        Object t7 = c1958a.isEmpty() ? null : t(yVar, fragment, fragment2, z7);
        C1958a i7 = i(yVar, c1958a, t7, hVar);
        C1958a h7 = h(yVar, c1958a, t7, hVar);
        if (c1958a.isEmpty()) {
            if (i7 != null) {
                i7.clear();
            }
            if (h7 != null) {
                h7.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i7, c1958a.keySet());
            a(arrayList2, h7, c1958a.values());
            obj3 = t7;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z7, i7, true);
        if (obj3 != null) {
            arrayList2.add(view);
            yVar.z(obj3, view, arrayList);
            z(yVar, obj3, obj2, i7, hVar.f9618e, hVar.f9619f);
            Rect rect2 = new Rect();
            View s7 = s(h7, hVar, obj, z7);
            if (s7 != null) {
                yVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = s7;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0420q.a(viewGroup, new e(fragment, fragment2, z7, h7, view2, yVar, rect));
        return obj3;
    }

    public static void n(ViewGroup viewGroup, h hVar, View view, C1958a c1958a, g gVar) {
        Object obj;
        Fragment fragment = hVar.f9614a;
        Fragment fragment2 = hVar.f9617d;
        y j7 = j(fragment2, fragment);
        if (j7 == null) {
            return;
        }
        boolean z7 = hVar.f9615b;
        boolean z8 = hVar.f9618e;
        Object q7 = q(j7, fragment, z7);
        Object r7 = r(j7, fragment2, z8);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object l7 = l(j7, viewGroup, view, c1958a, hVar, arrayList, arrayList2, q7, r7);
        if (q7 == null && l7 == null) {
            obj = r7;
            if (obj == null) {
                return;
            }
        } else {
            obj = r7;
        }
        ArrayList k7 = k(j7, obj, fragment2, arrayList, view);
        if (k7 == null || k7.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        j7.a(q7, view);
        Object u7 = u(j7, q7, obj2, l7, fragment, hVar.f9615b);
        if (fragment2 != null && k7 != null && (k7.size() > 0 || arrayList.size() > 0)) {
            E.c cVar = new E.c();
            gVar.b(fragment2, cVar);
            j7.w(fragment2, u7, cVar, new c(gVar, fragment2, cVar));
        }
        if (u7 != null) {
            ArrayList arrayList3 = new ArrayList();
            j7.t(u7, q7, arrayList3, obj2, k7, l7, arrayList2);
            y(j7, viewGroup, fragment, view, arrayList2, q7, arrayList3, obj2, k7);
            j7.x(viewGroup, arrayList2, c1958a);
            j7.c(viewGroup, u7);
            j7.s(viewGroup, arrayList2, c1958a);
        }
    }

    public static void o(ViewGroup viewGroup, h hVar, View view, C1958a c1958a, g gVar) {
        Object obj;
        Fragment fragment = hVar.f9614a;
        Fragment fragment2 = hVar.f9617d;
        y j7 = j(fragment2, fragment);
        if (j7 == null) {
            return;
        }
        boolean z7 = hVar.f9615b;
        boolean z8 = hVar.f9618e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object q7 = q(j7, fragment, z7);
        Object r7 = r(j7, fragment2, z8);
        Object m7 = m(j7, viewGroup, view, c1958a, hVar, arrayList2, arrayList, q7, r7);
        if (q7 == null && m7 == null) {
            obj = r7;
            if (obj == null) {
                return;
            }
        } else {
            obj = r7;
        }
        ArrayList k7 = k(j7, obj, fragment2, arrayList2, view);
        ArrayList k8 = k(j7, q7, fragment, arrayList, view);
        A(k8, 4);
        Object u7 = u(j7, q7, obj, m7, fragment, z7);
        if (fragment2 != null && k7 != null && (k7.size() > 0 || arrayList2.size() > 0)) {
            E.c cVar = new E.c();
            gVar.b(fragment2, cVar);
            j7.w(fragment2, u7, cVar, new a(gVar, fragment2, cVar));
        }
        if (u7 != null) {
            v(j7, obj, fragment2, k7);
            ArrayList o7 = j7.o(arrayList);
            j7.t(u7, q7, k8, obj, k7, m7, arrayList);
            j7.c(viewGroup, u7);
            j7.y(viewGroup, arrayList2, arrayList, o7, c1958a);
            A(k8, 0);
            j7.A(m7, arrayList2, arrayList);
        }
    }

    public static h p(h hVar, SparseArray sparseArray, int i7) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i7, hVar2);
        return hVar2;
    }

    public static Object q(y yVar, Fragment fragment, boolean z7) {
        if (fragment == null) {
            return null;
        }
        return yVar.g(z7 ? fragment.H() : fragment.u());
    }

    public static Object r(y yVar, Fragment fragment, boolean z7) {
        if (fragment == null) {
            return null;
        }
        return yVar.g(z7 ? fragment.K() : fragment.w());
    }

    public static View s(C1958a c1958a, h hVar, Object obj, boolean z7) {
        ArrayList arrayList;
        C0779a c0779a = hVar.f9616c;
        if (obj == null || c1958a == null || (arrayList = c0779a.f9565p) == null || arrayList.isEmpty()) {
            return null;
        }
        return (View) c1958a.get((String) (z7 ? c0779a.f9565p : c0779a.f9566q).get(0));
    }

    public static Object t(y yVar, Fragment fragment, Fragment fragment2, boolean z7) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return yVar.B(yVar.g(z7 ? fragment2.M() : fragment.L()));
    }

    public static Object u(y yVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z7) {
        if (obj != null && obj2 != null && fragment != null) {
            if (!(z7 ? fragment.p() : fragment.o())) {
                return yVar.m(obj2, obj, obj3);
            }
        }
        return yVar.n(obj2, obj, obj3);
    }

    public static void v(y yVar, Object obj, Fragment fragment, ArrayList arrayList) {
        if (fragment != null && obj != null && fragment.f9286z && fragment.f9249N && fragment.f9263b0) {
            fragment.y1(true);
            yVar.r(obj, fragment.R(), arrayList);
            ViewTreeObserverOnPreDrawListenerC0420q.a(fragment.f9256U, new b(arrayList));
        }
    }

    public static y w() {
        try {
            return (y) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void x(C1958a c1958a, C1958a c1958a2) {
        for (int size = c1958a.size() - 1; size >= 0; size--) {
            if (!c1958a2.containsKey((String) c1958a.l(size))) {
                c1958a.j(size);
            }
        }
    }

    public static void y(y yVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList arrayList, Object obj, ArrayList arrayList2, Object obj2, ArrayList arrayList3) {
        ViewTreeObserverOnPreDrawListenerC0420q.a(viewGroup, new d(obj, yVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    public static void z(y yVar, Object obj, Object obj2, C1958a c1958a, boolean z7, C0779a c0779a) {
        ArrayList arrayList = c0779a.f9565p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = (View) c1958a.get((String) (z7 ? c0779a.f9566q : c0779a.f9565p).get(0));
        yVar.v(obj, view);
        if (obj2 != null) {
            yVar.v(obj2, view);
        }
    }
}
