package X5;

import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

public final class c$b
  extends l
  implements p
{
  public static final b o = new b();
  
  public c$b()
  {
    super(2);
  }
  
  public final String a(String paramString, g.b paramb)
  {
    Intrinsics.checkNotNullParameter(paramString, "acc");
    Intrinsics.checkNotNullParameter(paramb, "element");
    if (paramString.length() == 0)
    {
      paramString = paramb.toString();
    }
    else
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append(", ");
      localStringBuilder.append(paramb);
      paramString = localStringBuilder.toString();
    }
    return paramString;
  }
}

/* Location:
 * Qualified Name:     X5.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */