package J5;

import java.util.ArrayList;
import java.util.Map;

public final class p$e
{
  public String a;
  public p.d b;
  public Boolean c;
  public Map d;
  
  public static e a(ArrayList paramArrayList)
  {
    e locale = new e();
    locale.c((String)paramArrayList.get(0));
    Object localObject = paramArrayList.get(1);
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = p.d.a((ArrayList)localObject);
    }
    locale.d((p.d)localObject);
    locale.b((Boolean)paramArrayList.get(2));
    locale.e((Map)paramArrayList.get(3));
    return locale;
  }
  
  public void b(Boolean paramBoolean)
  {
    c = paramBoolean;
  }
  
  public void c(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"name\" is null.");
  }
  
  public void d(p.d paramd)
  {
    if (paramd != null)
    {
      b = paramd;
      return;
    }
    throw new IllegalStateException("Nonnull field \"options\" is null.");
  }
  
  public void e(Map paramMap)
  {
    if (paramMap != null)
    {
      d = paramMap;
      return;
    }
    throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
  }
  
  public ArrayList f()
  {
    ArrayList localArrayList = new ArrayList(4);
    localArrayList.add(a);
    Object localObject = b;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((p.d)localObject).w();
    }
    localArrayList.add(localObject);
    localArrayList.add(c);
    localArrayList.add(d);
    return localArrayList;
  }
  
  public static final class a
  {
    public String a;
    public p.d b;
    public Boolean c;
    public Map d;
    
    public p.e a()
    {
      p.e locale = new p.e();
      locale.c(a);
      locale.d(b);
      locale.b(c);
      locale.e(d);
      return locale;
    }
    
    public a b(Boolean paramBoolean)
    {
      c = paramBoolean;
      return this;
    }
    
    public a c(String paramString)
    {
      a = paramString;
      return this;
    }
    
    public a d(p.d paramd)
    {
      b = paramd;
      return this;
    }
    
    public a e(Map paramMap)
    {
      d = paramMap;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     J5.p.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */