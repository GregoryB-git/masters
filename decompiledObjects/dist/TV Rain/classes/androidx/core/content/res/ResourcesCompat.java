package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import c4;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import o3;
import org.xmlpull.v1.XmlPullParserException;
import q5;
import z2;

public final class ResourcesCompat
{
  @AnyRes
  public static final int ID_NULL = 0;
  private static final String TAG = "ResourcesCompat";
  private static final Object sColorStateCacheLock = new Object();
  @GuardedBy("sColorStateCacheLock")
  private static final WeakHashMap<ColorStateListCacheKey, SparseArray<ColorStateListCacheEntry>> sColorStateCaches;
  private static final ThreadLocal<TypedValue> sTempTypedValue = new ThreadLocal();
  
  static
  {
    sColorStateCaches = new WeakHashMap(0);
  }
  
  private static void addColorStateListToCache(@NonNull ColorStateListCacheKey paramColorStateListCacheKey, @ColorRes int paramInt, @NonNull ColorStateList paramColorStateList, @Nullable Resources.Theme paramTheme)
  {
    synchronized (sColorStateCacheLock)
    {
      WeakHashMap localWeakHashMap = sColorStateCaches;
      Object localObject2 = (SparseArray)localWeakHashMap.get(paramColorStateListCacheKey);
      Object localObject3 = localObject2;
      if (localObject2 == null)
      {
        localObject3 = new android/util/SparseArray;
        ((SparseArray)localObject3).<init>();
        localWeakHashMap.put(paramColorStateListCacheKey, localObject3);
      }
      localObject2 = new androidx/core/content/res/ResourcesCompat$ColorStateListCacheEntry;
      ((ColorStateListCacheEntry)localObject2).<init>(paramColorStateList, mResources.getConfiguration(), paramTheme);
      ((SparseArray)localObject3).append(paramInt, localObject2);
      return;
    }
  }
  
  public static void clearCachesForTheme(@NonNull Resources.Theme paramTheme)
  {
    synchronized (sColorStateCacheLock)
    {
      Iterator localIterator = sColorStateCaches.keySet().iterator();
      while (localIterator.hasNext())
      {
        ColorStateListCacheKey localColorStateListCacheKey = (ColorStateListCacheKey)localIterator.next();
        if ((localColorStateListCacheKey != null) && (paramTheme.equals(mTheme))) {
          localIterator.remove();
        }
      }
      return;
    }
  }
  
  @Nullable
  private static ColorStateList getCachedColorStateList(@NonNull ColorStateListCacheKey paramColorStateListCacheKey, @ColorRes int paramInt)
  {
    synchronized (sColorStateCacheLock)
    {
      SparseArray localSparseArray = (SparseArray)sColorStateCaches.get(paramColorStateListCacheKey);
      if ((localSparseArray != null) && (localSparseArray.size() > 0))
      {
        ColorStateListCacheEntry localColorStateListCacheEntry = (ColorStateListCacheEntry)localSparseArray.get(paramInt);
        if (localColorStateListCacheEntry != null)
        {
          if (mConfiguration.equals(mResources.getConfiguration()))
          {
            paramColorStateListCacheKey = mTheme;
            if (((paramColorStateListCacheKey == null) && (mThemeHash == 0)) || ((paramColorStateListCacheKey != null) && (mThemeHash == paramColorStateListCacheKey.hashCode())))
            {
              paramColorStateListCacheKey = mValue;
              return paramColorStateListCacheKey;
            }
          }
          localSparseArray.remove(paramInt);
        }
      }
      return null;
    }
  }
  
  @Nullable
  public static Typeface getCachedFont(@NonNull Context paramContext, @FontRes int paramInt)
    throws Resources.NotFoundException
  {
    if (paramContext.isRestricted()) {
      return null;
    }
    return loadFont(paramContext, paramInt, new TypedValue(), 0, null, null, false, true);
  }
  
  @ColorInt
  public static int getColor(@NonNull Resources paramResources, @ColorRes int paramInt, @Nullable Resources.Theme paramTheme)
    throws Resources.NotFoundException
  {
    return Api23Impl.getColor(paramResources, paramInt, paramTheme);
  }
  
  @Nullable
  public static ColorStateList getColorStateList(@NonNull Resources paramResources, @ColorRes int paramInt, @Nullable Resources.Theme paramTheme)
    throws Resources.NotFoundException
  {
    ColorStateListCacheKey localColorStateListCacheKey = new ColorStateListCacheKey(paramResources, paramTheme);
    ColorStateList localColorStateList = getCachedColorStateList(localColorStateListCacheKey, paramInt);
    if (localColorStateList != null) {
      return localColorStateList;
    }
    localColorStateList = inflateColorStateList(paramResources, paramInt, paramTheme);
    if (localColorStateList != null)
    {
      addColorStateListToCache(localColorStateListCacheKey, paramInt, localColorStateList, paramTheme);
      return localColorStateList;
    }
    return Api23Impl.getColorStateList(paramResources, paramInt, paramTheme);
  }
  
  @Nullable
  public static Drawable getDrawable(@NonNull Resources paramResources, @DrawableRes int paramInt, @Nullable Resources.Theme paramTheme)
    throws Resources.NotFoundException
  {
    return Api21Impl.getDrawable(paramResources, paramInt, paramTheme);
  }
  
  @Nullable
  public static Drawable getDrawableForDensity(@NonNull Resources paramResources, @DrawableRes int paramInt1, int paramInt2, @Nullable Resources.Theme paramTheme)
    throws Resources.NotFoundException
  {
    return Api21Impl.getDrawableForDensity(paramResources, paramInt1, paramInt2, paramTheme);
  }
  
  public static float getFloat(@NonNull Resources paramResources, @DimenRes int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return Api29Impl.getFloat(paramResources, paramInt);
    }
    TypedValue localTypedValue = getTypedValue();
    paramResources.getValue(paramInt, localTypedValue, true);
    if (type == 4) {
      return localTypedValue.getFloat();
    }
    paramResources = z2.t("Resource ID #0x");
    paramResources.append(Integer.toHexString(paramInt));
    paramResources.append(" type #0x");
    paramResources.append(Integer.toHexString(type));
    paramResources.append(" is not valid");
    throw new Resources.NotFoundException(paramResources.toString());
  }
  
  @Nullable
  public static Typeface getFont(@NonNull Context paramContext, @FontRes int paramInt)
    throws Resources.NotFoundException
  {
    if (paramContext.isRestricted()) {
      return null;
    }
    return loadFont(paramContext, paramInt, new TypedValue(), 0, null, null, false, false);
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static Typeface getFont(@NonNull Context paramContext, @FontRes int paramInt1, @NonNull TypedValue paramTypedValue, int paramInt2, @Nullable FontCallback paramFontCallback)
    throws Resources.NotFoundException
  {
    if (paramContext.isRestricted()) {
      return null;
    }
    return loadFont(paramContext, paramInt1, paramTypedValue, paramInt2, paramFontCallback, null, true, false);
  }
  
  public static void getFont(@NonNull Context paramContext, @FontRes int paramInt, @NonNull FontCallback paramFontCallback, @Nullable Handler paramHandler)
    throws Resources.NotFoundException
  {
    Preconditions.checkNotNull(paramFontCallback);
    if (paramContext.isRestricted())
    {
      paramFontCallback.callbackFailAsync(-4, paramHandler);
      return;
    }
    loadFont(paramContext, paramInt, new TypedValue(), 0, paramFontCallback, paramHandler, false, false);
  }
  
  @NonNull
  private static TypedValue getTypedValue()
  {
    ThreadLocal localThreadLocal = sTempTypedValue;
    TypedValue localTypedValue1 = (TypedValue)localThreadLocal.get();
    TypedValue localTypedValue2 = localTypedValue1;
    if (localTypedValue1 == null)
    {
      localTypedValue2 = new TypedValue();
      localThreadLocal.set(localTypedValue2);
    }
    return localTypedValue2;
  }
  
  @Nullable
  private static ColorStateList inflateColorStateList(Resources paramResources, int paramInt, @Nullable Resources.Theme paramTheme)
  {
    if (isColorInt(paramResources, paramInt)) {
      return null;
    }
    XmlResourceParser localXmlResourceParser = paramResources.getXml(paramInt);
    try
    {
      paramResources = ColorStateListInflaterCompat.createFromXml(paramResources, localXmlResourceParser, paramTheme);
      return paramResources;
    }
    catch (Exception paramResources)
    {
      Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", paramResources);
    }
    return null;
  }
  
  private static boolean isColorInt(@NonNull Resources paramResources, @ColorRes int paramInt)
  {
    TypedValue localTypedValue = getTypedValue();
    boolean bool = true;
    paramResources.getValue(paramInt, localTypedValue, true);
    paramInt = type;
    if ((paramInt < 28) || (paramInt > 31)) {
      bool = false;
    }
    return bool;
  }
  
  private static Typeface loadFont(@NonNull Context paramContext, int paramInt1, @NonNull TypedValue paramTypedValue, int paramInt2, @Nullable FontCallback paramFontCallback, @Nullable Handler paramHandler, boolean paramBoolean1, boolean paramBoolean2)
  {
    Resources localResources = paramContext.getResources();
    localResources.getValue(paramInt1, paramTypedValue, true);
    paramContext = loadFont(paramContext, localResources, paramTypedValue, paramInt1, paramInt2, paramFontCallback, paramHandler, paramBoolean1, paramBoolean2);
    if ((paramContext == null) && (paramFontCallback == null) && (!paramBoolean2))
    {
      paramContext = z2.t("Font resource ID #0x");
      paramContext.append(Integer.toHexString(paramInt1));
      paramContext.append(" could not be retrieved.");
      throw new Resources.NotFoundException(paramContext.toString());
    }
    return paramContext;
  }
  
  private static Typeface loadFont(@NonNull Context paramContext, Resources paramResources, @NonNull TypedValue paramTypedValue, int paramInt1, int paramInt2, @Nullable FontCallback paramFontCallback, @Nullable Handler paramHandler, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = string;
    if (localObject1 != null)
    {
      localObject1 = ((CharSequence)localObject1).toString();
      if (!((String)localObject1).startsWith("res/"))
      {
        if (paramFontCallback != null) {
          paramFontCallback.callbackFailAsync(-3, paramHandler);
        }
        return null;
      }
      Object localObject2 = TypefaceCompat.findFromCache(paramResources, paramInt1, (String)localObject1, assetCookie, paramInt2);
      if (localObject2 != null)
      {
        if (paramFontCallback != null) {
          paramFontCallback.callbackSuccessAsync((Typeface)localObject2, paramHandler);
        }
        return (Typeface)localObject2;
      }
      if (paramBoolean2) {
        return null;
      }
      try
      {
        if (((String)localObject1).toLowerCase().endsWith(".xml"))
        {
          localObject2 = FontResourcesParserCompat.parse(paramResources.getXml(paramInt1), paramResources);
          if (localObject2 == null)
          {
            Log.e("ResourcesCompat", "Failed to find font-family tag");
            if (paramFontCallback != null) {
              paramFontCallback.callbackFailAsync(-3, paramHandler);
            }
            return null;
          }
          return TypefaceCompat.createFromResourcesFamilyXml(paramContext, (FontResourcesParserCompat.FamilyResourceEntry)localObject2, paramResources, paramInt1, (String)localObject1, assetCookie, paramInt2, paramFontCallback, paramHandler, paramBoolean1);
        }
        paramContext = TypefaceCompat.createFromResourcesFontFile(paramContext, paramResources, paramInt1, (String)localObject1, assetCookie, paramInt2);
        if (paramFontCallback != null) {
          if (paramContext != null) {
            paramFontCallback.callbackSuccessAsync(paramContext, paramHandler);
          } else {
            paramFontCallback.callbackFailAsync(-3, paramHandler);
          }
        }
        return paramContext;
      }
      catch (IOException paramResources)
      {
        paramContext = new StringBuilder();
        paramContext.append("Failed to read xml resource ");
        paramContext.append((String)localObject1);
        Log.e("ResourcesCompat", paramContext.toString(), paramResources);
      }
      catch (XmlPullParserException paramResources)
      {
        paramContext = new StringBuilder();
        paramContext.append("Failed to parse xml resource ");
        paramContext.append((String)localObject1);
        Log.e("ResourcesCompat", paramContext.toString(), paramResources);
      }
      if (paramFontCallback != null) {
        paramFontCallback.callbackFailAsync(-3, paramHandler);
      }
      return null;
    }
    paramContext = z2.t("Resource \"");
    paramContext.append(paramResources.getResourceName(paramInt1));
    paramContext.append("\" (");
    paramContext.append(Integer.toHexString(paramInt1));
    paramContext.append(") is not a Font: ");
    paramContext.append(paramTypedValue);
    throw new Resources.NotFoundException(paramContext.toString());
  }
  
  @RequiresApi(15)
  public static class Api15Impl
  {
    @DoNotInline
    public static Drawable getDrawableForDensity(Resources paramResources, int paramInt1, int paramInt2)
    {
      return paramResources.getDrawableForDensity(paramInt1, paramInt2);
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static Drawable getDrawable(Resources paramResources, int paramInt, Resources.Theme paramTheme)
    {
      return paramResources.getDrawable(paramInt, paramTheme);
    }
    
    @DoNotInline
    public static Drawable getDrawableForDensity(Resources paramResources, int paramInt1, int paramInt2, Resources.Theme paramTheme)
    {
      return paramResources.getDrawableForDensity(paramInt1, paramInt2, paramTheme);
    }
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    @DoNotInline
    public static int getColor(Resources paramResources, int paramInt, Resources.Theme paramTheme)
    {
      return paramResources.getColor(paramInt, paramTheme);
    }
    
    @DoNotInline
    @NonNull
    public static ColorStateList getColorStateList(@NonNull Resources paramResources, @ColorRes int paramInt, @Nullable Resources.Theme paramTheme)
    {
      return paramResources.getColorStateList(paramInt, paramTheme);
    }
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static float getFloat(@NonNull Resources paramResources, @DimenRes int paramInt)
    {
      return o3.a(paramResources, paramInt);
    }
  }
  
  public static class ColorStateListCacheEntry
  {
    public final Configuration mConfiguration;
    public final int mThemeHash;
    public final ColorStateList mValue;
    
    public ColorStateListCacheEntry(@NonNull ColorStateList paramColorStateList, @NonNull Configuration paramConfiguration, @Nullable Resources.Theme paramTheme)
    {
      mValue = paramColorStateList;
      mConfiguration = paramConfiguration;
      int i;
      if (paramTheme == null) {
        i = 0;
      } else {
        i = paramTheme.hashCode();
      }
      mThemeHash = i;
    }
  }
  
  public static final class ColorStateListCacheKey
  {
    public final Resources mResources;
    public final Resources.Theme mTheme;
    
    public ColorStateListCacheKey(@NonNull Resources paramResources, @Nullable Resources.Theme paramTheme)
    {
      mResources = paramResources;
      mTheme = paramTheme;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (ColorStateListCacheKey.class == paramObject.getClass()))
      {
        paramObject = (ColorStateListCacheKey)paramObject;
        if ((!mResources.equals(mResources)) || (!ObjectsCompat.equals(mTheme, mTheme))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      return ObjectsCompat.hash(new Object[] { mResources, mTheme });
    }
  }
  
  public static abstract class FontCallback
  {
    @NonNull
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static Handler getHandler(@Nullable Handler paramHandler)
    {
      Handler localHandler = paramHandler;
      if (paramHandler == null) {
        localHandler = new Handler(Looper.getMainLooper());
      }
      return localHandler;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void callbackFailAsync(int paramInt, @Nullable Handler paramHandler)
    {
      getHandler(paramHandler).post(new c4(this, paramInt, 0));
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void callbackSuccessAsync(@NonNull Typeface paramTypeface, @Nullable Handler paramHandler)
    {
      getHandler(paramHandler).post(new q5(this, paramTypeface, 1));
    }
    
    public abstract void onFontRetrievalFailed(int paramInt);
    
    public abstract void onFontRetrieved(@NonNull Typeface paramTypeface);
  }
  
  public static final class ThemeCompat
  {
    public static void rebase(@NonNull Resources.Theme paramTheme)
    {
      if (Build.VERSION.SDK_INT >= 29) {
        Api29Impl.rebase(paramTheme);
      } else {
        Api23Impl.rebase(paramTheme);
      }
    }
    
    @RequiresApi(23)
    public static class Api23Impl
    {
      private static Method sRebaseMethod;
      private static boolean sRebaseMethodFetched;
      private static final Object sRebaseMethodLock = new Object();
      
      @SuppressLint({"BanUncheckedReflection"})
      public static void rebase(@NonNull Resources.Theme paramTheme)
      {
        synchronized (sRebaseMethodLock)
        {
          boolean bool = sRebaseMethodFetched;
          if (!bool)
          {
            try
            {
              Method localMethod1 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
              sRebaseMethod = localMethod1;
              localMethod1.setAccessible(true);
            }
            catch (NoSuchMethodException localNoSuchMethodException)
            {
              Log.i("ResourcesCompat", "Failed to retrieve rebase() method", localNoSuchMethodException);
            }
            sRebaseMethodFetched = true;
          }
          Method localMethod2 = sRebaseMethod;
          if (localMethod2 != null)
          {
            try
            {
              localMethod2.invoke(paramTheme, new Object[0]);
            }
            catch (InvocationTargetException paramTheme) {}catch (IllegalAccessException paramTheme) {}
            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", paramTheme);
            sRebaseMethod = null;
          }
          return;
        }
      }
    }
    
    @RequiresApi(29)
    public static class Api29Impl
    {
      @DoNotInline
      public static void rebase(@NonNull Resources.Theme paramTheme)
      {
        o3.u(paramTheme);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.ResourcesCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */