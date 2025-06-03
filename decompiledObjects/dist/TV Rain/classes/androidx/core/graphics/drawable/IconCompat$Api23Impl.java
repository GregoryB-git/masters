package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import z2;

@RequiresApi(23)
class IconCompat$Api23Impl
{
  @Nullable
  public static IconCompat createFromIcon(@NonNull Context paramContext, @NonNull Icon paramIcon)
  {
    int i = getType(paramIcon);
    if (i != 2)
    {
      if (i != 4)
      {
        if (i != 6)
        {
          paramContext = new IconCompat(-1);
          mObj1 = paramIcon;
          return paramContext;
        }
        return IconCompat.createWithAdaptiveBitmapContentUri(getUri(paramIcon));
      }
      return IconCompat.createWithContentUri(getUri(paramIcon));
    }
    String str = getResPackage(paramIcon);
    try
    {
      paramContext = IconCompat.createWithResource(IconCompat.getResources(paramContext, str), str, getResId(paramIcon));
      return paramContext;
    }
    catch (Resources.NotFoundException paramContext)
    {
      throw new IllegalArgumentException("Icon resource cannot be found");
    }
  }
  
  public static IconCompat createFromIconInner(@NonNull Object paramObject)
  {
    Preconditions.checkNotNull(paramObject);
    int i = getType(paramObject);
    if (i != 2)
    {
      if (i != 4)
      {
        if (i != 6)
        {
          IconCompat localIconCompat = new IconCompat(-1);
          mObj1 = paramObject;
          return localIconCompat;
        }
        return IconCompat.createWithAdaptiveBitmapContentUri(getUri(paramObject));
      }
      return IconCompat.createWithContentUri(getUri(paramObject));
    }
    return IconCompat.createWithResource(null, getResPackage(paramObject), getResId(paramObject));
  }
  
  @DrawableRes
  @IdRes
  public static int getResId(@NonNull Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return IconCompat.Api28Impl.getResId(paramObject);
    }
    try
    {
      int i = ((Integer)paramObject.getClass().getMethod("getResId", new Class[0]).invoke(paramObject, new Object[0])).intValue();
      return i;
    }
    catch (NoSuchMethodException paramObject)
    {
      Log.e("IconCompat", "Unable to get icon resource", (Throwable)paramObject);
      return 0;
    }
    catch (InvocationTargetException paramObject)
    {
      Log.e("IconCompat", "Unable to get icon resource", (Throwable)paramObject);
      return 0;
    }
    catch (IllegalAccessException paramObject)
    {
      Log.e("IconCompat", "Unable to get icon resource", (Throwable)paramObject);
    }
    return 0;
  }
  
  @Nullable
  public static String getResPackage(@NonNull Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return IconCompat.Api28Impl.getResPackage(paramObject);
    }
    try
    {
      paramObject = (String)paramObject.getClass().getMethod("getResPackage", new Class[0]).invoke(paramObject, new Object[0]);
      return (String)paramObject;
    }
    catch (NoSuchMethodException paramObject)
    {
      Log.e("IconCompat", "Unable to get icon package", (Throwable)paramObject);
      return null;
    }
    catch (InvocationTargetException paramObject)
    {
      Log.e("IconCompat", "Unable to get icon package", (Throwable)paramObject);
      return null;
    }
    catch (IllegalAccessException paramObject)
    {
      Log.e("IconCompat", "Unable to get icon package", (Throwable)paramObject);
    }
    return null;
  }
  
  public static int getType(@NonNull Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return IconCompat.Api28Impl.getType(paramObject);
    }
    try
    {
      int i = ((Integer)paramObject.getClass().getMethod("getType", new Class[0]).invoke(paramObject, new Object[0])).intValue();
      return i;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("Unable to get icon type ");
      localStringBuilder2.append(paramObject);
      Log.e("IconCompat", localStringBuilder2.toString(), localNoSuchMethodException);
      return -1;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("Unable to get icon type ");
      localStringBuilder2.append(paramObject);
      Log.e("IconCompat", localStringBuilder2.toString(), localInvocationTargetException);
      return -1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("Unable to get icon type ");
      localStringBuilder1.append(paramObject);
      Log.e("IconCompat", localStringBuilder1.toString(), localIllegalAccessException);
    }
    return -1;
  }
  
  @DoNotInline
  @Nullable
  public static Uri getUri(@NonNull Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return IconCompat.Api28Impl.getUri(paramObject);
    }
    try
    {
      paramObject = (Uri)paramObject.getClass().getMethod("getUri", new Class[0]).invoke(paramObject, new Object[0]);
      return (Uri)paramObject;
    }
    catch (NoSuchMethodException paramObject)
    {
      Log.e("IconCompat", "Unable to get icon uri", (Throwable)paramObject);
      return null;
    }
    catch (InvocationTargetException paramObject)
    {
      Log.e("IconCompat", "Unable to get icon uri", (Throwable)paramObject);
      return null;
    }
    catch (IllegalAccessException paramObject)
    {
      Log.e("IconCompat", "Unable to get icon uri", (Throwable)paramObject);
    }
    return null;
  }
  
  @DoNotInline
  public static Drawable loadDrawable(Icon paramIcon, Context paramContext)
  {
    return paramIcon.loadDrawable(paramContext);
  }
  
  @DoNotInline
  public static Icon toIcon(IconCompat paramIconCompat, Context paramContext)
  {
    switch (mType)
    {
    case 0: 
    default: 
      throw new IllegalArgumentException("Unknown type");
    case 6: 
      int i = Build.VERSION.SDK_INT;
      if (i >= 30)
      {
        paramContext = IconCompat.Api30Impl.createWithAdaptiveBitmapContentUri(paramIconCompat.getUri());
      }
      else if (paramContext != null)
      {
        paramContext = paramIconCompat.getUriInputStream(paramContext);
        if (paramContext != null)
        {
          if (i >= 26) {
            paramContext = IconCompat.Api26Impl.createWithAdaptiveBitmap(BitmapFactory.decodeStream(paramContext));
          } else {
            paramContext = Icon.createWithBitmap(IconCompat.createLegacyIconFromAdaptiveIcon(BitmapFactory.decodeStream(paramContext), false));
          }
        }
        else
        {
          paramContext = z2.t("Cannot load adaptive icon from uri: ");
          paramContext.append(paramIconCompat.getUri());
          throw new IllegalStateException(paramContext.toString());
        }
      }
      else
      {
        paramContext = z2.t("Context is required to resolve the file uri of the icon: ");
        paramContext.append(paramIconCompat.getUri());
        throw new IllegalArgumentException(paramContext.toString());
      }
    case 5: 
      if (Build.VERSION.SDK_INT >= 26) {
        paramContext = IconCompat.Api26Impl.createWithAdaptiveBitmap((Bitmap)mObj1);
      } else {
        paramContext = Icon.createWithBitmap(IconCompat.createLegacyIconFromAdaptiveIcon((Bitmap)mObj1, false));
      }
      break;
    case 4: 
      paramContext = Icon.createWithContentUri((String)mObj1);
      break;
    case 3: 
      paramContext = Icon.createWithData((byte[])mObj1, mInt1, mInt2);
      break;
    case 2: 
      paramContext = Icon.createWithResource(paramIconCompat.getResPackage(), mInt1);
      break;
    case 1: 
      paramContext = Icon.createWithBitmap((Bitmap)mObj1);
      ColorStateList localColorStateList = mTintList;
      if (localColorStateList != null) {
        paramContext.setTintList(localColorStateList);
      }
      paramIconCompat = mTintMode;
      if (paramIconCompat != IconCompat.DEFAULT_TINT_MODE) {
        paramContext.setTintMode(paramIconCompat);
      }
      return paramContext;
    }
    return (Icon)mObj1;
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.IconCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */