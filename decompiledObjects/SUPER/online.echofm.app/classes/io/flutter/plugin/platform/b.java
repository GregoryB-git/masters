package io.flutter.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import u5.r;
import u5.r.b;

public class b
  extends r
{
  public a u;
  
  public b(Context paramContext, int paramInt1, int paramInt2, a parama)
  {
    super(paramContext, paramInt1, paramInt2, r.b.p);
    u = parama;
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    a locala = u;
    if ((locala != null) && (locala.a(paramMotionEvent, true))) {
      return true;
    }
    return super.onHoverEvent(paramMotionEvent);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */