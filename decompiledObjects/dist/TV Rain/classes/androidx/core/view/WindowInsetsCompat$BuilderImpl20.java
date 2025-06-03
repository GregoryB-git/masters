package androidx.core.view;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

@RequiresApi(api=20)
class WindowInsetsCompat$BuilderImpl20
  extends WindowInsetsCompat.BuilderImpl
{
  private static Constructor<WindowInsets> sConstructor;
  private static boolean sConstructorFetched = false;
  private static Field sConsumedField;
  private static boolean sConsumedFieldFetched = false;
  private WindowInsets mPlatformInsets;
  private Insets mStableInsets;
  
  public WindowInsetsCompat$BuilderImpl20()
  {
    mPlatformInsets = createWindowInsetsInstance();
  }
  
  public WindowInsetsCompat$BuilderImpl20(@NonNull WindowInsetsCompat paramWindowInsetsCompat)
  {
    super(paramWindowInsetsCompat);
    mPlatformInsets = paramWindowInsetsCompat.toWindowInsets();
  }
  
  @Nullable
  private static WindowInsets createWindowInsetsInstance()
  {
    if (!sConsumedFieldFetched)
    {
      try
      {
        sConsumedField = WindowInsets.class.getDeclaredField("CONSUMED");
      }
      catch (ReflectiveOperationException localReflectiveOperationException1)
      {
        Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", localReflectiveOperationException1);
      }
      sConsumedFieldFetched = true;
    }
    Object localObject1 = sConsumedField;
    if (localObject1 != null) {
      try
      {
        localObject1 = (WindowInsets)((Field)localObject1).get(null);
        if (localObject1 != null)
        {
          localObject1 = new WindowInsets((WindowInsets)localObject1);
          return (WindowInsets)localObject1;
        }
      }
      catch (ReflectiveOperationException localReflectiveOperationException2)
      {
        Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", localReflectiveOperationException2);
      }
    }
    if (!sConstructorFetched)
    {
      try
      {
        sConstructor = WindowInsets.class.getConstructor(new Class[] { Rect.class });
      }
      catch (ReflectiveOperationException localReflectiveOperationException3)
      {
        Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", localReflectiveOperationException3);
      }
      sConstructorFetched = true;
    }
    Object localObject2 = sConstructor;
    if (localObject2 != null) {
      try
      {
        Rect localRect = new android/graphics/Rect;
        localRect.<init>();
        localObject2 = (WindowInsets)((Constructor)localObject2).newInstance(new Object[] { localRect });
        return (WindowInsets)localObject2;
      }
      catch (ReflectiveOperationException localReflectiveOperationException4)
      {
        Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", localReflectiveOperationException4);
      }
    }
    return null;
  }
  
  @NonNull
  public WindowInsetsCompat build()
  {
    applyInsetTypes();
    WindowInsetsCompat localWindowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(mPlatformInsets);
    localWindowInsetsCompat.setOverriddenInsets(mInsetsTypeMask);
    localWindowInsetsCompat.setStableInsets(mStableInsets);
    return localWindowInsetsCompat;
  }
  
  public void setStableInsets(@Nullable Insets paramInsets)
  {
    mStableInsets = paramInsets;
  }
  
  public void setSystemWindowInsets(@NonNull Insets paramInsets)
  {
    WindowInsets localWindowInsets = mPlatformInsets;
    if (localWindowInsets != null) {
      mPlatformInsets = localWindowInsets.replaceSystemWindowInsets(left, top, right, bottom);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.BuilderImpl20
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */