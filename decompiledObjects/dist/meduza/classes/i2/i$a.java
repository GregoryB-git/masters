package i2;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.layout.adapter.sidecar.SidecarCompat.a;
import b.z;
import ec.t;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import k2.c;
import rb.g;

public final class i$a
{
  public static final g b = z.n(a.a);
  public static x6.b c = x6.b.d;
  
  static
  {
    t.a(i.class).e();
  }
  
  public static j a(Context paramContext)
  {
    ec.i.e(paramContext, "context");
    locala = (j2.a)b.getValue();
    localObject1 = locala;
    ReentrantLock localReentrantLock;
    if (locala == null)
    {
      localObject1 = androidx.window.layout.adapter.sidecar.b.c;
      if (androidx.window.layout.adapter.sidecar.b.c == null)
      {
        localReentrantLock = androidx.window.layout.adapter.sidecar.b.d;
        localReentrantLock.lock();
      }
    }
    for (;;)
    {
      try
      {
        localObject1 = androidx.window.layout.adapter.sidecar.b.c;
        if (localObject1 == null) {
          locala = null;
        }
      }
      finally
      {
        Object localObject2;
        int i;
        localReentrantLock.unlock();
      }
      try
      {
        localObject2 = SidecarCompat.a.c();
        i = 0;
        if (localObject2 != null)
        {
          localObject1 = f2.i.f;
          ec.i.e(localObject1, "other");
          localObject2 = e.getValue();
          ec.i.d(localObject2, "<get-bigInteger>(...)");
          localObject2 = (BigInteger)localObject2;
          localObject1 = e.getValue();
          ec.i.d(localObject1, "<get-bigInteger>(...)");
          if (((BigInteger)localObject2).compareTo((BigInteger)localObject1) >= 0) {
            i = 1;
          }
        }
        localObject1 = locala;
        if (i != 0)
        {
          localObject1 = new androidx/window/layout/adapter/sidecar/SidecarCompat;
          ((SidecarCompat)localObject1).<init>(paramContext);
          boolean bool = ((SidecarCompat)localObject1).j();
          if (!bool) {
            localObject1 = locala;
          }
        }
      }
      finally
      {
        localObject1 = locala;
      }
    }
    paramContext = new androidx/window/layout/adapter/sidecar/b;
    paramContext.<init>((SidecarCompat)localObject1);
    androidx.window.layout.adapter.sidecar.b.c = paramContext;
    paramContext = rb.h.a;
    localReentrantLock.unlock();
    localObject1 = androidx.window.layout.adapter.sidecar.b.c;
    ec.i.b(localObject1);
    paramContext = new j(o.b, (j2.a)localObject1);
    c.getClass();
    return paramContext;
  }
  
  public static final class a
    extends ec.j
    implements dc.a<j2.a>
  {
    public static final a a = new a();
    
    public a()
    {
      super();
    }
    
    public final Object invoke()
    {
      Object localObject1 = null;
      Object localObject5;
      try
      {
        ClassLoader localClassLoader = i.class.getClassLoader();
        Object localObject2;
        if (localClassLoader != null)
        {
          localObject2 = new i2/h;
          localObject3 = new f2/b;
          ((f2.b)localObject3).<init>(localClassLoader);
          ((h)localObject2).<init>(localClassLoader, (f2.b)localObject3);
        }
        else
        {
          localObject2 = null;
        }
        Object localObject3 = localObject1;
        if (localObject2 != null)
        {
          localObject2 = ((h)localObject2).a();
          localObject3 = localObject1;
          if (localObject2 != null)
          {
            localObject3 = new f2/b;
            ec.i.d(localClassLoader, "loader");
            ((f2.b)localObject3).<init>(localClassLoader);
            f2.d.a.getClass();
            int i = f2.d.a();
            if (i >= 2)
            {
              localObject3 = new k2/d;
              ((k2.d)localObject3).<init>((WindowLayoutComponent)localObject2);
            }
            else if (i == 1)
            {
              localObject3 = new c((WindowLayoutComponent)localObject2, (f2.b)localObject3);
            }
            else
            {
              localObject3 = new k2.a();
            }
          }
        }
      }
      finally
      {
        localObject5 = i.a.a;
        localObject5 = localObject1;
      }
      return localObject5;
    }
  }
}

/* Location:
 * Qualified Name:     i2.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */