package q0;

import f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import s0.a1;
import s0.d0;
import s0.g;
import s0.p0;
import s0.v;
import s0.v.a;
import s0.v.b;
import s0.v.f;
import s0.w0;
import s0.x;
import s0.x.c;
import s0.x0;
import s0.z0;

public final class e
  extends v<e, a>
  implements p0
{
  private static final e DEFAULT_INSTANCE;
  private static volatile w0<e> PARSER;
  public static final int STRINGS_FIELD_NUMBER = 1;
  private x.c<String> strings_ = z0.d;
  
  static
  {
    e locale = new e();
    DEFAULT_INSTANCE = locale;
    v.o(e.class, locale);
  }
  
  public static void q(e parame, Set paramSet)
  {
    int i;
    if (!strings_.g())
    {
      localObject = strings_;
      i = ((List)localObject).size();
      if (i == 0) {
        i = 10;
      } else {
        i *= 2;
      }
      strings_ = ((x.c)localObject).c(i);
    }
    parame = strings_;
    Object localObject = x.a;
    paramSet.getClass();
    int j;
    if ((paramSet instanceof d0))
    {
      localObject = ((d0)paramSet).d();
      paramSet = (d0)parame;
      j = parame.size();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        parame = ((Iterator)localObject).next();
        if (parame == null)
        {
          parame = f.l("Element at index ");
          parame.append(paramSet.size() - j);
          parame.append(" is null.");
          parame = parame.toString();
          i = paramSet.size();
          for (;;)
          {
            i--;
            if (i < j) {
              break;
            }
            paramSet.remove(i);
          }
          throw new NullPointerException(parame);
        }
        if ((parame instanceof g)) {
          paramSet.w((g)parame);
        } else {
          paramSet.add((String)parame);
        }
      }
    }
    if ((paramSet instanceof x0))
    {
      parame.addAll(paramSet);
    }
    else
    {
      if ((parame instanceof ArrayList))
      {
        localObject = (ArrayList)parame;
        i = parame.size();
        ((ArrayList)localObject).ensureCapacity(paramSet.size() + i);
      }
      j = parame.size();
      paramSet = paramSet.iterator();
      while (paramSet.hasNext())
      {
        localObject = paramSet.next();
        if (localObject == null)
        {
          paramSet = f.l("Element at index ");
          paramSet.append(parame.size() - j);
          paramSet.append(" is null.");
          paramSet = paramSet.toString();
          i = parame.size();
          for (;;)
          {
            i--;
            if (i < j) {
              break;
            }
            parame.remove(i);
          }
          throw new NullPointerException(paramSet);
        }
        parame.add(localObject);
      }
    }
  }
  
  public static e r()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a t()
  {
    return (a)DEFAULT_INSTANCE.k(v.f.e);
  }
  
  public final Object k(v.f paramf)
  {
    switch (paramf.ordinal())
    {
    default: 
      throw new UnsupportedOperationException();
    case 6: 
      w0 localw0 = PARSER;
      paramf = localw0;
      if (localw0 == null)
      {
        try
        {
          localw0 = PARSER;
          paramf = localw0;
          if (localw0 == null)
          {
            paramf = new s0/v$b;
            paramf.<init>(DEFAULT_INSTANCE);
            PARSER = paramf;
          }
        }
        finally
        {
          break label107;
        }
        break label112;
        throw paramf;
      }
      return paramf;
    case 5: 
      return DEFAULT_INSTANCE;
    case 4: 
      return new a();
    case 3: 
      return new e();
    case 2: 
      return new a1(DEFAULT_INSTANCE, "\001\001\000\000\001\001\001\000\001\000\001\032", new Object[] { "strings_" });
    case 1: 
      label107:
      label112:
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public final x.c s()
  {
    return strings_;
  }
  
  public static final class a
    extends v.a<e, a>
    implements p0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     q0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */