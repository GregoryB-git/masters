package d1;

import android.os.Bundle;
import b1.o;
import b1.t;
import b1.w;
import b1.x;
import e1.a;
import e1.a.a;
import e1.b;
import h6.e;
import java.util.concurrent.Semaphore;

public final class b$a<D>
  extends w<D>
  implements e1.b.a<D>
{
  public final int a = 0;
  public final Bundle b = null;
  public final b<D> c;
  public o d;
  public b.b<D> e;
  public b<D> f;
  
  public b$a(e parame)
  {
    c = parame;
    f = null;
    if (b == null)
    {
      b = this;
      a = 0;
      return;
    }
    throw new IllegalStateException("There is already a listener registered");
  }
  
  public final void a()
  {
    o localo = d;
    b.b localb = e;
    if ((localo != null) && (localb != null))
    {
      super.removeObserver(localb);
      observe(localo, localb);
    }
  }
  
  public final void onActive()
  {
    Object localObject = c;
    c = true;
    e = false;
    d = false;
    localObject = (e)localObject;
    j.drainPermits();
    ((b)localObject).a();
    h = new a.a((a)localObject);
    ((a)localObject).b();
  }
  
  public final void onInactive()
  {
    c.c = false;
  }
  
  public final void removeObserver(x<? super D> paramx)
  {
    super.removeObserver(paramx);
    d = null;
    e = null;
  }
  
  public final void setValue(D paramD)
  {
    super.setValue(paramD);
    paramD = f;
    if (paramD != null)
    {
      e = true;
      c = false;
      d = false;
      f = false;
      f = null;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(a);
    localStringBuilder.append(" : ");
    Class localClass = c.getClass();
    localStringBuilder.append(localClass.getSimpleName());
    localStringBuilder.append("{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(localClass)));
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d1.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */