package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

class FontRequestWorker
{
  private static final ExecutorService DEFAULT_EXECUTOR_SERVICE = RequestExecutor.createDefaultExecutor("fonts-androidx", 10, 10000);
  public static final Object LOCK = new Object();
  @GuardedBy("LOCK")
  public static final SimpleArrayMap<String, ArrayList<Consumer<TypefaceResult>>> PENDING_REPLIES = new SimpleArrayMap();
  public static final LruCache<String, Typeface> sTypefaceCache = new LruCache(16);
  
  private static String createCacheId(@NonNull FontRequest paramFontRequest, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramFontRequest.getId());
    localStringBuilder.append("-");
    localStringBuilder.append(paramInt);
    return localStringBuilder.toString();
  }
  
  @SuppressLint({"WrongConstant"})
  private static int getFontFamilyResultStatus(@NonNull FontsContractCompat.FontFamilyResult paramFontFamilyResult)
  {
    int i = paramFontFamilyResult.getStatusCode();
    int j = -3;
    int k = 1;
    if (i != 0)
    {
      if (paramFontFamilyResult.getStatusCode() != 1) {
        return -3;
      }
      return -2;
    }
    paramFontFamilyResult = paramFontFamilyResult.getFonts();
    i = k;
    if (paramFontFamilyResult != null) {
      if (paramFontFamilyResult.length == 0)
      {
        i = k;
      }
      else
      {
        int m = paramFontFamilyResult.length;
        int n = 0;
        for (k = 0;; k++)
        {
          i = n;
          if (k >= m) {
            break;
          }
          i = paramFontFamilyResult[k].getResultCode();
          if (i != 0)
          {
            if (i < 0) {
              i = j;
            }
            return i;
          }
        }
      }
    }
    return i;
  }
  
  @NonNull
  public static TypefaceResult getFontSync(@NonNull String paramString, @NonNull Context paramContext, @NonNull FontRequest paramFontRequest, int paramInt)
  {
    LruCache localLruCache = sTypefaceCache;
    Typeface localTypeface = (Typeface)localLruCache.get(paramString);
    if (localTypeface != null) {
      return new TypefaceResult(localTypeface);
    }
    try
    {
      paramFontRequest = FontProvider.getFontFamilyResult(paramContext, paramFontRequest, null);
      int i = getFontFamilyResultStatus(paramFontRequest);
      if (i != 0) {
        return new TypefaceResult(i);
      }
      paramContext = TypefaceCompat.createFromFontInfo(paramContext, null, paramFontRequest.getFonts(), paramInt);
      if (paramContext != null)
      {
        localLruCache.put(paramString, paramContext);
        return new TypefaceResult(paramContext);
      }
      return new TypefaceResult(-3);
    }
    catch (PackageManager.NameNotFoundException paramString) {}
    return new TypefaceResult(-1);
  }
  
  public static Typeface requestFontAsync(@NonNull final Context paramContext, @NonNull final FontRequest paramFontRequest, final int paramInt, @Nullable Executor paramExecutor, @NonNull CallbackWithHandler arg4)
  {
    String str = createCacheId(paramFontRequest, paramInt);
    Object localObject = (Typeface)sTypefaceCache.get(str);
    if (localObject != null)
    {
      ???.onTypefaceResult(new TypefaceResult((Typeface)localObject));
      return (Typeface)localObject;
    }
    Consumer local2 = new Consumer()
    {
      public void accept(FontRequestWorker.TypefaceResult paramAnonymousTypefaceResult)
      {
        FontRequestWorker.TypefaceResult localTypefaceResult = paramAnonymousTypefaceResult;
        if (paramAnonymousTypefaceResult == null) {
          localTypefaceResult = new FontRequestWorker.TypefaceResult(-3);
        }
        onTypefaceResult(localTypefaceResult);
      }
    };
    synchronized (LOCK)
    {
      localObject = PENDING_REPLIES;
      ArrayList localArrayList = (ArrayList)((SimpleArrayMap)localObject).get(str);
      if (localArrayList != null)
      {
        localArrayList.add(local2);
        return null;
      }
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localArrayList.add(local2);
      ((SimpleArrayMap)localObject).put(str, localArrayList);
      paramFontRequest = new Callable()
      {
        public FontRequestWorker.TypefaceResult call()
        {
          try
          {
            FontRequestWorker.TypefaceResult localTypefaceResult = FontRequestWorker.getFontSync(FontRequestWorker.this, paramContext, paramFontRequest, paramInt);
            return localTypefaceResult;
          }
          finally {}
          return new FontRequestWorker.TypefaceResult(-3);
        }
      };
      paramContext = paramExecutor;
      if (paramExecutor == null) {
        paramContext = DEFAULT_EXECUTOR_SERVICE;
      }
      RequestExecutor.execute(paramContext, paramFontRequest, new Consumer()
      {
        public void accept(FontRequestWorker.TypefaceResult paramAnonymousTypefaceResult)
        {
          synchronized (FontRequestWorker.LOCK)
          {
            SimpleArrayMap localSimpleArrayMap = FontRequestWorker.PENDING_REPLIES;
            ArrayList localArrayList = (ArrayList)localSimpleArrayMap.get(FontRequestWorker.this);
            if (localArrayList == null) {
              return;
            }
            localSimpleArrayMap.remove(FontRequestWorker.this);
            for (int i = 0; i < localArrayList.size(); i++) {
              ((Consumer)localArrayList.get(i)).accept(paramAnonymousTypefaceResult);
            }
            return;
          }
        }
      });
      return null;
    }
  }
  
  public static Typeface requestFontSync(@NonNull final Context paramContext, @NonNull final FontRequest paramFontRequest, @NonNull CallbackWithHandler paramCallbackWithHandler, final int paramInt1, int paramInt2)
  {
    String str = createCacheId(paramFontRequest, paramInt1);
    Typeface localTypeface = (Typeface)sTypefaceCache.get(str);
    if (localTypeface != null)
    {
      paramCallbackWithHandler.onTypefaceResult(new TypefaceResult(localTypeface));
      return localTypeface;
    }
    if (paramInt2 == -1)
    {
      paramContext = getFontSync(str, paramContext, paramFontRequest, paramInt1);
      paramCallbackWithHandler.onTypefaceResult(paramContext);
      return mTypeface;
    }
    paramContext = new Callable()
    {
      public FontRequestWorker.TypefaceResult call()
      {
        return FontRequestWorker.getFontSync(FontRequestWorker.this, paramContext, paramFontRequest, paramInt1);
      }
    };
    try
    {
      paramContext = (TypefaceResult)RequestExecutor.submit(DEFAULT_EXECUTOR_SERVICE, paramContext, paramInt2);
      paramCallbackWithHandler.onTypefaceResult(paramContext);
      paramContext = mTypeface;
      return paramContext;
    }
    catch (InterruptedException paramContext)
    {
      paramCallbackWithHandler.onTypefaceResult(new TypefaceResult(-3));
    }
    return null;
  }
  
  public static void resetTypefaceCache()
  {
    sTypefaceCache.evictAll();
  }
  
  public static final class TypefaceResult
  {
    public final int mResult;
    public final Typeface mTypeface;
    
    public TypefaceResult(int paramInt)
    {
      mTypeface = null;
      mResult = paramInt;
    }
    
    @SuppressLint({"WrongConstant"})
    public TypefaceResult(@NonNull Typeface paramTypeface)
    {
      mTypeface = paramTypeface;
      mResult = 0;
    }
    
    @SuppressLint({"WrongConstant"})
    public boolean isSuccess()
    {
      boolean bool;
      if (mResult == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.FontRequestWorker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */