package androidx.recyclerview.widget;

import f;
import java.util.ArrayList;

public final class c
  extends o
{
  public ArrayList<RecyclerView.v> e = new ArrayList();
  public ArrayList<RecyclerView.v> f = new ArrayList();
  public ArrayList<b> g = new ArrayList();
  public ArrayList<a> h = new ArrayList();
  public ArrayList<ArrayList<RecyclerView.v>> i = new ArrayList();
  public ArrayList<ArrayList<b>> j = new ArrayList();
  public ArrayList<ArrayList<a>> k = new ArrayList();
  public ArrayList<RecyclerView.v> l = new ArrayList();
  public ArrayList<RecyclerView.v> m = new ArrayList();
  public ArrayList<RecyclerView.v> n = new ArrayList();
  public ArrayList<RecyclerView.v> o = new ArrayList();
  
  public static void e(ArrayList paramArrayList)
  {
    int i1 = paramArrayList.size() - 1;
    if (i1 < 0) {
      return;
    }
    ((RecyclerView.v)paramArrayList.get(i1)).getClass();
    throw null;
  }
  
  public static void f(a parama, RecyclerView.v paramv)
  {
    if (b != paramv)
    {
      if (a != paramv) {
        return;
      }
      a = null;
    }
    else
    {
      b = null;
    }
    paramv.getClass();
    throw null;
  }
  
  public final void c()
  {
    int i1 = g.size() - 1;
    if (i1 < 0)
    {
      i1 = e.size();
      for (;;)
      {
        i1--;
        if (i1 < 0) {
          break;
        }
        a((RecyclerView.v)e.get(i1));
        e.remove(i1);
      }
      i1 = f.size() - 1;
      if (i1 < 0)
      {
        i1 = h.size();
        Object localObject1;
        Object localObject2;
        for (;;)
        {
          i1--;
          if (i1 < 0) {
            break;
          }
          localObject1 = (a)h.get(i1);
          localObject2 = a;
          if (localObject2 != null) {
            f((a)localObject1, (RecyclerView.v)localObject2);
          }
          localObject2 = b;
          if (localObject2 != null) {
            f((a)localObject1, (RecyclerView.v)localObject2);
          }
        }
        h.clear();
        if (!d()) {
          return;
        }
        i1 = j.size();
        int i2;
        do
        {
          i1--;
          if (i1 < 0) {
            break;
          }
          localObject1 = (ArrayList)j.get(i1);
          i2 = ((ArrayList)localObject1).size() - 1;
        } while (i2 < 0);
        ((b)((ArrayList)localObject1).get(i2)).getClass();
        throw null;
        i1 = i.size();
        do
        {
          i1--;
          if (i1 < 0) {
            break;
          }
          localObject1 = (ArrayList)i.get(i1);
          i2 = ((ArrayList)localObject1).size() - 1;
        } while (i2 < 0);
        ((RecyclerView.v)((ArrayList)localObject1).get(i2)).getClass();
        throw null;
        for (i1 = k.size();; i1 = i2)
        {
          i2 = i1 - 1;
          if (i2 < 0) {
            break;
          }
          localObject1 = (ArrayList)k.get(i2);
          i1 = ((ArrayList)localObject1).size();
          for (;;)
          {
            i1--;
            if (i1 < 0) {
              break;
            }
            localObject2 = (a)((ArrayList)localObject1).get(i1);
            RecyclerView.v localv = a;
            if (localv != null) {
              f((a)localObject2, localv);
            }
            localv = b;
            if (localv != null) {
              f((a)localObject2, localv);
            }
            if (((ArrayList)localObject1).isEmpty()) {
              k.remove(localObject1);
            }
          }
        }
        e(n);
        e(m);
        e(l);
        e(o);
        b();
        return;
      }
      ((RecyclerView.v)f.get(i1)).getClass();
      throw null;
    }
    ((b)g.get(i1)).getClass();
    throw null;
  }
  
  public final boolean d()
  {
    boolean bool;
    if ((f.isEmpty()) && (h.isEmpty()) && (g.isEmpty()) && (e.isEmpty()) && (m.isEmpty()) && (n.isEmpty()) && (l.isEmpty()) && (o.isEmpty()) && (j.isEmpty()) && (i.isEmpty()) && (k.isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static final class a
  {
    public RecyclerView.v a;
    public RecyclerView.v b;
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("ChangeInfo{oldHolder=");
      localStringBuilder.append(a);
      localStringBuilder.append(", newHolder=");
      localStringBuilder.append(b);
      localStringBuilder.append(", fromX=");
      localStringBuilder.append(0);
      localStringBuilder.append(", fromY=");
      localStringBuilder.append(0);
      localStringBuilder.append(", toX=");
      localStringBuilder.append(0);
      localStringBuilder.append(", toY=");
      localStringBuilder.append(0);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  public static final class b {}
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */