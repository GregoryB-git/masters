package wa;

import java.io.Serializable;
import java.util.HashMap;

public final class b$a
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

/* Location:
 * Qualified Name:     wa.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */