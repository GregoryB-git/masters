// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u1;

import android.graphics.PorterDuff$Mode;
import android.graphics.Region;
import android.graphics.Rect;
import B.a;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;

public abstract class f extends Drawable
{
    public Drawable o;
    
    public void applyTheme(final Resources$Theme resources$Theme) {
        final Drawable o = this.o;
        if (o != null) {
            a.a(o, resources$Theme);
        }
    }
    
    public void clearColorFilter() {
        final Drawable o = this.o;
        if (o != null) {
            o.clearColorFilter();
            return;
        }
        super.clearColorFilter();
    }
    
    public Drawable getCurrent() {
        final Drawable o = this.o;
        if (o != null) {
            return o.getCurrent();
        }
        return super.getCurrent();
    }
    
    public int getMinimumHeight() {
        final Drawable o = this.o;
        if (o != null) {
            return o.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }
    
    public int getMinimumWidth() {
        final Drawable o = this.o;
        if (o != null) {
            return o.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }
    
    public boolean getPadding(final Rect rect) {
        final Drawable o = this.o;
        if (o != null) {
            return o.getPadding(rect);
        }
        return super.getPadding(rect);
    }
    
    public int[] getState() {
        final Drawable o = this.o;
        if (o != null) {
            return o.getState();
        }
        return super.getState();
    }
    
    public Region getTransparentRegion() {
        final Drawable o = this.o;
        if (o != null) {
            return o.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }
    
    public void jumpToCurrentState() {
        final Drawable o = this.o;
        if (o != null) {
            a.h(o);
        }
    }
    
    public boolean onLevelChange(final int level) {
        final Drawable o = this.o;
        if (o != null) {
            return o.setLevel(level);
        }
        return super.onLevelChange(level);
    }
    
    public void setChangingConfigurations(final int n) {
        final Drawable o = this.o;
        if (o != null) {
            o.setChangingConfigurations(n);
            return;
        }
        super.setChangingConfigurations(n);
    }
    
    public void setColorFilter(final int n, final PorterDuff$Mode porterDuff$Mode) {
        final Drawable o = this.o;
        if (o != null) {
            o.setColorFilter(n, porterDuff$Mode);
            return;
        }
        super.setColorFilter(n, porterDuff$Mode);
    }
    
    public void setFilterBitmap(final boolean filterBitmap) {
        final Drawable o = this.o;
        if (o != null) {
            o.setFilterBitmap(filterBitmap);
        }
    }
    
    public void setHotspot(final float n, final float n2) {
        final Drawable o = this.o;
        if (o != null) {
            a.j(o, n, n2);
        }
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        final Drawable o = this.o;
        if (o != null) {
            a.k(o, n, n2, n3, n4);
        }
    }
    
    public boolean setState(final int[] array) {
        final Drawable o = this.o;
        if (o != null) {
            return o.setState(array);
        }
        return super.setState(array);
    }
}
