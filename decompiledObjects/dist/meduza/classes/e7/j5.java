package e7;

import android.util.Log;
import i7.a;

public final class j5
  implements Runnable
{
  public final void run()
  {
    switch (a)
    {
    default: 
      break;
    case 0: 
      ??? = b).c;
      e = null;
      ((w4)???).G();
      return;
    }
    a locala = (a)b;
    synchronized (a)
    {
      if (locala.b())
      {
        Log.e("WakeLock", String.valueOf(j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
        locala.d();
        if (locala.b())
        {
          c = 1;
          locala.e();
        }
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     e7.j5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */