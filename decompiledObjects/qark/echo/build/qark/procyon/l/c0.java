// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.graphics.drawable.Drawable;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.content.res.Resources;

public class c0 extends Resources
{
    public static boolean b = false;
    public final WeakReference a;
    
    public c0(final Context referent, final Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = new WeakReference((T)referent);
    }
    
    public static boolean a() {
        return c0.b;
    }
    
    public static boolean b() {
        a();
        return false;
    }
    
    public final Drawable c(final int n) {
        return super.getDrawable(n);
    }
    
    public Drawable getDrawable(final int n) {
        final Context context = (Context)this.a.get();
        if (context != null) {
            return M.h().s(context, this, n);
        }
        return super.getDrawable(n);
    }
}
