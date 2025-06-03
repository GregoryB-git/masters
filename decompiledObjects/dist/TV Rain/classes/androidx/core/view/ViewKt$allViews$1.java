package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv={}, d1={"\000\016\n\002\030\002\n\002\030\002\n\002\020\002\n\000\020\003\032\0020\002*\b\022\004\022\0020\0010\000H@"}, d2={"Lkotlin/sequences/SequenceScope;", "Landroid/view/View;", "", "<anonymous>"}, k=3, mv={1, 7, 1})
@DebugMetadata(c="androidx.core.view.ViewKt$allViews$1", f="View.kt", i={0}, l={414, 416}, m="invokeSuspend", n={"$this$sequence"}, s={"L$0"})
final class ViewKt$allViews$1
  extends RestrictedSuspendLambda
  implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object>
{
  public int label;
  
  public ViewKt$allViews$1(View paramView, Continuation<? super 1> paramContinuation)
  {
    super(2, paramContinuation);
  }
  
  @NotNull
  public final Continuation<Unit> create(@Nullable Object paramObject, @NotNull Continuation<?> paramContinuation)
  {
    paramContinuation = new 1($this_allViews, paramContinuation);
    L$0 = paramObject;
    return paramContinuation;
  }
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope<? super View> paramSequenceScope, @Nullable Continuation<? super Unit> paramContinuation)
  {
    return ((1)create(paramSequenceScope, paramContinuation)).invokeSuspend(Unit.INSTANCE);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object paramObject)
  {
    Object localObject1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    int i = label;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          ResultKt.throwOnFailure(paramObject);
          break label153;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      localObject2 = (SequenceScope)L$0;
      ResultKt.throwOnFailure(paramObject);
      paramObject = localObject2;
    }
    else
    {
      ResultKt.throwOnFailure(paramObject);
      localObject2 = (SequenceScope)L$0;
      View localView = $this_allViews;
      L$0 = localObject2;
      label = 1;
      paramObject = localObject2;
      if (((SequenceScope)localObject2).yield(localView, this) == localObject1) {
        return localObject1;
      }
    }
    Object localObject2 = $this_allViews;
    if ((localObject2 instanceof ViewGroup))
    {
      localObject2 = ViewGroupKt.getDescendants((ViewGroup)localObject2);
      L$0 = null;
      label = 2;
      if (((SequenceScope)paramObject).yieldAll((Sequence)localObject2, this) == localObject1) {
        return localObject1;
      }
    }
    label153:
    return Unit.INSTANCE;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewKt.allViews.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */