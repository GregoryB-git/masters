// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import l.D;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout
{
    public FitWindowsLinearLayout(@NonNull final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public boolean fitSystemWindows(final Rect rect) {
        return super.fitSystemWindows(rect);
    }
    
    public void setOnFitSystemWindowsListener(final D d) {
    }
}
