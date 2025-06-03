package com.devbrackets.android.exomedia.core.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.core.video.scale.MatrixManager;
import com.devbrackets.android.exomedia.core.video.scale.ScaleType;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class ResizingSurfaceView
  extends SurfaceView
  implements ClearableSurface
{
  private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
  private static final int[] GL_CLEAR_CONFIG_ATTRIBUTES = { 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344 };
  private static final int[] GL_CLEAR_CONTEXT_ATTRIBUTES = { 12440, 2, 12344 };
  public static final int MAX_DEGREES = 360;
  private static final String TAG = "ResizingSurfaceView";
  @NonNull
  public AttachedListener attachedListener = new AttachedListener(null);
  @NonNull
  public GlobalLayoutMatrixListener globalLayoutMatrixListener = new GlobalLayoutMatrixListener(null);
  @NonNull
  public final ReentrantLock globalLayoutMatrixListenerLock = new ReentrantLock(true);
  @NonNull
  public Point lastNotifiedSize = new Point(0, 0);
  @NonNull
  public MatrixManager matrixManager = new MatrixManager();
  public boolean measureBasedOnAspectRatio = true;
  @Nullable
  public OnSizeChangeListener onSizeChangeListener;
  @IntRange(from=0L, to=359L)
  public int requestedConfigurationRotation = 0;
  @IntRange(from=0L, to=359L)
  public int requestedUserRotation = 0;
  @NonNull
  public Point videoSize = new Point(0, 0);
  
  public ResizingSurfaceView(Context paramContext)
  {
    super(paramContext);
  }
  
  public ResizingSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ResizingSurfaceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  @TargetApi(21)
  public ResizingSurfaceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public void clearSurface()
  {
    try
    {
      EGL10 localEGL10 = (EGL10)EGLContext.getEGL();
      EGLDisplay localEGLDisplay = localEGL10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
      localEGL10.eglInitialize(localEGLDisplay, null);
      Object localObject = new EGLConfig[1];
      localEGL10.eglChooseConfig(localEGLDisplay, GL_CLEAR_CONFIG_ATTRIBUTES, (EGLConfig[])localObject, 1, new int[1]);
      EGLContext localEGLContext = localEGL10.eglCreateContext(localEGLDisplay, localObject[0], EGL10.EGL_NO_CONTEXT, GL_CLEAR_CONTEXT_ATTRIBUTES);
      localObject = localEGL10.eglCreateWindowSurface(localEGLDisplay, localObject[0], this, new int[] { 12344 });
      localEGL10.eglMakeCurrent(localEGLDisplay, (EGLSurface)localObject, (EGLSurface)localObject, localEGLContext);
      localEGL10.eglSwapBuffers(localEGLDisplay, (EGLSurface)localObject);
      localEGL10.eglDestroySurface(localEGLDisplay, (EGLSurface)localObject);
      localObject = EGL10.EGL_NO_SURFACE;
      localEGL10.eglMakeCurrent(localEGLDisplay, (EGLSurface)localObject, (EGLSurface)localObject, EGL10.EGL_NO_CONTEXT);
      localEGL10.eglDestroyContext(localEGLDisplay, localEGLContext);
      localEGL10.eglTerminate(localEGLDisplay);
    }
    catch (Exception localException)
    {
      Log.e("ResizingSurfaceView", "Error clearing surface", localException);
    }
  }
  
  @NonNull
  public ScaleType getScaleType()
  {
    return matrixManager.getCurrentScaleType();
  }
  
  public void notifyOnSizeChangeListener(int paramInt1, int paramInt2)
  {
    Object localObject = lastNotifiedSize;
    if ((x == paramInt1) && (y == paramInt2)) {
      return;
    }
    x = paramInt1;
    y = paramInt2;
    updateMatrixOnLayout();
    localObject = onSizeChangeListener;
    if (localObject != null) {
      ((OnSizeChangeListener)localObject).onVideoSurfaceSizeChange(paramInt1, paramInt2);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    updateMatrixOnLayout();
    super.onConfigurationChanged(paramConfiguration);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (!measureBasedOnAspectRatio)
    {
      super.onMeasure(paramInt1, paramInt2);
      notifyOnSizeChangeListener(getMeasuredWidth(), getMeasuredHeight());
      return;
    }
    int i = View.getDefaultSize(videoSize.x, paramInt1);
    int j = View.getDefaultSize(videoSize.y, paramInt2);
    Point localPoint = videoSize;
    if ((x > 0) && (y > 0))
    {
      int k = View.MeasureSpec.getMode(paramInt1);
      j = View.MeasureSpec.getSize(paramInt1);
      int m = View.MeasureSpec.getMode(paramInt2);
      i = View.MeasureSpec.getSize(paramInt2);
      int n;
      int i1;
      if ((k == 1073741824) && (m == 1073741824))
      {
        localPoint = videoSize;
        n = x;
        i1 = y;
        if (n * i < j * i1)
        {
          paramInt2 = n * i / i1;
          paramInt1 = i;
        }
        else
        {
          paramInt2 = j;
          paramInt1 = i;
          if (n * i > j * i1)
          {
            paramInt1 = i1 * j / n;
            paramInt2 = j;
          }
        }
      }
      else if (k == 1073741824)
      {
        localPoint = videoSize;
        paramInt1 = y * j / x;
        if ((m == Integer.MIN_VALUE) && (paramInt1 > i))
        {
          paramInt2 = j;
          paramInt1 = i;
        }
        else
        {
          paramInt2 = j;
        }
      }
      else if (m == 1073741824)
      {
        localPoint = videoSize;
        paramInt2 = x * i / y;
        if ((k == Integer.MIN_VALUE) && (paramInt2 > j))
        {
          paramInt2 = j;
          paramInt1 = i;
        }
        else
        {
          paramInt1 = i;
        }
      }
      else
      {
        localPoint = videoSize;
        i1 = x;
        n = y;
        if ((m == Integer.MIN_VALUE) && (n > i))
        {
          paramInt2 = i * i1 / n;
          paramInt1 = i;
        }
        else
        {
          paramInt1 = n;
          paramInt2 = i1;
        }
        if ((k == Integer.MIN_VALUE) && (paramInt2 > j))
        {
          paramInt1 = n * j / i1;
          paramInt2 = j;
        }
      }
      setMeasuredDimension(paramInt2, paramInt1);
      notifyOnSizeChangeListener(paramInt2, paramInt1);
      return;
    }
    setMeasuredDimension(i, j);
    notifyOnSizeChangeListener(i, j);
  }
  
  public void setMeasureBasedOnAspectRatioEnabled(boolean paramBoolean)
  {
    measureBasedOnAspectRatio = paramBoolean;
    requestLayout();
  }
  
  public void setOnSizeChangeListener(@Nullable OnSizeChangeListener paramOnSizeChangeListener)
  {
    onSizeChangeListener = paramOnSizeChangeListener;
  }
  
  public void setScaleType(@NonNull ScaleType paramScaleType)
  {
    matrixManager.scale(this, paramScaleType);
  }
  
  public void setVideoRotation(@IntRange(from=0L, to=359L) int paramInt1, @IntRange(from=0L, to=359L) int paramInt2)
  {
    requestedUserRotation = paramInt1;
    requestedConfigurationRotation = paramInt2;
    matrixManager.rotate(this, (paramInt1 + paramInt2) % 360);
  }
  
  public void setVideoRotation(@IntRange(from=0L, to=359L) int paramInt, boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = paramInt;
    } else {
      i = requestedUserRotation;
    }
    if (paramBoolean) {
      paramInt = requestedConfigurationRotation;
    }
    setVideoRotation(i, paramInt);
  }
  
  public void updateMatrixOnLayout()
  {
    globalLayoutMatrixListenerLock.lock();
    if (getWindowToken() == null) {
      addOnAttachStateChangeListener(attachedListener);
    } else {
      getViewTreeObserver().addOnGlobalLayoutListener(globalLayoutMatrixListener);
    }
    globalLayoutMatrixListenerLock.unlock();
  }
  
  public boolean updateVideoSize(int paramInt1, int paramInt2)
  {
    matrixManager.setIntrinsicVideoSize(paramInt1, paramInt2);
    updateMatrixOnLayout();
    Point localPoint = videoSize;
    x = paramInt1;
    y = paramInt2;
    boolean bool;
    if ((paramInt1 != 0) && (paramInt2 != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public class AttachedListener
    implements View.OnAttachStateChangeListener
  {
    private AttachedListener() {}
    
    public void onViewAttachedToWindow(View paramView)
    {
      globalLayoutMatrixListenerLock.lock();
      getViewTreeObserver().addOnGlobalLayoutListener(globalLayoutMatrixListener);
      removeOnAttachStateChangeListener(this);
      globalLayoutMatrixListenerLock.unlock();
    }
    
    public void onViewDetachedFromWindow(View paramView) {}
  }
  
  public class GlobalLayoutMatrixListener
    implements ViewTreeObserver.OnGlobalLayoutListener
  {
    private GlobalLayoutMatrixListener() {}
    
    public void onGlobalLayout()
    {
      ResizingSurfaceView localResizingSurfaceView = ResizingSurfaceView.this;
      localResizingSurfaceView.setScaleType(matrixManager.getCurrentScaleType());
      getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
  }
  
  public static abstract interface OnSizeChangeListener
  {
    public abstract void onVideoSurfaceSizeChange(int paramInt1, int paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.ResizingSurfaceView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */