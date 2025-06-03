package x0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import io.meduza.meduza.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import x0.e;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f16736a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16737b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f16738c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16739d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16740e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f16741a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f16742b;

        public boolean a() {
            return this instanceof e.c;
        }

        public void b(ViewGroup viewGroup) {
            ec.i.e(viewGroup, "container");
        }

        public void c(ViewGroup viewGroup) {
            ec.i.e(viewGroup, "container");
        }

        public void d(b.b bVar, ViewGroup viewGroup) {
            ec.i.e(bVar, "backEvent");
            ec.i.e(viewGroup, "container");
        }

        public void e(ViewGroup viewGroup) {
        }
    }

    public static final class b extends c {

        /* renamed from: l, reason: collision with root package name */
        public final e0 f16743l;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(int r3, int r4, x0.e0 r5) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                a0.j.p(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                a0.j.p(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                ec.i.e(r5, r0)
                x0.i r0 = r5.f16601c
                java.lang.String r1 = "fragmentStateManager.fragment"
                ec.i.d(r0, r1)
                r2.<init>(r3, r4, r0)
                r2.f16743l = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.r0.b.<init>(int, int, x0.e0):void");
        }

        @Override // x0.r0.c
        public final void b() {
            super.b();
            this.f16746c.mTransitioning = false;
            this.f16743l.k();
        }

        @Override // x0.r0.c
        public final void e() {
            if (this.f16750h) {
                return;
            }
            this.f16750h = true;
            int i10 = this.f16745b;
            if (i10 != 2) {
                if (i10 == 3) {
                    i iVar = this.f16743l.f16601c;
                    ec.i.d(iVar, "fragmentStateManager.fragment");
                    View requireView = iVar.requireView();
                    ec.i.d(requireView, "fragment.requireView()");
                    if (y.L(2)) {
                        StringBuilder l10 = defpackage.f.l("Clearing focus ");
                        l10.append(requireView.findFocus());
                        l10.append(" on view ");
                        l10.append(requireView);
                        l10.append(" for Fragment ");
                        l10.append(iVar);
                        Log.v("FragmentManager", l10.toString());
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            i iVar2 = this.f16743l.f16601c;
            ec.i.d(iVar2, "fragmentStateManager.fragment");
            View findFocus = iVar2.mView.findFocus();
            if (findFocus != null) {
                iVar2.setFocusedView(findFocus);
                if (y.L(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + iVar2);
                }
            }
            View requireView2 = this.f16746c.requireView();
            ec.i.d(requireView2, "this.fragment.requireView()");
            if (requireView2.getParent() == null) {
                this.f16743l.b();
                requireView2.setAlpha(0.0f);
            }
            if ((requireView2.getAlpha() == 0.0f) && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(iVar2.getPostOnViewCreatedAlpha());
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f16744a;

        /* renamed from: b, reason: collision with root package name */
        public int f16745b;

        /* renamed from: c, reason: collision with root package name */
        public final i f16746c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f16747d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f16748e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f16749g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f16750h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f16751i;

        /* renamed from: j, reason: collision with root package name */
        public final ArrayList f16752j;

        /* renamed from: k, reason: collision with root package name */
        public final ArrayList f16753k;

        public c(int i10, int i11, i iVar) {
            a0.j.p(i10, "finalState");
            a0.j.p(i11, "lifecycleImpact");
            this.f16744a = i10;
            this.f16745b = i11;
            this.f16746c = iVar;
            this.f16747d = new ArrayList();
            this.f16751i = true;
            ArrayList arrayList = new ArrayList();
            this.f16752j = arrayList;
            this.f16753k = arrayList;
        }

        public final void a(ViewGroup viewGroup) {
            ec.i.e(viewGroup, "container");
            this.f16750h = false;
            if (this.f16748e) {
                return;
            }
            this.f16748e = true;
            if (this.f16752j.isEmpty()) {
                b();
                return;
            }
            for (a aVar : sb.q.u(this.f16753k)) {
                aVar.getClass();
                if (!aVar.f16742b) {
                    aVar.b(viewGroup);
                }
                aVar.f16742b = true;
            }
        }

        public void b() {
            this.f16750h = false;
            if (this.f) {
                return;
            }
            if (y.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f = true;
            Iterator it = this.f16747d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(a aVar) {
            ec.i.e(aVar, "effect");
            if (this.f16752j.remove(aVar) && this.f16752j.isEmpty()) {
                b();
            }
        }

        public final void d(int i10, int i11) {
            a0.j.p(i10, "finalState");
            a0.j.p(i11, "lifecycleImpact");
            if (i11 == 0) {
                throw null;
            }
            int i12 = i11 - 1;
            if (i12 == 0) {
                if (this.f16744a != 1) {
                    if (y.L(2)) {
                        StringBuilder l10 = defpackage.f.l("SpecialEffectsController: For fragment ");
                        l10.append(this.f16746c);
                        l10.append(" mFinalState = ");
                        l10.append(a0.j.y(this.f16744a));
                        l10.append(" -> ");
                        l10.append(a0.j.y(i10));
                        l10.append('.');
                        Log.v("FragmentManager", l10.toString());
                    }
                    this.f16744a = i10;
                    return;
                }
                return;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    return;
                }
                if (y.L(2)) {
                    StringBuilder l11 = defpackage.f.l("SpecialEffectsController: For fragment ");
                    l11.append(this.f16746c);
                    l11.append(" mFinalState = ");
                    l11.append(a0.j.y(this.f16744a));
                    l11.append(" -> REMOVED. mLifecycleImpact  = ");
                    l11.append(defpackage.g.t(this.f16745b));
                    l11.append(" to REMOVING.");
                    Log.v("FragmentManager", l11.toString());
                }
                this.f16744a = 1;
                this.f16745b = 3;
            } else {
                if (this.f16744a != 1) {
                    return;
                }
                if (y.L(2)) {
                    StringBuilder l12 = defpackage.f.l("SpecialEffectsController: For fragment ");
                    l12.append(this.f16746c);
                    l12.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    l12.append(defpackage.g.t(this.f16745b));
                    l12.append(" to ADDING.");
                    Log.v("FragmentManager", l12.toString());
                }
                this.f16744a = 2;
                this.f16745b = 2;
            }
            this.f16751i = true;
        }

        public void e() {
            this.f16750h = true;
        }

        public final String toString() {
            StringBuilder m10 = defpackage.f.m("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            m10.append(a0.j.y(this.f16744a));
            m10.append(" lifecycleImpact = ");
            m10.append(defpackage.g.t(this.f16745b));
            m10.append(" fragment = ");
            m10.append(this.f16746c);
            m10.append('}');
            return m10.toString();
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16754a;

        static {
            int[] iArr = new int[q0.g.d(3).length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f16754a = iArr;
        }
    }

    public r0(ViewGroup viewGroup) {
        ec.i.e(viewGroup, "container");
        this.f16736a = viewGroup;
        this.f16737b = new ArrayList();
        this.f16738c = new ArrayList();
    }

    public static final r0 m(ViewGroup viewGroup, y yVar) {
        ec.i.e(viewGroup, "container");
        ec.i.e(yVar, "fragmentManager");
        ec.i.d(yVar.J(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof r0) {
            return (r0) tag;
        }
        e eVar = new e(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, eVar);
        return eVar;
    }

    public final void a(c cVar) {
        ec.i.e(cVar, "operation");
        if (cVar.f16751i) {
            int i10 = cVar.f16744a;
            View requireView = cVar.f16746c.requireView();
            ec.i.d(requireView, "operation.fragment.requireView()");
            a0.j.a(i10, requireView, this.f16736a);
            cVar.f16751i = false;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z10);

    public final void c(ArrayList arrayList) {
        ec.i.e(arrayList, "operations");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.o.k(((c) it.next()).f16753k, arrayList2);
        }
        List u10 = sb.q.u(sb.q.x(arrayList2));
        int size = u10.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a) u10.get(i10)).c(this.f16736a);
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a((c) arrayList.get(i11));
        }
        List u11 = sb.q.u(arrayList);
        int size3 = u11.size();
        for (int i12 = 0; i12 < size3; i12++) {
            c cVar = (c) u11.get(i12);
            if (cVar.f16753k.isEmpty()) {
                cVar.b();
            }
        }
    }

    public final void d(int i10, int i11, e0 e0Var) {
        synchronized (this.f16737b) {
            i iVar = e0Var.f16601c;
            ec.i.d(iVar, "fragmentStateManager.fragment");
            c j10 = j(iVar);
            if (j10 == null) {
                i iVar2 = e0Var.f16601c;
                j10 = iVar2.mTransitioning ? k(iVar2) : null;
            }
            if (j10 != null) {
                j10.d(i10, i11);
                return;
            }
            b bVar = new b(i10, i11, e0Var);
            this.f16737b.add(bVar);
            bVar.f16747d.add(new q0(0, this, bVar));
            bVar.f16747d.add(new w.g(3, this, bVar));
            rb.h hVar = rb.h.f13851a;
        }
    }

    public final void e(int i10, e0 e0Var) {
        a0.j.p(i10, "finalState");
        ec.i.e(e0Var, "fragmentStateManager");
        if (y.L(2)) {
            StringBuilder l10 = defpackage.f.l("SpecialEffectsController: Enqueuing add operation for fragment ");
            l10.append(e0Var.f16601c);
            Log.v("FragmentManager", l10.toString());
        }
        d(i10, 2, e0Var);
    }

    public final void f(e0 e0Var) {
        ec.i.e(e0Var, "fragmentStateManager");
        if (y.L(2)) {
            StringBuilder l10 = defpackage.f.l("SpecialEffectsController: Enqueuing hide operation for fragment ");
            l10.append(e0Var.f16601c);
            Log.v("FragmentManager", l10.toString());
        }
        d(3, 1, e0Var);
    }

    public final void g(e0 e0Var) {
        ec.i.e(e0Var, "fragmentStateManager");
        if (y.L(2)) {
            StringBuilder l10 = defpackage.f.l("SpecialEffectsController: Enqueuing remove operation for fragment ");
            l10.append(e0Var.f16601c);
            Log.v("FragmentManager", l10.toString());
        }
        d(1, 3, e0Var);
    }

    public final void h(e0 e0Var) {
        ec.i.e(e0Var, "fragmentStateManager");
        if (y.L(2)) {
            StringBuilder l10 = defpackage.f.l("SpecialEffectsController: Enqueuing show operation for fragment ");
            l10.append(e0Var.f16601c);
            Log.v("FragmentManager", l10.toString());
        }
        d(2, 1, e0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0180 A[Catch: all -> 0x01b2, TryCatch #0 {, blocks: (B:12:0x0017, B:14:0x0020, B:15:0x002f, B:17:0x0035, B:19:0x0041, B:20:0x005c, B:23:0x006e, B:26:0x0072, B:30:0x006b, B:32:0x01ae, B:36:0x0078, B:37:0x0087, B:39:0x008e, B:41:0x009a, B:42:0x00b0, B:45:0x00c7, B:48:0x00cb, B:53:0x00c2, B:54:0x00c4, B:56:0x00d1, B:60:0x00e2, B:62:0x00f2, B:63:0x00f9, B:64:0x010a, B:66:0x0110, B:68:0x011f, B:70:0x0125, B:76:0x014a, B:83:0x012c, B:84:0x0130, B:86:0x0136, B:94:0x0154, B:96:0x0158, B:97:0x0161, B:99:0x0167, B:101:0x0173, B:104:0x017c, B:106:0x0180, B:107:0x019f, B:109:0x01a7, B:111:0x0189, B:113:0x0193), top: B:11:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a7 A[Catch: all -> 0x01b2, TryCatch #0 {, blocks: (B:12:0x0017, B:14:0x0020, B:15:0x002f, B:17:0x0035, B:19:0x0041, B:20:0x005c, B:23:0x006e, B:26:0x0072, B:30:0x006b, B:32:0x01ae, B:36:0x0078, B:37:0x0087, B:39:0x008e, B:41:0x009a, B:42:0x00b0, B:45:0x00c7, B:48:0x00cb, B:53:0x00c2, B:54:0x00c4, B:56:0x00d1, B:60:0x00e2, B:62:0x00f2, B:63:0x00f9, B:64:0x010a, B:66:0x0110, B:68:0x011f, B:70:0x0125, B:76:0x014a, B:83:0x012c, B:84:0x0130, B:86:0x0136, B:94:0x0154, B:96:0x0158, B:97:0x0161, B:99:0x0167, B:101:0x0173, B:104:0x017c, B:106:0x0180, B:107:0x019f, B:109:0x01a7, B:111:0x0189, B:113:0x0193), top: B:11:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.r0.i():void");
    }

    public final c j(i iVar) {
        Object obj;
        Iterator it = this.f16737b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            c cVar = (c) obj;
            if (ec.i.a(cVar.f16746c, iVar) && !cVar.f16748e) {
                break;
            }
        }
        return (c) obj;
    }

    public final c k(i iVar) {
        Object obj;
        Iterator it = this.f16738c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            c cVar = (c) obj;
            if (ec.i.a(cVar.f16746c, iVar) && !cVar.f16748e) {
                break;
            }
        }
        return (c) obj;
    }

    public final void l() {
        String str;
        String str2;
        if (y.L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f16736a.isAttachedToWindow();
        synchronized (this.f16737b) {
            p();
            o(this.f16737b);
            Iterator it = sb.q.w(this.f16738c).iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (y.L(2)) {
                    if (isAttachedToWindow) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f16736a + " is not attached to window. ";
                    }
                    Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + cVar);
                }
                cVar.a(this.f16736a);
            }
            Iterator it2 = sb.q.w(this.f16737b).iterator();
            while (it2.hasNext()) {
                c cVar2 = (c) it2.next();
                if (y.L(2)) {
                    if (isAttachedToWindow) {
                        str = "";
                    } else {
                        str = "Container " + this.f16736a + " is not attached to window. ";
                    }
                    Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + cVar2);
                }
                cVar2.a(this.f16736a);
            }
            rb.h hVar = rb.h.f13851a;
        }
    }

    public final void n() {
        Object obj;
        synchronized (this.f16737b) {
            p();
            ArrayList arrayList = this.f16737b;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                c cVar = (c) obj;
                View view = cVar.f16746c.mView;
                ec.i.d(view, "operation.fragment.mView");
                if (cVar.f16744a == 2 && s0.a(view) != 2) {
                    break;
                }
            }
            c cVar2 = (c) obj;
            i iVar = cVar2 != null ? cVar2.f16746c : null;
            this.f16740e = iVar != null ? iVar.isPostponed() : false;
            rb.h hVar = rb.h.f13851a;
        }
    }

    public final void o(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).e();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.o.k(((c) it.next()).f16753k, arrayList2);
        }
        List u10 = sb.q.u(sb.q.x(arrayList2));
        int size2 = u10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a aVar = (a) u10.get(i11);
            ViewGroup viewGroup = this.f16736a;
            aVar.getClass();
            ec.i.e(viewGroup, "container");
            if (!aVar.f16741a) {
                aVar.e(viewGroup);
            }
            aVar.f16741a = true;
        }
    }

    public final void p() {
        Iterator it = this.f16737b.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i10 = 2;
            if (cVar.f16745b == 2) {
                View requireView = cVar.f16746c.requireView();
                ec.i.d(requireView, "fragment.requireView()");
                int visibility = requireView.getVisibility();
                if (visibility != 0) {
                    if (visibility == 4) {
                        i10 = 4;
                    } else {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(defpackage.f.h("Unknown visibility ", visibility));
                        }
                        i10 = 3;
                    }
                }
                cVar.d(i10, 1);
            }
        }
    }
}
