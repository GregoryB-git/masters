package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import io.meduza.meduza.R;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0140a f9250a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9251b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f9252c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.a f9253d;

    /* renamed from: e, reason: collision with root package name */
    public int f9254e;
    public e0.o0 f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9255o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9256p;

    /* renamed from: l.a$a, reason: collision with other inner class name */
    public class C0140a implements e0.p0 {

        /* renamed from: a, reason: collision with root package name */
        public boolean f9257a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f9258b;

        public C0140a() {
        }

        @Override // e0.p0
        public final void a() {
            this.f9257a = true;
        }

        @Override // e0.p0
        public final void b() {
            a.super.setVisibility(0);
            this.f9257a = false;
        }

        @Override // e0.p0
        public final void c() {
            if (this.f9257a) {
                return;
            }
            a aVar = a.this;
            aVar.f = null;
            a.super.setVisibility(this.f9258b);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9250a = new C0140a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f9251b = context;
        } else {
            this.f9251b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - 0);
    }

    public static int d(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final e0.o0 e(int i10, long j10) {
        e0.o0 o0Var = this.f;
        if (o0Var != null) {
            o0Var.b();
        }
        if (i10 != 0) {
            e0.o0 a10 = e0.d0.a(this);
            a10.a(0.0f);
            a10.c(j10);
            C0140a c0140a = this.f9250a;
            a.this.f = a10;
            c0140a.f9258b = i10;
            a10.d(c0140a);
            return a10;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        e0.o0 a11 = e0.d0.a(this);
        a11.a(1.0f);
        a11.c(j10);
        C0140a c0140a2 = this.f9250a;
        a.this.f = a11;
        c0140a2.f9258b = i10;
        a11.d(c0140a2);
        return a11;
    }

    public int getAnimatedVisibility() {
        return this.f != null ? this.f9250a.f9258b : getVisibility();
    }

    public int getContentHeight() {
        return this.f9254e;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, b.a0.f, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.f9253d;
        if (aVar != null) {
            Configuration configuration2 = aVar.f621b.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            aVar.f888x = (configuration2.smallestScreenWidthDp > 600 || i10 > 600 || (i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960)) ? 5 : (i10 >= 500 || (i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640)) ? 4 : i10 >= 360 ? 3 : 2;
            androidx.appcompat.view.menu.f fVar = aVar.f622c;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f9256p = false;
        }
        if (!this.f9256p) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f9256p = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f9256p = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9255o = false;
        }
        if (!this.f9255o) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f9255o = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f9255o = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f9254e = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            e0.o0 o0Var = this.f;
            if (o0Var != null) {
                o0Var.b();
            }
            super.setVisibility(i10);
        }
    }
}
