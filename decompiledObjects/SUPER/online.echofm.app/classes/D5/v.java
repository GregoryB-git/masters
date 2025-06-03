package D5;

import E5.f;
import java.util.HashMap;
import java.util.Map;
import t5.b;

public class v
{
  public final E5.a a;
  
  public v(w5.a parama)
  {
    a = new E5.a(parama, "flutter/system", f.a);
  }
  
  public void a()
  {
    b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("type", "memoryPressure");
    a.c(localHashMap);
  }
}

/* Location:
 * Qualified Name:     D5.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */