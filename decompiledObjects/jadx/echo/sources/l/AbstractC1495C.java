package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import e.AbstractC1230a;
import h.AbstractC1324c;
import java.lang.reflect.Field;

/* renamed from: l.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1495C extends ListView {

    /* renamed from: A, reason: collision with root package name */
    public b f16272A;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f16273o;

    /* renamed from: p, reason: collision with root package name */
    public int f16274p;

    /* renamed from: q, reason: collision with root package name */
    public int f16275q;

    /* renamed from: r, reason: collision with root package name */
    public int f16276r;

    /* renamed from: s, reason: collision with root package name */
    public int f16277s;

    /* renamed from: t, reason: collision with root package name */
    public int f16278t;

    /* renamed from: u, reason: collision with root package name */
    public Field f16279u;

    /* renamed from: v, reason: collision with root package name */
    public a f16280v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16281w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16282x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16283y;

    /* renamed from: z, reason: collision with root package name */
    public L.e f16284z;

    /* renamed from: l.C$a */
    public static class a extends AbstractC1324c {

        /* renamed from: p, reason: collision with root package name */
        public boolean f16285p;

        public a(Drawable drawable) {
            super(drawable);
            this.f16285p = true;
        }

        public void c(boolean z7) {
            this.f16285p = z7;
        }

        @Override // h.AbstractC1324c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f16285p) {
                super.draw(canvas);
            }
        }

        @Override // h.AbstractC1324c, android.graphics.drawable.Drawable
        public void setHotspot(float f7, float f8) {
            if (this.f16285p) {
                super.setHotspot(f7, f8);
            }
        }

        @Override // h.AbstractC1324c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i7, int i8, int i9, int i10) {
            if (this.f16285p) {
                super.setHotspotBounds(i7, i8, i9, i10);
            }
        }

        @Override // h.AbstractC1324c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f16285p) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // h.AbstractC1324c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z7, boolean z8) {
            if (this.f16285p) {
                return super.setVisible(z7, z8);
            }
            return false;
        }
    }

    /* renamed from: l.C$b */
    public class b implements Runnable {
        public b() {
        }

        public void a() {
            AbstractC1495C abstractC1495C = AbstractC1495C.this;
            abstractC1495C.f16272A = null;
            abstractC1495C.removeCallbacks(this);
        }

        public void b() {
            AbstractC1495C.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1495C abstractC1495C = AbstractC1495C.this;
            abstractC1495C.f16272A = null;
            abstractC1495C.drawableStateChanged();
        }
    }

    public AbstractC1495C(Context context, boolean z7) {
        super(context, null, AbstractC1230a.f13343n);
        this.f16273o = new Rect();
        this.f16274p = 0;
        this.f16275q = 0;
        this.f16276r = 0;
        this.f16277s = 0;
        this.f16282x = z7;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f16279u = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
        }
    }

    public final void a() {
        this.f16283y = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f16278t - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
    }

    public final void b(View view, int i7) {
        performItemClick(view, i7, getItemIdAtPosition(i7));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (this.f16273o.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f16273o);
        selector.draw(canvas);
    }

    public int d(int i7, int i8, int i9, int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i12 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i12;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        View view = null;
        while (i13 < count) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i14) {
                view = null;
                i14 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i16 = layoutParams.height;
            view.measure(i7, i16 > 0 ? View.MeasureSpec.makeMeasureSpec(i16, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i10) {
                return (i11 < 0 || i13 <= i11 || i15 <= 0 || i12 == i10) ? i10 : i15;
            }
            if (i11 >= 0 && i13 >= i11) {
                i15 = i12;
            }
            i13++;
        }
        return i12;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f16272A != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            L.e r9 = r7.f16284z
            if (r9 != 0) goto L5a
            L.e r9 = new L.e
            r9.<init>(r7)
            r7.f16284z = r9
        L5a:
            L.e r9 = r7.f16284z
            r9.m(r1)
            L.e r9 = r7.f16284z
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            L.e r8 = r7.f16284z
            if (r8 == 0) goto L6c
            r8.m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC1495C.e(android.view.MotionEvent, int):boolean");
    }

    public final void f(int i7, View view) {
        Rect rect = this.f16273o;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f16274p;
        rect.top -= this.f16275q;
        rect.right += this.f16276r;
        rect.bottom += this.f16277s;
        try {
            boolean z7 = this.f16279u.getBoolean(this);
            if (view.isEnabled() != z7) {
                this.f16279u.set(this, Boolean.valueOf(!z7));
                if (i7 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e7) {
            e7.printStackTrace();
        }
    }

    public final void g(int i7, View view) {
        Drawable selector = getSelector();
        boolean z7 = (selector == null || i7 == -1) ? false : true;
        if (z7) {
            selector.setVisible(false, false);
        }
        f(i7, view);
        if (z7) {
            Rect rect = this.f16273o;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            B.a.j(selector, exactCenterX, exactCenterY);
        }
    }

    public final void h(int i7, View view, float f7, float f8) {
        g(i7, view);
        Drawable selector = getSelector();
        if (selector == null || i7 == -1) {
            return;
        }
        B.a.j(selector, f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f16282x || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f16282x || super.hasWindowFocus();
    }

    public final void i(View view, int i7, float f7, float f8) {
        View childAt;
        this.f16283y = true;
        drawableHotspotChanged(f7, f8);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i8 = this.f16278t;
        if (i8 != -1 && (childAt = getChildAt(i8 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f16278t = i7;
        view.drawableHotspotChanged(f7 - view.getLeft(), f8 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i7, view, f7, f8);
        j(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f16282x || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f16282x && this.f16281w) || super.isInTouchMode();
    }

    public final void j(boolean z7) {
        a aVar = this.f16280v;
        if (aVar != null) {
            aVar.c(z7);
        }
    }

    public final boolean k() {
        return this.f16283y;
    }

    public final void l() {
        Drawable selector = getSelector();
        if (selector != null && k() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f16272A = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f16272A == null) {
            b bVar = new b();
            this.f16272A = bVar;
            bVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                l();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f16278t = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f16272A;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z7) {
        this.f16281w = z7;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f16280v = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f16274p = rect.left;
        this.f16275q = rect.top;
        this.f16276r = rect.right;
        this.f16277s = rect.bottom;
    }
}
