// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.widget.Adapter;
import android.widget.AdapterView;
import h.c;
import android.os.Build$VERSION;
import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.widget.ListAdapter;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.view.View;
import android.widget.AbsListView;
import android.util.AttributeSet;
import e.a;
import android.content.Context;
import L.e;
import java.lang.reflect.Field;
import android.graphics.Rect;
import android.widget.ListView;

public abstract class C extends ListView
{
    public b A;
    public final Rect o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public Field u;
    public a v;
    public boolean w;
    public boolean x;
    public boolean y;
    public e z;
    
    public C(final Context context, final boolean x) {
        super(context, (AttributeSet)null, e.a.n);
        this.o = new Rect();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = x;
        ((AbsListView)this).setCacheColorHint(0);
        try {
            (this.u = AbsListView.class.getDeclaredField("mIsChildViewEnabled")).setAccessible(true);
        }
        catch (NoSuchFieldException ex) {
            ex.printStackTrace();
        }
    }
    
    public final void a() {
        ((View)this).setPressed(this.y = false);
        this.drawableStateChanged();
        final View child = ((ViewGroup)this).getChildAt(this.t - ((AdapterView)this).getFirstVisiblePosition());
        if (child != null) {
            child.setPressed(false);
        }
    }
    
    public final void b(final View view, final int n) {
        ((AdapterView)this).performItemClick(view, n, ((AdapterView)this).getItemIdAtPosition(n));
    }
    
    public final void c(final Canvas canvas) {
        if (!this.o.isEmpty()) {
            final Drawable selector = ((AbsListView)this).getSelector();
            if (selector != null) {
                selector.setBounds(this.o);
                selector.draw(canvas);
            }
        }
    }
    
    public int d(int n, int listPaddingTop, int listPaddingBottom, final int n2, final int n3) {
        listPaddingTop = ((AbsListView)this).getListPaddingTop();
        listPaddingBottom = ((AbsListView)this).getListPaddingBottom();
        int dividerHeight = this.getDividerHeight();
        final Drawable divider = this.getDivider();
        final ListAdapter adapter = this.getAdapter();
        listPaddingBottom += listPaddingTop;
        if (adapter == null) {
            return listPaddingBottom;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        final int count = ((Adapter)adapter).getCount();
        final int n4 = 0;
        final int n5 = listPaddingTop = n4;
        View view = null;
        int n6 = n5;
        int n7;
        View view2;
        int n10;
        for (int i = n4; i < count; ++i, n6 = n7, view = view2, listPaddingTop = n10) {
            final int itemViewType = ((Adapter)adapter).getItemViewType(i);
            if (itemViewType != (n7 = n6)) {
                view = null;
                n7 = itemViewType;
            }
            view2 = ((Adapter)adapter).getView(i, view, (ViewGroup)this);
            ViewGroup$LayoutParams layoutParams;
            if ((layoutParams = view2.getLayoutParams()) == null) {
                layoutParams = ((ViewGroup)this).generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            final int height = layoutParams.height;
            int n8;
            if (height > 0) {
                n8 = View$MeasureSpec.makeMeasureSpec(height, 1073741824);
            }
            else {
                n8 = View$MeasureSpec.makeMeasureSpec(0, 0);
            }
            view2.measure(n, n8);
            view2.forceLayout();
            int n9 = listPaddingBottom;
            if (i > 0) {
                n9 = listPaddingBottom + dividerHeight;
            }
            listPaddingBottom = n9 + view2.getMeasuredHeight();
            if (listPaddingBottom >= n2) {
                n = n2;
                if (n3 >= 0) {
                    n = n2;
                    if (i > n3) {
                        n = n2;
                        if (listPaddingTop > 0 && listPaddingBottom != (n = n2)) {
                            n = listPaddingTop;
                        }
                    }
                }
                return n;
            }
            n10 = listPaddingTop;
            if (n3 >= 0) {
                n10 = listPaddingTop;
                if (i >= n3) {
                    n10 = listPaddingBottom;
                }
            }
        }
        return listPaddingBottom;
    }
    
    public void dispatchDraw(final Canvas canvas) {
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
    
    public boolean e(final MotionEvent motionEvent, int n) {
        final int actionMasked = motionEvent.getActionMasked();
        boolean b = false;
        boolean b2 = false;
    Label_0143:
        while (true) {
            int pointerIndex;
            while (true) {
                Label_0048: {
                    if (actionMasked == 1) {
                        b = false;
                        break Label_0048;
                    }
                    if (actionMasked == 2) {
                        b = true;
                        break Label_0048;
                    }
                    if (actionMasked == 3) {
                        break Label_0029;
                    }
                    b = true;
                    b2 = false;
                    break Label_0143;
                    b2 = (b = false);
                    break Label_0143;
                }
                pointerIndex = motionEvent.findPointerIndex(n);
                if (pointerIndex < 0) {
                    continue;
                }
                break;
            }
            n = (int)motionEvent.getX(pointerIndex);
            final int n2 = (int)motionEvent.getY(pointerIndex);
            final int pointToPosition = ((AbsListView)this).pointToPosition(n, n2);
            if (pointToPosition == -1) {
                b2 = true;
            }
            else {
                final View child = ((ViewGroup)this).getChildAt(pointToPosition - ((AdapterView)this).getFirstVisiblePosition());
                this.i(child, pointToPosition, (float)n, (float)n2);
                if (actionMasked == 1) {
                    this.b(child, pointToPosition);
                }
                continue;
            }
            break;
        }
        if (!b || b2) {
            this.a();
        }
        if (b) {
            if (this.z == null) {
                this.z = new e(this);
            }
            this.z.m(true);
            this.z.onTouch((View)this, motionEvent);
            return b;
        }
        final e z = this.z;
        if (z != null) {
            z.m(false);
        }
        return b;
    }
    
    public final void f(final int n, final View view) {
        final Rect o = this.o;
        o.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        o.left -= this.p;
        o.top -= this.q;
        o.right += this.r;
        o.bottom += this.s;
        try {
            final boolean boolean1 = this.u.getBoolean(this);
            if (view.isEnabled() != boolean1) {
                this.u.set(this, boolean1 ^ true);
                if (n != -1) {
                    ((View)this).refreshDrawableState();
                }
            }
        }
        catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }
    
    public final void g(final int n, final View view) {
        final Drawable selector = ((AbsListView)this).getSelector();
        boolean b = true;
        final boolean b2 = selector != null && n != -1;
        if (b2) {
            selector.setVisible(false, false);
        }
        this.f(n, view);
        if (b2) {
            final Rect o = this.o;
            final float exactCenterX = o.exactCenterX();
            final float exactCenterY = o.exactCenterY();
            if (((View)this).getVisibility() != 0) {
                b = false;
            }
            selector.setVisible(b, false);
            B.a.j(selector, exactCenterX, exactCenterY);
        }
    }
    
    public final void h(final int n, final View view, final float n2, final float n3) {
        this.g(n, view);
        final Drawable selector = ((AbsListView)this).getSelector();
        if (selector != null && n != -1) {
            B.a.j(selector, n2, n3);
        }
    }
    
    public boolean hasFocus() {
        return this.x || super.hasFocus();
    }
    
    public boolean hasWindowFocus() {
        return this.x || super.hasWindowFocus();
    }
    
    public final void i(final View view, final int t, final float n, final float n2) {
        this.y = true;
        ((View)this).drawableHotspotChanged(n, n2);
        if (!((View)this).isPressed()) {
            ((View)this).setPressed(true);
        }
        ((AbsListView)this).layoutChildren();
        final int t2 = this.t;
        if (t2 != -1) {
            final View child = ((ViewGroup)this).getChildAt(t2 - ((AdapterView)this).getFirstVisiblePosition());
            if (child != null && child != view && child.isPressed()) {
                child.setPressed(false);
            }
        }
        this.t = t;
        view.drawableHotspotChanged(n - view.getLeft(), n2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        this.h(t, view, n, n2);
        this.j(false);
        ((View)this).refreshDrawableState();
    }
    
    public boolean isFocused() {
        return this.x || super.isFocused();
    }
    
    public boolean isInTouchMode() {
        return (this.x && this.w) || super.isInTouchMode();
    }
    
    public final void j(final boolean b) {
        final a v = this.v;
        if (v != null) {
            v.c(b);
        }
    }
    
    public final boolean k() {
        return this.y;
    }
    
    public final void l() {
        final Drawable selector = ((AbsListView)this).getSelector();
        if (selector != null && this.k() && ((View)this).isPressed()) {
            selector.setState(((View)this).getDrawableState());
        }
    }
    
    public void onDetachedFromWindow() {
        this.A = null;
        super.onDetachedFromWindow();
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        if (Build$VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.A == null) {
            (this.A = new b()).b();
        }
        final boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            ((AdapterView)this).setSelection(-1);
            return onHoverEvent;
        }
        final int pointToPosition = ((AbsListView)this).pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != ((AdapterView)this).getSelectedItemPosition()) {
            final View child = ((ViewGroup)this).getChildAt(pointToPosition - ((AdapterView)this).getFirstVisiblePosition());
            if (child.isEnabled()) {
                ((AbsListView)this).setSelectionFromTop(pointToPosition, child.getTop() - ((View)this).getTop());
            }
            this.l();
        }
        return onHoverEvent;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.t = ((AbsListView)this).pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
        }
        final b a = this.A;
        if (a != null) {
            a.a();
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setListSelectionHidden(final boolean w) {
        this.w = w;
    }
    
    public void setSelector(final Drawable drawable) {
        a v;
        if (drawable != null) {
            v = new a(drawable);
        }
        else {
            v = null;
        }
        super.setSelector((Drawable)(this.v = v));
        final Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.p = rect.left;
        this.q = rect.top;
        this.r = rect.right;
        this.s = rect.bottom;
    }
    
    public static class a extends c
    {
        public boolean p;
        
        public a(final Drawable drawable) {
            super(drawable);
            this.p = true;
        }
        
        public void c(final boolean p) {
            this.p = p;
        }
        
        @Override
        public void draw(final Canvas canvas) {
            if (this.p) {
                super.draw(canvas);
            }
        }
        
        @Override
        public void setHotspot(final float n, final float n2) {
            if (this.p) {
                super.setHotspot(n, n2);
            }
        }
        
        @Override
        public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
            if (this.p) {
                super.setHotspotBounds(n, n2, n3, n4);
            }
        }
        
        @Override
        public boolean setState(final int[] state) {
            return this.p && super.setState(state);
        }
        
        @Override
        public boolean setVisible(final boolean b, final boolean b2) {
            return this.p && super.setVisible(b, b2);
        }
    }
    
    public class b implements Runnable
    {
        public void a() {
            final C o = C.this;
            o.A = null;
            ((View)o).removeCallbacks((Runnable)this);
        }
        
        public void b() {
            ((View)C.this).post((Runnable)this);
        }
        
        @Override
        public void run() {
            final C o = C.this;
            o.A = null;
            o.drawableStateChanged();
        }
    }
}
