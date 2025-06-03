package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

public final class k$b
  extends kotlin.jvm.internal.l
  implements g6.l
{
  public k$b(String paramString)
  {
    super(1);
  }
  
  public final String a(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "line");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(o);
    localStringBuilder.append(paramString);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     kotlin.text.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */