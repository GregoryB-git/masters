package u5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import n7.d;

public final class m
  implements k
{
  public static final m c = new m(Collections.emptyMap());
  public int a;
  public final Map<String, byte[]> b;
  
  public m()
  {
    this(Collections.emptyMap());
  }
  
  public m(Map<String, byte[]> paramMap)
  {
    b = Collections.unmodifiableMap(paramMap);
  }
  
  public static boolean b(Map<String, byte[]> paramMap1, Map<String, byte[]> paramMap2)
  {
    if (paramMap1.size() != paramMap2.size()) {
      return false;
    }
    paramMap1 = paramMap1.entrySet().iterator();
    while (paramMap1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap1.next();
      if (!Arrays.equals((byte[])localEntry.getValue(), (byte[])paramMap2.get(localEntry.getKey()))) {
        return false;
      }
    }
    return true;
  }
  
  public final m a(l paraml)
  {
    HashMap localHashMap = new HashMap(b);
    Object localObject1 = Collections.unmodifiableList(new ArrayList(b));
    for (int i = 0; i < ((List)localObject1).size(); i++) {
      localHashMap.remove(((List)localObject1).get(i));
    }
    localObject1 = new HashMap(a);
    paraml = ((HashMap)localObject1).entrySet().iterator();
    Object localObject2;
    while (paraml.hasNext())
    {
      localObject2 = (Map.Entry)paraml.next();
      Object localObject3 = ((Map.Entry)localObject2).getValue();
      if ((localObject3 instanceof byte[]))
      {
        localObject3 = (byte[])localObject3;
        ((Map.Entry)localObject2).setValue(Arrays.copyOf((byte[])localObject3, localObject3.length));
      }
    }
    localObject1 = Collections.unmodifiableMap((Map)localObject1).entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      paraml = (Map.Entry)((Iterator)localObject1).next();
      localObject2 = (String)paraml.getKey();
      paraml = paraml.getValue();
      if ((paraml instanceof Long))
      {
        paraml = ByteBuffer.allocate(8).putLong(((Long)paraml).longValue()).array();
      }
      else if ((paraml instanceof String))
      {
        paraml = ((String)paraml).getBytes(d.c);
      }
      else
      {
        if (!(paraml instanceof byte[])) {
          break label270;
        }
        paraml = (byte[])paraml;
      }
      localHashMap.put(localObject2, paraml);
      continue;
      label270:
      throw new IllegalArgumentException();
    }
    if (b(b, localHashMap)) {
      return this;
    }
    return new m(localHashMap);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (m.class == paramObject.getClass())) {
      return b(b, b);
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (a == 0)
    {
      int i = 0;
      Iterator localIterator = b.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        int j = ((String)localEntry.getKey()).hashCode();
        i += (Arrays.hashCode((byte[])localEntry.getValue()) ^ j);
      }
      a = i;
    }
    return a;
  }
}

/* Location:
 * Qualified Name:     u5.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */