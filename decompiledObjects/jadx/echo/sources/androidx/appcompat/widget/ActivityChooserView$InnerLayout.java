package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import l.X;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f8611o = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        X r7 = X.r(context, attributeSet, f8611o);
        setBackgroundDrawable(r7.f(0));
        r7.t();
    }
}
