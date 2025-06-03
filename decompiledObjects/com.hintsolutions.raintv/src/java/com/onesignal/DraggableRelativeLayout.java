/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  androidx.core.view.ViewCompat
 *  androidx.customview.widget.ViewDragHelper
 *  androidx.customview.widget.ViewDragHelper$Callback
 *  com.onesignal.DraggableRelativeLayout$1
 *  java.lang.Object
 */
package com.onesignal;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.onesignal.DraggableRelativeLayout;
import com.onesignal.OSViewUtils;

class DraggableRelativeLayout
extends RelativeLayout {
    private static final int EXTRA_PX_DISMISS;
    private static final int MARGIN_PX_SIZE;
    private boolean dismissing;
    private boolean draggingDisabled;
    private ViewDragHelper mDragHelper;
    private DraggableListener mListener;
    private Params params;

    static {
        MARGIN_PX_SIZE = OSViewUtils.dpToPx(28);
        EXTRA_PX_DISMISS = OSViewUtils.dpToPx(64);
    }

    public DraggableRelativeLayout(Context context) {
        super(context);
        this.setClipChildren(false);
        this.createDragHelper();
    }

    public static /* synthetic */ Params access$300(DraggableRelativeLayout draggableRelativeLayout) {
        return draggableRelativeLayout.params;
    }

    public static /* synthetic */ DraggableListener access$400(DraggableRelativeLayout draggableRelativeLayout) {
        return draggableRelativeLayout.mListener;
    }

    public static /* synthetic */ boolean access$500(DraggableRelativeLayout draggableRelativeLayout) {
        return draggableRelativeLayout.dismissing;
    }

    public static /* synthetic */ boolean access$502(DraggableRelativeLayout draggableRelativeLayout, boolean bl) {
        draggableRelativeLayout.dismissing = bl;
        return bl;
    }

    public static /* synthetic */ ViewDragHelper access$600(DraggableRelativeLayout draggableRelativeLayout) {
        return draggableRelativeLayout.mDragHelper;
    }

    private void createDragHelper() {
        this.mDragHelper = ViewDragHelper.create((ViewGroup)this, (float)1.0f, (ViewDragHelper.Callback)new 1(this));
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.mDragHelper.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation((View)this);
        }
    }

    public void dismiss() {
        this.dismissing = true;
        this.mDragHelper.smoothSlideViewTo((View)this, this.getLeft(), this.params.offScreenYPos);
        ViewCompat.postInvalidateOnAnimation((View)this);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        DraggableListener draggableListener;
        if (this.dismissing) {
            return true;
        }
        int n = motionEvent.getAction();
        if ((n == 0 || n == 5) && (draggableListener = this.mListener) != null) {
            draggableListener.onDragEnd();
        }
        this.mDragHelper.processTouchEvent(motionEvent);
        return false;
    }

    public void setListener(DraggableListener draggableListener) {
        this.mListener = draggableListener;
    }

    public void setParams(Params params) {
        this.params = params;
        int n = params.messageHeight;
        int n2 = params.posY;
        Params.access$002(params, Resources.getSystem().getDisplayMetrics().heightPixels - params.messageHeight - params.posY + (n + n2) + EXTRA_PX_DISMISS);
        Params.access$102(params, OSViewUtils.dpToPx(3000));
        if (params.dragDirection == 0) {
            Params.access$002(params, -params.messageHeight - MARGIN_PX_SIZE);
            Params.access$102(params, -params.dismissingYVelocity);
            Params.access$202(params, params.offScreenYPos / 3);
        } else {
            n2 = params.messageHeight / 3;
            Params.access$202(params, params.maxYPos * 2 + n2);
        }
    }

    public static interface DraggableListener {
        public void onDismiss();

        public void onDragEnd();

        public void onDragStart();
    }

    public static class Params {
        public static final int DRAGGABLE_DIRECTION_DOWN = 1;
        public static final int DRAGGABLE_DIRECTION_UP = 0;
        private int dismissingYPos;
        private int dismissingYVelocity;
        public int dragDirection;
        public int dragThresholdY;
        public boolean draggingDisabled;
        public int height;
        public int maxXPos;
        public int maxYPos;
        public int messageHeight;
        private int offScreenYPos;
        public int posY;

        public static /* synthetic */ int access$002(Params params, int n) {
            params.offScreenYPos = n;
            return n;
        }

        public static /* synthetic */ int access$102(Params params, int n) {
            params.dismissingYVelocity = n;
            return n;
        }

        public static /* synthetic */ int access$200(Params params) {
            return params.dismissingYPos;
        }

        public static /* synthetic */ int access$202(Params params, int n) {
            params.dismissingYPos = n;
            return n;
        }
    }
}

