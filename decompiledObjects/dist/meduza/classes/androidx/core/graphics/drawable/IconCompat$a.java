package androidx.core.graphics.drawable;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class IconCompat$a
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
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unable to get icon type ");
      localStringBuilder.append(paramObject);
      Log.e("IconCompat", localStringBuilder.toString(), localNoSuchMethodException);
      return -1;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        localStringBuilder = new StringBuilder();
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        StringBuilder localStringBuilder = new StringBuilder();
      }
    }
  }
  
  public static Uri d(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return IconCompat.c.d(paramObject);
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
        paramContext = IconCompat.d.a(paramIconCompat.g());
      }
      else if (paramContext != null)
      {
        Uri localUri = paramIconCompat.g();
        localObject = localUri.getScheme();
        StringBuilder localStringBuilder;
        if ((!"content".equals(localObject)) && (!"file".equals(localObject))) {
          try
          {
            paramContext = new java/io/File;
            paramContext.<init>((String)b);
            paramContext = new FileInputStream(paramContext);
          }
          catch (FileNotFoundException paramContext)
          {
            localStringBuilder = new StringBuilder();
            localObject = "Unable to load image from path: ";
            break label191;
          }
        } else {
          try
          {
            paramContext = paramContext.getContentResolver().openInputStream(localUri);
          }
          catch (Exception paramContext)
          {
            localStringBuilder = new StringBuilder();
            localObject = "Unable to load image from URI: ";
          }
        }
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(localUri);
        Log.w("IconCompat", localStringBuilder.toString(), paramContext);
        paramContext = null;
        if (paramContext != null)
        {
          localObject = BitmapFactory.decodeStream(paramContext);
          paramContext = (Context)localObject;
          if (i < 26) {
            break label330;
          }
        }
        else
        {
          paramContext = f.l("Cannot load adaptive icon from uri: ");
          paramContext.append(paramIconCompat.g());
          throw new IllegalStateException(paramContext.toString());
        }
      }
      else
      {
        paramContext = f.l("Context is required to resolve the file uri of the icon: ");
        paramContext.append(paramIconCompat.g());
        throw new IllegalArgumentException(paramContext.toString());
      }
    case 5: 
      if (Build.VERSION.SDK_INT >= 26)
      {
        localObject = (Bitmap)b;
        paramContext = IconCompat.b.b((Bitmap)localObject);
      }
      else
      {
        paramContext = (Bitmap)b;
        paramContext = IconCompat.c(paramContext, false);
      }
      break;
    case 4: 
      paramContext = Icon.createWithContentUri((String)b);
      break;
    case 3: 
      paramContext = Icon.createWithData((byte[])b, e, f);
      break;
    case 2: 
      paramContext = Icon.createWithResource(paramIconCompat.f(), e);
      break;
    case 1: 
      label191:
      label330:
      paramContext = (Bitmap)b;
      paramContext = Icon.createWithBitmap(paramContext);
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