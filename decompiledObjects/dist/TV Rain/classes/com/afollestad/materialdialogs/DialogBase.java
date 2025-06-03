package com.afollestad.materialdialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.NonNull;
import com.afollestad.materialdialogs.internal.MDRootLayout;

class DialogBase
  extends Dialog
  implements DialogInterface.OnShowListener
{
  private DialogInterface.OnShowListener showListener;
  public MDRootLayout view;
  
  public DialogBase(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  public View findViewById(int paramInt)
  {
    return view.findViewById(paramInt);
  }
  
  public void onShow(DialogInterface paramDialogInterface)
  {
    DialogInterface.OnShowListener localOnShowListener = showListener;
    if (localOnShowListener != null) {
      localOnShowListener.onShow(paramDialogInterface);
    }
  }
  
  @Deprecated
  public void setContentView(int paramInt)
    throws IllegalAccessError
  {
    throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
  }
  
  @Deprecated
  public void setContentView(@NonNull View paramView)
    throws IllegalAccessError
  {
    throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
  }
  
  @Deprecated
  public void setContentView(@NonNull View paramView, ViewGroup.LayoutParams paramLayoutParams)
    throws IllegalAccessError
  {
    throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
  }
  
  public final void setOnShowListener(DialogInterface.OnShowListener paramOnShowListener)
  {
    showListener = paramOnShowListener;
  }
  
  public final void setOnShowListenerInternal()
  {
    super.setOnShowListener(this);
  }
  
  public final void setViewInternal(View paramView)
  {
    super.setContentView(paramView);
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.DialogBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */