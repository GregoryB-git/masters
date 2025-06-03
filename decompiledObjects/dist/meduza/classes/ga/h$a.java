package ga;

import android.util.Log;
import dc.l;
import ea.t;
import ec.i;
import ec.j;
import r0.d;

public final class h$a
  extends j
  implements l<o0.a, d>
{
  public static final a a = new a();
  
  public h$a()
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    o0.a locala = (o0.a)paramObject;
    i.e(locala, "ex");
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("CorruptionException in settings DataStore in ");
    ((StringBuilder)paramObject).append(t.b());
    ((StringBuilder)paramObject).append('.');
    Log.w("SessionsSettings", ((StringBuilder)paramObject).toString(), locala);
    return new r0.a(true, 1);
  }
}

/* Location:
 * Qualified Name:     ga.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */