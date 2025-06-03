package androidx.emoji2.text;

import java.util.ArrayList;
import java.util.List;

public final class d$f
  implements Runnable
{
  public final ArrayList a;
  public final int b;
  
  public d$f(List paramList, int paramInt, Throwable paramThrowable)
  {
    if (paramList != null)
    {
      a = new ArrayList(paramList);
      b = paramInt;
      return;
    }
    throw new NullPointerException("initCallbacks cannot be null");
  }
  
  public final void run()
  {
    int i = a.size();
    int j = b;
    int k = 0;
    int m = 0;
    if (j != 1) {
      for (k = m; k < i; k++) {
        ((d.e)a.get(k)).getClass();
      }
    }
    while (k < i)
    {
      ((d.e)a.get(k)).a();
      k++;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.d.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */