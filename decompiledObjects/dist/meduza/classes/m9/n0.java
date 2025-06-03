package m9;

import eb.e1;
import f;
import j9.i;
import j9.m;
import java.util.List;
import ma.a0.c;
import ma.h;
import x6.b;

public abstract class n0
{
  public static final class a
    extends n0
  {
    public final List<Integer> a;
    public final List<Integer> b;
    public final i c;
    public final m d;
    
    public a(List paramList, a0.c paramc, i parami, m paramm)
    {
      a = paramList;
      b = paramc;
      c = parami;
      d = paramm;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (a.class == paramObject.getClass()))
      {
        Object localObject = (a)paramObject;
        if (!a.equals(a)) {
          return false;
        }
        if (!b.equals(b)) {
          return false;
        }
        if (!c.equals(c)) {
          return false;
        }
        paramObject = d;
        localObject = d;
        if (paramObject != null) {
          bool = ((m)paramObject).equals(localObject);
        } else if (localObject != null) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      int i = a.hashCode();
      int j = b.hashCode();
      int k = c.hashCode();
      m localm = d;
      int m;
      if (localm != null) {
        m = localm.hashCode();
      } else {
        m = 0;
      }
      return (k + (j + i * 31) * 31) * 31 + m;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("DocumentChange{updatedTargetIds=");
      localStringBuilder.append(a);
      localStringBuilder.append(", removedTargetIds=");
      localStringBuilder.append(b);
      localStringBuilder.append(", key=");
      localStringBuilder.append(c);
      localStringBuilder.append(", newDocument=");
      localStringBuilder.append(d);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends n0
  {
    public final int a;
    public final k b;
    
    public b(int paramInt, k paramk)
    {
      a = paramInt;
      b = paramk;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("ExistenceFilterWatchChange{targetId=");
      localStringBuilder.append(a);
      localStringBuilder.append(", existenceFilter=");
      localStringBuilder.append(b);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends n0
  {
    public final n0.d a;
    public final List<Integer> b;
    public final h c;
    public final e1 d;
    
    public c(n0.d paramd, a0.c paramc, h paramh, e1 parame1)
    {
      boolean bool;
      if ((parame1 != null) && (paramd != n0.d.c)) {
        bool = false;
      } else {
        bool = true;
      }
      b.Z("Got cause for a target change that was not a removal", bool, new Object[0]);
      a = paramd;
      b = paramc;
      c = paramh;
      if ((parame1 != null) && (!parame1.e())) {
        d = parame1;
      } else {
        d = null;
      }
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool1 = true;
      boolean bool2 = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (c.class == paramObject.getClass()))
      {
        Object localObject = (c)paramObject;
        if (a != a) {
          return false;
        }
        if (!b.equals(b)) {
          return false;
        }
        if (!c.equals(c)) {
          return false;
        }
        paramObject = d;
        localObject = d;
        if (paramObject != null)
        {
          if ((localObject == null) || (!a.equals(a))) {
            bool2 = false;
          }
          return bool2;
        }
        if (localObject == null) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
        return bool2;
      }
      return false;
    }
    
    public final int hashCode()
    {
      int i = a.hashCode();
      int j = b.hashCode();
      int k = c.hashCode();
      e1 locale1 = d;
      int m;
      if (locale1 != null) {
        m = a.hashCode();
      } else {
        m = 0;
      }
      return (k + (j + i * 31) * 31) * 31 + m;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("WatchTargetChange{changeType=");
      localStringBuilder.append(a);
      localStringBuilder.append(", targetIds=");
      localStringBuilder.append(b);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  public static enum d
  {
    static
    {
      d locald1 = new d("NoChange", 0);
      a = locald1;
      d locald2 = new d("Added", 1);
      b = locald2;
      d locald3 = new d("Removed", 2);
      c = locald3;
      d locald4 = new d("Current", 3);
      d = locald4;
      d locald5 = new d("Reset", 4);
      e = locald5;
      f = new d[] { locald1, locald2, locald3, locald4, locald5 };
    }
    
    public d() {}
  }
}

/* Location:
 * Qualified Name:     m9.n0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */