package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import z2;

@RequiresApi(20)
class WindowInsetsCompat$Impl20
  extends WindowInsetsCompat.Impl
{
  private static Class<?> sAttachInfoClass;
  private static Field sAttachInfoField;
  private static Method sGetViewRootImplMethod;
  private static Field sVisibleInsetsField;
  private static boolean sVisibleRectReflectionFetched = false;
  private Insets[] mOverriddenInsets;
  @NonNull
  public final WindowInsets mPlatformInsets;
  public Insets mRootViewVisibleInsets;
  private WindowInsetsCompat mRootWindowInsets;
  private Insets mSystemWindowInsets = null;
  
  public WindowInsetsCompat$Impl20(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull WindowInsets paramWindowInsets)
  {
    super(paramWindowInsetsCompat);
    mPlatformInsets = paramWindowInsets;
  }
  
  public WindowInsetsCompat$Impl20(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull Impl20 paramImpl20)
  {
    this(paramWindowInsetsCompat, new WindowInsets(mPlatformInsets));
  }
  
  @SuppressLint({"WrongConstant"})
  @NonNull
  private Insets getInsets(int paramInt, boolean paramBoolean)
  {
    Insets localInsets = Insets.NONE;
    int i = 1;
    while (i <= 256)
    {
      if ((paramInt & i) != 0) {
        localInsets = Insets.max(localInsets, getInsetsForType(i, paramBoolean));
      }
      i <<= 1;
    }
    return localInsets;
  }
  
  private Insets getRootStableInsets()
  {
    WindowInsetsCompat localWindowInsetsCompat = mRootWindowInsets;
    if (localWindowInsetsCompat != null) {
      return localWindowInsetsCompat.getStableInsets();
    }
    return Insets.NONE;
  }
  
  @Nullable
  private Insets getVisibleInsets(@NonNull View paramView)
  {
    if (Build.VERSION.SDK_INT < 30)
    {
      if (!sVisibleRectReflectionFetched) {
        loadReflectionField();
      }
      Object localObject1 = sGetViewRootImplMethod;
      Object localObject2 = null;
      if ((localObject1 != null) && (sAttachInfoClass != null) && (sVisibleInsetsField != null)) {
        try
        {
          paramView = ((Method)localObject1).invoke(paramView, new Object[0]);
          if (paramView == null)
          {
            paramView = new java/lang/NullPointerException;
            paramView.<init>();
            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", paramView);
            return null;
          }
          paramView = sAttachInfoField.get(paramView);
          localObject1 = (Rect)sVisibleInsetsField.get(paramView);
          paramView = (View)localObject2;
          if (localObject1 != null) {
            paramView = Insets.of((Rect)localObject1);
          }
          return paramView;
        }
        catch (ReflectiveOperationException localReflectiveOperationException)
        {
          paramView = z2.t("Failed to get visible insets. (Reflection error). ");
          paramView.append(localReflectiveOperationException.getMessage());
          Log.e("WindowInsetsCompat", paramView.toString(), localReflectiveOperationException);
        }
      }
      return null;
    }
    throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
  }
  
  @SuppressLint({"PrivateApi"})
  private static void loadReflectionField()
  {
    try
    {
      sGetViewRootImplMethod = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
      localObject = Class.forName("android.view.View$AttachInfo");
      sAttachInfoClass = (Class)localObject;
      sVisibleInsetsField = ((Class)localObject).getDeclaredField("mVisibleInsets");
      sAttachInfoField = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
      sVisibleInsetsField.setAccessible(true);
      sAttachInfoField.setAccessible(true);
    }
    catch (ReflectiveOperationException localReflectiveOperationException)
    {
      Object localObject = z2.t("Failed to get visible insets. (Reflection error). ");
      ((StringBuilder)localObject).append(localReflectiveOperationException.getMessage());
      Log.e("WindowInsetsCompat", ((StringBuilder)localObject).toString(), localReflectiveOperationException);
    }
    sVisibleRectReflectionFetched = true;
  }
  
  public void copyRootViewBounds(@NonNull View paramView)
  {
    Insets localInsets = getVisibleInsets(paramView);
    paramView = localInsets;
    if (localInsets == null) {
      paramView = Insets.NONE;
    }
    setRootViewData(paramView);
  }
  
  public void copyWindowDataInto(@NonNull WindowInsetsCompat paramWindowInsetsCompat)
  {
    paramWindowInsetsCompat.setRootWindowInsets(mRootWindowInsets);
    paramWindowInsetsCompat.setRootViewData(mRootViewVisibleInsets);
  }
  
  public boolean equals(Object paramObject)
  {
    if (!super.equals(paramObject)) {
      return false;
    }
    paramObject = (Impl20)paramObject;
    return Objects.equals(mRootViewVisibleInsets, mRootViewVisibleInsets);
  }
  
  @NonNull
  public Insets getInsets(int paramInt)
  {
    return getInsets(paramInt, false);
  }
  
  @NonNull
  public Insets getInsetsForType(int paramInt, boolean paramBoolean)
  {
    if (paramInt != 1)
    {
      Object localObject1 = null;
      Insets localInsets = null;
      if (paramInt != 2)
      {
        if (paramInt != 8)
        {
          if (paramInt != 16)
          {
            if (paramInt != 32)
            {
              if (paramInt != 64)
              {
                if (paramInt != 128) {
                  return Insets.NONE;
                }
                localObject1 = mRootWindowInsets;
                if (localObject1 != null) {
                  localObject1 = ((WindowInsetsCompat)localObject1).getDisplayCutout();
                } else {
                  localObject1 = getDisplayCutout();
                }
                if (localObject1 != null) {
                  return Insets.of(((DisplayCutoutCompat)localObject1).getSafeInsetLeft(), ((DisplayCutoutCompat)localObject1).getSafeInsetTop(), ((DisplayCutoutCompat)localObject1).getSafeInsetRight(), ((DisplayCutoutCompat)localObject1).getSafeInsetBottom());
                }
                return Insets.NONE;
              }
              return getTappableElementInsets();
            }
            return getMandatorySystemGestureInsets();
          }
          return getSystemGestureInsets();
        }
        localObject2 = mOverriddenInsets;
        localObject1 = localInsets;
        if (localObject2 != null) {
          localObject1 = localObject2[WindowInsetsCompat.Type.indexOf(8)];
        }
        if (localObject1 != null) {
          return (Insets)localObject1;
        }
        localInsets = getSystemWindowInsets();
        localObject1 = getRootStableInsets();
        paramInt = bottom;
        if (paramInt > bottom) {
          return Insets.of(0, 0, 0, paramInt);
        }
        localInsets = mRootViewVisibleInsets;
        if ((localInsets != null) && (!localInsets.equals(Insets.NONE)))
        {
          paramInt = mRootViewVisibleInsets.bottom;
          if (paramInt > bottom) {
            return Insets.of(0, 0, 0, paramInt);
          }
        }
        return Insets.NONE;
      }
      if (paramBoolean)
      {
        localInsets = getRootStableInsets();
        localObject1 = getStableInsets();
        return Insets.of(Math.max(left, left), 0, Math.max(right, right), Math.max(bottom, bottom));
      }
      localInsets = getSystemWindowInsets();
      Object localObject2 = mRootWindowInsets;
      if (localObject2 != null) {
        localObject1 = ((WindowInsetsCompat)localObject2).getStableInsets();
      }
      int i = bottom;
      paramInt = i;
      if (localObject1 != null) {
        paramInt = Math.min(i, bottom);
      }
      return Insets.of(left, 0, right, paramInt);
    }
    if (paramBoolean) {
      return Insets.of(0, Math.max(getRootStableInsetstop, getSystemWindowInsetstop), 0, 0);
    }
    return Insets.of(0, getSystemWindowInsetstop, 0, 0);
  }
  
  @NonNull
  public Insets getInsetsIgnoringVisibility(int paramInt)
  {
    return getInsets(paramInt, true);
  }
  
  @NonNull
  public final Insets getSystemWindowInsets()
  {
    if (mSystemWindowInsets == null) {
      mSystemWindowInsets = Insets.of(mPlatformInsets.getSystemWindowInsetLeft(), mPlatformInsets.getSystemWindowInsetTop(), mPlatformInsets.getSystemWindowInsetRight(), mPlatformInsets.getSystemWindowInsetBottom());
    }
    return mSystemWindowInsets;
  }
  
  @NonNull
  public WindowInsetsCompat inset(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    WindowInsetsCompat.Builder localBuilder = new WindowInsetsCompat.Builder(WindowInsetsCompat.toWindowInsetsCompat(mPlatformInsets));
    localBuilder.setSystemWindowInsets(WindowInsetsCompat.insetInsets(getSystemWindowInsets(), paramInt1, paramInt2, paramInt3, paramInt4));
    localBuilder.setStableInsets(WindowInsetsCompat.insetInsets(getStableInsets(), paramInt1, paramInt2, paramInt3, paramInt4));
    return localBuilder.build();
  }
  
  public boolean isRound()
  {
    return mPlatformInsets.isRound();
  }
  
  public boolean isTypeVisible(int paramInt)
  {
    if ((paramInt != 1) && (paramInt != 2)) {
      if (paramInt != 4)
      {
        if ((paramInt != 8) && (paramInt != 128)) {
          return true;
        }
      }
      else {
        return false;
      }
    }
    return getInsetsForType(paramInt, false).equals(Insets.NONE) ^ true;
  }
  
  @SuppressLint({"WrongConstant"})
  public boolean isVisible(int paramInt)
  {
    int i = 1;
    while (i <= 256)
    {
      if (((paramInt & i) != 0) && (!isTypeVisible(i))) {
        return false;
      }
      i <<= 1;
    }
    return true;
  }
  
  public void setOverriddenInsets(Insets[] paramArrayOfInsets)
  {
    mOverriddenInsets = paramArrayOfInsets;
  }
  
  public void setRootViewData(@NonNull Insets paramInsets)
  {
    mRootViewVisibleInsets = paramInsets;
  }
  
  public void setRootWindowInsets(@Nullable WindowInsetsCompat paramWindowInsetsCompat)
  {
    mRootWindowInsets = paramWindowInsetsCompat;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.Impl20
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */