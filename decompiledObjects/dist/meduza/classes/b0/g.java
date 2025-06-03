package b0;

import android.util.Base64;
import f;
import java.util.List;

public final class g
{
  public final String a;
  public final String b;
  public final String c;
  public final List<List<byte[]>> d;
  public final String e;
  
  public g(String paramString1, String paramString2, String paramString3, List<List<byte[]>> paramList)
  {
    paramString1.getClass();
    a = paramString1;
    paramString2.getClass();
    b = paramString2;
    c = paramString3;
    paramList.getClass();
    d = paramList;
    paramList = new StringBuilder();
    paramList.append(paramString1);
    paramList.append("-");
    paramList.append(paramString2);
    paramList.append("-");
    paramList.append(paramString3);
    e = paramList.toString();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = f.l("FontRequest {mProviderAuthority: ");
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
    return g.f(localStringBuilder, "}", "mCertificatesArray: 0");
  }
}

/* Location:
 * Qualified Name:     b0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */