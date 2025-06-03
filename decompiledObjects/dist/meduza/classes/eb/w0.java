package eb;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.logging.Logger;
import o7.m0;
import o7.u;

public final class w0
{
  public static final Logger d = Logger.getLogger(w0.class.getName());
  public static w0 e;
  public String a = "unknown";
  public final LinkedHashSet<v0> b = new LinkedHashSet();
  public u<String, v0> c = m0.o;
  
  public final void a()
  {
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      int i = Integer.MIN_VALUE;
      String str = "unknown";
      Iterator localIterator = b.iterator();
      while (localIterator.hasNext())
      {
        v0 localv01 = (v0)localIterator.next();
        localv01.a();
        v0 localv02 = (v0)localHashMap.get("dns");
        if ((localv02 == null) || (localv02.e() < localv01.e())) {
          localHashMap.put("dns", localv01);
        }
        if (i < localv01.e())
        {
          i = localv01.e();
          localv01.a();
          str = "dns";
        }
      }
      c = u.b(localHashMap);
      a = str;
      return;
    }
    finally {}
  }
  
  public static final class a
    implements d1.a<v0>
  {
    public final boolean a(Object paramObject)
    {
      return ((v0)paramObject).d();
    }
    
    public final int b(Object paramObject)
    {
      return ((v0)paramObject).e();
    }
  }
}

/* Location:
 * Qualified Name:     eb.w0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */