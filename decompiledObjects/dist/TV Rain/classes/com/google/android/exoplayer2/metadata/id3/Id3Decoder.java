package com.google.android.exoplayer2.metadata.id3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataDecoder;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.UnsupportedEncodingException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import z2;
import z3;

public final class Id3Decoder
  implements MetadataDecoder
{
  private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
  private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
  private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
  private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
  private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
  private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
  private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
  private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
  public static final int ID3_HEADER_LENGTH = 10;
  public static final int ID3_TAG = Util.getIntegerCodeForString("ID3");
  private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
  private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
  private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
  private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
  public static final FramePredicate NO_FRAMES_PREDICATE = new z3(25);
  private static final String TAG = "Id3Decoder";
  @Nullable
  private final FramePredicate framePredicate;
  
  public Id3Decoder()
  {
    this(null);
  }
  
  public Id3Decoder(@Nullable FramePredicate paramFramePredicate)
  {
    framePredicate = paramFramePredicate;
  }
  
  private static byte[] copyOfRangeIfValid(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramInt1) {
      return Util.EMPTY_BYTE_ARRAY;
    }
    return Arrays.copyOfRange(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private static ApicFrame decodeApicFrame(ParsableByteArray paramParsableByteArray, int paramInt1, int paramInt2)
    throws UnsupportedEncodingException
  {
    int i = paramParsableByteArray.readUnsignedByte();
    String str1 = getCharsetName(i);
    int j = paramInt1 - 1;
    byte[] arrayOfByte = new byte[j];
    paramParsableByteArray.readBytes(arrayOfByte, 0, j);
    if (paramInt2 == 2)
    {
      paramParsableByteArray = z2.t("image/");
      paramParsableByteArray.append(Util.toLowerInvariant(new String(arrayOfByte, 0, 3, "ISO-8859-1")));
      String str2 = paramParsableByteArray.toString();
      paramParsableByteArray = str2;
      if ("image/jpg".equals(str2)) {
        paramParsableByteArray = "image/jpeg";
      }
      paramInt1 = 2;
    }
    else
    {
      paramInt1 = indexOfZeroByte(arrayOfByte, 0);
      paramParsableByteArray = Util.toLowerInvariant(new String(arrayOfByte, 0, paramInt1, "ISO-8859-1"));
      if (paramParsableByteArray.indexOf('/') == -1) {
        paramParsableByteArray = z2.o("image/", paramParsableByteArray);
      }
    }
    paramInt2 = arrayOfByte[(paramInt1 + 1)];
    paramInt1 += 2;
    int k = indexOfEos(arrayOfByte, paramInt1, i);
    return new ApicFrame(paramParsableByteArray, new String(arrayOfByte, paramInt1, k - paramInt1, str1), paramInt2 & 0xFF, copyOfRangeIfValid(arrayOfByte, k + delimiterLength(i), j));
  }
  
  private static BinaryFrame decodeBinaryFrame(ParsableByteArray paramParsableByteArray, int paramInt, String paramString)
  {
    byte[] arrayOfByte = new byte[paramInt];
    paramParsableByteArray.readBytes(arrayOfByte, 0, paramInt);
    return new BinaryFrame(paramString, arrayOfByte);
  }
  
  private static ChapterFrame decodeChapterFrame(ParsableByteArray paramParsableByteArray, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, @Nullable FramePredicate paramFramePredicate)
    throws UnsupportedEncodingException
  {
    int i = paramParsableByteArray.getPosition();
    int j = indexOfZeroByte(data, i);
    String str = new String(data, i, j - i, "ISO-8859-1");
    paramParsableByteArray.setPosition(j + 1);
    j = paramParsableByteArray.readInt();
    int k = paramParsableByteArray.readInt();
    long l1 = paramParsableByteArray.readUnsignedInt();
    if (l1 == 4294967295L) {
      l1 = -1L;
    }
    long l2 = paramParsableByteArray.readUnsignedInt();
    if (l2 == 4294967295L) {
      l2 = -1L;
    }
    ArrayList localArrayList = new ArrayList();
    while (paramParsableByteArray.getPosition() < i + paramInt1)
    {
      Id3Frame localId3Frame = decodeFrame(paramInt2, paramParsableByteArray, paramBoolean, paramInt3, paramFramePredicate);
      if (localId3Frame != null) {
        localArrayList.add(localId3Frame);
      }
    }
    paramParsableByteArray = new Id3Frame[localArrayList.size()];
    localArrayList.toArray(paramParsableByteArray);
    return new ChapterFrame(str, j, k, l1, l2, paramParsableByteArray);
  }
  
  private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray paramParsableByteArray, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, @Nullable FramePredicate paramFramePredicate)
    throws UnsupportedEncodingException
  {
    int i = paramParsableByteArray.getPosition();
    int j = indexOfZeroByte(data, i);
    String str = new String(data, i, j - i, "ISO-8859-1");
    paramParsableByteArray.setPosition(j + 1);
    int k = paramParsableByteArray.readUnsignedByte();
    j = 0;
    boolean bool1;
    if ((k & 0x2) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool2;
    if ((k & 0x1) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    k = paramParsableByteArray.readUnsignedByte();
    String[] arrayOfString = new String[k];
    while (j < k)
    {
      int m = paramParsableByteArray.getPosition();
      int n = indexOfZeroByte(data, m);
      arrayOfString[j] = new String(data, m, n - m, "ISO-8859-1");
      paramParsableByteArray.setPosition(n + 1);
      j++;
    }
    ArrayList localArrayList = new ArrayList();
    while (paramParsableByteArray.getPosition() < i + paramInt1)
    {
      Id3Frame localId3Frame = decodeFrame(paramInt2, paramParsableByteArray, paramBoolean, paramInt3, paramFramePredicate);
      if (localId3Frame != null) {
        localArrayList.add(localId3Frame);
      }
    }
    paramParsableByteArray = new Id3Frame[localArrayList.size()];
    localArrayList.toArray(paramParsableByteArray);
    return new ChapterTocFrame(str, bool1, bool2, arrayOfString, paramParsableByteArray);
  }
  
  @Nullable
  private static CommentFrame decodeCommentFrame(ParsableByteArray paramParsableByteArray, int paramInt)
    throws UnsupportedEncodingException
  {
    if (paramInt < 4) {
      return null;
    }
    int i = paramParsableByteArray.readUnsignedByte();
    String str1 = getCharsetName(i);
    byte[] arrayOfByte = new byte[3];
    paramParsableByteArray.readBytes(arrayOfByte, 0, 3);
    String str2 = new String(arrayOfByte, 0, 3);
    paramInt -= 4;
    arrayOfByte = new byte[paramInt];
    paramParsableByteArray.readBytes(arrayOfByte, 0, paramInt);
    paramInt = indexOfEos(arrayOfByte, 0, i);
    paramParsableByteArray = new String(arrayOfByte, 0, paramInt, str1);
    paramInt += delimiterLength(i);
    return new CommentFrame(str2, paramParsableByteArray, decodeStringIfValid(arrayOfByte, paramInt, indexOfEos(arrayOfByte, paramInt, i), str1));
  }
  
  @Nullable
  private static Id3Frame decodeFrame(int paramInt1, ParsableByteArray paramParsableByteArray, boolean paramBoolean, int paramInt2, @Nullable FramePredicate paramFramePredicate)
  {
    int i = paramParsableByteArray.readUnsignedByte();
    int j = paramParsableByteArray.readUnsignedByte();
    int k = paramParsableByteArray.readUnsignedByte();
    int m;
    if (paramInt1 >= 3) {
      m = paramParsableByteArray.readUnsignedByte();
    } else {
      m = 0;
    }
    int n;
    int i1;
    if (paramInt1 == 4)
    {
      n = paramParsableByteArray.readUnsignedIntToInt();
      i1 = n;
      if (!paramBoolean) {
        i1 = (n >> 24 & 0xFF) << 21 | n & 0xFF | (n >> 8 & 0xFF) << 7 | (n >> 16 & 0xFF) << 14;
      }
    }
    int i2;
    for (;;)
    {
      i2 = i1;
      break;
      if (paramInt1 == 3) {
        i1 = paramParsableByteArray.readUnsignedIntToInt();
      } else {
        i1 = paramParsableByteArray.readUnsignedInt24();
      }
    }
    if (paramInt1 >= 3) {
      i1 = paramParsableByteArray.readUnsignedShort();
    } else {
      i1 = 0;
    }
    if ((i == 0) && (j == 0) && (k == 0) && (m == 0) && (i2 == 0) && (i1 == 0))
    {
      paramParsableByteArray.setPosition(paramParsableByteArray.limit());
      return null;
    }
    int i3 = paramParsableByteArray.getPosition() + i2;
    if (i3 > paramParsableByteArray.limit())
    {
      Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
      paramParsableByteArray.setPosition(paramParsableByteArray.limit());
      return null;
    }
    if ((paramFramePredicate != null) && (!paramFramePredicate.evaluate(paramInt1, i, j, k, m)))
    {
      paramParsableByteArray.setPosition(i3);
      return null;
    }
    int i4 = i1;
    int i5;
    int i6;
    int i7;
    if (paramInt1 == 3)
    {
      if ((i4 & 0x80) != 0) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if ((i4 & 0x40) != 0) {
        i5 = 1;
      } else {
        i5 = 0;
      }
      if ((i4 & 0x20) != 0) {
        i6 = 1;
      } else {
        i6 = 0;
      }
      i4 = i1;
      i7 = 0;
      n = i1;
      i1 = i7;
    }
    else if (paramInt1 == 4)
    {
      if ((i4 & 0x40) != 0) {
        n = 1;
      } else {
        n = 0;
      }
      if ((i4 & 0x8) != 0) {
        i6 = 1;
      } else {
        i6 = 0;
      }
      if ((i4 & 0x4) != 0) {
        i5 = 1;
      } else {
        i5 = 0;
      }
      if ((i4 & 0x2) != 0) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if ((i4 & 0x1) != 0) {
        i4 = 1;
      } else {
        i4 = 0;
      }
      i7 = n;
      n = i4;
      i4 = i6;
      i6 = i7;
    }
    else
    {
      i6 = 0;
      n = 0;
      i5 = 0;
      i1 = 0;
      i4 = 0;
    }
    if ((i4 == 0) && (i5 == 0))
    {
      i5 = i2;
      if (i6 != 0)
      {
        i5 = i2 - 1;
        paramParsableByteArray.skipBytes(1);
      }
      i6 = i5;
      if (n != 0)
      {
        i6 = i5 - 4;
        paramParsableByteArray.skipBytes(4);
      }
      n = i6;
      if (i1 != 0) {
        n = removeUnsynchronization(paramParsableByteArray, i6);
      }
      if ((i == 84) && (j == 88) && (k == 88) && ((paramInt1 == 2) || (m == 88))) {}
      try
      {
        try
        {
          paramFramePredicate = decodeTxxxFrame(paramParsableByteArray, n);
        }
        finally
        {
          break label1118;
        }
        if (i == 84) {
          paramFramePredicate = decodeTextInformationFrame(paramParsableByteArray, n, getFrameId(paramInt1, i, j, k, m));
        } else if ((i == 87) && (j == 88) && (k == 88) && ((paramInt1 == 2) || (m == 88))) {
          paramFramePredicate = decodeWxxxFrame(paramParsableByteArray, n);
        } else if (i == 87) {
          paramFramePredicate = decodeUrlLinkFrame(paramParsableByteArray, n, getFrameId(paramInt1, i, j, k, m));
        } else if ((i == 80) && (j == 82) && (k == 73) && (m == 86)) {
          paramFramePredicate = decodePrivFrame(paramParsableByteArray, n);
        } else if ((i == 71) && (j == 69) && (k == 79) && ((m == 66) || (paramInt1 == 2))) {
          paramFramePredicate = decodeGeobFrame(paramParsableByteArray, n);
        } else if (paramInt1 == 2 ? (i == 80) && (j == 73) && (k == 67) : (i == 65) && (j == 80) && (k == 73) && (m == 67)) {
          paramFramePredicate = decodeApicFrame(paramParsableByteArray, n, paramInt1);
        } else if ((i == 67) && (j == 79) && (k == 77) && ((m == 77) || (paramInt1 == 2))) {
          paramFramePredicate = decodeCommentFrame(paramParsableByteArray, n);
        } else if ((i == 67) && (j == 72) && (k == 65) && (m == 80)) {
          paramFramePredicate = decodeChapterFrame(paramParsableByteArray, n, paramInt1, paramBoolean, paramInt2, paramFramePredicate);
        } else if ((i == 67) && (j == 84) && (k == 79) && (m == 67)) {
          paramFramePredicate = decodeChapterTOCFrame(paramParsableByteArray, n, paramInt1, paramBoolean, paramInt2, paramFramePredicate);
        } else if ((i == 77) && (j == 76) && (k == 76) && (m == 84)) {
          paramFramePredicate = decodeMlltFrame(paramParsableByteArray, n);
        } else {
          paramFramePredicate = decodeBinaryFrame(paramParsableByteArray, n, getFrameId(paramInt1, i, j, k, m));
        }
        if (paramFramePredicate == null)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("Failed to decode frame: id=");
          localStringBuilder.append(getFrameId(paramInt1, i, j, k, m));
          localStringBuilder.append(", frameSize=");
          localStringBuilder.append(n);
          Log.w("Id3Decoder", localStringBuilder.toString());
        }
        paramParsableByteArray.setPosition(i3);
        return paramFramePredicate;
      }
      catch (UnsupportedEncodingException paramFramePredicate)
      {
        Log.w("Id3Decoder", "Unsupported character encoding");
        paramParsableByteArray.setPosition(i3);
        return null;
      }
      label1118:
      paramParsableByteArray.setPosition(i3);
      throw paramFramePredicate;
    }
    Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
    paramParsableByteArray.setPosition(i3);
    return null;
  }
  
  private static GeobFrame decodeGeobFrame(ParsableByteArray paramParsableByteArray, int paramInt)
    throws UnsupportedEncodingException
  {
    int i = paramParsableByteArray.readUnsignedByte();
    String str1 = getCharsetName(i);
    paramInt--;
    byte[] arrayOfByte = new byte[paramInt];
    paramParsableByteArray.readBytes(arrayOfByte, 0, paramInt);
    int j = indexOfZeroByte(arrayOfByte, 0);
    paramParsableByteArray = new String(arrayOfByte, 0, j, "ISO-8859-1");
    int k = j + 1;
    j = indexOfEos(arrayOfByte, k, i);
    String str2 = decodeStringIfValid(arrayOfByte, k, j, str1);
    j += delimiterLength(i);
    k = indexOfEos(arrayOfByte, j, i);
    return new GeobFrame(paramParsableByteArray, str2, decodeStringIfValid(arrayOfByte, j, k, str1), copyOfRangeIfValid(arrayOfByte, k + delimiterLength(i), paramInt));
  }
  
  @Nullable
  private static Id3Header decodeHeader(ParsableByteArray paramParsableByteArray)
  {
    if (paramParsableByteArray.bytesLeft() < 10)
    {
      Log.w("Id3Decoder", "Data too short to be an ID3 tag");
      return null;
    }
    int i = paramParsableByteArray.readUnsignedInt24();
    if (i != ID3_TAG)
    {
      paramParsableByteArray = new StringBuilder();
      paramParsableByteArray.append("Unexpected first three bytes of ID3 tag header: ");
      paramParsableByteArray.append(i);
      Log.w("Id3Decoder", paramParsableByteArray.toString());
      return null;
    }
    int j = paramParsableByteArray.readUnsignedByte();
    boolean bool = true;
    paramParsableByteArray.skipBytes(1);
    int k = paramParsableByteArray.readUnsignedByte();
    int m = paramParsableByteArray.readSynchSafeInt();
    int n;
    if (j == 2)
    {
      if ((k & 0x40) != 0) {
        n = 1;
      } else {
        n = 0;
      }
      i = m;
      if (n != 0)
      {
        Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
        return null;
      }
    }
    else if (j == 3)
    {
      if ((k & 0x40) != 0) {
        n = 1;
      } else {
        n = 0;
      }
      i = m;
      if (n != 0)
      {
        i = paramParsableByteArray.readInt();
        paramParsableByteArray.skipBytes(i);
        i = m - (i + 4);
      }
    }
    else
    {
      if (j != 4) {
        break label285;
      }
      if ((k & 0x40) != 0) {
        i = 1;
      } else {
        i = 0;
      }
      n = m;
      if (i != 0)
      {
        i = paramParsableByteArray.readSynchSafeInt();
        paramParsableByteArray.skipBytes(i - 4);
        n = m - i;
      }
      if ((k & 0x10) != 0) {
        m = 1;
      } else {
        m = 0;
      }
      i = n;
      if (m != 0) {
        i = n - 10;
      }
    }
    if ((j >= 4) || ((k & 0x80) == 0)) {
      bool = false;
    }
    return new Id3Header(j, bool, i);
    label285:
    paramParsableByteArray = new StringBuilder();
    paramParsableByteArray.append("Skipped ID3 tag with unsupported majorVersion=");
    paramParsableByteArray.append(j);
    Log.w("Id3Decoder", paramParsableByteArray.toString());
    return null;
  }
  
  private static MlltFrame decodeMlltFrame(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    int i = paramParsableByteArray.readUnsignedShort();
    int j = paramParsableByteArray.readUnsignedInt24();
    int k = paramParsableByteArray.readUnsignedInt24();
    int m = paramParsableByteArray.readUnsignedByte();
    int n = paramParsableByteArray.readUnsignedByte();
    ParsableBitArray localParsableBitArray = new ParsableBitArray();
    localParsableBitArray.reset(paramParsableByteArray);
    int i1 = (paramInt - 10) * 8 / (m + n);
    paramParsableByteArray = new int[i1];
    int[] arrayOfInt = new int[i1];
    for (paramInt = 0; paramInt < i1; paramInt++)
    {
      int i2 = localParsableBitArray.readBits(m);
      int i3 = localParsableBitArray.readBits(n);
      paramParsableByteArray[paramInt] = i2;
      arrayOfInt[paramInt] = i3;
    }
    return new MlltFrame(i, j, k, paramParsableByteArray, arrayOfInt);
  }
  
  private static PrivFrame decodePrivFrame(ParsableByteArray paramParsableByteArray, int paramInt)
    throws UnsupportedEncodingException
  {
    byte[] arrayOfByte = new byte[paramInt];
    paramParsableByteArray.readBytes(arrayOfByte, 0, paramInt);
    int i = indexOfZeroByte(arrayOfByte, 0);
    return new PrivFrame(new String(arrayOfByte, 0, i, "ISO-8859-1"), copyOfRangeIfValid(arrayOfByte, i + 1, paramInt));
  }
  
  private static String decodeStringIfValid(byte[] paramArrayOfByte, int paramInt1, int paramInt2, String paramString)
    throws UnsupportedEncodingException
  {
    if ((paramInt2 > paramInt1) && (paramInt2 <= paramArrayOfByte.length)) {
      return new String(paramArrayOfByte, paramInt1, paramInt2 - paramInt1, paramString);
    }
    return "";
  }
  
  @Nullable
  private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray paramParsableByteArray, int paramInt, String paramString)
    throws UnsupportedEncodingException
  {
    if (paramInt < 1) {
      return null;
    }
    int i = paramParsableByteArray.readUnsignedByte();
    String str = getCharsetName(i);
    paramInt--;
    byte[] arrayOfByte = new byte[paramInt];
    paramParsableByteArray.readBytes(arrayOfByte, 0, paramInt);
    return new TextInformationFrame(paramString, null, new String(arrayOfByte, 0, indexOfEos(arrayOfByte, 0, i), str));
  }
  
  @Nullable
  private static TextInformationFrame decodeTxxxFrame(ParsableByteArray paramParsableByteArray, int paramInt)
    throws UnsupportedEncodingException
  {
    if (paramInt < 1) {
      return null;
    }
    int i = paramParsableByteArray.readUnsignedByte();
    String str = getCharsetName(i);
    paramInt--;
    byte[] arrayOfByte = new byte[paramInt];
    paramParsableByteArray.readBytes(arrayOfByte, 0, paramInt);
    paramInt = indexOfEos(arrayOfByte, 0, i);
    paramParsableByteArray = new String(arrayOfByte, 0, paramInt, str);
    paramInt += delimiterLength(i);
    return new TextInformationFrame("TXXX", paramParsableByteArray, decodeStringIfValid(arrayOfByte, paramInt, indexOfEos(arrayOfByte, paramInt, i), str));
  }
  
  private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray paramParsableByteArray, int paramInt, String paramString)
    throws UnsupportedEncodingException
  {
    byte[] arrayOfByte = new byte[paramInt];
    paramParsableByteArray.readBytes(arrayOfByte, 0, paramInt);
    return new UrlLinkFrame(paramString, null, new String(arrayOfByte, 0, indexOfZeroByte(arrayOfByte, 0), "ISO-8859-1"));
  }
  
  @Nullable
  private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray paramParsableByteArray, int paramInt)
    throws UnsupportedEncodingException
  {
    if (paramInt < 1) {
      return null;
    }
    int i = paramParsableByteArray.readUnsignedByte();
    String str = getCharsetName(i);
    paramInt--;
    byte[] arrayOfByte = new byte[paramInt];
    paramParsableByteArray.readBytes(arrayOfByte, 0, paramInt);
    paramInt = indexOfEos(arrayOfByte, 0, i);
    paramParsableByteArray = new String(arrayOfByte, 0, paramInt, str);
    paramInt += delimiterLength(i);
    return new UrlLinkFrame("WXXX", paramParsableByteArray, decodeStringIfValid(arrayOfByte, paramInt, indexOfZeroByte(arrayOfByte, paramInt), "ISO-8859-1"));
  }
  
  private static int delimiterLength(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 3)) {
      paramInt = 2;
    } else {
      paramInt = 1;
    }
    return paramInt;
  }
  
  private static String getCharsetName(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3) {
          return "ISO-8859-1";
        }
        return "UTF-8";
      }
      return "UTF-16BE";
    }
    return "UTF-16";
  }
  
  private static String getFrameId(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    String str;
    if (paramInt1 == 2) {
      str = String.format(Locale.US, "%c%c%c", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    } else {
      str = String.format(Locale.US, "%c%c%c%c", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
    }
    return str;
  }
  
  private static int indexOfEos(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = indexOfZeroByte(paramArrayOfByte, paramInt1);
    if (paramInt2 != 0)
    {
      paramInt1 = i;
      if (paramInt2 != 3)
      {
        while (paramInt1 < paramArrayOfByte.length - 1)
        {
          if ((paramInt1 % 2 == 0) && (paramArrayOfByte[(paramInt1 + 1)] == 0)) {
            return paramInt1;
          }
          paramInt1 = indexOfZeroByte(paramArrayOfByte, paramInt1 + 1);
        }
        return paramArrayOfByte.length;
      }
    }
    return i;
  }
  
  private static int indexOfZeroByte(byte[] paramArrayOfByte, int paramInt)
  {
    while (paramInt < paramArrayOfByte.length)
    {
      if (paramArrayOfByte[paramInt] == 0) {
        return paramInt;
      }
      paramInt++;
    }
    return paramArrayOfByte.length;
  }
  
  private static int removeUnsynchronization(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    byte[] arrayOfByte = data;
    int i = paramParsableByteArray.getPosition();
    for (;;)
    {
      int j = i + 1;
      if (j >= paramInt) {
        break;
      }
      int k = paramInt;
      if ((arrayOfByte[i] & 0xFF) == 255)
      {
        k = paramInt;
        if (arrayOfByte[j] == 0)
        {
          System.arraycopy(arrayOfByte, i + 2, arrayOfByte, j, paramInt - i - 2);
          k = paramInt - 1;
        }
      }
      i = j;
      paramInt = k;
    }
    return paramInt;
  }
  
  private static boolean validateFrames(ParsableByteArray paramParsableByteArray, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = paramParsableByteArray.getPosition();
    try
    {
      for (;;)
      {
        int j = paramParsableByteArray.bytesLeft();
        int k = 1;
        if (j < paramInt2) {
          break;
        }
        long l1;
        if (paramInt1 >= 3)
        {
          j = paramParsableByteArray.readInt();
          l1 = paramParsableByteArray.readUnsignedInt();
          m = paramParsableByteArray.readUnsignedShort();
        }
        else
        {
          j = paramParsableByteArray.readUnsignedInt24();
          n = paramParsableByteArray.readUnsignedInt24();
          l1 = n;
          m = 0;
        }
        if ((j == 0) && (l1 == 0L) && (m == 0)) {
          return true;
        }
        long l2 = l1;
        if (paramInt1 == 4)
        {
          l2 = l1;
          if (!paramBoolean)
          {
            if ((0x808080 & l1) != 0L) {
              return false;
            }
            l2 = (l1 >> 24 & 0xFF) << 21 | l1 & 0xFF | (l1 >> 8 & 0xFF) << 7 | (l1 >> 16 & 0xFF) << 14;
          }
        }
        if (paramInt1 == 4)
        {
          if ((m & 0x40) != 0) {
            j = 1;
          } else {
            j = 0;
          }
          n = j;
          if ((m & 0x1) != 0)
          {
            n = k;
            break label278;
          }
        }
        do
        {
          m = 0;
          j = n;
          n = m;
          break label278;
          if (paramInt1 != 3) {
            break;
          }
          if ((m & 0x20) != 0) {
            j = 1;
          } else {
            j = 0;
          }
          n = j;
        } while ((m & 0x80) == 0);
        int n = k;
        break label278;
        j = 0;
        n = j;
        label278:
        int m = j;
        if (n != 0) {
          m = j + 4;
        }
        if (l2 < m) {
          return false;
        }
        j = paramParsableByteArray.bytesLeft();
        if (j < l2) {
          return false;
        }
        j = (int)l2;
        paramParsableByteArray.skipBytes(j);
      }
      return true;
    }
    finally
    {
      paramParsableByteArray.setPosition(i);
    }
  }
  
  @Nullable
  public Metadata decode(MetadataInputBuffer paramMetadataInputBuffer)
  {
    paramMetadataInputBuffer = data;
    return decode(paramMetadataInputBuffer.array(), paramMetadataInputBuffer.limit());
  }
  
  @Nullable
  public Metadata decode(byte[] paramArrayOfByte, int paramInt)
  {
    Object localObject = new ArrayList();
    ParsableByteArray localParsableByteArray = new ParsableByteArray(paramArrayOfByte, paramInt);
    paramArrayOfByte = decodeHeader(localParsableByteArray);
    if (paramArrayOfByte == null) {
      return null;
    }
    int i = localParsableByteArray.getPosition();
    if (Id3Header.access$000(paramArrayOfByte) == 2) {
      paramInt = 6;
    } else {
      paramInt = 10;
    }
    int j = Id3Header.access$100(paramArrayOfByte);
    if (Id3Header.access$200(paramArrayOfByte)) {
      j = removeUnsynchronization(localParsableByteArray, Id3Header.access$100(paramArrayOfByte));
    }
    localParsableByteArray.setLimit(i + j);
    j = Id3Header.access$000(paramArrayOfByte);
    boolean bool = false;
    if (!validateFrames(localParsableByteArray, j, paramInt, false)) {
      if ((Id3Header.access$000(paramArrayOfByte) == 4) && (validateFrames(localParsableByteArray, 4, paramInt, true)))
      {
        bool = true;
      }
      else
      {
        localObject = z2.t("Failed to validate ID3 tag with majorVersion=");
        ((StringBuilder)localObject).append(Id3Header.access$000(paramArrayOfByte));
        Log.w("Id3Decoder", ((StringBuilder)localObject).toString());
        return null;
      }
    }
    while (localParsableByteArray.bytesLeft() >= paramInt)
    {
      Id3Frame localId3Frame = decodeFrame(Id3Header.access$000(paramArrayOfByte), localParsableByteArray, bool, paramInt, framePredicate);
      if (localId3Frame != null) {
        ((ArrayList)localObject).add(localId3Frame);
      }
    }
    return new Metadata((List)localObject);
  }
  
  public static abstract interface FramePredicate
  {
    public abstract boolean evaluate(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  }
  
  public static final class Id3Header
  {
    private final int framesSize;
    private final boolean isUnsynchronized;
    private final int majorVersion;
    
    public Id3Header(int paramInt1, boolean paramBoolean, int paramInt2)
    {
      majorVersion = paramInt1;
      isUnsynchronized = paramBoolean;
      framesSize = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.Id3Decoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */