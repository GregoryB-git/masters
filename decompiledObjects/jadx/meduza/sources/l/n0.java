package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class n0 implements k.f {
    public static Method H;
    public static Method I;
    public static Method J;
    public final Handler C;
    public Rect E;
    public boolean F;
    public r G;

    /* renamed from: a, reason: collision with root package name */
    public Context f9408a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f9409b;

    /* renamed from: c, reason: collision with root package name */
    public j0 f9410c;
    public int f;

    /* renamed from: o, reason: collision with root package name */
    public int f9413o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9415q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9416r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9417s;

    /* renamed from: v, reason: collision with root package name */
    public d f9419v;

    /* renamed from: w, reason: collision with root package name */
    public View f9420w;

    /* renamed from: x, reason: collision with root package name */
    public AdapterView.OnItemClickListener f9421x;

    /* renamed from: d, reason: collision with root package name */
    public int f9411d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f9412e = -2;

    /* renamed from: p, reason: collision with root package name */
    public int f9414p = 1002;
    public int t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f9418u = Integer.MAX_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public final g f9422y = new g();

    /* renamed from: z, reason: collision with root package name */
    public final f f9423z = new f();
    public final e A = new e();
    public final c B = new c();
    public final Rect D = new Rect();

    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            int maxAvailableHeight;
            maxAvailableHeight = popupWindow.getMaxAvailableHeight(view, i10, z10);
            return maxAvailableHeight;
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            j0 j0Var = n0.this.f9410c;
            if (j0Var != null) {
                j0Var.setListSelectionHidden(true);
                j0Var.requestLayout();
            }
        }
    }

    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            if (n0.this.a()) {
                n0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            n0.this.dismiss();
        }
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 == 1) {
                if ((n0.this.G.getInputMethodMode() == 2) || n0.this.G.getContentView() == null) {
                    return;
                }
                n0 n0Var = n0.this;
                n0Var.C.removeCallbacks(n0Var.f9422y);
                n0.this.f9422y.run();
            }
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            r rVar;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (rVar = n0.this.G) != null && rVar.isShowing() && x10 >= 0 && x10 < n0.this.G.getWidth() && y10 >= 0 && y10 < n0.this.G.getHeight()) {
                n0 n0Var = n0.this;
                n0Var.C.postDelayed(n0Var.f9422y, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            n0 n0Var2 = n0.this;
            n0Var2.C.removeCallbacks(n0Var2.f9422y);
            return false;
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            j0 j0Var = n0.this.f9410c;
            if (j0Var != null) {
                WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
                if (!j0Var.isAttachedToWindow() || n0.this.f9410c.getCount() <= n0.this.f9410c.getChildCount()) {
                    return;
                }
                int childCount = n0.this.f9410c.getChildCount();
                n0 n0Var = n0.this;
                if (childCount <= n0Var.f9418u) {
                    n0Var.G.setInputMethodMode(2);
                    n0.this.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                J = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                I = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public n0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f9408a = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a0.B, i10, i11);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f9413o = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f9415q = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, attributeSet, i10, i11);
        this.G = rVar;
        rVar.setInputMethodMode(1);
    }

    @Override // k.f
    public final boolean a() {
        return this.G.isShowing();
    }

    public final int b() {
        return this.f;
    }

    public final void d(int i10) {
        this.f = i10;
    }

    @Override // k.f
    public final void dismiss() {
        this.G.dismiss();
        this.G.setContentView(null);
        this.f9410c = null;
        this.C.removeCallbacks(this.f9422y);
    }

    public final Drawable g() {
        return this.G.getBackground();
    }

    @Override // k.f
    public final j0 h() {
        return this.f9410c;
    }

    public final void j(Drawable drawable) {
        this.G.setBackgroundDrawable(drawable);
    }

    public final void k(int i10) {
        this.f9413o = i10;
        this.f9415q = true;
    }

    public final int n() {
        if (this.f9415q) {
            return this.f9413o;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        d dVar = this.f9419v;
        if (dVar == null) {
            this.f9419v = new d();
        } else {
            ListAdapter listAdapter2 = this.f9409b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f9409b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f9419v);
        }
        j0 j0Var = this.f9410c;
        if (j0Var != null) {
            j0Var.setAdapter(this.f9409b);
        }
    }

    public j0 p(Context context, boolean z10) {
        return new j0(context, z10);
    }

    public final void q(int i10) {
        Drawable background = this.G.getBackground();
        if (background == null) {
            this.f9412e = i10;
            return;
        }
        background.getPadding(this.D);
        Rect rect = this.D;
        this.f9412e = rect.left + rect.right + i10;
    }

    @Override // k.f
    public final void show() {
        int i10;
        int a10;
        int i11;
        int paddingBottom;
        j0 j0Var;
        if (this.f9410c == null) {
            j0 p10 = p(this.f9408a, !this.F);
            this.f9410c = p10;
            p10.setAdapter(this.f9409b);
            this.f9410c.setOnItemClickListener(this.f9421x);
            this.f9410c.setFocusable(true);
            this.f9410c.setFocusableInTouchMode(true);
            this.f9410c.setOnItemSelectedListener(new m0(this));
            this.f9410c.setOnScrollListener(this.A);
            this.G.setContentView(this.f9410c);
        }
        Drawable background = this.G.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            Rect rect = this.D;
            int i12 = rect.top;
            i10 = rect.bottom + i12;
            if (!this.f9415q) {
                this.f9413o = -i12;
            }
        } else {
            this.D.setEmpty();
            i10 = 0;
        }
        boolean z10 = this.G.getInputMethodMode() == 2;
        View view = this.f9420w;
        int i13 = this.f9413o;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = I;
            if (method != null) {
                try {
                    a10 = ((Integer) method.invoke(this.G, view, Integer.valueOf(i13), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a10 = this.G.getMaxAvailableHeight(view, i13);
        } else {
            a10 = a.a(this.G, view, i13, z10);
        }
        if (this.f9411d == -1) {
            paddingBottom = a10 + i10;
        } else {
            int i14 = this.f9412e;
            if (i14 != -2) {
                i11 = 1073741824;
                if (i14 == -1) {
                    int i15 = this.f9408a.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.D;
                    i14 = i15 - (rect2.left + rect2.right);
                }
            } else {
                int i16 = this.f9408a.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.D;
                i14 = i16 - (rect3.left + rect3.right);
                i11 = Integer.MIN_VALUE;
            }
            int a11 = this.f9410c.a(View.MeasureSpec.makeMeasureSpec(i14, i11), a10 + 0);
            paddingBottom = a11 + (a11 > 0 ? this.f9410c.getPaddingBottom() + this.f9410c.getPaddingTop() + i10 + 0 : 0);
        }
        boolean z11 = this.G.getInputMethodMode() == 2;
        j0.g.d(this.G, this.f9414p);
        if (this.G.isShowing()) {
            View view2 = this.f9420w;
            WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
            if (view2.isAttachedToWindow()) {
                int i17 = this.f9412e;
                if (i17 == -1) {
                    i17 = -1;
                } else if (i17 == -2) {
                    i17 = this.f9420w.getWidth();
                }
                int i18 = this.f9411d;
                if (i18 == -1) {
                    if (!z11) {
                        paddingBottom = -1;
                    }
                    if (z11) {
                        this.G.setWidth(this.f9412e == -1 ? -1 : 0);
                        this.G.setHeight(0);
                    } else {
                        this.G.setWidth(this.f9412e == -1 ? -1 : 0);
                        this.G.setHeight(-1);
                    }
                } else if (i18 != -2) {
                    paddingBottom = i18;
                }
                this.G.setOutsideTouchable(true);
                this.G.update(this.f9420w, this.f, this.f9413o, i17 < 0 ? -1 : i17, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i19 = this.f9412e;
        if (i19 == -1) {
            i19 = -1;
        } else if (i19 == -2) {
            i19 = this.f9420w.getWidth();
        }
        int i20 = this.f9411d;
        if (i20 == -1) {
            paddingBottom = -1;
        } else if (i20 != -2) {
            paddingBottom = i20;
        }
        this.G.setWidth(i19);
        this.G.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = H;
            if (method2 != null) {
                try {
                    method2.invoke(this.G, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(this.G, true);
        }
        this.G.setOutsideTouchable(true);
        this.G.setTouchInterceptor(this.f9423z);
        if (this.f9417s) {
            j0.g.c(this.G, this.f9416r);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = J;
            if (method3 != null) {
                try {
                    method3.invoke(this.G, this.E);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            b.a(this.G, this.E);
        }
        this.G.showAsDropDown(this.f9420w, this.f, this.f9413o, this.t);
        this.f9410c.setSelection(-1);
        if ((!this.F || this.f9410c.isInTouchMode()) && (j0Var = this.f9410c) != null) {
            j0Var.setListSelectionHidden(true);
            j0Var.requestLayout();
        }
        if (this.F) {
            return;
        }
        this.C.post(this.B);
    }
}
