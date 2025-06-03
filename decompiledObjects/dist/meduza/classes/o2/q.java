package o2;

import android.os.Build.VERSION;
import androidx.work.d;
import ec.i;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import sb.y;
import x2.s;

public abstract class q
{
  public final UUID a;
  public final s b;
  public final Set<String> c;
  
  public q(UUID paramUUID, s params, LinkedHashSet paramLinkedHashSet)
  {
    a = paramUUID;
    b = params;
    c = paramLinkedHashSet;
  }
  
  public static abstract class a<B extends a<B, ?>, W extends q>
  {
    public boolean a;
    public UUID b;
    public s c;
    public final LinkedHashSet d;
    
    public a(Class<? extends d> paramClass)
    {
      Object localObject = UUID.randomUUID();
      i.d(localObject, "randomUUID()");
      b = ((UUID)localObject);
      localObject = b.toString();
      i.d(localObject, "id.toString()");
      c = new s((String)localObject, null, paramClass.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, 8388602);
      localObject = paramClass.getName();
      int i = 0;
      paramClass = new LinkedHashSet(y.H0(1));
      while (i < 1)
      {
        paramClass.add(new String[] { localObject }[i]);
        i++;
      }
      d = paramClass;
    }
    
    public final W a()
    {
      l locall = b();
      Object localObject = c.j;
      int i = Build.VERSION.SDK_INT;
      int j = 0;
      if (((i < 24) || (!((c)localObject).a())) && (!d) && (!b) && (!c)) {
        i = 0;
      } else {
        i = 1;
      }
      localObject = c;
      if (q) {
        if ((i ^ 0x1) != 0)
        {
          i = j;
          if (g <= 0L) {
            i = 1;
          }
          if (i == 0) {
            throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
          }
        }
        else
        {
          throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
        }
      }
      localObject = UUID.randomUUID();
      i.d(localObject, "randomUUID()");
      b = ((UUID)localObject);
      localObject = ((UUID)localObject).toString();
      i.d(localObject, "id.toString()");
      s locals = c;
      i.e(locals, "other");
      String str = c;
      c = new s((String)localObject, b, str, d, new androidx.work.c(e), new androidx.work.c(f), g, h, i, new c(j), k, l, m, n, o, p, q, r, s, u, v, w, 524288);
      c();
      return locall;
    }
    
    public abstract l b();
    
    public abstract l.a c();
  }
}

/* Location:
 * Qualified Name:     o2.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */