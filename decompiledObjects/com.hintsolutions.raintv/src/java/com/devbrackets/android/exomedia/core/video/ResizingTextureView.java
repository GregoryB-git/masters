/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Point
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.TextureView
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  androidx.annotation.IntRange
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.locks.ReentrantLock
 *  javax.microedition.khronos.egl.EGL10
 *  javax.microedition.khronos.egl.EGLConfig
 *  javax.microedition.khronos.egl.EGLContext
 *  javax.microedition.khronos.egl.EGLDisplay
 *  javax.microedition.khronos.egl.EGLSurface
 */
package com.devbrackets.android.exomedia.core.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.core.video.ClearableSurface;
import com.devbrackets.android.exomedia.core.video.scale.MatrixManager;
import com.devbrackets.android.exomedia.core.video.scale.ScaleType;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class ResizingTextureView
extends TextureView
implements ClearableSurface {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int[] GL_CLEAR_CONFIG_ATTRIBUTES = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344};
    private static final int[] GL_CLEAR_CONTEXT_ATTRIBUTES = new int[]{12440, 2, 12344};
    public static final int MAX_DEGREES = 360;
    private static final String TAG = "ResizingTextureView";
    @NonNull
    public AttachedListener attachedListener;
    @NonNull
    public GlobalLayoutMatrixListener globalLayoutMatrixListener;
    @NonNull
    public final ReentrantLock globalLayoutMatrixListenerLock;
    @NonNull
    public Point lastNotifiedSize = new Point(0, 0);
    @NonNull
    public MatrixManager matrixManager;
    public boolean measureBasedOnAspectRatio;
    @Nullable
    public OnSizeChangeListener onSizeChangeListener;
    @IntRange(from=0L, to=359L)
    public int requestedConfigurationRotation = 0;
    @IntRange(from=0L, to=359L)
    public int requestedUserRotation = 0;
    @NonNull
    public Point videoSize = new Point(0, 0);

    public ResizingTextureView(Context context) {
        super(context);
        this.matrixManager = new MatrixManager();
        this.attachedListener = new AttachedListener(this, null);
        this.globalLayoutMatrixListener = new GlobalLayoutMatrixListener(this, null);
        this.globalLayoutMatrixListenerLock = new ReentrantLock(true);
    }

    public ResizingTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.matrixManager = new MatrixManager();
        this.attachedListener = new AttachedListener(this, null);
        this.globalLayoutMatrixListener = new GlobalLayoutMatrixListener(this, null);
        this.globalLayoutMatrixListenerLock = new ReentrantLock(true);
    }

    public ResizingTextureView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.matrixManager = new MatrixManager();
        this.attachedListener = new AttachedListener(this, null);
        this.globalLayoutMatrixListener = new GlobalLayoutMatrixListener(this, null);
        this.globalLayoutMatrixListenerLock = new ReentrantLock(true);
    }

    @TargetApi(value=21)
    public ResizingTextureView(Context context, AttributeSet attributeSet, int n, int n2) {
        super(context, attributeSet, n, n2);
        this.matrixManager = new MatrixManager();
        this.attachedListener = new AttachedListener(this, null);
        this.globalLayoutMatrixListener = new GlobalLayoutMatrixListener(this, null);
        this.globalLayoutMatrixListenerLock = new ReentrantLock(true);
    }

    @Override
    public void clearSurface() {
        if (this.getSurfaceTexture() == null) {
            return;
        }
        try {
            EGL10 eGL10 = (EGL10)EGLContext.getEGL();
            EGLDisplay eGLDisplay = eGL10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            eGL10.eglInitialize(eGLDisplay, null);
            EGLSurface eGLSurface = new EGLConfig[1];
            eGL10.eglChooseConfig(eGLDisplay, GL_CLEAR_CONFIG_ATTRIBUTES, (EGLConfig[])eGLSurface, 1, new int[1]);
            EGLContext eGLContext = eGL10.eglCreateContext(eGLDisplay, eGLSurface[0], EGL10.EGL_NO_CONTEXT, GL_CLEAR_CONTEXT_ATTRIBUTES);
            eGLSurface = eGL10.eglCreateWindowSurface(eGLDisplay, eGLSurface[0], (Object)this.getSurfaceTexture(), new int[]{12344});
            eGL10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            eGL10.eglSwapBuffers(eGLDisplay, eGLSurface);
            eGL10.eglDestroySurface(eGLDisplay, eGLSurface);
            eGLSurface = EGL10.EGL_NO_SURFACE;
            eGL10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            eGL10.eglDestroyContext(eGLDisplay, eGLContext);
            eGL10.eglTerminate(eGLDisplay);
        }
        catch (Exception exception) {
            Log.e((String)TAG, (String)"Error clearing surface", (Throwable)exception);
        }
    }

    @NonNull
    public ScaleType getScaleType() {
        return this.matrixManager.getCurrentScaleType();
    }

    public void notifyOnSizeChangeListener(int n, int n2) {
        Object object = this.lastNotifiedSize;
        if (((Point)object).x == n && ((Point)object).y == n2) {
            return;
        }
        ((Point)object).x = n;
        ((Point)object).y = n2;
        this.updateMatrixOnLayout();
        object = this.onSizeChangeListener;
        if (object != null) {
            object.onVideoSurfaceSizeChange(n, n2);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.updateMatrixOnLayout();
        super.onConfigurationChanged(configuration);
    }

    public void onMeasure(int n, int n2) {
        if (!this.measureBasedOnAspectRatio) {
            super.onMeasure(n, n2);
            this.notifyOnSizeChangeListener(this.getMeasuredWidth(), this.getMeasuredHeight());
            return;
        }
        int n3 = View.getDefaultSize((int)this.videoSize.x, (int)n);
        int n4 = View.getDefaultSize((int)this.videoSize.y, (int)n2);
        Point point = this.videoSize;
        if (point.x > 0 && point.y > 0) {
            int n6 = View.MeasureSpec.getMode((int)n);
            n3 = View.MeasureSpec.getSize((int)n);
            int n7 = View.MeasureSpec.getMode((int)n2);
            n4 = View.MeasureSpec.getSize((int)n2);
            if (n6 == 0x40000000 && n7 == 0x40000000) {
                point = this.videoSize;
                int n8 = point.x;
                int n9 = point.y;
                if (n8 * n4 < n3 * n9) {
                    n2 = n8 * n4 / n9;
                    n = n4;
                } else {
                    n2 = n3;
                    n = n4;
                    if (n8 * n4 > n3 * n9) {
                        n = n9 * n3 / n8;
                        n2 = n3;
                    }
                }
            } else if (n6 == 0x40000000) {
                point = this.videoSize;
                n = point.y * n3 / point.x;
                if (n7 == Integer.MIN_VALUE && n > n4) {
                    n2 = n3;
                    n = n4;
                } else {
                    n2 = n3;
                }
            } else if (n7 == 0x40000000) {
                point = this.videoSize;
                n2 = point.x * n4 / point.y;
                if (n6 == Integer.MIN_VALUE && n2 > n3) {
                    n2 = n3;
                    n = n4;
                } else {
                    n = n4;
                }
            } else {
                point = this.videoSize;
                int n10 = point.x;
                int n11 = point.y;
                if (n7 == Integer.MIN_VALUE && n11 > n4) {
                    n2 = n4 * n10 / n11;
                    n = n4;
                } else {
                    n = n11;
                    n2 = n10;
                }
                if (n6 == Integer.MIN_VALUE && n2 > n3) {
                    n = n11 * n3 / n10;
                    n2 = n3;
                }
            }
            this.setMeasuredDimension(n2, n);
            this.notifyOnSizeChangeListener(n2, n);
            return;
        }
        this.setMeasuredDimension(n3, n4);
        this.notifyOnSizeChangeListener(n3, n4);
    }

    public void setMeasureBasedOnAspectRatioEnabled(boolean bl) {
        this.measureBasedOnAspectRatio = bl;
        this.requestLayout();
    }

    public void setOnSizeChangeListener(@Nullable OnSizeChangeListener onSizeChangeListener) {
        this.onSizeChangeListener = onSizeChangeListener;
    }

    public void setScaleType(@NonNull ScaleType scaleType) {
        this.matrixManager.scale((View)this, scaleType);
    }

    public void setVideoRotation(@IntRange(from=0L, to=359L) int n, @IntRange(from=0L, to=359L) int n2) {
        this.requestedUserRotation = n;
        this.requestedConfigurationRotation = n2;
        this.matrixManager.rotate((View)this, (n + n2) % 360);
    }

    public void setVideoRotation(@IntRange(from=0L, to=359L) int n, boolean bl) {
        int n2 = bl ? n : this.requestedUserRotation;
        if (bl) {
            n = this.requestedConfigurationRotation;
        }
        this.setVideoRotation(n2, n);
    }

    public void updateMatrixOnLayout() {
        this.globalLayoutMatrixListenerLock.lock();
        if (this.getWindowToken() == null) {
            this.addOnAttachStateChangeListener(this.attachedListener);
        } else {
            this.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this.globalLayoutMatrixListener);
        }
        this.globalLayoutMatrixListenerLock.unlock();
    }

    public boolean updateVideoSize(int n, int n2) {
        this.matrixManager.setIntrinsicVideoSize(n, n2);
        this.updateMatrixOnLayout();
        Point point = this.videoSize;
        point.x = n;
        point.y = n2;
        if (n != 0 && n2 != 0 && (point = this.getSurfaceTexture()) != null) {
            point.setDefaultBufferSize(n, n2);
            return true;
        }
        return false;
    }

    public class AttachedListener
    implements View.OnAttachStateChangeListener {
        public final ResizingTextureView this$0;

        private AttachedListener(ResizingTextureView resizingTextureView) {
            this.this$0 = resizingTextureView;
        }

        public /* synthetic */ AttachedListener(ResizingTextureView resizingTextureView, 1 var2_2) {
            this(resizingTextureView);
        }

        public void onViewAttachedToWindow(View view) {
            this.this$0.globalLayoutMatrixListenerLock.lock();
            this.this$0.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this.this$0.globalLayoutMatrixListener);
            this.this$0.removeOnAttachStateChangeListener(this);
            this.this$0.globalLayoutMatrixListenerLock.unlock();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public class GlobalLayoutMatrixListener
    implements ViewTreeObserver.OnGlobalLayoutListener {
        public final ResizingTextureView this$0;

        private GlobalLayoutMatrixListener(ResizingTextureView resizingTextureView) {
            this.this$0 = resizingTextureView;
        }

        public /* synthetic */ GlobalLayoutMatrixListener(ResizingTextureView resizingTextureView, 1 var2_2) {
            this(resizingTextureView);
        }

        public void onGlobalLayout() {
            ResizingTextureView resizingTextureView = this.this$0;
            resizingTextureView.setScaleType(resizingTextureView.matrixManager.getCurrentScaleType());
            this.this$0.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        }
    }

    public static interface OnSizeChangeListener {
        public void onVideoSurfaceSizeChange(int var1, int var2);
    }
}

