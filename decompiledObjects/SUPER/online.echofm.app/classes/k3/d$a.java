package k3;

import c3.l.b;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import java.util.Collections;
import java.util.Map;

public abstract class d$a
{
  public final Class a;
  
  public d$a(Class paramClass)
  {
    a = paramClass;
  }
  
  public abstract O a(O paramO);
  
  public final Class b()
  {
    return a;
  }
  
  public Map c()
  {
    return Collections.emptyMap();
  }
  
  public abstract O d(h paramh);
  
  public abstract void e(O paramO);
  
  public static final class a
  {
    public Object a;
    public l.b b;
    
    public a(Object paramObject, l.b paramb)
    {
      a = paramObject;
      b = paramb;
    }
  }
}

/* Location:
 * Qualified Name:     k3.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */