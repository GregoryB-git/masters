package c8;

import g;

public final class a1
  extends y0
{
  public final String a;
  public final String b;
  public final String c;
  
  public a1(String paramString1, String paramString2, String paramString3)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
  }
  
  public final String a()
  {
    return b;
  }
  
  public final String b()
  {
    return c;
  }
  
  public final String c()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof y0))
    {
      paramObject = (y0)paramObject;
      String str = a;
      if (str == null ? ((y0)paramObject).c() == null : str.equals(((y0)paramObject).c()))
      {
        str = b;
        if (str == null ? ((y0)paramObject).a() == null : str.equals(((y0)paramObject).a()))
        {
          str = c;
          paramObject = ((y0)paramObject).b();
          if (str == null ? paramObject == null : str.equals(paramObject)) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = a;
    int i = 0;
    int j;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    }
    str = b;
    int k;
    if (str == null) {
      k = 0;
    } else {
      k = str.hashCode();
    }
    str = c;
    if (str != null) {
      i = str.hashCode();
    }
    return ((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ i;
  }
  
  public final String toString()
  {
    String str1 = a;
    String str2 = b;
    String str3 = c;
    StringBuilder localStringBuilder = new StringBuilder("AttestationResult{recaptchaV2Token=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", playIntegrityToken=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", recaptchaEnterpriseToken=");
    return g.f(localStringBuilder, str3, "}");
  }
}

/* Location:
 * Qualified Name:     c8.a1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */