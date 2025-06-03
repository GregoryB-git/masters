package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\025\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020)\n\000*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\017\020\003\032\b\022\004\022\0020\0020\004H\002¨\006\005"}, d2={"androidx/core/view/ViewGroupKt$children$1", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "iterator", "", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class ViewGroupKt$children$1
  implements Sequence<View>
{
  public ViewGroupKt$children$1(ViewGroup paramViewGroup) {}
  
  @NotNull
  public Iterator<View> iterator()
  {
    return ViewGroupKt.iterator($this_children);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewGroupKt.children.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */