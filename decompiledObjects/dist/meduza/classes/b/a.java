package b;

import android.window.BackEvent;
import ec.i;

public final class a
{
  public static final a a = new a();
  
  public final BackEvent a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    return new BackEvent(paramFloat1, paramFloat2, paramFloat3, paramInt);
  }
  
  public final float b(BackEvent paramBackEvent)
  {
    i.e(paramBackEvent, "backEvent");
    return paramBackEvent.getProgress();
  }
  
  public final int c(BackEvent paramBackEvent)
  {
    i.e(paramBackEvent, "backEvent");
    return paramBackEvent.getSwipeEdge();
  }
  
  public final float d(BackEvent paramBackEvent)
  {
    i.e(paramBackEvent, "backEvent");
    return paramBackEvent.getTouchX();
  }
  
  public final float e(BackEvent paramBackEvent)
  {
    i.e(paramBackEvent, "backEvent");
    return paramBackEvent.getTouchY();
  }
}

/* Location:
 * Qualified Name:     b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */