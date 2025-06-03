package androidx.core.view;

import a3;
import android.os.Build.VERSION;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenu;

public final class MenuCompat
{
  public static void setGroupDividerEnabled(@NonNull Menu paramMenu, boolean paramBoolean)
  {
    if ((paramMenu instanceof SupportMenu)) {
      ((SupportMenu)paramMenu).setGroupDividerEnabled(paramBoolean);
    } else if (Build.VERSION.SDK_INT >= 28) {
      Api28Impl.setGroupDividerEnabled(paramMenu, paramBoolean);
    }
  }
  
  @Deprecated
  public static void setShowAsAction(MenuItem paramMenuItem, int paramInt)
  {
    paramMenuItem.setShowAsAction(paramInt);
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static void setGroupDividerEnabled(Menu paramMenu, boolean paramBoolean)
    {
      a3.u(paramMenu, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.MenuCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */