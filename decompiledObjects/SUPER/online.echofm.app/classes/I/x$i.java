package I;

import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.util.Objects;

public class x$i
  extends x.h
{
  public x$i(@NonNull x paramx, @NonNull i parami)
  {
    super(paramx, parami);
  }
  
  public x$i(@NonNull x paramx, @NonNull WindowInsets paramWindowInsets)
  {
    super(paramx, paramWindowInsets);
  }
  
  @NonNull
  public x a()
  {
    return x.s(H.a(c));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof i)) {
      return false;
    }
    paramObject = (i)paramObject;
    if ((!Objects.equals(c, c)) || (!Objects.equals(g, g))) {
      bool = false;
    }
    return bool;
  }
  
  public d f()
  {
    return d.e(G.a(c));
  }
  
  public int hashCode()
  {
    return c.hashCode();
  }
}

/* Location:
 * Qualified Name:     I.x.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */