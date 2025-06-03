package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting
abstract interface AppCompatSpinner$SpinnerPopup
{
  public abstract void dismiss();
  
  public abstract Drawable getBackground();
  
  public abstract CharSequence getHintText();
  
  public abstract int getHorizontalOffset();
  
  public abstract int getHorizontalOriginalOffset();
  
  public abstract int getVerticalOffset();
  
  public abstract boolean isShowing();
  
  public abstract void setAdapter(ListAdapter paramListAdapter);
  
  public abstract void setBackgroundDrawable(Drawable paramDrawable);
  
  public abstract void setHorizontalOffset(int paramInt);
  
  public abstract void setHorizontalOriginalOffset(int paramInt);
  
  public abstract void setPromptText(CharSequence paramCharSequence);
  
  public abstract void setVerticalOffset(int paramInt);
  
  public abstract void show(int paramInt1, int paramInt2);
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */