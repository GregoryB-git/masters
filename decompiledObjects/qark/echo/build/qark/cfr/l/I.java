/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.database.DataSetObserver
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 */
package l;

import I.s;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import l.C;
import l.F;
import l.G;
import l.H;
import l.i;

public abstract class I
implements k.c {
    public static Method U;
    public static Method V;
    public static Method W;
    public boolean A = false;
    public boolean B = false;
    public int C = Integer.MAX_VALUE;
    public View D;
    public int E = 0;
    public DataSetObserver F;
    public View G;
    public Drawable H;
    public AdapterView.OnItemClickListener I;
    public AdapterView.OnItemSelectedListener J;
    public final g K;
    public final f L;
    public final e M;
    public final c N;
    public Runnable O;
    public final Handler P;
    public final Rect Q;
    public Rect R;
    public boolean S;
    public PopupWindow T;
    public Context o;
    public ListAdapter p;
    public C q;
    public int r = -2;
    public int s = -2;
    public int t;
    public int u;
    public int v = 1002;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z = 0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        block9 : {
            if (Build.VERSION.SDK_INT <= 28) {
                block8 : {
                    try {
                        U = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
                        break block8;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {}
                    Log.i((String)"ListPopupWindow", (String)"Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
                try {
                    W = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
                    break block9;
                }
                catch (NoSuchMethodException noSuchMethodException) {}
                Log.i((String)"ListPopupWindow", (String)"Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                V = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
                return;
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            Log.i((String)"ListPopupWindow", (String)"Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
    }

    public I(Context object, AttributeSet attributeSet, int n8, int n9) {
        int n10;
        this.K = new g();
        this.L = new f();
        this.M = new e();
        this.N = new c();
        this.Q = new Rect();
        this.o = object;
        this.P = new Handler(object.getMainLooper());
        TypedArray typedArray = object.obtainStyledAttributes(attributeSet, e.i.J0, n8, n9);
        this.t = typedArray.getDimensionPixelOffset(e.i.K0, 0);
        this.u = n10 = typedArray.getDimensionPixelOffset(e.i.L0, 0);
        if (n10 != 0) {
            this.w = true;
        }
        typedArray.recycle();
        this.T = object = new i((Context)object, attributeSet, n8, n9);
        object.setInputMethodMode(1);
    }

    public void A(boolean bl) {
        this.y = true;
        this.x = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void B(boolean bl) {
        if (Build.VERSION.SDK_INT > 28) {
            H.a(this.T, bl);
            return;
        }
        Method method = U;
        if (method == null) return;
        try {
            method.invoke((Object)this.T, new Object[]{bl});
            return;
        }
        catch (Exception exception) {}
        Log.i((String)"ListPopupWindow", (String)"Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
    }

    public void C(int n8) {
        this.u = n8;
        this.w = true;
    }

    public void D(int n8) {
        this.s = n8;
    }

    @Override
    public void a() {
        int n8;
        int n9 = this.e();
        boolean bl = this.m();
        L.g.b(this.T, this.v);
        boolean bl2 = this.T.isShowing();
        boolean bl3 = true;
        if (bl2) {
            PopupWindow popupWindow;
            int n10;
            if (!s.t(this.h())) {
                return;
            }
            int n11 = this.s;
            if (n11 == -1) {
                n10 = -1;
            } else {
                n10 = n11;
                if (n11 == -2) {
                    n10 = this.h().getWidth();
                }
            }
            n11 = this.r;
            if (n11 == -1) {
                if (!bl) {
                    n9 = -1;
                }
                if (bl) {
                    popupWindow = this.T;
                    n11 = this.s == -1 ? -1 : 0;
                    popupWindow.setWidth(n11);
                    this.T.setHeight(0);
                } else {
                    popupWindow = this.T;
                    n11 = this.s == -1 ? -1 : 0;
                    popupWindow.setWidth(n11);
                    this.T.setHeight(-1);
                }
            } else if (n11 != -2) {
                n9 = n11;
            }
            popupWindow = this.T;
            if (this.B || this.A) {
                bl3 = false;
            }
            popupWindow.setOutsideTouchable(bl3);
            popupWindow = this.T;
            View view = this.h();
            n11 = this.t;
            int n12 = this.u;
            if (n10 < 0) {
                n10 = -1;
            }
            if (n9 < 0) {
                n9 = -1;
            }
            popupWindow.update(view, n11, n12, n10, n9);
            return;
        }
        int n13 = this.s;
        if (n13 == -1) {
            n8 = -1;
        } else {
            n8 = n13;
            if (n13 == -2) {
                n8 = this.h().getWidth();
            }
        }
        n13 = this.r;
        if (n13 == -1) {
            n9 = -1;
        } else if (n13 != -2) {
            n9 = n13;
        }
        this.T.setWidth(n8);
        this.T.setHeight(n9);
        this.B(true);
        PopupWindow popupWindow = this.T;
        bl3 = !this.B && !this.A;
        popupWindow.setOutsideTouchable(bl3);
        this.T.setTouchInterceptor((View.OnTouchListener)this.L);
        if (this.y) {
            L.g.a(this.T, this.x);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            popupWindow = W;
            if (popupWindow != null) {
                try {
                    popupWindow.invoke((Object)this.T, new Object[]{this.R});
                }
                catch (Exception exception) {
                    Log.e((String)"ListPopupWindow", (String)"Could not invoke setEpicenterBounds on PopupWindow", (Throwable)exception);
                }
            }
        } else {
            F.a(this.T, this.R);
        }
        L.g.c(this.T, this.h(), this.t, this.u, this.z);
        this.q.setSelection(-1);
        if (!this.S || this.q.isInTouchMode()) {
            this.f();
        }
        if (!this.S) {
            this.P.post((Runnable)this.N);
        }
    }

    @Override
    public ListView d() {
        return this.q;
    }

    @Override
    public void dismiss() {
        this.T.dismiss();
        this.o();
        this.T.setContentView(null);
        this.q = null;
        this.P.removeCallbacks((Runnable)this.K);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int e() {
        var7_1 = this.q;
        var3_2 = Integer.MIN_VALUE;
        var6_3 = true;
        if (var7_1 == null) {
            var7_1 = this.o;
            this.O = new Runnable(){

                public void run() {
                    View view = I.this.h();
                    if (view != null && view.getWindowToken() != null) {
                        I.this.a();
                    }
                }
            };
            this.q = var8_4 = this.g((Context)var7_1, this.S ^ true);
            var9_6 = this.H;
            if (var9_6 != null) {
                var8_4.setSelector(var9_6);
            }
            this.q.setAdapter(this.p);
            this.q.setOnItemClickListener(this.I);
            this.q.setFocusable(true);
            this.q.setFocusableInTouchMode(true);
            this.q.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

                public void onItemSelected(AdapterView object, View view, int n8, long l8) {
                    if (n8 != -1 && (object = I.this.q) != null) {
                        object.setListSelectionHidden(false);
                    }
                }

                public void onNothingSelected(AdapterView adapterView) {
                }
            });
            this.q.setOnScrollListener((AbsListView.OnScrollListener)this.M);
            var8_4 = this.J;
            if (var8_4 != null) {
                this.q.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)var8_4);
            }
            var8_4 = this.q;
            var9_6 = this.D;
            if (var9_6 != null) {
                var7_1 = new LinearLayout((Context)var7_1);
                var7_1.setOrientation(1);
                var10_7 = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                var1_8 = this.E;
                if (var1_8 != 0) {
                    if (var1_8 != 1) {
                        var8_4 = new StringBuilder();
                        var8_4.append("Invalid hint position ");
                        var8_4.append(this.E);
                        Log.e((String)"ListPopupWindow", (String)var8_4.toString());
                    } else {
                        var7_1.addView((View)var8_4, (ViewGroup.LayoutParams)var10_7);
                        var7_1.addView((View)var9_6);
                    }
                } else {
                    var7_1.addView((View)var9_6);
                    var7_1.addView((View)var8_4, (ViewGroup.LayoutParams)var10_7);
                }
                var1_8 = this.s;
                var2_9 = var1_8 >= 0 ? Integer.MIN_VALUE : (var1_8 = 0);
                var9_6.measure(View.MeasureSpec.makeMeasureSpec((int)var1_8, (int)var2_9), 0);
                var8_4 = (LinearLayout.LayoutParams)var9_6.getLayoutParams();
                var1_8 = var9_6.getMeasuredHeight() + var8_4.topMargin + var8_4.bottomMargin;
            } else {
                var1_8 = 0;
                var7_1 = var8_4;
            }
            this.T.setContentView((View)var7_1);
        } else {
            var7_1 = (ViewGroup)this.T.getContentView();
            var7_1 = this.D;
            if (var7_1 != null) {
                var8_5 = (LinearLayout.LayoutParams)var7_1.getLayoutParams();
                var1_8 = var7_1.getMeasuredHeight() + var8_5.topMargin + var8_5.bottomMargin;
            } else {
                var1_8 = 0;
            }
        }
        var7_1 = this.T.getBackground();
        if (var7_1 != null) {
            var7_1.getPadding(this.Q);
            var7_1 = this.Q;
            var5_10 = var7_1.top;
            var2_9 = var4_11 = var7_1.bottom + var5_10;
            if (!this.w) {
                this.u = - var5_10;
                var2_9 = var4_11;
            }
        } else {
            this.Q.setEmpty();
            var2_9 = 0;
        }
        if (this.T.getInputMethodMode() != 2) {
            var6_3 = false;
        }
        var4_11 = this.k(this.h(), this.u, var6_3);
        if (this.A != false) return var4_11 + var2_9;
        if (this.r == -1) {
            return var4_11 + var2_9;
        }
        var5_10 = this.s;
        if (var5_10 == -2) ** GOTO lbl-1000
        var3_2 = 1073741824;
        if (var5_10 != -1) {
            var3_2 = View.MeasureSpec.makeMeasureSpec((int)var5_10, (int)1073741824);
        } else lbl-1000: // 2 sources:
        {
            var5_10 = this.o.getResources().getDisplayMetrics().widthPixels;
            var7_1 = this.Q;
            var3_2 = View.MeasureSpec.makeMeasureSpec((int)(var5_10 - (var7_1.left + var7_1.right)), (int)var3_2);
        }
        var4_11 = this.q.d(var3_2, 0, -1, var4_11 - var1_8, -1);
        var3_2 = var1_8;
        if (var4_11 <= 0) return var4_11 + var3_2;
        var3_2 = var1_8 + (var2_9 + (this.q.getPaddingTop() + this.q.getPaddingBottom()));
        return var4_11 + var3_2;
    }

    public void f() {
        C c8 = this.q;
        if (c8 != null) {
            c8.setListSelectionHidden(true);
            c8.requestLayout();
        }
    }

    public abstract C g(Context var1, boolean var2);

    public View h() {
        return this.G;
    }

    @Override
    public boolean i() {
        return this.T.isShowing();
    }

    public int j() {
        return this.t;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int k(View view, int n8, boolean bl) {
        if (Build.VERSION.SDK_INT > 23) {
            return G.a(this.T, view, n8, bl);
        }
        Method method = V;
        if (method == null) return this.T.getMaxAvailableHeight(view, n8);
        try {
            return (Integer)method.invoke((Object)this.T, new Object[]{view, n8, bl});
        }
        catch (Exception exception) {}
        Log.i((String)"ListPopupWindow", (String)"Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
        return this.T.getMaxAvailableHeight(view, n8);
    }

    public int l() {
        if (!this.w) {
            return 0;
        }
        return this.u;
    }

    public boolean m() {
        if (this.T.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    public boolean n() {
        return this.S;
    }

    public final void o() {
        View view = this.D;
        if (view != null && (view = view.getParent()) instanceof ViewGroup) {
            ((ViewGroup)view).removeView(this.D);
        }
    }

    public void p(ListAdapter object) {
        DataSetObserver dataSetObserver = this.F;
        if (dataSetObserver == null) {
            this.F = new d();
        } else {
            ListAdapter listAdapter = this.p;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.p = object;
        if (object != null) {
            object.registerDataSetObserver(this.F);
        }
        if ((object = this.q) != null) {
            object.setAdapter(this.p);
        }
    }

    public void q(View view) {
        this.G = view;
    }

    public void r(int n8) {
        this.T.setAnimationStyle(n8);
    }

    public void s(int n8) {
        Drawable drawable2 = this.T.getBackground();
        if (drawable2 != null) {
            drawable2.getPadding(this.Q);
            drawable2 = this.Q;
            this.s = drawable2.left + drawable2.right + n8;
            return;
        }
        this.D(n8);
    }

    public void t(int n8) {
        this.z = n8;
    }

    public void u(Rect rect) {
        rect = rect != null ? new Rect(rect) : null;
        this.R = rect;
    }

    public void v(int n8) {
        this.t = n8;
    }

    public void w(int n8) {
        this.T.setInputMethodMode(n8);
    }

    public void x(boolean bl) {
        this.S = bl;
        this.T.setFocusable(bl);
    }

    public void y(PopupWindow.OnDismissListener onDismissListener) {
        this.T.setOnDismissListener(onDismissListener);
    }

    public void z(AdapterView.OnItemClickListener onItemClickListener) {
        this.I = onItemClickListener;
    }

    public class c
    implements Runnable {
        public void run() {
            I.this.f();
        }
    }

    public class d
    extends DataSetObserver {
        public void onChanged() {
            if (I.this.i()) {
                I.this.a();
            }
        }

        public void onInvalidated() {
            I.this.dismiss();
        }
    }

    public class e
    implements AbsListView.OnScrollListener {
        public void onScroll(AbsListView absListView, int n8, int n9, int n10) {
        }

        public void onScrollStateChanged(AbsListView object, int n8) {
            if (n8 == 1 && !I.this.m() && I.this.T.getContentView() != null) {
                object = I.this;
                object.P.removeCallbacks((Runnable)object.K);
                I.this.K.run();
            }
        }
    }

    public class f
    implements View.OnTouchListener {
        public boolean onTouch(View object, MotionEvent motionEvent) {
            int n8 = motionEvent.getAction();
            int n9 = (int)motionEvent.getX();
            int n10 = (int)motionEvent.getY();
            if (n8 == 0 && (object = I.this.T) != null && object.isShowing() && n9 >= 0 && n9 < I.this.T.getWidth() && n10 >= 0 && n10 < I.this.T.getHeight()) {
                object = I.this;
                object.P.postDelayed((Runnable)object.K, 250L);
            } else if (n8 == 1) {
                object = I.this;
                object.P.removeCallbacks((Runnable)object.K);
            }
            return false;
        }
    }

    public class g
    implements Runnable {
        public void run() {
            Object object = I.this.q;
            if (object != null && s.t((View)object) && I.this.q.getCount() > I.this.q.getChildCount()) {
                int n8 = I.this.q.getChildCount();
                object = I.this;
                if (n8 <= object.C) {
                    object.T.setInputMethodMode(2);
                    I.this.a();
                }
            }
        }
    }

}

