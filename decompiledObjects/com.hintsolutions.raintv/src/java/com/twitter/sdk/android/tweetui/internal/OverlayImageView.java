/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.util.AttributeSet
 *  android.widget.ImageView
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class OverlayImageView
extends ImageView {
    public Overlay overlay = new Overlay(null);

    public OverlayImageView(Context context) {
        super(context);
    }

    public OverlayImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.overlay.setDrawableState(this.getDrawableState());
    }

    public void invalidateDrawable(Drawable drawable2) {
        if (drawable2 == this.overlay.drawable) {
            this.invalidate();
        } else {
            super.invalidateDrawable(drawable2);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.overlay.draw(canvas);
    }

    public void onMeasure(int n, int n3) {
        super.onMeasure(n, n3);
        this.overlay.setDrawableBounds(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    public void onSizeChanged(int n, int n3, int n4, int n5) {
        super.onSizeChanged(n, n3, n4, n5);
        this.overlay.setDrawableBounds(n, n3);
    }

    public void setOverlayDrawable(Drawable object) {
        Overlay overlay = this.overlay;
        if (object != overlay.drawable) {
            overlay.cleanupDrawable(this);
            if (object != null) {
                object.setCallback((Drawable.Callback)this);
            }
            object = new Overlay((Drawable)object);
            this.overlay = object;
            ((Overlay)object).setDrawableState(this.getDrawableState());
            this.requestLayout();
        }
    }

    public static class Overlay {
        public final Drawable drawable;

        public Overlay(Drawable drawable2) {
            this.drawable = drawable2;
        }

        public void cleanupDrawable(ImageView imageView) {
            Drawable drawable2 = this.drawable;
            if (drawable2 != null) {
                drawable2.setCallback(null);
                imageView.unscheduleDrawable(this.drawable);
            }
        }

        public void draw(Canvas canvas) {
            Drawable drawable2 = this.drawable;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
        }

        public void setDrawableBounds(int n, int n3) {
            Drawable drawable2 = this.drawable;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, n, n3);
            }
        }

        public void setDrawableState(int[] nArray) {
            Drawable drawable2 = this.drawable;
            if (drawable2 != null && drawable2.isStateful()) {
                this.drawable.setState(nArray);
            }
        }
    }
}

