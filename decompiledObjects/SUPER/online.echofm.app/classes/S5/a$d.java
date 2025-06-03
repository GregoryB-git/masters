package S5;

import java.util.ArrayList;
import java.util.Map;

public final class a$d
{
  public Boolean a;
  public Boolean b;
  public Map c;
  
  public static d a(ArrayList paramArrayList)
  {
    d locald = new d();
    locald.f((Boolean)paramArrayList.get(0));
    locald.e((Boolean)paramArrayList.get(1));
    locald.g((Map)paramArrayList.get(2));
    return locald;
  }
  
  public Boolean b()
  {
    return b;
  }
  
  public Boolean c()
  {
    return a;
  }
  
  public Map d()
  {
    return c;
  }
  
  public void e(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      b = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
  }
  
  public void f(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      a = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
  }
  
  public void g(Map paramMap)
  {
    if (paramMap != null)
    {
      c = paramMap;
      return;
    }
    throw new IllegalStateException("Nonnull field \"headers\" is null.");
  }
  
  public ArrayList h()
  {
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(a);
    localArrayList.add(b);
    localArrayList.add(c);
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     S5.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */