/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.ScaleGestureDetector
 *  android.view.ScaleGestureDetector$OnScaleGestureListener
 *  android.view.VelocityTracker
 *  android.view.ViewConfiguration
 *  androidx.core.view.MotionEventCompat
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 */
package me.relex.photodraweeview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.core.view.MotionEventCompat;
import me.relex.photodraweeview.OnScaleDragGestureListener;

public class ScaleDragDetector
implements ScaleGestureDetector.OnScaleGestureListener {
    private static final int INVALID_POINTER_ID = -1;
    private int mActivePointerId = -1;
    private int mActivePointerIndex = 0;
    private boolean mIsDragging;
    public float mLastTouchX;
    public float mLastTouchY;
    private final float mMinimumVelocity;
    private final ScaleGestureDetector mScaleDetector;
    private final OnScaleDragGestureListener mScaleDragGestureListener;
    private final float mTouchSlop;
    private VelocityTracker mVelocityTracker;

    public ScaleDragDetector(Context context, OnScaleDragGestureListener onScaleDragGestureListener) {
        this.mScaleDetector = new ScaleGestureDetector(context, (ScaleGestureDetector.OnScaleGestureListener)this);
        this.mScaleDragGestureListener = onScaleDragGestureListener;
        context = ViewConfiguration.get((Context)context);
        this.mMinimumVelocity = context.getScaledMinimumFlingVelocity();
        this.mTouchSlop = context.getScaledTouchSlop();
    }

    private float getActiveX(MotionEvent motionEvent) {
        try {
            float f7 = MotionEventCompat.getX((MotionEvent)motionEvent, (int)this.mActivePointerIndex);
            return f7;
        }
        catch (Exception exception) {
            return motionEvent.getX();
        }
    }

    private float getActiveY(MotionEvent motionEvent) {
        try {
            float f7 = MotionEventCompat.getY((MotionEvent)motionEvent, (int)this.mActivePointerIndex);
            return f7;
        }
        catch (Exception exception) {
            return motionEvent.getY();
        }
    }

    private void onTouchActivePointer(int n3, MotionEvent motionEvent) {
        int n7;
        int n8 = 0;
        if (n3 != 0) {
            n7 = 1;
            if (n3 != 1 && n3 != 3) {
                if (n3 == 6 && MotionEventCompat.getPointerId((MotionEvent)motionEvent, (int)(n3 = MotionEventCompat.getActionIndex((MotionEvent)motionEvent))) == this.mActivePointerId) {
                    n3 = n3 == 0 ? n7 : 0;
                    this.mActivePointerId = MotionEventCompat.getPointerId((MotionEvent)motionEvent, (int)n3);
                    this.mLastTouchX = MotionEventCompat.getX((MotionEvent)motionEvent, (int)n3);
                    this.mLastTouchY = MotionEventCompat.getY((MotionEvent)motionEvent, (int)n3);
                }
            } else {
                this.mActivePointerId = -1;
            }
        } else {
            this.mActivePointerId = motionEvent.getPointerId(0);
        }
        n7 = this.mActivePointerId;
        n3 = n8;
        if (n7 != -1) {
            n3 = n7;
        }
        this.mActivePointerIndex = MotionEventCompat.findPointerIndex((MotionEvent)motionEvent, (int)n3);
    }

    private void onTouchDragEvent(int n3, MotionEvent motionEvent) {
        boolean bl = false;
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 == 3 && (motionEvent = this.mVelocityTracker) != null) {
                        motionEvent.recycle();
                        this.mVelocityTracker = null;
                    }
                } else {
                    float f7 = this.getActiveX(motionEvent);
                    float f9 = this.getActiveY(motionEvent);
                    float f10 = f7 - this.mLastTouchX;
                    float f11 = f9 - this.mLastTouchY;
                    if (!this.mIsDragging) {
                        if (Math.sqrt((double)(f11 * f11 + f10 * f10)) >= (double)this.mTouchSlop) {
                            bl = true;
                        }
                        this.mIsDragging = bl;
                    }
                    if (this.mIsDragging) {
                        this.mScaleDragGestureListener.onDrag(f10, f11);
                        this.mLastTouchX = f7;
                        this.mLastTouchY = f9;
                        VelocityTracker velocityTracker = this.mVelocityTracker;
                        if (velocityTracker != null) {
                            velocityTracker.addMovement(motionEvent);
                        }
                    }
                }
            } else {
                if (this.mIsDragging && this.mVelocityTracker != null) {
                    this.mLastTouchX = this.getActiveX(motionEvent);
                    this.mLastTouchY = this.getActiveY(motionEvent);
                    this.mVelocityTracker.addMovement(motionEvent);
                    this.mVelocityTracker.computeCurrentVelocity(1000);
                    float f12 = this.mVelocityTracker.getXVelocity();
                    float f13 = this.mVelocityTracker.getYVelocity();
                    if (Math.max((float)Math.abs((float)f12), (float)Math.abs((float)f13)) >= this.mMinimumVelocity) {
                        this.mScaleDragGestureListener.onFling(this.mLastTouchX, this.mLastTouchY, -f12, -f13);
                    }
                }
                if ((motionEvent = this.mVelocityTracker) != null) {
                    motionEvent.recycle();
                    this.mVelocityTracker = null;
                }
            }
        } else {
            VelocityTracker velocityTracker;
            this.mVelocityTracker = velocityTracker = VelocityTracker.obtain();
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            this.mLastTouchX = this.getActiveX(motionEvent);
            this.mLastTouchY = this.getActiveY(motionEvent);
            this.mIsDragging = false;
        }
    }

    public boolean isDragging() {
        return this.mIsDragging;
    }

    public boolean isScaling() {
        return this.mScaleDetector.isInProgress();
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float f7 = scaleGestureDetector.getScaleFactor();
        if (!Float.isNaN((float)f7) && !Float.isInfinite((float)f7)) {
            this.mScaleDragGestureListener.onScale(f7, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }
        return false;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.mScaleDragGestureListener.onScaleEnd();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.mScaleDetector.onTouchEvent(motionEvent);
        int n3 = MotionEventCompat.getActionMasked((MotionEvent)motionEvent);
        this.onTouchActivePointer(n3, motionEvent);
        this.onTouchDragEvent(n3, motionEvent);
        return true;
    }
}

