package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public TypedValue f8617o;

    /* renamed from: p, reason: collision with root package name */
    public TypedValue f8618p;

    /* renamed from: q, reason: collision with root package name */
    public TypedValue f8619q;

    /* renamed from: r, reason: collision with root package name */
    public TypedValue f8620r;

    /* renamed from: s, reason: collision with root package name */
    public TypedValue f8621s;

    /* renamed from: t, reason: collision with root package name */
    public TypedValue f8622t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f8623u;

    public interface a {
    }

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f8621s == null) {
            this.f8621s = new TypedValue();
        }
        return this.f8621s;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f8622t == null) {
            this.f8622t = new TypedValue();
        }
        return this.f8622t;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f8619q == null) {
            this.f8619q = new TypedValue();
        }
        return this.f8619q;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f8620r == null) {
            this.f8620r = new TypedValue();
        }
        return this.f8620r;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f8617o == null) {
            this.f8617o = new TypedValue();
        }
        return this.f8617o;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f8618p == null) {
            this.f8618p = new TypedValue();
        }
        return this.f8618p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
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
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8623u = new Rect();
    }
}
