package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.Log;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.RenderSurface;

public class FlutterSurfaceView
  extends SurfaceView
  implements RenderSurface
{
  private static final String TAG = "FlutterSurfaceView";
  private FlutterRenderer flutterRenderer;
  private final FlutterUiDisplayListener flutterUiDisplayListener = new FlutterUiDisplayListener()
  {
    public void onFlutterUiDisplayed()
    {
      Log.v("FlutterSurfaceView", "onFlutterUiDisplayed()");
      setAlpha(1.0F);
      if (FlutterSurfaceView.access$500(FlutterSurfaceView.this) != null) {
        FlutterSurfaceView.access$500(FlutterSurfaceView.this).removeIsDisplayingFlutterUiListener(this);
      }
    }
    
    public void onFlutterUiNoLongerDisplayed() {}
  };
  private boolean isPaused = false;
  private boolean isSurfaceAvailableForRendering = false;
  private final boolean renderTransparently;
  private final SurfaceHolder.Callback surfaceCallback = new SurfaceHolder.Callback()
  {
    public void surfaceChanged(SurfaceHolder paramAnonymousSurfaceHolder, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      Log.v("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
      if (FlutterSurfaceView.access$100(FlutterSurfaceView.this)) {
        FlutterSurfaceView.access$300(FlutterSurfaceView.this, paramAnonymousInt2, paramAnonymousInt3);
      }
    }
    
    public void surfaceCreated(SurfaceHolder paramAnonymousSurfaceHolder)
    {
      Log.v("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
      FlutterSurfaceView.access$002(FlutterSurfaceView.this, true);
      if (FlutterSurfaceView.access$100(FlutterSurfaceView.this)) {
        FlutterSurfaceView.access$200(FlutterSurfaceView.this);
      }
    }
    
    public void surfaceDestroyed(SurfaceHolder paramAnonymousSurfaceHolder)
    {
      Log.v("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
      FlutterSurfaceView.access$002(FlutterSurfaceView.this, false);
      if (FlutterSurfaceView.access$100(FlutterSurfaceView.this)) {
        FlutterSurfaceView.access$400(FlutterSurfaceView.this);
      }
    }
  };
  
  public FlutterSurfaceView(Context paramContext)
  {
    this(paramContext, null, false);
  }
  
  public FlutterSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, false);
  }
  
  private FlutterSurfaceView(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    super(paramContext, paramAttributeSet);
    renderTransparently = paramBoolean;
    init();
  }
  
  public FlutterSurfaceView(Context paramContext, boolean paramBoolean)
  {
    this(paramContext, null, paramBoolean);
  }
  
  private void changeSurfaceSize(int paramInt1, int paramInt2)
  {
    if (flutterRenderer != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Notifying FlutterRenderer that Android surface size has changed to ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" x ");
      localStringBuilder.append(paramInt2);
      Log.v("FlutterSurfaceView", localStringBuilder.toString());
      flutterRenderer.surfaceChanged(paramInt1, paramInt2);
      return;
    }
    throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
  }
  
  private void connectSurfaceToRenderer()
  {
    if ((flutterRenderer != null) && (getHolder() != null))
    {
      flutterRenderer.startRenderingToSurface(getHolder().getSurface(), isPaused);
      return;
    }
    throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
  }
  
  private void disconnectSurfaceFromRenderer()
  {
    FlutterRenderer localFlutterRenderer = flutterRenderer;
    if (localFlutterRenderer != null)
    {
      localFlutterRenderer.stopRenderingToSurface();
      return;
    }
    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
  }
  
  private void init()
  {
    if (renderTransparently)
    {
      getHolder().setFormat(-2);
      setZOrderOnTop(true);
    }
    getHolder().addCallback(surfaceCallback);
    setAlpha(0.0F);
  }
  
  private boolean shouldNotify()
  {
    boolean bool;
    if ((flutterRenderer != null) && (!isPaused)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void attachToRenderer(FlutterRenderer paramFlutterRenderer)
  {
    Log.v("FlutterSurfaceView", "Attaching to FlutterRenderer.");
    if (flutterRenderer != null)
    {
      Log.v("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
      flutterRenderer.stopRenderingToSurface();
      flutterRenderer.removeIsDisplayingFlutterUiListener(flutterUiDisplayListener);
    }
    flutterRenderer = paramFlutterRenderer;
    resume();
  }
  
  public void detachFromRenderer()
  {
    if (flutterRenderer != null)
    {
      if (getWindowToken() != null)
      {
        Log.v("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
        disconnectSurfaceFromRenderer();
      }
      setAlpha(0.0F);
      flutterRenderer.removeIsDisplayingFlutterUiListener(flutterUiDisplayListener);
      flutterRenderer = null;
    }
    else
    {
      Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }
  }
  
  public boolean gatherTransparentRegion(Region paramRegion)
  {
    if (getAlpha() < 1.0F) {
      return false;
    }
    int[] arrayOfInt = new int[2];
    getLocationInWindow(arrayOfInt);
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    int k = getRight();
    int m = getLeft();
    int n = arrayOfInt[1];
    paramRegion.op(i, j, k + i - m, getBottom() + n - getTop(), Region.Op.DIFFERENCE);
    return true;
  }
  
  public FlutterRenderer getAttachedRenderer()
  {
    return flutterRenderer;
  }
  
  public boolean isSurfaceAvailableForRendering()
  {
    return isSurfaceAvailableForRendering;
  }
  
  public void pause()
  {
    if (flutterRenderer == null)
    {
      Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
      return;
    }
    isPaused = true;
  }
  
  public void resume()
  {
    FlutterRenderer localFlutterRenderer = flutterRenderer;
    if (localFlutterRenderer == null)
    {
      Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
      return;
    }
    localFlutterRenderer.addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
    if (isSurfaceAvailableForRendering())
    {
      Log.v("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
      connectSurfaceToRenderer();
    }
    isPaused = false;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterSurfaceView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */