/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.drawable.Animatable
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.view.GestureDetector$OnDoubleTapListener
 *  android.view.MotionEvent
 *  android.view.View$OnLongClickListener
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.facebook.drawee.backends.pipeline.Fresco
 *  com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
 *  com.facebook.drawee.controller.BaseControllerListener
 *  com.facebook.drawee.controller.ControllerListener
 *  com.facebook.drawee.generic.GenericDraweeHierarchy
 *  com.facebook.drawee.interfaces.DraweeController
 *  com.facebook.drawee.view.DraweeView
 *  com.facebook.drawee.view.SimpleDraweeView
 *  com.facebook.imagepipeline.image.ImageInfo
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  me.relex.photodraweeview.Attacher
 *  me.relex.photodraweeview.IAttacher
 *  me.relex.photodraweeview.OnPhotoTapListener
 *  me.relex.photodraweeview.OnScaleChangeListener
 *  me.relex.photodraweeview.OnViewTapListener
 */
package me.relex.photodraweeview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.image.ImageInfo;
import me.relex.photodraweeview.Attacher;
import me.relex.photodraweeview.IAttacher;
import me.relex.photodraweeview.OnPhotoTapListener;
import me.relex.photodraweeview.OnScaleChangeListener;
import me.relex.photodraweeview.OnViewTapListener;

public class PhotoDraweeView
extends SimpleDraweeView
implements IAttacher {
    private Attacher mAttacher;
    private boolean mEnableDraweeMatrix = true;

    public PhotoDraweeView(Context context) {
        super(context);
        this.init();
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init();
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.init();
    }

    public PhotoDraweeView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
        this.init();
    }

    public static /* synthetic */ boolean access$002(PhotoDraweeView photoDraweeView, boolean bl) {
        photoDraweeView.mEnableDraweeMatrix = bl;
        return bl;
    }

    public float getMaximumScale() {
        return this.mAttacher.getMaximumScale();
    }

    public float getMediumScale() {
        return this.mAttacher.getMediumScale();
    }

    public float getMinimumScale() {
        return this.mAttacher.getMinimumScale();
    }

    public OnPhotoTapListener getOnPhotoTapListener() {
        return this.mAttacher.getOnPhotoTapListener();
    }

    public OnViewTapListener getOnViewTapListener() {
        return this.mAttacher.getOnViewTapListener();
    }

    public float getScale() {
        return this.mAttacher.getScale();
    }

    public void init() {
        Attacher attacher = this.mAttacher;
        if (attacher == null || attacher.getDraweeView() == null) {
            this.mAttacher = new Attacher((DraweeView)this);
        }
    }

    public boolean isEnableDraweeMatrix() {
        return this.mEnableDraweeMatrix;
    }

    public void onAttachedToWindow() {
        this.init();
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.mAttacher.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    public void onDraw(@NonNull Canvas canvas) {
        int n2 = canvas.save();
        if (this.mEnableDraweeMatrix) {
            canvas.concat(this.mAttacher.getDrawMatrix());
        }
        super.onDraw(canvas);
        canvas.restoreToCount(n2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setAllowParentInterceptOnEdge(boolean bl) {
        this.mAttacher.setAllowParentInterceptOnEdge(bl);
    }

    public void setEnableDraweeMatrix(boolean bl) {
        this.mEnableDraweeMatrix = bl;
    }

    public void setMaximumScale(float f2) {
        this.mAttacher.setMaximumScale(f2);
    }

    public void setMediumScale(float f2) {
        this.mAttacher.setMediumScale(f2);
    }

    public void setMinimumScale(float f2) {
        this.mAttacher.setMinimumScale(f2);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.mAttacher.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mAttacher.setOnLongClickListener(onLongClickListener);
    }

    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.mAttacher.setOnPhotoTapListener(onPhotoTapListener);
    }

    public void setOnScaleChangeListener(OnScaleChangeListener onScaleChangeListener) {
        this.mAttacher.setOnScaleChangeListener(onScaleChangeListener);
    }

    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
        this.mAttacher.setOnViewTapListener(onViewTapListener);
    }

    public void setPhotoUri(Uri uri) {
        this.setPhotoUri(uri, null);
    }

    public void setPhotoUri(Uri uri, @Nullable Context context) {
        this.mEnableDraweeMatrix = false;
        this.setController((DraweeController)((PipelineDraweeControllerBuilder)((PipelineDraweeControllerBuilder)((PipelineDraweeControllerBuilder)Fresco.newDraweeControllerBuilder().setCallerContext((Object)context)).setUri(uri).setOldController(this.getController())).setControllerListener((ControllerListener)new BaseControllerListener<ImageInfo>(this){
            public final PhotoDraweeView this$0;
            {
                this.this$0 = photoDraweeView;
            }

            public void onFailure(String string, Throwable throwable) {
                super.onFailure(string, throwable);
                PhotoDraweeView.access$002(this.this$0, false);
            }

            public void onFinalImageSet(String string, ImageInfo imageInfo, Animatable animatable) {
                super.onFinalImageSet(string, (Object)imageInfo, animatable);
                PhotoDraweeView.access$002(this.this$0, true);
                if (imageInfo != null) {
                    this.this$0.update(imageInfo.getWidth(), imageInfo.getHeight());
                }
            }

            public void onIntermediateImageFailed(String string, Throwable throwable) {
                super.onIntermediateImageFailed(string, throwable);
                PhotoDraweeView.access$002(this.this$0, false);
            }

            public void onIntermediateImageSet(String string, ImageInfo imageInfo) {
                super.onIntermediateImageSet(string, (Object)imageInfo);
                PhotoDraweeView.access$002(this.this$0, true);
                if (imageInfo != null) {
                    this.this$0.update(imageInfo.getWidth(), imageInfo.getHeight());
                }
            }
        })).build());
    }

    public void setScale(float f2) {
        this.mAttacher.setScale(f2);
    }

    public void setScale(float f2, float f3, float f7, boolean bl) {
        this.mAttacher.setScale(f2, f3, f7, bl);
    }

    public void setScale(float f2, boolean bl) {
        this.mAttacher.setScale(f2, bl);
    }

    public void setZoomTransitionDuration(long l2) {
        this.mAttacher.setZoomTransitionDuration(l2);
    }

    public void update(int n2, int n3) {
        this.mAttacher.update(n2, n3);
    }
}

