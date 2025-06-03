package G4;

import J4.a;
import M4.l;
import N4.m;
import N4.m.b;
import com.google.firebase.perf.metrics.Trace;
import com.google.protobuf.r.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class k
{
  public final Trace a;
  
  public k(Trace paramTrace)
  {
    a = paramTrace;
  }
  
  public m a()
  {
    m.b localb = m.z0().N(a.k()).L(a.m().e()).M(a.m().d(a.j()));
    Iterator localIterator = a.i().values().iterator();
    while (localIterator.hasNext())
    {
      localObject = (g)localIterator.next();
      localb.J(((g)localObject).b(), ((g)localObject).a());
    }
    Object localObject = a.n();
    if (!((List)localObject).isEmpty())
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        localb.G(new k((Trace)((Iterator)localObject).next()).a());
      }
    }
    localb.I(a.getAttributes());
    localObject = a.b(a.l());
    if (localObject != null) {
      localb.D(Arrays.asList((Object[])localObject));
    }
    return (m)localb.v();
  }
}

/* Location:
 * Qualified Name:     G4.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */