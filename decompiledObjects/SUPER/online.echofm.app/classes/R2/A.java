package R2;

import A2.n;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;

public final class A
{
  public final String a;
  public final String b;
  public final String c;
  public final long d;
  public final long e;
  public final D f;
  
  public A(N2 paramN2, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, D paramD)
  {
    n.e(paramString2);
    n.e(paramString3);
    n.i(paramD);
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
      paramN2.j().L().c("Event created with reverse previous/current timestamps. appId, name", Y1.v(paramString2), Y1.v(paramString3));
    }
    f = paramD;
  }
  
  public A(N2 paramN2, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, Bundle paramBundle)
  {
    n.e(paramString2);
    n.e(paramString3);
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
      paramN2.j().L().b("Event created with reverse previous/current timestamps. appId", Y1.v(paramString2));
    }
    if ((paramBundle != null) && (!paramBundle.isEmpty()))
    {
      paramBundle = new Bundle(paramBundle);
      paramString3 = paramBundle.keySet().iterator();
      while (paramString3.hasNext())
      {
        paramString2 = (String)paramString3.next();
        if (paramString2 == null) {
          paramN2.j().G().a("Param name can't be null");
        }
        for (;;)
        {
          paramString3.remove();
          break;
          paramString1 = paramN2.L().s0(paramString2, paramBundle.get(paramString2));
          if (paramString1 != null) {
            break label213;
          }
          paramN2.j().L().b("Param value can't be null", paramN2.D().f(paramString2));
        }
        label213:
        paramN2.L().R(paramBundle, paramString2, paramString1);
      }
      paramN2 = new D(paramBundle);
    }
    else
    {
      paramN2 = new D(new Bundle());
    }
    f = paramN2;
  }
  
  public final A a(N2 paramN2, long paramLong)
  {
    return new A(paramN2, c, a, b, d, paramLong, f);
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
    localStringBuilder.append(str3);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     R2.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */