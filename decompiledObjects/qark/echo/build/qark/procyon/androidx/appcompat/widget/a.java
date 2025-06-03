// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.view.View$OnTouchListener;
import l.E;
import l.Z;
import android.util.AttributeSet;
import k.c;
import androidx.appcompat.view.menu.g;
import android.view.ViewParent;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.MenuItem;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import android.content.res.Resources;
import android.view.View$MeasureSpec;
import android.view.View;
import android.content.res.Configuration;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.d;
import e.f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;

public class a extends a
{
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public final SparseBooleanArray K;
    public e L;
    public a M;
    public c N;
    public b O;
    public final f P;
    public int Q;
    public d x;
    public Drawable y;
    public boolean z;
    
    public a(final Context context) {
        super(context, e.f.c, e.f.b);
        this.K = new SparseBooleanArray();
        this.P = new f();
    }
    
    public static /* synthetic */ androidx.appcompat.view.menu.d p(final a a) {
        return a.q;
    }
    
    public static /* synthetic */ androidx.appcompat.view.menu.d q(final a a) {
        return a.q;
    }
    
    public static /* synthetic */ h r(final a a) {
        return a.w;
    }
    
    public static /* synthetic */ androidx.appcompat.view.menu.d s(final a a) {
        return a.q;
    }
    
    public static /* synthetic */ androidx.appcompat.view.menu.d t(final a a) {
        return a.q;
    }
    
    public static /* synthetic */ androidx.appcompat.view.menu.d u(final a a) {
        return a.q;
    }
    
    public static /* synthetic */ h v(final a a) {
        return a.w;
    }
    
    public boolean A() {
        final a m = this.M;
        if (m != null) {
            m.b();
            return true;
        }
        return false;
    }
    
    public boolean B() {
        final e l = this.L;
        return l != null && l.d();
    }
    
    public void C(final Configuration configuration) {
        if (!this.F) {
            this.E = j.a.a(super.p).c();
        }
        final androidx.appcompat.view.menu.d q = super.q;
        if (q != null) {
            q.G(true);
        }
    }
    
    public void D(final boolean i) {
        this.I = i;
    }
    
    public void E(final ActionMenuView w) {
        ((ActionMenuView)(super.w = w)).E(super.q);
    }
    
    public void F(final Drawable drawable) {
        final d x = this.x;
        if (x != null) {
            x.setImageDrawable(drawable);
            return;
        }
        this.z = true;
        this.y = drawable;
    }
    
    public void G(final boolean a) {
        this.A = a;
        this.B = true;
    }
    
    public boolean H() {
        if (this.A && !this.B()) {
            final androidx.appcompat.view.menu.d q = super.q;
            if (q != null && super.w != null && this.N == null && !q.v().isEmpty()) {
                final c n = new c(new e(super.p, super.q, (View)this.x, true));
                this.N = n;
                ((View)super.w).post((Runnable)n);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void b(final androidx.appcompat.view.menu.d d, final boolean b) {
        this.w();
        super.b(d, b);
    }
    
    @Override
    public void c(final Context context, final androidx.appcompat.view.menu.d d) {
        super.c(context, d);
        final Resources resources = context.getResources();
        final j.a a = j.a.a(context);
        if (!this.B) {
            this.A = a.d();
        }
        if (!this.H) {
            this.C = a.b();
        }
        if (!this.F) {
            this.E = a.c();
        }
        int c = this.C;
        if (this.A) {
            if (this.x == null) {
                final d x = new d(super.o);
                this.x = x;
                if (this.z) {
                    x.setImageDrawable(this.y);
                    this.y = null;
                    this.z = false;
                }
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                ((View)this.x).measure(measureSpec, measureSpec);
            }
            c -= ((View)this.x).getMeasuredWidth();
        }
        else {
            this.x = null;
        }
        this.D = c;
        this.J = (int)(resources.getDisplayMetrics().density * 56.0f);
    }
    
    @Override
    public void d(final androidx.appcompat.view.menu.e e, final h.a a) {
        a.d(e, 0);
        final ActionMenuView itemInvoker = (ActionMenuView)super.w;
        final ActionMenuItemView actionMenuItemView = (ActionMenuItemView)a;
        actionMenuItemView.setItemInvoker(itemInvoker);
        if (this.O == null) {
            this.O = new b();
        }
        actionMenuItemView.setPopupCallback((ActionMenuItemView.b)this.O);
    }
    
    @Override
    public boolean e(final j j) {
        final boolean hasVisibleItems = j.hasVisibleItems();
        final boolean b = false;
        if (!hasVisibleItems) {
            return false;
        }
        j i;
        for (i = j; i.W() != super.q; i = (j)i.W()) {}
        final View x = this.x(i.getItem());
        if (x == null) {
            return false;
        }
        this.Q = j.getItem().getItemId();
        final int size = j.size();
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= size) {
                break;
            }
            final MenuItem item = j.getItem(n);
            if (item.isVisible() && item.getIcon() != null) {
                b2 = true;
                break;
            }
            ++n;
        }
        (this.M = new a(super.p, j, x)).g(b2);
        this.M.k();
        super.e(j);
        return true;
    }
    
    @Override
    public void f(final boolean b) {
        super.f(b);
        ((View)super.w).requestLayout();
        final androidx.appcompat.view.menu.d q = super.q;
        if (q != null) {
            final ArrayList r = q.r();
            for (int size = r.size(), i = 0; i < size; ++i) {
                r.get(i).g();
            }
        }
        final androidx.appcompat.view.menu.d q2 = super.q;
        ArrayList<androidx.appcompat.view.menu.e> v;
        if (q2 != null) {
            v = (ArrayList<androidx.appcompat.view.menu.e>)q2.v();
        }
        else {
            v = null;
        }
        Label_0264: {
            Label_0221: {
                if (this.A && v != null) {
                    final int size2 = v.size();
                    if (size2 == 1) {
                        if (!(v.get(0).isActionViewExpanded() ^ true)) {
                            break Label_0221;
                        }
                    }
                    else if (size2 <= 0) {
                        break Label_0221;
                    }
                    if (this.x == null) {
                        this.x = new d(super.o);
                    }
                    final ViewGroup viewGroup = (ViewGroup)((View)this.x).getParent();
                    if (viewGroup != super.w) {
                        if (viewGroup != null) {
                            viewGroup.removeView((View)this.x);
                        }
                        final ActionMenuView actionMenuView = (ActionMenuView)super.w;
                        actionMenuView.addView((View)this.x, (ViewGroup$LayoutParams)actionMenuView.C());
                    }
                    break Label_0264;
                }
            }
            final d x = this.x;
            if (x != null) {
                final ViewParent parent = ((View)x).getParent();
                final h w = super.w;
                if (parent == w) {
                    ((ViewGroup)w).removeView((View)this.x);
                }
            }
        }
        ((ActionMenuView)super.w).setOverflowReserved(this.A);
    }
    
    @Override
    public boolean g() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    @Override
    public boolean l(final ViewGroup viewGroup, final int n) {
        return viewGroup.getChildAt(n) != this.x && super.l(viewGroup, n);
    }
    
    @Override
    public View n(final androidx.appcompat.view.menu.e e, final View view, final ViewGroup viewGroup) {
        View view2 = e.getActionView();
        if (view2 == null || e.i()) {
            view2 = super.n(e, view, viewGroup);
        }
        int visibility;
        if (e.isActionViewExpanded()) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        view2.setVisibility(visibility);
        final ActionMenuView actionMenuView = (ActionMenuView)viewGroup;
        final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            view2.setLayoutParams((ViewGroup$LayoutParams)actionMenuView.B(layoutParams));
        }
        return view2;
    }
    
    @Override
    public boolean o(final int n, final androidx.appcompat.view.menu.e e) {
        return e.k();
    }
    
    public boolean w() {
        return this.z() | this.A();
    }
    
    public final View x(final MenuItem menuItem) {
        final ViewGroup viewGroup = (ViewGroup)super.w;
        if (viewGroup == null) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = viewGroup.getChildAt(i);
            if (child instanceof h.a && ((h.a)child).getItemData() == menuItem) {
                return child;
            }
        }
        return null;
    }
    
    public Drawable y() {
        final d x = this.x;
        if (x != null) {
            return x.getDrawable();
        }
        if (this.z) {
            return this.y;
        }
        return null;
    }
    
    public boolean z() {
        final c n = this.N;
        if (n != null) {
            final h w = super.w;
            if (w != null) {
                ((View)w).removeCallbacks((Runnable)n);
                this.N = null;
                return true;
            }
        }
        final e l = this.L;
        if (l != null) {
            l.b();
            return true;
        }
        return false;
    }
    
    public class a extends androidx.appcompat.view.menu.f
    {
        public a(final Context context, final j j, final View view) {
            super(context, j, view, false, e.a.f);
            if (!((androidx.appcompat.view.menu.e)j.getItem()).k()) {
                Object x;
                if ((x = androidx.appcompat.widget.a.this.x) == null) {
                    x = androidx.appcompat.widget.a.r(androidx.appcompat.widget.a.this);
                }
                this.f((View)x);
            }
            this.j(androidx.appcompat.widget.a.this.P);
        }
        
        @Override
        public void e() {
            final androidx.appcompat.widget.a m = androidx.appcompat.widget.a.this;
            m.M = null;
            m.Q = 0;
            super.e();
        }
    }
    
    public class b extends ActionMenuItemView.b
    {
        @Override
        public c a() {
            final a m = androidx.appcompat.widget.a.this.M;
            if (m != null) {
                return m.c();
            }
            return null;
        }
    }
    
    public class c implements Runnable
    {
        public e o;
        
        public c(final e o) {
            this.o = o;
        }
        
        @Override
        public void run() {
            if (a.t(a.this) != null) {
                a.u(a.this).c();
            }
            final View view = (View)a.v(a.this);
            if (view != null && view.getWindowToken() != null && this.o.m()) {
                a.this.L = this.o;
            }
            a.this.N = null;
        }
    }
    
    public class d extends AppCompatImageView implements ActionMenuView.a
    {
        public d(final Context context) {
            super(context, null, e.a.e);
            ((View)this).setClickable(true);
            ((View)this).setFocusable(true);
            ((View)this).setVisibility(0);
            ((View)this).setEnabled(true);
            Z.a((View)this, ((View)this).getContentDescription());
            ((View)this).setOnTouchListener((View$OnTouchListener)new E(this) {
                @Override
                public c b() {
                    final e l = a.this.L;
                    if (l == null) {
                        return null;
                    }
                    return l.c();
                }
                
                @Override
                public boolean c() {
                    a.this.H();
                    return true;
                }
                
                @Override
                public boolean d() {
                    final a q = a.this;
                    if (q.N != null) {
                        return false;
                    }
                    q.z();
                    return true;
                }
            });
        }
        
        @Override
        public boolean b() {
            return false;
        }
        
        @Override
        public boolean c() {
            return false;
        }
        
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            ((View)this).playSoundEffect(0);
            a.this.H();
            return true;
        }
        
        public boolean setFrame(int n, int height, int paddingTop, int paddingBottom) {
            final boolean setFrame = super.setFrame(n, height, paddingTop, paddingBottom);
            final Drawable drawable = this.getDrawable();
            final Drawable background = ((View)this).getBackground();
            if (drawable != null && background != null) {
                final int width = ((View)this).getWidth();
                height = ((View)this).getHeight();
                n = Math.max(width, height) / 2;
                final int paddingLeft = ((View)this).getPaddingLeft();
                final int paddingRight = ((View)this).getPaddingRight();
                paddingTop = ((View)this).getPaddingTop();
                paddingBottom = ((View)this).getPaddingBottom();
                final int n2 = (width + (paddingLeft - paddingRight)) / 2;
                height = (height + (paddingTop - paddingBottom)) / 2;
                B.a.k(background, n2 - n, height - n, n2 + n, height + n);
            }
            return setFrame;
        }
    }
    
    public class e extends androidx.appcompat.view.menu.f
    {
        public e(final Context context, final androidx.appcompat.view.menu.d d, final View view, final boolean b) {
            super(context, d, view, b, e.a.f);
            this.h(8388613);
            this.j(a.this.P);
        }
        
        @Override
        public void e() {
            if (a.p(a.this) != null) {
                a.q(a.this).close();
            }
            a.this.L = null;
            super.e();
        }
    }
    
    public class f implements g.a
    {
        @Override
        public void b(final androidx.appcompat.view.menu.d d, final boolean b) {
            if (d instanceof j) {
                d.z().d(false);
            }
            final g.a m = androidx.appcompat.widget.a.this.m();
            if (m != null) {
                m.b(d, b);
            }
        }
        
        @Override
        public boolean c(final androidx.appcompat.view.menu.d d) {
            final androidx.appcompat.view.menu.d s = androidx.appcompat.widget.a.s(androidx.appcompat.widget.a.this);
            boolean c = false;
            if (d == s) {
                return false;
            }
            androidx.appcompat.widget.a.this.Q = ((j)d).getItem().getItemId();
            final g.a m = androidx.appcompat.widget.a.this.m();
            if (m != null) {
                c = m.c(d);
            }
            return c;
        }
    }
}
