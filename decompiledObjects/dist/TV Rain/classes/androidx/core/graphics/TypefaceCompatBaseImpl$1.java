package androidx.core.graphics;

import androidx.core.provider.FontsContractCompat.FontInfo;

class TypefaceCompatBaseImpl$1
  implements TypefaceCompatBaseImpl.StyleExtractor<FontsContractCompat.FontInfo>
{
  public TypefaceCompatBaseImpl$1(TypefaceCompatBaseImpl paramTypefaceCompatBaseImpl) {}
  
  public int getWeight(FontsContractCompat.FontInfo paramFontInfo)
  {
    return paramFontInfo.getWeight();
  }
  
  public boolean isItalic(FontsContractCompat.FontInfo paramFontInfo)
  {
    return paramFontInfo.isItalic();
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.TypefaceCompatBaseImpl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */