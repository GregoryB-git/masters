// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.content.Context;
import java.lang.ref.WeakReference;

public class W extends N
{
    public final WeakReference b;
    
    public W(final Context referent, final Resources resources) {
        super(resources);
        this.b = new WeakReference((T)referent);
    }
    
    @Override
    public Drawable getDrawable(final int n) {
        final Drawable drawable = super.getDrawable(n);
        final Context context = (Context)this.b.get();
        if (drawable != null && context != null) {
            M.h().w(context, n, drawable);
        }
        return drawable;
    }
}
