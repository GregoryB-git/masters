package Z5;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.v;
import org.jetbrains.annotations.NotNull;

public abstract class k
  extends d
  implements h
{
  private final int arity;
  
  public k(int paramInt, X5.d paramd)
  {
    super(paramd);
    arity = paramInt;
  }
  
  public int getArity()
  {
    return arity;
  }
  
  @NotNull
  public String toString()
  {
    String str;
    if (getCompletion() == null)
    {
      str = v.f(this);
      Intrinsics.checkNotNullExpressionValue(str, "renderLambdaToString(...)");
    }
    else
    {
      str = super.toString();
    }
    return str;
  }
}

/* Location:
 * Qualified Name:     Z5.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */