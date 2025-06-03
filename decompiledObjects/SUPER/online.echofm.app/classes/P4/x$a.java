package P4;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import t0.f;
import z2.c;
import z2.c.a;

public class x$a
  implements c.a
{
  public static final AtomicReference a = new AtomicReference();
  
  public static void c(Context paramContext)
  {
    paramContext = (Application)paramContext.getApplicationContext();
    AtomicReference localAtomicReference = a;
    if (localAtomicReference.get() == null)
    {
      a locala = new a();
      if (f.a(localAtomicReference, null, locala))
      {
        c.c(paramContext);
        c.b().a(locala);
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    x.b(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     P4.x.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */