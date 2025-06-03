package p5;

import E5.k.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c
  extends a
{
  public final Map a;
  public final a b = new a();
  public final boolean c;
  
  public c(Map paramMap, boolean paramBoolean)
  {
    a = paramMap;
    c = paramBoolean;
  }
  
  public Object c(String paramString)
  {
    return a.get(paramString);
  }
  
  public boolean e()
  {
    return c;
  }
  
  public String i()
  {
    return (String)a.get("method");
  }
  
  public boolean j(String paramString)
  {
    return a.containsKey(paramString);
  }
  
  public f o()
  {
    return b;
  }
  
  public Map p()
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap2.put("code", b.b);
    localHashMap2.put("message", b.c);
    localHashMap2.put("data", b.d);
    localHashMap1.put("error", localHashMap2);
    return localHashMap1;
  }
  
  public Map q()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("result", b.a);
    return localHashMap;
  }
  
  public void r(k.d paramd)
  {
    a locala = b;
    paramd.b(b, c, d);
  }
  
  public void s(List paramList)
  {
    if (!e()) {
      paramList.add(p());
    }
  }
  
  public void t(List paramList)
  {
    if (!e()) {
      paramList.add(q());
    }
  }
  
  public class a
    implements f
  {
    public Object a;
    public String b;
    public String c;
    public Object d;
    
    public a() {}
    
    public void a(Object paramObject)
    {
      a = paramObject;
    }
    
    public void b(String paramString1, String paramString2, Object paramObject)
    {
      b = paramString1;
      c = paramString2;
      d = paramObject;
    }
  }
}

/* Location:
 * Qualified Name:     p5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */