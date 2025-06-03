package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

final class Sniffer
{
  private static final int[] COMPATIBLE_BRANDS = { Util.getIntegerCodeForString("isom"), Util.getIntegerCodeForString("iso2"), Util.getIntegerCodeForString("iso3"), Util.getIntegerCodeForString("iso4"), Util.getIntegerCodeForString("iso5"), Util.getIntegerCodeForString("iso6"), Util.getIntegerCodeForString("avc1"), Util.getIntegerCodeForString("hvc1"), Util.getIntegerCodeForString("hev1"), Util.getIntegerCodeForString("mp41"), Util.getIntegerCodeForString("mp42"), Util.getIntegerCodeForString("3g2a"), Util.getIntegerCodeForString("3g2b"), Util.getIntegerCodeForString("3gr6"), Util.getIntegerCodeForString("3gs6"), Util.getIntegerCodeForString("3ge6"), Util.getIntegerCodeForString("3gg6"), Util.getIntegerCodeForString("M4V "), Util.getIntegerCodeForString("M4A "), Util.getIntegerCodeForString("f4v "), Util.getIntegerCodeForString("kddi"), Util.getIntegerCodeForString("M4VP"), Util.getIntegerCodeForString("qt  "), Util.getIntegerCodeForString("MSNV") };
  private static final int SEARCH_LENGTH = 4096;
  
  private static boolean isCompatibleBrand(int paramInt)
  {
    if (paramInt >>> 8 == Util.getIntegerCodeForString("3gp")) {
      return true;
    }
    int[] arrayOfInt = COMPATIBLE_BRANDS;
    int i = arrayOfInt.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfInt[j] == paramInt) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean sniffFragmented(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    return sniffInternal(paramExtractorInput, true);
  }
  
  private static boolean sniffInternal(ExtractorInput paramExtractorInput, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    long l1 = paramExtractorInput.getLength();
    long l2;
    if (l1 != -1L)
    {
      l2 = l1;
      if (l1 <= 4096L) {}
    }
    else
    {
      l2 = 4096L;
    }
    int i = (int)l2;
    ParsableByteArray localParsableByteArray = new ParsableByteArray(64);
    boolean bool1 = false;
    int j = 0;
    int k = j;
    label425:
    boolean bool2;
    if (j < i)
    {
      localParsableByteArray.reset(8);
      paramExtractorInput.peekFully(data, 0, 8);
      l1 = localParsableByteArray.readUnsignedInt();
      int m = localParsableByteArray.readInt();
      int n = 16;
      if (l1 == 1L)
      {
        paramExtractorInput.peekFully(data, 8, 8);
        localParsableByteArray.setLimit(16);
        l2 = localParsableByteArray.readUnsignedLongToLong();
      }
      else
      {
        l2 = l1;
        if (l1 == 0L)
        {
          long l3 = paramExtractorInput.getLength();
          l2 = l1;
          if (l3 != -1L)
          {
            l2 = paramExtractorInput.getPosition();
            l2 = 8 + (l3 - l2);
          }
        }
        n = 8;
      }
      l1 = n;
      if (l2 < l1) {
        return false;
      }
      j += n;
      if (m == Atom.TYPE_moov) {
        m = k;
      }
      for (;;)
      {
        k = m;
        break;
        if ((m == Atom.TYPE_moof) || (m == Atom.TYPE_mvex)) {
          break label425;
        }
        if (j + l2 - l1 >= i) {
          break label431;
        }
        n = (int)(l2 - l1);
        int i1 = j + n;
        if (m == Atom.TYPE_ftyp)
        {
          if (n < 8) {
            return false;
          }
          localParsableByteArray.reset(n);
          paramExtractorInput.peekFully(data, 0, n);
          m = n / 4;
          for (j = 0;; j++)
          {
            n = k;
            if (j >= m) {
              break;
            }
            if (j == 1)
            {
              localParsableByteArray.skipBytes(4);
            }
            else if (isCompatibleBrand(localParsableByteArray.readInt()))
            {
              n = 1;
              break;
            }
          }
          j = i1;
          m = n;
          if (n == 0) {
            return false;
          }
        }
        else
        {
          j = i1;
          m = k;
          if (n != 0)
          {
            paramExtractorInput.advancePeekPosition(n);
            j = i1;
            m = k;
          }
        }
      }
      bool2 = true;
    }
    else
    {
      label431:
      bool2 = false;
    }
    boolean bool3 = bool1;
    if (k != 0)
    {
      bool3 = bool1;
      if (paramBoolean == bool2) {
        bool3 = true;
      }
    }
    return bool3;
  }
  
  public static boolean sniffUnfragmented(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    return sniffInternal(paramExtractorInput, false);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.Sniffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */