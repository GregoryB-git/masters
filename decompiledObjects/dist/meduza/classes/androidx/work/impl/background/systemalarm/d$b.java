package androidx.work.impl.background.systemalarm;

import android.content.Intent;

public final class d$b
  implements Runnable
{
  public final d a;
  public final Intent b;
  public final int c;
  
  public d$b(int paramInt, Intent paramIntent, d paramd)
  {
    a = paramd;
    b = paramIntent;
    c = paramInt;
  }
  
  public final void run()
  {
    d locald = a;
    Intent localIntent = b;
    locald.b(c, localIntent);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */