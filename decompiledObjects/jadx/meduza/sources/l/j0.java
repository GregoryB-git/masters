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
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import io.meduza.meduza.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class j0 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f9366a;

    /* renamed from: b, reason: collision with root package name */
    public int f9367b;

    /* renamed from: c, reason: collision with root package name */
    public int f9368c;

    /* renamed from: d, reason: collision with root package name */
    public int f9369d;

    /* renamed from: e, reason: collision with root package name */
    public int f9370e;
    public int f;

    /* renamed from: o, reason: collision with root package name */
    public d f9371o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9372p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9373q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9374r;

    /* renamed from: s, reason: collision with root package name */
    public j0.f f9375s;
    public f t;

    public static class a {
        public static void a(View view, float f, float f10) {
            view.drawableHotspotChanged(f, f10);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static Method f9376a;

        /* renamed from: b, reason: collision with root package name */
        public static Method f9377b;

        /* renamed from: c, reason: collision with root package name */
        public static Method f9378c;

        /* renamed from: d, reason: collision with root package name */
        public static boolean f9379d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f9376a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f9377b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f9378c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f9379d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    public static class d extends h.c {

        /* renamed from: b, reason: collision with root package name */
        public boolean f9380b;

        public d(Drawable drawable) {
            super(drawable);
            this.f9380b = true;
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f9380b) {
                super.draw(canvas);
            }
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f10) {
            if (this.f9380b) {
                super.setHotspot(f, f10);
            }
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f9380b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f9380b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z10, boolean z11) {
            if (this.f9380b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final Field f9381a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f9381a = field;
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            j0 j0Var = j0.this;
            j0Var.t = null;
            j0Var.drawableStateChanged();
        }
    }

    public j0(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f9366a = new Rect();
        this.f9367b = 0;
        this.f9368c = 0;
        this.f9369d = 0;
        this.f9370e = 0;
        this.f9373q = z10;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f9371o;
        if (dVar != null) {
            dVar.f9380b = z10;
        }
    }

    public final int a(int i10, int i11) {
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
        View view = null;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i10, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i14 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i11) {
                return i11;
            }
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0149 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.j0.b(int, android.view.MotionEvent):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f9366a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f9366a);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.t != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f9374r && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f9373q || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f9373q || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f9373q || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f9373q && this.f9372p) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.t = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.t == null) {
            f fVar = new f();
            this.t = fVar;
            post(fVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.f9379d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            b.f9376a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            b.f9377b.invoke(this, Integer.valueOf(pointToPosition));
                            b.f9378c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException | InvocationTargetException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f9374r && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.t;
        if (fVar != null) {
            j0 j0Var = j0.this;
            j0Var.t = null;
            j0Var.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f9372p = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f9371o = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f9367b = rect.left;
        this.f9368c = rect.top;
        this.f9369d = rect.right;
        this.f9370e = rect.bottom;
    }
}
