package h6;

import android.content.Context;
import e1.a;
import java.util.Set;
import java.util.concurrent.Semaphore;

public final class e
  extends a
{
  public final Semaphore j = new Semaphore(0);
  public final Set k;
  
  public e(Context paramContext, Set paramSet)
  {
    super(paramContext);
    k = paramSet;
  }
}

/* Location:
 * Qualified Name:     h6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */