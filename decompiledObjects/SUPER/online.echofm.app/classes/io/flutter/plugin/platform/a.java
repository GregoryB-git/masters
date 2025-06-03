package io.flutter.plugin.platform;

import android.view.MotionEvent;
import io.flutter.view.i;

public class a
{
  public i a;
  
  public boolean a(MotionEvent paramMotionEvent, boolean paramBoolean)
  {
    i locali = a;
    if (locali == null) {
      return false;
    }
    return locali.L(paramMotionEvent, paramBoolean);
  }
  
  public void b(i parami)
  {
    a = parami;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */