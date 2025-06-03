package b9;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import y8.b;
import y8.d;

public final class g
{
  public final Map<Class<?>, d<?>> a;
  public final Map<Class<?>, y8.f<?>> b;
  public final d<Object> c;
  
  public g(HashMap paramHashMap1, HashMap paramHashMap2, f paramf)
  {
    a = paramHashMap1;
    b = paramHashMap2;
    c = paramf;
  }
  
  public final void a(Object paramObject, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    Object localObject = a;
    paramByteArrayOutputStream = new e(paramByteArrayOutputStream, (Map)localObject, b, c);
    if (paramObject != null)
    {
      localObject = (d)((Map)localObject).get(paramObject.getClass());
      if (localObject != null) {
        ((y8.a)localObject).a(paramObject, paramByteArrayOutputStream);
      }
    }
    else
    {
      return;
    }
    paramByteArrayOutputStream = f.l("No encoder for ");
    paramByteArrayOutputStream.append(paramObject.getClass());
    throw new b(paramByteArrayOutputStream.toString());
  }
  
  public static final class a
    implements z8.a<a>
  {
    public static final f a = new f();
  }
}

/* Location:
 * Qualified Name:     b9.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */