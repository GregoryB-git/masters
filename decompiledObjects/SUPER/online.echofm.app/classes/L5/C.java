package L5;

import E5.k.d;
import V2.m;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

public class C
{
  public final V2.k a = new V2.k();
  public final E5.k b;
  
  public C(E5.k paramk)
  {
    b = paramk;
  }
  
  public Object c(Map paramMap)
  {
    new Handler(Looper.getMainLooper()).post(new B(this, paramMap));
    return m.a(a.a());
  }
  
  public class a
    implements k.d
  {
    public a() {}
    
    public void a(Object paramObject)
    {
      C.b(C.this).c(paramObject);
    }
    
    public void b(String paramString1, String paramString2, Object paramObject)
    {
      HashMap localHashMap = new HashMap();
      String str = paramString2;
      if (paramString2 == null) {
        str = "An unknown error occurred";
      }
      paramString2 = localHashMap;
      if ((paramObject instanceof Map)) {
        paramString2 = (Map)paramObject;
      }
      paramString1 = new y(paramString1, str, paramString2);
      C.b(C.this).b(paramString1);
    }
    
    public void c() {}
  }
}

/* Location:
 * Qualified Name:     L5.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */