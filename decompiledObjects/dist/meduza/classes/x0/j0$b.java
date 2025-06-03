package x0;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

public final class j0$b
  extends Transition.EpicenterCallback
{
  public j0$b(Rect paramRect) {}
  
  public final Rect onGetEpicenter(Transition paramTransition)
  {
    paramTransition = a;
    if ((paramTransition != null) && (!paramTransition.isEmpty())) {
      return a;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     x0.j0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */