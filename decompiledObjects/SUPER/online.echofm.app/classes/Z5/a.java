package Z5;

import V5.n;
import V5.n.a;
import V5.o;
import X5.d;
import Y5.b;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class a
  implements d, e, Serializable
{
  private final d completion;
  
  public a(d paramd)
  {
    completion = paramd;
  }
  
  @NotNull
  public d create(@NotNull d paramd)
  {
    Intrinsics.checkNotNullParameter(paramd, "completion");
    throw new UnsupportedOperationException("create(Continuation) has not been overridden");
  }
  
  public d create(Object paramObject, d paramd)
  {
    Intrinsics.checkNotNullParameter(paramd, "completion");
    throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
  }
  
  public e getCallerFrame()
  {
    Object localObject = completion;
    if ((localObject instanceof e)) {
      localObject = (e)localObject;
    } else {
      localObject = null;
    }
    return (e)localObject;
  }
  
  public final d getCompletion()
  {
    return completion;
  }
  
  public StackTraceElement getStackTraceElement()
  {
    return g.d(this);
  }
  
  public abstract Object invokeSuspend(Object paramObject);
  
  public void releaseIntercepted() {}
  
  public final void resumeWith(@NotNull Object paramObject)
  {
    Object localObject = this;
    do
    {
      h.b((d)localObject);
      a locala = (a)localObject;
      localObject = completion;
      Intrinsics.b(localObject);
      try
      {
        paramObject = locala.invokeSuspend(paramObject);
        if (paramObject == b.c()) {
          return;
        }
        paramObject = n.a(paramObject);
      }
      finally
      {
        n.a locala1 = n.o;
        paramObject = n.a(o.a((Throwable)paramObject));
      }
      locala.releaseIntercepted();
    } while ((localObject instanceof a));
    ((d)localObject).resumeWith(paramObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Continuation at ");
    Object localObject = getStackTraceElement();
    if (localObject == null) {
      localObject = getClass().getName();
    }
    localStringBuilder.append(localObject);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     Z5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */