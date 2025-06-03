package wa;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.Result;
import java.io.Serializable;
import java.util.HashMap;

public final class c
  extends a
{
  public final a b;
  public final MethodCall c;
  
  public c(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    c = paramMethodCall;
    b = new a(paramResult);
  }
  
  public final <T> T c(String paramString)
  {
    return (T)c.argument(paramString);
  }
  
  public final String d()
  {
    return c.method;
  }
  
  public final boolean f()
  {
    return c.hasArgument("transactionId");
  }
  
  public final d v()
  {
    return b;
  }
  
  public final class a
    implements d
  {
    public a() {}
    
    public final void a(Serializable paramSerializable)
    {
      success(paramSerializable);
    }
    
    public final void b(String paramString, HashMap paramHashMap)
    {
      error("sqlite_error", paramString, paramHashMap);
    }
  }
}

/* Location:
 * Qualified Name:     wa.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */