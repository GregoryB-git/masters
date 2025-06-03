package a6;

import W5.c.a;
import W5.g;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class c
  extends W5.c
  implements a, Serializable
{
  public final Enum[] p;
  
  public c(Enum[] paramArrayOfEnum)
  {
    p = paramArrayOfEnum;
  }
  
  private final Object writeReplace()
  {
    return new d(p);
  }
  
  public int a()
  {
    return p.length;
  }
  
  public boolean d(Enum paramEnum)
  {
    Intrinsics.checkNotNullParameter(paramEnum, "element");
    boolean bool;
    if ((Enum)g.l(p, paramEnum.ordinal()) == paramEnum) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Enum f(int paramInt)
  {
    W5.c.o.a(paramInt, p.length);
    return p[paramInt];
  }
  
  public int g(Enum paramEnum)
  {
    Intrinsics.checkNotNullParameter(paramEnum, "element");
    int i = paramEnum.ordinal();
    if ((Enum)g.l(p, i) != paramEnum) {
      i = -1;
    }
    return i;
  }
  
  public int i(Enum paramEnum)
  {
    Intrinsics.checkNotNullParameter(paramEnum, "element");
    return indexOf(paramEnum);
  }
}

/* Location:
 * Qualified Name:     a6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */