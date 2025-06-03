package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import e0.o0;
import g.g;
import g.i;
import l.g0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f796a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f797b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f798c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f799d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f800e;
    public TypedValue f;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f801o;

    /* renamed from: p, reason: collision with root package name */
    public a f802p;

    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f801o = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f800e == null) {
            this.f800e = new TypedValue();
        }
        return this.f800e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f798c == null) {
            this.f798c = new TypedValue();
        }
        return this.f798c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f799d == null) {
            this.f799d = new TypedValue();
        }
        return this.f799d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f796a == null) {
            this.f796a = new TypedValue();
        }
        return this.f796a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f797b == null) {
            this.f797b = new TypedValue();
        }
        return this.f797b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f802p;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f802p;
        if (aVar != null) {
            g gVar = ((i) aVar).f5615a;
            g0 g0Var = gVar.f5580z;
            if (g0Var != null) {
                g0Var.i();
            }
            if (gVar.E != null) {
                gVar.t.getDecorView().removeCallbacks(gVar.F);
                if (gVar.E.isShowing()) {
                    try {
                        gVar.E.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                gVar.E = null;
            }
            o0 o0Var = gVar.G;
            if (o0Var != null) {
                o0Var.b();
            }
            f fVar = gVar.R(0).f5604h;
            if (fVar != null) {
                fVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f802p = aVar;
    }
}
