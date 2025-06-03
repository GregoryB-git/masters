package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;

public class SurfaceTextureWrapper
{
  private boolean attached;
  private boolean newFrameAvailable = false;
  private Runnable onFrameConsumed;
  private boolean released;
  private SurfaceTexture surfaceTexture;
  
  public SurfaceTextureWrapper(SurfaceTexture paramSurfaceTexture)
  {
    this(paramSurfaceTexture, null);
  }
  
  public SurfaceTextureWrapper(SurfaceTexture paramSurfaceTexture, Runnable paramRunnable)
  {
    surfaceTexture = paramSurfaceTexture;
    released = false;
    onFrameConsumed = paramRunnable;
  }
  
  public void attachToGLContext(int paramInt)
  {
    try
    {
      if (released) {
        return;
      }
      if (attached) {
        surfaceTexture.detachFromGLContext();
      }
      surfaceTexture.attachToGLContext(paramInt);
      attached = true;
      return;
    }
    finally {}
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
      return;
    }
    finally {}
  }
  
  public void getTransformMatrix(float[] paramArrayOfFloat)
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
      return;
    }
    finally {}
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
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.SurfaceTextureWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */