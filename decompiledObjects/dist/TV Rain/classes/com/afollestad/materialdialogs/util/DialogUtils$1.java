package com.afollestad.materialdialogs.util;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.MaterialDialog.Builder;

final class DialogUtils$1
  implements Runnable
{
  public DialogUtils$1(MaterialDialog paramMaterialDialog, MaterialDialog.Builder paramBuilder) {}
  
  public void run()
  {
    val$dialog.getInputEditText().requestFocus();
    InputMethodManager localInputMethodManager = (InputMethodManager)val$builder.getContext().getSystemService("input_method");
    if (localInputMethodManager != null) {
      localInputMethodManager.showSoftInput(val$dialog.getInputEditText(), 1);
    }
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.util.DialogUtils.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */