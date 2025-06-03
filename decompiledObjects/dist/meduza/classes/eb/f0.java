package eb;

import java.util.concurrent.atomic.AtomicLong;
import x6.b;

public final class f0
{
  public static final AtomicLong d = new AtomicLong();
  public final String a;
  public final String b;
  public final long c;
  
  public f0(long paramLong, String paramString1, String paramString2)
  {
    b.y(paramString1, "typeName");
    b.s("empty type", paramString1.isEmpty() ^ true);
    a = paramString1;
    b = paramString2;
    c = paramLong;
  }
  
  public static f0 a(Class<?> paramClass, String paramString)
  {
    String str = paramClass.getSimpleName();
    if (!str.isEmpty()) {
      paramClass = str;
    } else {
      paramClass = paramClass.getName().substring(paramClass.getPackage().getName().length() + 1);
    }
    return new f0(d.incrementAndGet(), paramClass, paramString);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(a);
    localStringBuilder2.append("<");
    localStringBuilder2.append(c);
    localStringBuilder2.append(">");
    localStringBuilder1.append(localStringBuilder2.toString());
    if (b != null)
    {
      localStringBuilder1.append(": (");
      localStringBuilder1.append(b);
      localStringBuilder1.append(')');
    }
    return localStringBuilder1.toString();
  }
}

/* Location:
 * Qualified Name:     eb.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */