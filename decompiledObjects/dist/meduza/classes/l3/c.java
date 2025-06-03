package l3;

import android.content.Context;
import f;
import g;
import t3.a;

public final class c
  extends h
{
  public final Context a;
  public final a b;
  public final a c;
  public final String d;
  
  public c(Context paramContext, a parama1, a parama2, String paramString)
  {
    if (paramContext != null)
    {
      a = paramContext;
      if (parama1 != null)
      {
        b = parama1;
        if (parama2 != null)
        {
          c = parama2;
          if (paramString != null)
          {
            d = paramString;
            return;
          }
          throw new NullPointerException("Null backendName");
        }
        throw new NullPointerException("Null monotonicClock");
      }
      throw new NullPointerException("Null wallClock");
    }
    throw new NullPointerException("Null applicationContext");
  }
  
  public final Context a()
  {
    return a;
  }
  
  public final String b()
  {
    return d;
  }
  
  public final a c()
  {
    return c;
  }
  
  public final a d()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof h))
    {
      paramObject = (h)paramObject;
      if ((!a.equals(((h)paramObject).a())) || (!b.equals(((h)paramObject).d())) || (!c.equals(((h)paramObject).c())) || (!d.equals(((h)paramObject).b()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (((a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ c.hashCode()) * 1000003 ^ d.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("CreationContext{applicationContext=");
    localStringBuilder.append(a);
    localStringBuilder.append(", wallClock=");
    localStringBuilder.append(b);
    localStringBuilder.append(", monotonicClock=");
    localStringBuilder.append(c);
    localStringBuilder.append(", backendName=");
    return g.f(localStringBuilder, d, "}");
  }
}

/* Location:
 * Qualified Name:     l3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */