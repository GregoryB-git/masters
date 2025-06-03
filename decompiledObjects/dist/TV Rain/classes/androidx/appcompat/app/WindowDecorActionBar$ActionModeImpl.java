package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class WindowDecorActionBar$ActionModeImpl
  extends ActionMode
  implements MenuBuilder.Callback
{
  private final Context mActionModeContext;
  private ActionMode.Callback mCallback;
  private WeakReference<View> mCustomView;
  private final MenuBuilder mMenu;
  
  public WindowDecorActionBar$ActionModeImpl(WindowDecorActionBar paramWindowDecorActionBar, Context paramContext, ActionMode.Callback paramCallback)
  {
    mActionModeContext = paramContext;
    mCallback = paramCallback;
    paramWindowDecorActionBar = new MenuBuilder(paramContext).setDefaultShowAsAction(1);
    mMenu = paramWindowDecorActionBar;
    paramWindowDecorActionBar.setCallback(this);
  }
  
  public boolean dispatchOnCreate()
  {
    mMenu.stopDispatchingItemsChanged();
    try
    {
      boolean bool = mCallback.onCreateActionMode(this, mMenu);
      return bool;
    }
    finally
    {
      mMenu.startDispatchingItemsChanged();
    }
  }
  
  public void finish()
  {
    WindowDecorActionBar localWindowDecorActionBar = this$0;
    if (mActionMode != this) {
      return;
    }
    if (!WindowDecorActionBar.checkShowingFlags(mHiddenByApp, mHiddenBySystem, false))
    {
      localWindowDecorActionBar = this$0;
      mDeferredDestroyActionMode = this;
      mDeferredModeDestroyCallback = mCallback;
    }
    else
    {
      mCallback.onDestroyActionMode(this);
    }
    mCallback = null;
    this$0.animateToMode(false);
    this$0.mContextView.closeMode();
    localWindowDecorActionBar = this$0;
    mOverlayLayout.setHideOnContentScrollEnabled(mHideOnContentScroll);
    this$0.mActionMode = null;
  }
  
  public View getCustomView()
  {
    Object localObject = mCustomView;
    if (localObject != null) {
      localObject = (View)((Reference)localObject).get();
    } else {
      localObject = null;
    }
    return (View)localObject;
  }
  
  public Menu getMenu()
  {
    return mMenu;
  }
  
  public MenuInflater getMenuInflater()
  {
    return new SupportMenuInflater(mActionModeContext);
  }
  
  public CharSequence getSubtitle()
  {
    return this$0.mContextView.getSubtitle();
  }
  
  public CharSequence getTitle()
  {
    return this$0.mContextView.getTitle();
  }
  
  public void invalidate()
  {
    if (this$0.mActionMode != this) {
      return;
    }
    mMenu.stopDispatchingItemsChanged();
    try
    {
      mCallback.onPrepareActionMode(this, mMenu);
      return;
    }
    finally
    {
      mMenu.startDispatchingItemsChanged();
    }
  }
  
  public boolean isTitleOptional()
  {
    return this$0.mContextView.isTitleOptional();
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean) {}
  
  public void onCloseSubMenu(SubMenuBuilder paramSubMenuBuilder) {}
  
  public boolean onMenuItemSelected(@NonNull MenuBuilder paramMenuBuilder, @NonNull MenuItem paramMenuItem)
  {
    paramMenuBuilder = mCallback;
    if (paramMenuBuilder != null) {
      return paramMenuBuilder.onActionItemClicked(this, paramMenuItem);
    }
    return false;
  }
  
  public void onMenuModeChange(@NonNull MenuBuilder paramMenuBuilder)
  {
    if (mCallback == null) {
      return;
    }
    invalidate();
    this$0.mContextView.showOverflowMenu();
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    if (mCallback == null) {
      return false;
    }
    if (!paramSubMenuBuilder.hasVisibleItems()) {
      return true;
    }
    new MenuPopupHelper(this$0.getThemedContext(), paramSubMenuBuilder).show();
    return true;
  }
  
  public void setCustomView(View paramView)
  {
    this$0.mContextView.setCustomView(paramView);
    mCustomView = new WeakReference(paramView);
  }
  
  public void setSubtitle(int paramInt)
  {
    setSubtitle(this$0.mContext.getResources().getString(paramInt));
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this$0.mContextView.setSubtitle(paramCharSequence);
  }
  
  public void setTitle(int paramInt)
  {
    setTitle(this$0.mContext.getResources().getString(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this$0.mContextView.setTitle(paramCharSequence);
  }
  
  public void setTitleOptionalHint(boolean paramBoolean)
  {
    super.setTitleOptionalHint(paramBoolean);
    this$0.mContextView.setTitleOptional(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.WindowDecorActionBar.ActionModeImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */