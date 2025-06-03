package R2;

import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.x1;
import com.google.android.gms.internal.measurement.y1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t.a;

public final class h6
  extends d
{
  public x1 g;
  
  public h6(b6 paramb6, String paramString, int paramInt, x1 paramx1)
  {
    super(paramString, paramInt);
    g = paramx1;
  }
  
  public final int a()
  {
    return g.L();
  }
  
  public final boolean i()
  {
    return g.U();
  }
  
  public final boolean j()
  {
    return false;
  }
  
  public final boolean k(Long paramLong1, Long paramLong2, com.google.android.gms.internal.measurement.Y1 paramY1, long paramLong, E paramE, boolean paramBoolean)
  {
    int i;
    if ((A6.a()) && (h.f().D(a, K.j0))) {
      i = 1;
    } else {
      i = 0;
    }
    if (g.T()) {
      paramLong = e;
    }
    boolean bool1 = h.j().C(2);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4;
    int j;
    if (bool1)
    {
      localObject4 = h.j().K();
      j = b;
      if (g.V()) {
        paramE = Integer.valueOf(g.L());
      } else {
        paramE = null;
      }
      ((a2)localObject4).d("Evaluating filter. audience, filter, event", Integer.valueOf(j), paramE, h.h().c(g.P()));
      h.j().K().b("Filter definition", h.o().I(g));
    }
    if ((g.V()) && (g.L() <= 256))
    {
      boolean bool2 = g.R();
      boolean bool3 = g.S();
      bool1 = g.T();
      if ((!bool2) && (!bool3) && (!bool1)) {
        j = 0;
      } else {
        j = 1;
      }
      if ((paramBoolean) && (j == 0))
      {
        paramLong2 = h.j().K();
        i = b;
        paramLong1 = (Long)localObject3;
        if (g.V()) {
          paramLong1 = Integer.valueOf(g.L());
        }
        paramLong2.c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i), paramLong1);
        return true;
      }
      Object localObject5 = g;
      localObject4 = paramY1.b0();
      if (((x1)localObject5).U())
      {
        paramE = d.c(paramLong, ((x1)localObject5).O());
        if (paramE == null)
        {
          paramE = (E)localObject1;
          break label1393;
        }
        if (!paramE.booleanValue())
        {
          paramE = Boolean.FALSE;
          break label1393;
        }
      }
      HashSet localHashSet = new HashSet();
      localObject2 = ((x1)localObject5).Q().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramE = (y1)((Iterator)localObject2).next();
        if (paramE.M().isEmpty())
        {
          localObject3 = h.j().L();
          paramE = h.h().c((String)localObject4);
          localObject2 = "null or empty param name in filter. event";
          ((a2)localObject3).b((String)localObject2, paramE);
          paramE = (E)localObject1;
          break label1393;
        }
        localHashSet.add(paramE.M());
      }
      a locala = new a();
      Iterator localIterator = paramY1.c0().iterator();
      while (localIterator.hasNext())
      {
        com.google.android.gms.internal.measurement.a2 locala2 = (com.google.android.gms.internal.measurement.a2)localIterator.next();
        if (localHashSet.contains(locala2.c0()))
        {
          if (locala2.h0())
          {
            localObject3 = locala2.c0();
            localObject2 = localObject3;
            if (locala2.h0())
            {
              paramE = Long.valueOf(locala2.X());
              localObject2 = localObject3;
            }
            else
            {
              label610:
              paramE = null;
            }
          }
          for (;;)
          {
            locala.put(localObject2, paramE);
            break;
            if (locala2.f0())
            {
              localObject3 = locala2.c0();
              localObject2 = localObject3;
              if (!locala2.f0()) {
                break label610;
              }
              paramE = Double.valueOf(locala2.G());
              localObject2 = localObject3;
              continue;
            }
            if (!locala2.j0()) {
              break label697;
            }
            localObject2 = locala2.c0();
            paramE = locala2.d0();
          }
          label697:
          paramE = h.j().L();
          localObject2 = h.h().c((String)localObject4);
          localObject3 = h.h().f(locala2.c0());
          localObject4 = "Unknown value for param. event, param";
        }
      }
      for (;;)
      {
        label745:
        paramE.c((String)localObject4, localObject2, localObject3);
        paramE = (E)localObject1;
        break label1393;
        localObject2 = ((x1)localObject5).Q().iterator();
        label989:
        label1096:
        do
        {
          do
          {
            do
            {
              if (!((Iterator)localObject2).hasNext()) {
                break label1388;
              }
              paramE = (y1)((Iterator)localObject2).next();
              if ((paramE.O()) && (paramE.N())) {
                paramBoolean = true;
              } else {
                paramBoolean = false;
              }
              localObject3 = paramE.M();
              if (((String)localObject3).isEmpty())
              {
                localObject3 = h.j().L();
                paramE = h.h().c((String)localObject4);
                localObject2 = "Event has empty param name. event";
                break;
              }
              localObject5 = locala.get(localObject3);
              if (!(localObject5 instanceof Long)) {
                break label989;
              }
              if (!paramE.P())
              {
                paramE = h.j().L();
                localObject2 = h.h().c((String)localObject4);
                localObject3 = h.h().f((String)localObject3);
                localObject4 = "No number filter for long param. event, param";
                break label745;
              }
              paramE = d.c(((Long)localObject5).longValue(), paramE.K());
              if (paramE == null)
              {
                paramE = (E)localObject1;
                break label1393;
              }
            } while (paramE.booleanValue() != paramBoolean);
            break;
            if (!(localObject5 instanceof Double)) {
              break label1096;
            }
            if (!paramE.P())
            {
              paramE = h.j().L();
              localObject2 = h.h().c((String)localObject4);
              localObject3 = h.h().f((String)localObject3);
              localObject4 = "No number filter for double param. event, param";
              break label745;
            }
            paramE = d.b(((Double)localObject5).doubleValue(), paramE.K());
            if (paramE == null)
            {
              paramE = (E)localObject1;
              break label1393;
            }
          } while (paramE.booleanValue() != paramBoolean);
          break;
          if (!(localObject5 instanceof String)) {
            break label1293;
          }
          if (paramE.R())
          {
            paramE = d.g((String)localObject5, paramE.L(), h.j());
          }
          else
          {
            if (!paramE.P()) {
              break label1245;
            }
            localObject5 = (String)localObject5;
            if (!N5.f0((String)localObject5)) {
              break label1197;
            }
            paramE = d.e((String)localObject5, paramE.K());
          }
          if (paramE == null)
          {
            paramE = (E)localObject1;
            break label1393;
          }
        } while (paramE.booleanValue() != paramBoolean);
        break;
        label1197:
        paramE = h.j().L();
        localObject2 = h.h().c((String)localObject4);
        localObject3 = h.h().f((String)localObject3);
        localObject4 = "Invalid param value for number filter. event, param";
        continue;
        label1245:
        paramE = h.j().L();
        localObject2 = h.h().c((String)localObject4);
        localObject3 = h.h().f((String)localObject3);
        localObject4 = "No filter for String param. event, param";
        continue;
        label1293:
        paramE = h.j();
        if (localObject5 == null)
        {
          paramE.K().c("Missing param for filter. event, param", h.h().c((String)localObject4), h.h().f((String)localObject3));
          break;
        }
        paramE = paramE.L();
        localObject2 = h.h().c((String)localObject4);
        localObject3 = h.h().f((String)localObject3);
        localObject4 = "Unknown param type. event, param";
      }
      label1388:
      paramE = Boolean.TRUE;
      label1393:
      localObject3 = h.j().K();
      if (paramE == null) {
        localObject2 = "null";
      } else {
        localObject2 = paramE;
      }
      ((a2)localObject3).b("Event filter result", localObject2);
      if (paramE == null) {
        return false;
      }
      localObject2 = Boolean.TRUE;
      c = ((Boolean)localObject2);
      if (!paramE.booleanValue()) {
        return true;
      }
      d = ((Boolean)localObject2);
      if ((j != 0) && (paramY1.f0()))
      {
        paramY1 = Long.valueOf(paramY1.Y());
        if (g.S())
        {
          paramLong2 = paramY1;
          if (i != 0)
          {
            paramLong2 = paramY1;
            if (g.U()) {
              paramLong2 = paramLong1;
            }
          }
          f = paramLong2;
        }
        else
        {
          paramLong1 = paramY1;
          if (i != 0)
          {
            paramLong1 = paramY1;
            if (g.U()) {
              paramLong1 = paramLong2;
            }
          }
          e = paramLong1;
        }
      }
      return true;
    }
    paramY1 = h.j().L();
    paramLong2 = Y1.v(a);
    paramLong1 = (Long)localObject2;
    if (g.V()) {
      paramLong1 = Integer.valueOf(g.L());
    }
    paramY1.c("Invalid event filter ID. appId, id", paramLong2, String.valueOf(paramLong1));
    return false;
  }
}

/* Location:
 * Qualified Name:     R2.h6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */