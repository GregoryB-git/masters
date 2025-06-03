package V5;

import kotlin.jvm.internal.Intrinsics;

public abstract class o
{
  public static final Object a(Throwable paramThrowable)
  {
    Intrinsics.checkNotNullParameter(paramThrowable, "exception");
    return new n.b(paramThrowable);
  }
  
  public static final void b(Object paramObject)
  {
    if (!(paramObject instanceof n.b)) {
      return;
    }
    throw o;
  }
}

/* Location:
 * Qualified Name:     V5.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */