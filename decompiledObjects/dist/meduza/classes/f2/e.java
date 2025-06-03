package f2;

import dc.l;
import ec.i;
import java.util.ArrayList;
import java.util.Collection;
import n7.w;
import sb.k;
import sb.s;
import va.a;

public final class e<T>
  extends g<T>
{
  public final T a;
  public final String b;
  public final String c;
  public final f d;
  public final int e;
  public final j f;
  
  public e(T paramT, String paramString1, String paramString2, f paramf, Object paramObject)
  {
    a = paramT;
    b = paramString1;
    c = paramString2;
    d = paramf;
    e = paramObject;
    paramString1 = new j(g.b(paramT, paramString2));
    paramString2 = paramString1.getStackTrace();
    i.d(paramString2, "stackTrace");
    Object localObject = paramString2.length - 2;
    paramObject = localObject;
    if (localObject < 0) {
      paramObject = 0;
    }
    if (paramObject >= 0) {
      localObject = 1;
    } else {
      localObject = 0;
    }
    if (localObject != 0)
    {
      if (paramObject == 0)
      {
        paramT = s.a;
      }
      else
      {
        localObject = paramString2.length;
        if (paramObject >= localObject)
        {
          paramT = k.r(paramString2);
        }
        else if (paramObject == 1)
        {
          paramT = a.f(paramString2[(localObject - 1)]);
        }
        else
        {
          paramT = new ArrayList(paramObject);
          for (paramObject = localObject - paramObject; paramObject < localObject; paramObject++) {
            paramT.add(paramString2[paramObject]);
          }
        }
      }
      paramString1.setStackTrace((StackTraceElement[])paramT.toArray(new StackTraceElement[0]));
      f = paramString1;
      return;
    }
    throw new IllegalArgumentException(a0.j.h("Requested element count ", paramObject, " is less than zero.").toString());
  }
  
  public final T a()
  {
    int i = q0.g.c(e);
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          throw new w();
        }
      }
      else {
        d.c(b, g.b(a, c));
      }
      return null;
    }
    throw f;
  }
  
  public final g<T> c(String paramString, l<? super T, Boolean> paraml)
  {
    i.e(paraml, "condition");
    return this;
  }
}

/* Location:
 * Qualified Name:     f2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */