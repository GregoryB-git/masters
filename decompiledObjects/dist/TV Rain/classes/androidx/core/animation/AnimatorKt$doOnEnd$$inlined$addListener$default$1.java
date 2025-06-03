package androidx.core.animation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\004*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\007\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\b\032\0020\0032\006\020\004\032\0020\005H\026¨\006\t¸\006\000"}, d2={"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=176)
public final class AnimatorKt$doOnEnd$$inlined$addListener$default$1
  implements Animator.AnimatorListener
{
  public AnimatorKt$doOnEnd$$inlined$addListener$default$1(Function1 paramFunction1) {}
  
  public void onAnimationCancel(@NotNull Animator paramAnimator)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "animator");
  }
  
  public void onAnimationEnd(@NotNull Animator paramAnimator)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "animator");
    $onEnd.invoke(paramAnimator);
  }
  
  public void onAnimationRepeat(@NotNull Animator paramAnimator)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "animator");
  }
  
  public void onAnimationStart(@NotNull Animator paramAnimator)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "animator");
  }
}

/* Location:
 * Qualified Name:     androidx.core.animation.AnimatorKt.doOnEnd..inlined.addListener.default.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */