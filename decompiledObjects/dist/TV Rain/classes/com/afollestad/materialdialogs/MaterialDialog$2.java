package com.afollestad.materialdialogs;

import android.widget.TextView;
import java.text.NumberFormat;

class MaterialDialog$2
  implements Runnable
{
  public MaterialDialog$2(MaterialDialog paramMaterialDialog) {}
  
  public void run()
  {
    MaterialDialog localMaterialDialog = this$0;
    TextView localTextView = progressLabel;
    if (localTextView != null) {
      localTextView.setText(builder.progressPercentFormat.format(localMaterialDialog.getCurrentProgress() / this$0.getMaxProgress()));
    }
    localMaterialDialog = this$0;
    localTextView = progressMinMax;
    if (localTextView != null) {
      localTextView.setText(String.format(builder.progressNumberFormat, new Object[] { Integer.valueOf(localMaterialDialog.getCurrentProgress()), Integer.valueOf(this$0.getMaxProgress()) }));
    }
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.MaterialDialog.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */