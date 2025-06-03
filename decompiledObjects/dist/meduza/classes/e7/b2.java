package e7;

import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzgc.zzd;
import java.util.Map;
import m6.j;
import r.f;
import r.h;

public final class b2
  extends f<String, zzb>
{
  public b2(w1 paramw1)
  {
    super(20);
  }
  
  public final Object create(Object paramObject)
  {
    String str = (String)paramObject;
    j.e(str);
    w1 localw1 = a;
    localw1.p();
    j.e(str);
    boolean bool = localw1.H(str);
    paramObject = null;
    if (bool)
    {
      if ((q.containsKey(str)) && (q.getOrDefault(str, null) != null)) {
        localw1.y(str, (zzgc.zzd)q.getOrDefault(str, null));
      } else {
        localw1.L(str);
      }
      paramObject = (zzb)s.snapshot().get(str);
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     e7.b2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */