package k3;

import java.util.Map;

public abstract class n$a
{
  public final void a(String paramString1, String paramString2)
  {
    Map localMap = f;
    if (localMap != null)
    {
      localMap.put(paramString1, paramString2);
      return;
    }
    throw new IllegalStateException("Property \"autoMetadata\" has not been set");
  }
}

/* Location:
 * Qualified Name:     k3.n.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */