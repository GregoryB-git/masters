package androidx.core.animation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.Animator.AnimatorPauseListener;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000(\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\004\n\002\030\002\n\002\b\n\032¤\001\020\000\032\0020\001*\0020\0022#\b\006\020\003\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\0042#\b\006\020\t\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\0042#\b\006\020\n\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\0042#\b\006\020\013\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\004H\bø\001\000\032V\020\f\032\0020\r*\0020\0022#\b\002\020\016\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\0042#\b\002\020\017\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\004H\007\0325\020\020\032\0020\001*\0020\0022#\b\004\020\021\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\004H\bø\001\000\0325\020\022\032\0020\001*\0020\0022#\b\004\020\021\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\004H\bø\001\000\032/\020\023\032\0020\r*\0020\0022!\020\021\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\004H\007\0325\020\024\032\0020\001*\0020\0022#\b\004\020\021\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\004H\bø\001\000\032/\020\025\032\0020\r*\0020\0022!\020\021\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\004H\007\0325\020\026\032\0020\001*\0020\0022#\b\004\020\021\032\035\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\0020\b0\004H\bø\001\000\002\007\n\005\b20\001¨\006\027"}, d2={"addListener", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animator", "", "onStart", "onCancel", "onRepeat", "addPauseListener", "Landroid/animation/Animator$AnimatorPauseListener;", "onResume", "onPause", "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnRepeat", "doOnResume", "doOnStart", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class AnimatorKt
{
  @NotNull
  public static final Animator.AnimatorListener addListener(@NotNull Animator paramAnimator, @NotNull final Function1<? super Animator, Unit> paramFunction11, @NotNull final Function1<? super Animator, Unit> paramFunction12, @NotNull final Function1<? super Animator, Unit> paramFunction13, @NotNull Function1<? super Animator, Unit> paramFunction14)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "onEnd");
    Intrinsics.checkNotNullParameter(paramFunction12, "onStart");
    Intrinsics.checkNotNullParameter(paramFunction13, "onCancel");
    Intrinsics.checkNotNullParameter(paramFunction14, "onRepeat");
    paramFunction11 = new Animator.AnimatorListener()
    {
      public void onAnimationCancel(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
        paramFunction13.invoke(paramAnonymousAnimator);
      }
      
      public void onAnimationEnd(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
        paramFunction11.invoke(paramAnonymousAnimator);
      }
      
      public void onAnimationRepeat(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
        $onRepeat.invoke(paramAnonymousAnimator);
      }
      
      public void onAnimationStart(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
        paramFunction12.invoke(paramAnonymousAnimator);
      }
    };
    paramAnimator.addListener(paramFunction11);
    return paramFunction11;
  }
  
  @RequiresApi(19)
  @NotNull
  public static final Animator.AnimatorPauseListener addPauseListener(@NotNull Animator paramAnimator, @NotNull final Function1<? super Animator, Unit> paramFunction11, @NotNull Function1<? super Animator, Unit> paramFunction12)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction11, "onResume");
    Intrinsics.checkNotNullParameter(paramFunction12, "onPause");
    paramFunction11 = new Animator.AnimatorPauseListener()
    {
      public void onAnimationPause(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
        $onPause.invoke(paramAnonymousAnimator);
      }
      
      public void onAnimationResume(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
        paramFunction11.invoke(paramAnonymousAnimator);
      }
    };
    Api19Impl.addPauseListener(paramAnimator, paramFunction11);
    return paramFunction11;
  }
  
  @NotNull
  public static final Animator.AnimatorListener doOnCancel(@NotNull Animator paramAnimator, @NotNull Function1<? super Animator, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    paramFunction1 = new Animator.AnimatorListener()
    {
      public void onAnimationCancel(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
        $onCancel.invoke(paramAnonymousAnimator);
      }
      
      public void onAnimationEnd(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
      }
      
      public void onAnimationRepeat(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
      }
      
      public void onAnimationStart(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
      }
    };
    paramAnimator.addListener(paramFunction1);
    return paramFunction1;
  }
  
  @NotNull
  public static final Animator.AnimatorListener doOnEnd(@NotNull Animator paramAnimator, @NotNull Function1<? super Animator, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    paramFunction1 = new Animator.AnimatorListener()
    {
      public void onAnimationCancel(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
      }
      
      public void onAnimationEnd(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
        $onEnd.invoke(paramAnonymousAnimator);
      }
      
      public void onAnimationRepeat(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
      }
      
      public void onAnimationStart(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
      }
    };
    paramAnimator.addListener(paramFunction1);
    return paramFunction1;
  }
  
  @RequiresApi(19)
  @NotNull
  public static final Animator.AnimatorPauseListener doOnPause(@NotNull Animator paramAnimator, @NotNull Function1<? super Animator, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    return addPauseListener$default(paramAnimator, null, paramFunction1, 1, null);
  }
  
  @NotNull
  public static final Animator.AnimatorListener doOnRepeat(@NotNull Animator paramAnimator, @NotNull Function1<? super Animator, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    paramFunction1 = new Animator.AnimatorListener()
    {
      public void onAnimationCancel(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
      }
      
      public void onAnimationEnd(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
      }
      
      public void onAnimationRepeat(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
        $onRepeat.invoke(paramAnonymousAnimator);
      }
      
      public void onAnimationStart(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
      }
    };
    paramAnimator.addListener(paramFunction1);
    return paramFunction1;
  }
  
  @RequiresApi(19)
  @NotNull
  public static final Animator.AnimatorPauseListener doOnResume(@NotNull Animator paramAnimator, @NotNull Function1<? super Animator, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    return addPauseListener$default(paramAnimator, paramFunction1, null, 2, null);
  }
  
  @NotNull
  public static final Animator.AnimatorListener doOnStart(@NotNull Animator paramAnimator, @NotNull Function1<? super Animator, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramAnimator, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    paramFunction1 = new Animator.AnimatorListener()
    {
      public void onAnimationCancel(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
      }
      
      public void onAnimationEnd(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
      }
      
      public void onAnimationRepeat(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
      }
      
      public void onAnimationStart(@NotNull Animator paramAnonymousAnimator)
      {
        Intrinsics.checkNotNullParameter(paramAnonymousAnimator, "animator");
        $onStart.invoke(paramAnonymousAnimator);
      }
    };
    paramAnimator.addListener(paramFunction1);
    return paramFunction1;
  }
}

/* Location:
 * Qualified Name:     androidx.core.animation.AnimatorKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */