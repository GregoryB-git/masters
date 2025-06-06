package androidx.core.internal.view;

import android.view.Menu;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract interface SupportMenu
  extends Menu
{
  public static final int CATEGORY_MASK = -65536;
  public static final int CATEGORY_SHIFT = 16;
  public static final int FLAG_KEEP_OPEN_ON_SUBMENU_OPENED = 4;
  public static final int SUPPORTED_MODIFIERS_MASK = 69647;
  public static final int USER_MASK = 65535;
  public static final int USER_SHIFT = 0;
  
  public abstract void setGroupDividerEnabled(boolean paramBoolean);
}

/* Location:
 * Qualified Name:     androidx.core.internal.view.SupportMenu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */