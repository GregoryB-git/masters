package b;

import android.os.Bundle;
import d.b;
import d.g;
import d.g.a;
import e.a.a;
import java.util.ArrayList;
import java.util.HashMap;

public final class h
  implements Runnable
{
  public final void run()
  {
    j.a locala = c;
    int i = a;
    Object localObject1 = b.a;
    String str = (String)a.get(Integer.valueOf(i));
    if (str != null)
    {
      Object localObject2 = (g.a)e.get(str);
      if (localObject2 != null)
      {
        localObject2 = a;
        if (localObject2 != null)
        {
          if (!d.remove(str)) {
            return;
          }
          ((b)localObject2).a(localObject1);
          return;
        }
      }
      g.remove(str);
      f.put(str, localObject1);
    }
  }
}

/* Location:
 * Qualified Name:     b.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */