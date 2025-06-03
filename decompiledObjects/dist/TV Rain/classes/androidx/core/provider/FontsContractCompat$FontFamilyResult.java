package androidx.core.provider;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

public class FontsContractCompat$FontFamilyResult
{
  public static final int STATUS_OK = 0;
  public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
  public static final int STATUS_WRONG_CERTIFICATES = 1;
  private final FontsContractCompat.FontInfo[] mFonts;
  private final int mStatusCode;
  
  @Deprecated
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public FontsContractCompat$FontFamilyResult(int paramInt, @Nullable FontsContractCompat.FontInfo[] paramArrayOfFontInfo)
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

/* Location:
 * Qualified Name:     androidx.core.provider.FontsContractCompat.FontFamilyResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */