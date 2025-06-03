package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class IconCompat$a
{
  public static int a(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return IconCompat.c.a(paramObject);
    }
    try
    {
      int i = ((Integer)paramObject.getClass().getMethod("getResId", new Class[0]).invoke(paramObject, new Object[0])).intValue();
      return i;
    }
    catch (NoSuchMethodException paramObject) {}catch (InvocationTargetException paramObject)
    {
      break label66;
    }
    catch (IllegalAccessException paramObject) {}
    Log.e("IconCompat", "Unable to get icon resource", (Throwable)paramObject);
    return 0;
    label66:
    Log.e("IconCompat", "Unable to get icon resource", (Throwable)paramObject);
    return 0;
    Log.e("IconCompat", "Unable to get icon resource", (Throwable)paramObject);
    return 0;
  }
  
  public static String b(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return IconCompat.c.b(paramObject);
    }
    try
    {
      paramObject = (String)paramObject.getClass().getMethod("getResPackage", new Class[0]).invoke(paramObject, new Object[0]);
      return (String)paramObject;
    }
    catch (NoSuchMethodException paramObject) {}catch (InvocationTargetException paramObject)
    {
      break label63;
    }
    catch (IllegalAccessException paramObject) {}
    Log.e("IconCompat", "Unable to get icon package", (Throwable)paramObject);
    return null;
    label63:
    Log.e("IconCompat", "Unable to get icon package", (Throwable)paramObject);
    return null;
    Log.e("IconCompat", "Unable to get icon package", (Throwable)paramObject);
    return null;
  }
  
  public static int c(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return IconCompat.c.c(paramObject);
    }
    try
    {
      int i = ((Integer)paramObject.getClass().getMethod("getType", new Class[0]).invoke(paramObject, new Object[0])).intValue();
      return i;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (InvocationTargetException localInvocationTargetException)
    {
      break label89;
    }
    catch (IllegalAccessException localIllegalAccessException) {}
    StringBuilder localStringBuilder = new StringBuilder();
    for (;;)
    {
      localStringBuilder.append("Unable to get icon type ");
      localStringBuilder.append(paramObject);
      Log.e("IconCompat", localStringBuilder.toString(), localIllegalAccessException);
      return -1;
      label89:
      localStringBuilder = new StringBuilder();
      continue;
      localStringBuilder = new StringBuilder();
    }
  }
  
  public static Uri d(@NonNull Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return IconCompat.c.d(paramObject);
    }
    try
    {
      paramObject = (Uri)paramObject.getClass().getMethod("getUri", new Class[0]).invoke(paramObject, new Object[0]);
      return (Uri)paramObject;
    }
    catch (NoSuchMethodException paramObject) {}catch (InvocationTargetException paramObject)
    {
      break label63;
    }
    catch (IllegalAccessException paramObject) {}
    Log.e("IconCompat", "Unable to get icon uri", (Throwable)paramObject);
    return null;
    label63:
    Log.e("IconCompat", "Unable to get icon uri", (Throwable)paramObject);
    return null;
    Log.e("IconCompat", "Unable to get icon uri", (Throwable)paramObject);
    return null;
  }
  
  public static Drawable e(Icon paramIcon, Context paramContext)
  {
    return paramIcon.loadDrawable(paramContext);
  }
  
  public static Icon f(IconCompat paramIconCompat, Context paramContext)
  {
    Object localObject;
    switch (a)
    {
    case 0: 
    default: 
      throw new IllegalArgumentException("Unknown type");
    case 6: 
      int i = Build.VERSION.SDK_INT;
      if (i >= 30)
      {
        paramContext = IconCompat.d.a(paramIconCompat.j());
      }
      else if (paramContext != null)
      {
        paramContext = paramIconCompat.k(paramContext);
        if (paramContext != null)
        {
          paramContext = BitmapFactory.decodeStream(paramContext);
          localObject = paramContext;
          if (i >= 26) {
            paramContext = IconCompat.b.b(paramContext);
          }
        }
      }
      break;
    case 5: 
    case 4: 
    case 3: 
    case 2: 
    case 1: 
      label118:
      for (paramContext = IconCompat.c((Bitmap)localObject, false);; paramContext = (Bitmap)b)
      {
        paramContext = Icon.createWithBitmap(paramContext);
        break label296;
        paramContext = new StringBuilder();
        paramContext.append("Cannot load adaptive icon from uri: ");
        paramContext.append(paramIconCompat.j());
        throw new IllegalStateException(paramContext.toString());
        paramContext = new StringBuilder();
        paramContext.append("Context is required to resolve the file uri of the icon: ");
        paramContext.append(paramIconCompat.j());
        throw new IllegalArgumentException(paramContext.toString());
        if (Build.VERSION.SDK_INT >= 26)
        {
          paramContext = (Bitmap)b;
          break;
        }
        localObject = (Bitmap)b;
        break label118;
        paramContext = Icon.createWithContentUri((String)b);
        break label296;
        paramContext = Icon.createWithData((byte[])b, e, f);
        break label296;
        paramContext = Icon.createWithResource(paramIconCompat.h(), e);
        break label296;
      }
      label296:
      localObject = g;
      if (localObject != null) {
        paramContext.setTintList((ColorStateList)localObject);
      }
      paramIconCompat = h;
      if (paramIconCompat != IconCompat.k) {
        paramContext.setTintMode(paramIconCompat);
      }
      return paramContext;
    }
    return (Icon)b;
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.IconCompat.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */