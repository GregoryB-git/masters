package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import e;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

class ImageViewUtils
{
  private static Field sDrawMatrixField;
  private static boolean sDrawMatrixFieldFetched = false;
  private static boolean sTryHiddenAnimateTransform = true;
  
  public static void animateTransform(@NonNull ImageView paramImageView, @Nullable Matrix paramMatrix)
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      e.q(paramImageView, paramMatrix);
    }
    else if (paramMatrix == null)
    {
      paramMatrix = paramImageView.getDrawable();
      if (paramMatrix != null)
      {
        paramMatrix.setBounds(0, 0, paramImageView.getWidth() - paramImageView.getPaddingLeft() - paramImageView.getPaddingRight(), paramImageView.getHeight() - paramImageView.getPaddingTop() - paramImageView.getPaddingBottom());
        paramImageView.invalidate();
      }
    }
    else
    {
      hiddenAnimateTransform(paramImageView, paramMatrix);
    }
  }
  
  private static void fetchDrawMatrixField()
  {
    if (!sDrawMatrixFieldFetched) {}
    try
    {
      Field localField = ImageView.class.getDeclaredField("mDrawMatrix");
      sDrawMatrixField = localField;
      localField.setAccessible(true);
      sDrawMatrixFieldFetched = true;
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  @SuppressLint({"NewApi"})
  @RequiresApi(21)
  private static void hiddenAnimateTransform(@NonNull ImageView paramImageView, @Nullable Matrix paramMatrix)
  {
    if (sTryHiddenAnimateTransform) {
      try
      {
        e.q(paramImageView, paramMatrix);
      }
      catch (NoSuchMethodError paramImageView)
      {
        sTryHiddenAnimateTransform = false;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ImageViewUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */