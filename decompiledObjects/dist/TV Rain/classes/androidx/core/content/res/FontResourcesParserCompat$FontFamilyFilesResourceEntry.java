package androidx.core.content.res;

import androidx.annotation.NonNull;

public final class FontResourcesParserCompat$FontFamilyFilesResourceEntry
  implements FontResourcesParserCompat.FamilyResourceEntry
{
  @NonNull
  private final FontResourcesParserCompat.FontFileResourceEntry[] mEntries;
  
  public FontResourcesParserCompat$FontFamilyFilesResourceEntry(@NonNull FontResourcesParserCompat.FontFileResourceEntry[] paramArrayOfFontFileResourceEntry)
  {
    mEntries = paramArrayOfFontFileResourceEntry;
  }
  
  @NonNull
  public FontResourcesParserCompat.FontFileResourceEntry[] getEntries()
  {
    return mEntries;
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */