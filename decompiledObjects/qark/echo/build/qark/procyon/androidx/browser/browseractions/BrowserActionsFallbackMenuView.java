// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.browser.browseractions;

import android.view.View;
import android.view.View$MeasureSpec;
import p.a;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.widget.LinearLayout;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout
{
    public final int o;
    public final int p;
    
    public BrowserActionsFallbackMenuView(@NonNull final Context context, @NonNull final AttributeSet set) {
        super(context, set);
        this.o = ((View)this).getResources().getDimensionPixelOffset(a.b);
        this.p = ((View)this).getResources().getDimensionPixelOffset(a.a);
    }
    
    public void onMeasure(final int n, final int n2) {
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(Math.min(((View)this).getResources().getDisplayMetrics().widthPixels - this.o * 2, this.p), 1073741824), n2);
    }
}
