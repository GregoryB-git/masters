package E1;

import T1.a;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class f
{
  public static final f a = new f();
  
  public static final void d(Context paramContext)
  {
    if (a.d(f.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      if (m.a("com.android.billingclient.api.Purchase") == null) {
        return;
      }
      localObject = h.s;
      paramContext = ((h.b)localObject).c(paramContext);
      if (paramContext == null) {
        return;
      }
      if (!((h.b)localObject).f().get()) {
        break label94;
      }
      boolean bool = j.d();
      if (bool)
      {
        localObject = new E1/d;
        ((d)localObject).<init>();
        paramContext.p("inapp", (Runnable)localObject);
      }
    }
    finally
    {
      break label95;
    }
    Object localObject = new E1/e;
    ((e)localObject).<init>();
    paramContext.o("inapp", (Runnable)localObject);
    label94:
    return;
    label95:
    a.b(paramContext, f.class);
  }
  
  public static final void e()
  {
    if (a.d(f.class)) {
      return;
    }
    try
    {
      a.c();
      return;
    }
    finally
    {
      a.b(localThrowable, f.class);
    }
  }
  
  public static final void f()
  {
    if (a.d(f.class)) {
      return;
    }
    try
    {
      a.c();
      return;
    }
    finally
    {
      a.b(localThrowable, f.class);
    }
  }
  
  public final void c()
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Object localObject = j.a;
      localObject = h.s;
      j.e(((h.b)localObject).d(), ((h.b)localObject).e());
      ((h.b)localObject).d().clear();
      return;
    }
    finally
    {
      a.b(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     E1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */