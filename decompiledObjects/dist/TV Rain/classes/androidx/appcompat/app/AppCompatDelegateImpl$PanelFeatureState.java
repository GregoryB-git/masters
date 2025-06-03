package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.style;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView;

public final class AppCompatDelegateImpl$PanelFeatureState
{
  public int background;
  public View createdPanelView;
  public ViewGroup decorView;
  public int featureId;
  public Bundle frozenActionViewState;
  public Bundle frozenMenuState;
  public int gravity;
  public boolean isHandled;
  public boolean isOpen;
  public boolean isPrepared;
  public ListMenuPresenter listMenuPresenter;
  public Context listPresenterContext;
  public MenuBuilder menu;
  public boolean qwertyMode;
  public boolean refreshDecorView;
  public boolean refreshMenuContent;
  public View shownPanelView;
  public boolean wasLastOpen;
  public int windowAnimations;
  public int x;
  public int y;
  
  public AppCompatDelegateImpl$PanelFeatureState(int paramInt)
  {
    featureId = paramInt;
    refreshDecorView = false;
  }
  
  public void applyFrozenState()
  {
    MenuBuilder localMenuBuilder = menu;
    if (localMenuBuilder != null)
    {
      Bundle localBundle = frozenMenuState;
      if (localBundle != null)
      {
        localMenuBuilder.restorePresenterStates(localBundle);
        frozenMenuState = null;
      }
    }
  }
  
  public void clearMenuPresenters()
  {
    MenuBuilder localMenuBuilder = menu;
    if (localMenuBuilder != null) {
      localMenuBuilder.removeMenuPresenter(listMenuPresenter);
    }
    listMenuPresenter = null;
  }
  
  public MenuView getListMenuView(MenuPresenter.Callback paramCallback)
  {
    if (menu == null) {
      return null;
    }
    if (listMenuPresenter == null)
    {
      ListMenuPresenter localListMenuPresenter = new ListMenuPresenter(listPresenterContext, R.layout.abc_list_menu_item_layout);
      listMenuPresenter = localListMenuPresenter;
      localListMenuPresenter.setCallback(paramCallback);
      menu.addMenuPresenter(listMenuPresenter);
    }
    return listMenuPresenter.getMenuView(decorView);
  }
  
  public boolean hasPanelItems()
  {
    View localView = shownPanelView;
    boolean bool = false;
    if (localView == null) {
      return false;
    }
    if (createdPanelView != null) {
      return true;
    }
    if (listMenuPresenter.getAdapter().getCount() > 0) {
      bool = true;
    }
    return bool;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (SavedState)paramParcelable;
    featureId = featureId;
    wasLastOpen = isOpen;
    frozenMenuState = menuState;
    shownPanelView = null;
    decorView = null;
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState();
    featureId = featureId;
    isOpen = isOpen;
    if (menu != null)
    {
      Bundle localBundle = new Bundle();
      menuState = localBundle;
      menu.savePresenterStates(localBundle);
    }
    return localSavedState;
  }
  
  public void setMenu(MenuBuilder paramMenuBuilder)
  {
    Object localObject = menu;
    if (paramMenuBuilder == localObject) {
      return;
    }
    if (localObject != null) {
      ((MenuBuilder)localObject).removeMenuPresenter(listMenuPresenter);
    }
    menu = paramMenuBuilder;
    if (paramMenuBuilder != null)
    {
      localObject = listMenuPresenter;
      if (localObject != null) {
        paramMenuBuilder.addMenuPresenter((MenuPresenter)localObject);
      }
    }
  }
  
  public void setStyle(Context paramContext)
  {
    TypedValue localTypedValue = new TypedValue();
    Resources.Theme localTheme = paramContext.getResources().newTheme();
    localTheme.setTo(paramContext.getTheme());
    localTheme.resolveAttribute(R.attr.actionBarPopupTheme, localTypedValue, true);
    int i = resourceId;
    if (i != 0) {
      localTheme.applyStyle(i, true);
    }
    localTheme.resolveAttribute(R.attr.panelMenuListTheme, localTypedValue, true);
    i = resourceId;
    if (i != 0) {
      localTheme.applyStyle(i, true);
    } else {
      localTheme.applyStyle(R.style.Theme_AppCompat_CompactMenu, true);
    }
    paramContext = new ContextThemeWrapper(paramContext, 0);
    paramContext.getTheme().setTo(localTheme);
    listPresenterContext = paramContext;
    paramContext = paramContext.obtainStyledAttributes(R.styleable.AppCompatTheme);
    background = paramContext.getResourceId(R.styleable.AppCompatTheme_panelBackground, 0);
    windowAnimations = paramContext.getResourceId(R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
    paramContext.recycle();
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return AppCompatDelegateImpl.PanelFeatureState.SavedState.readFromParcel(paramAnonymousParcel, null);
      }
      
      public AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return AppCompatDelegateImpl.PanelFeatureState.SavedState.readFromParcel(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public AppCompatDelegateImpl.PanelFeatureState.SavedState[] newArray(int paramAnonymousInt)
      {
        return new AppCompatDelegateImpl.PanelFeatureState.SavedState[paramAnonymousInt];
      }
    };
    public int featureId;
    public boolean isOpen;
    public Bundle menuState;
    
    public static SavedState readFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      SavedState localSavedState = new SavedState();
      featureId = paramParcel.readInt();
      int i = paramParcel.readInt();
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      isOpen = bool;
      if (bool) {
        menuState = paramParcel.readBundle(paramClassLoader);
      }
      return localSavedState;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(featureId);
      paramParcel.writeInt(isOpen);
      if (isOpen) {
        paramParcel.writeBundle(menuState);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */