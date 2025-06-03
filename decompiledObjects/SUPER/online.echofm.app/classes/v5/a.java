package v5;

import java.util.HashMap;
import java.util.Map;

public class a
{
  public static a b;
  public final Map a = new HashMap();
  
  public static a b()
  {
    if (b == null) {
      b = new a();
    }
    return b;
  }
  
  public io.flutter.embedding.engine.a a(String paramString)
  {
    return (io.flutter.embedding.engine.a)a.get(paramString);
  }
  
  public void c(String paramString, io.flutter.embedding.engine.a parama)
  {
    if (parama != null) {
      a.put(paramString, parama);
    } else {
      a.remove(paramString);
    }
  }
  
  public void d(String paramString)
  {
    c(paramString, null);
  }
}

/* Location:
 * Qualified Name:     v5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */