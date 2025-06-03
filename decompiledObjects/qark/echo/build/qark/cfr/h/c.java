/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  java.lang.Runnable
 */
package h;

import B.a;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public abstract class c
extends Drawable
implements Drawable.Callback {
    public Drawable o;

    public c(Drawable drawable2) {
        this.b(drawable2);
    }

    public Drawable a() {
        return this.o;
    }

    public void b(Drawable drawable2) {
        Drawable drawable3 = this.o;
        if (drawable3 != null) {
            drawable3.setCallback(null);
        }
        this.o = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback)this);
        }
    }

    public void draw(Canvas canvas) {
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

    public boolean getPadding(Rect rect) {
        return this.o.getPadding(rect);
    }

    public int[] getState() {
        return this.o.getState();
    }

    public Region getTransparentRegion() {
        return this.o.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable2) {
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

    public void onBoundsChange(Rect rect) {
        this.o.setBounds(rect);
    }

    public boolean onLevelChange(int n8) {
        return this.o.setLevel(n8);
    }

    public void scheduleDrawable(Drawable drawable2, Runnable runnable, long l8) {
        this.scheduleSelf(runnable, l8);
    }

    public void setAlpha(int n8) {
        this.o.setAlpha(n8);
    }

    public void setAutoMirrored(boolean bl) {
        a.i(this.o, bl);
    }

    public void setChangingConfigurations(int n8) {
        this.o.setChangingConfigurations(n8);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.o.setColorFilter(colorFilter);
    }

    public void setDither(boolean bl) {
        this.o.setDither(bl);
    }

    public void setFilterBitmap(boolean bl) {
        this.o.setFilterBitmap(bl);
    }

    public void setHotspot(float f8, float f9) {
        a.j(this.o, f8, f9);
    }

    public void setHotspotBounds(int n8, int n9, int n10, int n11) {
        a.k(this.o, n8, n9, n10, n11);
    }

    public boolean setState(int[] arrn) {
        return this.o.setState(arrn);
    }

    public void setTint(int n8) {
        a.l(this.o, n8);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.m(this.o, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.n(this.o, mode);
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        if (!super.setVisible(bl, bl2) && !this.o.setVisible(bl, bl2)) {
            return false;
        }
        return true;
    }

    public void unscheduleDrawable(Drawable drawable2, Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}

