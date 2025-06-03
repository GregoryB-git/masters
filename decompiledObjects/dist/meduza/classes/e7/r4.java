package e7;

import android.os.Bundle;
import d2.q;

public final class r4
  implements Runnable
{
  public final void run()
  {
    s4 locals4 = e;
    Bundle localBundle = a;
    q4 localq41 = b;
    q4 localq42 = c;
    long l = d;
    if (localBundle != null)
    {
      localBundle.remove("screen_name");
      localBundle.remove("screen_class");
    }
    locals4.x(localq41, localq42, l, true, locals4.k().w("screen_view", localBundle, null, false));
  }
}

/* Location:
 * Qualified Name:     e7.r4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */