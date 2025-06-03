package com.google.android.exoplayer2.extractor.mkv;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput.CryptoData;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.HevcConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import z2;

final class MatroskaExtractor$Track
{
  private static final int DEFAULT_MAX_CLL = 1000;
  private static final int DEFAULT_MAX_FALL = 200;
  private static final int DISPLAY_UNIT_PIXELS = 0;
  private static final int MAX_CHROMATICITY = 50000;
  public int audioBitDepth = -1;
  public int channelCount = 1;
  public long codecDelayNs = 0L;
  public String codecId;
  public byte[] codecPrivate;
  public int colorRange = -1;
  public int colorSpace = -1;
  public int colorTransfer = -1;
  public TrackOutput.CryptoData cryptoData;
  public int defaultSampleDurationNs;
  public int displayHeight = -1;
  public int displayUnit = 0;
  public int displayWidth = -1;
  public DrmInitData drmInitData;
  public boolean flagDefault = true;
  public boolean flagForced;
  public boolean hasColorInfo = false;
  public boolean hasContentEncryption;
  public int height = -1;
  private String language = "eng";
  public int maxContentLuminance = 1000;
  public int maxFrameAverageLuminance = 200;
  public float maxMasteringLuminance = -1.0F;
  public float minMasteringLuminance = -1.0F;
  public int nalUnitLengthFieldLength;
  public String name;
  public int number;
  public TrackOutput output;
  public float primaryBChromaticityX = -1.0F;
  public float primaryBChromaticityY = -1.0F;
  public float primaryGChromaticityX = -1.0F;
  public float primaryGChromaticityY = -1.0F;
  public float primaryRChromaticityX = -1.0F;
  public float primaryRChromaticityY = -1.0F;
  public byte[] projectionData = null;
  public int sampleRate = 8000;
  public byte[] sampleStrippedBytes;
  public long seekPreRollNs = 0L;
  public int stereoMode = -1;
  @Nullable
  public MatroskaExtractor.TrueHdSampleRechunker trueHdSampleRechunker;
  public int type;
  public float whitePointChromaticityX = -1.0F;
  public float whitePointChromaticityY = -1.0F;
  public int width = -1;
  
  private byte[] getHdrStaticInfo()
  {
    if ((primaryRChromaticityX != -1.0F) && (primaryRChromaticityY != -1.0F) && (primaryGChromaticityX != -1.0F) && (primaryGChromaticityY != -1.0F) && (primaryBChromaticityX != -1.0F) && (primaryBChromaticityY != -1.0F) && (whitePointChromaticityX != -1.0F) && (whitePointChromaticityY != -1.0F) && (maxMasteringLuminance != -1.0F) && (minMasteringLuminance != -1.0F))
    {
      byte[] arrayOfByte = new byte[25];
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      localByteBuffer.put((byte)0);
      localByteBuffer.putShort((short)(int)(primaryRChromaticityX * 50000.0F + 0.5F));
      localByteBuffer.putShort((short)(int)(primaryRChromaticityY * 50000.0F + 0.5F));
      localByteBuffer.putShort((short)(int)(primaryGChromaticityX * 50000.0F + 0.5F));
      localByteBuffer.putShort((short)(int)(primaryGChromaticityY * 50000.0F + 0.5F));
      localByteBuffer.putShort((short)(int)(primaryBChromaticityX * 50000.0F + 0.5F));
      localByteBuffer.putShort((short)(int)(primaryBChromaticityY * 50000.0F + 0.5F));
      localByteBuffer.putShort((short)(int)(whitePointChromaticityX * 50000.0F + 0.5F));
      localByteBuffer.putShort((short)(int)(whitePointChromaticityY * 50000.0F + 0.5F));
      localByteBuffer.putShort((short)(int)(maxMasteringLuminance + 0.5F));
      localByteBuffer.putShort((short)(int)(minMasteringLuminance + 0.5F));
      localByteBuffer.putShort((short)maxContentLuminance);
      localByteBuffer.putShort((short)maxFrameAverageLuminance);
      return arrayOfByte;
    }
    return null;
  }
  
  private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray paramParsableByteArray)
    throws ParserException
  {
    try
    {
      paramParsableByteArray.skipBytes(16);
      long l = paramParsableByteArray.readLittleEndianUnsignedInt();
      if (l == 1482049860L) {
        return new Pair("video/3gpp", null);
      }
      if (l == 826496599L)
      {
        int i = paramParsableByteArray.getPosition() + 20;
        paramParsableByteArray = data;
        while (i < paramParsableByteArray.length - 4)
        {
          if ((paramParsableByteArray[i] == 0) && (paramParsableByteArray[(i + 1)] == 0) && (paramParsableByteArray[(i + 2)] == 1) && (paramParsableByteArray[(i + 3)] == 15)) {
            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(paramParsableByteArray, i, paramParsableByteArray.length)));
          }
          i++;
        }
        paramParsableByteArray = new com/google/android/exoplayer2/ParserException;
        paramParsableByteArray.<init>("Failed to find FourCC VC1 initialization data");
        throw paramParsableByteArray;
      }
      Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
      return new Pair("video/x-unknown", null);
    }
    catch (ArrayIndexOutOfBoundsException paramParsableByteArray)
    {
      throw new ParserException("Error parsing FourCC private data");
    }
  }
  
  private static boolean parseMsAcmCodecPrivate(ParsableByteArray paramParsableByteArray)
    throws ParserException
  {
    try
    {
      int i = paramParsableByteArray.readLittleEndianUnsignedShort();
      boolean bool = true;
      if (i == 1) {
        return true;
      }
      if (i == 65534)
      {
        paramParsableByteArray.setPosition(24);
        if (paramParsableByteArray.readLong() == MatroskaExtractor.access$400().getMostSignificantBits())
        {
          long l1 = paramParsableByteArray.readLong();
          long l2 = MatroskaExtractor.access$400().getLeastSignificantBits();
          if (l1 == l2) {}
        }
        else
        {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    catch (ArrayIndexOutOfBoundsException paramParsableByteArray)
    {
      throw new ParserException("Error parsing MS/ACM codec private");
    }
  }
  
  private static List<byte[]> parseVorbisCodecPrivate(byte[] paramArrayOfByte)
    throws ParserException
  {
    int i;
    int j;
    int k;
    int m;
    if (paramArrayOfByte[0] == 2)
    {
      i = 0;
      for (j = 1;; j++)
      {
        k = paramArrayOfByte[j];
        if (k != -1) {
          break;
        }
        i += 255;
      }
      j++;
      k = i + k;
      i = 0;
      for (;;)
      {
        m = paramArrayOfByte[j];
        if (m != -1) {
          break;
        }
        i += 255;
        j++;
      }
      j++;
      if (paramArrayOfByte[j] != 1) {}
    }
    try
    {
      byte[] arrayOfByte1 = new byte[k];
      System.arraycopy(paramArrayOfByte, j, arrayOfByte1, 0, k);
      j += k;
      if (paramArrayOfByte[j] == 3)
      {
        i = j + (i + m);
        if (paramArrayOfByte[i] == 5)
        {
          byte[] arrayOfByte2 = new byte[paramArrayOfByte.length - i];
          System.arraycopy(paramArrayOfByte, i, arrayOfByte2, 0, paramArrayOfByte.length - i);
          paramArrayOfByte = new java/util/ArrayList;
          paramArrayOfByte.<init>(2);
          paramArrayOfByte.add(arrayOfByte1);
          paramArrayOfByte.add(arrayOfByte2);
          return paramArrayOfByte;
        }
        paramArrayOfByte = new com/google/android/exoplayer2/ParserException;
        paramArrayOfByte.<init>("Error parsing vorbis codec private");
        throw paramArrayOfByte;
      }
      paramArrayOfByte = new com/google/android/exoplayer2/ParserException;
      paramArrayOfByte.<init>("Error parsing vorbis codec private");
      throw paramArrayOfByte;
    }
    catch (ArrayIndexOutOfBoundsException paramArrayOfByte)
    {
      throw new ParserException("Error parsing vorbis codec private");
    }
    paramArrayOfByte = new com/google/android/exoplayer2/ParserException;
    paramArrayOfByte.<init>("Error parsing vorbis codec private");
    throw paramArrayOfByte;
    paramArrayOfByte = new com/google/android/exoplayer2/ParserException;
    paramArrayOfByte.<init>("Error parsing vorbis codec private");
    throw paramArrayOfByte;
  }
  
  public void initializeOutput(ExtractorOutput paramExtractorOutput, int paramInt)
    throws ParserException
  {
    Object localObject1 = codecId;
    localObject1.getClass();
    int i = ((String)localObject1).hashCode();
    int j = 0;
    switch (i)
    {
    default: 
      break;
    case 1951062397: 
      if (((String)localObject1).equals("A_OPUS")) {
        i = 28;
      }
      break;
    case 1950789798: 
      if (((String)localObject1).equals("A_FLAC")) {
        i = 27;
      }
      break;
    case 1950749482: 
      if (((String)localObject1).equals("A_EAC3")) {
        i = 26;
      }
      break;
    case 1809237540: 
      if (((String)localObject1).equals("V_MPEG2")) {
        i = 25;
      }
      break;
    case 1422270023: 
      if (((String)localObject1).equals("S_TEXT/UTF8")) {
        i = 24;
      }
      break;
    case 855502857: 
      if (((String)localObject1).equals("V_MPEGH/ISO/HEVC")) {
        i = 23;
      }
      break;
    case 738597099: 
      if (((String)localObject1).equals("S_TEXT/ASS")) {
        i = 22;
      }
      break;
    case 725957860: 
      if (((String)localObject1).equals("A_PCM/INT/LIT")) {
        i = 21;
      }
      break;
    case 542569478: 
      if (((String)localObject1).equals("A_DTS/EXPRESS")) {
        i = 20;
      }
      break;
    case 444813526: 
      if (((String)localObject1).equals("V_THEORA")) {
        i = 19;
      }
      break;
    case 99146302: 
      if (((String)localObject1).equals("S_HDMV/PGS")) {
        i = 18;
      }
      break;
    case 82338134: 
      if (((String)localObject1).equals("V_VP9")) {
        i = 17;
      }
      break;
    case 82338133: 
      if (((String)localObject1).equals("V_VP8")) {
        i = 16;
      }
      break;
    case 62927045: 
      if (((String)localObject1).equals("A_DTS")) {
        i = 15;
      }
      break;
    case 62923603: 
      if (((String)localObject1).equals("A_AC3")) {
        i = 14;
      }
      break;
    case 62923557: 
      if (((String)localObject1).equals("A_AAC")) {
        i = 13;
      }
      break;
    case -356037306: 
      if (((String)localObject1).equals("A_DTS/LOSSLESS")) {
        i = 12;
      }
      break;
    case -425012669: 
      if (((String)localObject1).equals("S_VOBSUB")) {
        i = 11;
      }
      break;
    case -538363109: 
      if (((String)localObject1).equals("V_MPEG4/ISO/AVC")) {
        i = 10;
      }
      break;
    case -538363189: 
      if (((String)localObject1).equals("V_MPEG4/ISO/ASP")) {
        i = 9;
      }
      break;
    case -933872740: 
      if (((String)localObject1).equals("S_DVBSUB")) {
        i = 8;
      }
      break;
    case -1373388978: 
      if (((String)localObject1).equals("V_MS/VFW/FOURCC")) {
        i = 7;
      }
      break;
    case -1482641357: 
      if (((String)localObject1).equals("A_MPEG/L3")) {
        i = 6;
      }
      break;
    case -1482641358: 
      if (((String)localObject1).equals("A_MPEG/L2")) {
        i = 5;
      }
      break;
    case -1730367663: 
      if (((String)localObject1).equals("A_VORBIS")) {
        i = 4;
      }
      break;
    case -1784763192: 
      if (((String)localObject1).equals("A_TRUEHD")) {
        i = 3;
      }
      break;
    case -1985379776: 
      if (((String)localObject1).equals("A_MS/ACM")) {
        i = 2;
      }
      break;
    case -2095575984: 
      if (((String)localObject1).equals("V_MPEG4/ISO/SP")) {
        i = 1;
      }
      break;
    case -2095576542: 
      if (((String)localObject1).equals("V_MPEG4/ISO/AP")) {
        i = 0;
      }
      break;
    }
    i = -1;
    Object localObject2 = "audio/raw";
    localObject1 = "audio/x-unknown";
    int m;
    switch (i)
    {
    default: 
      throw new ParserException("Unrecognized codec identifier.");
    case 28: 
      localObject1 = new ArrayList(3);
      ((ArrayList)localObject1).add(codecPrivate);
      ((ArrayList)localObject1).add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(codecDelayNs).array());
      ((ArrayList)localObject1).add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(seekPreRollNs).array());
      i = 5760;
      localObject2 = "audio/opus";
      break;
    case 27: 
      localObject1 = Collections.singletonList(codecPrivate);
      localObject2 = "audio/flac";
      break;
    case 26: 
      localObject1 = "audio/eac3";
      break;
    case 25: 
      localObject1 = "video/mpeg2";
      break;
    case 24: 
      localObject1 = "application/x-subrip";
      break;
    case 23: 
      localObject2 = HevcConfig.parse(new ParsableByteArray(codecPrivate));
      localObject1 = initializationData;
      nalUnitLengthFieldLength = nalUnitLengthFieldLength;
      localObject2 = "video/hevc";
      break;
    case 22: 
      localObject1 = "text/x-ssa";
      break;
    case 21: 
      i = Util.getPcmEncoding(audioBitDepth);
      if (i == 0)
      {
        localObject2 = z2.t("Unsupported PCM bit depth: ");
        ((StringBuilder)localObject2).append(audioBitDepth);
        ((StringBuilder)localObject2).append(". Setting mimeType to ");
        ((StringBuilder)localObject2).append("audio/x-unknown");
        Log.w("MatroskaExtractor", ((StringBuilder)localObject2).toString());
      }
      break;
    case 19: 
      localObject1 = "video/x-unknown";
      break;
    case 18: 
      localObject1 = "application/pgs";
      break;
    case 17: 
      localObject1 = "video/x-vnd.on2.vp9";
      break;
    case 16: 
      localObject1 = "video/x-vnd.on2.vp8";
      break;
    case 15: 
    case 20: 
      localObject1 = "audio/vnd.dts";
      break;
    case 14: 
      localObject1 = "audio/ac3";
      break;
    case 13: 
      localObject1 = Collections.singletonList(codecPrivate);
    case 12: 
    case 11: 
    case 10: 
      for (localObject2 = "audio/mp4a-latm";; localObject2 = "video/avc")
      {
        break label1627;
        localObject1 = "audio/vnd.dts.hd";
        break;
        localObject1 = Collections.singletonList(codecPrivate);
        localObject2 = "application/vobsub";
        break label1627;
        localObject2 = AvcConfig.parse(new ParsableByteArray(codecPrivate));
        localObject1 = initializationData;
        nalUnitLengthFieldLength = nalUnitLengthFieldLength;
      }
    case 8: 
      localObject1 = codecPrivate;
      localObject1 = Collections.singletonList(new byte[] { localObject1[0], localObject1[1], localObject1[2], localObject1[3] });
      localObject2 = "application/dvbsubs";
      break;
    case 7: 
      localObject1 = parseFourCcPrivate(new ParsableByteArray(codecPrivate));
      localObject2 = (String)first;
      localObject1 = (List)second;
      break;
    case 6: 
      localObject2 = "audio/mpeg";
      break;
    case 5: 
      localObject2 = "audio/mpeg-L2";
      localObject1 = null;
      i = 4096;
      break;
    case 4: 
      localObject1 = parseVorbisCodecPrivate(codecPrivate);
      localObject2 = "audio/vorbis";
      i = 8192;
      k = -1;
      m = i;
      i = k;
    }
    for (;;)
    {
      break;
      trueHdSampleRechunker = new MatroskaExtractor.TrueHdSampleRechunker();
      localObject1 = "audio/true-hd";
      break label1595;
      if (parseMsAcmCodecPrivate(new ParsableByteArray(codecPrivate)))
      {
        m = Util.getPcmEncoding(audioBitDepth);
        i = m;
        if (m == 0)
        {
          localObject2 = z2.t("Unsupported PCM bit depth: ");
          ((StringBuilder)localObject2).append(audioBitDepth);
          ((StringBuilder)localObject2).append(". Setting mimeType to ");
          ((StringBuilder)localObject2).append("audio/x-unknown");
          Log.w("MatroskaExtractor", ((StringBuilder)localObject2).toString());
        }
        else
        {
          localObject1 = null;
          break label1630;
        }
      }
      else
      {
        Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
      }
      label1595:
      localObject2 = localObject1;
      localObject1 = null;
      break label1627;
      localObject1 = codecPrivate;
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = Collections.singletonList(localObject1);
      }
      localObject2 = "video/mp4v-es";
      label1627:
      i = -1;
      label1630:
      m = -1;
    }
    boolean bool = flagDefault;
    if (flagForced) {
      k = 2;
    } else {
      k = 0;
    }
    int k = bool | false | k;
    if (MimeTypes.isAudio((String)localObject2))
    {
      localObject1 = Format.createAudioSampleFormat(Integer.toString(paramInt), (String)localObject2, null, -1, m, channelCount, sampleRate, i, (List)localObject1, drmInitData, k, language);
      paramInt = 1;
    }
    else if (MimeTypes.isVideo((String)localObject2))
    {
      if (displayUnit == 0)
      {
        k = displayWidth;
        i = k;
        if (k == -1) {
          i = width;
        }
        displayWidth = i;
        k = displayHeight;
        i = k;
        if (k == -1) {
          i = height;
        }
        displayHeight = i;
      }
      float f1 = -1.0F;
      k = displayWidth;
      float f2 = f1;
      if (k != -1)
      {
        i = displayHeight;
        f2 = f1;
        if (i != -1) {
          f2 = height * k / (width * i);
        }
      }
      Object localObject3;
      if (hasColorInfo)
      {
        localObject3 = getHdrStaticInfo();
        localObject3 = new ColorInfo(colorSpace, colorRange, colorTransfer, (byte[])localObject3);
      }
      else
      {
        localObject3 = null;
      }
      if ("htc_video_rotA-000".equals(name))
      {
        i = j;
      }
      else if ("htc_video_rotA-090".equals(name))
      {
        i = 90;
      }
      else if ("htc_video_rotA-180".equals(name))
      {
        i = 180;
      }
      else
      {
        if (!"htc_video_rotA-270".equals(name)) {
          break label1968;
        }
        i = 270;
      }
      break label1971;
      label1968:
      i = -1;
      label1971:
      localObject1 = Format.createVideoSampleFormat(Integer.toString(paramInt), (String)localObject2, null, -1, m, width, height, -1.0F, (List)localObject1, i, f2, projectionData, stereoMode, (ColorInfo)localObject3, drmInitData);
      paramInt = 2;
    }
    else
    {
      if ("application/x-subrip".equals(localObject2))
      {
        localObject1 = Format.createTextSampleFormat(Integer.toString(paramInt), (String)localObject2, k, language, drmInitData);
      }
      else if ("text/x-ssa".equals(localObject2))
      {
        localObject1 = new ArrayList(2);
        ((ArrayList)localObject1).add(MatroskaExtractor.access$300());
        ((ArrayList)localObject1).add(codecPrivate);
        localObject1 = Format.createTextSampleFormat(Integer.toString(paramInt), (String)localObject2, null, -1, k, language, -1, drmInitData, Long.MAX_VALUE, (List)localObject1);
      }
      else
      {
        if ((!"application/vobsub".equals(localObject2)) && (!"application/pgs".equals(localObject2)) && (!"application/dvbsubs".equals(localObject2))) {
          throw new ParserException("Unexpected MIME type.");
        }
        localObject1 = Format.createImageSampleFormat(Integer.toString(paramInt), (String)localObject2, null, -1, k, (List)localObject1, language, drmInitData);
      }
      paramInt = 3;
    }
    paramExtractorOutput = paramExtractorOutput.track(number, paramInt);
    output = paramExtractorOutput;
    paramExtractorOutput.format((Format)localObject1);
  }
  
  public void outputPendingSampleMetadata()
  {
    MatroskaExtractor.TrueHdSampleRechunker localTrueHdSampleRechunker = trueHdSampleRechunker;
    if (localTrueHdSampleRechunker != null) {
      localTrueHdSampleRechunker.outputPendingSampleMetadata(this);
    }
  }
  
  public void reset()
  {
    MatroskaExtractor.TrueHdSampleRechunker localTrueHdSampleRechunker = trueHdSampleRechunker;
    if (localTrueHdSampleRechunker != null) {
      localTrueHdSampleRechunker.reset();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */