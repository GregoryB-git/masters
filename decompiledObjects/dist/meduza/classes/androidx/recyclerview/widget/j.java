package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

public abstract class j
{
  public final RecyclerView.j a;
  
  public j(RecyclerView.j paramj)
  {
    new Rect();
    a = paramj;
  }
  
  public static j a(RecyclerView.j paramj, int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt == 1) {
        return new i(paramj);
      }
      throw new IllegalArgumentException("invalid orientation");
    }
    return new h(paramj);
  }
  
  public abstract int b(View paramView);
  
  public abstract int c(View paramView);
  
  public abstract int d();
  
  public abstract int e();
  
  public abstract int f();
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */