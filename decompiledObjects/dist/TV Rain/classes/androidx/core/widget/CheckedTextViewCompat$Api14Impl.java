package androidx.core.widget;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

class CheckedTextViewCompat$Api14Impl
{
  private static Field sCheckMarkDrawableField;
  private static boolean sResolved;
  
  @Nullable
  public static Drawable getCheckMarkDrawable(@NonNull CheckedTextView paramCheckedTextView)
  {
    if (!sResolved)
    {
      try
      {
        Field localField1 = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
        sCheckMarkDrawableField = localField1;
        localField1.setAccessible(true);
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        Log.i("CheckedTextViewCompat", "Failed to retrieve mCheckMarkDrawable field", localNoSuchFieldException);
      }
      sResolved = true;
    }
    Field localField2 = sCheckMarkDrawableField;
    if (localField2 != null) {
      try
      {
        paramCheckedTextView = (Drawable)localField2.get(paramCheckedTextView);
        return paramCheckedTextView;
      }
      catch (IllegalAccessException paramCheckedTextView)
      {
        Log.i("CheckedTextViewCompat", "Failed to get check mark drawable via reflection", paramCheckedTextView);
        sCheckMarkDrawableField = null;
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.CheckedTextViewCompat.Api14Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */