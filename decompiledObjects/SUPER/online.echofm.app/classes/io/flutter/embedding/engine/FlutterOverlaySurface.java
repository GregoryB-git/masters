package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
public class FlutterOverlaySurface
{
  private final int id;
  @NonNull
  private final Surface surface;
  
  public FlutterOverlaySurface(int paramInt, @NonNull Surface paramSurface)
  {
    id = paramInt;
    surface = paramSurface;
  }
  
  public int getId()
  {
    return id;
  }
  
  public Surface getSurface()
  {
    return surface;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterOverlaySurface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */