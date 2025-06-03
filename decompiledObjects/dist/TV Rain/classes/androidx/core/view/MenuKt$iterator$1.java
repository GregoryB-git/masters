package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000#\n\000\n\002\020)\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\002\b\002\n\002\020\002\n\000*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\t\020\005\032\0020\006H\002J\t\020\007\032\0020\002H\002J\b\020\b\032\0020\tH\026R\016\020\003\032\0020\004X\016¢\006\002\n\000¨\006\n"}, d2={"androidx/core/view/MenuKt$iterator$1", "", "Landroid/view/MenuItem;", "index", "", "hasNext", "", "next", "remove", "", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class MenuKt$iterator$1
  implements Iterator<MenuItem>, KMutableIterator
{
  private int index;
  
  public MenuKt$iterator$1(Menu paramMenu) {}
  
  public boolean hasNext()
  {
    boolean bool;
    if (index < $this_iterator.size()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @NotNull
  public MenuItem next()
  {
    Object localObject = $this_iterator;
    int i = index;
    index = (i + 1);
    localObject = ((Menu)localObject).getItem(i);
    if (localObject != null) {
      return (MenuItem)localObject;
    }
    throw new IndexOutOfBoundsException();
  }
  
  public void remove()
  {
    Menu localMenu = $this_iterator;
    int i = index - 1;
    index = i;
    Object localObject = localMenu.getItem(i);
    if (localObject != null)
    {
      Intrinsics.checkNotNullExpressionValue(localObject, "getItem(index)");
      localMenu.removeItem(((MenuItem)localObject).getItemId());
      localObject = Unit.INSTANCE;
    }
    else
    {
      localObject = null;
    }
    if (localObject != null) {
      return;
    }
    throw new IndexOutOfBoundsException();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.MenuKt.iterator.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */