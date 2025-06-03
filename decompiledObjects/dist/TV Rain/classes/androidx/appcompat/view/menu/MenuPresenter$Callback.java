package androidx.appcompat.view.menu;

import androidx.annotation.NonNull;

public abstract interface MenuPresenter$Callback
{
  public abstract void onCloseMenu(@NonNull MenuBuilder paramMenuBuilder, boolean paramBoolean);
  
  public abstract boolean onOpenSubMenu(@NonNull MenuBuilder paramMenuBuilder);
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.MenuPresenter.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */