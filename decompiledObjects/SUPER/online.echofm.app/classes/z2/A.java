package z2;

import android.util.Log;
import java.util.Map;
import x2.b;
import y2.a.f;

public final class A
  implements Runnable
{
  public A(B paramB, b paramb) {}
  
  public final void run()
  {
    Object localObject = p;
    localObject = (x)e.A(f).get(B.e((B)localObject));
    if (localObject == null) {
      return;
    }
    if (o.i())
    {
      B.f(p, true);
      if (B.d(p).m())
      {
        B.g(p);
        return;
      }
      try
      {
        B localB = p;
        B.d(localB).o(null, B.d(localB).e());
        return;
      }
      catch (SecurityException localSecurityException)
      {
        Log.e("GoogleApiManager", "Failed to get service from broker. ", localSecurityException);
        B.d(p).f("Failed to get service from broker.");
        ((x)localObject).G(new b(10), null);
        return;
      }
    }
    ((x)localObject).G(o, null);
  }
}

/* Location:
 * Qualified Name:     z2.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */