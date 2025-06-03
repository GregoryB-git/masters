package nc;

import sc.n;
import sc.v;

public final class i0
{
  public static final l0 a;
  
  static
  {
    int i = v.a;
    try
    {
      String str = System.getProperty("kotlinx.coroutines.main.delay");
    }
    catch (SecurityException localSecurityException)
    {
      localObject = null;
    }
    boolean bool;
    if (localObject != null) {
      bool = Boolean.parseBoolean((String)localObject);
    } else {
      bool = false;
    }
    if (bool)
    {
      localObject = r0.a;
      localObject = n.a;
      ((s1)localObject).C0();
      if ((localObject instanceof l0)) {}
    }
    else
    {
      localObject = h0.r;
      break label69;
    }
    Object localObject = (l0)localObject;
    label69:
    a = (l0)localObject;
  }
}

/* Location:
 * Qualified Name:     nc.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */