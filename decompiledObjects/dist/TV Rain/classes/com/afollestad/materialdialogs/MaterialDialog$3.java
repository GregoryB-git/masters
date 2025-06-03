package com.afollestad.materialdialogs;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

class MaterialDialog$3
  implements TextWatcher
{
  public MaterialDialog$3(MaterialDialog paramMaterialDialog) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt1 = paramCharSequence.toString().length();
    MaterialDialog localMaterialDialog = this$0;
    boolean bool1 = builder.inputAllowEmpty;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1)
    {
      bool2 = bool3;
      if (paramInt1 == 0) {
        bool2 = true;
      }
      localMaterialDialog.getActionButton(DialogAction.POSITIVE).setEnabled(bool2 ^ true);
    }
    this$0.invalidateInputMinMaxIndicator(paramInt1, bool2);
    localMaterialDialog = this$0;
    MaterialDialog.Builder localBuilder = builder;
    if (alwaysCallInputCallback) {
      inputCallback.onInput(localMaterialDialog, paramCharSequence);
    }
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.MaterialDialog.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */