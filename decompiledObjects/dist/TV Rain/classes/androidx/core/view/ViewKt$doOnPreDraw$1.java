package androidx.core.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1={"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2={"<anonymous>", "", "run"}, k=3, mv={1, 7, 1}, xi=176)
public final class ViewKt$doOnPreDraw$1
  implements Runnable
{
  public ViewKt$doOnPreDraw$1(Function1<? super View, Unit> paramFunction1, View paramView) {}
  
  public final void run()
  {
    $action.invoke($this_doOnPreDraw);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewKt.doOnPreDraw.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */