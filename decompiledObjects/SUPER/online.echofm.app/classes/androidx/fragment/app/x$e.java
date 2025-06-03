package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

public class x$e
  extends Transition.EpicenterCallback
{
  public x$e(x paramx, Rect paramRect) {}
  
  public Rect onGetEpicenter(Transition paramTransition)
  {
    paramTransition = a;
    if ((paramTransition != null) && (!paramTransition.isEmpty())) {
      return a;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.x.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */