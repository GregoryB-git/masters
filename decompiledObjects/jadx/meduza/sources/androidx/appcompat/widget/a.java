package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import io.meduza.meduza.R;
import java.util.ArrayList;
import l.b1;
import l.l0;
import l.p;
import y.a;

/* loaded from: classes.dex */
public final class a extends androidx.appcompat.view.menu.a {
    public e A;
    public C0012a B;
    public c C;
    public b D;
    public final f E;

    /* renamed from: q, reason: collision with root package name */
    public d f882q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f883r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f884s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f885u;

    /* renamed from: v, reason: collision with root package name */
    public int f886v;

    /* renamed from: w, reason: collision with root package name */
    public int f887w;

    /* renamed from: x, reason: collision with root package name */
    public int f888x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f889y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseBooleanArray f890z;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0012a extends i {
        public C0012a(Context context, m mVar, View view) {
            super(context, mVar, view, false);
            if (!((mVar.B.f712x & 32) == 32)) {
                View view2 = a.this.f882q;
                this.f = view2 == null ? (View) a.this.f626p : view2;
            }
            f fVar = a.this.E;
            this.f723i = fVar;
            k.d dVar = this.f724j;
            if (dVar != null) {
                dVar.d(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            a.this.B = null;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public e f893a;

        public c(e eVar) {
            this.f893a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.a aVar;
            androidx.appcompat.view.menu.f fVar = a.this.f622c;
            if (fVar != null && (aVar = fVar.f669e) != null) {
                aVar.b(fVar);
            }
            View view = (View) a.this.f626p;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.f893a;
                boolean z10 = true;
                if (!eVar.b()) {
                    if (eVar.f == null) {
                        z10 = false;
                    } else {
                        eVar.d(0, 0, false, false);
                    }
                }
                if (z10) {
                    a.this.A = this.f893a;
                }
            }
            a.this.C = null;
        }
    }

    public class d extends p implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        public class C0013a extends l0 {
            public C0013a(View view) {
                super(view);
            }

            @Override // l.l0
            public final k.f b() {
                e eVar = a.this.A;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // l.l0
            public final boolean c() {
                a.this.l();
                return true;
            }

            @Override // l.l0
            public final boolean d() {
                a aVar = a.this;
                if (aVar.C != null) {
                    return false;
                }
                aVar.h();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            b1.a(this, getContentDescription());
            setOnTouchListener(new C0013a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.l();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.C0261a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, d dVar) {
            super(context, fVar, dVar, true);
            this.f721g = 8388613;
            f fVar2 = a.this.E;
            this.f723i = fVar2;
            k.d dVar2 = this.f724j;
            if (dVar2 != null) {
                dVar2.d(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            androidx.appcompat.view.menu.f fVar = a.this.f622c;
            if (fVar != null) {
                fVar.c(true);
            }
            a.this.A = null;
            super.c();
        }
    }

    public class f implements j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (fVar instanceof m) {
                fVar.k().c(false);
            }
            j.a aVar = a.this.f624e;
            if (aVar != null) {
                aVar.b(fVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            a aVar = a.this;
            if (fVar == aVar.f622c) {
                return false;
            }
            ((m) fVar).B.getClass();
            aVar.getClass();
            j.a aVar2 = a.this.f624e;
            if (aVar2 != null) {
                return aVar2.c(fVar);
            }
            return false;
        }
    }

    public a(Context context) {
        super(context);
        this.f890z = new SparseBooleanArray();
        this.E = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.appcompat.view.menu.k$a] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof k.a ? (k.a) view : (k.a) this.f623d.inflate(this.f625o, viewGroup, false);
            actionMenuItemView.c(hVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f626p);
            if (this.D == null) {
                this.D = new b();
            }
            actionMenuItemView2.setPopupCallback(this.D);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(hVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
        h();
        C0012a c0012a = this.B;
        if (c0012a != null && c0012a.b()) {
            c0012a.f724j.dismiss();
        }
        j.a aVar = this.f624e;
        if (aVar != null) {
            aVar.b(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c() {
        int i10;
        ArrayList<h> arrayList;
        int i11;
        boolean z10;
        a aVar = this;
        androidx.appcompat.view.menu.f fVar = aVar.f622c;
        if (fVar != null) {
            arrayList = fVar.l();
            i10 = arrayList.size();
        } else {
            i10 = 0;
            arrayList = null;
        }
        int i12 = aVar.f888x;
        int i13 = aVar.f887w;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.f626p;
        int i14 = 0;
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            h hVar = arrayList.get(i14);
            int i17 = hVar.f713y;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z11 = true;
            }
            if (aVar.f889y && hVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (aVar.t && (z11 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = aVar.f890z;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            h hVar2 = arrayList.get(i19);
            int i21 = hVar2.f713y;
            if ((i21 & 2) == i11 ? z10 : false) {
                View a10 = aVar.a(hVar2, null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int i22 = hVar2.f692b;
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                hVar2.f(z10);
            } else if ((i21 & 1) == z10 ? z10 : false) {
                int i23 = hVar2.f692b;
                boolean z12 = sparseBooleanArray.get(i23);
                boolean z13 = ((i18 > 0 || z12) && i13 > 0) ? z10 : false;
                if (z13) {
                    View a11 = aVar.a(hVar2, null, viewGroup);
                    a11.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a11.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z13 &= i13 + i20 > 0;
                }
                if (z13 && i23 != 0) {
                    sparseBooleanArray.put(i23, true);
                } else if (z12) {
                    sparseBooleanArray.put(i23, false);
                    for (int i24 = 0; i24 < i19; i24++) {
                        h hVar3 = arrayList.get(i24);
                        if (hVar3.f692b == i23) {
                            if ((hVar3.f712x & 32) == 32) {
                                i18++;
                            }
                            hVar3.f(false);
                        }
                    }
                }
                if (z13) {
                    i18--;
                }
                hVar2.f(z13);
            } else {
                hVar2.f(false);
                i19++;
                i11 = 2;
                aVar = this;
                z10 = true;
            }
            i19++;
            i11 = 2;
            aVar = this;
            z10 = true;
        }
        return z10;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f621b = context;
        LayoutInflater.from(context);
        this.f622c = fVar;
        Resources resources = context.getResources();
        if (!this.f885u) {
            this.t = true;
        }
        int i10 = 2;
        this.f886v = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.f888x = i10;
        int i13 = this.f886v;
        if (this.t) {
            if (this.f882q == null) {
                d dVar = new d(this.f620a);
                this.f882q = dVar;
                if (this.f884s) {
                    dVar.setImageDrawable(this.f883r);
                    this.f883r = null;
                    this.f884s = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f882q.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f882q.getMeasuredWidth();
        } else {
            this.f882q = null;
        }
        this.f887w = i13;
        float f10 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final void g() {
        int i10;
        boolean z10;
        ViewGroup viewGroup = (ViewGroup) this.f626p;
        boolean z11 = false;
        ArrayList<h> arrayList = null;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.f622c;
            if (fVar != null) {
                fVar.i();
                ArrayList<h> l10 = this.f622c.l();
                int size = l10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    h hVar = l10.get(i11);
                    if ((hVar.f712x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i10);
                        h itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View a10 = a(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            a10.setPressed(false);
                            a10.jumpDrawablesToCurrentState();
                        }
                        if (a10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a10);
                            }
                            ((ViewGroup) this.f626p).addView(a10, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f882q) {
                    z10 = false;
                } else {
                    viewGroup.removeViewAt(i10);
                    z10 = true;
                }
                if (!z10) {
                    i10++;
                }
            }
        }
        ((View) this.f626p).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.f622c;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<h> arrayList2 = fVar2.f672i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                e0.b bVar = arrayList2.get(i12).A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.f622c;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.f673j;
        }
        if (this.t && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z11 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z11 = true;
            }
        }
        d dVar = this.f882q;
        if (z11) {
            if (dVar == null) {
                this.f882q = new d(this.f620a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f882q.getParent();
            if (viewGroup3 != this.f626p) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f882q);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f626p;
                d dVar2 = this.f882q;
                actionMenuView.getClass();
                ActionMenuView.c cVar = new ActionMenuView.c();
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
                cVar.f786a = true;
                actionMenuView.addView(dVar2, cVar);
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f626p;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f882q);
            }
        }
        ((ActionMenuView) this.f626p).setOverflowReserved(this.t);
    }

    public final boolean h() {
        Object obj;
        c cVar = this.C;
        if (cVar != null && (obj = this.f626p) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.C = null;
            return true;
        }
        e eVar = this.A;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.f724j.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(androidx.appcompat.view.menu.m r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            androidx.appcompat.view.menu.f r2 = r0.A
            androidx.appcompat.view.menu.f r3 = r8.f622c
            if (r2 == r3) goto L13
            r0 = r2
            androidx.appcompat.view.menu.m r0 = (androidx.appcompat.view.menu.m) r0
            goto L9
        L13:
            androidx.appcompat.view.menu.h r0 = r0.B
            androidx.appcompat.view.menu.k r2 = r8.f626p
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L1d
            goto L3a
        L1d:
            int r4 = r2.getChildCount()
            r5 = r1
        L22:
            if (r5 >= r4) goto L3a
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.k.a
            if (r7 == 0) goto L37
            r7 = r6
            androidx.appcompat.view.menu.k$a r7 = (androidx.appcompat.view.menu.k.a) r7
            androidx.appcompat.view.menu.h r7 = r7.getItemData()
            if (r7 != r0) goto L37
            r3 = r6
            goto L3a
        L37:
            int r5 = r5 + 1
            goto L22
        L3a:
            if (r3 != 0) goto L3d
            return r1
        L3d:
            androidx.appcompat.view.menu.h r0 = r9.B
            r0.getClass()
            int r0 = r9.size()
            r2 = r1
        L47:
            r4 = 1
            if (r2 >= r0) goto L5f
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L5c
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L5c
            r0 = r4
            goto L60
        L5c:
            int r2 = r2 + 1
            goto L47
        L5f:
            r0 = r1
        L60:
            androidx.appcompat.widget.a$a r2 = new androidx.appcompat.widget.a$a
            android.content.Context r5 = r8.f621b
            r2.<init>(r5, r9, r3)
            r8.B = r2
            r2.f722h = r0
            k.d r2 = r2.f724j
            if (r2 == 0) goto L72
            r2.n(r0)
        L72:
            androidx.appcompat.widget.a$a r0 = r8.B
            boolean r2 = r0.b()
            if (r2 == 0) goto L7c
        L7a:
            r1 = r4
            goto L85
        L7c:
            android.view.View r2 = r0.f
            if (r2 != 0) goto L81
            goto L85
        L81:
            r0.d(r1, r1, r1, r1)
            goto L7a
        L85:
            if (r1 == 0) goto L8f
            androidx.appcompat.view.menu.j$a r0 = r8.f624e
            if (r0 == 0) goto L8e
            r0.c(r9)
        L8e:
            return r4
        L8f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a.i(androidx.appcompat.view.menu.m):boolean");
    }

    public final boolean k() {
        e eVar = this.A;
        return eVar != null && eVar.b();
    }

    public final boolean l() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.t || k() || (fVar = this.f622c) == null || this.f626p == null || this.C != null) {
            return false;
        }
        fVar.i();
        if (fVar.f673j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f621b, this.f622c, this.f882q));
        this.C = cVar;
        ((View) this.f626p).post(cVar);
        return true;
    }
}
