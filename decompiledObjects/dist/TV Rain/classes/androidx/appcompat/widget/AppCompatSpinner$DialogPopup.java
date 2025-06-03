package androidx.appcompat.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatDialog;

@VisibleForTesting
class AppCompatSpinner$DialogPopup
  implements AppCompatSpinner.SpinnerPopup, DialogInterface.OnClickListener
{
  private ListAdapter mListAdapter;
  @VisibleForTesting
  public AlertDialog mPopup;
  private CharSequence mPrompt;
  
  public AppCompatSpinner$DialogPopup(AppCompatSpinner paramAppCompatSpinner) {}
  
  public void dismiss()
  {
    AlertDialog localAlertDialog = mPopup;
    if (localAlertDialog != null)
    {
      localAlertDialog.dismiss();
      mPopup = null;
    }
  }
  
  public Drawable getBackground()
  {
    return null;
  }
  
  public CharSequence getHintText()
  {
    return mPrompt;
  }
  
  public int getHorizontalOffset()
  {
    return 0;
  }
  
  public int getHorizontalOriginalOffset()
  {
    return 0;
  }
  
  public int getVerticalOffset()
  {
    return 0;
  }
  
  public boolean isShowing()
  {
    AlertDialog localAlertDialog = mPopup;
    boolean bool;
    if (localAlertDialog != null) {
      bool = localAlertDialog.isShowing();
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this$0.setSelection(paramInt);
    if (this$0.getOnItemClickListener() != null) {
      this$0.performItemClick(null, paramInt, mListAdapter.getItemId(paramInt));
    }
    dismiss();
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    mListAdapter = paramListAdapter;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
  }
  
  public void setHorizontalOffset(int paramInt)
  {
    Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
  }
  
  public void setHorizontalOriginalOffset(int paramInt)
  {
    Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
  }
  
  public void setPromptText(CharSequence paramCharSequence)
  {
    mPrompt = paramCharSequence;
  }
  
  public void setVerticalOffset(int paramInt)
  {
    Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
  }
  
  public void show(int paramInt1, int paramInt2)
  {
    if (mListAdapter == null) {
      return;
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this$0.getPopupContext());
    Object localObject = mPrompt;
    if (localObject != null) {
      localBuilder.setTitle((CharSequence)localObject);
    }
    localObject = localBuilder.setSingleChoiceItems(mListAdapter, this$0.getSelectedItemPosition(), this).create();
    mPopup = ((AlertDialog)localObject);
    localObject = ((AlertDialog)localObject).getListView();
    AppCompatSpinner.Api17Impl.setTextDirection((View)localObject, paramInt1);
    AppCompatSpinner.Api17Impl.setTextAlignment((View)localObject, paramInt2);
    mPopup.show();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.DialogPopup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */