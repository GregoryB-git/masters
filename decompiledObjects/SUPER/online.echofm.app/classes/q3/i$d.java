package q3;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;
import java.util.List;

public class i$d
  implements i.e
{
  public final j a;
  
  public i$d(j paramj)
  {
    a = paramj;
  }
  
  public Object a(String paramString)
  {
    Iterator localIterator = i.b(new String[] { "GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt" }).iterator();
    Object localObject1 = null;
    while (localIterator.hasNext())
    {
      Object localObject2 = (Provider)localIterator.next();
      try
      {
        localObject2 = a.a(paramString, (Provider)localObject2);
        return localObject2;
      }
      catch (Exception localException) {}
      if (localObject1 == null) {
        localObject1 = localException;
      }
    }
    throw new GeneralSecurityException("No good Provider found.", (Throwable)localObject1);
  }
}

/* Location:
 * Qualified Name:     q3.i.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */