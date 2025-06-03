package io.flutter.plugin.platform;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.hardware.display.VirtualDisplay.Callback;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnDrawListener;
import f;

class VirtualDisplayController
{
  private static String TAG = "VirtualDisplayController";
  private static VirtualDisplay.Callback callback = new VirtualDisplay.Callback()
  {
    public void onPaused() {}
    
    public void onResumed() {}
  };
  private final AccessibilityEventsDelegate accessibilityEventsDelegate;
  private final Context context;
  private final int densityDpi;
  private final View.OnFocusChangeListener focusChangeListener;
  public SingleViewPresentation presentation;
  private final PlatformViewRenderTarget renderTarget;
  private final int viewId;
  private VirtualDisplay virtualDisplay;
  
  private VirtualDisplayController(Context paramContext, AccessibilityEventsDelegate paramAccessibilityEventsDelegate, VirtualDisplay paramVirtualDisplay, PlatformView paramPlatformView, PlatformViewRenderTarget paramPlatformViewRenderTarget, View.OnFocusChangeListener paramOnFocusChangeListener, int paramInt, Object paramObject)
  {
    context = paramContext;
    accessibilityEventsDelegate = paramAccessibilityEventsDelegate;
    renderTarget = paramPlatformViewRenderTarget;
    focusChangeListener = paramOnFocusChangeListener;
    viewId = paramInt;
    virtualDisplay = paramVirtualDisplay;
    densityDpi = getResourcesgetDisplayMetricsdensityDpi;
    paramContext = new SingleViewPresentation(paramContext, virtualDisplay.getDisplay(), paramPlatformView, paramAccessibilityEventsDelegate, paramInt, paramOnFocusChangeListener);
    presentation = paramContext;
    paramContext.show();
  }
  
  public static VirtualDisplayController create(Context paramContext, AccessibilityEventsDelegate paramAccessibilityEventsDelegate, PlatformView paramPlatformView, PlatformViewRenderTarget paramPlatformViewRenderTarget, int paramInt1, int paramInt2, int paramInt3, Object paramObject, View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    DisplayManager localDisplayManager = null;
    Object localObject = localDisplayManager;
    if (paramInt1 != 0) {
      if (paramInt2 == 0)
      {
        localObject = localDisplayManager;
      }
      else
      {
        localDisplayManager = (DisplayManager)paramContext.getSystemService("display");
        localObject = paramContext.getResources().getDisplayMetrics();
        paramPlatformViewRenderTarget.resize(paramInt1, paramInt2);
        localObject = localDisplayManager.createVirtualDisplay(f.h("flutter-vd#", paramInt3), paramInt1, paramInt2, densityDpi, paramPlatformViewRenderTarget.getSurface(), 0, callback, null);
        if (localObject == null) {
          return null;
        }
        localObject = new VirtualDisplayController(paramContext, paramAccessibilityEventsDelegate, (VirtualDisplay)localObject, paramPlatformView, paramPlatformViewRenderTarget, paramOnFocusChangeListener, paramInt3, paramObject);
      }
    }
    return (VirtualDisplayController)localObject;
  }
  
  private void resize31(View paramView, int paramInt1, int paramInt2, Runnable paramRunnable)
  {
    renderTarget.resize(paramInt1, paramInt2);
    virtualDisplay.resize(paramInt1, paramInt2, densityDpi);
    virtualDisplay.setSurface(renderTarget.getSurface());
    paramView.postDelayed(paramRunnable, 0L);
  }
  
  public void clearSurface()
  {
    virtualDisplay.setSurface(null);
  }
  
  public void dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    SingleViewPresentation localSingleViewPresentation = presentation;
    if (localSingleViewPresentation == null) {
      return;
    }
    localSingleViewPresentation.dispatchTouchEvent(paramMotionEvent);
  }
  
  public void dispose()
  {
    presentation.cancel();
    presentation.detachState();
    virtualDisplay.release();
    renderTarget.release();
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
  
  public View getView()
  {
    SingleViewPresentation localSingleViewPresentation = presentation;
    if (localSingleViewPresentation == null) {
      return null;
    }
    return localSingleViewPresentation.getView().getView();
  }
  
  public void onFlutterViewAttached(View paramView)
  {
    SingleViewPresentation localSingleViewPresentation = presentation;
    if ((localSingleViewPresentation != null) && (localSingleViewPresentation.getView() != null)) {
      presentation.getView().onFlutterViewAttached(paramView);
    }
  }
  
  public void onFlutterViewDetached()
  {
    SingleViewPresentation localSingleViewPresentation = presentation;
    if ((localSingleViewPresentation != null) && (localSingleViewPresentation.getView() != null)) {
      presentation.getView().onFlutterViewDetached();
    }
  }
  
  public void onInputConnectionLocked()
  {
    SingleViewPresentation localSingleViewPresentation = presentation;
    if ((localSingleViewPresentation != null) && (localSingleViewPresentation.getView() != null)) {
      presentation.getView().onInputConnectionLocked();
    }
  }
  
  public void onInputConnectionUnlocked()
  {
    SingleViewPresentation localSingleViewPresentation = presentation;
    if ((localSingleViewPresentation != null) && (localSingleViewPresentation.getView() != null)) {
      presentation.getView().onInputConnectionUnlocked();
    }
  }
  
  public void resetSurface()
  {
    int i = getRenderTargetWidth();
    int j = getRenderTargetHeight();
    boolean bool = getView().isFocused();
    SingleViewPresentation.PresentationState localPresentationState = presentation.detachState();
    virtualDisplay.setSurface(null);
    virtualDisplay.release();
    DisplayManager localDisplayManager = (DisplayManager)context.getSystemService("display");
    Object localObject = f.l("flutter-vd#");
    ((StringBuilder)localObject).append(viewId);
    virtualDisplay = localDisplayManager.createVirtualDisplay(((StringBuilder)localObject).toString(), i, j, densityDpi, renderTarget.getSurface(), 0, callback, null);
    localObject = new SingleViewPresentation(context, virtualDisplay.getDisplay(), accessibilityEventsDelegate, localPresentationState, focusChangeListener, bool);
    ((Dialog)localObject).show();
    presentation.cancel();
    presentation = ((SingleViewPresentation)localObject);
  }
  
  public void resize(int paramInt1, int paramInt2, final Runnable paramRunnable)
  {
    if ((paramInt1 == getRenderTargetWidth()) && (paramInt2 == getRenderTargetHeight()))
    {
      getView().postDelayed(paramRunnable, 0L);
      return;
    }
    if (Build.VERSION.SDK_INT >= 31)
    {
      resize31(getView(), paramInt1, paramInt2, paramRunnable);
      return;
    }
    boolean bool = getView().isFocused();
    SingleViewPresentation.PresentationState localPresentationState = presentation.detachState();
    virtualDisplay.setSurface(null);
    virtualDisplay.release();
    DisplayManager localDisplayManager = (DisplayManager)context.getSystemService("display");
    renderTarget.resize(paramInt1, paramInt2);
    final Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("flutter-vd#");
    ((StringBuilder)localObject).append(viewId);
    virtualDisplay = localDisplayManager.createVirtualDisplay(((StringBuilder)localObject).toString(), paramInt1, paramInt2, densityDpi, renderTarget.getSurface(), 0, callback, null);
    localObject = getView();
    ((View)localObject).addOnAttachStateChangeListener(new View.OnAttachStateChangeListener()
    {
      public void onViewAttachedToWindow(View paramAnonymousView)
      {
        VirtualDisplayController.OneTimeOnDrawListener.schedule(localObject, new Runnable()
        {
          public void run()
          {
            VirtualDisplayController.2 local2 = VirtualDisplayController.2.this;
            val$embeddedView.postDelayed(val$onNewSizeFrameAvailable, 128L);
          }
        });
        localObject.removeOnAttachStateChangeListener(this);
      }
      
      public void onViewDetachedFromWindow(View paramAnonymousView) {}
    });
    paramRunnable = new SingleViewPresentation(context, virtualDisplay.getDisplay(), accessibilityEventsDelegate, localPresentationState, focusChangeListener, bool);
    paramRunnable.show();
    presentation.cancel();
    presentation = paramRunnable;
  }
  
  public static class OneTimeOnDrawListener
    implements ViewTreeObserver.OnDrawListener
  {
    public Runnable mOnDrawRunnable;
    public final View mView;
    
    public OneTimeOnDrawListener(View paramView, Runnable paramRunnable)
    {
      mView = paramView;
      mOnDrawRunnable = paramRunnable;
    }
    
    public static void schedule(View paramView, Runnable paramRunnable)
    {
      paramRunnable = new OneTimeOnDrawListener(paramView, paramRunnable);
      paramView.getViewTreeObserver().addOnDrawListener(paramRunnable);
    }
    
    public void onDraw()
    {
      Runnable localRunnable = mOnDrawRunnable;
      if (localRunnable == null) {
        return;
      }
      localRunnable.run();
      mOnDrawRunnable = null;
      mView.post(new Runnable()
      {
        public void run()
        {
          mView.getViewTreeObserver().removeOnDrawListener(VirtualDisplayController.OneTimeOnDrawListener.this);
        }
      });
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.VirtualDisplayController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */