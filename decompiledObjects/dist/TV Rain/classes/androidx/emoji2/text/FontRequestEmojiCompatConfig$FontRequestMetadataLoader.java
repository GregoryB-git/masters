package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat.FontFamilyResult;
import androidx.core.provider.FontsContractCompat.FontInfo;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import z2;

class FontRequestEmojiCompatConfig$FontRequestMetadataLoader
  implements EmojiCompat.MetadataRepoLoader
{
  private static final String S_TRACE_BUILD_TYPEFACE = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
  @GuardedBy("mLock")
  @Nullable
  public EmojiCompat.MetadataRepoLoaderCallback mCallback;
  @NonNull
  private final Context mContext;
  @GuardedBy("mLock")
  @Nullable
  private Executor mExecutor;
  @NonNull
  private final FontRequestEmojiCompatConfig.FontProviderHelper mFontProviderHelper;
  @NonNull
  private final Object mLock = new Object();
  @GuardedBy("mLock")
  @Nullable
  private Handler mMainHandler;
  @GuardedBy("mLock")
  @Nullable
  private Runnable mMainHandlerLoadCallback;
  @GuardedBy("mLock")
  @Nullable
  private ThreadPoolExecutor mMyThreadPoolExecutor;
  @GuardedBy("mLock")
  @Nullable
  private ContentObserver mObserver;
  @NonNull
  private final FontRequest mRequest;
  @GuardedBy("mLock")
  @Nullable
  private FontRequestEmojiCompatConfig.RetryPolicy mRetryPolicy;
  
  public FontRequestEmojiCompatConfig$FontRequestMetadataLoader(@NonNull Context paramContext, @NonNull FontRequest paramFontRequest, @NonNull FontRequestEmojiCompatConfig.FontProviderHelper paramFontProviderHelper)
  {
    Preconditions.checkNotNull(paramContext, "Context cannot be null");
    Preconditions.checkNotNull(paramFontRequest, "FontRequest cannot be null");
    mContext = paramContext.getApplicationContext();
    mRequest = paramFontRequest;
    mFontProviderHelper = paramFontProviderHelper;
  }
  
  private void cleanUp()
  {
    synchronized (mLock)
    {
      mCallback = null;
      Object localObject2 = mObserver;
      if (localObject2 != null)
      {
        mFontProviderHelper.unregisterObserver(mContext, (ContentObserver)localObject2);
        mObserver = null;
      }
      localObject2 = mMainHandler;
      if (localObject2 != null) {
        ((Handler)localObject2).removeCallbacks(mMainHandlerLoadCallback);
      }
      mMainHandler = null;
      localObject2 = mMyThreadPoolExecutor;
      if (localObject2 != null) {
        ((ThreadPoolExecutor)localObject2).shutdown();
      }
      mExecutor = null;
      mMyThreadPoolExecutor = null;
      return;
    }
  }
  
  @WorkerThread
  private FontsContractCompat.FontInfo retrieveFontInfo()
  {
    try
    {
      FontsContractCompat.FontFamilyResult localFontFamilyResult = mFontProviderHelper.fetchFonts(mContext, mRequest);
      if (localFontFamilyResult.getStatusCode() == 0)
      {
        localObject = localFontFamilyResult.getFonts();
        if ((localObject != null) && (localObject.length != 0)) {
          return localObject[0];
        }
        throw new RuntimeException("fetchFonts failed (empty result)");
      }
      Object localObject = z2.t("fetchFonts failed (");
      ((StringBuilder)localObject).append(localFontFamilyResult.getStatusCode());
      ((StringBuilder)localObject).append(")");
      throw new RuntimeException(((StringBuilder)localObject).toString());
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new RuntimeException("provider not found", localNameNotFoundException);
    }
  }
  
  @RequiresApi(19)
  @WorkerThread
  private void scheduleRetry(Uri paramUri, long paramLong)
  {
    synchronized (mLock)
    {
      Object localObject2 = mMainHandler;
      Object localObject3 = localObject2;
      if (localObject2 == null)
      {
        localObject3 = ConcurrencyHelpers.mainHandlerAsync();
        mMainHandler = ((Handler)localObject3);
      }
      if (mObserver == null)
      {
        localObject2 = new androidx/emoji2/text/FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1;
        ((1)localObject2).<init>(this, (Handler)localObject3);
        mObserver = ((ContentObserver)localObject2);
        mFontProviderHelper.registerObserver(mContext, paramUri, (ContentObserver)localObject2);
      }
      if (mMainHandlerLoadCallback == null)
      {
        paramUri = new androidx/emoji2/text/c;
        paramUri.<init>(this, 1);
        mMainHandlerLoadCallback = paramUri;
      }
      ((Handler)localObject3).postDelayed(mMainHandlerLoadCallback, paramLong);
      return;
    }
  }
  
  @RequiresApi(19)
  @WorkerThread
  public void createMetadata()
  {
    synchronized (mLock)
    {
      if (mCallback == null) {
        return;
      }
      try
      {
        ??? = retrieveFontInfo();
        int i = ((FontsContractCompat.FontInfo)???).getResultCode();
        Object localObject10;
        if (i == 2) {
          synchronized (mLock)
          {
            localObject10 = mRetryPolicy;
            if (localObject10 != null)
            {
              long l = ((FontRequestEmojiCompatConfig.RetryPolicy)localObject10).getRetryDelay();
              if (l >= 0L)
              {
                scheduleRetry(((FontsContractCompat.FontInfo)???).getUri(), l);
                return;
              }
            }
          }
        }
        if (i == 0) {
          try
          {
            TraceCompat.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
            ??? = mFontProviderHelper.buildTypeface(mContext, localFontInfo);
            ??? = TypefaceCompatUtil.mmap(mContext, null, localFontInfo.getUri());
            if ((??? != null) && (??? != null))
            {
              ??? = MetadataRepo.create((Typeface)???, (ByteBuffer)???);
              TraceCompat.endSection();
              synchronized (mLock)
              {
                localObject10 = mCallback;
                if (localObject10 != null) {
                  ((EmojiCompat.MetadataRepoLoaderCallback)localObject10).onLoaded((MetadataRepo)???);
                }
                cleanUp();
              }
            }
            ??? = new java/lang/RuntimeException;
            ((RuntimeException)???).<init>("Unable to open file.");
            throw ((Throwable)???);
          }
          finally
          {
            TraceCompat.endSection();
          }
        }
        ??? = new java/lang/RuntimeException;
        localObject7 = new java/lang/StringBuilder;
        ((StringBuilder)localObject7).<init>();
        ((StringBuilder)localObject7).append("fetchFonts result is not OK. (");
        ((StringBuilder)localObject7).append(i);
        ((StringBuilder)localObject7).append(")");
        ((RuntimeException)???).<init>(((StringBuilder)localObject7).toString());
        throw ((Throwable)???);
      }
      finally
      {
        synchronized (mLock)
        {
          Object localObject7 = mCallback;
          if (localObject7 != null) {
            ((EmojiCompat.MetadataRepoLoaderCallback)localObject7).onFailed(localThrowable);
          }
          cleanUp();
          return;
        }
      }
    }
  }
  
  @RequiresApi(19)
  public void load(@NonNull EmojiCompat.MetadataRepoLoaderCallback paramMetadataRepoLoaderCallback)
  {
    Preconditions.checkNotNull(paramMetadataRepoLoaderCallback, "LoaderCallback cannot be null");
    synchronized (mLock)
    {
      mCallback = paramMetadataRepoLoaderCallback;
      loadInternal();
      return;
    }
  }
  
  @RequiresApi(19)
  public void loadInternal()
  {
    synchronized (mLock)
    {
      if (mCallback == null) {
        return;
      }
      if (mExecutor == null)
      {
        localObject2 = ConcurrencyHelpers.createBackgroundPriorityExecutor("emojiCompat");
        mMyThreadPoolExecutor = ((ThreadPoolExecutor)localObject2);
        mExecutor = ((Executor)localObject2);
      }
      Object localObject2 = mExecutor;
      c localc = new androidx/emoji2/text/c;
      localc.<init>(this, 0);
      ((Executor)localObject2).execute(localc);
      return;
    }
  }
  
  public void setExecutor(@NonNull Executor paramExecutor)
  {
    synchronized (mLock)
    {
      mExecutor = paramExecutor;
      return;
    }
  }
  
  public void setRetryPolicy(@Nullable FontRequestEmojiCompatConfig.RetryPolicy paramRetryPolicy)
  {
    synchronized (mLock)
    {
      mRetryPolicy = paramRetryPolicy;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */