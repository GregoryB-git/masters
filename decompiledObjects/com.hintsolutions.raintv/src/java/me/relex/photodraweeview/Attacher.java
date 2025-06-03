/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Matrix
 *  android.graphics.RectF
 *  android.view.GestureDetector$OnDoubleTapListener
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnLongClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewParent
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.view.animation.Interpolator
 *  androidx.annotation.Nullable
 *  androidx.core.view.GestureDetectorCompat
 *  androidx.core.view.MotionEventCompat
 *  androidx.core.widget.ScrollerCompat
 *  com.facebook.drawee.drawable.ScalingUtils$ScaleType
 *  com.facebook.drawee.generic.GenericDraweeHierarchy
 *  com.facebook.drawee.view.DraweeView
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.System
 *  java.lang.ref.WeakReference
 */
package me.relex.photodraweeview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.widget.ScrollerCompat;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.DraweeView;
import java.lang.ref.WeakReference;
import me.relex.photodraweeview.DefaultOnDoubleTapListener;
import me.relex.photodraweeview.IAttacher;
import me.relex.photodraweeview.OnPhotoTapListener;
import me.relex.photodraweeview.OnScaleChangeListener;
import me.relex.photodraweeview.OnScaleDragGestureListener;
import me.relex.photodraweeview.OnViewTapListener;
import me.relex.photodraweeview.ScaleDragDetector;

public class Attacher
implements IAttacher,
View.OnTouchListener,
OnScaleDragGestureListener {
    private static final int EDGE_BOTH = 2;
    private static final int EDGE_LEFT = 0;
    private static final int EDGE_NONE = -1;
    private static final int EDGE_RIGHT = 1;
    private boolean mAllowParentInterceptOnEdge = true;
    private boolean mBlockParentIntercept = false;
    private FlingRunnable mCurrentFlingRunnable;
    private final RectF mDisplayRect;
    private WeakReference<DraweeView<GenericDraweeHierarchy>> mDraweeView;
    private GestureDetectorCompat mGestureDetector;
    private int mImageInfoHeight = -1;
    private int mImageInfoWidth = -1;
    private View.OnLongClickListener mLongClickListener;
    private final Matrix mMatrix;
    private final float[] mMatrixValues = new float[9];
    private float mMaxScale = 3.0f;
    private float mMidScale = 1.75f;
    private float mMinScale = 1.0f;
    private OnPhotoTapListener mPhotoTapListener;
    private OnScaleChangeListener mScaleChangeListener;
    private ScaleDragDetector mScaleDragDetector;
    private int mScrollEdge = 2;
    private OnViewTapListener mViewTapListener;
    private long mZoomDuration = 200L;
    private final Interpolator mZoomInterpolator;

    public Attacher(DraweeView<GenericDraweeHierarchy> gestureDetectorCompat) {
        this.mDisplayRect = new RectF();
        this.mZoomInterpolator = new AccelerateDecelerateInterpolator();
        this.mMatrix = new Matrix();
        this.mDraweeView = new WeakReference(gestureDetectorCompat);
        ((GenericDraweeHierarchy)gestureDetectorCompat.getHierarchy()).setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER);
        gestureDetectorCompat.setOnTouchListener((View.OnTouchListener)this);
        this.mScaleDragDetector = new ScaleDragDetector(gestureDetectorCompat.getContext(), this);
        this.mGestureDetector = gestureDetectorCompat = new GestureDetectorCompat(gestureDetectorCompat.getContext(), (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener(this){
            public final Attacher this$0;
            {
                this.this$0 = attacher;
            }

            public void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                if (Attacher.access$000(this.this$0) != null) {
                    Attacher.access$000(this.this$0).onLongClick(this.this$0.getDraweeView());
                }
            }
        });
        gestureDetectorCompat.setOnDoubleTapListener((GestureDetector.OnDoubleTapListener)new DefaultOnDoubleTapListener(this));
    }

    public static /* synthetic */ View.OnLongClickListener access$000(Attacher attacher) {
        return attacher.mLongClickListener;
    }

    private void cancelFling() {
        FlingRunnable flingRunnable = this.mCurrentFlingRunnable;
        if (flingRunnable != null) {
            flingRunnable.cancelFling();
            this.mCurrentFlingRunnable = null;
        }
    }

    private void checkMinScale() {
        RectF rectF;
        DraweeView<GenericDraweeHierarchy> draweeView = this.getDraweeView();
        if (draweeView == null) {
            return;
        }
        if (this.getScale() < this.mMinScale && (rectF = this.getDisplayRect()) != null) {
            draweeView.post(new Runnable(this, this.getScale(), this.mMinScale, rectF.centerX(), rectF.centerY()){
                private final float mFocalX;
                private final float mFocalY;
                private final long mStartTime;
                private final float mZoomEnd;
                private final float mZoomStart;
                public final Attacher this$0;
                {
                    this.this$0 = attacher;
                    this.mFocalX = f10;
                    this.mFocalY = f11;
                    this.mStartTime = System.currentTimeMillis();
                    this.mZoomStart = f3;
                    this.mZoomEnd = f6;
                }

                private float interpolate() {
                    float f3 = Math.min((float)1.0f, (float)((float)(System.currentTimeMillis() - this.mStartTime) * 1.0f / (float)this.this$0.mZoomDuration));
                    return this.this$0.mZoomInterpolator.getInterpolation(f3);
                }

                public void run() {
                    DraweeView<GenericDraweeHierarchy> draweeView = this.this$0.getDraweeView();
                    if (draweeView == null) {
                        return;
                    }
                    float f3 = this.interpolate();
                    float f6 = this.mZoomStart;
                    f6 = a.a(this.mZoomEnd, f6, f3, f6) / this.this$0.getScale();
                    this.this$0.onScale(f6, this.mFocalX, this.mFocalY);
                    if (f3 < 1.0f) {
                        this.this$0.postOnAnimation(draweeView, this);
                    }
                }
            });
        }
    }

    private static void checkZoomLevels(float f3, float f6, float f10) {
        if (!(f3 >= f6)) {
            if (!(f6 >= f10)) {
                return;
            }
            throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
        }
        throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
    }

    private RectF getDisplayRect(Matrix matrix) {
        int n2;
        DraweeView<GenericDraweeHierarchy> draweeView = this.getDraweeView();
        if (draweeView != null && ((n2 = this.mImageInfoWidth) != -1 || this.mImageInfoHeight != -1)) {
            this.mDisplayRect.set(0.0f, 0.0f, (float)n2, (float)this.mImageInfoHeight);
            ((GenericDraweeHierarchy)draweeView.getHierarchy()).getActualImageBounds(this.mDisplayRect);
            matrix.mapRect(this.mDisplayRect);
            return this.mDisplayRect;
        }
        return null;
    }

    private float getMatrixValue(Matrix matrix, int n2) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[n2];
    }

    private int getViewHeight() {
        DraweeView<GenericDraweeHierarchy> draweeView = this.getDraweeView();
        if (draweeView != null) {
            return draweeView.getHeight() - draweeView.getPaddingTop() - draweeView.getPaddingBottom();
        }
        return 0;
    }

    private int getViewWidth() {
        DraweeView<GenericDraweeHierarchy> draweeView = this.getDraweeView();
        if (draweeView != null) {
            return draweeView.getWidth() - draweeView.getPaddingLeft() - draweeView.getPaddingRight();
        }
        return 0;
    }

    private void postOnAnimation(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    private void resetMatrix() {
        this.mMatrix.reset();
        this.checkMatrixBounds();
        DraweeView<GenericDraweeHierarchy> draweeView = this.getDraweeView();
        if (draweeView != null) {
            draweeView.invalidate();
        }
    }

    private void updateBaseMatrix() {
        if (this.mImageInfoWidth == -1 && this.mImageInfoHeight == -1) {
            return;
        }
        this.resetMatrix();
    }

    public void checkMatrixAndInvalidate() {
        DraweeView<GenericDraweeHierarchy> draweeView = this.getDraweeView();
        if (draweeView == null) {
            return;
        }
        if (this.checkMatrixBounds()) {
            draweeView.invalidate();
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean checkMatrixBounds() {
        var5_1 = this.getDisplayRect(this.getDrawMatrix());
        if (var5_1 == null) {
            return false;
        }
        var1_2 = var5_1.height();
        var4_3 = var5_1.width();
        var2_4 = this.getViewHeight();
        var3_5 = 0.0f;
        if (var1_2 <= var2_4) {
            var2_4 = (var2_4 - var1_2) / 2.0f;
            var1_2 = var5_1.top;
            while (true) {
                var2_4 -= var1_2;
                break;
            }
        } else {
            var1_2 = var5_1.top;
            if (var1_2 > 0.0f) {
                var2_4 = -var1_2;
            } else {
                if ((var1_2 = var5_1.bottom) < var2_4) ** continue;
                var2_4 = 0.0f;
            }
        }
        var1_2 = this.getViewWidth();
        if (var4_3 <= var1_2) {
            var1_2 = (var1_2 - var4_3) / 2.0f - var5_1.left;
            this.mScrollEdge = 2;
        } else {
            var4_3 = var5_1.left;
            if (var4_3 > 0.0f) {
                var1_2 = -var4_3;
                this.mScrollEdge = 0;
            } else {
                var4_3 = var5_1.right;
                if (var4_3 < var1_2) {
                    var1_2 -= var4_3;
                    this.mScrollEdge = 1;
                } else {
                    this.mScrollEdge = -1;
                    var1_2 = var3_5;
                }
            }
        }
        this.mMatrix.postTranslate(var1_2, var2_4);
        return true;
    }

    public RectF getDisplayRect() {
        this.checkMatrixBounds();
        return this.getDisplayRect(this.getDrawMatrix());
    }

    public Matrix getDrawMatrix() {
        return this.mMatrix;
    }

    @Nullable
    public DraweeView<GenericDraweeHierarchy> getDraweeView() {
        return (DraweeView)this.mDraweeView.get();
    }

    @Override
    public float getMaximumScale() {
        return this.mMaxScale;
    }

    @Override
    public float getMediumScale() {
        return this.mMidScale;
    }

    @Override
    public float getMinimumScale() {
        return this.mMinScale;
    }

    @Override
    public OnPhotoTapListener getOnPhotoTapListener() {
        return this.mPhotoTapListener;
    }

    @Override
    public OnViewTapListener getOnViewTapListener() {
        return this.mViewTapListener;
    }

    @Override
    public float getScale() {
        return (float)Math.sqrt((double)((float)Math.pow((double)this.getMatrixValue(this.mMatrix, 0), (double)2.0) + (float)Math.pow((double)this.getMatrixValue(this.mMatrix, 3), (double)2.0)));
    }

    public void onDetachedFromWindow() {
        this.cancelFling();
    }

    @Override
    public void onDrag(float f3, float f6) {
        ViewParent viewParent = this.getDraweeView();
        if (viewParent != null && !this.mScaleDragDetector.isScaling()) {
            this.mMatrix.postTranslate(f3, f6);
            this.checkMatrixAndInvalidate();
            viewParent = viewParent.getParent();
            if (viewParent == null) {
                return;
            }
            if (this.mAllowParentInterceptOnEdge && !this.mScaleDragDetector.isScaling() && !this.mBlockParentIntercept) {
                int n2 = this.mScrollEdge;
                if (n2 == 2 || n2 == 0 && f3 >= 1.0f || n2 == 1 && f3 <= -1.0f) {
                    viewParent.requestDisallowInterceptTouchEvent(false);
                }
            } else {
                viewParent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    @Override
    public void onFling(float f3, float f6, float f10, float f11) {
        DraweeView<GenericDraweeHierarchy> draweeView = this.getDraweeView();
        if (draweeView == null) {
            return;
        }
        Runnable runnable = new Runnable(this, draweeView.getContext()){
            private int mCurrentX;
            private int mCurrentY;
            private final ScrollerCompat mScroller;
            public final Attacher this$0;
            {
                this.this$0 = attacher;
                this.mScroller = ScrollerCompat.create((Context)context);
            }

            public void cancelFling() {
                this.mScroller.abortAnimation();
            }

            public void fling(int n2, int n6, int n9, int n10) {
                int n11;
                int n12;
                RectF rectF = this.this$0.getDisplayRect();
                if (rectF == null) {
                    return;
                }
                int n13 = Math.round((float)(-rectF.left));
                float f3 = n2;
                if (f3 < rectF.width()) {
                    n12 = Math.round((float)(rectF.width() - f3));
                    n11 = 0;
                } else {
                    n12 = n2 = n13;
                    n11 = n2;
                }
                int n14 = Math.round((float)(-rectF.top));
                f3 = n6;
                if (f3 < rectF.height()) {
                    n6 = Math.round((float)(rectF.height() - f3));
                    n2 = 0;
                } else {
                    n6 = n2 = n14;
                }
                this.mCurrentX = n13;
                this.mCurrentY = n14;
                if (n13 != n12 || n14 != n6) {
                    this.mScroller.fling(n13, n14, n9, n10, n11, n12, n2, n6, 0, 0);
                }
            }

            public void run() {
                if (this.mScroller.isFinished()) {
                    return;
                }
                DraweeView<GenericDraweeHierarchy> draweeView = this.this$0.getDraweeView();
                if (draweeView != null && this.mScroller.computeScrollOffset()) {
                    int n2 = this.mScroller.getCurrX();
                    int n6 = this.mScroller.getCurrY();
                    this.this$0.mMatrix.postTranslate((float)(this.mCurrentX - n2), (float)(this.mCurrentY - n6));
                    draweeView.invalidate();
                    this.mCurrentX = n2;
                    this.mCurrentY = n6;
                    this.this$0.postOnAnimation(draweeView, this);
                }
            }
        };
        this.mCurrentFlingRunnable = runnable;
        runnable.fling(this.getViewWidth(), this.getViewHeight(), (int)f10, (int)f11);
        draweeView.post((Runnable)this.mCurrentFlingRunnable);
    }

    @Override
    public void onScale(float f3, float f6, float f10) {
        if (this.getScale() < this.mMaxScale || f3 < 1.0f) {
            OnScaleChangeListener onScaleChangeListener = this.mScaleChangeListener;
            if (onScaleChangeListener != null) {
                onScaleChangeListener.onScaleChange(f3, f6, f10);
            }
            this.mMatrix.postScale(f3, f3, f6, f10);
            this.checkMatrixAndInvalidate();
        }
    }

    @Override
    public void onScaleEnd() {
        this.checkMinScale();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int n2 = MotionEventCompat.getActionMasked((MotionEvent)motionEvent);
        boolean bl2 = false;
        boolean bl3 = true;
        if (n2 != 0) {
            if ((n2 == 1 || n2 == 3) && (view = view.getParent()) != null) {
                view.requestDisallowInterceptTouchEvent(false);
            }
        } else {
            if ((view = view.getParent()) != null) {
                view.requestDisallowInterceptTouchEvent(true);
            }
            this.cancelFling();
        }
        boolean bl4 = this.mScaleDragDetector.isScaling();
        boolean bl5 = this.mScaleDragDetector.isDragging();
        boolean bl6 = this.mScaleDragDetector.onTouchEvent(motionEvent);
        n2 = !bl4 && !this.mScaleDragDetector.isScaling() ? 1 : 0;
        boolean bl7 = !bl5 && !this.mScaleDragDetector.isDragging();
        bl4 = bl2;
        if (n2 != 0) {
            bl4 = bl2;
            if (bl7) {
                bl4 = true;
            }
        }
        this.mBlockParentIntercept = bl4;
        bl4 = this.mGestureDetector.onTouchEvent(motionEvent) ? bl3 : bl6;
        return bl4;
    }

    @Override
    public void setAllowParentInterceptOnEdge(boolean bl2) {
        this.mAllowParentInterceptOnEdge = bl2;
    }

    @Override
    public void setMaximumScale(float f3) {
        Attacher.checkZoomLevels(this.mMinScale, this.mMidScale, f3);
        this.mMaxScale = f3;
    }

    @Override
    public void setMediumScale(float f3) {
        Attacher.checkZoomLevels(this.mMinScale, f3, this.mMaxScale);
        this.mMidScale = f3;
    }

    @Override
    public void setMinimumScale(float f3) {
        Attacher.checkZoomLevels(f3, this.mMidScale, this.mMaxScale);
        this.mMinScale = f3;
    }

    @Override
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.mGestureDetector.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.mGestureDetector.setOnDoubleTapListener((GestureDetector.OnDoubleTapListener)new DefaultOnDoubleTapListener(this));
        }
    }

    @Override
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mLongClickListener = onLongClickListener;
    }

    @Override
    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.mPhotoTapListener = onPhotoTapListener;
    }

    @Override
    public void setOnScaleChangeListener(OnScaleChangeListener onScaleChangeListener) {
        this.mScaleChangeListener = onScaleChangeListener;
    }

    @Override
    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
        this.mViewTapListener = onViewTapListener;
    }

    @Override
    public void setScale(float f3) {
        this.setScale(f3, false);
    }

    @Override
    public void setScale(float f3, float f6, float f10, boolean bl2) {
        DraweeView<GenericDraweeHierarchy> draweeView = this.getDraweeView();
        if (draweeView != null && !(f3 < this.mMinScale) && !(f3 > this.mMaxScale)) {
            if (bl2) {
                draweeView.post(new /* invalid duplicate definition of identical inner class */);
            } else {
                this.mMatrix.setScale(f3, f3, f6, f10);
                this.checkMatrixAndInvalidate();
            }
        }
    }

    @Override
    public void setScale(float f3, boolean bl2) {
        DraweeView<GenericDraweeHierarchy> draweeView = this.getDraweeView();
        if (draweeView != null) {
            this.setScale(f3, draweeView.getRight() / 2, draweeView.getBottom() / 2, false);
        }
    }

    @Override
    public void setZoomTransitionDuration(long l6) {
        long l9 = l6;
        if (l6 < 0L) {
            l9 = 200L;
        }
        this.mZoomDuration = l9;
    }

    @Override
    public void update(int n2, int n6) {
        this.mImageInfoWidth = n2;
        this.mImageInfoHeight = n6;
        this.updateBaseMatrix();
    }
}

