package androidx.window.layout;

import V5.o;
import V5.t;
import Y5.b;
import android.app.Activity;
import g6.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.e;
import r6.n;
import s6.c;

@Z5.f(c="androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f="WindowInfoTrackerImpl.kt", l={54, 55}, m="invokeSuspend")
@Metadata
final class WindowInfoTrackerImpl$windowLayoutInfo$1
  extends Z5.k
  implements p
{
  Object L$1;
  Object L$2;
  int label;
  
  public WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl paramWindowInfoTrackerImpl, Activity paramActivity, X5.d paramd)
  {
    super(2, paramd);
  }
  
  private static final void invokeSuspend$lambda-0(r6.d paramd, WindowLayoutInfo paramWindowLayoutInfo)
  {
    Intrinsics.checkNotNullExpressionValue(paramWindowLayoutInfo, "info");
    paramd.d(paramWindowLayoutInfo);
  }
  
  @NotNull
  public final X5.d create(Object paramObject, @NotNull X5.d paramd)
  {
    paramd = new 1(this$0, $activity, paramd);
    L$0 = paramObject;
    return paramd;
  }
  
  public final Object invoke(@NotNull c paramc, X5.d paramd)
  {
    return ((1)create(paramc, paramd)).invokeSuspend(t.a);
  }
  
  public final Object invokeSuspend(@NotNull Object paramObject)
  {
    Object localObject1 = b.c();
    int i = label;
    Object localObject2;
    Object localObject3;
    c localc;
    Object localObject4;
    if (i != 0) {
      if (i != 1) {
        if (i == 2)
        {
          localObject2 = (e)L$2;
          localObject3 = (H.a)L$1;
          localc = (c)L$0;
          localObject4 = localObject3;
        }
      }
    }
    Object localObject5;
    label252:
    do
    {
      try
      {
        o.b(paramObject);
        paramObject = localObject2;
      }
      finally
      {
        break label365;
      }
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      localObject2 = (e)L$2;
      localObject3 = (H.a)L$1;
      localc = (c)L$0;
      localObject4 = localObject3;
      o.b(paramObject);
      localObject5 = paramObject;
      break label252;
      o.b(paramObject);
      localc = (c)L$0;
      paramObject = r6.f.b(10, r6.a.p, null, 4, null);
      localObject3 = new k((r6.d)paramObject);
      WindowInfoTrackerImpl.access$getWindowBackend$p(this$0).registerLayoutChangeCallback($activity, new r1.m(), (H.a)localObject3);
      localObject4 = localObject3;
      paramObject = ((r6.m)paramObject).iterator();
      localObject4 = localObject3;
      L$0 = localc;
      localObject4 = localObject3;
      L$1 = localObject3;
      localObject4 = localObject3;
      L$2 = paramObject;
      localObject4 = localObject3;
      label = 1;
      localObject4 = localObject3;
      localObject5 = ((e)paramObject).b(this);
      if (localObject5 == localObject1) {
        return localObject1;
      }
      localObject2 = paramObject;
      localObject4 = localObject3;
      if (!((Boolean)localObject5).booleanValue()) {
        break;
      }
      localObject4 = localObject3;
      paramObject = (WindowLayoutInfo)((e)localObject2).next();
      localObject4 = localObject3;
      L$0 = localc;
      localObject4 = localObject3;
      L$1 = localObject3;
      localObject4 = localObject3;
      L$2 = localObject2;
      localObject4 = localObject3;
      label = 2;
      localObject4 = localObject3;
      localObject5 = localc.emit(paramObject, this);
      paramObject = localObject2;
    } while (localObject5 != localObject1);
    return localObject1;
    WindowInfoTrackerImpl.access$getWindowBackend$p(this$0).unregisterLayoutChangeCallback((H.a)localObject3);
    return t.a;
    label365:
    WindowInfoTrackerImpl.access$getWindowBackend$p(this$0).unregisterLayoutChangeCallback((H.a)localObject4);
    throw ((Throwable)paramObject);
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.WindowInfoTrackerImpl.windowLayoutInfo.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */