/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.facebook.drawee.generic.GenericDraweeHierarchy
 *  com.facebook.drawee.view.DraweeView
 *  java.lang.Object
 *  me.relex.photodraweeview.Attacher
 *  me.relex.photodraweeview.OnScaleChangeListener
 */
package com.stfalcon.frescoimageviewer.drawee;

import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.DraweeView;
import me.relex.photodraweeview.Attacher;
import me.relex.photodraweeview.OnScaleChangeListener;

class NonInterceptableAttacher
extends Attacher {
    private OnScaleChangeListener scaleChangeListener;

    public NonInterceptableAttacher(DraweeView<GenericDraweeHierarchy> draweeView) {
        super(draweeView);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onDrag(float f, float f2) {
        DraweeView draweeView = this.getDraweeView();
        if (draweeView != null) {
            this.getDrawMatrix().postTranslate(f, f2);
            this.checkMatrixAndInvalidate();
            draweeView = draweeView.getParent();
            if (draweeView == null) {
                return;
            }
            if (this.getScale() == 1.0f) {
                draweeView.requestDisallowInterceptTouchEvent(false);
            } else {
                draweeView.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public void onScale(float f, float f2, float f3) {
        super.onScale(f, f2, f3);
        OnScaleChangeListener onScaleChangeListener = this.scaleChangeListener;
        if (onScaleChangeListener != null) {
            onScaleChangeListener.onScaleChange(f, f2, f3);
        }
    }

    public void setOnScaleChangeListener(OnScaleChangeListener onScaleChangeListener) {
        this.scaleChangeListener = onScaleChangeListener;
    }
}

