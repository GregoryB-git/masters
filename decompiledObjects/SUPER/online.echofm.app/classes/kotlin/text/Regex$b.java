package kotlin.text;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

public final class Regex$b
  implements Serializable
{
  public static final a q = new a(null);
  private static final long serialVersionUID = 0L;
  public final String o;
  public final int p;
  
  public Regex$b(String paramString, int paramInt)
  {
    o = paramString;
    p = paramInt;
  }
  
  private final Object readResolve()
  {
    Pattern localPattern = Pattern.compile(o, p);
    Intrinsics.checkNotNullExpressionValue(localPattern, "compile(...)");
    return new Regex(localPattern);
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     kotlin.text.Regex.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */