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
import e.AbstractC1230a;
import e.AbstractC1238i;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1502a extends ViewGroup {

    /* renamed from: o, reason: collision with root package name */
    public final C0231a f16406o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f16407p;

    /* renamed from: q, reason: collision with root package name */
    public ActionMenuView f16408q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.appcompat.widget.a f16409r;

    /* renamed from: s, reason: collision with root package name */
    public int f16410s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16411t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16412u;

    /* renamed from: l.a$a, reason: collision with other inner class name */
    public class C0231a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f16413a = false;

        public C0231a() {
        }
    }

    public AbstractC1502a(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f16406o = new C0231a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC1230a.f13330a, typedValue, true) || typedValue.resourceId == 0) {
            this.f16407p = context;
        } else {
            this.f16407p = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int b(int i7, int i8, boolean z7) {
        return z7 ? i7 - i8 : i7 + i8;
    }

    public int a(View view, int i7, int i8, int i9) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i8);
        return Math.max(0, (i7 - view.getMeasuredWidth()) - i9);
    }

    public int c(View view, int i7, int i8, int i9, boolean z7) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i8 + ((i9 - measuredHeight) / 2);
        if (z7) {
            view.layout(i7 - measuredWidth, i10, i7, measuredHeight + i10);
        } else {
            view.layout(i7, i10, i7 + measuredWidth, measuredHeight + i10);
        }
        return z7 ? -measuredWidth : measuredWidth;
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f16410s;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1238i.f13565a, AbstractC1230a.f13332c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(AbstractC1238i.f13597i, 0));
        obtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.f16409r;
        if (aVar != null) {
            aVar.C(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f16412u = false;
        }
        if (!this.f16412u) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f16412u = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f16412u = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16411t = false;
        }
        if (!this.f16411t) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f16411t = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f16411t = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i7);

    @Override // android.view.View
    public void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            super.setVisibility(i7);
        }
    }
}
