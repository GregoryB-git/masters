package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import io.flutter.Log;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.RenderSurface;

public class FlutterTextureView
  extends TextureView
  implements RenderSurface
{
  private static final String TAG = "FlutterTextureView";
  private FlutterRenderer flutterRenderer;
  private boolean isPaused = false;
  private boolean isSurfaceAvailableForRendering = false;
  private Surface renderSurface;
  private final TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener()
  {
    public void onSurfaceTextureAvailable(SurfaceTexture paramAnonymousSurfaceTexture, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      Log.v("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
      FlutterTextureView.access$002(FlutterTextureView.this, true);
      if (FlutterTextureView.access$100(FlutterTextureView.this)) {
        FlutterTextureView.access$200(FlutterTextureView.this);
      }
    }
    
    public boolean onSurfaceTextureDestroyed(SurfaceTexture paramAnonymousSurfaceTexture)
    {
      Log.v("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
      FlutterTextureView.access$002(FlutterTextureView.this, false);
      if (FlutterTextureView.access$100(FlutterTextureView.this)) {
        FlutterTextureView.access$400(FlutterTextureView.this);
      }
      if (FlutterTextureView.access$500(FlutterTextureView.this) != null)
      {
        FlutterTextureView.access$500(FlutterTextureView.this).release();
        FlutterTextureView.access$502(FlutterTextureView.this, null);
      }
      return true;
    }
    
    public void onSurfaceTextureSizeChanged(SurfaceTexture paramAnonymousSurfaceTexture, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      Log.v("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
      if (FlutterTextureView.access$100(FlutterTextureView.this)) {
        FlutterTextureView.access$300(FlutterTextureView.this, paramAnonymousInt1, paramAnonymousInt2);
      }
    }
    
    public void onSurfaceTextureUpdated(SurfaceTexture paramAnonymousSurfaceTexture) {}
  };
  
  public FlutterTextureView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public FlutterTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
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
      Log.v("FlutterTextureView", localStringBuilder.toString());
      flutterRenderer.surfaceChanged(paramInt1, paramInt2);
      return;
    }
    throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
  }
  
  private void connectSurfaceToRenderer()
  {
    if ((flutterRenderer != null) && (getSurfaceTexture() != null))
    {
      Surface localSurface = renderSurface;
      if (localSurface != null)
      {
        localSurface.release();
        renderSurface = null;
      }
      localSurface = new Surface(getSurfaceTexture());
      renderSurface = localSurface;
      flutterRenderer.startRenderingToSurface(localSurface, isPaused);
      return;
    }
    throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
  }
  
  private void disconnectSurfaceFromRenderer()
  {
    Object localObject = flutterRenderer;
    if (localObject != null)
    {
      ((FlutterRenderer)localObject).stopRenderingToSurface();
      localObject = renderSurface;
      if (localObject != null)
      {
        ((Surface)localObject).release();
        renderSurface = null;
      }
      return;
    }
    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
  }
  
  private void init()
  {
    setSurfaceTextureListener(surfaceTextureListener);
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
    Log.v("FlutterTextureView", "Attaching to FlutterRenderer.");
    if (flutterRenderer != null)
    {
      Log.v("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
      flutterRenderer.stopRenderingToSurface();
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
        Log.v("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
        disconnectSurfaceFromRenderer();
      }
      flutterRenderer = null;
    }
    else
    {
      Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }
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
      Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
      return;
    }
    isPaused = true;
  }
  
  public void resume()
  {
    if (flutterRenderer == null)
    {
      Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
      return;
    }
    if (isSurfaceAvailableForRendering())
    {
      Log.v("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
      connectSurfaceToRenderer();
    }
    isPaused = false;
  }
  
  public void setRenderSurface(Surface paramSurface)
  {
    renderSurface = paramSurface;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterTextureView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */