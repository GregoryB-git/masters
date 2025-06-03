// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.view.View;
import android.content.res.TypedArray;
import android.text.Layout;
import e.i;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import l.w;

public class DialogTitle extends w
{
    public DialogTitle(@NonNull final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    @Override
    public void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        final Layout layout = this.getLayout();
        if (layout != null) {
            final int lineCount = layout.getLineCount();
            if (lineCount > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
                this.setSingleLine(false);
                this.setMaxLines(2);
                final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes((AttributeSet)null, e.i.Z1, 16842817, 16973892);
                final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e.i.a2, 0);
                if (dimensionPixelSize != 0) {
                    this.setTextSize(0, (float)dimensionPixelSize);
                }
                obtainStyledAttributes.recycle();
                super.onMeasure(n, n2);
            }
        }
    }
}
