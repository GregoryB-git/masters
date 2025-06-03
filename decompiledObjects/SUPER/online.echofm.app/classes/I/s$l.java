package I;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;

public abstract class s$l
{
  public static x a(@NonNull View paramView)
  {
    Object localObject = paramView.getRootWindowInsets();
    if (localObject == null) {
      return null;
    }
    localObject = x.s((WindowInsets)localObject);
    ((x)localObject).p((x)localObject);
    ((x)localObject).d(paramView.getRootView());
    return (x)localObject;
  }
  
  public static int b(@NonNull View paramView)
  {
    return paramView.getScrollIndicators();
  }
  
  public static void c(@NonNull View paramView, int paramInt)
  {
    paramView.setScrollIndicators(paramInt);
  }
  
  public static void d(@NonNull View paramView, int paramInt1, int paramInt2)
  {
    paramView.setScrollIndicators(paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     I.s.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */