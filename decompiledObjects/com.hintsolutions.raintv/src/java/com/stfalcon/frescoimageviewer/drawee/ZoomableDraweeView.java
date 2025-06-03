/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.GestureDetector$OnDoubleTapListener
 *  android.view.MotionEvent
 *  android.view.View$OnLongClickListener
 *  androidx.annotation.NonNull
 *  com.facebook.drawee.generic.GenericDraweeHierarchy
 *  com.facebook.drawee.view.DraweeView
 *  com.facebook.drawee.view.SimpleDraweeView
 *  java.lang.Object
 *  me.relex.photodraweeview.IAttacher
 *  me.relex.photodraweeview.OnPhotoTapListener
 *  me.relex.photodraweeview.OnScaleChangeListener
 *  me.relex.photodraweeview.OnViewTapListener
 */
package com.stfalcon.frescoimageviewer.drawee;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.stfalcon.frescoimageviewer.drawee.NonInterceptableAttacher;
import me.relex.photodraweeview.IAttacher;
import me.relex.photodraweeview.OnPhotoTapListener;
import me.relex.photodraweeview.OnScaleChangeListener;
import me.relex.photodraweeview.OnViewTapListener;

public class ZoomableDraweeView
extends SimpleDraweeView
implements IAttacher {
    private NonInterceptableAttacher attacher;

    public ZoomableDraweeView(Context context) {
        super(context);
        this.init();
    }

    public ZoomableDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init();
    }

    public ZoomableDraweeView(Context context, AttributeSet attributeSet, int n4) {
        super(context, attributeSet, n4);
        this.init();
    }

    public ZoomableDraweeView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
        this.init();
    }

    public float getMaximumScale() {
        return this.attacher.getMaximumScale();
    }

    public float getMediumScale() {
        return this.attacher.getMediumScale();
    }

    public float getMinimumScale() {
        return this.attacher.getMinimumScale();
    }

    public OnPhotoTapListener getOnPhotoTapListener() {
        return this.attacher.getOnPhotoTapListener();
    }

    public OnViewTapListener getOnViewTapListener() {
        return this.attacher.getOnViewTapListener();
    }

    public float getScale() {
        return this.attacher.getScale();
    }

    public void init() {
        NonInterceptableAttacher nonInterceptableAttacher = this.attacher;
        if (nonInterceptableAttacher == null || nonInterceptableAttacher.getDraweeView() == null) {
            this.attacher = new NonInterceptableAttacher((DraweeView<GenericDraweeHierarchy>)this);
        }
    }

    public void onAttachedToWindow() {
        this.init();
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.attacher.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    public void onDraw(@NonNull Canvas canvas) {
        int n4 = canvas.save();
        canvas.concat(this.attacher.getDrawMatrix());
        super.onDraw(canvas);
        canvas.restoreToCount(n4);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setAllowParentInterceptOnEdge(boolean bl) {
        this.attacher.setAllowParentInterceptOnEdge(bl);
    }

    public void setMaximumScale(float f) {
        this.attacher.setMaximumScale(f);
    }

    public void setMediumScale(float f) {
        this.attacher.setMediumScale(f);
    }

    public void setMinimumScale(float f) {
        this.attacher.setMinimumScale(f);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.attacher.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.attacher.setOnLongClickListener(onLongClickListener);
    }

    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.attacher.setOnPhotoTapListener(onPhotoTapListener);
    }

    public void setOnScaleChangeListener(OnScaleChangeListener onScaleChangeListener) {
        this.attacher.setOnScaleChangeListener(onScaleChangeListener);
    }

    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
        this.attacher.setOnViewTapListener(onViewTapListener);
    }

    public void setScale(float f) {
        this.attacher.setScale(f);
    }

    public void setScale(float f, float f2, float f3, boolean bl) {
        this.attacher.setScale(f, f2, f3, bl);
    }

    public void setScale(float f, boolean bl) {
        this.setScale(f, this.getRight() / 2, this.getBottom() / 2, bl);
    }

    public void setZoomTransitionDuration(long l4) {
        this.attacher.setZoomTransitionDuration(l4);
    }

    public void update(int n4, int n5) {
        this.attacher.update(n4, n5);
    }
}

