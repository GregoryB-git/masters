/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AbsListView
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.reflect.Field
 */
package l;

import L.e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import h.c;
import java.lang.reflect.Field;

public abstract class C
extends ListView {
    public b A;
    public final Rect o = new Rect();
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t;
    public Field u;
    public a v;
    public boolean w;
    public boolean x;
    public boolean y;
    public e z;

    public C(Context context, boolean bl) {
        super(context, null, e.a.n);
        this.x = bl;
        this.setCacheColorHint(0);
        try {
            context = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.u = context;
            context.setAccessible(true);
            return;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            noSuchFieldException.printStackTrace();
            return;
        }
    }

    public final void a() {
        this.y = false;
        this.setPressed(false);
        this.drawableStateChanged();
        View view = this.getChildAt(this.t - this.getFirstVisiblePosition());
        if (view != null) {
            view.setPressed(false);
        }
    }

    public final void b(View view, int n8) {
        this.performItemClick(view, n8, this.getItemIdAtPosition(n8));
    }

    public final void c(Canvas canvas) {
        Drawable drawable2;
        if (!this.o.isEmpty() && (drawable2 = this.getSelector()) != null) {
            drawable2.setBounds(this.o);
            drawable2.draw(canvas);
        }
    }

    public int d(int n8, int n9, int n10, int n11, int n12) {
        int n13;
        int n14;
        n9 = this.getListPaddingTop();
        n10 = this.getListPaddingBottom();
        int n15 = this.getDividerHeight();
        Drawable drawable2 = this.getDivider();
        ListAdapter listAdapter = this.getAdapter();
        n10 = n9 + n10;
        if (listAdapter == null) {
            return n10;
        }
        if (n15 <= 0 || drawable2 == null) {
            n15 = 0;
        }
        int n16 = listAdapter.getCount();
        n9 = n13 = (n14 = 0);
        drawable2 = null;
        int n17 = n13;
        for (n13 = n14; n13 < n16; ++n13) {
            int n18 = listAdapter.getItemViewType(n13);
            n14 = n17;
            if (n18 != n17) {
                drawable2 = null;
                n14 = n18;
            }
            View view = listAdapter.getView(n13, (View)drawable2, (ViewGroup)this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            drawable2 = layoutParams;
            if (layoutParams == null) {
                drawable2 = this.generateDefaultLayoutParams();
                view.setLayoutParams((ViewGroup.LayoutParams)drawable2);
            }
            n17 = (n17 = drawable2.height) > 0 ? View.MeasureSpec.makeMeasureSpec((int)n17, (int)1073741824) : View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
            view.measure(n8, n17);
            view.forceLayout();
            n17 = n10;
            if (n13 > 0) {
                n17 = n10 + n15;
            }
            if ((n10 = n17 + view.getMeasuredHeight()) >= n11) {
                n8 = n11;
                if (n12 >= 0) {
                    n8 = n11;
                    if (n13 > n12) {
                        n8 = n11;
                        if (n9 > 0) {
                            n8 = n11;
                            if (n10 != n11) {
                                n8 = n9;
                            }
                        }
                    }
                }
                return n8;
            }
            n18 = n9;
            if (n12 >= 0) {
                n18 = n9;
                if (n13 >= n12) {
                    n18 = n10;
                }
            }
            n17 = n14;
            drawable2 = view;
            n9 = n18;
        }
        return n10;
    }

    public void dispatchDraw(Canvas canvas) {
        this.c(canvas);
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.A != null) {
            return;
        }
        super.drawableStateChanged();
        this.j(true);
        this.l();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean e(MotionEvent var1_1, int var2_2) {
        block10 : {
            block8 : {
                block9 : {
                    var3_3 = var1_1.getActionMasked();
                    if (var3_3 == 1) break block8;
                    if (var3_3 == 2) break block9;
                    if (var3_3 == 3) ** GOTO lbl-1000
                    ** GOTO lbl25
                }
                var6_4 = true;
                break block10;
            }
            var6_4 = false;
        }
        var4_6 = var1_1.findPointerIndex(var2_2);
        if (var4_6 < 0) lbl-1000: // 2 sources:
        {
            var6_4 = var7_5 = false;
        } else {
            var2_2 = (int)var1_1.getX(var4_6);
            var5_7 = this.pointToPosition(var2_2, var4_6 = (int)var1_1.getY(var4_6));
            if (var5_7 == -1) {
                var7_5 = true;
            } else {
                var8_8 = this.getChildAt(var5_7 - this.getFirstVisiblePosition());
                this.i(var8_8, var5_7, var2_2, var4_6);
                if (var3_3 == 1) {
                    this.b(var8_8, var5_7);
                }
lbl25: // 4 sources:
                var6_4 = true;
                var7_5 = false;
            }
        }
        if (!var6_4 || var7_5) {
            this.a();
        }
        if (!var6_4) {
            var1_1 = this.z;
            if (var1_1 == null) return var6_4;
            var1_1.m(false);
            return var6_4;
        }
        if (this.z == null) {
            this.z = new e(this);
        }
        this.z.m(true);
        this.z.onTouch((View)this, (MotionEvent)var1_1);
        return var6_4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void f(int n8, View view) {
        Rect rect = this.o;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.p;
        rect.top -= this.q;
        rect.right += this.r;
        rect.bottom += this.s;
        boolean bl = this.u.getBoolean((Object)this);
        if (view.isEnabled() == bl) return;
        this.u.set((Object)this, (Object)(bl ^ true));
        if (n8 == -1) return;
        try {
            this.refreshDrawableState();
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        }
    }

    public final void g(int n8, View view) {
        Drawable drawable2 = this.getSelector();
        boolean bl = true;
        boolean bl2 = drawable2 != null && n8 != -1;
        if (bl2) {
            drawable2.setVisible(false, false);
        }
        this.f(n8, view);
        if (bl2) {
            view = this.o;
            float f8 = view.exactCenterX();
            float f9 = view.exactCenterY();
            if (this.getVisibility() != 0) {
                bl = false;
            }
            drawable2.setVisible(bl, false);
            B.a.j(drawable2, f8, f9);
        }
    }

    public final void h(int n8, View view, float f8, float f9) {
        this.g(n8, view);
        view = this.getSelector();
        if (view != null && n8 != -1) {
            B.a.j((Drawable)view, f8, f9);
        }
    }

    public boolean hasFocus() {
        if (!this.x && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    public boolean hasWindowFocus() {
        if (!this.x && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    public final void i(View view, int n8, float f8, float f9) {
        View view2;
        this.y = true;
        this.drawableHotspotChanged(f8, f9);
        if (!this.isPressed()) {
            this.setPressed(true);
        }
        this.layoutChildren();
        int n9 = this.t;
        if (n9 != -1 && (view2 = this.getChildAt(n9 - this.getFirstVisiblePosition())) != null && view2 != view && view2.isPressed()) {
            view2.setPressed(false);
        }
        this.t = n8;
        view.drawableHotspotChanged(f8 - (float)view.getLeft(), f9 - (float)view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        this.h(n8, view, f8, f9);
        this.j(false);
        this.refreshDrawableState();
    }

    public boolean isFocused() {
        if (!this.x && !super.isFocused()) {
            return false;
        }
        return true;
    }

    public boolean isInTouchMode() {
        if (this.x && this.w || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    public final void j(boolean bl) {
        a a8 = this.v;
        if (a8 != null) {
            a8.c(bl);
        }
    }

    public final boolean k() {
        return this.y;
    }

    public final void l() {
        Drawable drawable2 = this.getSelector();
        if (drawable2 != null && this.k() && this.isPressed()) {
            drawable2.setState(this.getDrawableState());
        }
    }

    public void onDetachedFromWindow() {
        this.A = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int n8 = motionEvent.getActionMasked();
        if (n8 == 10 && this.A == null) {
            b b8;
            this.A = b8 = new b();
            b8.b();
        }
        boolean bl = super.onHoverEvent(motionEvent);
        if (n8 != 9 && n8 != 7) {
            this.setSelection(-1);
            return bl;
        }
        n8 = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
        if (n8 != -1 && n8 != this.getSelectedItemPosition()) {
            motionEvent = this.getChildAt(n8 - this.getFirstVisiblePosition());
            if (motionEvent.isEnabled()) {
                this.setSelectionFromTop(n8, motionEvent.getTop() - this.getTop());
            }
            this.l();
        }
        return bl;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.t = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
        }
        b b8 = this.A;
        if (b8 != null) {
            b8.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean bl) {
        this.w = bl;
    }

    public void setSelector(Drawable drawable2) {
        a a8 = drawable2 != null ? new a(drawable2) : null;
        this.v = a8;
        super.setSelector((Drawable)a8);
        a8 = new Rect();
        if (drawable2 != null) {
            drawable2.getPadding((Rect)a8);
        }
        this.p = a8.left;
        this.q = a8.top;
        this.r = a8.right;
        this.s = a8.bottom;
    }

    public static class a
    extends c {
        public boolean p = true;

        public a(Drawable drawable2) {
            super(drawable2);
        }

        public void c(boolean bl) {
            this.p = bl;
        }

        @Override
        public void draw(Canvas canvas) {
            if (this.p) {
                super.draw(canvas);
            }
        }

        @Override
        public void setHotspot(float f8, float f9) {
            if (this.p) {
                super.setHotspot(f8, f9);
            }
        }

        @Override
        public void setHotspotBounds(int n8, int n9, int n10, int n11) {
            if (this.p) {
                super.setHotspotBounds(n8, n9, n10, n11);
            }
        }

        @Override
        public boolean setState(int[] arrn) {
            if (this.p) {
                return super.setState(arrn);
            }
            return false;
        }

        @Override
        public boolean setVisible(boolean bl, boolean bl2) {
            if (this.p) {
                return super.setVisible(bl, bl2);
            }
            return false;
        }
    }

    public class b
    implements Runnable {
        public void a() {
            C c8 = C.this;
            c8.A = null;
            c8.removeCallbacks((Runnable)this);
        }

        public void b() {
            C.this.post((Runnable)this);
        }

        public void run() {
            C c8 = C.this;
            c8.A = null;
            c8.drawableStateChanged();
        }
    }

}

