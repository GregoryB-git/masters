package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\024\n\000\n\002\030\002\n\002\b\002\n\002\020\003\n\002\030\002\n\000\032.\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\004*\b\022\004\022\002H\0020\005H\007¨\006\006"}, d2={"asOutcomeReceiver", "Landroid/os/OutcomeReceiver;", "R", "E", "", "Lkotlin/coroutines/Continuation;", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
@RequiresApi(31)
public final class OutcomeReceiverKt
{
  @RequiresApi(31)
  @NotNull
  public static final <R, E extends Throwable> OutcomeReceiver asOutcomeReceiver(@NotNull Continuation<? super R> paramContinuation)
  {
    Intrinsics.checkNotNullParameter(paramContinuation, "<this>");
    return new ContinuationOutcomeReceiver(paramContinuation);
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.OutcomeReceiverKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */