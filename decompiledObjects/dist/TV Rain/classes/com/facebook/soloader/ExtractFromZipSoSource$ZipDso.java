package com.facebook.soloader;

import java.util.zip.ZipEntry;

final class ExtractFromZipSoSource$ZipDso
  extends UnpackingSoSource.Dso
  implements Comparable
{
  public final int abiScore;
  public final ZipEntry backingEntry;
  
  public ExtractFromZipSoSource$ZipDso(String paramString, ZipEntry paramZipEntry, int paramInt)
  {
    super(paramString, makePseudoHash(paramZipEntry));
    backingEntry = paramZipEntry;
    abiScore = paramInt;
  }
  
  private static String makePseudoHash(ZipEntry paramZipEntry)
  {
    return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[] { paramZipEntry.getName(), Long.valueOf(paramZipEntry.getSize()), Long.valueOf(paramZipEntry.getCompressedSize()), Long.valueOf(paramZipEntry.getCrc()) });
  }
  
  public int compareTo(Object paramObject)
  {
    return name.compareTo(name);
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.ExtractFromZipSoSource.ZipDso
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */