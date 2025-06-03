package e1;

import android.os.Looper;
import android.os.SystemClock;
import b1.w;
import d1.b.a;

public final class a$a
  extends c<D>
  implements Runnable
{
  public a$a(a parama) {}
  
  public final void a()
  {
    f.c();
  }
  
  public final void b(D paramD)
  {
    paramD = f;
    if (i == this)
    {
      SystemClock.uptimeMillis();
      i = null;
      paramD.b();
    }
  }
  
  public final void c(D paramD)
  {
    Object localObject = f;
    if (h != this)
    {
      if (i == this)
      {
        SystemClock.uptimeMillis();
        i = null;
        ((a)localObject).b();
      }
    }
    else if (!d)
    {
      SystemClock.uptimeMillis();
      h = null;
      localObject = b;
      if (localObject != null)
      {
        localObject = (b.a)localObject;
        if (Looper.myLooper() == Looper.getMainLooper()) {
          ((b.a)localObject).setValue(paramD);
        } else {
          ((w)localObject).postValue(paramD);
        }
      }
    }
  }
  
  public final void run()
  {
    f.b();
  }
}

/* Location:
 * Qualified Name:     e1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */