package androidx.core.content.res;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class FontResourcesParserCompat$FontFileResourceEntry
{
  @NonNull
  private final String mFileName;
  private final boolean mItalic;
  private final int mResourceId;
  private final int mTtcIndex;
  private final String mVariationSettings;
  private final int mWeight;
  
  public FontResourcesParserCompat$FontFileResourceEntry(@NonNull String paramString1, int paramInt1, boolean paramBoolean, @Nullable String paramString2, int paramInt2, int paramInt3)
  {
    mFileName = paramString1;
    mWeight = paramInt1;
    mItalic = paramBoolean;
    mVariationSettings = paramString2;
    mTtcIndex = paramInt2;
    mResourceId = paramInt3;
  }
  
  @NonNull
  public String getFileName()
  {
    return mFileName;
  }
  
  public int getResourceId()
  {
    return mResourceId;
  }
  
  public int getTtcIndex()
  {
    return mTtcIndex;
  }
  
  @Nullable
  public String getVariationSettings()
  {
    return mVariationSettings;
  }
  
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
 * Qualified Name:     androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */