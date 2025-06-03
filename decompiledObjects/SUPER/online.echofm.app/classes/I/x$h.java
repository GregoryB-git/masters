package I;

import A.f;
import android.view.WindowInsets;
import androidx.annotation.NonNull;

public class x$h
  extends x.g
{
  public f m = null;
  
  public x$h(@NonNull x paramx, @NonNull h paramh)
  {
    super(paramx, paramh);
    m = m;
  }
  
  public x$h(@NonNull x paramx, @NonNull WindowInsets paramWindowInsets)
  {
    super(paramx, paramWindowInsets);
  }
  
  @NonNull
  public x b()
  {
    return x.s(c.consumeStableInsets());
  }
  
  @NonNull
  public x c()
  {
    return x.s(c.consumeSystemWindowInsets());
  }
  
  @NonNull
  public final f i()
  {
    if (m == null) {
      m = f.b(c.getStableInsetLeft(), c.getStableInsetTop(), c.getStableInsetRight(), c.getStableInsetBottom());
    }
    return m;
  }
  
  public boolean n()
  {
    return c.isConsumed();
  }
  
  public void s(f paramf)
  {
    m = paramf;
  }
}

/* Location:
 * Qualified Name:     I.x.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */