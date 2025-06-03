package androidx.activity;

import java.util.ArrayDeque;

public class OnBackPressedDispatcher$a
  implements a
{
  public final b o;
  
  public OnBackPressedDispatcher$a(OnBackPressedDispatcher paramOnBackPressedDispatcher, b paramb)
  {
    o = paramb;
  }
  
  public void cancel()
  {
    p.b.remove(o);
    o.e(this);
  }
}

/* Location:
 * Qualified Name:     androidx.activity.OnBackPressedDispatcher.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */