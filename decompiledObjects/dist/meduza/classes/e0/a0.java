package e0;

import android.view.View;

public final class a0
  extends d0.b<Boolean>
{
  public a0()
  {
    super(2131362039, Boolean.class, 0, 28);
  }
  
  public final Object b(View paramView)
  {
    return Boolean.valueOf(d0.g.d(paramView));
  }
  
  public final void c(View paramView, Object paramObject)
  {
    d0.g.j(paramView, ((Boolean)paramObject).booleanValue());
  }
  
  public final boolean f(Object paramObject1, Object paramObject2)
  {
    return d0.b.a((Boolean)paramObject1, (Boolean)paramObject2) ^ true;
  }
}

/* Location:
 * Qualified Name:     e0.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */