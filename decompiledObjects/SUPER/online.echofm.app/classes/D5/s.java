package D5;

import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import E5.q;
import java.util.HashMap;
import java.util.Map;
import t5.b;
import w5.a;

public class s
{
  public final boolean a;
  public byte[] b;
  public k c;
  public k.d d;
  public boolean e = false;
  public boolean f = false;
  public final k.c g;
  
  public s(k paramk, boolean paramBoolean)
  {
    b localb = new b();
    g = localb;
    c = paramk;
    a = paramBoolean;
    paramk.e(localb);
  }
  
  public s(a parama, boolean paramBoolean)
  {
    this(new k(parama, "flutter/restoration", q.b), paramBoolean);
  }
  
  public void g()
  {
    b = null;
  }
  
  public byte[] h()
  {
    return b;
  }
  
  public final Map i(byte[] paramArrayOfByte)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("enabled", Boolean.TRUE);
    localHashMap.put("data", paramArrayOfByte);
    return localHashMap;
  }
  
  public void j(final byte[] paramArrayOfByte)
  {
    e = true;
    k.d locald = d;
    if (locald != null)
    {
      locald.a(i(paramArrayOfByte));
      d = null;
    }
    while (!f)
    {
      b = paramArrayOfByte;
      break;
    }
    c.d("push", i(paramArrayOfByte), new a(paramArrayOfByte));
  }
  
  public class a
    implements k.d
  {
    public a(byte[] paramArrayOfByte) {}
    
    public void a(Object paramObject)
    {
      s.b(s.this, paramArrayOfByte);
    }
    
    public void b(String paramString1, String paramString2, Object paramObject)
    {
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("Error ");
      ((StringBuilder)paramObject).append(paramString1);
      ((StringBuilder)paramObject).append(" while sending restoration data to framework: ");
      ((StringBuilder)paramObject).append(paramString2);
      b.b("RestorationChannel", ((StringBuilder)paramObject).toString());
    }
    
    public void c() {}
  }
  
  public class b
    implements k.c
  {
    public b() {}
    
    public void onMethodCall(j paramj, k.d paramd)
    {
      String str = a;
      paramj = b;
      str.hashCode();
      if (!str.equals("get"))
      {
        if (!str.equals("put")) {
          paramd.c();
        } else {
          s.b(s.this, (byte[])paramj);
        }
      }
      else {
        for (paramj = null;; paramj = s.e(paramj, s.a(paramj)))
        {
          paramd.a(paramj);
          break;
          s.c(s.this, true);
          if (!s.d(s.this))
          {
            paramj = s.this;
            if (a)
            {
              s.f(paramj, paramd);
              break;
            }
          }
          paramj = s.this;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     D5.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */