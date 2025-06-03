package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import o2.j;
import o2.p;
import p2.k0;
import w1.b;

public final class WorkManagerInitializer
  implements b<p>
{
  public static final String a = j.f("WrkMgrInitializer");
  
  public final List<Class<? extends b<?>>> a()
  {
    return Collections.emptyList();
  }
  
  public final Object b(Context paramContext)
  {
    j.d().a(a, "Initializing WorkManager with default configuration.");
    k0.f(paramContext, new a(new a.a()));
    return k0.d(paramContext);
  }
}

/* Location:
 * Qualified Name:     androidx.work.WorkManagerInitializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */