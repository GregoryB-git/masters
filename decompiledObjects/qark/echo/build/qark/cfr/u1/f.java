/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 */
package u1;

import B.a;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public abstract class f
extends Drawable {
    public Drawable o;

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            a.a(drawable2, theme);
        }
    }

    public void clearColorFilter() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.clearColorFilter();
            return;
        }
        super.clearColorFilter();
    }

    public Drawable getCurrent() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            a.h(drawable2);
        }
    }

    public boolean onLevelChange(int n8) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.setLevel(n8);
        }
        return super.onLevelChange(n8);
    }

    public void setChangingConfigurations(int n8) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.setChangingConfigurations(n8);
            return;
        }
        super.setChangingConfigurations(n8);
    }

    public void setColorFilter(int n8, PorterDuff.Mode mode) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.setColorFilter(n8, mode);
            return;
        }
        super.setColorFilter(n8, mode);
    }

    public void setFilterBitmap(boolean bl) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.setFilterBitmap(bl);
        }
    }

    public void setHotspot(float f8, float f9) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            a.j(drawable2, f8, f9);
        }
    }

    public void setHotspotBounds(int n8, int n9, int n10, int n11) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            a.k(drawable2, n8, n9, n10, n11);
        }
    }

    public boolean setState(int[] arrn) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.setState(arrn);
        }
        return super.setState(arrn);
    }
}

