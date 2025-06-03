package b;

import android.os.Bundle;

public class b$c
  implements Runnable
{
  public final int o;
  public final Bundle p;
  
  public b$c(b paramb, int paramInt, Bundle paramBundle)
  {
    o = paramInt;
    p = paramBundle;
  }
  
  public void run()
  {
    q.a(o, p);
  }
}

/* Location:
 * Qualified Name:     b.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */