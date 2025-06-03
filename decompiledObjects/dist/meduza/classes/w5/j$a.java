package w5;

import android.view.Surface;
import d3.a;
import v5.m;

public final class j$a
{
  public static void a(Surface paramSurface, float paramFloat)
  {
    int i;
    if (paramFloat == 0.0F) {
      i = 0;
    } else {
      i = 1;
    }
    try
    {
      a.f(paramSurface, paramFloat, i);
    }
    catch (IllegalStateException paramSurface)
    {
      m.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", paramSurface);
    }
  }
}

/* Location:
 * Qualified Name:     w5.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */