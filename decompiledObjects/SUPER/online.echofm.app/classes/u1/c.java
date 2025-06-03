package u1;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class c
{
  public static Interpolator a(Context paramContext, int paramInt)
  {
    return AnimationUtils.loadInterpolator(paramContext, paramInt);
  }
}

/* Location:
 * Qualified Name:     u1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */