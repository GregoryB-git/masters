package io.flutter.view;

public abstract interface TextureRegistry$SurfaceProducer$Callback
{
  public abstract void onSurfaceAvailable();
  
  public abstract void onSurfaceCleanup();
  
  @Deprecated(forRemoval=true, since="Flutter 3.27")
  public abstract void onSurfaceCreated();
  
  @Deprecated(forRemoval=true, since="Flutter 3.28")
  public abstract void onSurfaceDestroyed();
}

/* Location:
 * Qualified Name:     io.flutter.view.TextureRegistry.SurfaceProducer.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */