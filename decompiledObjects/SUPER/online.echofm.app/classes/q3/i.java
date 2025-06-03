package q3;

import h3.b;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i
{
  public static final i b = new i(new j.a());
  public static final i c = new i(new j.e());
  public static final i d = new i(new j.g());
  public static final i e = new i(new j.f());
  public static final i f = new i(new j.b());
  public static final i g = new i(new j.d());
  public static final i h = new i(new j.c());
  public final e a;
  
  public i(j paramj)
  {
    if (b.c()) {
      paramj = new d(paramj, null);
    }
    for (;;)
    {
      a = paramj;
      break;
      if (q.b()) {
        paramj = new b(paramj, null);
      } else {
        paramj = new c(paramj, null);
      }
    }
  }
  
  public static List b(String... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      Provider localProvider = Security.getProvider(paramVarArgs[j]);
      if (localProvider != null) {
        localArrayList.add(localProvider);
      }
    }
    return localArrayList;
  }
  
  public Object a(String paramString)
  {
    return a.a(paramString);
  }
  
  public static class b
    implements i.e
  {
    public final j a;
    
    public b(j paramj)
    {
      a = paramj;
    }
    
    public Object a(String paramString)
    {
      Iterator localIterator = i.b(new String[] { "GmsCore_OpenSSL", "AndroidOpenSSL" }).iterator();
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
      return a.a(paramString, null);
    }
  }
  
  public static class c
    implements i.e
  {
    public final j a;
    
    public c(j paramj)
    {
      a = paramj;
    }
    
    public Object a(String paramString)
    {
      return a.a(paramString, null);
    }
  }
  
  public static class d
    implements i.e
  {
    public final j a;
    
    public d(j paramj)
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
  
  public static abstract interface e
  {
    public abstract Object a(String paramString);
  }
}

/* Location:
 * Qualified Name:     q3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */