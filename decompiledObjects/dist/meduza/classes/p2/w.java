package p2;

import android.os.Build.VERSION;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import x2.s;

public final class w
{
  public static final String a = o2.j.f("Schedulers");
  
  public static void a(x2.t paramt, m0 paramm0, List paramList)
  {
    if (paramList.size() > 0)
    {
      paramm0.getClass();
      long l = System.currentTimeMillis();
      paramm0 = paramList.iterator();
      while (paramm0.hasNext()) {
        paramt.f(nexta, l);
      }
    }
  }
  
  public static void b(a parama, WorkDatabase paramWorkDatabase, List<t> paramList)
  {
    if ((paramList != null) && (paramList.size() != 0))
    {
      Object localObject1 = paramWorkDatabase.u();
      paramWorkDatabase.c();
      Object localObject2 = null;
      try
      {
        if (Build.VERSION.SDK_INT >= 24)
        {
          localObject2 = ((x2.t)localObject1).r();
          a((x2.t)localObject1, c, (List)localObject2);
        }
      }
      finally
      {
        break label266;
      }
      ArrayList localArrayList = ((x2.t)localObject1).i(j);
      a((x2.t)localObject1, c, localArrayList);
      if (localObject2 != null) {
        localArrayList.addAll((Collection)localObject2);
      }
      parama = ((x2.t)localObject1).c();
      paramWorkDatabase.n();
      paramWorkDatabase.j();
      if (localArrayList.size() > 0)
      {
        paramWorkDatabase = (s[])localArrayList.toArray(new s[localArrayList.size()]);
        localObject2 = paramList.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (t)((Iterator)localObject2).next();
          if (((t)localObject1).b()) {
            ((t)localObject1).e(paramWorkDatabase);
          }
        }
      }
      if (parama.size() > 0)
      {
        parama = (s[])parama.toArray(new s[parama.size()]);
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          paramWorkDatabase = (t)paramList.next();
          if (!paramWorkDatabase.b()) {
            paramWorkDatabase.e(parama);
          }
        }
      }
      return;
      label266:
      paramWorkDatabase.j();
      throw parama;
    }
  }
}

/* Location:
 * Qualified Name:     p2.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */