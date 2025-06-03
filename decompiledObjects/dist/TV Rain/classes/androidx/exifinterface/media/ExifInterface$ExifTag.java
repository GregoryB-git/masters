package androidx.exifinterface.media;

class ExifInterface$ExifTag
{
  public final String name;
  public final int number;
  public final int primaryFormat;
  public final int secondaryFormat;
  
  public ExifInterface$ExifTag(String paramString, int paramInt1, int paramInt2)
  {
    name = paramString;
    number = paramInt1;
    primaryFormat = paramInt2;
    secondaryFormat = -1;
  }
  
  public ExifInterface$ExifTag(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    name = paramString;
    number = paramInt1;
    primaryFormat = paramInt2;
    secondaryFormat = paramInt3;
  }
  
  public boolean isFormatCompatible(int paramInt)
  {
    int i = primaryFormat;
    if ((i != 7) && (paramInt != 7) && (i != paramInt))
    {
      int j = secondaryFormat;
      if (j != paramInt)
      {
        if (((i == 4) || (j == 4)) && (paramInt == 3)) {
          return true;
        }
        if (((i == 9) || (j == 9)) && (paramInt == 8)) {
          return true;
        }
        return ((i == 12) || (j == 12)) && (paramInt == 11);
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.exifinterface.media.ExifInterface.ExifTag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */