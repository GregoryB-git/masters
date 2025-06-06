package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Result.Companion;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z2;

@Metadata(d1={"\000,\n\002\030\002\n\002\b\002\n\002\020\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\006\n\002\020\016\n\000\b\003\030\000*\004\b\000\020\001*\b\b\001\020\002*\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\0042\0020\005B\023\022\f\020\006\032\b\022\004\022\0028\0000\007¢\006\002\020\bJ\025\020\t\032\0020\n2\006\020\013\032\0028\001H\026¢\006\002\020\fJ\025\020\r\032\0020\n2\006\020\016\032\0028\000H\026¢\006\002\020\017J\b\020\020\032\0020\021H\026R\024\020\006\032\b\022\004\022\0028\0000\007X\004¢\006\002\n\000¨\006\022"}, d2={"Landroidx/core/os/ContinuationOutcomeReceiver;", "R", "E", "", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "continuation", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/Continuation;)V", "onError", "", "error", "(Ljava/lang/Throwable;)V", "onResult", "result", "(Ljava/lang/Object;)V", "toString", "", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
@RequiresApi(31)
final class ContinuationOutcomeReceiver<R, E extends Throwable>
  extends AtomicBoolean
  implements OutcomeReceiver
{
  @NotNull
  private final Continuation<R> continuation;
  
  public ContinuationOutcomeReceiver(@NotNull Continuation<? super R> paramContinuation)
  {
    super(false);
    continuation = paramContinuation;
  }
  
  public void onError(@NotNull E paramE)
  {
    Intrinsics.checkNotNullParameter(paramE, "error");
    if (compareAndSet(false, true))
    {
      Continuation localContinuation = continuation;
      Result.Companion localCompanion = Result.Companion;
      localContinuation.resumeWith(Result.constructor-impl(ResultKt.createFailure(paramE)));
    }
  }
  
  public void onResult(R paramR)
  {
    if (compareAndSet(false, true)) {
      continuation.resumeWith(Result.constructor-impl(paramR));
    }
  }
  
  @NotNull
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("ContinuationOutcomeReceiver(outcomeReceived = ");
    localStringBuilder.append(get());
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.ContinuationOutcomeReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */