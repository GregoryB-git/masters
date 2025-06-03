package i2;

import androidx.window.extensions.layout.WindowLayoutComponent;
import ec.j;
import f2.b;
import k2.c;

public final class i$a$a
  extends j
  implements dc.a<j2.a>
{
  public static final a a = new a();
  
  public i$a$a()
  {
    super(0);
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
        ((b)localObject3).<init>(localClassLoader);
        ((h)localObject2).<init>(localClassLoader, (b)localObject3);
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
          ((b)localObject3).<init>(localClassLoader);
          f2.d.a.getClass();
          int i = f2.d.a();
          if (i >= 2)
          {
            localObject3 = new k2/d;
            ((k2.d)localObject3).<init>((WindowLayoutComponent)localObject2);
          }
          else if (i == 1)
          {
            localObject3 = new c((WindowLayoutComponent)localObject2, (b)localObject3);
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

/* Location:
 * Qualified Name:     i2.i.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */