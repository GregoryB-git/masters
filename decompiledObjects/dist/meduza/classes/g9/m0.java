package g9;

import com.google.firebase.firestore.f.a;
import j9.i;
import j9.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k9.m;
import m9.j;

public final class m0
{
  public static final ThreadPoolExecutor g;
  public final j a;
  public final HashMap<i, q> b = new HashMap();
  public final ArrayList<k9.f> c = new ArrayList();
  public boolean d;
  public com.google.firebase.firestore.f e;
  public HashSet f = new HashSet();
  
  static
  {
    Object localObject = new LinkedBlockingQueue();
    localObject = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, (BlockingQueue)localObject);
    ((ThreadPoolExecutor)localObject).allowCoreThreadTimeOut(true);
    g = (ThreadPoolExecutor)localObject;
  }
  
  public m0(j paramj)
  {
    a = paramj;
  }
  
  public final m a(i parami)
  {
    q localq = (q)b.get(parami);
    if ((!f.contains(parami)) && (localq != null))
    {
      if (localq.equals(q.b)) {
        return m.a(false);
      }
      return new m(localq, null);
    }
    return m.c;
  }
  
  public final m b(i parami)
  {
    q localq = (q)b.get(parami);
    if ((!f.contains(parami)) && (localq != null))
    {
      if (!localq.equals(q.b)) {
        return new m(localq, null);
      }
      throw new com.google.firebase.firestore.f("Can't update a document that doesn't exist.", f.a.e);
    }
    return m.a(true);
  }
}

/* Location:
 * Qualified Name:     g9.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */