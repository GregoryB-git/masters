package F;

import android.util.Base64;
import java.util.List;

public final class e
{
  public final String a;
  public final String b;
  public final String c;
  public final List d;
  public final int e;
  public final String f;
  
  public e(String paramString1, String paramString2, String paramString3, List paramList)
  {
    a = ((String)H.e.b(paramString1));
    b = ((String)H.e.b(paramString2));
    c = ((String)H.e.b(paramString3));
    d = ((List)H.e.b(paramList));
    e = 0;
    f = a(paramString1, paramString2, paramString3);
  }
  
  public final String a(String paramString1, String paramString2, String paramString3)
  {
    paramString1 = new StringBuilder(paramString1);
    paramString1.append("-");
    paramString1.append(paramString2);
    paramString1.append("-");
    paramString1.append(paramString3);
    return paramString1.toString();
  }
  
  public List b()
  {
    return d;
  }
  
  public int c()
  {
    return e;
  }
  
  public String d()
  {
    return f;
  }
  
  public String e()
  {
    return a;
  }
  
  public String f()
  {
    return b;
  }
  
  public String g()
  {
    return c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("FontRequest {mProviderAuthority: ");
    ((StringBuilder)localObject).append(a);
    ((StringBuilder)localObject).append(", mProviderPackage: ");
    ((StringBuilder)localObject).append(b);
    ((StringBuilder)localObject).append(", mQuery: ");
    ((StringBuilder)localObject).append(c);
    ((StringBuilder)localObject).append(", mCertificates:");
    localStringBuilder.append(((StringBuilder)localObject).toString());
    for (int i = 0; i < d.size(); i++)
    {
      localStringBuilder.append(" [");
      localObject = (List)d.get(i);
      for (int j = 0; j < ((List)localObject).size(); j++)
      {
        localStringBuilder.append(" \"");
        localStringBuilder.append(Base64.encodeToString((byte[])((List)localObject).get(j), 0));
        localStringBuilder.append("\"");
      }
      localStringBuilder.append(" ]");
    }
    localStringBuilder.append("}");
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("mCertificatesArray: ");
    ((StringBuilder)localObject).append(e);
    localStringBuilder.append(((StringBuilder)localObject).toString());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     F.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */