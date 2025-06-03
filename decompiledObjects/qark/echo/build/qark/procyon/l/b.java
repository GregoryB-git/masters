// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Canvas;
import androidx.appcompat.widget.ActionBarContainer;
import android.graphics.drawable.Drawable;

public class b extends Drawable
{
    public final ActionBarContainer a;
    
    public b(final ActionBarContainer a) {
        this.a = a;
    }
    
    public void draw(final Canvas canvas) {
        final ActionBarContainer a = this.a;
        if (a.v) {
            final Drawable u = a.u;
            if (u != null) {
                u.draw(canvas);
            }
        }
        else {
            final Drawable s = a.s;
            if (s != null) {
                s.draw(canvas);
            }
            final ActionBarContainer a2 = this.a;
            final Drawable t = a2.t;
            if (t != null && a2.w) {
                t.draw(canvas);
            }
        }
    }
    
    public int getOpacity() {
        return 0;
    }
    
    public void getOutline(final Outline outline) {
        final ActionBarContainer a = this.a;
        Drawable drawable;
        if (a.v) {
            drawable = a.u;
            if (drawable == null) {
                return;
            }
        }
        else {
            drawable = a.s;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }
    
    public void setAlpha(final int n) {
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
    }
}
