package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f9402a;

    /* renamed from: b, reason: collision with root package name */
    public final v0.f f9403b;

    public m(TextView textView) {
        this.f9402a = textView;
        this.f9403b = new v0.f(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f9402a.getContext().obtainStyledAttributes(attributeSet, b.a0.f1580v, i10, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z10) {
        this.f9403b.f15196a.b(z10);
    }

    public final void c(boolean z10) {
        this.f9403b.f15196a.c(z10);
    }
}
