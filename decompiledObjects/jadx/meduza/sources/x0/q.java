package x0;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import e0.d0;
import io.meduza.meduza.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16728a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16729b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f16730c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16731d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet, y yVar) {
        super(context, attributeSet);
        View view;
        ec.i.e(context, "context");
        ec.i.e(attributeSet, "attrs");
        ec.i.e(yVar, "fm");
        this.f16728a = new ArrayList();
        this.f16729b = new ArrayList();
        this.f16731d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eb.y.f5258e, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        i D = yVar.D(id);
        if (classAttribute != null && D == null) {
            if (id == -1) {
                throw new IllegalStateException(defpackage.g.e("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? defpackage.g.d(" with tag ", string) : ""));
            }
            s I = yVar.I();
            context.getClassLoader();
            i instantiate = i.instantiate(y.this.f16787w.f16757b, classAttribute, null);
            ec.i.d(instantiate, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            instantiate.mFragmentId = id;
            instantiate.mContainerId = id;
            instantiate.mTag = string;
            instantiate.mFragmentManager = yVar;
            instantiate.mHost = yVar.f16787w;
            instantiate.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(yVar);
            aVar.f16629o = true;
            instantiate.mContainer = this;
            aVar.e(getId(), instantiate, string);
            if (aVar.f16621g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            y yVar2 = aVar.f16515p;
            if (yVar2.f16787w != null && !yVar2.J) {
                yVar2.z(true);
                aVar.a(yVar2.L, yVar2.M);
                yVar2.f16768b = true;
                try {
                    yVar2.U(yVar2.L, yVar2.M);
                    yVar2.e();
                    yVar2.f0();
                    if (yVar2.K) {
                        yVar2.K = false;
                        yVar2.d0();
                    }
                    yVar2.f16769c.b();
                } catch (Throwable th) {
                    yVar2.e();
                    throw th;
                }
            }
        }
        Iterator it = yVar.f16769c.e().iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            i iVar = e0Var.f16601c;
            if (iVar.mContainerId == getId() && (view = iVar.mView) != null && view.getParent() == null) {
                iVar.mContainer = this;
                e0Var.b();
            }
        }
    }

    public final void a(View view) {
        if (this.f16729b.contains(view)) {
            this.f16728a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        ec.i.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof i ? (i) tag : null) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        e0.s0 s0Var;
        ec.i.e(windowInsets, "insets");
        e0.s0 c10 = e0.s0.c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f16730c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            ec.i.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            s0Var = e0.s0.c(onApplyWindowInsets, null);
        } else {
            WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
            WindowInsets b10 = c10.b();
            if (b10 != null) {
                WindowInsets b11 = d0.c.b(this, b10);
                if (!b11.equals(b10)) {
                    c10 = e0.s0.c(b11, this);
                }
            }
            s0Var = c10;
        }
        if (!s0Var.f3823a.i()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                WeakHashMap<View, e0.o0> weakHashMap2 = e0.d0.f3766a;
                WindowInsets b12 = s0Var.b();
                if (b12 != null) {
                    WindowInsets a10 = d0.c.a(childAt, b12);
                    if (!a10.equals(b12)) {
                        e0.s0.c(a10, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ec.i.e(canvas, "canvas");
        if (this.f16731d) {
            Iterator it = this.f16728a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ec.i.e(canvas, "canvas");
        ec.i.e(view, "child");
        if (this.f16731d && (!this.f16728a.isEmpty()) && this.f16728a.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ec.i.e(view, "view");
        this.f16729b.remove(view);
        if (this.f16728a.remove(view)) {
            this.f16731d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends i> F getFragment() {
        i iVar;
        y supportFragmentManager;
        m mVar = null;
        View view = this;
        while (true) {
            if (view == null) {
                iVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            iVar = tag instanceof i ? (i) tag : null;
            if (iVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (iVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof m) {
                    mVar = (m) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (mVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = mVar.getSupportFragmentManager();
        } else {
            if (!iVar.isAdded()) {
                throw new IllegalStateException("The Fragment " + iVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = iVar.getChildFragmentManager();
        }
        return (F) supportFragmentManager.D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        ec.i.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                ec.i.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        ec.i.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        ec.i.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        ec.i.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            ec.i.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            ec.i.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f16731d = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        ec.i.e(onApplyWindowInsetsListener, "listener");
        this.f16730c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        ec.i.e(view, "view");
        if (view.getParent() == this) {
            this.f16729b.add(view);
        }
        super.startViewTransition(view);
    }
}
