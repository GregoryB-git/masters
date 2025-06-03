package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class CheckedTextViewCompat$Api21Impl
{
  @Nullable
  public static ColorStateList getCheckMarkTintList(@NonNull CheckedTextView paramCheckedTextView)
  {
    return paramCheckedTextView.getCheckMarkTintList();
  }
  
  @Nullable
  public static PorterDuff.Mode getCheckMarkTintMode(@NonNull CheckedTextView paramCheckedTextView)
  {
    return paramCheckedTextView.getCheckMarkTintMode();
  }
  
  public static void setCheckMarkTintList(@NonNull CheckedTextView paramCheckedTextView, @Nullable ColorStateList paramColorStateList)
  {
    paramCheckedTextView.setCheckMarkTintList(paramColorStateList);
  }
  
  public static void setCheckMarkTintMode(@NonNull CheckedTextView paramCheckedTextView, @Nullable PorterDuff.Mode paramMode)
  {
    paramCheckedTextView.setCheckMarkTintMode(paramMode);
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.CheckedTextViewCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */