package I;

import android.view.MotionEvent;

public abstract class j
{
  public static boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    boolean bool;
    if ((paramMotionEvent.getSource() & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     I.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */