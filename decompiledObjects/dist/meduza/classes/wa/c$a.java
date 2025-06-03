package wa;

import io.flutter.plugin.common.MethodChannel.Result;
import java.io.Serializable;
import java.util.HashMap;

public final class c$a
  implements d
{
  public final MethodChannel.Result a;
  
  public c$a(MethodChannel.Result paramResult)
  {
    a = paramResult;
  }
  
  public final void a(Serializable paramSerializable)
  {
    a.success(paramSerializable);
  }
  
  public final void b(String paramString, HashMap paramHashMap)
  {
    a.error("sqlite_error", paramString, paramHashMap);
  }
}

/* Location:
 * Qualified Name:     wa.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */