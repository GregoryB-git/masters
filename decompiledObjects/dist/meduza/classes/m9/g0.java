package m9;

import android.util.SparseArray;
import com.google.firebase.firestore.f.a;
import eb.e1;
import eb.e1.a;
import i9.n;
import j9.q;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k9.f;
import k9.i;
import ka.f0;
import ka.f0.a;
import ma.w.a;
import n9.o;
import p2.m0;
import t8.c;
import x6.b;

public final class g0
  implements q0.a
{
  public g0(h0 paramh0) {}
  
  public final void a()
  {
    q0 localq0 = a.j;
    b.Z("Writing handshake requires an opened stream", localq0.c(), new Object[0]);
    b.Z("Handshake already completed", u ^ true, new Object[0]);
    f0.a locala = f0.K();
    String str = t.b;
    locala.m();
    f0.G((f0)b, str);
    localq0.i((f0)locala.k());
  }
  
  public final void b(q paramq, ArrayList paramArrayList)
  {
    h0 localh0 = a;
    k9.g localg = (k9.g)l.poll();
    ma.h localh = j.v;
    int i = d.size();
    int j = paramArrayList.size();
    int k = 0;
    boolean bool;
    if (i == j) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Mutations sent %d must equal results received %d", bool, new Object[] { Integer.valueOf(d.size()), Integer.valueOf(paramArrayList.size()) });
    Object localObject = j9.h.a;
    List localList = d;
    while (k < localList.size())
    {
      q localq = geta;
      localObject = ((c)localObject).n(geta, localq);
      k++;
    }
    paramq = new k9.h(localg, paramq, paramArrayList, localh, (c)localObject);
    b.a(paramq);
    localh0.c();
  }
  
  public final void c(e1 parame1)
  {
    h0 localh0 = a;
    localh0.getClass();
    boolean bool = parame1.e();
    int i = 1;
    if (bool) {
      b.Z("Write stream was stopped gracefully while still needed.", localh0.h() ^ true, new Object[0]);
    }
    if ((!parame1.e()) && (!l.isEmpty()))
    {
      Object localObject;
      if (j.u)
      {
        b.Z("Handling write error with status OK.", parame1.e() ^ true, new Object[0]);
        localObject = j.d;
        int j = a.a;
        if ((!j.a((f.a)f.a.u.get(j, f.a.d))) || (a.equals(e1.a.u))) {
          i = 0;
        }
        if (i != 0)
        {
          localObject = (k9.g)l.poll();
          j.b();
          b.f(a, parame1);
          localh0.c();
        }
      }
      else
      {
        b.Z("Handling write error with status OK.", parame1.e() ^ true, new Object[0]);
        localObject = j.d;
        i = a.a;
        if (j.a((f.a)f.a.u.get(i, f.a.d)))
        {
          m0.y(1, "RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", new Object[] { o.i(j.v), parame1 });
          localObject = j;
          parame1 = q0.w;
          localObject.getClass();
          parame1.getClass();
          v = parame1;
          localObject = c;
          a.y("Set stream token", new w.g(20, localObject, parame1));
        }
      }
    }
    if (localh0.h())
    {
      b.Z("startWriteStream() called when shouldStartWriteStream() is false.", localh0.h(), new Object[0]);
      j.g();
    }
  }
  
  public final void d()
  {
    h0 localh0 = a;
    Object localObject1 = c;
    Object localObject2 = j.v;
    a.y("Set stream token", new w.g(20, localObject1, localObject2));
    localObject2 = l.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (k9.g)((Iterator)localObject2).next();
      j.j(d);
    }
  }
}

/* Location:
 * Qualified Name:     m9.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */