package kc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sb.s;
import va.a;

public class i
  extends g
{
  public static final <T> List<T> N(b<? extends T> paramb)
  {
    ec.i.e(paramb, "<this>");
    Iterator localIterator = paramb.iterator();
    if (!localIterator.hasNext()) {
      return s.a;
    }
    paramb = localIterator.next();
    if (!localIterator.hasNext()) {
      return a.f(paramb);
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
}

/* Location:
 * Qualified Name:     kc.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */