package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public enum B$e$c
{
  static
  {
    c localc1 = new c("REMOVED", 0);
    o = localc1;
    c localc2 = new c("VISIBLE", 1);
    p = localc2;
    c localc3 = new c("GONE", 2);
    q = localc3;
    c localc4 = new c("INVISIBLE", 3);
    r = localc4;
    s = new c[] { localc1, localc2, localc3, localc4 };
  }
  
  public static c e(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 4)
      {
        if (paramInt == 8) {
          return q;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Unknown visibility ");
        localStringBuilder.append(paramInt);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      return r;
    }
    return p;
  }
  
  public static c h(View paramView)
  {
    if ((paramView.getAlpha() == 0.0F) && (paramView.getVisibility() == 0)) {
      return r;
    }
    return e(paramView.getVisibility());
  }
  
  public void c(View paramView)
  {
    int i = B.c.a[ordinal()];
    Object localObject;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            return;
          }
          if (n.D0(2))
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("SpecialEffectsController: Setting view ");
            ((StringBuilder)localObject).append(paramView);
            ((StringBuilder)localObject).append(" to INVISIBLE");
            Log.v("FragmentManager", ((StringBuilder)localObject).toString());
          }
          paramView.setVisibility(4);
          return;
        }
        if (n.D0(2))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("SpecialEffectsController: Setting view ");
          ((StringBuilder)localObject).append(paramView);
          ((StringBuilder)localObject).append(" to GONE");
          Log.v("FragmentManager", ((StringBuilder)localObject).toString());
        }
      }
      for (i = 8;; i = 0)
      {
        paramView.setVisibility(i);
        break;
        if (n.D0(2))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("SpecialEffectsController: Setting view ");
          ((StringBuilder)localObject).append(paramView);
          ((StringBuilder)localObject).append(" to VISIBLE");
          Log.v("FragmentManager", ((StringBuilder)localObject).toString());
        }
      }
    }
    else
    {
      localObject = (ViewGroup)paramView.getParent();
      if (localObject != null)
      {
        if (n.D0(2))
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("SpecialEffectsController: Removing view ");
          localStringBuilder.append(paramView);
          localStringBuilder.append(" from container ");
          localStringBuilder.append(localObject);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
        ((ViewGroup)localObject).removeView(paramView);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.B.e.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */