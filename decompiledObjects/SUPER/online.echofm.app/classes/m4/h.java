package m4;

import j4.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import k4.a;
import k4.b;

public class h
{
  public final Map a;
  public final Map b;
  public final d c;
  
  public h(Map paramMap1, Map paramMap2, d paramd)
  {
    a = paramMap1;
    b = paramMap2;
    c = paramd;
  }
  
  public static a a()
  {
    return new a();
  }
  
  public void b(Object paramObject, OutputStream paramOutputStream)
  {
    new f(paramOutputStream, a, b, c).t(paramObject);
  }
  
  public byte[] c(Object paramObject)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      b(paramObject, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException paramObject)
    {
      for (;;) {}
    }
  }
  
  public static final class a
    implements b
  {
    public static final d d = new g();
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public d c = d;
    
    public h c()
    {
      return new h(new HashMap(a), new HashMap(b), c);
    }
    
    public a d(a parama)
    {
      parama.a(this);
      return this;
    }
    
    public a f(Class paramClass, d paramd)
    {
      a.put(paramClass, paramd);
      b.remove(paramClass);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     m4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */