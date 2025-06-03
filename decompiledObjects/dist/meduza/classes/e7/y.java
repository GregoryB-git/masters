package e7;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import g;
import java.util.Iterator;
import java.util.Set;
import m6.j;

public final class y
{
  public final String a;
  public final String b;
  public final String c;
  public final long d;
  public final long e;
  public final a0 f;
  
  public y(j2 paramj2, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, Bundle paramBundle)
  {
    j.e(paramString2);
    j.e(paramString3);
    a = paramString2;
    b = paramString3;
    paramString3 = paramString1;
    if (TextUtils.isEmpty(paramString1)) {
      paramString3 = null;
    }
    c = paramString3;
    d = paramLong1;
    e = paramLong2;
    if ((paramLong2 != 0L) && (paramLong2 > paramLong1)) {
      zzjr.c("Event created with reverse previous/current timestamps. appId", a1.p(paramString2));
    }
    if ((paramBundle != null) && (!paramBundle.isEmpty()))
    {
      paramString1 = new Bundle(paramBundle);
      paramString2 = paramString1.keySet().iterator();
      while (paramString2.hasNext())
      {
        paramBundle = (String)paramString2.next();
        if (paramBundle == null)
        {
          zzjo.b("Param name can't be null");
        }
        else
        {
          paramString3 = paramj2.m().f0(paramString1.get(paramBundle), paramBundle);
          if (paramString3 != null) {
            break label211;
          }
          zzjr.c("Param value can't be null", u.f(paramBundle));
        }
        paramString2.remove();
        continue;
        label211:
        paramj2.m().E(paramString1, paramBundle, paramString3);
      }
      paramj2 = new a0(paramString1);
    }
    else
    {
      paramj2 = new a0(new Bundle());
    }
    f = paramj2;
  }
  
  public y(j2 paramj2, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, a0 parama0)
  {
    j.e(paramString2);
    j.e(paramString3);
    j.i(parama0);
    a = paramString2;
    b = paramString3;
    String str = paramString1;
    if (TextUtils.isEmpty(paramString1)) {
      str = null;
    }
    c = str;
    d = paramLong1;
    e = paramLong2;
    if ((paramLong2 != 0L) && (paramLong2 > paramLong1)) {
      zzjr.d("Event created with reverse previous/current timestamps. appId, name", a1.p(paramString2), a1.p(paramString3));
    }
    f = parama0;
  }
  
  public final y a(j2 paramj2, long paramLong)
  {
    return new y(paramj2, c, a, b, d, paramLong, f);
  }
  
  public final String toString()
  {
    String str1 = a;
    String str2 = b;
    String str3 = String.valueOf(f);
    StringBuilder localStringBuilder = new StringBuilder("Event{appId='");
    localStringBuilder.append(str1);
    localStringBuilder.append("', name='");
    localStringBuilder.append(str2);
    localStringBuilder.append("', params=");
    return g.f(localStringBuilder, str3, "}");
  }
}

/* Location:
 * Qualified Name:     e7.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */