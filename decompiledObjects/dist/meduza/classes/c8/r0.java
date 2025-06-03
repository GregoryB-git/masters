package c8;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import l6.b;
import u7.f;

public final class r0
{
  public volatile int a = 0;
  public final r b;
  public volatile boolean c = false;
  
  public r0(f paramf)
  {
    b = paramf;
    b.a((Application)((Context)localObject1).getApplicationContext());
    paramf = b.e;
    localObject1 = new q0(this);
    paramf.getClass();
    try
    {
      c.add(localObject1);
      return;
    }
    finally {}
  }
  
  public final void a(int paramInt)
  {
    if ((paramInt > 0) && (a == 0))
    {
      a = paramInt;
      int i;
      if ((a > 0) && (!c)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        b.a();
      }
    }
    else if ((paramInt == 0) && (a != 0))
    {
      r localr = b;
      e.removeCallbacks(f);
    }
    a = paramInt;
  }
}

/* Location:
 * Qualified Name:     c8.r0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */