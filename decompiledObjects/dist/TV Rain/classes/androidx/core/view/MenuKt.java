package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000D\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020)\n\002\b\003\032\025\020\n\032\0020\013*\0020\0032\006\020\f\032\0020\002H\002\0323\020\r\032\0020\016*\0020\0032!\020\017\032\035\022\023\022\0210\002¢\006\f\b\021\022\b\b\022\022\004\b\b(\f\022\004\022\0020\0160\020H\bø\001\000\032H\020\023\032\0020\016*\0020\00326\020\017\0322\022\023\022\0210\007¢\006\f\b\021\022\b\b\022\022\004\b\b(\025\022\023\022\0210\002¢\006\f\b\021\022\b\b\022\022\004\b\b(\f\022\004\022\0020\0160\024H\bø\001\000\032\025\020\026\032\0020\002*\0020\0032\006\020\025\032\0020\007H\n\032\r\020\027\032\0020\013*\0020\003H\b\032\r\020\030\032\0020\013*\0020\003H\b\032\023\020\031\032\b\022\004\022\0020\0020\032*\0020\003H\002\032\025\020\033\032\0020\016*\0020\0032\006\020\f\032\0020\002H\n\032\025\020\034\032\0020\016*\0020\0032\006\020\025\032\0020\007H\b\"\033\020\000\032\b\022\004\022\0020\0020\001*\0020\0038F¢\006\006\032\004\b\004\020\005\"\026\020\006\032\0020\007*\0020\0038Æ\002¢\006\006\032\004\b\b\020\t\002\007\n\005\b20\001¨\006\035"}, d2={"children", "Lkotlin/sequences/Sequence;", "Landroid/view/MenuItem;", "Landroid/view/Menu;", "getChildren", "(Landroid/view/Menu;)Lkotlin/sequences/Sequence;", "size", "", "getSize", "(Landroid/view/Menu;)I", "contains", "", "item", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", "index", "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "removeItemAt", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class MenuKt
{
  public static final boolean contains(@NotNull Menu paramMenu, @NotNull MenuItem paramMenuItem)
  {
    Intrinsics.checkNotNullParameter(paramMenu, "<this>");
    Intrinsics.checkNotNullParameter(paramMenuItem, "item");
    int i = paramMenu.size();
    for (int j = 0; j < i; j++) {
      if (Intrinsics.areEqual(paramMenu.getItem(j), paramMenuItem)) {
        return true;
      }
    }
    return false;
  }
  
  public static final void forEach(@NotNull Menu paramMenu, @NotNull Function1<? super MenuItem, Unit> paramFunction1)
  {
    Intrinsics.checkNotNullParameter(paramMenu, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    int i = paramMenu.size();
    for (int j = 0; j < i; j++)
    {
      MenuItem localMenuItem = paramMenu.getItem(j);
      Intrinsics.checkNotNullExpressionValue(localMenuItem, "getItem(index)");
      paramFunction1.invoke(localMenuItem);
    }
  }
  
  public static final void forEachIndexed(@NotNull Menu paramMenu, @NotNull Function2<? super Integer, ? super MenuItem, Unit> paramFunction2)
  {
    Intrinsics.checkNotNullParameter(paramMenu, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    int i = paramMenu.size();
    for (int j = 0; j < i; j++)
    {
      MenuItem localMenuItem = paramMenu.getItem(j);
      Intrinsics.checkNotNullExpressionValue(localMenuItem, "getItem(index)");
      paramFunction2.invoke(Integer.valueOf(j), localMenuItem);
    }
  }
  
  @NotNull
  public static final MenuItem get(@NotNull Menu paramMenu, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramMenu, "<this>");
    paramMenu = paramMenu.getItem(paramInt);
    Intrinsics.checkNotNullExpressionValue(paramMenu, "getItem(index)");
    return paramMenu;
  }
  
  @NotNull
  public static final Sequence<MenuItem> getChildren(@NotNull Menu paramMenu)
  {
    Intrinsics.checkNotNullParameter(paramMenu, "<this>");
    new Sequence()
    {
      @NotNull
      public Iterator<MenuItem> iterator()
      {
        return MenuKt.iterator($this_children);
      }
    };
  }
  
  public static final int getSize(@NotNull Menu paramMenu)
  {
    Intrinsics.checkNotNullParameter(paramMenu, "<this>");
    return paramMenu.size();
  }
  
  public static final boolean isEmpty(@NotNull Menu paramMenu)
  {
    Intrinsics.checkNotNullParameter(paramMenu, "<this>");
    boolean bool;
    if (paramMenu.size() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final boolean isNotEmpty(@NotNull Menu paramMenu)
  {
    Intrinsics.checkNotNullParameter(paramMenu, "<this>");
    boolean bool;
    if (paramMenu.size() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @NotNull
  public static final Iterator<MenuItem> iterator(@NotNull Menu paramMenu)
  {
    Intrinsics.checkNotNullParameter(paramMenu, "<this>");
    new Iterator()
    {
      private int index;
      
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
    };
  }
  
  public static final void minusAssign(@NotNull Menu paramMenu, @NotNull MenuItem paramMenuItem)
  {
    Intrinsics.checkNotNullParameter(paramMenu, "<this>");
    Intrinsics.checkNotNullParameter(paramMenuItem, "item");
    paramMenu.removeItem(paramMenuItem.getItemId());
  }
  
  public static final void removeItemAt(@NotNull Menu paramMenu, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramMenu, "<this>");
    MenuItem localMenuItem = paramMenu.getItem(paramInt);
    if (localMenuItem != null)
    {
      paramMenu.removeItem(localMenuItem.getItemId());
      paramMenu = Unit.INSTANCE;
    }
    else
    {
      paramMenu = null;
    }
    if (paramMenu != null) {
      return;
    }
    throw new IndexOutOfBoundsException();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.MenuKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */