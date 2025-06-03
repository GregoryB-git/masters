package g2;

import android.content.Context;
import p2.a;

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
  
  public Context b()
  {
    return a;
  }
  
  public String c()
  {
    return d;
  }
  
  public a d()
  {
    return c;
  }
  
  public a e()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof h))
    {
      paramObject = (h)paramObject;
      if ((!a.equals(((h)paramObject).b())) || (!b.equals(((h)paramObject).e())) || (!c.equals(((h)paramObject).d())) || (!d.equals(((h)paramObject).c()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (((a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ c.hashCode()) * 1000003 ^ d.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CreationContext{applicationContext=");
    localStringBuilder.append(a);
    localStringBuilder.append(", wallClock=");
    localStringBuilder.append(b);
    localStringBuilder.append(", monotonicClock=");
    localStringBuilder.append(c);
    localStringBuilder.append(", backendName=");
    localStringBuilder.append(d);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     g2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */