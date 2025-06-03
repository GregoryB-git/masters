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
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv={}, d1={"\000\016\n\002\030\002\n\002\030\002\n\002\020\002\n\000\020\003\032\0020\002*\b\022\004\022\0020\0010\000H@"}, d2={"Lkotlin/sequences/SequenceScope;", "Landroid/view/View;", "", "<anonymous>"}, k=3, mv={1, 7, 1})
@DebugMetadata(c="androidx.core.view.ViewGroupKt$descendants$1", f="ViewGroup.kt", i={0, 0, 0, 0, 1, 1, 1}, l={119, 121}, m="invokeSuspend", n={"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, s={"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
final class ViewGroupKt$descendants$1
  extends RestrictedSuspendLambda
  implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object>
{
  public int I$0;
  public int I$1;
  public Object L$1;
  public Object L$2;
  public int label;
  
  public ViewGroupKt$descendants$1(ViewGroup paramViewGroup, Continuation<? super 1> paramContinuation)
  {
    super(2, paramContinuation);
  }
  
  @NotNull
  public final Continuation<Unit> create(@Nullable Object paramObject, @NotNull Continuation<?> paramContinuation)
  {
    paramContinuation = new 1($this_descendants, paramContinuation);
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
    int j;
    Object localObject2;
    SequenceScope localSequenceScope;
    Object localObject3;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          j = I$1;
          i = I$0;
          localObject2 = (ViewGroup)L$1;
          localSequenceScope = (SequenceScope)L$0;
          ResultKt.throwOnFailure(paramObject);
          localObject3 = this;
          paramObject = localObject2;
          break label310;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      j = I$1;
      i = I$0;
      localObject2 = (View)L$2;
      localObject3 = (ViewGroup)L$1;
      localSequenceScope = (SequenceScope)L$0;
      ResultKt.throwOnFailure(paramObject);
      paramObject = this;
    }
    else
    {
      ResultKt.throwOnFailure(paramObject);
      localSequenceScope = (SequenceScope)L$0;
      paramObject = $this_descendants;
      i = 0;
      j = ((ViewGroup)paramObject).getChildCount();
      localObject3 = this;
    }
    while (i < j)
    {
      localObject2 = ((ViewGroup)paramObject).getChildAt(i);
      Intrinsics.checkNotNullExpressionValue(localObject2, "getChildAt(index)");
      L$0 = localSequenceScope;
      L$1 = paramObject;
      L$2 = localObject2;
      I$0 = i;
      I$1 = j;
      label = 1;
      if (localSequenceScope.yield(localObject2, (Continuation)localObject3) == localObject1) {
        return localObject1;
      }
      Object localObject4 = localObject3;
      localObject3 = paramObject;
      paramObject = localObject4;
      if ((localObject2 instanceof ViewGroup))
      {
        localObject2 = ViewGroupKt.getDescendants((ViewGroup)localObject2);
        L$0 = localSequenceScope;
        L$1 = localObject3;
        L$2 = null;
        I$0 = i;
        I$1 = j;
        label = 2;
        if (localSequenceScope.yieldAll((Sequence)localObject2, (Continuation)paramObject) == localObject1) {
          return localObject1;
        }
        localObject2 = localObject3;
        localObject3 = paramObject;
        paramObject = localObject2;
      }
      else
      {
        label310:
        localObject2 = localObject3;
        localObject3 = paramObject;
        paramObject = localObject2;
      }
      i++;
    }
    return Unit.INSTANCE;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewGroupKt.descendants.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */