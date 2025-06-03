package androidx.window.java.layout;

import H.a;
import V5.o;
import V5.t;
import X5.d;
import Z5.f;
import Z5.k;
import g6.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p6.I;
import s6.c;

@f(c="androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f="WindowInfoTrackerCallbackAdapter.kt", l={96}, m="invokeSuspend")
@Metadata
final class WindowInfoTrackerCallbackAdapter$addListener$1$1
  extends k
  implements p
{
  int label;
  
  public WindowInfoTrackerCallbackAdapter$addListener$1$1(s6.b paramb, a parama, d paramd)
  {
    super(2, paramd);
  }
  
  @NotNull
  public final d create(Object paramObject, @NotNull d paramd)
  {
    return new 1($flow, $consumer, paramd);
  }
  
  public final Object invoke(@NotNull I paramI, d paramd)
  {
    return ((1)create(paramI, paramd)).invokeSuspend(t.a);
  }
  
  public final Object invokeSuspend(@NotNull Object paramObject)
  {
    Object localObject = Y5.b.c();
    int i = label;
    if (i != 0)
    {
      if (i == 1) {
        o.b(paramObject);
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      o.b(paramObject);
      s6.b localb = $flow;
      paramObject = new c()
      {
        public Object emit(T paramAnonymousT, @NotNull d paramAnonymousd)
        {
          $consumer$inlined.accept(paramAnonymousT);
          return t.a;
        }
      };
      label = 1;
      if (localb.a((c)paramObject, this) == localObject) {
        return localObject;
      }
    }
    return t.a;
  }
}

/* Location:
 * Qualified Name:     androidx.window.java.layout.WindowInfoTrackerCallbackAdapter.addListener.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */