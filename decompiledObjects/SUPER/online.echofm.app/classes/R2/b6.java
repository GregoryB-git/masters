package R2;

import A2.n;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.W1;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Y3.b;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.f2.a;
import com.google.android.gms.internal.measurement.g2;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.internal.measurement.x1;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t.a;

public final class b6
  extends C5
{
  public String d;
  public Set e;
  public Map f;
  public Long g;
  public Long h;
  
  public b6(D5 paramD5)
  {
    super(paramD5);
  }
  
  public final boolean A(int paramInt1, int paramInt2)
  {
    d6 locald6 = (d6)f.get(Integer.valueOf(paramInt1));
    if (locald6 == null) {
      return false;
    }
    return d6.b(locald6).get(paramInt2);
  }
  
  public final boolean x()
  {
    return false;
  }
  
  public final d6 y(Integer paramInteger)
  {
    if (f.containsKey(paramInteger)) {
      return (d6)f.get(paramInteger);
    }
    d6 locald6 = new d6(this, d, null);
    f.put(paramInteger, locald6);
    return locald6;
  }
  
  public final List z(String paramString, List paramList1, List paramList2, Long paramLong1, Long paramLong2)
  {
    n.e(paramString);
    n.i(paramList1);
    n.i(paramList2);
    d = paramString;
    e = new HashSet();
    f = new a();
    g = paramLong1;
    h = paramLong2;
    paramString = paramList1.iterator();
    while (paramString.hasNext()) {
      if ("_s".equals(((com.google.android.gms.internal.measurement.Y1)paramString.next()).b0()))
      {
        i = 1;
        break label99;
      }
    }
    int i = 0;
    label99:
    int j;
    if ((A6.a()) && (f().D(d, K.j0))) {
      j = 1;
    } else {
      j = 0;
    }
    int k;
    if ((A6.a()) && (f().D(d, K.i0))) {
      k = 1;
    } else {
      k = 0;
    }
    if (i != 0)
    {
      paramLong1 = q();
      paramString = d;
      paramLong1.u();
      paramLong1.n();
      n.e(paramString);
      paramLong2 = new ContentValues();
      paramLong2.put("current_session_count", Integer.valueOf(0));
      try
      {
        paramLong1.B().update("events", paramLong2, "app_id = ?", new String[] { paramString });
      }
      catch (SQLiteException paramLong2)
      {
        paramLong1.j().G().c("Error resetting session-scoped event counts. appId", Y1.v(paramString), paramLong2);
      }
    }
    paramString = Collections.emptyMap();
    paramLong2 = paramString;
    if (k != 0)
    {
      paramLong2 = paramString;
      if (j != 0) {
        paramLong2 = q().O0(d);
      }
    }
    Object localObject1 = q().N0(d);
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    long l;
    if (!((Map)localObject1).isEmpty())
    {
      localObject2 = new HashSet(((Map)localObject1).keySet());
      Object localObject8;
      Object localObject9;
      if (i != 0)
      {
        paramLong1 = d;
        paramString = q().P0(d);
        n.e(paramLong1);
        n.i(localObject1);
        paramLong1 = new a();
        if (!((Map)localObject1).isEmpty())
        {
          localObject3 = ((Map)localObject1).keySet().iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject4 = (Integer)((Iterator)localObject3).next();
            ((Integer)localObject4).intValue();
            localObject5 = (f2)((Map)localObject1).get(localObject4);
            localObject6 = (List)paramString.get(localObject4);
            if ((localObject6 == null) || (!((List)localObject6).isEmpty()))
            {
              localObject7 = o().N(((f2)localObject5).Z(), (List)localObject6);
              if (!((List)localObject7).isEmpty())
              {
                localObject7 = ((f2.a)((Y3)localObject5).x()).y().z((Iterable)localObject7);
                localObject8 = o().N(((f2)localObject5).b0(), (List)localObject6);
                ((f2.a)localObject7).C().D((Iterable)localObject8);
                localObject8 = new ArrayList();
                localObject9 = ((f2)localObject5).Y().iterator();
                while (((Iterator)localObject9).hasNext())
                {
                  com.google.android.gms.internal.measurement.X1 localX1 = (com.google.android.gms.internal.measurement.X1)((Iterator)localObject9).next();
                  if (!((List)localObject6).contains(Integer.valueOf(localX1.k()))) {
                    ((List)localObject8).add(localX1);
                  }
                }
                ((f2.a)localObject7).w().x((Iterable)localObject8);
                localObject8 = new ArrayList();
                localObject9 = ((f2)localObject5).a0().iterator();
                while (((Iterator)localObject9).hasNext())
                {
                  localObject5 = (g2)((Iterator)localObject9).next();
                  if (!((List)localObject6).contains(Integer.valueOf(((g2)localObject5).K()))) {
                    ((List)localObject8).add(localObject5);
                  }
                }
                ((f2.a)localObject7).A().B((Iterable)localObject8);
                paramLong1.put(localObject4, (f2)((Y3.b)localObject7).p());
              }
            }
            else
            {
              for (;;)
              {
                break;
                paramLong1.put(localObject4, localObject5);
              }
            }
          }
        }
        paramString = paramLong1;
      }
      else
      {
        paramString = (String)localObject1;
      }
      localObject2 = ((Set)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Integer)((Iterator)localObject2).next();
        ((Integer)localObject3).intValue();
        localObject7 = (f2)paramString.get(localObject3);
        localObject4 = new BitSet();
        localObject5 = new BitSet();
        localObject6 = new a();
        if ((localObject7 != null) && (((f2)localObject7).k() != 0))
        {
          localObject8 = ((f2)localObject7).Y().iterator();
          while (((Iterator)localObject8).hasNext())
          {
            paramLong1 = (com.google.android.gms.internal.measurement.X1)((Iterator)localObject8).next();
            if (paramLong1.O())
            {
              i = paramLong1.k();
              if (paramLong1.N()) {
                paramLong1 = Long.valueOf(paramLong1.K());
              } else {
                paramLong1 = null;
              }
              ((Map)localObject6).put(Integer.valueOf(i), paramLong1);
            }
          }
        }
        localObject8 = new a();
        if ((localObject7 != null) && (((f2)localObject7).N() != 0))
        {
          paramLong1 = ((f2)localObject7).a0().iterator();
          while (paramLong1.hasNext())
          {
            localObject9 = (g2)paramLong1.next();
            if ((((g2)localObject9).P()) && (((g2)localObject9).k() > 0)) {
              ((Map)localObject8).put(Integer.valueOf(((g2)localObject9).K()), Long.valueOf(((g2)localObject9).G(((g2)localObject9).k() - 1)));
            }
          }
        }
        paramLong1 = paramString;
        if (localObject7 != null) {
          for (i = 0;; i++)
          {
            paramLong1 = paramString;
            if (i >= ((f2)localObject7).R() << 6) {
              break;
            }
            if (N5.d0(((f2)localObject7).b0(), i))
            {
              j().K().c("Filter already evaluated. audience ID, filter ID", localObject3, Integer.valueOf(i));
              ((BitSet)localObject5).set(i);
              if (N5.d0(((f2)localObject7).Z(), i))
              {
                ((BitSet)localObject4).set(i);
                continue;
              }
            }
            ((Map)localObject6).remove(Integer.valueOf(i));
          }
        }
        paramString = (f2)((Map)localObject1).get(localObject3);
        if ((k != 0) && (j != 0))
        {
          localObject7 = (List)paramLong2.get(localObject3);
          if ((localObject7 != null) && (h != null) && (g != null))
          {
            localObject7 = ((List)localObject7).iterator();
            while (((Iterator)localObject7).hasNext())
            {
              localObject9 = (x1)((Iterator)localObject7).next();
              i = ((x1)localObject9).L();
              l = h.longValue() / 1000L;
              if (((x1)localObject9).S()) {
                l = g.longValue() / 1000L;
              }
              if (((Map)localObject6).containsKey(Integer.valueOf(i))) {
                ((Map)localObject6).put(Integer.valueOf(i), Long.valueOf(l));
              }
              if (((Map)localObject8).containsKey(Integer.valueOf(i))) {
                ((Map)localObject8).put(Integer.valueOf(i), Long.valueOf(l));
              }
            }
          }
        }
        paramString = new d6(this, d, paramString, (BitSet)localObject4, (BitSet)localObject5, (Map)localObject6, (Map)localObject8, null);
        f.put(localObject3, paramString);
        paramString = paramLong1;
      }
    }
    boolean bool;
    if (!paramList1.isEmpty())
    {
      localObject1 = new f6(this, null);
      localObject2 = new a();
      localObject3 = paramList1.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        paramLong2 = (com.google.android.gms.internal.measurement.Y1)((Iterator)localObject3).next();
        localObject4 = ((f6)localObject1).a(d, paramLong2);
        if (localObject4 != null)
        {
          paramString = q();
          paramList1 = d;
          paramLong1 = ((com.google.android.gms.internal.measurement.Y1)localObject4).b0();
          localObject6 = paramString.C0(paramList1, paramLong2.b0());
          if (localObject6 == null)
          {
            paramString.j().L().c("Event aggregate wasn't created during raw event logging. appId, event", Y1.v(paramList1), paramString.h().c(paramLong1));
            paramLong1 = new E(paramList1, paramLong2.b0(), 1L, 1L, 1L, paramLong2.Y(), 0L, null, null, null, null);
          }
          else
          {
            paramLong1 = new E(a, b, c + 1L, d + 1L, e + 1L, f, g, h, i, j, k);
          }
          q().T(paramLong1);
          l = c;
          paramList1 = ((com.google.android.gms.internal.measurement.Y1)localObject4).b0();
          paramString = (Map)((Map)localObject2).get(paramList1);
          paramLong2 = paramString;
          if (paramString == null)
          {
            paramLong2 = q().H0(d, paramList1);
            ((Map)localObject2).put(paramList1, paramLong2);
          }
          localObject6 = paramLong2.keySet().iterator();
          paramString = (String)localObject2;
          paramList1 = (List)localObject1;
          for (;;)
          {
            localObject1 = paramList1;
            localObject2 = paramString;
            if (!((Iterator)localObject6).hasNext()) {
              break;
            }
            localObject2 = (Integer)((Iterator)localObject6).next();
            j = ((Integer)localObject2).intValue();
            if (e.contains(localObject2))
            {
              j().K().b("Skipping failed audience ID", localObject2);
            }
            else
            {
              localObject1 = ((List)paramLong2.get(localObject2)).iterator();
              bool = true;
              while (((Iterator)localObject1).hasNext())
              {
                localObject5 = (x1)((Iterator)localObject1).next();
                localObject7 = new h6(this, d, j, (x1)localObject5);
                bool = ((h6)localObject7).k(g, h, (com.google.android.gms.internal.measurement.Y1)localObject4, l, paramLong1, A(j, ((x1)localObject5).L()));
                if (bool) {
                  y((Integer)localObject2).c((d)localObject7);
                } else {
                  e.add(localObject2);
                }
              }
              if (!bool) {
                e.add(localObject2);
              }
            }
          }
        }
      }
    }
    if (!paramList2.isEmpty())
    {
      paramLong1 = new a();
      paramLong2 = paramList2.iterator();
      label2410:
      label2423:
      while (paramLong2.hasNext())
      {
        paramList2 = (h2)paramLong2.next();
        localObject2 = paramList2.Z();
        paramList1 = (Map)paramLong1.get(localObject2);
        paramString = paramList1;
        if (paramList1 == null)
        {
          paramString = q().J0(d, (String)localObject2);
          paramLong1.put(localObject2, paramString);
        }
        localObject2 = paramString.keySet().iterator();
        for (;;)
        {
          if (!((Iterator)localObject2).hasNext()) {
            break label2423;
          }
          localObject1 = (Integer)((Iterator)localObject2).next();
          j = ((Integer)localObject1).intValue();
          if (e.contains(localObject1))
          {
            j().K().b("Skipping failed audience ID", localObject1);
            break;
          }
          localObject4 = ((List)paramString.get(localObject1)).iterator();
          bool = true;
          while (((Iterator)localObject4).hasNext())
          {
            localObject3 = (A1)((Iterator)localObject4).next();
            if (j().C(2))
            {
              localObject6 = j().K();
              if (((A1)localObject3).P()) {
                paramList1 = Integer.valueOf(((A1)localObject3).k());
              } else {
                paramList1 = null;
              }
              ((a2)localObject6).d("Evaluating filter. audience, filter, property", localObject1, paramList1, h().g(((A1)localObject3).L()));
              j().K().b("Filter definition", o().J((A1)localObject3));
            }
            if ((((A1)localObject3).P()) && (((A1)localObject3).k() <= 256))
            {
              paramList1 = new c(this, d, j, (A1)localObject3);
              bool = paramList1.k(g, h, paramList2, A(j, ((A1)localObject3).k()));
              if (bool) {
                y((Integer)localObject1).c(paramList1);
              } else {
                e.add(localObject1);
              }
            }
            else
            {
              localObject4 = j().L();
              localObject6 = Y1.v(d);
              if (((A1)localObject3).P()) {
                paramList1 = Integer.valueOf(((A1)localObject3).k());
              } else {
                paramList1 = null;
              }
              ((a2)localObject4).c("Invalid property filter ID. appId, id", localObject6, String.valueOf(paramList1));
              break label2410;
            }
          }
          if (!bool) {
            e.add(localObject1);
          }
        }
      }
    }
    paramList1 = new ArrayList();
    paramString = f.keySet();
    paramString.removeAll(e);
    paramList2 = paramString.iterator();
    while (paramList2.hasNext())
    {
      paramString = (Integer)paramList2.next();
      j = paramString.intValue();
      paramLong1 = (d6)f.get(paramString);
      n.i(paramLong1);
      localObject2 = paramLong1.a(j);
      paramList1.add(localObject2);
      paramLong2 = q();
      paramLong1 = d;
      localObject2 = ((W1)localObject2).Q();
      paramLong2.u();
      paramLong2.n();
      n.e(paramLong1);
      n.i(localObject2);
      localObject1 = ((j3)localObject2).h();
      localObject2 = new ContentValues();
      ((ContentValues)localObject2).put("app_id", paramLong1);
      ((ContentValues)localObject2).put("audience_id", paramString);
      ((ContentValues)localObject2).put("current_results", (byte[])localObject1);
      try
      {
        paramString = paramLong2.B();
        try
        {
          if (paramString.insertWithOnConflict("audience_filter_values", null, (ContentValues)localObject2, 5) != -1L) {
            continue;
          }
          paramLong2.j().G().b("Failed to insert filter results (got -1). appId", Y1.v(paramLong1));
        }
        catch (SQLiteException paramString) {}
        paramLong2.j().G().c("Error storing filter results. appId", Y1.v(paramLong1), paramString);
      }
      catch (SQLiteException paramString) {}
    }
    return paramList1;
  }
}

/* Location:
 * Qualified Name:     R2.b6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */