package androidx.core.transition;

import android.transition.Transition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2={"<anonymous>", "", "it", "Landroid/transition/Transition;", "invoke"}, k=3, mv={1, 7, 1}, xi=176)
public final class TransitionKt$addListener$3
  extends Lambda
  implements Function1<Transition, Unit>
{
  public static final 3 INSTANCE = new 3();
  
  public TransitionKt$addListener$3()
  {
    super(1);
  }
  
  public final void invoke(@NotNull Transition paramTransition)
  {
    Intrinsics.checkNotNullParameter(paramTransition, "it");
  }
}

/* Location:
 * Qualified Name:     androidx.core.transition.TransitionKt.addListener.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */