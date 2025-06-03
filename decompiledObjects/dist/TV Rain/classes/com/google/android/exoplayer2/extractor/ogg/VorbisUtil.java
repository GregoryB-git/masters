package com.google.android.exoplayer2.extractor.ogg;

import a;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;
import z2;

final class VorbisUtil
{
  private static final String TAG = "VorbisUtil";
  
  public static int iLog(int paramInt)
  {
    int i = 0;
    while (paramInt > 0)
    {
      i++;
      paramInt >>>= 1;
    }
    return i;
  }
  
  private static long mapType1QuantValues(long paramLong1, long paramLong2)
  {
    return Math.floor(Math.pow(paramLong1, 1.0D / paramLong2));
  }
  
  private static CodeBook readBook(VorbisBitArray paramVorbisBitArray)
    throws ParserException
  {
    if (paramVorbisBitArray.readBits(24) == 5653314)
    {
      int i = paramVorbisBitArray.readBits(16);
      int j = paramVorbisBitArray.readBits(24);
      localObject = new long[j];
      boolean bool1 = paramVorbisBitArray.readBit();
      long l = 0L;
      int k = 0;
      if (!bool1)
      {
        boolean bool2 = paramVorbisBitArray.readBit();
        while (k < j)
        {
          if (bool2)
          {
            if (paramVorbisBitArray.readBit()) {
              localObject[k] = (paramVorbisBitArray.readBits(5) + 1);
            } else {
              localObject[k] = 0L;
            }
          }
          else {
            localObject[k] = (paramVorbisBitArray.readBits(5) + 1);
          }
          k++;
        }
      }
      k = paramVorbisBitArray.readBits(5) + 1;
      int m = 0;
      while (m < j)
      {
        int n = paramVorbisBitArray.readBits(iLog(j - m));
        for (int i1 = 0; (i1 < n) && (m < j); i1++)
        {
          localObject[m] = k;
          m++;
        }
        k++;
      }
      k = paramVorbisBitArray.readBits(4);
      if (k <= 2)
      {
        if ((k == 1) || (k == 2))
        {
          paramVorbisBitArray.skipBits(32);
          paramVorbisBitArray.skipBits(32);
          m = paramVorbisBitArray.readBits(4);
          paramVorbisBitArray.skipBits(1);
          if (k == 1)
          {
            if (i != 0) {
              l = mapType1QuantValues(j, i);
            }
          }
          else {
            l = j * i;
          }
          paramVorbisBitArray.skipBits((int)(l * (m + 1)));
        }
        return new CodeBook(i, j, (long[])localObject, k, bool1);
      }
      throw new ParserException(a.f("lookup type greater than 2 not decodable: ", k));
    }
    Object localObject = z2.t("expected code book to start with [0x56, 0x43, 0x42] at ");
    ((StringBuilder)localObject).append(paramVorbisBitArray.getPosition());
    throw new ParserException(((StringBuilder)localObject).toString());
  }
  
  private static void readFloors(VorbisBitArray paramVorbisBitArray)
    throws ParserException
  {
    int i = paramVorbisBitArray.readBits(6);
    for (int j = 0; j < i + 1; j++)
    {
      int k = paramVorbisBitArray.readBits(16);
      if (k != 0)
      {
        if (k == 1)
        {
          int m = paramVorbisBitArray.readBits(5);
          n = -1;
          int[] arrayOfInt1 = new int[m];
          k = 0;
          while (k < m)
          {
            i1 = paramVorbisBitArray.readBits(4);
            arrayOfInt1[k] = i1;
            i2 = n;
            if (i1 > n) {
              i2 = i1;
            }
            k++;
            n = i2;
          }
          int i2 = n + 1;
          int[] arrayOfInt2 = new int[i2];
          for (k = 0; k < i2; k++)
          {
            arrayOfInt2[k] = (paramVorbisBitArray.readBits(3) + 1);
            i1 = paramVorbisBitArray.readBits(2);
            if (i1 > 0) {
              paramVorbisBitArray.skipBits(8);
            }
            for (n = 0; n < 1 << i1; n++) {
              paramVorbisBitArray.skipBits(8);
            }
          }
          paramVorbisBitArray.skipBits(2);
          int i3 = paramVorbisBitArray.readBits(4);
          int i1 = 0;
          k = i1;
          n = k;
          i2 = k;
          for (k = i1; k < m; k++)
          {
            i2 += arrayOfInt2[arrayOfInt1[k]];
            while (n < i2)
            {
              paramVorbisBitArray.skipBits(i3);
              n++;
            }
          }
        }
        throw new ParserException(a.f("floor type greater than 1 not decodable: ", k));
      }
      paramVorbisBitArray.skipBits(8);
      paramVorbisBitArray.skipBits(16);
      paramVorbisBitArray.skipBits(16);
      paramVorbisBitArray.skipBits(6);
      paramVorbisBitArray.skipBits(8);
      int n = paramVorbisBitArray.readBits(4);
      for (k = 0; k < n + 1; k++) {
        paramVorbisBitArray.skipBits(8);
      }
    }
  }
  
  private static void readMappings(int paramInt, VorbisBitArray paramVorbisBitArray)
    throws ParserException
  {
    int i = paramVorbisBitArray.readBits(6);
    int j = 0;
    while (j < i + 1)
    {
      int k = paramVorbisBitArray.readBits(16);
      if (k != 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("mapping type other than 0 not supported: ");
        localStringBuilder.append(k);
        Log.e("VorbisUtil", localStringBuilder.toString());
      }
      else
      {
        if (paramVorbisBitArray.readBit()) {
          k = paramVorbisBitArray.readBits(4) + 1;
        } else {
          k = 1;
        }
        if (paramVorbisBitArray.readBit())
        {
          int m = paramVorbisBitArray.readBits(8);
          for (n = 0; n < m + 1; n++)
          {
            int i1 = paramInt - 1;
            paramVorbisBitArray.skipBits(iLog(i1));
            paramVorbisBitArray.skipBits(iLog(i1));
          }
        }
        if (paramVorbisBitArray.readBits(2) != 0) {
          break label219;
        }
        if (k > 1) {
          for (n = 0; n < paramInt; n++) {
            paramVorbisBitArray.skipBits(4);
          }
        }
        for (int n = 0; n < k; n++)
        {
          paramVorbisBitArray.skipBits(8);
          paramVorbisBitArray.skipBits(8);
          paramVorbisBitArray.skipBits(8);
        }
      }
      j++;
      continue;
      label219:
      throw new ParserException("to reserved bits must be zero after mapping coupling steps");
    }
  }
  
  private static Mode[] readModes(VorbisBitArray paramVorbisBitArray)
  {
    int i = paramVorbisBitArray.readBits(6) + 1;
    Mode[] arrayOfMode = new Mode[i];
    for (int j = 0; j < i; j++) {
      arrayOfMode[j] = new Mode(paramVorbisBitArray.readBit(), paramVorbisBitArray.readBits(16), paramVorbisBitArray.readBits(16), paramVorbisBitArray.readBits(8));
    }
    return arrayOfMode;
  }
  
  private static void readResidues(VorbisBitArray paramVorbisBitArray)
    throws ParserException
  {
    int i = paramVorbisBitArray.readBits(6);
    int j = 0;
    while (j < i + 1) {
      if (paramVorbisBitArray.readBits(16) <= 2)
      {
        paramVorbisBitArray.skipBits(24);
        paramVorbisBitArray.skipBits(24);
        paramVorbisBitArray.skipBits(24);
        int k = paramVorbisBitArray.readBits(6) + 1;
        paramVorbisBitArray.skipBits(8);
        int[] arrayOfInt = new int[k];
        int i1;
        for (int m = 0; m < k; m++)
        {
          int n = paramVorbisBitArray.readBits(3);
          if (paramVorbisBitArray.readBit()) {
            i1 = paramVorbisBitArray.readBits(5);
          } else {
            i1 = 0;
          }
          arrayOfInt[m] = (i1 * 8 + n);
        }
        for (m = 0; m < k; m++) {
          for (i1 = 0; i1 < 8; i1++) {
            if ((arrayOfInt[m] & 1 << i1) != 0) {
              paramVorbisBitArray.skipBits(8);
            }
          }
        }
        j++;
      }
      else
      {
        throw new ParserException("residueType greater than 2 is not decodable");
      }
    }
  }
  
  public static CommentHeader readVorbisCommentHeader(ParsableByteArray paramParsableByteArray)
    throws ParserException
  {
    int i = 0;
    verifyVorbisHeaderCapturePattern(3, paramParsableByteArray, false);
    String str1 = paramParsableByteArray.readString((int)paramParsableByteArray.readLittleEndianUnsignedInt());
    int j = str1.length();
    long l = paramParsableByteArray.readLittleEndianUnsignedInt();
    String[] arrayOfString = new String[(int)l];
    j = j + 11 + 4;
    while (i < l)
    {
      String str2 = paramParsableByteArray.readString((int)paramParsableByteArray.readLittleEndianUnsignedInt());
      arrayOfString[i] = str2;
      j = j + 4 + str2.length();
      i++;
    }
    if ((paramParsableByteArray.readUnsignedByte() & 0x1) != 0) {
      return new CommentHeader(str1, arrayOfString, j + 1);
    }
    throw new ParserException("framing bit expected to be set");
  }
  
  public static VorbisIdHeader readVorbisIdentificationHeader(ParsableByteArray paramParsableByteArray)
    throws ParserException
  {
    verifyVorbisHeaderCapturePattern(1, paramParsableByteArray, false);
    long l1 = paramParsableByteArray.readLittleEndianUnsignedInt();
    int i = paramParsableByteArray.readUnsignedByte();
    long l2 = paramParsableByteArray.readLittleEndianUnsignedInt();
    int j = paramParsableByteArray.readLittleEndianInt();
    int k = paramParsableByteArray.readLittleEndianInt();
    int m = paramParsableByteArray.readLittleEndianInt();
    int n = paramParsableByteArray.readUnsignedByte();
    int i1 = (int)Math.pow(2.0D, n & 0xF);
    n = (int)Math.pow(2.0D, (n & 0xF0) >> 4);
    boolean bool;
    if ((paramParsableByteArray.readUnsignedByte() & 0x1) > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return new VorbisIdHeader(l1, i, l2, j, k, m, i1, n, bool, Arrays.copyOf(data, paramParsableByteArray.limit()));
  }
  
  public static Mode[] readVorbisModes(ParsableByteArray paramParsableByteArray, int paramInt)
    throws ParserException
  {
    int i = 0;
    verifyVorbisHeaderCapturePattern(5, paramParsableByteArray, false);
    int j = paramParsableByteArray.readUnsignedByte();
    VorbisBitArray localVorbisBitArray = new VorbisBitArray(data);
    localVorbisBitArray.skipBits(paramParsableByteArray.getPosition() * 8);
    for (int k = 0; k < j + 1; k++) {
      readBook(localVorbisBitArray);
    }
    j = localVorbisBitArray.readBits(6);
    k = i;
    while (k < j + 1) {
      if (localVorbisBitArray.readBits(16) == 0) {
        k++;
      } else {
        throw new ParserException("placeholder of time domain transforms not zeroed out");
      }
    }
    readFloors(localVorbisBitArray);
    readResidues(localVorbisBitArray);
    readMappings(paramInt, localVorbisBitArray);
    paramParsableByteArray = readModes(localVorbisBitArray);
    if (localVorbisBitArray.readBit()) {
      return paramParsableByteArray;
    }
    throw new ParserException("framing bit after modes not set as expected");
  }
  
  public static boolean verifyVorbisHeaderCapturePattern(int paramInt, ParsableByteArray paramParsableByteArray, boolean paramBoolean)
    throws ParserException
  {
    if (paramParsableByteArray.bytesLeft() < 7)
    {
      if (paramBoolean) {
        return false;
      }
      StringBuilder localStringBuilder = z2.t("too short header: ");
      localStringBuilder.append(paramParsableByteArray.bytesLeft());
      throw new ParserException(localStringBuilder.toString());
    }
    if (paramParsableByteArray.readUnsignedByte() != paramInt)
    {
      if (paramBoolean) {
        return false;
      }
      paramParsableByteArray = z2.t("expected header type ");
      paramParsableByteArray.append(Integer.toHexString(paramInt));
      throw new ParserException(paramParsableByteArray.toString());
    }
    if ((paramParsableByteArray.readUnsignedByte() == 118) && (paramParsableByteArray.readUnsignedByte() == 111) && (paramParsableByteArray.readUnsignedByte() == 114) && (paramParsableByteArray.readUnsignedByte() == 98) && (paramParsableByteArray.readUnsignedByte() == 105) && (paramParsableByteArray.readUnsignedByte() == 115)) {
      return true;
    }
    if (paramBoolean) {
      return false;
    }
    throw new ParserException("expected characters 'vorbis'");
  }
  
  public static final class CodeBook
  {
    public final int dimensions;
    public final int entries;
    public final boolean isOrdered;
    public final long[] lengthMap;
    public final int lookupType;
    
    public CodeBook(int paramInt1, int paramInt2, long[] paramArrayOfLong, int paramInt3, boolean paramBoolean)
    {
      dimensions = paramInt1;
      entries = paramInt2;
      lengthMap = paramArrayOfLong;
      lookupType = paramInt3;
      isOrdered = paramBoolean;
    }
  }
  
  public static final class CommentHeader
  {
    public final String[] comments;
    public final int length;
    public final String vendor;
    
    public CommentHeader(String paramString, String[] paramArrayOfString, int paramInt)
    {
      vendor = paramString;
      comments = paramArrayOfString;
      length = paramInt;
    }
  }
  
  public static final class Mode
  {
    public final boolean blockFlag;
    public final int mapping;
    public final int transformType;
    public final int windowType;
    
    public Mode(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
    {
      blockFlag = paramBoolean;
      windowType = paramInt1;
      transformType = paramInt2;
      mapping = paramInt3;
    }
  }
  
  public static final class VorbisIdHeader
  {
    public final int bitrateMax;
    public final int bitrateMin;
    public final int bitrateNominal;
    public final int blockSize0;
    public final int blockSize1;
    public final int channels;
    public final byte[] data;
    public final boolean framingFlag;
    public final long sampleRate;
    public final long version;
    
    public VorbisIdHeader(long paramLong1, int paramInt1, long paramLong2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, byte[] paramArrayOfByte)
    {
      version = paramLong1;
      channels = paramInt1;
      sampleRate = paramLong2;
      bitrateMax = paramInt2;
      bitrateNominal = paramInt3;
      bitrateMin = paramInt4;
      blockSize0 = paramInt5;
      blockSize1 = paramInt6;
      framingFlag = paramBoolean;
      data = paramArrayOfByte;
    }
    
    public int getApproximateBitrate()
    {
      int i = bitrateNominal;
      int j = i;
      if (i == 0) {
        j = (bitrateMin + bitrateMax) / 2;
      }
      return j;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ogg.VorbisUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */