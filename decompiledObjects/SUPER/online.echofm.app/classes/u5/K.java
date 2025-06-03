package u5;

import E5.c;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class K
  implements L.d
{
  public final c a;
  public final HashMap b = new HashMap();
  public final HashMap c = new HashMap();
  public final L.b d = new L.b();
  
  public K(c paramc)
  {
    a = paramc;
    for (Object localObject : M.a()) {
      c.put(Long.valueOf(c), localObject);
    }
  }
  
  public static G.b e(KeyEvent paramKeyEvent)
  {
    int i;
    if (paramKeyEvent.getRepeatCount() > 0) {
      i = 1;
    } else {
      i = 0;
    }
    int j = paramKeyEvent.getAction();
    if (j != 0)
    {
      if (j == 1) {
        return G.b.q;
      }
      throw new AssertionError("Unexpected event type");
    }
    if (i != 0) {
      paramKeyEvent = G.b.r;
    } else {
      paramKeyEvent = G.b.p;
    }
    return paramKeyEvent;
  }
  
  public static long j(long paramLong1, long paramLong2)
  {
    return paramLong1 & 0xFFFFFFFF | paramLong2;
  }
  
  public void a(KeyEvent paramKeyEvent, L.d.a parama)
  {
    if (!i(paramKeyEvent, parama))
    {
      q(true, Long.valueOf(0L), Long.valueOf(0L), 0L);
      parama.a(true);
    }
  }
  
  public final Long f(KeyEvent paramKeyEvent)
  {
    Long localLong = (Long)M.b.get(Long.valueOf(paramKeyEvent.getKeyCode()));
    if (localLong != null) {
      return localLong;
    }
    return Long.valueOf(j(paramKeyEvent.getKeyCode(), 73014444032L));
  }
  
  public final Long g(KeyEvent paramKeyEvent)
  {
    long l = paramKeyEvent.getScanCode();
    if (l == 0L) {}
    for (int i = paramKeyEvent.getKeyCode();; i = paramKeyEvent.getScanCode())
    {
      return Long.valueOf(j(i, 73014444032L));
      Long localLong = (Long)M.a.get(Long.valueOf(l));
      if (localLong != null) {
        return localLong;
      }
    }
  }
  
  public Map h()
  {
    return Collections.unmodifiableMap(b);
  }
  
  public final boolean i(KeyEvent paramKeyEvent, L.d.a parama)
  {
    if ((paramKeyEvent.getScanCode() == 0) && (paramKeyEvent.getKeyCode() == 0)) {
      return false;
    }
    Long localLong1 = g(paramKeyEvent);
    Long localLong2 = f(paramKeyEvent);
    ArrayList localArrayList = new ArrayList();
    Object localObject2;
    boolean bool;
    for (localObject2 : M.c)
    {
      if ((paramKeyEvent.getMetaState() & a) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      o((M.d)localObject2, bool, localLong2.longValue(), localLong1.longValue(), paramKeyEvent, localArrayList);
    }
    ??? = c.values().iterator();
    while (((Iterator)???).hasNext())
    {
      localObject2 = (M.e)((Iterator)???).next();
      if ((paramKeyEvent.getMetaState() & a) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      p((M.e)localObject2, bool, localLong2.longValue(), paramKeyEvent);
    }
    ??? = paramKeyEvent.getAction();
    if (??? != 0)
    {
      if (??? != 1) {
        return false;
      }
      ??? = 0;
    }
    else
    {
      ??? = 1;
    }
    ??? = (Long)b.get(localLong1);
    G localG = null;
    if (??? != 0)
    {
      if (??? == null) {}
      for (;;)
      {
        ??? = G.b.p;
        break;
        if (paramKeyEvent.getRepeatCount() > 0)
        {
          ??? = G.b.r;
          break;
        }
        q(false, (Long)???, localLong1, paramKeyEvent.getEventTime());
      }
      char c1 = d.a(paramKeyEvent.getUnicodeChar()).charValue();
      localObject2 = ???;
      if (c1 != 0)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(c1);
        str = ((StringBuilder)localObject2).toString();
        localObject2 = ???;
        break label359;
      }
    }
    else
    {
      if (??? == null) {
        return false;
      }
      localObject2 = G.b.q;
    }
    String str = null;
    label359:
    if (localObject2 != G.b.r)
    {
      ??? = localG;
      if (??? != 0) {
        ??? = localLong2;
      }
      r(localLong1, (Long)???);
    }
    if (localObject2 == G.b.p)
    {
      ??? = (M.e)c.get(localLong2);
      if (??? != null) {
        d ^= true;
      }
    }
    localG = new G();
    ??? = paramKeyEvent.getSource();
    if (??? != 513) {
      if (??? != 1025) {
        if (??? != 16777232) {
          if (??? != 33554433) {
            ??? = G.a.p;
          }
        }
      }
    }
    for (;;)
    {
      f = ((G.a)???);
      break;
      ??? = G.a.t;
      continue;
      ??? = G.a.s;
      continue;
      ??? = G.a.r;
      continue;
      ??? = G.a.q;
    }
    a = paramKeyEvent.getEventTime();
    b = ((G.b)localObject2);
    d = localLong2.longValue();
    c = localLong1.longValue();
    g = str;
    e = false;
    f = G.a.p;
    n(localG, parama);
    paramKeyEvent = localArrayList.iterator();
    while (paramKeyEvent.hasNext()) {
      ((Runnable)paramKeyEvent.next()).run();
    }
    return true;
  }
  
  public final void n(G paramG, L.d.a parama)
  {
    if (parama == null) {
      parama = null;
    } else {
      parama = new H(parama);
    }
    a.f("flutter/keydata", paramG.a(), parama);
  }
  
  public void o(M.d paramd, boolean paramBoolean, long paramLong1, long paramLong2, KeyEvent paramKeyEvent, ArrayList paramArrayList)
  {
    Object localObject1 = b;
    boolean[] arrayOfBoolean = new boolean[localObject1.length];
    localObject1 = new Boolean[localObject1.length];
    int i = 0;
    int j = 0;
    int m;
    for (int k = j;; k++)
    {
      Object localObject2 = b;
      m = localObject2.length;
      int n = 1;
      if (k >= m) {
        break;
      }
      localObject2 = localObject2[k];
      boolean bool = b.containsKey(Long.valueOf(a));
      arrayOfBoolean[k] = bool;
      if (b == paramLong1)
      {
        m = a.a[e(paramKeyEvent).ordinal()];
        if (m != 1)
        {
          if (m != 2)
          {
            if (m != 3) {
              continue;
            }
            if (!paramBoolean) {
              paramArrayList.add(new J(this, (M.c)localObject2, paramKeyEvent));
            }
            localObject1[k] = Boolean.valueOf(arrayOfBoolean[k]);
            m = n;
          }
          else
          {
            localObject1[k] = Boolean.valueOf(arrayOfBoolean[k]);
            continue;
          }
        }
        else
        {
          localObject1[k] = Boolean.FALSE;
          m = n;
          if (!paramBoolean)
          {
            paramArrayList.add(new I(this, (M.c)localObject2, paramLong2, paramKeyEvent));
            m = n;
          }
        }
      }
      else
      {
        m = n;
        if (j == 0) {
          if (bool) {
            m = n;
          } else {
            m = 0;
          }
        }
      }
      j = m;
    }
    if (paramBoolean)
    {
      for (m = 0; m < b.length; m++) {
        if (localObject1[m] == null) {
          if (j != 0)
          {
            localObject1[m] = Boolean.valueOf(arrayOfBoolean[m]);
          }
          else
          {
            localObject1[m] = Boolean.TRUE;
            j = 1;
          }
        }
      }
      m = i;
      if (j == 0)
      {
        localObject1[0] = Boolean.TRUE;
        m = i;
      }
    }
    else
    {
      for (j = 0;; j++)
      {
        m = i;
        if (j >= b.length) {
          break;
        }
        if (localObject1[j] == null) {
          localObject1[j] = Boolean.FALSE;
        }
      }
    }
    while (m < b.length)
    {
      if (arrayOfBoolean[m] != localObject1[m].booleanValue())
      {
        paramArrayList = b[m];
        q(localObject1[m].booleanValue(), Long.valueOf(b), Long.valueOf(a), paramKeyEvent.getEventTime());
      }
      m++;
    }
  }
  
  public void p(M.e parame, boolean paramBoolean, long paramLong, KeyEvent paramKeyEvent)
  {
    if (c == paramLong) {
      return;
    }
    if (d != paramBoolean)
    {
      boolean bool = b.containsKey(Long.valueOf(b));
      paramBoolean = bool ^ true;
      if (paramBoolean) {
        d ^= true;
      }
      q(paramBoolean, Long.valueOf(c), Long.valueOf(b), paramKeyEvent.getEventTime());
      if (!paramBoolean) {
        d ^= true;
      }
      q(bool, Long.valueOf(c), Long.valueOf(b), paramKeyEvent.getEventTime());
    }
  }
  
  public final void q(boolean paramBoolean, Long paramLong1, Long paramLong2, long paramLong)
  {
    G localG = new G();
    a = paramLong;
    G.b localb;
    if (paramBoolean) {
      localb = G.b.p;
    } else {
      localb = G.b.q;
    }
    b = localb;
    d = paramLong1.longValue();
    c = paramLong2.longValue();
    g = null;
    e = true;
    f = G.a.p;
    if ((paramLong2.longValue() != 0L) && (paramLong1.longValue() != 0L))
    {
      if (!paramBoolean) {
        paramLong1 = null;
      }
      r(paramLong2, paramLong1);
    }
    n(localG, null);
  }
  
  public void r(Long paramLong1, Long paramLong2)
  {
    if (paramLong2 != null)
    {
      if ((Long)b.put(paramLong1, paramLong2) != null) {
        throw new AssertionError("The key was not empty");
      }
    }
    else {
      if ((Long)b.remove(paramLong1) == null) {
        break label48;
      }
    }
    return;
    label48:
    throw new AssertionError("The key was empty");
  }
}

/* Location:
 * Qualified Name:     u5.K
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */