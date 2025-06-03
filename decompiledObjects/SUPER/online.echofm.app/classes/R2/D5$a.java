package R2;

import A2.n;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.d2;
import java.util.ArrayList;
import java.util.List;

public final class D5$a
  implements t
{
  public d2 a;
  public List b;
  public List c;
  public long d;
  
  public D5$a(D5 paramD5) {}
  
  public static long c(Y1 paramY1)
  {
    return paramY1.Y() / 1000L / 60L / 60L;
  }
  
  public final void a(d2 paramd2)
  {
    n.i(paramd2);
    a = paramd2;
  }
  
  public final boolean b(long paramLong, Y1 paramY1)
  {
    n.i(paramY1);
    if (c == null) {
      c = new ArrayList();
    }
    if (b == null) {
      b = new ArrayList();
    }
    if ((!c.isEmpty()) && (c((Y1)c.get(0)) != c(paramY1))) {
      return false;
    }
    long l = d + paramY1.a();
    e.c0();
    if (l >= Math.max(0, ((Integer)K.k.a(null)).intValue())) {
      return false;
    }
    d = l;
    c.add(paramY1);
    b.add(Long.valueOf(paramLong));
    int i = c.size();
    e.c0();
    return i < Math.max(1, ((Integer)K.l.a(null)).intValue());
  }
}

/* Location:
 * Qualified Name:     R2.D5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */