package e7;

import android.os.Bundle;

public final class d1
{
  public String a;
  public String b;
  public long c;
  public Bundle d;
  
  public d1(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    a = paramString1;
    b = paramString2;
    d = paramBundle;
    c = paramLong;
  }
  
  public static d1 b(f0 paramf0)
  {
    return new d1(a, c, b.E(), d);
  }
  
  public final f0 a()
  {
    return new f0(a, new a0(new Bundle(d)), b, c);
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
 * Qualified Name:     e7.d1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */