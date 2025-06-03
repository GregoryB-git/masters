package a0;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import java.util.HashMap;
import t.h;

public class d$f
  implements IBinder.DeathRecipient
{
  public final String a;
  public final int b;
  public final int c;
  public final f d;
  public final Bundle e;
  public final d.o f;
  public final HashMap g = new HashMap();
  public d.e h;
  
  public d$f(d paramd, String paramString, int paramInt1, int paramInt2, Bundle paramBundle, d.o paramo)
  {
    a = paramString;
    b = paramInt1;
    c = paramInt2;
    d = new f(paramString, paramInt1, paramInt2);
    e = paramBundle;
    f = paramo;
  }
  
  public void binderDied()
  {
    i.u.post(new a());
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      d.f localf = d.f.this;
      i.s.remove(f.asBinder());
    }
  }
}

/* Location:
 * Qualified Name:     a0.d.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */