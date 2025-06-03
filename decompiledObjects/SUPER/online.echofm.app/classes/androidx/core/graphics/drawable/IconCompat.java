package androidx.core.graphics.drawable;

import H.c;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
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
import androidx.annotation.NonNull;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

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
  
  public static IconCompat d(Bitmap paramBitmap)
  {
    c.c(paramBitmap);
    IconCompat localIconCompat = new IconCompat(1);
    b = paramBitmap;
    return localIconCompat;
  }
  
  public static IconCompat e(Resources paramResources, String paramString, int paramInt)
  {
    c.c(paramString);
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
  
  public static String p(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 6: 
      return "URI_MASKABLE";
    case 5: 
      return "BITMAP_MASKABLE";
    case 4: 
      return "URI";
    case 3: 
      return "DATA";
    case 2: 
      return "RESOURCE";
    }
    return "BITMAP";
  }
  
  public Bitmap f()
  {
    int m = a;
    if (m == -1)
    {
      localObject = b;
      if ((localObject instanceof Bitmap)) {
        return (Bitmap)localObject;
      }
      return null;
    }
    if (m == 1) {
      return (Bitmap)b;
    }
    if (m == 5) {
      return c((Bitmap)b, true);
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("called getBitmap() on ");
    ((StringBuilder)localObject).append(this);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public int g()
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
  
  public String h()
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
  
  public int i()
  {
    int m = a;
    int n = m;
    if (m == -1) {
      n = a.c(b);
    }
    return n;
  }
  
  public Uri j()
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
  
  public InputStream k(Context paramContext)
  {
    Uri localUri = j();
    Object localObject = localUri.getScheme();
    String str;
    if ((!"content".equals(localObject)) && (!"file".equals(localObject))) {
      try
      {
        paramContext = new java/io/File;
        paramContext.<init>((String)b);
        paramContext = new FileInputStream(paramContext);
        return paramContext;
      }
      catch (FileNotFoundException paramContext)
      {
        localObject = new StringBuilder();
        str = "Unable to load image from path: ";
      }
    }
    for (;;)
    {
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(localUri);
      Log.w("IconCompat", ((StringBuilder)localObject).toString(), paramContext);
      break;
      try
      {
        paramContext = paramContext.getContentResolver().openInputStream(localUri);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        localObject = new StringBuilder();
        str = "Unable to load image from URI: ";
      }
    }
    return null;
  }
  
  public void l()
  {
    h = PorterDuff.Mode.valueOf(i);
    Object localObject;
    switch (a)
    {
    case 0: 
    default: 
      break;
    case 3: 
      b = c;
      break;
    case 2: 
    case 4: 
    case 6: 
      localObject = new String(c, Charset.forName("UTF-16"));
      b = localObject;
      if ((a != 2) || (j != null)) {
        break label186;
      }
      j = localObject.split(":", -1)[0];
      break;
    case 1: 
    case 5: 
      localObject = d;
      if (localObject == null) {
        break;
      }
    }
    for (;;)
    {
      b = localObject;
      break;
      localObject = c;
      b = localObject;
      a = 3;
      e = 0;
      f = localObject.length;
      break;
      localObject = d;
      if (localObject == null) {
        break label187;
      }
    }
    label186:
    return;
    label187:
    throw new IllegalArgumentException("Invalid icon");
  }
  
  public void m(boolean paramBoolean)
  {
    i = h.name();
    switch (a)
    {
    case 0: 
    default: 
      break;
    case 4: 
    case 6: 
      c = b.toString().getBytes(Charset.forName("UTF-16"));
      break;
    case 3: 
      c = ((byte[])b);
      break;
    case 2: 
      c = ((String)b).getBytes(Charset.forName("UTF-16"));
      break;
    case 1: 
    case 5: 
      if (paramBoolean)
      {
        Bitmap localBitmap = (Bitmap)b;
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localBitmap.compress(Bitmap.CompressFormat.PNG, 90, localByteArrayOutputStream);
        c = localByteArrayOutputStream.toByteArray();
      }
      break;
    }
    for (;;)
    {
      d = ((Parcelable)b);
      break;
      if (paramBoolean) {
        break label187;
      }
    }
    return;
    label187:
    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
  }
  
  public Icon n()
  {
    return o(null);
  }
  
  public Icon o(Context paramContext)
  {
    return a.f(this, paramContext);
  }
  
  public String toString()
  {
    if (a == -1) {
      return String.valueOf(b);
    }
    StringBuilder localStringBuilder = new StringBuilder("Icon(typ=");
    localStringBuilder.append(p(a));
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
      if (f != 0) {
        localStringBuilder.append(" off=");
      }
      break;
    case 2: 
    case 1: 
    case 5: 
      for (int m = f;; m = ((Bitmap)b).getHeight())
      {
        localStringBuilder.append(m);
        break;
        localStringBuilder.append(" pkg=");
        localStringBuilder.append(j);
        localStringBuilder.append(" id=");
        localStringBuilder.append(String.format("0x%08x", new Object[] { Integer.valueOf(g()) }));
        break;
        localStringBuilder.append(" size=");
        localStringBuilder.append(((Bitmap)b).getWidth());
        localStringBuilder.append("x");
      }
    }
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
  
  public static abstract class a
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
  
  public static abstract class b
  {
    public static Drawable a(Drawable paramDrawable1, Drawable paramDrawable2)
    {
      return new AdaptiveIconDrawable(paramDrawable1, paramDrawable2);
    }
    
    public static Icon b(Bitmap paramBitmap)
    {
      return Icon.createWithAdaptiveBitmap(paramBitmap);
    }
  }
  
  public static abstract class c
  {
    public static int a(Object paramObject)
    {
      return ((Icon)paramObject).getResId();
    }
    
    public static String b(Object paramObject)
    {
      return ((Icon)paramObject).getResPackage();
    }
    
    public static int c(Object paramObject)
    {
      return ((Icon)paramObject).getType();
    }
    
    public static Uri d(Object paramObject)
    {
      return ((Icon)paramObject).getUri();
    }
  }
  
  public static abstract class d
  {
    public static Icon a(Uri paramUri)
    {
      return Icon.createWithAdaptiveBitmapContentUri(paramUri);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.IconCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */