package e7;

import android.content.Context;
import android.os.BaseBundle;
import com.google.android.gms.internal.measurement.zzdz;
import m6.j;

public final class i3
{
  public final Context a;
  public String b;
  public String c;
  public String d;
  public Boolean e;
  public long f;
  public zzdz g;
  public boolean h = true;
  public Long i;
  public String j;
  
  public i3(Context paramContext, zzdz paramzzdz, Long paramLong)
  {
    j.i(paramContext);
    paramContext = paramContext.getApplicationContext();
    j.i(paramContext);
    a = paramContext;
    i = paramLong;
    if (paramzzdz != null)
    {
      g = paramzzdz;
      b = zzf;
      c = zze;
      d = zzd;
      h = zzc;
      f = zzb;
      j = zzh;
      paramContext = zzg;
      if (paramContext != null) {
        e = Boolean.valueOf(paramContext.getBoolean("dataCollectionDefaultEnabled", true));
      }
    }
  }
}

/* Location:
 * Qualified Name:     e7.i3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */