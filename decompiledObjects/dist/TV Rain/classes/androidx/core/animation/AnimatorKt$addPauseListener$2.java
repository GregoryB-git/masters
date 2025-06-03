package androidx.core.animation;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2={"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k=3, mv={1, 7, 1}, xi=48)
final class AnimatorKt$addPauseListener$2
  extends Lambda
  implements Function1<Animator, Unit>
{
  public static final 2 INSTANCE = new 2();
  
  public AnimatorKt$addPauseListener$2()
  {
    super(1);
  }
  
  public final void invoke(@NotNull Animator paramAnimator)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "it");
  }
}

/* Location:
 * Qualified Name:     androidx.core.animation.AnimatorKt.addPauseListener.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */