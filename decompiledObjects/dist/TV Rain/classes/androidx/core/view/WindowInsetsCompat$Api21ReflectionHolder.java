package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import z2;

@SuppressLint({"SoonBlockedPrivateApi"})
@RequiresApi(21)
class WindowInsetsCompat$Api21ReflectionHolder
{
  private static Field sContentInsets;
  private static boolean sReflectionSucceeded;
  private static Field sStableInsets;
  private static Field sViewAttachInfoField;
  
  static
  {
    try
    {
      localObject = View.class.getDeclaredField("mAttachInfo");
      sViewAttachInfoField = (Field)localObject;
      ((AccessibleObject)localObject).setAccessible(true);
      Class localClass = Class.forName("android.view.View$AttachInfo");
      localObject = localClass.getDeclaredField("mStableInsets");
      sStableInsets = (Field)localObject;
      ((AccessibleObject)localObject).setAccessible(true);
      localObject = localClass.getDeclaredField("mContentInsets");
      sContentInsets = (Field)localObject;
      ((AccessibleObject)localObject).setAccessible(true);
      sReflectionSucceeded = true;
    }
    catch (ReflectiveOperationException localReflectiveOperationException)
    {
      Object localObject = z2.t("Failed to get visible insets from AttachInfo ");
      ((StringBuilder)localObject).append(localReflectiveOperationException.getMessage());
      Log.w("WindowInsetsCompat", ((StringBuilder)localObject).toString(), localReflectiveOperationException);
    }
  }
  
  @Nullable
  public static WindowInsetsCompat getRootWindowInsets(@NonNull View paramView)
  {
    if ((sReflectionSucceeded) && (paramView.isAttachedToWindow()))
    {
      Object localObject1 = paramView.getRootView();
      try
      {
        Object localObject2 = sViewAttachInfoField.get(localObject1);
        if (localObject2 != null)
        {
          localObject1 = (Rect)sStableInsets.get(localObject2);
          Rect localRect = (Rect)sContentInsets.get(localObject2);
          if ((localObject1 != null) && (localRect != null))
          {
            localObject2 = new androidx/core/view/WindowInsetsCompat$Builder;
            ((WindowInsetsCompat.Builder)localObject2).<init>();
            localObject1 = ((WindowInsetsCompat.Builder)localObject2).setStableInsets(Insets.of((Rect)localObject1)).setSystemWindowInsets(Insets.of(localRect)).build();
            ((WindowInsetsCompat)localObject1).setRootWindowInsets((WindowInsetsCompat)localObject1);
            ((WindowInsetsCompat)localObject1).copyRootViewBounds(paramView.getRootView());
            return (WindowInsetsCompat)localObject1;
          }
        }
      }
      catch (IllegalAccessException paramView)
      {
        localObject1 = z2.t("Failed to get insets from AttachInfo. ");
        ((StringBuilder)localObject1).append(paramView.getMessage());
        Log.w("WindowInsetsCompat", ((StringBuilder)localObject1).toString(), paramView);
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */