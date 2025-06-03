package io.flutter.embedding.engine.renderer;

public abstract interface RenderSurface
{
  public abstract void attachToRenderer(FlutterRenderer paramFlutterRenderer);
  
  public abstract void detachFromRenderer();
  
  public abstract FlutterRenderer getAttachedRenderer();
  
  public abstract void pause();
  
  public abstract void resume();
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.RenderSurface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */