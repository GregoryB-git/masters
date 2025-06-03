package H4;

import N4.c;

public class a
  extends e
{
  public static final F4.a b = ;
  public final c a;
  
  public a(c paramc)
  {
    a = paramc;
  }
  
  public boolean c()
  {
    if (!g())
    {
      b.j("ApplicationInfo is invalid");
      return false;
    }
    return true;
  }
  
  public final boolean g()
  {
    Object localObject = a;
    String str;
    if (localObject == null)
    {
      localObject = b;
      str = "ApplicationInfo is null";
    }
    for (;;)
    {
      ((F4.a)localObject).j(str);
      return false;
      if (!((c)localObject).f0())
      {
        localObject = b;
        str = "GoogleAppId is null";
      }
      else if (!a.d0())
      {
        localObject = b;
        str = "AppInstanceId is null";
      }
      else if (!a.e0())
      {
        localObject = b;
        str = "ApplicationProcessState is null";
      }
      else
      {
        if (!a.c0()) {
          break;
        }
        if (!a.Z().Y())
        {
          localObject = b;
          str = "AndroidAppInfo.packageName is null";
        }
        else
        {
          if (a.Z().Z()) {
            break;
          }
          localObject = b;
          str = "AndroidAppInfo.sdkVersion is null";
        }
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     H4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */