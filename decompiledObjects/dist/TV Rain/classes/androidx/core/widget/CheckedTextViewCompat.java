package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class CheckedTextViewCompat
{
  private static final String TAG = "CheckedTextViewCompat";
  
  @Nullable
  public static Drawable getCheckMarkDrawable(@NonNull CheckedTextView paramCheckedTextView)
  {
    return Api16Impl.getCheckMarkDrawable(paramCheckedTextView);
  }
  
  @Nullable
  public static ColorStateList getCheckMarkTintList(@NonNull CheckedTextView paramCheckedTextView)
  {
    return Api21Impl.getCheckMarkTintList(paramCheckedTextView);
  }
  
  @Nullable
  public static PorterDuff.Mode getCheckMarkTintMode(@NonNull CheckedTextView paramCheckedTextView)
  {
    return Api21Impl.getCheckMarkTintMode(paramCheckedTextView);
  }
  
  public static void setCheckMarkTintList(@NonNull CheckedTextView paramCheckedTextView, @Nullable ColorStateList paramColorStateList)
  {
    Api21Impl.setCheckMarkTintList(paramCheckedTextView, paramColorStateList);
  }
  
  public static void setCheckMarkTintMode(@NonNull CheckedTextView paramCheckedTextView, @Nullable PorterDuff.Mode paramMode)
  {
    Api21Impl.setCheckMarkTintMode(paramCheckedTextView, paramMode);
  }
  
  public static class Api14Impl
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
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @Nullable
    public static Drawable getCheckMarkDrawable(@NonNull CheckedTextView paramCheckedTextView)
    {
      return paramCheckedTextView.getCheckMarkDrawable();
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.widget.CheckedTextViewCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */