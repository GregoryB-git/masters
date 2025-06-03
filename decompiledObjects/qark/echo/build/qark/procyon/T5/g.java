// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T5;

import android.content.ContextWrapper;
import androidx.window.layout.WindowMetrics;
import android.app.Activity;
import androidx.window.layout.l;
import android.content.Context;

public abstract class g
{
    public static void a(final Context context, final a a) {
        final Activity b = b(context);
        if (b != null) {
            final WindowMetrics computeMaximumWindowMetrics = l.a().computeMaximumWindowMetrics(b);
            a.a((float)computeMaximumWindowMetrics.getBounds().width(), (float)computeMaximumWindowMetrics.getBounds().height(), context.getResources().getDisplayMetrics().density);
        }
    }
    
    public static Activity b(final Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity)context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper)context).getBaseContext());
        }
        return null;
    }
    
    public interface a
    {
        void a(final float p0, final float p1, final float p2);
    }
}
