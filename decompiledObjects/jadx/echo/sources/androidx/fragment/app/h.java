package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f9430o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f9431p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9432q;

    public h(Context context, AttributeSet attributeSet, n nVar) {
        super(context, attributeSet);
        String str;
        this.f9432q = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, U.c.f6298h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(U.c.f6299i) : classAttribute;
        String string = obtainStyledAttributes.getString(U.c.f6300j);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment g02 = nVar.g0(id);
        if (classAttribute == null || g02 != null) {
            return;
        }
        if (id > 0) {
            Fragment a7 = nVar.p0().a(context.getClassLoader(), classAttribute);
            a7.y0(context, attributeSet, null);
            nVar.m().l(true).c(this, a7, string).h();
            return;
        }
        if (string != null) {
            str = " with tag " + string;
        } else {
            str = "";
        }
        throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
    }

    public final void a(View view) {
        ArrayList arrayList = this.f9431p;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f9430o == null) {
            this.f9430o = new ArrayList();
        }
        this.f9430o.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (n.y0(view) != null) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z7) {
        if (n.y0(view) != null) {
            return super.addViewInLayout(view, i7, layoutParams, z7);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f9432q && this.f9430o != null) {
            for (int i7 = 0; i7 < this.f9430o.size(); i7++) {
                super.drawChild(canvas, (View) this.f9430o.get(i7), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j7) {
        ArrayList arrayList;
        if (!this.f9432q || (arrayList = this.f9430o) == null || arrayList.size() <= 0 || !this.f9430o.contains(view)) {
            return super.drawChild(canvas, view, j7);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList arrayList = this.f9431p;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f9430o;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f9432q = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            getChildAt(i7).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z7) {
        if (z7) {
            a(view);
        }
        super.removeDetachedView(view, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i7) {
        a(getChildAt(i7));
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i7, int i8) {
        for (int i9 = i7; i9 < i7 + i8; i9++) {
            a(getChildAt(i9));
        }
        super.removeViews(i7, i8);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i7, int i8) {
        for (int i9 = i7; i9 < i7 + i8; i9++) {
            a(getChildAt(i9));
        }
        super.removeViewsInLayout(i7, i8);
    }

    public void setDrawDisappearingViewsLast(boolean z7) {
        this.f9432q = z7;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f9431p == null) {
                this.f9431p = new ArrayList();
            }
            this.f9431p.add(view);
        }
        super.startViewTransition(view);
    }
}
