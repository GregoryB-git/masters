package androidx.core.animation;

import android.animation.Animator;
import android.animation.Animator.AnimatorPauseListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2={"androidx/core/animation/AnimatorKt$addPauseListener$listener$1", "Landroid/animation/Animator$AnimatorPauseListener;", "onAnimationPause", "", "animator", "Landroid/animation/Animator;", "onAnimationResume", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class AnimatorKt$addPauseListener$listener$1
  implements Animator.AnimatorPauseListener
{
  public AnimatorKt$addPauseListener$listener$1(Function1<? super Animator, Unit> paramFunction11, Function1<? super Animator, Unit> paramFunction12) {}
  
  public void onAnimationPause(@NotNull Animator paramAnimator)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "animator");
    $onPause.invoke(paramAnimator);
  }
  
  public void onAnimationResume(@NotNull Animator paramAnimator)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "animator");
    $onResume.invoke(paramAnimator);
  }
}

/* Location:
 * Qualified Name:     androidx.core.animation.AnimatorKt.addPauseListener.listener.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */