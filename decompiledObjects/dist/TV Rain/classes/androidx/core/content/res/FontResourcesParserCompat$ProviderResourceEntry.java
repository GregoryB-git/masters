package androidx.core.content.res;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.provider.FontRequest;

public final class FontResourcesParserCompat$ProviderResourceEntry
  implements FontResourcesParserCompat.FamilyResourceEntry
{
  @NonNull
  private final FontRequest mRequest;
  private final int mStrategy;
  @Nullable
  private final String mSystemFontFamilyName;
  private final int mTimeoutMs;
  
  public FontResourcesParserCompat$ProviderResourceEntry(@NonNull FontRequest paramFontRequest, int paramInt1, int paramInt2)
  {
    this(paramFontRequest, paramInt1, paramInt2, null);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public FontResourcesParserCompat$ProviderResourceEntry(@NonNull FontRequest paramFontRequest, int paramInt1, int paramInt2, @Nullable String paramString)
  {
    mRequest = paramFontRequest;
    mStrategy = paramInt1;
    mTimeoutMs = paramInt2;
    mSystemFontFamilyName = paramString;
  }
  
  public int getFetchStrategy()
  {
    return mStrategy;
  }
  
  @NonNull
  public FontRequest getRequest()
  {
    return mRequest;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public String getSystemFontFamilyName()
  {
    return mSystemFontFamilyName;
  }
  
  public int getTimeout()
  {
    return mTimeoutMs;
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */