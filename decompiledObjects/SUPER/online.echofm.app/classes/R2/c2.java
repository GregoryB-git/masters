package R2;

import android.os.Bundle;

public final class c2
{
  public String a;
  public String b;
  public long c;
  public Bundle d;
  
  public c2(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    a = paramString1;
    b = paramString2;
    paramString1 = paramBundle;
    if (paramBundle == null) {
      paramString1 = new Bundle();
    }
    d = paramString1;
    c = paramLong;
  }
  
  public static c2 b(I paramI)
  {
    return new c2(o, q, p.g(), r);
  }
  
  public final I a()
  {
    return new I(a, new D(new Bundle(d)), b, c);
  }
  
  public final String toString()
  {
    String str1 = b;
    String str2 = a;
    String str3 = String.valueOf(d);
    StringBuilder localStringBuilder = new StringBuilder("origin=");
    localStringBuilder.append(str1);
    localStringBuilder.append(",name=");
    localStringBuilder.append(str2);
    localStringBuilder.append(",params=");
    localStringBuilder.append(str3);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     R2.c2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */