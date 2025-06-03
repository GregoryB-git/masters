package m9;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.f.a;
import e9.a;
import eb.e.a;
import eb.e1;
import eb.s0;
import j9.m;
import j9.n;
import j9.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ka.k;
import n9.o;
import q0.g;
import x6.b;

public final class t
  extends e.a<Object>
{
  public t(v.a parama, eb.e parame) {}
  
  public final void a(s0 params0, e1 parame1)
  {
    params0 = (i)a;
    params0.getClass();
    if (parame1.e())
    {
      c.trySetResult(Collections.emptyList());
    }
    else
    {
      com.google.firebase.firestore.f localf = o.g(parame1);
      if (a == f.a.t)
      {
        parame1 = d.c;
        b.t();
        c.t();
      }
      c.trySetException(localf);
    }
  }
  
  public final void c(Object paramObject)
  {
    Object localObject1 = (i)a;
    localObject1.getClass();
    paramObject = (ka.e)paramObject;
    a.add(paramObject);
    if (a.size() == b.size())
    {
      HashMap localHashMap = new HashMap();
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext())
      {
        paramObject = (ka.e)localIterator.next();
        Object localObject2 = d.a;
        localObject2.getClass();
        if (g.b(((ka.e)paramObject).K(), 1))
        {
          b.Z("Tried to deserialize a found document from a missing document.", g.b(((ka.e)paramObject).K(), 1), new Object[0]);
          j9.i locali = ((e0)localObject2).b(((ka.e)paramObject).H().L());
          localObject2 = n.e(((ka.e)paramObject).H().K());
          q localq = e0.f(((ka.e)paramObject).H().M());
          b.Z("Got a document response with no snapshot version", localq.equals(q.b) ^ true, new Object[0]);
          paramObject = new m(locali);
          ((m)paramObject).k(localq, (n)localObject2);
        }
        else
        {
          if (!g.b(((ka.e)paramObject).K(), 2)) {
            break label296;
          }
          b.Z("Tried to deserialize a missing document from a found document.", g.b(((ka.e)paramObject).K(), 2), new Object[0]);
          localObject2 = ((e0)localObject2).b(((ka.e)paramObject).I());
          paramObject = e0.f(((ka.e)paramObject).J());
          b.Z("Got a no document response with no snapshot version", ((q)paramObject).equals(q.b) ^ true, new Object[0]);
          paramObject = m.n((j9.i)localObject2, (q)paramObject);
        }
        localHashMap.put(b, paramObject);
        continue;
        label296:
        localObject1 = f.l("Unknown result case: ");
        ((StringBuilder)localObject1).append(a0.j.w(((ka.e)paramObject).K()));
        throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
      }
      paramObject = new ArrayList();
      localIterator = b.iterator();
      while (localIterator.hasNext()) {
        ((ArrayList)paramObject).add((m)localHashMap.get((j9.i)localIterator.next()));
      }
      c.trySetResult(paramObject);
    }
    b.c(1);
  }
}

/* Location:
 * Qualified Name:     m9.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */