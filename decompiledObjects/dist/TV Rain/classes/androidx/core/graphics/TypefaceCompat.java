package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.provider.FontsContractCompat;
import androidx.core.provider.FontsContractCompat.FontInfo;
import androidx.core.provider.FontsContractCompat.FontRequestCallback;
import androidx.core.util.Preconditions;

public class TypefaceCompat
{
  private static final LruCache<String, Typeface> sTypefaceCache = new LruCache(16);
  private static final TypefaceCompatBaseImpl sTypefaceCompatImpl;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      sTypefaceCompatImpl = new TypefaceCompatApi29Impl();
    } else if (i >= 28) {
      sTypefaceCompatImpl = new TypefaceCompatApi28Impl();
    } else if (i >= 26) {
      sTypefaceCompatImpl = new TypefaceCompatApi26Impl();
    } else if (TypefaceCompatApi24Impl.isUsable()) {
      sTypefaceCompatImpl = new TypefaceCompatApi24Impl();
    } else {
      sTypefaceCompatImpl = new TypefaceCompatApi21Impl();
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  @VisibleForTesting
  public static void clearCache()
  {
    sTypefaceCache.evictAll();
  }
  
  @NonNull
  public static Typeface create(@NonNull Context paramContext, @Nullable Typeface paramTypeface, int paramInt)
  {
    if (paramContext != null) {
      return Typeface.create(paramTypeface, paramInt);
    }
    throw new IllegalArgumentException("Context cannot be null");
  }
  
  @NonNull
  public static Typeface create(@NonNull Context paramContext, @Nullable Typeface paramTypeface, @IntRange(from=1L, to=1000L) int paramInt, boolean paramBoolean)
  {
    if (paramContext != null)
    {
      Preconditions.checkArgumentInRange(paramInt, 1, 1000, "weight");
      Typeface localTypeface = paramTypeface;
      if (paramTypeface == null) {
        localTypeface = Typeface.DEFAULT;
      }
      return sTypefaceCompatImpl.createWeightStyle(paramContext, localTypeface, paramInt, paramBoolean);
    }
    throw new IllegalArgumentException("Context cannot be null");
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static Typeface createFromFontInfo(@NonNull Context paramContext, @Nullable CancellationSignal paramCancellationSignal, @NonNull FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    return sTypefaceCompatImpl.createFromFontInfo(paramContext, paramCancellationSignal, paramArrayOfFontInfo, paramInt);
  }
  
  @Deprecated
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static Typeface createFromResourcesFamilyXml(@NonNull Context paramContext, @NonNull FontResourcesParserCompat.FamilyResourceEntry paramFamilyResourceEntry, @NonNull Resources paramResources, int paramInt1, int paramInt2, @Nullable ResourcesCompat.FontCallback paramFontCallback, @Nullable Handler paramHandler, boolean paramBoolean)
  {
    return createFromResourcesFamilyXml(paramContext, paramFamilyResourceEntry, paramResources, paramInt1, null, 0, paramInt2, paramFontCallback, paramHandler, paramBoolean);
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static Typeface createFromResourcesFamilyXml(@NonNull Context paramContext, @NonNull FontResourcesParserCompat.FamilyResourceEntry paramFamilyResourceEntry, @NonNull Resources paramResources, int paramInt1, @Nullable String paramString, int paramInt2, int paramInt3, @Nullable ResourcesCompat.FontCallback paramFontCallback, @Nullable Handler paramHandler, boolean paramBoolean)
  {
    if ((paramFamilyResourceEntry instanceof FontResourcesParserCompat.ProviderResourceEntry))
    {
      paramFamilyResourceEntry = (FontResourcesParserCompat.ProviderResourceEntry)paramFamilyResourceEntry;
      Typeface localTypeface = getSystemFontFamily(paramFamilyResourceEntry.getSystemFontFamilyName());
      if (localTypeface != null)
      {
        if (paramFontCallback != null) {
          paramFontCallback.callbackSuccessAsync(localTypeface, paramHandler);
        }
        return localTypeface;
      }
      boolean bool;
      if (paramBoolean ? paramFamilyResourceEntry.getFetchStrategy() == 0 : paramFontCallback == null) {
        bool = true;
      } else {
        bool = false;
      }
      int i;
      if (paramBoolean) {
        i = paramFamilyResourceEntry.getTimeout();
      } else {
        i = -1;
      }
      paramHandler = ResourcesCompat.FontCallback.getHandler(paramHandler);
      paramFontCallback = new ResourcesCallbackAdapter(paramFontCallback);
      paramContext = FontsContractCompat.requestFont(paramContext, paramFamilyResourceEntry.getRequest(), paramInt3, bool, i, paramHandler, paramFontCallback);
    }
    else
    {
      paramFamilyResourceEntry = sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(paramContext, (FontResourcesParserCompat.FontFamilyFilesResourceEntry)paramFamilyResourceEntry, paramResources, paramInt3);
      paramContext = paramFamilyResourceEntry;
      if (paramFontCallback != null) {
        if (paramFamilyResourceEntry != null)
        {
          paramFontCallback.callbackSuccessAsync(paramFamilyResourceEntry, paramHandler);
          paramContext = paramFamilyResourceEntry;
        }
        else
        {
          paramFontCallback.callbackFailAsync(-3, paramHandler);
          paramContext = paramFamilyResourceEntry;
        }
      }
    }
    if (paramContext != null) {
      sTypefaceCache.put(createResourceUid(paramResources, paramInt1, paramString, paramInt2, paramInt3), paramContext);
    }
    return paramContext;
  }
  
  @Deprecated
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static Typeface createFromResourcesFontFile(@NonNull Context paramContext, @NonNull Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    return createFromResourcesFontFile(paramContext, paramResources, paramInt1, paramString, 0, paramInt2);
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static Typeface createFromResourcesFontFile(@NonNull Context paramContext, @NonNull Resources paramResources, int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    paramContext = sTypefaceCompatImpl.createFromResourcesFontFile(paramContext, paramResources, paramInt1, paramString, paramInt3);
    if (paramContext != null)
    {
      paramResources = createResourceUid(paramResources, paramInt1, paramString, paramInt2, paramInt3);
      sTypefaceCache.put(paramResources, paramContext);
    }
    return paramContext;
  }
  
  private static String createResourceUid(Resources paramResources, int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    paramResources = new StringBuilder(paramResources.getResourcePackageName(paramInt1));
    paramResources.append('-');
    paramResources.append(paramString);
    paramResources.append('-');
    paramResources.append(paramInt2);
    paramResources.append('-');
    paramResources.append(paramInt1);
    paramResources.append('-');
    paramResources.append(paramInt3);
    return paramResources.toString();
  }
  
  @Deprecated
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static Typeface findFromCache(@NonNull Resources paramResources, int paramInt1, int paramInt2)
  {
    return findFromCache(paramResources, paramInt1, null, 0, paramInt2);
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static Typeface findFromCache(@NonNull Resources paramResources, int paramInt1, @Nullable String paramString, int paramInt2, int paramInt3)
  {
    return (Typeface)sTypefaceCache.get(createResourceUid(paramResources, paramInt1, paramString, paramInt2, paramInt3));
  }
  
  @Nullable
  private static Typeface getBestFontFromFamily(Context paramContext, Typeface paramTypeface, int paramInt)
  {
    TypefaceCompatBaseImpl localTypefaceCompatBaseImpl = sTypefaceCompatImpl;
    paramTypeface = localTypefaceCompatBaseImpl.getFontFamily(paramTypeface);
    if (paramTypeface == null) {
      return null;
    }
    return localTypefaceCompatBaseImpl.createFromFontFamilyFilesResourceEntry(paramContext, paramTypeface, paramContext.getResources(), paramInt);
  }
  
  private static Typeface getSystemFontFamily(@Nullable String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramString != null) {
      if (paramString.isEmpty())
      {
        localObject2 = localObject1;
      }
      else
      {
        paramString = Typeface.create(paramString, 0);
        Typeface localTypeface = Typeface.create(Typeface.DEFAULT, 0);
        localObject2 = localObject1;
        if (paramString != null)
        {
          localObject2 = localObject1;
          if (!paramString.equals(localTypeface)) {
            localObject2 = paramString;
          }
        }
      }
    }
    return (Typeface)localObject2;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static class ResourcesCallbackAdapter
    extends FontsContractCompat.FontRequestCallback
  {
    @Nullable
    private ResourcesCompat.FontCallback mFontCallback;
    
    public ResourcesCallbackAdapter(@Nullable ResourcesCompat.FontCallback paramFontCallback)
    {
      mFontCallback = paramFontCallback;
    }
    
    public void onTypefaceRequestFailed(int paramInt)
    {
      ResourcesCompat.FontCallback localFontCallback = mFontCallback;
      if (localFontCallback != null) {
        localFontCallback.onFontRetrievalFailed(paramInt);
      }
    }
    
    public void onTypefaceRetrieved(@NonNull Typeface paramTypeface)
    {
      ResourcesCompat.FontCallback localFontCallback = mFontCallback;
      if (localFontCallback != null) {
        localFontCallback.onFontRetrieved(paramTypeface);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.TypefaceCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */