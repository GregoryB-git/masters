package y1;

import W5.m;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class G
  implements Serializable
{
  public static final a p = new a(null);
  private static final long serialVersionUID = 20160629001L;
  public final HashMap o;
  
  public G()
  {
    o = new HashMap();
  }
  
  public G(HashMap paramHashMap)
  {
    HashMap localHashMap = new HashMap();
    o = localHashMap;
    localHashMap.putAll(paramHashMap);
  }
  
  private final Object writeReplace()
  {
    if (T1.a.d(this)) {
      return null;
    }
    try
    {
      b localb = new b(o);
      return localb;
    }
    finally
    {
      T1.a.b(localThrowable, this);
    }
    return null;
  }
  
  public final void a(a parama, List paramList)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "accessTokenAppIdPair");
      Intrinsics.checkNotNullParameter(paramList, "appEvents");
      if (!o.containsKey(parama))
      {
        o.put(parama, m.I((Collection)paramList));
        return;
      }
    }
    finally
    {
      break label85;
      parama = (List)o.get(parama);
      if (parama != null) {
        parama.addAll((Collection)paramList);
      }
      return;
      label85:
      T1.a.b(parama, this);
    }
  }
  
  public final Set b()
  {
    if (T1.a.d(this)) {
      return null;
    }
    try
    {
      Set localSet = o.entrySet();
      Intrinsics.checkNotNullExpressionValue(localSet, "events.entries");
      return localSet;
    }
    finally
    {
      T1.a.b(localThrowable, this);
    }
    return null;
  }
  
  public static final class a {}
  
  public static final class b
    implements Serializable
  {
    public static final a p = new a(null);
    private static final long serialVersionUID = 20160629001L;
    public final HashMap o;
    
    public b(HashMap paramHashMap)
    {
      o = paramHashMap;
    }
    
    private final Object readResolve()
    {
      return new G(o);
    }
    
    public static final class a {}
  }
}

/* Location:
 * Qualified Name:     y1.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */