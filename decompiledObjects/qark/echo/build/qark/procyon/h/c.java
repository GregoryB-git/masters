// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import B.a;
import android.graphics.Region;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

public abstract class c extends Drawable implements Drawable$Callback
{
    public Drawable o;
    
    public c(final Drawable drawable) {
        this.b(drawable);
    }
    
    public Drawable a() {
        return this.o;
    }
    
    public void b(final Drawable o) {
        final Drawable o2 = this.o;
        if (o2 != null) {
            o2.setCallback((Drawable$Callback)null);
        }
        if ((this.o = o) != null) {
            o.setCallback((Drawable$Callback)this);
        }
    }
    
    public void draw(final Canvas canvas) {
        this.o.draw(canvas);
    }
    
    public int getChangingConfigurations() {
        return this.o.getChangingConfigurations();
    }
    
    public Drawable getCurrent() {
        return this.o.getCurrent();
    }
    
    public int getIntrinsicHeight() {
        return this.o.getIntrinsicHeight();
    }
    
    public int getIntrinsicWidth() {
        return this.o.getIntrinsicWidth();
    }
    
    public int getMinimumHeight() {
        return this.o.getMinimumHeight();
    }
    
    public int getMinimumWidth() {
        return this.o.getMinimumWidth();
    }
    
    public int getOpacity() {
        return this.o.getOpacity();
    }
    
    public boolean getPadding(final Rect rect) {
        return this.o.getPadding(rect);
    }
    
    public int[] getState() {
        return this.o.getState();
    }
    
    public Region getTransparentRegion() {
        return this.o.getTransparentRegion();
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public boolean isAutoMirrored() {
        return a.g(this.o);
    }
    
    public boolean isStateful() {
        return this.o.isStateful();
    }
    
    public void jumpToCurrentState() {
        this.o.jumpToCurrentState();
    }
    
    public void onBoundsChange(final Rect bounds) {
        this.o.setBounds(bounds);
    }
    
    public boolean onLevelChange(final int level) {
        return this.o.setLevel(level);
    }
    
    public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public void setAlpha(final int alpha) {
        this.o.setAlpha(alpha);
    }
    
    public void setAutoMirrored(final boolean b) {
        a.i(this.o, b);
    }
    
    public void setChangingConfigurations(final int changingConfigurations) {
        this.o.setChangingConfigurations(changingConfigurations);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.o.setColorFilter(colorFilter);
    }
    
    public void setDither(final boolean dither) {
        this.o.setDither(dither);
    }
    
    public void setFilterBitmap(final boolean filterBitmap) {
        this.o.setFilterBitmap(filterBitmap);
    }
    
    public void setHotspot(final float n, final float n2) {
        a.j(this.o, n, n2);
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        a.k(this.o, n, n2, n3, n4);
    }
    
    public boolean setState(final int[] state) {
        return this.o.setState(state);
    }
    
    public void setTint(final int n) {
        a.l(this.o, n);
    }
    
    public void setTintList(final ColorStateList list) {
        a.m(this.o, list);
    }
    
    public void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        a.n(this.o, porterDuff$Mode);
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        return super.setVisible(b, b2) || this.o.setVisible(b, b2);
    }
    
    public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
