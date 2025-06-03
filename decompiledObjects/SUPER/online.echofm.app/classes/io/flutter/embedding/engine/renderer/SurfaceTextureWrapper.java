package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
public class SurfaceTextureWrapper
{
  private boolean attached;
  private boolean newFrameAvailable = false;
  private Runnable onFrameConsumed;
  private boolean released;
  private SurfaceTexture surfaceTexture;
  
  public SurfaceTextureWrapper(@NonNull SurfaceTexture paramSurfaceTexture)
  {
    this(paramSurfaceTexture, null);
  }
  
  public SurfaceTextureWrapper(@NonNull SurfaceTexture paramSurfaceTexture, Runnable paramRunnable)
  {
    surfaceTexture = paramSurfaceTexture;
    released = false;
    onFrameConsumed = paramRunnable;
  }
  
  public void attachToGLContext(int paramInt)
  {
    label46:
    try
    {
      if (released) {
        return;
      }
    }
    finally
    {
      break label46;
      if (attached) {
        surfaceTexture.detachFromGLContext();
      }
      surfaceTexture.attachToGLContext(paramInt);
      attached = true;
      return;
    }
  }
  
  public void detachFromGLContext()
  {
    try
    {
      if ((attached) && (!released))
      {
        surfaceTexture.detachFromGLContext();
        attached = false;
      }
    }
    finally
    {
      break label38;
    }
    return;
    label38:
    throw ((Throwable)localObject);
  }
  
  public void getTransformMatrix(@NonNull float[] paramArrayOfFloat)
  {
    surfaceTexture.getTransformMatrix(paramArrayOfFloat);
  }
  
  public void markDirty()
  {
    try
    {
      newFrameAvailable = true;
      return;
    }
    finally {}
  }
  
  public void release()
  {
    try
    {
      if (!released)
      {
        surfaceTexture.release();
        released = true;
        attached = false;
      }
    }
    finally
    {
      break label36;
    }
    return;
    label36:
    throw ((Throwable)localObject);
  }
  
  public boolean shouldUpdate()
  {
    try
    {
      boolean bool = newFrameAvailable;
      return bool;
    }
    finally {}
  }
  
  @NonNull
  public SurfaceTexture surfaceTexture()
  {
    return surfaceTexture;
  }
  
  public void updateTexImage()
  {
    try
    {
      newFrameAvailable = false;
      if (!released)
      {
        surfaceTexture.updateTexImage();
        Runnable localRunnable = onFrameConsumed;
        if (localRunnable != null) {
          localRunnable.run();
        }
      }
    }
    finally
    {
      break label46;
    }
    return;
    label46:
    throw ((Throwable)localObject);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.SurfaceTextureWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */