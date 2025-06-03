package e7;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzgc.zzd;
import com.google.android.gms.internal.measurement.zzgc.zzi;
import d2.q;

public final class g6
  extends z5
{
  public g6(i6 parami6)
  {
    super(parami6);
  }
  
  public static boolean r(String paramString)
  {
    Object localObject = (String)h0.t.a(null);
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      return false;
    }
    localObject = ((String)localObject).split(",");
    int i = localObject.length;
    for (int j = 0; j < i; j++) {
      if (paramString.equalsIgnoreCase(localObject[j].trim())) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean p(String paramString1, String paramString2)
  {
    zzgc.zzd localzzd = o().C(paramString1);
    if (localzzd == null) {
      return false;
    }
    k1 localk1 = n().l0(paramString1);
    if (localk1 == null) {
      return false;
    }
    if (((localzzd.zzq()) && (localzzd.zzh().zza() == 100)) || (k().p0(paramString1, localk1.k()))) {
      return true;
    }
    return (!TextUtils.isEmpty(paramString2)) && (Math.abs(paramString2.hashCode() % 100) < localzzd.zzh().zza());
  }
  
  public final String q(String paramString)
  {
    String str1 = o().G(paramString);
    if (!TextUtils.isEmpty(str1))
    {
      Object localObject = Uri.parse((String)h0.r.a(null));
      paramString = ((Uri)localObject).buildUpon();
      String str2 = ((Uri)localObject).getAuthority();
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(str1);
      ((StringBuilder)localObject).append(".");
      ((StringBuilder)localObject).append(str2);
      paramString.authority(((StringBuilder)localObject).toString());
      return paramString.build().toString();
    }
    return (String)h0.r.a(null);
  }
}

/* Location:
 * Qualified Name:     e7.g6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */