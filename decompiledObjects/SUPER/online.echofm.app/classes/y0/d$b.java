package y0;

import F0.T;
import F0.r;
import X0.e;
import c1.o;
import c1.t.a;
import c1.u;
import d0.q;
import d0.q.b;
import d0.z;
import java.util.List;
import java.util.Objects;
import l0.y1;

public final class d$b
  implements f.a
{
  public t.a a = new c1.h();
  public boolean b;
  
  public q b(q paramq)
  {
    Object localObject = paramq;
    if (b)
    {
      localObject = paramq;
      if (a.a(paramq))
      {
        localObject = paramq.a().o0("application/x-media3-cues").S(a.c(paramq));
        StringBuilder localStringBuilder1 = new StringBuilder();
        localStringBuilder1.append(n);
        if (j != null)
        {
          StringBuilder localStringBuilder2 = new StringBuilder();
          localStringBuilder2.append(" ");
          localStringBuilder2.append(j);
          paramq = localStringBuilder2.toString();
        }
        else
        {
          paramq = "";
        }
        localStringBuilder1.append(paramq);
        localObject = ((q.b)localObject).O(localStringBuilder1.toString()).s0(Long.MAX_VALUE).K();
      }
    }
    return (q)localObject;
  }
  
  public f c(int paramInt, q paramq, boolean paramBoolean, List paramList, T paramT, y1 paramy1)
  {
    paramy1 = m;
    if (z.r(paramy1))
    {
      if (!b) {
        return null;
      }
      paramList = new o(a.b(paramq), paramq);
    }
    else
    {
      boolean bool = z.q(paramy1);
      int i = 1;
      if (bool)
      {
        if (!b) {
          i = 3;
        }
        paramList = new e(a, i);
      }
      else if (Objects.equals(paramy1, "image/jpeg"))
      {
        paramList = new N0.a(1);
      }
      else if (Objects.equals(paramy1, "image/png"))
      {
        paramList = new b1.a();
      }
      else
      {
        if (paramBoolean) {
          i = 4;
        } else {
          i = 0;
        }
        int j = i;
        if (!b) {
          j = i | 0x20;
        }
        paramList = new Z0.h(a, j, null, null, paramList, paramT);
      }
    }
    paramT = paramList;
    if (b)
    {
      paramT = paramList;
      if (!z.r(paramy1))
      {
        paramT = paramList;
        if (!(paramList.d() instanceof Z0.h))
        {
          paramT = paramList;
          if (!(paramList.d() instanceof e)) {
            paramT = new u(paramList, a);
          }
        }
      }
    }
    return new d(paramT, paramInt, paramq);
  }
  
  public b d(boolean paramBoolean)
  {
    b = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     y0.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */