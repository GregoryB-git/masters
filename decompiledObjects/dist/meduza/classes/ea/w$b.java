package ea;

import android.util.Log;
import dc.l;
import ec.i;
import ec.j;
import r0.d;

public final class w$b
  extends j
  implements l<o0.a, d>
{
  public static final b a = new b();
  
  public w$b()
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    o0.a locala = (o0.a)paramObject;
    i.e(locala, "ex");
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("CorruptionException in sessions DataStore in ");
    ((StringBuilder)paramObject).append(t.b());
    ((StringBuilder)paramObject).append('.');
    Log.w("FirebaseSessionsRepo", ((StringBuilder)paramObject).toString(), locala);
    return new r0.a(true, 1);
  }
}

/* Location:
 * Qualified Name:     ea.w.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */