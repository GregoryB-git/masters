package z;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

public abstract class h
{
  public static final ThreadLocal a = new ThreadLocal();
  public static final WeakHashMap b = new WeakHashMap(0);
  public static final Object c = new Object();
  
  public static Drawable a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    return a.a(paramResources, paramInt, paramTheme);
  }
  
  public static Typeface b(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, b paramb)
  {
    if (paramContext.isRestricted()) {
      return null;
    }
    return c(paramContext, paramInt1, paramTypedValue, paramInt2, paramb, null, true, false);
  }
  
  public static Typeface c(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, b paramb, Handler paramHandler, boolean paramBoolean1, boolean paramBoolean2)
  {
    Resources localResources = paramContext.getResources();
    localResources.getValue(paramInt1, paramTypedValue, true);
    paramContext = d(paramContext, localResources, paramTypedValue, paramInt1, paramInt2, paramb, paramHandler, paramBoolean1, paramBoolean2);
    if ((paramContext == null) && (paramb == null) && (!paramBoolean2))
    {
      paramContext = new StringBuilder();
      paramContext.append("Font resource ID #0x");
      paramContext.append(Integer.toHexString(paramInt1));
      paramContext.append(" could not be retrieved.");
      throw new Resources.NotFoundException(paramContext.toString());
    }
    return paramContext;
  }
  
  public static Typeface d(Context paramContext, Resources paramResources, TypedValue paramTypedValue, int paramInt1, int paramInt2, b paramb, Handler paramHandler, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = string;
    if (localObject1 != null)
    {
      localObject1 = ((CharSequence)localObject1).toString();
      if (!((String)localObject1).startsWith("res/"))
      {
        if (paramb != null) {
          paramb.c(-3, paramHandler);
        }
        return null;
      }
      Object localObject2 = A.h.f(paramResources, paramInt1, (String)localObject1, assetCookie, paramInt2);
      if (localObject2 != null)
      {
        if (paramb != null) {
          paramb.d((Typeface)localObject2, paramHandler);
        }
        return (Typeface)localObject2;
      }
      if (paramBoolean2) {
        return null;
      }
      try
      {
        if (!((String)localObject1).toLowerCase().endsWith(".xml")) {
          break label189;
        }
        localObject2 = e.b(paramResources.getXml(paramInt1), paramResources);
        if (localObject2 != null) {
          break label154;
        }
        Log.e("ResourcesCompat", "Failed to find font-family tag");
        if (paramb != null) {
          paramb.c(-3, paramHandler);
        }
      }
      catch (IOException paramContext)
      {
        break label235;
      }
      catch (XmlPullParserException paramContext)
      {
        break label273;
      }
      return null;
      label154:
      int i = assetCookie;
      try
      {
        return A.h.c(paramContext, (e.b)localObject2, paramResources, paramInt1, (String)localObject1, i, paramInt2, paramb, paramHandler, paramBoolean1);
      }
      catch (IOException paramContext)
      {
        break label235;
      }
      catch (XmlPullParserException paramContext) {}
      label189:
      paramContext = A.h.d(paramContext, paramResources, paramInt1, (String)localObject1, assetCookie, paramInt2);
      if (paramb != null) {
        if (paramContext != null) {
          paramb.d(paramContext, paramHandler);
        } else {
          paramb.c(-3, paramHandler);
        }
      }
      return paramContext;
      label235:
      paramTypedValue = new StringBuilder();
      for (paramResources = "Failed to read xml resource ";; paramResources = "Failed to parse xml resource ")
      {
        paramTypedValue.append(paramResources);
        paramTypedValue.append((String)localObject1);
        Log.e("ResourcesCompat", paramTypedValue.toString(), paramContext);
        break;
        label273:
        paramTypedValue = new StringBuilder();
      }
      if (paramb != null) {
        paramb.c(-3, paramHandler);
      }
      return null;
    }
    paramContext = new StringBuilder();
    paramContext.append("Resource \"");
    paramContext.append(paramResources.getResourceName(paramInt1));
    paramContext.append("\" (");
    paramContext.append(Integer.toHexString(paramInt1));
    paramContext.append(") is not a Font: ");
    paramContext.append(paramTypedValue);
    throw new Resources.NotFoundException(paramContext.toString());
  }
  
  public static abstract class a
  {
    public static Drawable a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
    {
      return paramResources.getDrawable(paramInt, paramTheme);
    }
    
    public static Drawable b(Resources paramResources, int paramInt1, int paramInt2, Resources.Theme paramTheme)
    {
      return paramResources.getDrawableForDensity(paramInt1, paramInt2, paramTheme);
    }
  }
  
  public static abstract class b
  {
    public static Handler e(Handler paramHandler)
    {
      Handler localHandler = paramHandler;
      if (paramHandler == null) {
        localHandler = new Handler(Looper.getMainLooper());
      }
      return localHandler;
    }
    
    public final void c(int paramInt, Handler paramHandler)
    {
      e(paramHandler).post(new j(this, paramInt));
    }
    
    public final void d(Typeface paramTypeface, Handler paramHandler)
    {
      e(paramHandler).post(new i(this, paramTypeface));
    }
    
    public abstract void h(int paramInt);
    
    public abstract void i(Typeface paramTypeface);
  }
}

/* Location:
 * Qualified Name:     z.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */