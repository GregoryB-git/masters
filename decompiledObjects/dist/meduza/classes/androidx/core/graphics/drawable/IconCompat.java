package androidx.core.graphics.drawable;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.recaptcha.internal.a;
import d2.k;
import e0.g0;
import f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class IconCompat
  extends CustomVersionedParcelable
{
  public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
  public int a;
  public Object b;
  public byte[] c;
  public Parcelable d;
  public int e;
  public int f;
  public ColorStateList g;
  public PorterDuff.Mode h;
  public String i;
  public String j;
  
  public IconCompat()
  {
    a = -1;
    c = null;
    d = null;
    e = 0;
    f = 0;
    g = null;
    h = k;
    i = null;
  }
  
  public IconCompat(int paramInt)
  {
    c = null;
    d = null;
    e = 0;
    f = 0;
    g = null;
    h = k;
    i = null;
    a = paramInt;
  }
  
  public static Bitmap c(Bitmap paramBitmap, boolean paramBoolean)
  {
    int m = (int)(Math.min(paramBitmap.getWidth(), paramBitmap.getHeight()) * 0.6666667F);
    Bitmap localBitmap = Bitmap.createBitmap(m, m, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint(3);
    float f1 = m;
    float f2 = 0.5F * f1;
    float f3 = 0.9166667F * f2;
    if (paramBoolean)
    {
      float f4 = 0.010416667F * f1;
      localPaint.setColor(0);
      localPaint.setShadowLayer(f4, 0.0F, f1 * 0.020833334F, 1023410176);
      localCanvas.drawCircle(f2, f2, f3, localPaint);
      localPaint.setShadowLayer(f4, 0.0F, 0.0F, 503316480);
      localCanvas.drawCircle(f2, f2, f3, localPaint);
      localPaint.clearShadowLayer();
    }
    localPaint.setColor(-16777216);
    Object localObject = Shader.TileMode.CLAMP;
    localObject = new BitmapShader(paramBitmap, (Shader.TileMode)localObject, (Shader.TileMode)localObject);
    Matrix localMatrix = new Matrix();
    localMatrix.setTranslate(-(paramBitmap.getWidth() - m) / 2.0F, -(paramBitmap.getHeight() - m) / 2.0F);
    ((Shader)localObject).setLocalMatrix(localMatrix);
    localPaint.setShader((Shader)localObject);
    localCanvas.drawCircle(f2, f2, f3, localPaint);
    localCanvas.setBitmap(null);
    return localBitmap;
  }
  
  public static IconCompat d(Resources paramResources, String paramString, int paramInt)
  {
    paramString.getClass();
    if (paramInt != 0)
    {
      IconCompat localIconCompat = new IconCompat(2);
      e = paramInt;
      if (paramResources != null) {
        try
        {
          b = paramResources.getResourceName(paramInt);
        }
        catch (Resources.NotFoundException paramResources)
        {
          throw new IllegalArgumentException("Icon resource cannot be found");
        }
      } else {
        b = paramString;
      }
      j = paramString;
      return localIconCompat;
    }
    throw new IllegalArgumentException("Drawable resource ID must not be 0");
  }
  
  public final int e()
  {
    int m = a;
    if (m == -1) {
      return a.a(b);
    }
    if (m == 2) {
      return e;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("called getResId() on ");
    localStringBuilder.append(this);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final String f()
  {
    int m = a;
    if (m == -1) {
      return a.b(b);
    }
    if (m == 2)
    {
      localObject = j;
      if ((localObject != null) && (!TextUtils.isEmpty((CharSequence)localObject))) {
        return j;
      }
      return ((String)b).split(":", -1)[0];
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("called getResPackage() on ");
    ((StringBuilder)localObject).append(this);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public final Uri g()
  {
    int m = a;
    if (m == -1) {
      return a.d(b);
    }
    if ((m != 4) && (m != 6))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("called getUri() on ");
      localStringBuilder.append(this);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    return Uri.parse((String)b);
  }
  
  public final String toString()
  {
    if (a == -1) {
      return String.valueOf(b);
    }
    StringBuilder localStringBuilder = new StringBuilder("Icon(typ=");
    String str;
    switch (a)
    {
    default: 
      str = "UNKNOWN";
      break;
    case 6: 
      str = "URI_MASKABLE";
      break;
    case 5: 
      str = "BITMAP_MASKABLE";
      break;
    case 4: 
      str = "URI";
      break;
    case 3: 
      str = "DATA";
      break;
    case 2: 
      str = "RESOURCE";
      break;
    case 1: 
      str = "BITMAP";
    }
    localStringBuilder.append(str);
    int m;
    switch (a)
    {
    default: 
      break;
    case 4: 
    case 6: 
      localStringBuilder.append(" uri=");
      localStringBuilder.append(b);
      break;
    case 3: 
      localStringBuilder.append(" len=");
      localStringBuilder.append(e);
      if (f == 0) {
        break label318;
      }
      localStringBuilder.append(" off=");
      m = f;
      break;
    case 2: 
      localStringBuilder.append(" pkg=");
      localStringBuilder.append(j);
      localStringBuilder.append(" id=");
      localStringBuilder.append(String.format("0x%08x", new Object[] { Integer.valueOf(e()) }));
      break;
    case 1: 
    case 5: 
      localStringBuilder.append(" size=");
      localStringBuilder.append(((Bitmap)b).getWidth());
      localStringBuilder.append("x");
      m = ((Bitmap)b).getHeight();
    }
    localStringBuilder.append(m);
    label318:
    if (g != null)
    {
      localStringBuilder.append(" tint=");
      localStringBuilder.append(g);
    }
    if (h != k)
    {
      localStringBuilder.append(" mode=");
      localStringBuilder.append(h);
    }
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
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
  
  public static final class b
  {
    public static Drawable a(Drawable paramDrawable1, Drawable paramDrawable2)
    {
      return new AdaptiveIconDrawable(paramDrawable1, paramDrawable2);
    }
    
    public static Icon b(Bitmap paramBitmap)
    {
      return c0.b.g(paramBitmap);
    }
  }
  
  public static final class c
  {
    public static int a(Object paramObject)
    {
      return a.b((Icon)paramObject);
    }
    
    public static String b(Object paramObject)
    {
      return a.k((Icon)paramObject);
    }
    
    public static int c(Object paramObject)
    {
      return android.support.v4.media.session.b.a((Icon)paramObject);
    }
    
    public static Uri d(Object paramObject)
    {
      return k.c((Icon)paramObject);
    }
  }
  
  public static final class d
  {
    public static Icon a(Uri paramUri)
    {
      return g0.c(paramUri);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.IconCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */