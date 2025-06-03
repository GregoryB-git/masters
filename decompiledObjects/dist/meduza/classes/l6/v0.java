package l6;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import k6.e;
import k6.g;
import k6.h;
import k6.j;
import k6.k;
import k6.m;

public final class v0<R extends j>
  extends m<R>
  implements k<R>
{
  public v0 a = null;
  public g b = null;
  public final Object c = new Object();
  public Status d = null;
  public final WeakReference e;
  public final t0 f;
  public boolean g = false;
  
  public v0(WeakReference paramWeakReference)
  {
    if (paramWeakReference != null)
    {
      e = paramWeakReference;
      paramWeakReference = (e)paramWeakReference.get();
      if (paramWeakReference != null) {
        paramWeakReference = paramWeakReference.c();
      } else {
        paramWeakReference = Looper.getMainLooper();
      }
      f = new t0(this, paramWeakReference);
      return;
    }
    throw new NullPointerException("GoogleApiClient reference must not be null");
  }
  
  public static final void e(j paramj)
  {
    if ((paramj instanceof h)) {
      try
      {
        ((h)paramj).release();
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(paramj)), localRuntimeException);
      }
    }
  }
  
  public final void a(j paramj)
  {
    synchronized (c)
    {
      if (paramj.getStatus().D())
      {
        paramj = (e)e.get();
      }
      else
      {
        b(paramj.getStatus());
        e(paramj);
      }
      return;
    }
  }
  
  public final void b(Status paramStatus)
  {
    synchronized (c)
    {
      d = paramStatus;
      d(paramStatus);
      return;
    }
  }
  
  public final void c() {}
  
  public final void d(Status arg1)
  {
    synchronized (c)
    {
      e locale = (e)e.get();
      return;
      throw locale;
    }
  }
}

/* Location:
 * Qualified Name:     l6.v0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */