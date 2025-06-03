// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.view.View;
import l.X;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class ActivityChooserView$InnerLayout extends LinearLayout
{
    public static final int[] o;
    
    static {
        o = new int[] { 16842964 };
    }
    
    public ActivityChooserView$InnerLayout(final Context context, final AttributeSet set) {
        super(context, set);
        final X r = X.r(context, set, ActivityChooserView$InnerLayout.o);
        ((View)this).setBackgroundDrawable(r.f(0));
        r.t();
    }
}
