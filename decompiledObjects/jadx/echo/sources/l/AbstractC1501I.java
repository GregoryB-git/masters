package l;

import I.AbstractC0421s;
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
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import e.AbstractC1238i;
import java.lang.reflect.Method;

/* renamed from: l.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1501I implements k.c {

    /* renamed from: U, reason: collision with root package name */
    public static Method f16298U;

    /* renamed from: V, reason: collision with root package name */
    public static Method f16299V;

    /* renamed from: W, reason: collision with root package name */
    public static Method f16300W;

    /* renamed from: D, reason: collision with root package name */
    public View f16304D;

    /* renamed from: F, reason: collision with root package name */
    public DataSetObserver f16306F;

    /* renamed from: G, reason: collision with root package name */
    public View f16307G;

    /* renamed from: H, reason: collision with root package name */
    public Drawable f16308H;

    /* renamed from: I, reason: collision with root package name */
    public AdapterView.OnItemClickListener f16309I;

    /* renamed from: J, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f16310J;

    /* renamed from: O, reason: collision with root package name */
    public Runnable f16315O;

    /* renamed from: P, reason: collision with root package name */
    public final Handler f16316P;

    /* renamed from: R, reason: collision with root package name */
    public Rect f16318R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f16319S;

    /* renamed from: T, reason: collision with root package name */
    public PopupWindow f16320T;

    /* renamed from: o, reason: collision with root package name */
    public Context f16321o;

    /* renamed from: p, reason: collision with root package name */
    public ListAdapter f16322p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC1495C f16323q;

    /* renamed from: t, reason: collision with root package name */
    public int f16326t;

    /* renamed from: u, reason: collision with root package name */
    public int f16327u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16329w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16330x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16331y;

    /* renamed from: r, reason: collision with root package name */
    public int f16324r = -2;

    /* renamed from: s, reason: collision with root package name */
    public int f16325s = -2;

    /* renamed from: v, reason: collision with root package name */
    public int f16328v = 1002;

    /* renamed from: z, reason: collision with root package name */
    public int f16332z = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f16301A = false;

    /* renamed from: B, reason: collision with root package name */
    public boolean f16302B = false;

    /* renamed from: C, reason: collision with root package name */
    public int f16303C = Integer.MAX_VALUE;

    /* renamed from: E, reason: collision with root package name */
    public int f16305E = 0;

    /* renamed from: K, reason: collision with root package name */
    public final g f16311K = new g();

    /* renamed from: L, reason: collision with root package name */
    public final f f16312L = new f();

    /* renamed from: M, reason: collision with root package name */
    public final e f16313M = new e();

    /* renamed from: N, reason: collision with root package name */
    public final c f16314N = new c();

    /* renamed from: Q, reason: collision with root package name */
    public final Rect f16317Q = new Rect();

    /* renamed from: l.I$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View h7 = AbstractC1501I.this.h();
            if (h7 == null || h7.getWindowToken() == null) {
                return;
            }
            AbstractC1501I.this.a();
        }
    }

    /* renamed from: l.I$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1501I.this.f();
        }
    }

    /* renamed from: l.I$d */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (AbstractC1501I.this.i()) {
                AbstractC1501I.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC1501I.this.dismiss();
        }
    }

    /* renamed from: l.I$f */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = AbstractC1501I.this.f16320T) != null && popupWindow.isShowing() && x7 >= 0 && x7 < AbstractC1501I.this.f16320T.getWidth() && y7 >= 0 && y7 < AbstractC1501I.this.f16320T.getHeight()) {
                AbstractC1501I abstractC1501I = AbstractC1501I.this;
                abstractC1501I.f16316P.postDelayed(abstractC1501I.f16311K, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            AbstractC1501I abstractC1501I2 = AbstractC1501I.this;
            abstractC1501I2.f16316P.removeCallbacks(abstractC1501I2.f16311K);
            return false;
        }
    }

    /* renamed from: l.I$g */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1495C abstractC1495C = AbstractC1501I.this.f16323q;
            if (abstractC1495C == null || !AbstractC0421s.t(abstractC1495C) || AbstractC1501I.this.f16323q.getCount() <= AbstractC1501I.this.f16323q.getChildCount()) {
                return;
            }
            int childCount = AbstractC1501I.this.f16323q.getChildCount();
            AbstractC1501I abstractC1501I = AbstractC1501I.this;
            if (childCount <= abstractC1501I.f16303C) {
                abstractC1501I.f16320T.setInputMethodMode(2);
                AbstractC1501I.this.a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f16298U = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f16300W = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f16299V = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC1501I(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f16321o = context;
        this.f16316P = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1238i.f13502J0, i7, i8);
        this.f16326t = obtainStyledAttributes.getDimensionPixelOffset(AbstractC1238i.f13506K0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(AbstractC1238i.f13510L0, 0);
        this.f16327u = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f16329w = true;
        }
        obtainStyledAttributes.recycle();
        C1510i c1510i = new C1510i(context, attributeSet, i7, i8);
        this.f16320T = c1510i;
        c1510i.setInputMethodMode(1);
    }

    public void A(boolean z7) {
        this.f16331y = true;
        this.f16330x = z7;
    }

    public final void B(boolean z7) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f16320T.setIsClippedToScreen(z7);
            return;
        }
        Method method = f16298U;
        if (method != null) {
            try {
                method.invoke(this.f16320T, Boolean.valueOf(z7));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void C(int i7) {
        this.f16327u = i7;
        this.f16329w = true;
    }

    public void D(int i7) {
        this.f16325s = i7;
    }

    @Override // k.c
    public void a() {
        int e7 = e();
        boolean m7 = m();
        L.g.b(this.f16320T, this.f16328v);
        if (this.f16320T.isShowing()) {
            if (AbstractC0421s.t(h())) {
                int i7 = this.f16325s;
                if (i7 == -1) {
                    i7 = -1;
                } else if (i7 == -2) {
                    i7 = h().getWidth();
                }
                int i8 = this.f16324r;
                if (i8 == -1) {
                    if (!m7) {
                        e7 = -1;
                    }
                    if (m7) {
                        this.f16320T.setWidth(this.f16325s == -1 ? -1 : 0);
                        this.f16320T.setHeight(0);
                    } else {
                        this.f16320T.setWidth(this.f16325s == -1 ? -1 : 0);
                        this.f16320T.setHeight(-1);
                    }
                } else if (i8 != -2) {
                    e7 = i8;
                }
                this.f16320T.setOutsideTouchable((this.f16302B || this.f16301A) ? false : true);
                this.f16320T.update(h(), this.f16326t, this.f16327u, i7 < 0 ? -1 : i7, e7 < 0 ? -1 : e7);
                return;
            }
            return;
        }
        int i9 = this.f16325s;
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = h().getWidth();
        }
        int i10 = this.f16324r;
        if (i10 == -1) {
            e7 = -1;
        } else if (i10 != -2) {
            e7 = i10;
        }
        this.f16320T.setWidth(i9);
        this.f16320T.setHeight(e7);
        B(true);
        this.f16320T.setOutsideTouchable((this.f16302B || this.f16301A) ? false : true);
        this.f16320T.setTouchInterceptor(this.f16312L);
        if (this.f16331y) {
            L.g.a(this.f16320T, this.f16330x);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f16300W;
            if (method != null) {
                try {
                    method.invoke(this.f16320T, this.f16318R);
                } catch (Exception e8) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e8);
                }
            }
        } else {
            this.f16320T.setEpicenterBounds(this.f16318R);
        }
        L.g.c(this.f16320T, h(), this.f16326t, this.f16327u, this.f16332z);
        this.f16323q.setSelection(-1);
        if (!this.f16319S || this.f16323q.isInTouchMode()) {
            f();
        }
        if (this.f16319S) {
            return;
        }
        this.f16316P.post(this.f16314N);
    }

    @Override // k.c
    public ListView d() {
        return this.f16323q;
    }

    @Override // k.c
    public void dismiss() {
        this.f16320T.dismiss();
        o();
        this.f16320T.setContentView(null);
        this.f16323q = null;
        this.f16316P.removeCallbacks(this.f16311K);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC1501I.e():int");
    }

    public void f() {
        AbstractC1495C abstractC1495C = this.f16323q;
        if (abstractC1495C != null) {
            abstractC1495C.setListSelectionHidden(true);
            abstractC1495C.requestLayout();
        }
    }

    public abstract AbstractC1495C g(Context context, boolean z7);

    public View h() {
        return this.f16307G;
    }

    @Override // k.c
    public boolean i() {
        return this.f16320T.isShowing();
    }

    public int j() {
        return this.f16326t;
    }

    public final int k(View view, int i7, boolean z7) {
        int maxAvailableHeight;
        if (Build.VERSION.SDK_INT > 23) {
            maxAvailableHeight = this.f16320T.getMaxAvailableHeight(view, i7, z7);
            return maxAvailableHeight;
        }
        Method method = f16299V;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f16320T, view, Integer.valueOf(i7), Boolean.valueOf(z7))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f16320T.getMaxAvailableHeight(view, i7);
    }

    public int l() {
        if (this.f16329w) {
            return this.f16327u;
        }
        return 0;
    }

    public boolean m() {
        return this.f16320T.getInputMethodMode() == 2;
    }

    public boolean n() {
        return this.f16319S;
    }

    public final void o() {
        View view = this.f16304D;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f16304D);
            }
        }
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f16306F;
        if (dataSetObserver == null) {
            this.f16306F = new d();
        } else {
            ListAdapter listAdapter2 = this.f16322p;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f16322p = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f16306F);
        }
        AbstractC1495C abstractC1495C = this.f16323q;
        if (abstractC1495C != null) {
            abstractC1495C.setAdapter(this.f16322p);
        }
    }

    public void q(View view) {
        this.f16307G = view;
    }

    public void r(int i7) {
        this.f16320T.setAnimationStyle(i7);
    }

    public void s(int i7) {
        Drawable background = this.f16320T.getBackground();
        if (background == null) {
            D(i7);
            return;
        }
        background.getPadding(this.f16317Q);
        Rect rect = this.f16317Q;
        this.f16325s = rect.left + rect.right + i7;
    }

    public void t(int i7) {
        this.f16332z = i7;
    }

    public void u(Rect rect) {
        this.f16318R = rect != null ? new Rect(rect) : null;
    }

    public void v(int i7) {
        this.f16326t = i7;
    }

    public void w(int i7) {
        this.f16320T.setInputMethodMode(i7);
    }

    public void x(boolean z7) {
        this.f16319S = z7;
        this.f16320T.setFocusable(z7);
    }

    public void y(PopupWindow.OnDismissListener onDismissListener) {
        this.f16320T.setOnDismissListener(onDismissListener);
    }

    public void z(AdapterView.OnItemClickListener onItemClickListener) {
        this.f16309I = onItemClickListener;
    }

    /* renamed from: l.I$b */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i7, long j7) {
            AbstractC1495C abstractC1495C;
            if (i7 == -1 || (abstractC1495C = AbstractC1501I.this.f16323q) == null) {
                return;
            }
            abstractC1495C.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: l.I$e */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i7) {
            if (i7 != 1 || AbstractC1501I.this.m() || AbstractC1501I.this.f16320T.getContentView() == null) {
                return;
            }
            AbstractC1501I abstractC1501I = AbstractC1501I.this;
            abstractC1501I.f16316P.removeCallbacks(abstractC1501I.f16311K);
            AbstractC1501I.this.f16311K.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i7, int i8, int i9) {
        }
    }
}
