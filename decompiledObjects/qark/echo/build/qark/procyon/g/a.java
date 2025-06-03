// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g;

import l.M;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.Context;
import java.util.WeakHashMap;

public abstract class a
{
    public static final ThreadLocal a;
    public static final WeakHashMap b;
    public static final Object c;
    
    static {
        a = new ThreadLocal();
        b = new WeakHashMap(0);
        c = new Object();
    }
    
    public static ColorStateList a(final Context context, final int n) {
        return context.getColorStateList(n);
    }
    
    public static Drawable b(final Context context, final int n) {
        return M.h().j(context, n);
    }
}
