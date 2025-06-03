package g9;

import f;
import j9.i;
import j9.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.d0;

public final class x
  extends l
{
  public final ArrayList d;
  
  public x(j9.l paraml, d0 paramd0)
  {
    super(paraml, locala, paramd0);
    paraml = new ArrayList();
    d = paraml;
    paraml.addAll(h(locala, paramd0));
  }
  
  public static ArrayList h(l.a parama, d0 paramd0)
  {
    boolean bool;
    if ((parama != l.a.r) && (parama != l.a.s)) {
      bool = false;
    } else {
      bool = true;
    }
    x6.b.Z("extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", bool, new Object[0]);
    x6.b.Z("KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", s.h(paramd0), new Object[0]);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramd0.R().h().iterator();
    while (localIterator.hasNext())
    {
      paramd0 = (d0)localIterator.next();
      bool = s.k(paramd0);
      x6.b.Z(g.f(f.l("Comparing on key with "), a, ", but an array value was not a ReferenceValue"), bool, new Object[0]);
      localArrayList.add(i.h(paramd0.Z()));
    }
    return localArrayList;
  }
  
  public final boolean d(j9.g paramg)
  {
    return d.contains(paramg.getKey());
  }
}

/* Location:
 * Qualified Name:     g9.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */