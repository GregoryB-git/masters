/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.ScaleGestureDetector
 *  android.view.ScaleGestureDetector$OnScaleGestureListener
 *  android.view.ScaleGestureDetector$SimpleOnScaleGestureListener
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  androidx.core.view.GestureDetectorCompat
 *  androidx.viewpager.widget.PagerAdapter
 *  androidx.viewpager.widget.ViewPager$OnPageChangeListener
 *  com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
 *  com.facebook.imagepipeline.request.ImageRequestBuilder
 *  com.stfalcon.frescoimageviewer.ImageViewerAdapter
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.stfalcon.frescoimageviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.GestureDetectorCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.stfalcon.frescoimageviewer.AnimationUtils;
import com.stfalcon.frescoimageviewer.ImageViewer;
import com.stfalcon.frescoimageviewer.ImageViewerAdapter;
import com.stfalcon.frescoimageviewer.ImageViewerView;
import com.stfalcon.frescoimageviewer.MultiTouchViewPager;
import com.stfalcon.frescoimageviewer.OnDismissListener;
import com.stfalcon.frescoimageviewer.SwipeDirectionDetector;
import com.stfalcon.frescoimageviewer.SwipeToDismissListener;

class ImageViewerView
extends RelativeLayout
implements OnDismissListener,
SwipeToDismissListener.OnViewMoveListener {
    private ImageViewerAdapter adapter;
    private View backgroundView;
    private GenericDraweeHierarchyBuilder customDraweeHierarchyBuilder;
    private ImageRequestBuilder customImageRequestBuilder;
    private int descriptionViewId = 0;
    private SwipeDirectionDetector.Direction direction;
    private SwipeDirectionDetector directionDetector;
    private ViewGroup dismissContainer;
    private GestureDetectorCompat gestureDetector;
    private boolean isOverlayWasClicked;
    private boolean isSwipeToDismissAllowed = true;
    private boolean isZoomingAllowed = true;
    private OnDismissListener onDismissListener;
    private View overlayView;
    private ViewPager.OnPageChangeListener pageChangeListener;
    private MultiTouchViewPager pager;
    private ScaleGestureDetector scaleDetector;
    private SwipeToDismissListener swipeDismissListener;
    private boolean wasScaled;

    public ImageViewerView(Context context) {
        super(context);
        this.init();
    }

    public ImageViewerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init();
    }

    public ImageViewerView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.init();
    }

    public static /* synthetic */ SwipeDirectionDetector.Direction access$002(ImageViewerView imageViewerView, SwipeDirectionDetector.Direction direction) {
        imageViewerView.direction = direction;
        return direction;
    }

    public static /* synthetic */ MultiTouchViewPager access$100(ImageViewerView imageViewerView) {
        return imageViewerView.pager;
    }

    public static /* synthetic */ boolean access$200(ImageViewerView imageViewerView) {
        return imageViewerView.isOverlayWasClicked;
    }

    public static /* synthetic */ void access$300(ImageViewerView imageViewerView, MotionEvent motionEvent, boolean bl) {
        imageViewerView.onClick(motionEvent, bl);
    }

    private boolean dispatchOverlayTouch(MotionEvent motionEvent) {
        View view = this.overlayView;
        boolean bl = view != null && view.getVisibility() == 0 && this.overlayView.dispatchTouchEvent(motionEvent);
        return bl;
    }

    private void init() {
        SwipeToDismissListener swipeToDismissListener;
        View.inflate((Context)this.getContext(), (int)2131492991, (ViewGroup)this);
        this.backgroundView = this.findViewById(2131296385);
        this.pager = (MultiTouchViewPager)this.findViewById(2131296990);
        this.dismissContainer = (ViewGroup)this.findViewById(2131296501);
        this.swipeDismissListener = swipeToDismissListener = new SwipeToDismissListener(this.findViewById(2131296552), this, this);
        this.dismissContainer.setOnTouchListener((View.OnTouchListener)swipeToDismissListener);
        this.directionDetector = new SwipeDirectionDetector(this, this.getContext()){
            public final ImageViewerView this$0;
            {
                this.this$0 = imageViewerView;
                super(context);
            }

            @Override
            public void onDirectionDetected(SwipeDirectionDetector.Direction direction) {
                ImageViewerView.access$002(this.this$0, direction);
            }
        };
        this.scaleDetector = new ScaleGestureDetector(this.getContext(), (ScaleGestureDetector.OnScaleGestureListener)new ScaleGestureDetector.SimpleOnScaleGestureListener());
        this.gestureDetector = new GestureDetectorCompat(this.getContext(), (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener(this){
            public final ImageViewerView this$0;
            {
                this.this$0 = imageViewerView;
            }

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (ImageViewerView.access$100(this.this$0).isScrolled()) {
                    ImageViewerView imageViewerView = this.this$0;
                    ImageViewerView.access$300(imageViewerView, motionEvent, ImageViewerView.access$200(imageViewerView));
                }
                return false;
            }
        });
    }

    private void onActionDown(MotionEvent motionEvent) {
        this.direction = null;
        this.wasScaled = false;
        this.pager.dispatchTouchEvent(motionEvent);
        this.swipeDismissListener.onTouch((View)this.dismissContainer, motionEvent);
        this.isOverlayWasClicked = this.dispatchOverlayTouch(motionEvent);
    }

    private void onActionUp(MotionEvent motionEvent) {
        this.swipeDismissListener.onTouch((View)this.dismissContainer, motionEvent);
        this.pager.dispatchTouchEvent(motionEvent);
        this.isOverlayWasClicked = this.dispatchOverlayTouch(motionEvent);
    }

    private void onClick(MotionEvent motionEvent, boolean bl) {
        View view = this.overlayView;
        if (view != null && !bl) {
            AnimationUtils.animateVisibility(view);
            super.dispatchTouchEvent(motionEvent);
        }
    }

    private void onUpDownEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.onActionUp(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.onActionDown(motionEvent);
        }
        this.scaleDetector.onTouchEvent(motionEvent);
        this.gestureDetector.onTouchEvent(motionEvent);
    }

    private void setStartPosition(int n) {
        this.pager.setCurrentItem(n);
    }

    public void allowSwipeToDismiss(boolean bl) {
        this.isSwipeToDismissAllowed = bl;
    }

    public void allowZooming(boolean bl) {
        this.isZoomingAllowed = bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean dispatchTouchEvent(MotionEvent var1_1) {
        block9: {
            this.onUpDownEvent(var1_1);
            if (this.direction == null && (this.scaleDetector.isInProgress() || var1_1.getPointerCount() > 1)) {
                this.wasScaled = true;
                return this.pager.dispatchTouchEvent(var1_1);
            }
            if (this.adapter.isScaled(this.pager.getCurrentItem())) break block9;
            var3_2 /* !! */  = this.overlayView;
            if (var3_2 /* !! */  == null || this.descriptionViewId == 0) ** GOTO lbl-1000
            var4_3 = var3_2 /* !! */ .findViewById(2131296536);
            var3_2 /* !! */  = (View)new int[2];
            var4_3.getLocationOnScreen((int[])var3_2 /* !! */ );
            if (var1_1.getY() > (float)var3_2 /* !! */ [1]) {
                var2_4 = 0;
            } else lbl-1000:
            // 2 sources

            {
                var2_4 = 1;
            }
            if (var2_4 != 0) {
                this.directionDetector.onTouchEvent(var1_1);
                var3_2 /* !! */  = this.direction;
                if (var3_2 /* !! */  != null) {
                    var2_4 = 3.$SwitchMap$com$stfalcon$frescoimageviewer$SwipeDirectionDetector$Direction[var3_2 /* !! */ .ordinal()];
                    if (var2_4 != 1 && var2_4 != 2) {
                        if (var2_4 == 3 || var2_4 == 4) {
                            return this.pager.dispatchTouchEvent(var1_1);
                        }
                    } else if (this.isSwipeToDismissAllowed && !this.wasScaled && this.pager.isScrolled()) {
                        return this.swipeDismissListener.onTouch((View)this.dismissContainer, var1_1);
                    }
                }
                return true;
            }
        }
        return super.dispatchTouchEvent(var1_1);
    }

    public String getUrl() {
        return this.adapter.getUrl(this.pager.getCurrentItem());
    }

    public boolean isScaled() {
        return this.adapter.isScaled(this.pager.getCurrentItem());
    }

    @Override
    public void onDismiss() {
        OnDismissListener onDismissListener = this.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override
    public void onViewMove(float f, int n) {
        float f2 = 1.0f / (float)n / 4.0f;
        f = 1.0f - Math.abs((float)f) * f2;
        this.backgroundView.setAlpha(f);
        View view = this.overlayView;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    public void resetScale() {
        this.adapter.resetScale(this.pager.getCurrentItem());
    }

    public void setBackgroundColor(int n) {
        this.findViewById(2131296385).setBackgroundColor(n);
    }

    public void setContainerPadding(int[] nArray) {
        this.pager.setPadding(nArray[0], nArray[1], nArray[2], nArray[3]);
    }

    public void setCustomDraweeHierarchyBuilder(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        this.customDraweeHierarchyBuilder = genericDraweeHierarchyBuilder;
    }

    public void setCustomImageRequestBuilder(ImageRequestBuilder imageRequestBuilder) {
        this.customImageRequestBuilder = imageRequestBuilder;
    }

    public void setDescriptionViewId(int n) {
        this.descriptionViewId = n;
    }

    public void setImageMargin(int n) {
        this.pager.setPageMargin(n);
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
    }

    public void setOverlayView(View view) {
        this.overlayView = view;
        if (view != null) {
            this.dismissContainer.addView(view);
        }
    }

    public void setPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.pager.removeOnPageChangeListener(this.pageChangeListener);
        this.pageChangeListener = onPageChangeListener;
        this.pager.addOnPageChangeListener(onPageChangeListener);
        onPageChangeListener.onPageSelected(this.pager.getCurrentItem());
    }

    public void setUrls(ImageViewer.DataSet<?> imageViewerAdapter, int n) {
        this.adapter = imageViewerAdapter = new ImageViewerAdapter(this.getContext(), imageViewerAdapter, this.customImageRequestBuilder, this.customDraweeHierarchyBuilder, this.isZoomingAllowed);
        this.pager.setAdapter((PagerAdapter)imageViewerAdapter);
        this.setStartPosition(n);
    }
}

