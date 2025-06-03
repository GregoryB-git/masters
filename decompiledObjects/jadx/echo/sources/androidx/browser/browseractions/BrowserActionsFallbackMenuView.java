package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import p.AbstractC1766a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public final int f8813o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8814p;

    public BrowserActionsFallbackMenuView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8813o = getResources().getDimensionPixelOffset(AbstractC1766a.f18215b);
        this.f8814p = getResources().getDimensionPixelOffset(AbstractC1766a.f18214a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f8813o * 2), this.f8814p), 1073741824), i8);
    }
}
