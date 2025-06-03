package androidx.window.layout;

import V5.o;
import V5.t;
import android.app.Activity;
import g6.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.e;
import r6.n;
import s6.c;

@Metadata
public final class WindowInfoTrackerImpl
  implements WindowInfoTracker
{
  private static final int BUFFER_CAPACITY = 10;
  @NotNull
  public static final Companion Companion = new Companion(null);
  @NotNull
  private final WindowBackend windowBackend;
  @NotNull
  private final WindowMetricsCalculator windowMetricsCalculator;
  
  public WindowInfoTrackerImpl(@NotNull WindowMetricsCalculator paramWindowMetricsCalculator, @NotNull WindowBackend paramWindowBackend)
  {
    windowMetricsCalculator = paramWindowMetricsCalculator;
    windowBackend = paramWindowBackend;
  }
  
  @NotNull
  public s6.b windowLayoutInfo(@NotNull final Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    s6.d.e(new Z5.k(paramActivity, null)
    {
      Object L$1;
      Object L$2;
      int label;
      
      private static final void invokeSuspend$lambda-0(r6.d paramAnonymousd, WindowLayoutInfo paramAnonymousWindowLayoutInfo)
      {
        Intrinsics.checkNotNullExpressionValue(paramAnonymousWindowLayoutInfo, "info");
        paramAnonymousd.d(paramAnonymousWindowLayoutInfo);
      }
      
      @NotNull
      public final X5.d create(Object paramAnonymousObject, @NotNull X5.d paramAnonymousd)
      {
        paramAnonymousd = new 1(this$0, paramActivity, paramAnonymousd);
        L$0 = paramAnonymousObject;
        return paramAnonymousd;
      }
      
      public final Object invoke(@NotNull c paramAnonymousc, X5.d paramAnonymousd)
      {
        return ((1)create(paramAnonymousc, paramAnonymousd)).invokeSuspend(t.a);
      }
      
      public final Object invokeSuspend(@NotNull Object paramAnonymousObject)
      {
        Object localObject1 = Y5.b.c();
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
            o.b(paramAnonymousObject);
            paramAnonymousObject = localObject2;
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
          o.b(paramAnonymousObject);
          localObject5 = paramAnonymousObject;
          break label252;
          o.b(paramAnonymousObject);
          localc = (c)L$0;
          paramAnonymousObject = r6.f.b(10, r6.a.p, null, 4, null);
          localObject3 = new k((r6.d)paramAnonymousObject);
          WindowInfoTrackerImpl.access$getWindowBackend$p(this$0).registerLayoutChangeCallback(paramActivity, new r1.m(), (H.a)localObject3);
          localObject4 = localObject3;
          paramAnonymousObject = ((r6.m)paramAnonymousObject).iterator();
          localObject4 = localObject3;
          L$0 = localc;
          localObject4 = localObject3;
          L$1 = localObject3;
          localObject4 = localObject3;
          L$2 = paramAnonymousObject;
          localObject4 = localObject3;
          label = 1;
          localObject4 = localObject3;
          localObject5 = ((e)paramAnonymousObject).b(this);
          if (localObject5 == localObject1) {
            return localObject1;
          }
          localObject2 = paramAnonymousObject;
          localObject4 = localObject3;
          if (!((Boolean)localObject5).booleanValue()) {
            break;
          }
          localObject4 = localObject3;
          paramAnonymousObject = (WindowLayoutInfo)((e)localObject2).next();
          localObject4 = localObject3;
          L$0 = localc;
          localObject4 = localObject3;
          L$1 = localObject3;
          localObject4 = localObject3;
          L$2 = localObject2;
          localObject4 = localObject3;
          label = 2;
          localObject4 = localObject3;
          localObject5 = localc.emit(paramAnonymousObject, this);
          paramAnonymousObject = localObject2;
        } while (localObject5 != localObject1);
        return localObject1;
        WindowInfoTrackerImpl.access$getWindowBackend$p(this$0).unregisterLayoutChangeCallback((H.a)localObject3);
        return t.a;
        label365:
        WindowInfoTrackerImpl.access$getWindowBackend$p(this$0).unregisterLayoutChangeCallback((H.a)localObject4);
        throw ((Throwable)paramAnonymousObject);
      }
    });
  }
  
  @Metadata
  public static final class Companion {}
}

/* Location:
 * Qualified Name:     androidx.window.layout.WindowInfoTrackerImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */