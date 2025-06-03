package wa;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class b
  extends a
{
  public final Map<String, Object> b;
  public final a c = new a();
  public final boolean d;
  
  public b(Map<String, Object> paramMap, boolean paramBoolean)
  {
    b = paramMap;
    d = paramBoolean;
  }
  
  public final <T> T c(String paramString)
  {
    return (T)b.get(paramString);
  }
  
  public final String d()
  {
    return (String)b.get("method");
  }
  
  public final boolean e()
  {
    return d;
  }
  
  public final boolean f()
  {
    return b.containsKey("transactionId");
  }
  
  public final d v()
  {
    return c;
  }
  
  public final class a
    implements d
  {
    public Object a;
    public String b;
    public String c;
    public Object d;
    
    public final void a(Serializable paramSerializable)
    {
      a = paramSerializable;
    }
    
    public final void b(String paramString, HashMap paramHashMap)
    {
      b = "sqlite_error";
      c = paramString;
      d = paramHashMap;
    }
  }
}

/* Location:
 * Qualified Name:     wa.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */