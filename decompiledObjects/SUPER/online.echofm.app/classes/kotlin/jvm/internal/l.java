package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

public abstract class l
  implements h, Serializable
{
  private final int arity;
  
  public l(int paramInt)
  {
    arity = paramInt;
  }
  
  public int getArity()
  {
    return arity;
  }
  
  @NotNull
  public String toString()
  {
    String str = v.g(this);
    Intrinsics.checkNotNullExpressionValue(str, "renderLambdaToString(...)");
    return str;
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */