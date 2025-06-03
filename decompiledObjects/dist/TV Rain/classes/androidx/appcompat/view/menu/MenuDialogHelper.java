package androidx.appcompat.view.menu;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Adapter;
import androidx.annotation.NonNull;
import androidx.appcompat.R.layout;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatDialog;

class MenuDialogHelper
  implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, MenuPresenter.Callback
{
  private AlertDialog mDialog;
  private MenuBuilder mMenu;
  public ListMenuPresenter mPresenter;
  private MenuPresenter.Callback mPresenterCallback;
  
  public MenuDialogHelper(MenuBuilder paramMenuBuilder)
  {
    mMenu = paramMenuBuilder;
  }
  
  public void dismiss()
  {
    AlertDialog localAlertDialog = mDialog;
    if (localAlertDialog != null) {
      localAlertDialog.dismiss();
    }
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    mMenu.performItemAction((MenuItemImpl)mPresenter.getAdapter().getItem(paramInt), 0);
  }
  
  public void onCloseMenu(@NonNull MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    if ((paramBoolean) || (paramMenuBuilder == mMenu)) {
      dismiss();
    }
    MenuPresenter.Callback localCallback = mPresenterCallback;
    if (localCallback != null) {
      localCallback.onCloseMenu(paramMenuBuilder, paramBoolean);
    }
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    mPresenter.onCloseMenu(mMenu, true);
  }
  
  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 82) || (paramInt == 4)) {
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        paramDialogInterface = mDialog.getWindow();
        if (paramDialogInterface != null)
        {
          paramDialogInterface = paramDialogInterface.getDecorView();
          if (paramDialogInterface != null)
          {
            paramDialogInterface = paramDialogInterface.getKeyDispatcherState();
            if (paramDialogInterface != null)
            {
              paramDialogInterface.startTracking(paramKeyEvent, this);
              return true;
            }
          }
        }
      }
      else if ((paramKeyEvent.getAction() == 1) && (!paramKeyEvent.isCanceled()))
      {
        Object localObject = mDialog.getWindow();
        if (localObject != null)
        {
          localObject = ((Window)localObject).getDecorView();
          if (localObject != null)
          {
            localObject = ((View)localObject).getKeyDispatcherState();
            if ((localObject != null) && (((KeyEvent.DispatcherState)localObject).isTracking(paramKeyEvent)))
            {
              mMenu.close(true);
              paramDialogInterface.dismiss();
              return true;
            }
          }
        }
      }
    }
    return mMenu.performShortcut(paramInt, paramKeyEvent, 0);
  }
  
  public boolean onOpenSubMenu(@NonNull MenuBuilder paramMenuBuilder)
  {
    MenuPresenter.Callback localCallback = mPresenterCallback;
    if (localCallback != null) {
      return localCallback.onOpenSubMenu(paramMenuBuilder);
    }
    return false;
  }
  
  public void setPresenterCallback(MenuPresenter.Callback paramCallback)
  {
    mPresenterCallback = paramCallback;
  }
  
  public void show(IBinder paramIBinder)
  {
    MenuBuilder localMenuBuilder = mMenu;
    Object localObject1 = new AlertDialog.Builder(localMenuBuilder.getContext());
    Object localObject2 = new ListMenuPresenter(((AlertDialog.Builder)localObject1).getContext(), R.layout.abc_list_menu_item_layout);
    mPresenter = ((ListMenuPresenter)localObject2);
    ((ListMenuPresenter)localObject2).setCallback(this);
    mMenu.addMenuPresenter(mPresenter);
    ((AlertDialog.Builder)localObject1).setAdapter(mPresenter.getAdapter(), this);
    localObject2 = localMenuBuilder.getHeaderView();
    if (localObject2 != null) {
      ((AlertDialog.Builder)localObject1).setCustomTitle((View)localObject2);
    } else {
      ((AlertDialog.Builder)localObject1).setIcon(localMenuBuilder.getHeaderIcon()).setTitle(localMenuBuilder.getHeaderTitle());
    }
    ((AlertDialog.Builder)localObject1).setOnKeyListener(this);
    localObject1 = ((AlertDialog.Builder)localObject1).create();
    mDialog = ((AlertDialog)localObject1);
    ((Dialog)localObject1).setOnDismissListener(this);
    localObject1 = mDialog.getWindow().getAttributes();
    type = 1003;
    if (paramIBinder != null) {
      token = paramIBinder;
    }
    flags |= 0x20000;
    mDialog.show();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.MenuDialogHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */