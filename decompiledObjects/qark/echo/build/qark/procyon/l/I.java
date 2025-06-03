// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.widget.Adapter;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.PopupWindow$OnDismissListener;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.widget.AbsListView$OnScrollListener;
import android.widget.AdapterView;
import android.widget.ListView;
import I.s;
import android.view.View$OnTouchListener;
import L.g;
import android.util.Log;
import android.os.Build$VERSION;
import android.content.res.TypedArray;
import e.i;
import android.util.AttributeSet;
import android.widget.ListAdapter;
import android.content.Context;
import android.widget.PopupWindow;
import android.graphics.Rect;
import android.os.Handler;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AdapterView$OnItemClickListener;
import android.graphics.drawable.Drawable;
import android.database.DataSetObserver;
import android.view.View;
import java.lang.reflect.Method;
import k.c;

public abstract class I implements k.c
{
    public static Method U;
    public static Method V;
    public static Method W;
    public boolean A;
    public boolean B;
    public int C;
    public View D;
    public int E;
    public DataSetObserver F;
    public View G;
    public Drawable H;
    public AdapterView$OnItemClickListener I;
    public AdapterView$OnItemSelectedListener J;
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
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          28
        //     5: if_icmpgt       69
        //     8: ldc             Landroid/widget/PopupWindow;.class
        //    10: ldc             "setClipToScreenEnabled"
        //    12: iconst_1       
        //    13: anewarray       Ljava/lang/Class;
        //    16: dup            
        //    17: iconst_0       
        //    18: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    21: aastore        
        //    22: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    25: putstatic       l/I.U:Ljava/lang/reflect/Method;
        //    28: goto            39
        //    31: ldc             "ListPopupWindow"
        //    33: ldc             "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."
        //    35: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //    38: pop            
        //    39: ldc             Landroid/widget/PopupWindow;.class
        //    41: ldc             "setEpicenterBounds"
        //    43: iconst_1       
        //    44: anewarray       Ljava/lang/Class;
        //    47: dup            
        //    48: iconst_0       
        //    49: ldc             Landroid/graphics/Rect;.class
        //    51: aastore        
        //    52: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    55: putstatic       l/I.W:Ljava/lang/reflect/Method;
        //    58: goto            69
        //    61: ldc             "ListPopupWindow"
        //    63: ldc             "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."
        //    65: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //    68: pop            
        //    69: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    72: bipush          23
        //    74: if_icmpgt       117
        //    77: ldc             Landroid/widget/PopupWindow;.class
        //    79: ldc             "getMaxAvailableHeight"
        //    81: iconst_3       
        //    82: anewarray       Ljava/lang/Class;
        //    85: dup            
        //    86: iconst_0       
        //    87: ldc             Landroid/view/View;.class
        //    89: aastore        
        //    90: dup            
        //    91: iconst_1       
        //    92: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    95: aastore        
        //    96: dup            
        //    97: iconst_2       
        //    98: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //   101: aastore        
        //   102: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   105: putstatic       l/I.V:Ljava/lang/reflect/Method;
        //   108: return         
        //   109: ldc             "ListPopupWindow"
        //   111: ldc             "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well."
        //   113: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   116: pop            
        //   117: return         
        //   118: astore_0       
        //   119: goto            31
        //   122: astore_0       
        //   123: goto            61
        //   126: astore_0       
        //   127: goto            109
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      28     118    39     Ljava/lang/NoSuchMethodException;
        //  39     58     122    69     Ljava/lang/NoSuchMethodException;
        //  77     108    126    117    Ljava/lang/NoSuchMethodException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 66 out of bounds for length 66
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public I(final Context o, final AttributeSet set, final int n, final int n2) {
        this.r = -2;
        this.s = -2;
        this.v = 1002;
        this.z = 0;
        this.A = false;
        this.B = false;
        this.C = Integer.MAX_VALUE;
        this.E = 0;
        this.K = new g();
        this.L = new f();
        this.M = new e();
        this.N = new c();
        this.Q = new Rect();
        this.o = o;
        this.P = new Handler(o.getMainLooper());
        final TypedArray obtainStyledAttributes = o.obtainStyledAttributes(set, i.J0, n, n2);
        this.t = obtainStyledAttributes.getDimensionPixelOffset(i.K0, 0);
        final int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(i.L0, 0);
        this.u = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.w = true;
        }
        obtainStyledAttributes.recycle();
        (this.T = new l.i(o, set, n, n2)).setInputMethodMode(1);
    }
    
    public void A(final boolean x) {
        this.y = true;
        this.x = x;
    }
    
    public final void B(final boolean b) {
        Label_0046: {
            if (Build$VERSION.SDK_INT > 28) {
                break Label_0046;
            }
            final Method u = l.I.U;
            if (u == null) {
                return;
            }
            while (true) {
                while (true) {
                    try {
                        u.invoke(this.T, b);
                        return;
                        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                        return;
                        l.H.a(this.T, b);
                        return;
                    }
                    catch (Exception ex) {}
                    continue;
                }
            }
        }
    }
    
    public void C(final int u) {
        this.u = u;
        this.w = true;
    }
    
    public void D(final int s) {
        this.s = s;
    }
    
    @Override
    public void a() {
        int e = this.e();
        final boolean m = this.m();
        L.g.b(this.T, this.v);
        final boolean showing = this.T.isShowing();
        boolean outsideTouchable = true;
        if (!showing) {
            final int s = this.s;
            int width;
            if (s == -1) {
                width = -1;
            }
            else if ((width = s) == -2) {
                width = this.h().getWidth();
            }
            final int r = this.r;
            if (r == -1) {
                e = -1;
            }
            else if (r != -2) {
                e = r;
            }
            this.T.setWidth(width);
            this.T.setHeight(e);
            this.B(true);
            this.T.setOutsideTouchable(!this.B && !this.A);
            this.T.setTouchInterceptor((View$OnTouchListener)this.L);
            if (this.y) {
                L.g.a(this.T, this.x);
            }
            if (Build$VERSION.SDK_INT <= 28) {
                final Method w = l.I.W;
                if (w != null) {
                    try {
                        w.invoke(this.T, this.R);
                    }
                    catch (Exception ex) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", (Throwable)ex);
                    }
                }
            }
            else {
                l.F.a(this.T, this.R);
            }
            L.g.c(this.T, this.h(), this.t, this.u, this.z);
            ((AdapterView)this.q).setSelection(-1);
            if (!this.S || this.q.isInTouchMode()) {
                this.f();
            }
            if (!this.S) {
                this.P.post((Runnable)this.N);
            }
            return;
        }
        if (!I.s.t(this.h())) {
            return;
        }
        final int s2 = this.s;
        int width2;
        if (s2 == -1) {
            width2 = -1;
        }
        else if ((width2 = s2) == -2) {
            width2 = this.h().getWidth();
        }
        final int r2 = this.r;
        if (r2 == -1) {
            if (!m) {
                e = -1;
            }
            if (m) {
                final PopupWindow t = this.T;
                int width3;
                if (this.s == -1) {
                    width3 = -1;
                }
                else {
                    width3 = 0;
                }
                t.setWidth(width3);
                this.T.setHeight(0);
            }
            else {
                final PopupWindow t2 = this.T;
                int width4;
                if (this.s == -1) {
                    width4 = -1;
                }
                else {
                    width4 = 0;
                }
                t2.setWidth(width4);
                this.T.setHeight(-1);
            }
        }
        else if (r2 != -2) {
            e = r2;
        }
        final PopupWindow t3 = this.T;
        if (this.B || this.A) {
            outsideTouchable = false;
        }
        t3.setOutsideTouchable(outsideTouchable);
        final PopupWindow t4 = this.T;
        final View h = this.h();
        final int t5 = this.t;
        final int u = this.u;
        if (width2 < 0) {
            width2 = -1;
        }
        if (e < 0) {
            e = -1;
        }
        t4.update(h, t5, u, width2, e);
    }
    
    @Override
    public ListView d() {
        return this.q;
    }
    
    @Override
    public void dismiss() {
        this.T.dismiss();
        this.o();
        this.T.setContentView((View)null);
        this.q = null;
        this.P.removeCallbacks((Runnable)this.K);
    }
    
    public final int e() {
        final C q = this.q;
        int n = Integer.MIN_VALUE;
        boolean b = true;
        int n3;
        if (q == null) {
            final Context o = this.o;
            this.O = new Runnable() {
                @Override
                public void run() {
                    final View h = l.I.this.h();
                    if (h != null && h.getWindowToken() != null) {
                        l.I.this.a();
                    }
                }
            };
            final C g = this.g(o, this.S ^ true);
            this.q = g;
            final Drawable h = this.H;
            if (h != null) {
                g.setSelector(h);
            }
            ((AbsListView)this.q).setAdapter(this.p);
            ((AdapterView)this.q).setOnItemClickListener(this.I);
            ((View)this.q).setFocusable(true);
            ((View)this.q).setFocusableInTouchMode(true);
            ((AdapterView)this.q).setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new AdapterView$OnItemSelectedListener() {
                public void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
                    if (n != -1) {
                        final C q = l.I.this.q;
                        if (q != null) {
                            q.setListSelectionHidden(false);
                        }
                    }
                }
                
                public void onNothingSelected(final AdapterView adapterView) {
                }
            });
            ((AbsListView)this.q).setOnScrollListener((AbsListView$OnScrollListener)this.M);
            final AdapterView$OnItemSelectedListener j = this.J;
            if (j != null) {
                ((AdapterView)this.q).setOnItemSelectedListener(j);
            }
            final C q2 = this.q;
            final View d = this.D;
            Object contentView;
            if (d != null) {
                contentView = new LinearLayout(o);
                ((LinearLayout)contentView).setOrientation(1);
                final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, 0, 1.0f);
                final int e = this.E;
                if (e != 0) {
                    if (e != 1) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid hint position ");
                        sb.append(this.E);
                        Log.e("ListPopupWindow", sb.toString());
                    }
                    else {
                        ((ViewGroup)contentView).addView((View)q2, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
                        ((ViewGroup)contentView).addView(d);
                    }
                }
                else {
                    ((ViewGroup)contentView).addView(d);
                    ((ViewGroup)contentView).addView((View)q2, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
                }
                int s = this.s;
                int n2;
                if (s >= 0) {
                    n2 = Integer.MIN_VALUE;
                }
                else {
                    s = (n2 = 0);
                }
                d.measure(View$MeasureSpec.makeMeasureSpec(s, n2), 0);
                final LinearLayout$LayoutParams linearLayout$LayoutParams2 = (LinearLayout$LayoutParams)d.getLayoutParams();
                n3 = d.getMeasuredHeight() + linearLayout$LayoutParams2.topMargin + linearLayout$LayoutParams2.bottomMargin;
            }
            else {
                n3 = 0;
                contentView = q2;
            }
            this.T.setContentView((View)contentView);
        }
        else {
            final ViewGroup viewGroup = (ViewGroup)this.T.getContentView();
            final View d2 = this.D;
            if (d2 != null) {
                final LinearLayout$LayoutParams linearLayout$LayoutParams3 = (LinearLayout$LayoutParams)d2.getLayoutParams();
                n3 = d2.getMeasuredHeight() + linearLayout$LayoutParams3.topMargin + linearLayout$LayoutParams3.bottomMargin;
            }
            else {
                n3 = 0;
            }
        }
        final Drawable background = this.T.getBackground();
        int n5;
        if (background != null) {
            background.getPadding(this.Q);
            final Rect q3 = this.Q;
            final int top = q3.top;
            final int n4 = n5 = q3.bottom + top;
            if (!this.w) {
                this.u = -top;
                n5 = n4;
            }
        }
        else {
            this.Q.setEmpty();
            n5 = 0;
        }
        if (this.T.getInputMethodMode() != 2) {
            b = false;
        }
        final int k = this.k(this.h(), this.u, b);
        if (!this.A && this.r != -1) {
            final int s2 = this.s;
            while (true) {
                Label_0596: {
                    if (s2 == -2) {
                        break Label_0596;
                    }
                    n = 1073741824;
                    if (s2 == -1) {
                        break Label_0596;
                    }
                    final int n6 = View$MeasureSpec.makeMeasureSpec(s2, 1073741824);
                    final int d3 = this.q.d(n6, 0, -1, k - n3, -1);
                    int n7 = n3;
                    if (d3 > 0) {
                        n7 = n3 + (n5 + (((View)this.q).getPaddingTop() + ((View)this.q).getPaddingBottom()));
                    }
                    return d3 + n7;
                }
                final int widthPixels = this.o.getResources().getDisplayMetrics().widthPixels;
                final Rect q4 = this.Q;
                final int n6 = View$MeasureSpec.makeMeasureSpec(widthPixels - (q4.left + q4.right), n);
                continue;
            }
        }
        return k + n5;
    }
    
    public void f() {
        final C q = this.q;
        if (q != null) {
            q.setListSelectionHidden(true);
            ((View)q).requestLayout();
        }
    }
    
    public abstract C g(final Context p0, final boolean p1);
    
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
    
    public final int k(final View view, final int i, final boolean b) {
        Label_0079: {
            if (Build$VERSION.SDK_INT > 23) {
                break Label_0079;
            }
            final Method v = l.I.V;
            Label_0069: {
                if (v == null) {
                    break Label_0069;
                }
                while (true) {
                    while (true) {
                        try {
                            return (int)v.invoke(this.T, view, i, b);
                            Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                            return this.T.getMaxAvailableHeight(view, i);
                            return l.G.a(this.T, view, i, b);
                            return this.T.getMaxAvailableHeight(view, i);
                        }
                        catch (Exception ex) {}
                        continue;
                    }
                }
            }
        }
    }
    
    public int l() {
        if (!this.w) {
            return 0;
        }
        return this.u;
    }
    
    public boolean m() {
        return this.T.getInputMethodMode() == 2;
    }
    
    public boolean n() {
        return this.S;
    }
    
    public final void o() {
        final View d = this.D;
        if (d != null) {
            final ViewParent parent = d.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup)parent).removeView(this.D);
            }
        }
    }
    
    public void p(final ListAdapter p) {
        final DataSetObserver f = this.F;
        if (f == null) {
            this.F = new d();
        }
        else {
            final ListAdapter p2 = this.p;
            if (p2 != null) {
                ((Adapter)p2).unregisterDataSetObserver(f);
            }
        }
        if ((this.p = p) != null) {
            ((Adapter)p).registerDataSetObserver(this.F);
        }
        final C q = this.q;
        if (q != null) {
            ((AbsListView)q).setAdapter(this.p);
        }
    }
    
    public void q(final View g) {
        this.G = g;
    }
    
    public void r(final int animationStyle) {
        this.T.setAnimationStyle(animationStyle);
    }
    
    public void s(final int n) {
        final Drawable background = this.T.getBackground();
        if (background != null) {
            background.getPadding(this.Q);
            final Rect q = this.Q;
            this.s = q.left + q.right + n;
            return;
        }
        this.D(n);
    }
    
    public void t(final int z) {
        this.z = z;
    }
    
    public void u(Rect r) {
        if (r != null) {
            r = new Rect(r);
        }
        else {
            r = null;
        }
        this.R = r;
    }
    
    public void v(final int t) {
        this.t = t;
    }
    
    public void w(final int inputMethodMode) {
        this.T.setInputMethodMode(inputMethodMode);
    }
    
    public void x(final boolean b) {
        this.S = b;
        this.T.setFocusable(b);
    }
    
    public void y(final PopupWindow$OnDismissListener onDismissListener) {
        this.T.setOnDismissListener(onDismissListener);
    }
    
    public void z(final AdapterView$OnItemClickListener i) {
        this.I = i;
    }
    
    public class c implements Runnable
    {
        @Override
        public void run() {
            l.I.this.f();
        }
    }
    
    public class d extends DataSetObserver
    {
        public void onChanged() {
            if (l.I.this.i()) {
                l.I.this.a();
            }
        }
        
        public void onInvalidated() {
            l.I.this.dismiss();
        }
    }
    
    public class e implements AbsListView$OnScrollListener
    {
        public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        }
        
        public void onScrollStateChanged(final AbsListView absListView, final int n) {
            if (n == 1 && !l.I.this.m() && l.I.this.T.getContentView() != null) {
                final I a = l.I.this;
                a.P.removeCallbacks((Runnable)a.K);
                l.I.this.K.run();
            }
        }
    }
    
    public class f implements View$OnTouchListener
    {
        public boolean onTouch(final View view, final MotionEvent motionEvent) {
            final int action = motionEvent.getAction();
            final int n = (int)motionEvent.getX();
            final int n2 = (int)motionEvent.getY();
            if (action == 0) {
                final PopupWindow t = l.I.this.T;
                if (t != null && t.isShowing() && n >= 0 && n < l.I.this.T.getWidth() && n2 >= 0 && n2 < l.I.this.T.getHeight()) {
                    final I o = l.I.this;
                    o.P.postDelayed((Runnable)o.K, 250L);
                    return false;
                }
            }
            if (action == 1) {
                final I o2 = l.I.this;
                o2.P.removeCallbacks((Runnable)o2.K);
            }
            return false;
        }
    }
    
    public class g implements Runnable
    {
        @Override
        public void run() {
            final C q = l.I.this.q;
            if (q != null && I.s.t((View)q) && ((AdapterView)l.I.this.q).getCount() > ((ViewGroup)l.I.this.q).getChildCount()) {
                final int childCount = ((ViewGroup)l.I.this.q).getChildCount();
                final I o = l.I.this;
                if (childCount <= o.C) {
                    o.T.setInputMethodMode(2);
                    l.I.this.a();
                }
            }
        }
    }
}
