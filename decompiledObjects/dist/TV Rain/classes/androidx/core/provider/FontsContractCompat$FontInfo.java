package androidx.core.provider;

import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

public class FontsContractCompat$FontInfo
{
  private final boolean mItalic;
  private final int mResultCode;
  private final int mTtcIndex;
  private final Uri mUri;
  private final int mWeight;
  
  @Deprecated
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public FontsContractCompat$FontInfo(@NonNull Uri paramUri, @IntRange(from=0L) int paramInt1, @IntRange(from=1L, to=1000L) int paramInt2, boolean paramBoolean, int paramInt3)
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

/* Location:
 * Qualified Name:     androidx.core.provider.FontsContractCompat.FontInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */