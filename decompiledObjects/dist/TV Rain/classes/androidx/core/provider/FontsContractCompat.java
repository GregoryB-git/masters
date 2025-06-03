package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompat.ResourcesCallbackAdapter;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.util.Preconditions;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;

public class FontsContractCompat
{
  @Deprecated
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static final String PARCEL_FONT_RESULTS = "font_results";
  @Deprecated
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;
  @Deprecated
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static final int RESULT_CODE_WRONG_CERTIFICATES = -2;
  
  @Nullable
  public static Typeface buildTypeface(@NonNull Context paramContext, @Nullable CancellationSignal paramCancellationSignal, @NonNull FontInfo[] paramArrayOfFontInfo)
  {
    return TypefaceCompat.createFromFontInfo(paramContext, paramCancellationSignal, paramArrayOfFontInfo, 0);
  }
  
  @NonNull
  public static FontFamilyResult fetchFonts(@NonNull Context paramContext, @Nullable CancellationSignal paramCancellationSignal, @NonNull FontRequest paramFontRequest)
    throws PackageManager.NameNotFoundException
  {
    return FontProvider.getFontFamilyResult(paramContext, paramFontRequest, paramCancellationSignal);
  }
  
  @Deprecated
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static Typeface getFontSync(Context paramContext, FontRequest paramFontRequest, @Nullable ResourcesCompat.FontCallback paramFontCallback, @Nullable Handler paramHandler, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    paramFontCallback = new TypefaceCompat.ResourcesCallbackAdapter(paramFontCallback);
    return requestFont(paramContext, paramFontRequest, paramInt2, paramBoolean, paramInt1, ResourcesCompat.FontCallback.getHandler(paramHandler), paramFontCallback);
  }
  
  @Deprecated
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  @VisibleForTesting
  public static ProviderInfo getProvider(@NonNull PackageManager paramPackageManager, @NonNull FontRequest paramFontRequest, @Nullable Resources paramResources)
    throws PackageManager.NameNotFoundException
  {
    return FontProvider.getProvider(paramPackageManager, paramFontRequest, paramResources);
  }
  
  @Deprecated
  @RequiresApi(19)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static Map<Uri, ByteBuffer> prepareFontData(Context paramContext, FontInfo[] paramArrayOfFontInfo, CancellationSignal paramCancellationSignal)
  {
    return TypefaceCompatUtil.readFontInfoIntoByteBuffer(paramContext, paramArrayOfFontInfo, paramCancellationSignal);
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static Typeface requestFont(@NonNull Context paramContext, @NonNull FontRequest paramFontRequest, int paramInt1, boolean paramBoolean, @IntRange(from=0L) int paramInt2, @NonNull Handler paramHandler, @NonNull FontRequestCallback paramFontRequestCallback)
  {
    paramHandler = new CallbackWithHandler(paramFontRequestCallback, paramHandler);
    if (paramBoolean) {
      return FontRequestWorker.requestFontSync(paramContext, paramFontRequest, paramHandler, paramInt1, paramInt2);
    }
    return FontRequestWorker.requestFontAsync(paramContext, paramFontRequest, paramInt1, null, paramHandler);
  }
  
  public static void requestFont(@NonNull Context paramContext, @NonNull FontRequest paramFontRequest, @NonNull FontRequestCallback paramFontRequestCallback, @NonNull Handler paramHandler)
  {
    paramFontRequestCallback = new CallbackWithHandler(paramFontRequestCallback);
    paramHandler = RequestExecutor.createHandlerExecutor(paramHandler);
    FontRequestWorker.requestFontAsync(paramContext.getApplicationContext(), paramFontRequest, 0, paramHandler, paramFontRequestCallback);
  }
  
  @Deprecated
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static void resetCache() {}
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
  @VisibleForTesting
  public static void resetTypefaceCache() {}
  
  public static final class Columns
    implements BaseColumns
  {
    public static final String FILE_ID = "file_id";
    public static final String ITALIC = "font_italic";
    public static final String RESULT_CODE = "result_code";
    public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
    public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
    public static final int RESULT_CODE_MALFORMED_QUERY = 3;
    public static final int RESULT_CODE_OK = 0;
    public static final String TTC_INDEX = "font_ttc_index";
    public static final String VARIATION_SETTINGS = "font_variation_settings";
    public static final String WEIGHT = "font_weight";
  }
  
  public static class FontFamilyResult
  {
    public static final int STATUS_OK = 0;
    public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
    public static final int STATUS_WRONG_CERTIFICATES = 1;
    private final FontsContractCompat.FontInfo[] mFonts;
    private final int mStatusCode;
    
    @Deprecated
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public FontFamilyResult(int paramInt, @Nullable FontsContractCompat.FontInfo[] paramArrayOfFontInfo)
    {
      mStatusCode = paramInt;
      mFonts = paramArrayOfFontInfo;
    }
    
    public static FontFamilyResult create(int paramInt, @Nullable FontsContractCompat.FontInfo[] paramArrayOfFontInfo)
    {
      return new FontFamilyResult(paramInt, paramArrayOfFontInfo);
    }
    
    public FontsContractCompat.FontInfo[] getFonts()
    {
      return mFonts;
    }
    
    public int getStatusCode()
    {
      return mStatusCode;
    }
  }
  
  public static class FontInfo
  {
    private final boolean mItalic;
    private final int mResultCode;
    private final int mTtcIndex;
    private final Uri mUri;
    private final int mWeight;
    
    @Deprecated
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public FontInfo(@NonNull Uri paramUri, @IntRange(from=0L) int paramInt1, @IntRange(from=1L, to=1000L) int paramInt2, boolean paramBoolean, int paramInt3)
    {
      mUri = ((Uri)Preconditions.checkNotNull(paramUri));
      mTtcIndex = paramInt1;
      mWeight = paramInt2;
      mItalic = paramBoolean;
      mResultCode = paramInt3;
    }
    
    public static FontInfo create(@NonNull Uri paramUri, @IntRange(from=0L) int paramInt1, @IntRange(from=1L, to=1000L) int paramInt2, boolean paramBoolean, int paramInt3)
    {
      return new FontInfo(paramUri, paramInt1, paramInt2, paramBoolean, paramInt3);
    }
    
    public int getResultCode()
    {
      return mResultCode;
    }
    
    @IntRange(from=0L)
    public int getTtcIndex()
    {
      return mTtcIndex;
    }
    
    @NonNull
    public Uri getUri()
    {
      return mUri;
    }
    
    @IntRange(from=1L, to=1000L)
    public int getWeight()
    {
      return mWeight;
    }
    
    public boolean isItalic()
    {
      return mItalic;
    }
  }
  
  public static class FontRequestCallback
  {
    public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
    public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
    public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
    public static final int FAIL_REASON_MALFORMED_QUERY = 3;
    public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
    public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
    public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;
    @Deprecated
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int RESULT_OK = 0;
    public static final int RESULT_SUCCESS = 0;
    
    public void onTypefaceRequestFailed(int paramInt) {}
    
    public void onTypefaceRetrieved(Typeface paramTypeface) {}
    
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static @interface FontRequestFailReason {}
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.FontsContractCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */