package androidx.core.graphics;

import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;

class TypefaceCompatBaseImpl$3
  implements TypefaceCompatBaseImpl.StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry>
{
  public TypefaceCompatBaseImpl$3(TypefaceCompatBaseImpl paramTypefaceCompatBaseImpl) {}
  
  public int getWeight(FontResourcesParserCompat.FontFileResourceEntry paramFontFileResourceEntry)
  {
    return paramFontFileResourceEntry.getWeight();
  }
  
  public boolean isItalic(FontResourcesParserCompat.FontFileResourceEntry paramFontFileResourceEntry)
  {
    return paramFontFileResourceEntry.isItalic();
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.TypefaceCompatBaseImpl.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */