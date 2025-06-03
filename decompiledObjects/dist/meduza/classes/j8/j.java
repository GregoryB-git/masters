package j8;

import android.util.Log;
import fa.b;
import fa.b.b;
import java.util.Objects;
import p8.e;

public final class j
  implements b
{
  public final w a;
  public final i b;
  
  public j(w paramw, e parame)
  {
    a = paramw;
    b = new i(parame);
  }
  
  public final void a(b.b paramb)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("App Quality Sessions session changed: ");
    ((StringBuilder)localObject).append(paramb);
    localObject = ((StringBuilder)localObject).toString();
    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
      Log.d("FirebaseCrashlytics", (String)localObject, null);
    }
    localObject = b;
    paramb = a;
    try
    {
      if (!Objects.equals(c, paramb))
      {
        i.a(a, b, paramb);
        c = paramb;
      }
      return;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  public final boolean b()
  {
    return a.b();
  }
  
  public final void c() {}
}

/* Location:
 * Qualified Name:     j8.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */