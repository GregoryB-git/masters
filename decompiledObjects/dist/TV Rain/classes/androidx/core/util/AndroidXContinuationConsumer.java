package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import z2;

@Metadata(d1={"\000&\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\003\n\002\020\016\n\000\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\0020\003B\023\022\f\020\004\032\b\022\004\022\0028\0000\005¢\006\002\020\006J\025\020\007\032\0020\b2\006\020\t\032\0028\000H\026¢\006\002\020\nJ\b\020\013\032\0020\fH\026R\024\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\002\n\000¨\006\r"}, d2={"Landroidx/core/util/AndroidXContinuationConsumer;", "T", "Landroidx/core/util/Consumer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "continuation", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/Continuation;)V", "accept", "", "value", "(Ljava/lang/Object;)V", "toString", "", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
final class AndroidXContinuationConsumer<T>
  extends AtomicBoolean
  implements Consumer<T>
{
  @NotNull
  private final Continuation<T> continuation;
  
  public AndroidXContinuationConsumer(@NotNull Continuation<? super T> paramContinuation)
  {
    super(false);
    continuation = paramContinuation;
  }
  
  public void accept(T paramT)
  {
    if (compareAndSet(false, true)) {
      continuation.resumeWith(Result.constructor-impl(paramT));
    }
  }
  
  @NotNull
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("ContinuationConsumer(resultAccepted = ");
    localStringBuilder.append(get());
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.AndroidXContinuationConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */