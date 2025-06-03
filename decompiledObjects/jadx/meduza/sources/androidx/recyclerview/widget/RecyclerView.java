package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.q;
import b.a0;
import e0.d0;
import e0.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: s0, reason: collision with root package name */
    public static final int[] f1170s0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: t0, reason: collision with root package name */
    public static final Class<?>[] f1171t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final b f1172u0;
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public final AccessibilityManager E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public f J;
    public EdgeEffect K;
    public EdgeEffect L;
    public EdgeEffect M;
    public EdgeEffect N;
    public g O;
    public int P;
    public int Q;
    public VelocityTracker R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a, reason: collision with root package name */
    public final p f1173a;

    /* renamed from: a0, reason: collision with root package name */
    public final int f1174a0;

    /* renamed from: b, reason: collision with root package name */
    public r f1175b;

    /* renamed from: b0, reason: collision with root package name */
    public final int f1176b0;

    /* renamed from: c, reason: collision with root package name */
    public androidx.recyclerview.widget.a f1177c;

    /* renamed from: c0, reason: collision with root package name */
    public float f1178c0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.b f1179d;

    /* renamed from: d0, reason: collision with root package name */
    public float f1180d0;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.q f1181e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1182e0;
    public boolean f;

    /* renamed from: f0, reason: collision with root package name */
    public final u f1183f0;

    /* renamed from: g0, reason: collision with root package name */
    public androidx.recyclerview.widget.e f1184g0;

    /* renamed from: h0, reason: collision with root package name */
    public e.b f1185h0;

    /* renamed from: i0, reason: collision with root package name */
    public final s f1186i0;

    /* renamed from: j0, reason: collision with root package name */
    public ArrayList f1187j0;

    /* renamed from: k0, reason: collision with root package name */
    public h f1188k0;

    /* renamed from: l0, reason: collision with root package name */
    public androidx.recyclerview.widget.m f1189l0;

    /* renamed from: m0, reason: collision with root package name */
    public e0.p f1190m0;

    /* renamed from: n0, reason: collision with root package name */
    public final int[] f1191n0;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1192o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f1193o0;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1194p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f1195p0;

    /* renamed from: q, reason: collision with root package name */
    public j f1196q;

    /* renamed from: q0, reason: collision with root package name */
    public final ArrayList f1197q0;

    /* renamed from: r, reason: collision with root package name */
    public q f1198r;

    /* renamed from: r0, reason: collision with root package name */
    public a f1199r0;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f1200s;
    public final ArrayList<i> t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList<m> f1201u;

    /* renamed from: v, reason: collision with root package name */
    public m f1202v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1203w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1204x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1205y;

    /* renamed from: z, reason: collision with root package name */
    public int f1206z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = RecyclerView.this.O;
            if (gVar != null) {
                androidx.recyclerview.widget.c cVar = (androidx.recyclerview.widget.c) gVar;
                boolean z10 = !cVar.f1303e.isEmpty();
                boolean z11 = !cVar.f1304g.isEmpty();
                boolean z12 = !cVar.f1305h.isEmpty();
                boolean z13 = !cVar.f.isEmpty();
                if (z10 || z11 || z13 || z12) {
                    Iterator<v> it = cVar.f1303e.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw null;
                    }
                    cVar.f1303e.clear();
                    if (z11) {
                        ArrayList<c.b> arrayList = new ArrayList<>();
                        arrayList.addAll(cVar.f1304g);
                        cVar.f1307j.add(arrayList);
                        cVar.f1304g.clear();
                        if (z10) {
                            arrayList.get(0).getClass();
                            throw null;
                        }
                        Iterator<c.b> it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            it2.next().getClass();
                            throw null;
                        }
                        arrayList.clear();
                        cVar.f1307j.remove(arrayList);
                    }
                    if (z12) {
                        ArrayList<c.a> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(cVar.f1305h);
                        cVar.f1308k.add(arrayList2);
                        cVar.f1305h.clear();
                        if (z10) {
                            arrayList2.get(0).f1313a.getClass();
                            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
                            throw null;
                        }
                        Iterator<c.a> it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            v vVar = it3.next().f1313a;
                        }
                        arrayList2.clear();
                        cVar.f1308k.remove(arrayList2);
                    }
                    if (z13) {
                        ArrayList<v> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(cVar.f);
                        cVar.f1306i.add(arrayList3);
                        cVar.f.clear();
                        if (z10 || z11 || z12) {
                            Math.max(z11 ? cVar.f1210c : 0L, z12 ? cVar.f1211d : 0L);
                            arrayList3.get(0).getClass();
                            WeakHashMap<View, o0> weakHashMap2 = d0.f3766a;
                            throw null;
                        }
                        Iterator<v> it4 = arrayList3.iterator();
                        if (it4.hasNext()) {
                            it4.next().getClass();
                            throw null;
                        }
                        arrayList3.clear();
                        cVar.f1306i.remove(arrayList3);
                    }
                }
            }
            RecyclerView.this.getClass();
        }
    }

    public class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f10 = f - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    public class c {
        public c(RecyclerView recyclerView) {
        }
    }

    public static abstract class d<VH extends v> {
    }

    public interface e {
        int a();
    }

    public static class f {
    }

    public static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        public b f1208a = null;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f1209b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public long f1210c = 250;

        /* renamed from: d, reason: collision with root package name */
        public long f1211d = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public final void a(v vVar) {
            b bVar = this.f1208a;
            if (bVar != null) {
                h hVar = (h) bVar;
                boolean z10 = true;
                vVar.h(true);
                if (vVar.f1256e != null) {
                    vVar.f1256e = null;
                }
                if ((vVar.f & 16) != 0) {
                    return;
                }
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.y();
                androidx.recyclerview.widget.b bVar2 = recyclerView.f1179d;
                int indexOfChild = ((androidx.recyclerview.widget.k) bVar2.f1298a).f1358a.indexOfChild(null);
                if (indexOfChild == -1) {
                    bVar2.f(null);
                } else if (bVar2.f1299b.c(indexOfChild)) {
                    bVar2.f1299b.d(indexOfChild);
                    bVar2.f(null);
                    ((androidx.recyclerview.widget.k) bVar2.f1298a).b(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    RecyclerView.p(null);
                    recyclerView.f1173a.f(null);
                    throw null;
                }
                recyclerView.z(!z10);
                if (z10 || !vVar.g()) {
                    return;
                }
                RecyclerView.this.removeDetachedView(null, false);
            }
        }

        public final void b() {
            int size = this.f1209b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f1209b.get(i10).a();
            }
            this.f1209b.clear();
        }

        public abstract void c();

        public abstract boolean d();
    }

    public class h implements g.b {
        public h() {
        }
    }

    public static abstract class i {
        public void d(Canvas canvas) {
        }
    }

    public static abstract class j {

        /* renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.b f1213a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f1214b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.recyclerview.widget.p f1215c;

        /* renamed from: d, reason: collision with root package name */
        public androidx.recyclerview.widget.p f1216d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1217e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f1218g;

        public class a implements p.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public final int a(View view) {
                k kVar = (k) view.getLayoutParams();
                j.this.getClass();
                return (view.getLeft() - ((k) view.getLayoutParams()).f1225a.left) - ((ViewGroup.MarginLayoutParams) kVar).leftMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public final int b() {
                return j.this.t();
            }

            @Override // androidx.recyclerview.widget.p.b
            public final int c() {
                j jVar = j.this;
                return jVar.f - jVar.u();
            }

            @Override // androidx.recyclerview.widget.p.b
            public final View d(int i10) {
                return j.this.o(i10);
            }

            @Override // androidx.recyclerview.widget.p.b
            public final int e(View view) {
                k kVar = (k) view.getLayoutParams();
                j.this.getClass();
                return view.getRight() + ((k) view.getLayoutParams()).f1225a.right + ((ViewGroup.MarginLayoutParams) kVar).rightMargin;
            }
        }

        public class b implements p.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public final int a(View view) {
                k kVar = (k) view.getLayoutParams();
                j.this.getClass();
                return (view.getTop() - ((k) view.getLayoutParams()).f1225a.top) - ((ViewGroup.MarginLayoutParams) kVar).topMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public final int b() {
                return j.this.v();
            }

            @Override // androidx.recyclerview.widget.p.b
            public final int c() {
                j jVar = j.this;
                return jVar.f1218g - jVar.s();
            }

            @Override // androidx.recyclerview.widget.p.b
            public final View d(int i10) {
                return j.this.o(i10);
            }

            @Override // androidx.recyclerview.widget.p.b
            public final int e(View view) {
                k kVar = (k) view.getLayoutParams();
                j.this.getClass();
                return view.getBottom() + ((k) view.getLayoutParams()).f1225a.bottom + ((ViewGroup.MarginLayoutParams) kVar).bottomMargin;
            }
        }

        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f1221a;

            /* renamed from: b, reason: collision with root package name */
            public int f1222b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f1223c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f1224d;
        }

        public j() {
            a aVar = new a();
            b bVar = new b();
            this.f1215c = new androidx.recyclerview.widget.p(aVar);
            this.f1216d = new androidx.recyclerview.widget.p(bVar);
            this.f1217e = false;
        }

        public static int e(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        public static void r(View view, Rect rect) {
            int[] iArr = RecyclerView.f1170s0;
            k kVar = (k) view.getLayoutParams();
            Rect rect2 = kVar.f1225a;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) kVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) kVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) kVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) kVar).bottomMargin);
        }

        public static void w(View view) {
            ((k) view.getLayoutParams()).getClass();
            throw null;
        }

        public static c x(Context context, AttributeSet attributeSet, int i10, int i11) {
            c cVar = new c();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.Q, i10, i11);
            cVar.f1221a = obtainStyledAttributes.getInt(0, 1);
            cVar.f1222b = obtainStyledAttributes.getInt(10, 1);
            cVar.f1223c = obtainStyledAttributes.getBoolean(9, false);
            cVar.f1224d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return cVar;
        }

        public void A() {
        }

        public void B(RecyclerView recyclerView) {
        }

        public void C(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1214b;
            p pVar = recyclerView.f1173a;
            s sVar = recyclerView.f1186i0;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f1214b.canScrollVertically(-1) && !this.f1214b.canScrollHorizontally(-1) && !this.f1214b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            this.f1214b.getClass();
        }

        public Parcelable D() {
            return null;
        }

        public void E(int i10) {
        }

        public final void F(p pVar) {
            int p10 = p() - 1;
            if (p10 < 0) {
                return;
            }
            RecyclerView.p(o(p10));
            throw null;
        }

        public final void G(p pVar) {
            int size = pVar.f1232a.size();
            int i10 = size - 1;
            if (i10 >= 0) {
                pVar.f1232a.get(i10).getClass();
                RecyclerView.p(null);
                throw null;
            }
            pVar.f1232a.clear();
            ArrayList<v> arrayList = pVar.f1233b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f1214b.invalidate();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
        
            if (r10 == false) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean H(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.t()
                int r1 = r8.v()
                int r2 = r8.f
                int r3 = r8.u()
                int r2 = r2 - r3
                int r3 = r8.f1218g
                int r4 = r8.s()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                androidx.recyclerview.widget.RecyclerView r3 = r8.f1214b
                java.util.WeakHashMap<android.view.View, e0.o0> r7 = e0.d0.f3766a
                int r3 = r3.getLayoutDirection()
                r7 = 1
                if (r3 != r7) goto L60
                if (r2 == 0) goto L5b
                goto L68
            L5b:
                int r2 = java.lang.Math.max(r6, r10)
                goto L68
            L60:
                if (r6 == 0) goto L63
                goto L67
            L63:
                int r6 = java.lang.Math.min(r4, r2)
            L67:
                r2 = r6
            L68:
                if (r1 == 0) goto L6b
                goto L6f
            L6b:
                int r1 = java.lang.Math.min(r5, r11)
            L6f:
                if (r13 == 0) goto Laf
                android.view.View r10 = r9.getFocusedChild()
                if (r10 != 0) goto L78
                goto Lac
            L78:
                int r11 = r8.t()
                int r13 = r8.v()
                int r3 = r8.f
                int r4 = r8.u()
                int r3 = r3 - r4
                int r4 = r8.f1218g
                int r5 = r8.s()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.f1214b
                android.graphics.Rect r5 = r5.f1192o
                r(r10, r5)
                int r10 = r5.left
                int r10 = r10 - r2
                if (r10 >= r3) goto Lac
                int r10 = r5.right
                int r10 = r10 - r2
                if (r10 <= r11) goto Lac
                int r10 = r5.top
                int r10 = r10 - r1
                if (r10 >= r4) goto Lac
                int r10 = r5.bottom
                int r10 = r10 - r1
                if (r10 > r13) goto Laa
                goto Lac
            Laa:
                r10 = r7
                goto Lad
            Lac:
                r10 = r0
            Lad:
                if (r10 == 0) goto Lb4
            Laf:
                if (r2 != 0) goto Lb5
                if (r1 == 0) goto Lb4
                goto Lb5
            Lb4:
                return r0
            Lb5:
                if (r12 == 0) goto Lbb
                r9.scrollBy(r2, r1)
                goto Lbe
            Lbb:
                r9.x(r2, r1, r0)
            Lbe:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.j.H(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public final void I() {
            RecyclerView recyclerView = this.f1214b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public final void J(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f1214b = null;
                this.f1213a = null;
                height = 0;
                this.f = 0;
            } else {
                this.f1214b = recyclerView;
                this.f1213a = recyclerView.f1179d;
                this.f = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f1218g = height;
        }

        public void a(String str) {
            RecyclerView recyclerView = this.f1214b;
            if (recyclerView != null) {
                recyclerView.b(str);
            }
        }

        public boolean b() {
            return false;
        }

        public boolean c() {
            return false;
        }

        public boolean d(k kVar) {
            return kVar != null;
        }

        public int f(s sVar) {
            return 0;
        }

        public void g(s sVar) {
        }

        public int h(s sVar) {
            return 0;
        }

        public int i(s sVar) {
            return 0;
        }

        public void j(s sVar) {
        }

        public int k(s sVar) {
            return 0;
        }

        public abstract k l();

        public k m(Context context, AttributeSet attributeSet) {
            return new k(context, attributeSet);
        }

        public k n(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof k ? new k((k) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new k((ViewGroup.MarginLayoutParams) layoutParams) : new k(layoutParams);
        }

        public final View o(int i10) {
            androidx.recyclerview.widget.b bVar = this.f1213a;
            if (bVar != null) {
                return bVar.a(i10);
            }
            return null;
        }

        public final int p() {
            androidx.recyclerview.widget.b bVar = this.f1213a;
            if (bVar != null) {
                return bVar.b();
            }
            return 0;
        }

        public int q(p pVar, s sVar) {
            return -1;
        }

        public final int s() {
            RecyclerView recyclerView = this.f1214b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int t() {
            RecyclerView recyclerView = this.f1214b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int u() {
            RecyclerView recyclerView = this.f1214b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int v() {
            RecyclerView recyclerView = this.f1214b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int y(p pVar, s sVar) {
            return -1;
        }

        public boolean z() {
            return false;
        }
    }

    public static class k extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f1225a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1226b;

        public k(int i10, int i11) {
            super(i10, i11);
            this.f1225a = new Rect();
            this.f1226b = true;
        }

        public k(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1225a = new Rect();
            this.f1226b = true;
        }

        public k(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1225a = new Rect();
            this.f1226b = true;
        }

        public k(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1225a = new Rect();
            this.f1226b = true;
        }

        public k(k kVar) {
            super((ViewGroup.LayoutParams) kVar);
            this.f1225a = new Rect();
            this.f1226b = true;
        }
    }

    public static abstract class l {
    }

    public interface m {
        void a(MotionEvent motionEvent);

        void b();

        boolean c(MotionEvent motionEvent);
    }

    public static abstract class n {
    }

    public static class o {

        /* renamed from: a, reason: collision with root package name */
        public SparseArray<a> f1227a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        public int f1228b = 0;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList<v> f1229a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            public int f1230b = 5;

            /* renamed from: c, reason: collision with root package name */
            public long f1231c = 0;
        }
    }

    public final class p {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<v> f1232a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<v> f1233b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<v> f1234c;

        /* renamed from: d, reason: collision with root package name */
        public final List<v> f1235d;

        /* renamed from: e, reason: collision with root package name */
        public int f1236e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public o f1237g;

        public p() {
            ArrayList<v> arrayList = new ArrayList<>();
            this.f1232a = arrayList;
            this.f1233b = null;
            this.f1234c = new ArrayList<>();
            this.f1235d = Collections.unmodifiableList(arrayList);
            this.f1236e = 2;
            this.f = 2;
        }

        public static void d(v vVar) {
            if (!vVar.f()) {
                throw null;
            }
            throw null;
        }

        public final int a(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f1186i0.a()) {
                RecyclerView recyclerView = RecyclerView.this;
                return !recyclerView.f1186i0.f1243d ? i10 : recyclerView.f1177c.a(i10, 0);
            }
            StringBuilder n2 = a0.j.n("invalid position ", i10, ". State item count is ");
            n2.append(RecyclerView.this.f1186i0.a());
            n2.append(RecyclerView.this.l());
            throw new IndexOutOfBoundsException(n2.toString());
        }

        public final void b() {
            int size = this.f1234c.size();
            while (true) {
                size--;
                if (size < 0) {
                    this.f1234c.clear();
                    int[] iArr = RecyclerView.f1170s0;
                    e.b bVar = RecyclerView.this.f1185h0;
                    bVar.getClass();
                    bVar.f1349c = 0;
                    return;
                }
                c(size);
            }
        }

        public final void c(int i10) {
            v vVar = this.f1234c.get(i10);
            int[] iArr = RecyclerView.f1170s0;
            vVar.getClass();
            androidx.recyclerview.widget.m mVar = RecyclerView.this.f1189l0;
            if (mVar != null) {
                m.a aVar = mVar.f1360e;
                d0.h(null, aVar instanceof m.a ? (e0.a) aVar.f1362e.remove(null) : null);
            }
            q qVar = RecyclerView.this.f1198r;
            if (qVar != null) {
                qVar.a();
            }
            int size = RecyclerView.this.f1200s.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((q) RecyclerView.this.f1200s.get(i11)).a();
            }
            RecyclerView.this.getClass();
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f1186i0 != null) {
                androidx.recyclerview.widget.q qVar2 = recyclerView.f1181e;
                r.e<v> eVar = qVar2.f1371b;
                if (eVar.f13476a) {
                    eVar.c();
                }
                int i12 = eVar.f13479d - 1;
                while (true) {
                    if (i12 < 0) {
                        break;
                    }
                    r.e<v> eVar2 = qVar2.f1371b;
                    if (eVar2.f13476a) {
                        eVar2.c();
                    }
                    if (vVar == eVar2.f13478c[i12]) {
                        r.e<v> eVar3 = qVar2.f1371b;
                        Object[] objArr = eVar3.f13478c;
                        Object obj = objArr[i12];
                        Object obj2 = r.e.f13475e;
                        if (obj != obj2) {
                            objArr[i12] = obj2;
                            eVar3.f13476a = true;
                        }
                    } else {
                        i12--;
                    }
                }
                q.a remove = qVar2.f1370a.remove(vVar);
                if (remove != null) {
                    q.a.f1372a.c(remove);
                }
            }
            vVar.f1262l = null;
            if (this.f1237g == null) {
                this.f1237g = new o();
            }
            o oVar = this.f1237g;
            oVar.getClass();
            o.a aVar2 = oVar.f1227a.get(0);
            if (aVar2 == null) {
                aVar2 = new o.a();
                oVar.f1227a.put(0, aVar2);
            }
            ArrayList<v> arrayList = aVar2.f1229a;
            if (oVar.f1227a.get(0).f1230b > arrayList.size()) {
                vVar.f = 0;
                vVar.f1252a = -1;
                vVar.f1253b = -1;
                vVar.f1254c = -1L;
                vVar.f1255d = -1;
                vVar.f1259i = 0;
                vVar.f1256e = null;
                ArrayList arrayList2 = vVar.f1257g;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                vVar.f &= -1025;
                vVar.getClass();
                vVar.getClass();
                int[] iArr2 = RecyclerView.f1170s0;
                arrayList.add(vVar);
            }
            this.f1234c.remove(i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0180  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(int r12, long r13) {
            /*
                Method dump skipped, instructions count: 635
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.e(int, long):void");
        }

        public final void f(v vVar) {
            (vVar.f1261k ? this.f1233b : this.f1232a).remove(vVar);
            vVar.f1260j = null;
            vVar.f1261k = false;
            vVar.f &= -33;
        }

        public final void g() {
            j jVar = RecyclerView.this.f1196q;
            this.f = this.f1236e + 0;
            int size = this.f1234c.size();
            while (true) {
                size--;
                if (size < 0 || this.f1234c.size() <= this.f) {
                    return;
                } else {
                    c(size);
                }
            }
        }
    }

    public interface q {
        void a();
    }

    public static class r extends n0.a {
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public Parcelable f1239c;

        public class a implements Parcelable.ClassLoaderCreator<r> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new r(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new r[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final r createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new r(parcel, classLoader);
            }
        }

        public r(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1239c = parcel.readParcelable(classLoader == null ? j.class.getClassLoader() : classLoader);
        }

        public r(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // n0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f11178a, i10);
            parcel.writeParcelable(this.f1239c, 0);
        }
    }

    public static class s {

        /* renamed from: a, reason: collision with root package name */
        public int f1240a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f1241b = 0;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1242c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1243d = false;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1244e = false;
        public boolean f = false;

        public final int a() {
            if (this.f1243d) {
                return this.f1240a - this.f1241b;
            }
            return 0;
        }

        public final String toString() {
            return "State{mTargetPosition=-1, mData=" + ((Object) null) + ", mItemCount=0, mIsMeasuring=false, mPreviousLayoutItemCount=" + this.f1240a + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1241b + ", mStructureChanged=" + this.f1242c + ", mInPreLayout=" + this.f1243d + ", mRunSimpleAnimations=" + this.f1244e + ", mRunPredictiveAnimations=" + this.f + '}';
        }
    }

    public static abstract class t {
    }

    public class u implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public int f1245a;

        /* renamed from: b, reason: collision with root package name */
        public int f1246b;

        /* renamed from: c, reason: collision with root package name */
        public OverScroller f1247c;

        /* renamed from: d, reason: collision with root package name */
        public Interpolator f1248d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1249e;
        public boolean f;

        public u() {
            b bVar = RecyclerView.f1172u0;
            this.f1248d = bVar;
            this.f1249e = false;
            this.f = false;
            this.f1247c = new OverScroller(RecyclerView.this.getContext(), bVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f1196q == null) {
                recyclerView.removeCallbacks(this);
                this.f1247c.abortAnimation();
                return;
            }
            this.f = false;
            this.f1249e = true;
            recyclerView.d();
            OverScroller overScroller = this.f1247c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i10 = currX - this.f1245a;
                int i11 = currY - this.f1246b;
                this.f1245a = currX;
                this.f1246b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f1195p0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.f(i10, i11, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f1195p0;
                    i10 -= iArr2[0];
                    i11 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.c(i10, i11);
                }
                RecyclerView.this.getClass();
                if (!RecyclerView.this.t.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                int[] iArr3 = recyclerView3.f1195p0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView3.g(0, 0, i10, i11, null, 1, iArr3);
                RecyclerView recyclerView4 = RecyclerView.this;
                int[] iArr4 = recyclerView4.f1195p0;
                int i12 = i10 - iArr4[0];
                int i13 = i11 - iArr4[1];
                if (!recyclerView4.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                RecyclerView.this.f1196q.getClass();
                if (z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                        if (i13 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i13 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView5 = RecyclerView.this;
                        if (i14 < 0) {
                            recyclerView5.i();
                            if (recyclerView5.K.isFinished()) {
                                recyclerView5.K.onAbsorb(-i14);
                            }
                        } else if (i14 > 0) {
                            recyclerView5.j();
                            if (recyclerView5.M.isFinished()) {
                                recyclerView5.M.onAbsorb(i14);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView5.k();
                            if (recyclerView5.L.isFinished()) {
                                recyclerView5.L.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView5.h();
                            if (recyclerView5.N.isFinished()) {
                                recyclerView5.N.onAbsorb(currVelocity);
                            }
                        } else {
                            recyclerView5.getClass();
                        }
                        if (i14 != 0 || currVelocity != 0) {
                            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
                            recyclerView5.postInvalidateOnAnimation();
                        }
                    }
                    e.b bVar = RecyclerView.this.f1185h0;
                    bVar.getClass();
                    bVar.f1349c = 0;
                } else {
                    if (this.f1249e) {
                        this.f = true;
                    } else {
                        RecyclerView.this.removeCallbacks(this);
                        RecyclerView recyclerView6 = RecyclerView.this;
                        WeakHashMap<View, o0> weakHashMap2 = d0.f3766a;
                        recyclerView6.postOnAnimation(this);
                    }
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.f1184g0;
                    if (eVar != null) {
                        eVar.a(recyclerView7, 0, 0);
                    }
                }
            }
            RecyclerView.this.f1196q.getClass();
            this.f1249e = false;
            if (!this.f) {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.A(1);
            } else {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView8 = RecyclerView.this;
                WeakHashMap<View, o0> weakHashMap3 = d0.f3766a;
                recyclerView8.postOnAnimation(this);
            }
        }
    }

    public static abstract class v {

        /* renamed from: m, reason: collision with root package name */
        public static final List<Object> f1251m = Collections.emptyList();

        /* renamed from: a, reason: collision with root package name */
        public int f1252a;

        /* renamed from: b, reason: collision with root package name */
        public int f1253b;

        /* renamed from: c, reason: collision with root package name */
        public long f1254c;

        /* renamed from: d, reason: collision with root package name */
        public int f1255d;

        /* renamed from: e, reason: collision with root package name */
        public v f1256e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList f1257g;

        /* renamed from: h, reason: collision with root package name */
        public List<Object> f1258h;

        /* renamed from: i, reason: collision with root package name */
        public int f1259i;

        /* renamed from: j, reason: collision with root package name */
        public p f1260j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f1261k;

        /* renamed from: l, reason: collision with root package name */
        public RecyclerView f1262l;

        public final void a(Object obj) {
            if (obj == null) {
                b(1024);
                return;
            }
            if ((1024 & this.f) == 0) {
                if (this.f1257g == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f1257g = arrayList;
                    this.f1258h = Collections.unmodifiableList(arrayList);
                }
                this.f1257g.add(obj);
            }
        }

        public final void b(int i10) {
            this.f = i10 | this.f;
        }

        public final int c() {
            int i10 = this.f1255d;
            return i10 == -1 ? this.f1252a : i10;
        }

        public final boolean d() {
            return (this.f & 4) != 0;
        }

        public final boolean e() {
            return (this.f & 8) != 0;
        }

        public final boolean f() {
            return this.f1260j != null;
        }

        public final boolean g() {
            return (this.f & 256) != 0;
        }

        public final void h(boolean z10) {
            int i10;
            int i11 = this.f1259i;
            int i12 = z10 ? i11 - 1 : i11 + 1;
            this.f1259i = i12;
            if (i12 < 0) {
                this.f1259i = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i12 == 1) {
                i10 = this.f | 16;
            } else if (!z10 || i12 != 0) {
                return;
            } else {
                i10 = this.f & (-17);
            }
            this.f = i10;
        }

        public final String toString() {
            StringBuilder g10 = defpackage.g.g(v.class.isAnonymousClass() ? "ViewHolder" : v.class.getSimpleName(), "{");
            g10.append(Integer.toHexString(hashCode()));
            g10.append(" position=");
            g10.append(this.f1252a);
            g10.append(" id=");
            g10.append(this.f1254c);
            g10.append(", oldPos=");
            g10.append(this.f1253b);
            g10.append(", pLpos:");
            g10.append(this.f1255d);
            new StringBuilder(g10.toString());
            if ((this.f & 16) != 0) {
                throw null;
            }
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            throw null;
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        f1171t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1172u0 = new b();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:38|(1:40)(12:78|(1:80)|42|43|44|(1:46)(1:62)|47|48|49|50|51|52)|41|42|43|44|(0)(0)|47|48|49|50|51|52) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x025b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x025d, code lost:
    
        r0 = r4.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0271, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0272, code lost:
    
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0292, code lost:
    
        throw new java.lang.IllegalStateException(r20.getPositionDescription() + ": Error creating LayoutManager " + r3, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0225 A[Catch: ClassCastException -> 0x0293, IllegalAccessException -> 0x02b2, InstantiationException -> 0x02d1, InvocationTargetException -> 0x02ee, ClassNotFoundException -> 0x030b, TryCatch #4 {ClassCastException -> 0x0293, ClassNotFoundException -> 0x030b, IllegalAccessException -> 0x02b2, InstantiationException -> 0x02d1, InvocationTargetException -> 0x02ee, blocks: (B:44:0x021f, B:46:0x0225, B:47:0x0232, B:50:0x023d, B:52:0x0263, B:57:0x025d, B:60:0x0272, B:61:0x0292, B:62:0x022e), top: B:43:0x021f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022e A[Catch: ClassCastException -> 0x0293, IllegalAccessException -> 0x02b2, InstantiationException -> 0x02d1, InvocationTargetException -> 0x02ee, ClassNotFoundException -> 0x030b, TryCatch #4 {ClassCastException -> 0x0293, ClassNotFoundException -> 0x030b, IllegalAccessException -> 0x02b2, InstantiationException -> 0x02d1, InvocationTargetException -> 0x02ee, blocks: (B:44:0x021f, B:46:0x0225, B:47:0x0232, B:50:0x023d, B:52:0x0263, B:57:0x025d, B:60:0x0272, B:61:0x0292, B:62:0x022e), top: B:43:0x021f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RecyclerView(android.content.Context r19, android.util.AttributeSet r20) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private e0.p getScrollingChildHelper() {
        if (this.f1190m0 == null) {
            this.f1190m0 = new e0.p(this);
        }
        return this.f1190m0;
    }

    public static v p(View view) {
        if (view == null) {
            return null;
        }
        ((k) view.getLayoutParams()).getClass();
        return null;
    }

    public final void A(int i10) {
        getScrollingChildHelper().h(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        j jVar = this.f1196q;
        if (jVar != null) {
            jVar.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b(String str) {
        if (this.H > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            StringBuilder l10 = defpackage.f.l("Cannot call this method while RecyclerView is computing a layout or scrolling");
            l10.append(l());
            throw new IllegalStateException(l10.toString());
        }
        if (this.I > 0) {
            StringBuilder l11 = defpackage.f.l("");
            l11.append(l());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(l11.toString()));
        }
    }

    public final void c(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.K.onRelease();
            z10 = this.K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.M.onRelease();
            z10 |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.L.onRelease();
            z10 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.N.onRelease();
            z10 |= this.N.isFinished();
        }
        if (z10) {
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof k) && this.f1196q.d((k) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        j jVar = this.f1196q;
        if (jVar != null && jVar.b()) {
            return this.f1196q.f(this.f1186i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        j jVar = this.f1196q;
        if (jVar != null && jVar.b()) {
            this.f1196q.g(this.f1186i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        j jVar = this.f1196q;
        if (jVar != null && jVar.b()) {
            return this.f1196q.h(this.f1186i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        j jVar = this.f1196q;
        if (jVar != null && jVar.c()) {
            return this.f1196q.i(this.f1186i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        j jVar = this.f1196q;
        if (jVar != null && jVar.c()) {
            this.f1196q.j(this.f1186i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        j jVar = this.f1196q;
        if (jVar != null && jVar.c()) {
            return this.f1196q.k(this.f1186i0);
        }
        return 0;
    }

    public final void d() {
        if (!this.f1205y || this.F) {
            int i10 = a0.n.f13a;
            Trace.beginSection("RV FullInvalidate");
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        if (this.f1177c.f1295b.size() > 0) {
            this.f1177c.getClass();
            if (this.f1177c.f1295b.size() > 0) {
                int i11 = a0.n.f13a;
                Trace.beginSection("RV FullInvalidate");
                Log.w("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        super.draw(canvas);
        int size = this.t.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.t.get(i10).d(canvas);
        }
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.K;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.L;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.M;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f) {
                f10 = getPaddingRight() + (-getWidth());
                f11 = getPaddingBottom() + (-getHeight());
            } else {
                f10 = -getWidth();
                f11 = -getHeight();
            }
            canvas.translate(f10, f11);
            EdgeEffect edgeEffect8 = this.N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if ((z10 || this.O == null || this.t.size() <= 0 || !this.O.d()) ? z10 : true) {
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        setMeasuredDimension(j.e(i10, paddingRight, getMinimumWidth()), j.e(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cd, code lost:
    
        if (r4 > 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ee, code lost:
    
        if (r6 > 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f1, code lost:
    
        if (r4 < 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f4, code lost:
    
        if (r6 < 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fc, code lost:
    
        if ((r6 * r3) <= 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0104, code lost:
    
        if ((r6 * r3) >= 0) goto L87;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r13, int r14) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(0, 0, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        j jVar = this.f1196q;
        if (jVar != null) {
            return jVar.l();
        }
        StringBuilder l10 = defpackage.f.l("RecyclerView has no LayoutManager");
        l10.append(l());
        throw new IllegalStateException(l10.toString());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        j jVar = this.f1196q;
        if (jVar != null) {
            return jVar.m(getContext(), attributeSet);
        }
        StringBuilder l10 = defpackage.f.l("RecyclerView has no LayoutManager");
        l10.append(l());
        throw new IllegalStateException(l10.toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public d getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        j jVar = this.f1196q;
        if (jVar == null) {
            return super.getBaseline();
        }
        jVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f;
    }

    public androidx.recyclerview.widget.m getCompatAccessibilityDelegate() {
        return this.f1189l0;
    }

    public f getEdgeEffectFactory() {
        return this.J;
    }

    public g getItemAnimator() {
        return this.O;
    }

    public int getItemDecorationCount() {
        return this.t.size();
    }

    public j getLayoutManager() {
        return this.f1196q;
    }

    public int getMaxFlingVelocity() {
        return this.f1176b0;
    }

    public int getMinFlingVelocity() {
        return this.f1174a0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public l getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1182e0;
    }

    public o getRecycledViewPool() {
        p pVar = this.f1173a;
        if (pVar.f1237g == null) {
            pVar.f1237g = new o();
        }
        return pVar.f1237g;
    }

    public int getScrollState() {
        return this.P;
    }

    public final void h() {
        int measuredWidth;
        int measuredHeight;
        if (this.N != null) {
            return;
        }
        this.J.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.N = edgeEffect;
        if (this.f) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0) != null;
    }

    public final void i() {
        int measuredHeight;
        int measuredWidth;
        if (this.K != null) {
            return;
        }
        this.J.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.K = edgeEffect;
        if (this.f) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1203w;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.B;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3817d;
    }

    public final void j() {
        int measuredHeight;
        int measuredWidth;
        if (this.M != null) {
            return;
        }
        this.J.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.M = edgeEffect;
        if (this.f) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void k() {
        int measuredWidth;
        int measuredHeight;
        if (this.L != null) {
            return;
        }
        this.J.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.f) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public final String l() {
        StringBuilder l10 = defpackage.f.l(" ");
        l10.append(super.toString());
        l10.append(", adapter:");
        l10.append((Object) null);
        l10.append(", layout:");
        l10.append(this.f1196q);
        l10.append(", context:");
        l10.append(getContext());
        return l10.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m(android.view.View):android.view.View");
    }

    public final boolean n(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f1201u.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = this.f1201u.get(i10);
            if (mVar.c(motionEvent) && action != 3) {
                this.f1202v = mVar;
                return true;
            }
        }
        return false;
    }

    public final int o(v vVar) {
        int i10 = vVar.f;
        if (!((i10 & 524) != 0)) {
            if ((i10 & 1) != 0) {
                androidx.recyclerview.widget.a aVar = this.f1177c;
                int i11 = vVar.f1252a;
                int size = aVar.f1295b.size();
                for (int i12 = 0; i12 < size; i12++) {
                    aVar.f1295b.get(i12).getClass();
                }
                return i11;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = false;
        this.H = 0;
        this.f1203w = true;
        if (this.f1205y && !isLayoutRequested()) {
            z10 = true;
        }
        this.f1205y = z10;
        j jVar = this.f1196q;
        if (jVar != null) {
            jVar.f1217e = true;
        }
        ThreadLocal<androidx.recyclerview.widget.e> threadLocal = androidx.recyclerview.widget.e.f1342e;
        androidx.recyclerview.widget.e eVar = threadLocal.get();
        this.f1184g0 = eVar;
        if (eVar == null) {
            this.f1184g0 = new androidx.recyclerview.widget.e();
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            Display display = getDisplay();
            float f10 = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f10 = refreshRate;
                }
            }
            androidx.recyclerview.widget.e eVar2 = this.f1184g0;
            eVar2.f1345c = (long) (1.0E9f / f10);
            threadLocal.set(eVar2);
        }
        this.f1184g0.f1343a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.O;
        if (gVar != null) {
            gVar.c();
        }
        setScrollState(0);
        u uVar = this.f1183f0;
        RecyclerView.this.removeCallbacks(uVar);
        uVar.f1247c.abortAnimation();
        this.f1203w = false;
        j jVar = this.f1196q;
        if (jVar != null) {
            jVar.f1217e = false;
            jVar.B(this);
        }
        this.f1197q0.clear();
        removeCallbacks(this.f1199r0);
        this.f1181e.getClass();
        while (q.a.f1372a.a() != null) {
        }
        androidx.recyclerview.widget.e eVar = this.f1184g0;
        if (eVar != null) {
            eVar.f1343a.remove(this);
            this.f1184g0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.t.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.t.get(i10).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.B) {
            return false;
        }
        this.f1202v = null;
        if (n(motionEvent)) {
            v();
            setScrollState(0);
            return true;
        }
        j jVar = this.f1196q;
        if (jVar == null) {
            return false;
        }
        boolean b10 = jVar.b();
        boolean c10 = this.f1196q.c();
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.C) {
                this.C = false;
            }
            this.Q = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.U = x10;
            this.S = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.V = y10;
            this.T = y10;
            if (this.P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                A(1);
            }
            int[] iArr = this.f1193o0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = b10;
            if (c10) {
                i10 = (b10 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i10, 0);
        } else if (actionMasked == 1) {
            this.R.clear();
            A(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.Q);
            if (findPointerIndex < 0) {
                StringBuilder l10 = defpackage.f.l("Error processing scroll; pointer index for id ");
                l10.append(this.Q);
                l10.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", l10.toString());
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.P != 1) {
                int i11 = x11 - this.S;
                int i12 = y11 - this.T;
                if (b10 == 0 || Math.abs(i11) <= this.W) {
                    z10 = false;
                } else {
                    this.U = x11;
                    z10 = true;
                }
                if (c10 && Math.abs(i12) > this.W) {
                    this.V = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            v();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.Q = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.U = x12;
            this.S = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.V = y12;
            this.T = y12;
        } else if (actionMasked == 6) {
            t(motionEvent);
        }
        return this.P == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = a0.n.f13a;
        Trace.beginSection("RV OnLayout");
        Log.w("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f1205y = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        j jVar = this.f1196q;
        if (jVar == null) {
            e(i10, i11);
            return;
        }
        if (jVar.z()) {
            View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getMode(i11);
            this.f1196q.f1214b.e(i10, i11);
        } else {
            if (this.f1204x) {
                this.f1196q.f1214b.e(i10, i11);
                return;
            }
            s sVar = this.f1186i0;
            if (sVar.f) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            sVar.getClass();
            y();
            this.f1196q.f1214b.e(i10, i11);
            z(false);
            this.f1186i0.f1243d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (this.H > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof r)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r rVar = (r) parcelable;
        this.f1175b = rVar;
        super.onRestoreInstanceState(rVar.f11178a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        r rVar = new r(super.onSaveInstanceState());
        r rVar2 = this.f1175b;
        if (rVar2 != null) {
            rVar.f1239c = rVar2.f1239c;
        } else {
            j jVar = this.f1196q;
            rVar.f1239c = jVar != null ? jVar.D() : null;
        }
        return rVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.N = null;
        this.L = null;
        this.M = null;
        this.K = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0274, code lost:
    
        if (r0 != false) goto L145;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0112  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void q() {
        int e10 = this.f1179d.e();
        for (int i10 = 0; i10 < e10; i10++) {
            ((k) this.f1179d.d(i10).getLayoutParams()).f1226b = true;
        }
        p pVar = this.f1173a;
        if (pVar.f1234c.size() <= 0) {
            return;
        }
        pVar.f1234c.get(0).getClass();
        throw null;
    }

    public final void r() {
        this.H++;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        p(view);
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f1196q.getClass();
        if (!(this.H > 0) && view2 != null) {
            u(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f1196q.H(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f1201u.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f1201u.get(i10).b();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1206z != 0 || this.B) {
            this.A = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(boolean z10) {
        int i10 = this.H - 1;
        this.H = i10;
        if (i10 < 1) {
            this.H = 0;
            if (z10) {
                int i11 = this.D;
                this.D = 0;
                if (i11 != 0) {
                    AccessibilityManager accessibilityManager = this.E;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        obtain.setContentChangeTypes(i11);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                int size = this.f1197q0.size() - 1;
                if (size < 0) {
                    this.f1197q0.clear();
                } else {
                    ((v) this.f1197q0.get(size)).getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        j jVar = this.f1196q;
        if (jVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        boolean b10 = jVar.b();
        boolean c10 = this.f1196q.c();
        if (b10 || c10) {
            if (!b10) {
                i10 = 0;
            }
            if (!c10) {
                i11 = 0;
            }
            w(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        boolean z10 = true;
        if (this.H > 0) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.D |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.m mVar) {
        this.f1189l0 = mVar;
        d0.h(this, mVar);
    }

    public void setAdapter(d dVar) {
        setLayoutFrozen(false);
        g gVar = this.O;
        if (gVar != null) {
            gVar.c();
        }
        j jVar = this.f1196q;
        if (jVar != null) {
            jVar.F(this.f1173a);
            this.f1196q.G(this.f1173a);
        }
        p pVar = this.f1173a;
        pVar.f1232a.clear();
        pVar.b();
        androidx.recyclerview.widget.a aVar = this.f1177c;
        aVar.b(aVar.f1295b);
        aVar.b(aVar.f1296c);
        j jVar2 = this.f1196q;
        if (jVar2 != null) {
            jVar2.A();
        }
        p pVar2 = this.f1173a;
        pVar2.f1232a.clear();
        pVar2.b();
        if (pVar2.f1237g == null) {
            pVar2.f1237g = new o();
        }
        o oVar = pVar2.f1237g;
        if (oVar.f1228b == 0) {
            for (int i10 = 0; i10 < oVar.f1227a.size(); i10++) {
                oVar.f1227a.valueAt(i10).f1229a.clear();
            }
        }
        this.f1186i0.f1242c = true;
        this.G |= false;
        this.F = true;
        int e10 = this.f1179d.e();
        for (int i11 = 0; i11 < e10; i11++) {
            p(this.f1179d.d(i11));
        }
        q();
        p pVar3 = this.f1173a;
        int size = pVar3.f1234c.size();
        for (int i12 = 0; i12 < size; i12++) {
            v vVar = pVar3.f1234c.get(i12);
            if (vVar != null) {
                vVar.b(6);
                vVar.a(null);
            }
        }
        RecyclerView.this.getClass();
        pVar3.b();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(e eVar) {
        if (eVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(eVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f) {
            this.N = null;
            this.L = null;
            this.M = null;
            this.K = null;
        }
        this.f = z10;
        super.setClipToPadding(z10);
        if (this.f1205y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(f fVar) {
        fVar.getClass();
        this.J = fVar;
        this.N = null;
        this.L = null;
        this.M = null;
        this.K = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.f1204x = z10;
    }

    public void setItemAnimator(g gVar) {
        g gVar2 = this.O;
        if (gVar2 != null) {
            gVar2.c();
            this.O.f1208a = null;
        }
        this.O = gVar;
        if (gVar != null) {
            gVar.f1208a = this.f1188k0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        p pVar = this.f1173a;
        pVar.f1236e = i10;
        pVar.g();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(j jVar) {
        if (jVar == this.f1196q) {
            return;
        }
        setScrollState(0);
        u uVar = this.f1183f0;
        RecyclerView.this.removeCallbacks(uVar);
        uVar.f1247c.abortAnimation();
        if (this.f1196q != null) {
            g gVar = this.O;
            if (gVar != null) {
                gVar.c();
            }
            this.f1196q.F(this.f1173a);
            this.f1196q.G(this.f1173a);
            p pVar = this.f1173a;
            pVar.f1232a.clear();
            pVar.b();
            if (this.f1203w) {
                j jVar2 = this.f1196q;
                jVar2.f1217e = false;
                jVar2.B(this);
            }
            this.f1196q.J(null);
            this.f1196q = null;
        } else {
            p pVar2 = this.f1173a;
            pVar2.f1232a.clear();
            pVar2.b();
        }
        androidx.recyclerview.widget.b bVar = this.f1179d;
        bVar.f1299b.e();
        int size = bVar.f1300c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b.InterfaceC0019b interfaceC0019b = bVar.f1298a;
            View view = (View) bVar.f1300c.get(size);
            ((androidx.recyclerview.widget.k) interfaceC0019b).getClass();
            p(view);
            bVar.f1300c.remove(size);
        }
        androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) bVar.f1298a;
        int a10 = kVar.a();
        for (int i10 = 0; i10 < a10; i10++) {
            View childAt = kVar.f1358a.getChildAt(i10);
            kVar.f1358a.getClass();
            p(childAt);
            childAt.clearAnimation();
        }
        kVar.f1358a.removeAllViews();
        this.f1196q = jVar;
        if (jVar != null) {
            if (jVar.f1214b != null) {
                throw new IllegalArgumentException("LayoutManager " + jVar + " is already attached to a RecyclerView:" + jVar.f1214b.l());
            }
            jVar.J(this);
            if (this.f1203w) {
                this.f1196q.f1217e = true;
            }
        }
        this.f1173a.g();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        e0.p scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3817d) {
            View view = scrollingChildHelper.f3816c;
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            d0.d.z(view);
        }
        scrollingChildHelper.f3817d = z10;
    }

    public void setOnFlingListener(l lVar) {
    }

    @Deprecated
    public void setOnScrollListener(n nVar) {
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f1182e0 = z10;
    }

    public void setRecycledViewPool(o oVar) {
        p pVar = this.f1173a;
        if (pVar.f1237g != null) {
            r1.f1228b--;
        }
        pVar.f1237g = oVar;
        if (oVar != null) {
            RecyclerView.this.getAdapter();
        }
    }

    @Deprecated
    public void setRecyclerListener(q qVar) {
        this.f1198r = qVar;
    }

    public void setScrollState(int i10) {
        if (i10 == this.P) {
            return;
        }
        this.P = i10;
        if (i10 != 2) {
            u uVar = this.f1183f0;
            RecyclerView.this.removeCallbacks(uVar);
            uVar.f1247c.abortAnimation();
        }
        j jVar = this.f1196q;
        if (jVar != null) {
            jVar.E(i10);
        }
        ArrayList arrayList = this.f1187j0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((n) this.f1187j0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.W = scaledTouchSlop;
            } else {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            }
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.W = scaledTouchSlop;
    }

    public void setViewCacheExtension(t tVar) {
        this.f1173a.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.B) {
            b("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.B = false;
                this.A = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.B = true;
            this.C = true;
            setScrollState(0);
            u uVar = this.f1183f0;
            RecyclerView.this.removeCallbacks(uVar);
            uVar.f1247c.abortAnimation();
        }
    }

    public final void t(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Q) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.Q = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.U = x10;
            this.S = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.V = y10;
            this.T = y10;
        }
    }

    public final void u(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f1192o.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof k) {
            k kVar = (k) layoutParams;
            if (!kVar.f1226b) {
                Rect rect = kVar.f1225a;
                Rect rect2 = this.f1192o;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f1192o);
            offsetRectIntoDescendantCoords(view, this.f1192o);
        }
        this.f1196q.H(this, view, this.f1192o, !this.f1205y, view2 == null);
    }

    public final void v() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        A(0);
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.N.isFinished();
        }
        if (z10) {
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(int r11, int r12, android.view.MotionEvent r13, int r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void x(int i10, int i11, boolean z10) {
        j jVar = this.f1196q;
        if (jVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        int i12 = !jVar.b() ? 0 : i10;
        int i13 = !this.f1196q.c() ? 0 : i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        if (z10) {
            int i14 = i12 != 0 ? 1 : 0;
            if (i13 != 0) {
                i14 |= 2;
            }
            getScrollingChildHelper().g(i14, 1);
        }
        u uVar = this.f1183f0;
        uVar.getClass();
        int abs = Math.abs(i12);
        int abs2 = Math.abs(i13);
        boolean z11 = abs > abs2;
        RecyclerView recyclerView = RecyclerView.this;
        int width = z11 ? recyclerView.getWidth() : recyclerView.getHeight();
        if (!z11) {
            abs = abs2;
        }
        int min = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        b bVar = f1172u0;
        if (uVar.f1248d != bVar) {
            uVar.f1248d = bVar;
            uVar.f1247c = new OverScroller(RecyclerView.this.getContext(), bVar);
        }
        uVar.f1246b = 0;
        uVar.f1245a = 0;
        RecyclerView.this.setScrollState(2);
        uVar.f1247c.startScroll(0, 0, i12, i13, min);
        if (uVar.f1249e) {
            uVar.f = true;
            return;
        }
        RecyclerView.this.removeCallbacks(uVar);
        RecyclerView recyclerView2 = RecyclerView.this;
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        recyclerView2.postOnAnimation(uVar);
    }

    public final void y() {
        int i10 = this.f1206z + 1;
        this.f1206z = i10;
        if (i10 != 1 || this.B) {
            return;
        }
        this.A = false;
    }

    public final void z(boolean z10) {
        if (this.f1206z < 1) {
            this.f1206z = 1;
        }
        if (!z10 && !this.B) {
            this.A = false;
        }
        int i10 = this.f1206z;
        if (i10 == 1) {
            if (z10 && this.A && !this.B) {
                j jVar = this.f1196q;
            }
            if (!this.B) {
                this.A = false;
            }
        }
        this.f1206z = i10 - 1;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        j jVar = this.f1196q;
        if (jVar != null) {
            return jVar.n(layoutParams);
        }
        StringBuilder l10 = defpackage.f.l("RecyclerView has no LayoutManager");
        l10.append(l());
        throw new IllegalStateException(l10.toString());
    }
}
