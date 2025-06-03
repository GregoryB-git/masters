package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class SupportActionModeWrapper$CallbackWrapper
  implements ActionMode.Callback
{
  public final ArrayList<SupportActionModeWrapper> mActionModes;
  public final Context mContext;
  public final SimpleArrayMap<Menu, Menu> mMenus;
  public final android.view.ActionMode.Callback mWrappedCallback;
  
  public SupportActionModeWrapper$CallbackWrapper(Context paramContext, android.view.ActionMode.Callback paramCallback)
  {
    mContext = paramContext;
    mWrappedCallback = paramCallback;
    mActionModes = new ArrayList();
    mMenus = new SimpleArrayMap();
  }
  
  private Menu getMenuWrapper(Menu paramMenu)
  {
    Menu localMenu = (Menu)mMenus.get(paramMenu);
    Object localObject = localMenu;
    if (localMenu == null)
    {
      localObject = new MenuWrapperICS(mContext, (SupportMenu)paramMenu);
      mMenus.put(paramMenu, localObject);
    }
    return (Menu)localObject;
  }
  
  public android.view.ActionMode getActionModeWrapper(ActionMode paramActionMode)
  {
    int i = mActionModes.size();
    for (int j = 0; j < i; j++)
    {
      SupportActionModeWrapper localSupportActionModeWrapper = (SupportActionModeWrapper)mActionModes.get(j);
      if ((localSupportActionModeWrapper != null) && (mWrappedObject == paramActionMode)) {
        return localSupportActionModeWrapper;
      }
    }
    paramActionMode = new SupportActionModeWrapper(mContext, paramActionMode);
    mActionModes.add(paramActionMode);
    return paramActionMode;
  }
  
  public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return mWrappedCallback.onActionItemClicked(getActionModeWrapper(paramActionMode), new MenuItemWrapperICS(mContext, (SupportMenuItem)paramMenuItem));
  }
  
  public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return mWrappedCallback.onCreateActionMode(getActionModeWrapper(paramActionMode), getMenuWrapper(paramMenu));
  }
  
  public void onDestroyActionMode(ActionMode paramActionMode)
  {
    mWrappedCallback.onDestroyActionMode(getActionModeWrapper(paramActionMode));
  }
  
  public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return mWrappedCallback.onPrepareActionMode(getActionModeWrapper(paramActionMode), getMenuWrapper(paramMenu));
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.SupportActionModeWrapper.CallbackWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */