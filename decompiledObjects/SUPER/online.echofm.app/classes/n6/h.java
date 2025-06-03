package n6;

import W5.m;
import g6.l;
import h6.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public abstract class h
  extends g
{
  public static Iterable c(b paramb)
  {
    Intrinsics.checkNotNullParameter(paramb, "<this>");
    return new a(paramb);
  }
  
  public static b d(b paramb, l paraml)
  {
    Intrinsics.checkNotNullParameter(paramb, "<this>");
    Intrinsics.checkNotNullParameter(paraml, "transform");
    return new i(paramb, paraml);
  }
  
  public static List e(b paramb)
  {
    Intrinsics.checkNotNullParameter(paramb, "<this>");
    Iterator localIterator = paramb.iterator();
    if (!localIterator.hasNext()) {
      return m.f();
    }
    paramb = localIterator.next();
    if (!localIterator.hasNext()) {
      return m.b(paramb);
    }
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      localArrayList.add(paramb);
      if (!localIterator.hasNext()) {
        break;
      }
      paramb = localIterator.next();
    }
    return localArrayList;
  }
  
  public static final class a
    implements Iterable, a
  {
    public a(b paramb) {}
    
    public Iterator iterator()
    {
      return o.iterator();
    }
  }
}

/* Location:
 * Qualified Name:     n6.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */