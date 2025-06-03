package eb;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import n7.f;
import x6.b;

public final class s
{
  public static final f c = new f(String.valueOf(','));
  public static final s d;
  public final Map<String, a> a;
  public final byte[] b;
  
  static
  {
    s locals = new s();
    locals = new s(new j.a(), true, locals);
    d = new s(j.b.a, false, locals);
  }
  
  public s()
  {
    a = new LinkedHashMap(0);
    b = new byte[0];
  }
  
  public s(j paramj, boolean paramBoolean, s params)
  {
    Object localObject1 = paramj.a();
    b.s("Comma is currently not allowed in message encoding", ((String)localObject1).contains(",") ^ true);
    int i = a.size();
    int j = i;
    if (!a.containsKey(paramj.a())) {
      j = i + 1;
    }
    Object localObject2 = new LinkedHashMap(j);
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      params = a.a();
      if (!params.equals(localObject1)) {
        ((Map)localObject2).put(params, new a(a, b));
      }
    }
    ((Map)localObject2).put(localObject1, new a(paramj, paramBoolean));
    localObject1 = Collections.unmodifiableMap((Map)localObject2);
    a = ((Map)localObject1);
    paramj = c;
    params = new HashSet(((Map)localObject1).size());
    localObject2 = ((Map)localObject1).entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (Map.Entry)((Iterator)localObject2).next();
      if (getValueb) {
        params.add((String)((Map.Entry)localObject1).getKey());
      }
    }
    params = Collections.unmodifiableSet(params);
    paramj.getClass();
    localObject1 = params.iterator();
    params = new StringBuilder();
    paramj.a(params, (Iterator)localObject1);
    b = params.toString().getBytes(Charset.forName("US-ASCII"));
  }
  
  public static final class a
  {
    public final r a;
    public final boolean b;
    
    public a(r paramr, boolean paramBoolean)
    {
      b.y(paramr, "decompressor");
      a = paramr;
      b = paramBoolean;
    }
  }
}

/* Location:
 * Qualified Name:     eb.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */