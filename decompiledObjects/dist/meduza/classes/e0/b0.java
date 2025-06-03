package e0;

import android.text.TextUtils;
import android.view.View;

public final class b0
  extends d0.b<CharSequence>
{
  public b0(Class paramClass)
  {
    super(2131362035, paramClass, 8, 28);
  }
  
  public final Object b(View paramView)
  {
    return d0.g.b(paramView);
  }
  
  public final void c(View paramView, Object paramObject)
  {
    d0.g.h(paramView, (CharSequence)paramObject);
  }
  
  public final boolean f(Object paramObject1, Object paramObject2)
  {
    return TextUtils.equals((CharSequence)paramObject1, (CharSequence)paramObject2) ^ true;
  }
}

/* Location:
 * Qualified Name:     e0.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */