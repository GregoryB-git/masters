// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.app;

import android.content.res.TypedArray;
import e.i;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ListView;

public class AlertController$RecycleListView extends ListView
{
    public final int o;
    public final int p;
    
    public AlertController$RecycleListView(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, i.A1);
        this.p = obtainStyledAttributes.getDimensionPixelOffset(i.B1, -1);
        this.o = obtainStyledAttributes.getDimensionPixelOffset(i.C1, -1);
    }
}
