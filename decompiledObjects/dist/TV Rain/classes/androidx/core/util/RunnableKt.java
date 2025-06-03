package androidx.core.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\020\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\000\032\020\020\000\032\0020\001*\b\022\004\022\0020\0030\002¨\006\004"}, d2={"asRunnable", "Ljava/lang/Runnable;", "Lkotlin/coroutines/Continuation;", "", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class RunnableKt
{
  @NotNull
  public static final Runnable asRunnable(@NotNull Continuation<? super Unit> paramContinuation)
  {
    Intrinsics.checkNotNullParameter(paramContinuation, "<this>");
    return new ContinuationRunnable(paramContinuation);
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.RunnableKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */