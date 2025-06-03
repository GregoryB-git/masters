package kotlin.jvm.internal;

import java.io.Serializable;

public class c$a
  implements Serializable
{
  public static final a o = new a();
  
  private Object readResolve()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */