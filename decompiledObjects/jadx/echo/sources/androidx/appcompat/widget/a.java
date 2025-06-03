package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import e.AbstractC1230a;
import e.AbstractC1235f;
import j.C1365a;
import java.util.ArrayList;
import l.AbstractViewOnTouchListenerC1497E;
import l.Z;

/* loaded from: classes.dex */
public class a extends androidx.appcompat.view.menu.a {

    /* renamed from: A, reason: collision with root package name */
    public boolean f8750A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f8751B;

    /* renamed from: C, reason: collision with root package name */
    public int f8752C;

    /* renamed from: D, reason: collision with root package name */
    public int f8753D;

    /* renamed from: E, reason: collision with root package name */
    public int f8754E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f8755F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f8756G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f8757H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f8758I;

    /* renamed from: J, reason: collision with root package name */
    public int f8759J;

    /* renamed from: K, reason: collision with root package name */
    public final SparseBooleanArray f8760K;

    /* renamed from: L, reason: collision with root package name */
    public e f8761L;

    /* renamed from: M, reason: collision with root package name */
    public C0153a f8762M;

    /* renamed from: N, reason: collision with root package name */
    public c f8763N;

    /* renamed from: O, reason: collision with root package name */
    public b f8764O;

    /* renamed from: P, reason: collision with root package name */
    public final f f8765P;

    /* renamed from: Q, reason: collision with root package name */
    public int f8766Q;

    /* renamed from: x, reason: collision with root package name */
    public d f8767x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f8768y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8769z;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0153a extends androidx.appcompat.view.menu.f {
        public C0153a(Context context, j jVar, View view) {
            super(context, jVar, view, false, AbstractC1230a.f13335f);
            if (!((androidx.appcompat.view.menu.e) jVar.getItem()).k()) {
                View view2 = a.this.f8767x;
                f(view2 == null ? (View) a.this.f8398w : view2);
            }
            j(a.this.f8765P);
        }

        @Override // androidx.appcompat.view.menu.f
        public void e() {
            a aVar = a.this;
            aVar.f8762M = null;
            aVar.f8766Q = 0;
            super.e();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public k.c a() {
            C0153a c0153a = a.this.f8762M;
            if (c0153a != null) {
                return c0153a.c();
            }
            return null;
        }
    }

    public class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public e f8772o;

        public c(e eVar) {
            this.f8772o = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f8392q != null) {
                a.this.f8392q.c();
            }
            View view = (View) a.this.f8398w;
            if (view != null && view.getWindowToken() != null && this.f8772o.m()) {
                a.this.f8761L = this.f8772o;
            }
            a.this.f8763N = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        public class C0154a extends AbstractViewOnTouchListenerC1497E {

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ a f8775x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0154a(View view, a aVar) {
                super(view);
                this.f8775x = aVar;
            }

            @Override // l.AbstractViewOnTouchListenerC1497E
            public k.c b() {
                e eVar = a.this.f8761L;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // l.AbstractViewOnTouchListenerC1497E
            public boolean c() {
                a.this.H();
                return true;
            }

            @Override // l.AbstractViewOnTouchListenerC1497E
            public boolean d() {
                a aVar = a.this;
                if (aVar.f8763N != null) {
                    return false;
                }
                aVar.z();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC1230a.f13334e);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            Z.a(this, getContentDescription());
            setOnTouchListener(new C0154a(this, a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.H();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i7, int i8, int i9, int i10) {
            boolean frame = super.setFrame(i7, i8, i9, i10);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                B.a.k(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends androidx.appcompat.view.menu.f {
        public e(Context context, androidx.appcompat.view.menu.d dVar, View view, boolean z7) {
            super(context, dVar, view, z7, AbstractC1230a.f13335f);
            h(8388613);
            j(a.this.f8765P);
        }

        @Override // androidx.appcompat.view.menu.f
        public void e() {
            if (a.this.f8392q != null) {
                a.this.f8392q.close();
            }
            a.this.f8761L = null;
            super.e();
        }
    }

    public class f implements g.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.d dVar, boolean z7) {
            if (dVar instanceof j) {
                dVar.z().d(false);
            }
            g.a m7 = a.this.m();
            if (m7 != null) {
                m7.b(dVar, z7);
            }
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean c(androidx.appcompat.view.menu.d dVar) {
            if (dVar == a.this.f8392q) {
                return false;
            }
            a.this.f8766Q = ((j) dVar).getItem().getItemId();
            g.a m7 = a.this.m();
            if (m7 != null) {
                return m7.c(dVar);
            }
            return false;
        }
    }

    public a(Context context) {
        super(context, AbstractC1235f.f13441c, AbstractC1235f.f13440b);
        this.f8760K = new SparseBooleanArray();
        this.f8765P = new f();
    }

    public boolean A() {
        C0153a c0153a = this.f8762M;
        if (c0153a == null) {
            return false;
        }
        c0153a.b();
        return true;
    }

    public boolean B() {
        e eVar = this.f8761L;
        return eVar != null && eVar.d();
    }

    public void C(Configuration configuration) {
        if (!this.f8755F) {
            this.f8754E = C1365a.a(this.f8391p).c();
        }
        androidx.appcompat.view.menu.d dVar = this.f8392q;
        if (dVar != null) {
            dVar.G(true);
        }
    }

    public void D(boolean z7) {
        this.f8758I = z7;
    }

    public void E(ActionMenuView actionMenuView) {
        this.f8398w = actionMenuView;
        actionMenuView.E(this.f8392q);
    }

    public void F(Drawable drawable) {
        d dVar = this.f8767x;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f8769z = true;
            this.f8768y = drawable;
        }
    }

    public void G(boolean z7) {
        this.f8750A = z7;
        this.f8751B = true;
    }

    public boolean H() {
        androidx.appcompat.view.menu.d dVar;
        if (!this.f8750A || B() || (dVar = this.f8392q) == null || this.f8398w == null || this.f8763N != null || dVar.v().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f8391p, this.f8392q, this.f8767x, true));
        this.f8763N = cVar;
        ((View) this.f8398w).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public void b(androidx.appcompat.view.menu.d dVar, boolean z7) {
        w();
        super.b(dVar, z7);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public void c(Context context, androidx.appcompat.view.menu.d dVar) {
        super.c(context, dVar);
        Resources resources = context.getResources();
        C1365a a7 = C1365a.a(context);
        if (!this.f8751B) {
            this.f8750A = a7.d();
        }
        if (!this.f8757H) {
            this.f8752C = a7.b();
        }
        if (!this.f8755F) {
            this.f8754E = a7.c();
        }
        int i7 = this.f8752C;
        if (this.f8750A) {
            if (this.f8767x == null) {
                d dVar2 = new d(this.f8390o);
                this.f8767x = dVar2;
                if (this.f8769z) {
                    dVar2.setImageDrawable(this.f8768y);
                    this.f8768y = null;
                    this.f8769z = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f8767x.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i7 -= this.f8767x.getMeasuredWidth();
        } else {
            this.f8767x = null;
        }
        this.f8753D = i7;
        this.f8759J = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void d(androidx.appcompat.view.menu.e eVar, h.a aVar) {
        aVar.d(eVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f8398w);
        if (this.f8764O == null) {
            this.f8764O = new b();
        }
        actionMenuItemView.setPopupCallback(this.f8764O);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public boolean e(j jVar) {
        boolean z7 = false;
        if (!jVar.hasVisibleItems()) {
            return false;
        }
        j jVar2 = jVar;
        while (jVar2.W() != this.f8392q) {
            jVar2 = (j) jVar2.W();
        }
        View x7 = x(jVar2.getItem());
        if (x7 == null) {
            return false;
        }
        this.f8766Q = jVar.getItem().getItemId();
        int size = jVar.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            MenuItem item = jVar.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                z7 = true;
                break;
            }
            i7++;
        }
        C0153a c0153a = new C0153a(this.f8391p, jVar, x7);
        this.f8762M = c0153a;
        c0153a.g(z7);
        this.f8762M.k();
        super.e(jVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public void f(boolean z7) {
        int size;
        super.f(z7);
        ((View) this.f8398w).requestLayout();
        androidx.appcompat.view.menu.d dVar = this.f8392q;
        if (dVar != null) {
            ArrayList r7 = dVar.r();
            int size2 = r7.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ((androidx.appcompat.view.menu.e) r7.get(i7)).g();
            }
        }
        androidx.appcompat.view.menu.d dVar2 = this.f8392q;
        ArrayList v7 = dVar2 != null ? dVar2.v() : null;
        if (!this.f8750A || v7 == null || ((size = v7.size()) != 1 ? size <= 0 : !(!((androidx.appcompat.view.menu.e) v7.get(0)).isActionViewExpanded()))) {
            d dVar3 = this.f8767x;
            if (dVar3 != null) {
                Object parent = dVar3.getParent();
                Object obj = this.f8398w;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f8767x);
                }
            }
        } else {
            if (this.f8767x == null) {
                this.f8767x = new d(this.f8390o);
            }
            ViewGroup viewGroup = (ViewGroup) this.f8767x.getParent();
            if (viewGroup != this.f8398w) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f8767x);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f8398w;
                actionMenuView.addView(this.f8767x, actionMenuView.C());
            }
        }
        ((ActionMenuView) this.f8398w).setOverflowReserved(this.f8750A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.g
    public boolean g() {
        ArrayList arrayList;
        int i7;
        int i8;
        int i9;
        boolean z7;
        int i10;
        a aVar = this;
        androidx.appcompat.view.menu.d dVar = aVar.f8392q;
        View view = null;
        ?? r32 = 0;
        if (dVar != null) {
            arrayList = dVar.A();
            i7 = arrayList.size();
        } else {
            arrayList = null;
            i7 = 0;
        }
        int i11 = aVar.f8754E;
        int i12 = aVar.f8753D;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.f8398w;
        boolean z8 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i7; i15++) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) arrayList.get(i15);
            if (eVar.n()) {
                i13++;
            } else if (eVar.m()) {
                i14++;
            } else {
                z8 = true;
            }
            if (aVar.f8758I && eVar.isActionViewExpanded()) {
                i11 = 0;
            }
        }
        if (aVar.f8750A && (z8 || i14 + i13 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = aVar.f8760K;
        sparseBooleanArray.clear();
        if (aVar.f8756G) {
            int i17 = aVar.f8759J;
            i9 = i12 / i17;
            i8 = i17 + ((i12 % i17) / i9);
        } else {
            i8 = 0;
            i9 = 0;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < i7) {
            androidx.appcompat.view.menu.e eVar2 = (androidx.appcompat.view.menu.e) arrayList.get(i18);
            if (eVar2.n()) {
                View n7 = aVar.n(eVar2, view, viewGroup);
                if (aVar.f8756G) {
                    i9 -= ActionMenuView.G(n7, i8, i9, makeMeasureSpec, r32);
                } else {
                    n7.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n7.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = eVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                eVar2.t(true);
                z7 = r32;
                i10 = i7;
            } else if (eVar2.m()) {
                int groupId2 = eVar2.getGroupId();
                boolean z9 = sparseBooleanArray.get(groupId2);
                boolean z10 = (i16 > 0 || z9) && i12 > 0 && (!aVar.f8756G || i9 > 0);
                boolean z11 = z10;
                i10 = i7;
                if (z10) {
                    View n8 = aVar.n(eVar2, null, viewGroup);
                    if (aVar.f8756G) {
                        int G6 = ActionMenuView.G(n8, i8, i9, makeMeasureSpec, 0);
                        i9 -= G6;
                        if (G6 == 0) {
                            z11 = false;
                        }
                    } else {
                        n8.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z12 = z11;
                    int measuredWidth2 = n8.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z10 = z12 & (!aVar.f8756G ? i12 + i19 <= 0 : i12 < 0);
                }
                if (z10 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z9) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i20 = 0; i20 < i18; i20++) {
                        androidx.appcompat.view.menu.e eVar3 = (androidx.appcompat.view.menu.e) arrayList.get(i20);
                        if (eVar3.getGroupId() == groupId2) {
                            if (eVar3.k()) {
                                i16++;
                            }
                            eVar3.t(false);
                        }
                    }
                }
                if (z10) {
                    i16--;
                }
                eVar2.t(z10);
                z7 = false;
            } else {
                z7 = r32;
                i10 = i7;
                eVar2.t(z7);
            }
            i18++;
            r32 = z7;
            i7 = i10;
            view = null;
            aVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i7) {
        if (viewGroup.getChildAt(i7) == this.f8767x) {
            return false;
        }
        return super.l(viewGroup, i7);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.e eVar, View view, ViewGroup viewGroup) {
        View actionView = eVar.getActionView();
        if (actionView == null || eVar.i()) {
            actionView = super.n(eVar, view, viewGroup);
        }
        actionView.setVisibility(eVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean o(int i7, androidx.appcompat.view.menu.e eVar) {
        return eVar.k();
    }

    public boolean w() {
        return z() | A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View x(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f8398w;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if ((childAt instanceof h.a) && ((h.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable y() {
        d dVar = this.f8767x;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f8769z) {
            return this.f8768y;
        }
        return null;
    }

    public boolean z() {
        Object obj;
        c cVar = this.f8763N;
        if (cVar != null && (obj = this.f8398w) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f8763N = null;
            return true;
        }
        e eVar = this.f8761L;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }
}
