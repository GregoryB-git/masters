package D0;

import android.view.Surface;
import g0.o;

public abstract class s$a
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
      r.a(paramSurface, paramFloat, i);
    }
    catch (IllegalStateException paramSurface)
    {
      o.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", paramSurface);
    }
  }
}

/* Location:
 * Qualified Name:     D0.s.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */