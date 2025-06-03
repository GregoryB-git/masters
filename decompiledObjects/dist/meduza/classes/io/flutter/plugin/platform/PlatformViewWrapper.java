package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import io.flutter.Log;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.util.ViewUtils;

public class PlatformViewWrapper
  extends FrameLayout
{
  private static final String TAG = "PlatformViewWrapper";
  private ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
  private int left;
  private int prevLeft;
  private int prevTop;
  private PlatformViewRenderTarget renderTarget;
  private int top;
  private AndroidTouchProcessor touchProcessor;
  
  public PlatformViewWrapper(Context paramContext)
  {
    super(paramContext);
    setWillNotDraw(false);
  }
  
  /* Error */
  public PlatformViewWrapper(Context paramContext, PlatformViewRenderTarget paramPlatformViewRenderTarget)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 34	io/flutter/plugin/platform/PlatformViewWrapper:<init>	(Landroid/content/Context;)V
    //   5: aload_0
    //   6: aload_2
    //   7: putfield 36	io/flutter/plugin/platform/PlatformViewWrapper:renderTarget	Lio/flutter/plugin/platform/PlatformViewRenderTarget;
    //   10: aload_2
    //   11: invokeinterface 42 1 0
    //   16: astore_1
    //   17: aload_1
    //   18: ifnull +38 -> 56
    //   21: getstatic 48	io/flutter/embedding/engine/renderer/FlutterRenderer:debugDisableSurfaceClear	Z
    //   24: ifne +32 -> 56
    //   27: aload_1
    //   28: invokevirtual 54	android/view/Surface:lockHardwareCanvas	()Landroid/graphics/Canvas;
    //   31: astore_2
    //   32: aload_2
    //   33: iconst_0
    //   34: getstatic 60	android/graphics/PorterDuff$Mode:CLEAR	Landroid/graphics/PorterDuff$Mode;
    //   37: invokevirtual 66	android/graphics/Canvas:drawColor	(ILandroid/graphics/PorterDuff$Mode;)V
    //   40: aload_1
    //   41: aload_2
    //   42: invokevirtual 70	android/view/Surface:unlockCanvasAndPost	(Landroid/graphics/Canvas;)V
    //   45: goto +11 -> 56
    //   48: astore_3
    //   49: aload_1
    //   50: aload_2
    //   51: invokevirtual 70	android/view/Surface:unlockCanvasAndPost	(Landroid/graphics/Canvas;)V
    //   54: aload_3
    //   55: athrow
    //   56: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	PlatformViewWrapper
    //   0	57	1	paramContext	Context
    //   0	57	2	paramPlatformViewRenderTarget	PlatformViewRenderTarget
    //   48	7	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   32	40	48	finally
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object localObject1 = renderTarget;
    if (localObject1 == null) {
      super.draw(paramCanvas);
    }
    for (paramCanvas = "Platform view cannot be composed without a RenderTarget.";; paramCanvas = "Platform view cannot be composed without a valid RenderTarget surface.")
    {
      Log.e("PlatformViewWrapper", paramCanvas);
      return;
      localObject1 = ((PlatformViewRenderTarget)localObject1).getSurface();
      if (((Surface)localObject1).isValid()) {
        break;
      }
    }
    paramCanvas = ((Surface)localObject1).lockHardwareCanvas();
    if (paramCanvas == null)
    {
      invalidate();
      return;
    }
    try
    {
      paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
      super.draw(paramCanvas);
      return;
    }
    finally
    {
      renderTarget.scheduleFrame();
      ((Surface)localObject1).unlockCanvasAndPost(paramCanvas);
    }
  }
  
  public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener()
  {
    return activeFocusListener;
  }
  
  public int getRenderTargetHeight()
  {
    PlatformViewRenderTarget localPlatformViewRenderTarget = renderTarget;
    if (localPlatformViewRenderTarget != null) {
      return localPlatformViewRenderTarget.getHeight();
    }
    return 0;
  }
  
  public int getRenderTargetWidth()
  {
    PlatformViewRenderTarget localPlatformViewRenderTarget = renderTarget;
    if (localPlatformViewRenderTarget != null) {
      return localPlatformViewRenderTarget.getWidth();
    }
    return 0;
  }
  
  public ViewParent invalidateChildInParent(int[] paramArrayOfInt, Rect paramRect)
  {
    invalidate();
    return super.invalidateChildInParent(paramArrayOfInt, paramRect);
  }
  
  public void onDescendantInvalidated(View paramView1, View paramView2)
  {
    super.onDescendantInvalidated(paramView1, paramView2);
    invalidate();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (touchProcessor == null) {
      return super.onTouchEvent(paramMotionEvent);
    }
    Matrix localMatrix = new Matrix();
    int i = paramMotionEvent.getAction();
    float f;
    if (i != 0)
    {
      if (i != 2)
      {
        f = left;
        i = top;
      }
      else
      {
        localMatrix.postTranslate(prevLeft, prevTop);
        prevLeft = left;
        prevTop = top;
        break label120;
      }
    }
    else
    {
      int j = left;
      prevLeft = j;
      i = top;
      prevTop = i;
      f = j;
    }
    localMatrix.postTranslate(f, i);
    label120:
    return touchProcessor.onTouchEvent(paramMotionEvent, localMatrix);
  }
  
  public void release()
  {
    PlatformViewRenderTarget localPlatformViewRenderTarget = renderTarget;
    if (localPlatformViewRenderTarget != null)
    {
      localPlatformViewRenderTarget.release();
      renderTarget = null;
    }
  }
  
  public boolean requestSendAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    View localView = getChildAt(0);
    if ((localView != null) && (localView.getImportantForAccessibility() == 4)) {
      return false;
    }
    return super.requestSendAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void resizeRenderTarget(int paramInt1, int paramInt2)
  {
    PlatformViewRenderTarget localPlatformViewRenderTarget = renderTarget;
    if (localPlatformViewRenderTarget != null) {
      localPlatformViewRenderTarget.resize(paramInt1, paramInt2);
    }
  }
  
  public void setLayoutParams(FrameLayout.LayoutParams paramLayoutParams)
  {
    super.setLayoutParams(paramLayoutParams);
    left = leftMargin;
    top = topMargin;
  }
  
  public void setOnDescendantFocusChangeListener(final View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    unsetOnDescendantFocusChangeListener();
    ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
    if ((localViewTreeObserver.isAlive()) && (activeFocusListener == null))
    {
      paramOnFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener()
      {
        public void onGlobalFocusChanged(View paramAnonymousView1, View paramAnonymousView2)
        {
          paramAnonymousView1 = paramOnFocusChangeListener;
          paramAnonymousView2 = this$0;
          paramAnonymousView1.onFocusChange(paramAnonymousView2, ViewUtils.childHasFocus(paramAnonymousView2));
        }
      };
      activeFocusListener = paramOnFocusChangeListener;
      localViewTreeObserver.addOnGlobalFocusChangeListener(paramOnFocusChangeListener);
    }
  }
  
  public void setTouchProcessor(AndroidTouchProcessor paramAndroidTouchProcessor)
  {
    touchProcessor = paramAndroidTouchProcessor;
  }
  
  public void unsetOnDescendantFocusChangeListener()
  {
    ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
    if (localViewTreeObserver.isAlive())
    {
      ViewTreeObserver.OnGlobalFocusChangeListener localOnGlobalFocusChangeListener = activeFocusListener;
      if (localOnGlobalFocusChangeListener != null)
      {
        activeFocusListener = null;
        localViewTreeObserver.removeOnGlobalFocusChangeListener(localOnGlobalFocusChangeListener);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.PlatformViewWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */