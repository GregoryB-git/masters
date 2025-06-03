package E1;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class l$a
{
  public final void a()
  {
    Class localClass1 = m.a("com.android.billingclient.api.SkuDetailsParams");
    Class localClass2 = m.a("com.android.billingclient.api.SkuDetailsParams$Builder");
    if ((localClass1 != null) && (localClass2 != null))
    {
      Method localMethod1 = m.d(localClass1, "newBuilder", new Class[0]);
      Method localMethod2 = m.d(localClass2, "setType", new Class[] { String.class });
      Method localMethod3 = m.d(localClass2, "setSkusList", new Class[] { List.class });
      Method localMethod4 = m.d(localClass2, "build", new Class[0]);
      if ((localMethod1 != null) && (localMethod2 != null) && (localMethod3 != null) && (localMethod4 != null)) {
        l.c(new l(localClass1, localClass2, localMethod1, localMethod2, localMethod3, localMethod4));
      }
    }
  }
  
  public final l b()
  {
    if (l.a().get()) {
      return l.b();
    }
    a();
    l.a().set(true);
    return l.b();
  }
}

/* Location:
 * Qualified Name:     E1.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */