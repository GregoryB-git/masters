package e7;

import com.google.android.gms.internal.measurement.zzgf.zzf;
import com.google.android.gms.internal.measurement.zzgf.zzk;
import com.google.android.gms.internal.measurement.zzkg;
import java.util.ArrayList;
import m6.j;

public final class i6$a
{
  public zzgf.zzk a;
  public ArrayList b;
  public ArrayList c;
  public long d;
  
  public i6$a(i6 parami6) {}
  
  public final void a(zzgf.zzk paramzzk)
  {
    j.i(paramzzk);
    a = paramzzk;
  }
  
  public final boolean b(zzgf.zzf paramzzf, long paramLong)
  {
    j.i(paramzzf);
    if (c == null) {
      c = new ArrayList();
    }
    if (b == null) {
      b = new ArrayList();
    }
    if ((!c.isEmpty()) && (((zzgf.zzf)c.get(0)).zzd() / 1000L / 60L / 60L != paramzzf.zzd() / 1000L / 60L / 60L)) {
      return false;
    }
    long l = d + paramzzf.zzcf();
    e.R();
    if (l >= Math.max(0, ((Integer)h0.j.a(null)).intValue())) {
      return false;
    }
    d = l;
    c.add(paramzzf);
    b.add(Long.valueOf(paramLong));
    int i = c.size();
    e.R();
    return i < Math.max(1, ((Integer)h0.k.a(null)).intValue());
  }
}

/* Location:
 * Qualified Name:     e7.i6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */