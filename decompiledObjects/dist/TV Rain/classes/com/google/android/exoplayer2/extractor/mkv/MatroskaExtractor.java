package com.google.android.exoplayer2.extractor.mkv;

import a;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.Unseekable;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput.CryptoData;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.HevcConfig;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import z2;
import z3;

public final class MatroskaExtractor
  implements Extractor
{
  private static final int BLOCK_STATE_DATA = 2;
  private static final int BLOCK_STATE_HEADER = 1;
  private static final int BLOCK_STATE_START = 0;
  private static final String CODEC_ID_AAC = "A_AAC";
  private static final String CODEC_ID_AC3 = "A_AC3";
  private static final String CODEC_ID_ACM = "A_MS/ACM";
  private static final String CODEC_ID_ASS = "S_TEXT/ASS";
  private static final String CODEC_ID_DTS = "A_DTS";
  private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
  private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
  private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
  private static final String CODEC_ID_E_AC3 = "A_EAC3";
  private static final String CODEC_ID_FLAC = "A_FLAC";
  private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
  private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
  private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
  private static final String CODEC_ID_MP2 = "A_MPEG/L2";
  private static final String CODEC_ID_MP3 = "A_MPEG/L3";
  private static final String CODEC_ID_MPEG2 = "V_MPEG2";
  private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
  private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
  private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
  private static final String CODEC_ID_OPUS = "A_OPUS";
  private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
  private static final String CODEC_ID_PGS = "S_HDMV/PGS";
  private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
  private static final String CODEC_ID_THEORA = "V_THEORA";
  private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
  private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
  private static final String CODEC_ID_VORBIS = "A_VORBIS";
  private static final String CODEC_ID_VP8 = "V_VP8";
  private static final String CODEC_ID_VP9 = "V_VP9";
  private static final String DOC_TYPE_MATROSKA = "matroska";
  private static final String DOC_TYPE_WEBM = "webm";
  private static final int ENCRYPTION_IV_SIZE = 8;
  public static final ExtractorsFactory FACTORY = new z3(14);
  public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
  private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
  private static final int FOURCC_COMPRESSION_VC1 = 826496599;
  private static final int ID_AUDIO = 225;
  private static final int ID_AUDIO_BIT_DEPTH = 25188;
  private static final int ID_BLOCK = 161;
  private static final int ID_BLOCK_DURATION = 155;
  private static final int ID_BLOCK_GROUP = 160;
  private static final int ID_CHANNELS = 159;
  private static final int ID_CLUSTER = 524531317;
  private static final int ID_CODEC_DELAY = 22186;
  private static final int ID_CODEC_ID = 134;
  private static final int ID_CODEC_PRIVATE = 25506;
  private static final int ID_COLOUR = 21936;
  private static final int ID_COLOUR_PRIMARIES = 21947;
  private static final int ID_COLOUR_RANGE = 21945;
  private static final int ID_COLOUR_TRANSFER = 21946;
  private static final int ID_CONTENT_COMPRESSION = 20532;
  private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
  private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
  private static final int ID_CONTENT_ENCODING = 25152;
  private static final int ID_CONTENT_ENCODINGS = 28032;
  private static final int ID_CONTENT_ENCODING_ORDER = 20529;
  private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
  private static final int ID_CONTENT_ENCRYPTION = 20533;
  private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
  private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
  private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
  private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
  private static final int ID_CUES = 475249515;
  private static final int ID_CUE_CLUSTER_POSITION = 241;
  private static final int ID_CUE_POINT = 187;
  private static final int ID_CUE_TIME = 179;
  private static final int ID_CUE_TRACK_POSITIONS = 183;
  private static final int ID_DEFAULT_DURATION = 2352003;
  private static final int ID_DISPLAY_HEIGHT = 21690;
  private static final int ID_DISPLAY_UNIT = 21682;
  private static final int ID_DISPLAY_WIDTH = 21680;
  private static final int ID_DOC_TYPE = 17026;
  private static final int ID_DOC_TYPE_READ_VERSION = 17029;
  private static final int ID_DURATION = 17545;
  private static final int ID_EBML = 440786851;
  private static final int ID_EBML_READ_VERSION = 17143;
  private static final int ID_FLAG_DEFAULT = 136;
  private static final int ID_FLAG_FORCED = 21930;
  private static final int ID_INFO = 357149030;
  private static final int ID_LANGUAGE = 2274716;
  private static final int ID_LUMNINANCE_MAX = 21977;
  private static final int ID_LUMNINANCE_MIN = 21978;
  private static final int ID_MASTERING_METADATA = 21968;
  private static final int ID_MAX_CLL = 21948;
  private static final int ID_MAX_FALL = 21949;
  private static final int ID_NAME = 21358;
  private static final int ID_PIXEL_HEIGHT = 186;
  private static final int ID_PIXEL_WIDTH = 176;
  private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
  private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
  private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
  private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
  private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
  private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
  private static final int ID_PROJECTION = 30320;
  private static final int ID_PROJECTION_PRIVATE = 30322;
  private static final int ID_REFERENCE_BLOCK = 251;
  private static final int ID_SAMPLING_FREQUENCY = 181;
  private static final int ID_SEEK = 19899;
  private static final int ID_SEEK_HEAD = 290298740;
  private static final int ID_SEEK_ID = 21419;
  private static final int ID_SEEK_POSITION = 21420;
  private static final int ID_SEEK_PRE_ROLL = 22203;
  private static final int ID_SEGMENT = 408125543;
  private static final int ID_SEGMENT_INFO = 357149030;
  private static final int ID_SIMPLE_BLOCK = 163;
  private static final int ID_STEREO_MODE = 21432;
  private static final int ID_TIMECODE_SCALE = 2807729;
  private static final int ID_TIME_CODE = 231;
  private static final int ID_TRACKS = 374648427;
  private static final int ID_TRACK_ENTRY = 174;
  private static final int ID_TRACK_NUMBER = 215;
  private static final int ID_TRACK_TYPE = 131;
  private static final int ID_VIDEO = 224;
  private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
  private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
  private static final int LACING_EBML = 3;
  private static final int LACING_FIXED_SIZE = 2;
  private static final int LACING_NONE = 0;
  private static final int LACING_XIPH = 1;
  private static final int OPUS_MAX_INPUT_SIZE = 5760;
  private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
  private static final byte[] SSA_PREFIX = { 68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44 };
  private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
  private static final byte[] SSA_TIMECODE_EMPTY = { 32, 32, 32, 32, 32, 32, 32, 32, 32, 32 };
  private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
  private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000L;
  private static final byte[] SUBRIP_PREFIX = { 49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10 };
  private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
  private static final byte[] SUBRIP_TIMECODE_EMPTY = { 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32 };
  private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
  private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000L;
  private static final String TAG = "MatroskaExtractor";
  private static final int TRACK_TYPE_AUDIO = 2;
  private static final int UNSET_ENTRY_ID = -1;
  private static final int VORBIS_MAX_INPUT_SIZE = 8192;
  private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
  private static final int WAVE_FORMAT_PCM = 1;
  private static final int WAVE_FORMAT_SIZE = 18;
  private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);
  private long blockDurationUs;
  private int blockFlags;
  private int blockLacingSampleCount;
  private int blockLacingSampleIndex;
  private int[] blockLacingSampleSizes;
  private int blockState;
  private long blockTimeUs;
  private int blockTrackNumber;
  private int blockTrackNumberLength;
  private long clusterTimecodeUs = -9223372036854775807L;
  private LongArray cueClusterPositions;
  private LongArray cueTimesUs;
  private long cuesContentPosition = -1L;
  private Track currentTrack;
  private long durationTimecode = -9223372036854775807L;
  private long durationUs = -9223372036854775807L;
  private final ParsableByteArray encryptionInitializationVector;
  private final ParsableByteArray encryptionSubsampleData;
  private ByteBuffer encryptionSubsampleDataBuffer;
  private ExtractorOutput extractorOutput;
  private final ParsableByteArray nalLength;
  private final ParsableByteArray nalStartCode;
  private final EbmlReader reader;
  private int sampleBytesRead;
  private int sampleBytesWritten;
  private int sampleCurrentNalBytesRemaining;
  private boolean sampleEncodingHandled;
  private boolean sampleInitializationVectorRead;
  private int samplePartitionCount;
  private boolean samplePartitionCountRead;
  private boolean sampleRead;
  private boolean sampleSeenReferenceBlock;
  private byte sampleSignalByte;
  private boolean sampleSignalByteRead;
  private final ParsableByteArray sampleStrippedBytes;
  private final ParsableByteArray scratch;
  private int seekEntryId;
  private final ParsableByteArray seekEntryIdBytes;
  private long seekEntryPosition;
  private boolean seekForCues;
  private final boolean seekForCuesEnabled;
  private long seekPositionAfterBuildingCues = -1L;
  private boolean seenClusterPositionForCurrentCuePoint;
  private long segmentContentPosition = -1L;
  private long segmentContentSize;
  private boolean sentSeekMap;
  private final ParsableByteArray subtitleSample;
  private long timecodeScale = -9223372036854775807L;
  private final SparseArray<Track> tracks;
  private final VarintReader varintReader;
  private final ParsableByteArray vorbisNumPageSamples;
  
  public MatroskaExtractor()
  {
    this(0);
  }
  
  public MatroskaExtractor(int paramInt)
  {
    this(new DefaultEbmlReader(), paramInt);
  }
  
  public MatroskaExtractor(EbmlReader paramEbmlReader, int paramInt)
  {
    reader = paramEbmlReader;
    paramEbmlReader.init(new InnerEbmlReaderOutput(null));
    boolean bool = true;
    if ((paramInt & 0x1) != 0) {
      bool = false;
    }
    seekForCuesEnabled = bool;
    varintReader = new VarintReader();
    tracks = new SparseArray();
    scratch = new ParsableByteArray(4);
    vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
    seekEntryIdBytes = new ParsableByteArray(4);
    nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
    nalLength = new ParsableByteArray(4);
    sampleStrippedBytes = new ParsableByteArray();
    subtitleSample = new ParsableByteArray();
    encryptionInitializationVector = new ParsableByteArray(8);
    encryptionSubsampleData = new ParsableByteArray();
  }
  
  private SeekMap buildSeekMap()
  {
    if ((segmentContentPosition != -1L) && (durationUs != -9223372036854775807L))
    {
      Object localObject = cueTimesUs;
      if ((localObject != null) && (((LongArray)localObject).size() != 0))
      {
        localObject = cueClusterPositions;
        if ((localObject != null) && (((LongArray)localObject).size() == cueTimesUs.size()))
        {
          int i = cueTimesUs.size();
          int[] arrayOfInt = new int[i];
          long[] arrayOfLong1 = new long[i];
          localObject = new long[i];
          long[] arrayOfLong2 = new long[i];
          int j = 0;
          int m;
          for (int k = 0;; k++)
          {
            m = j;
            if (k >= i) {
              break;
            }
            arrayOfLong2[k] = cueTimesUs.get(k);
            long l = segmentContentPosition;
            arrayOfLong1[k] = (cueClusterPositions.get(k) + l);
          }
          for (;;)
          {
            k = i - 1;
            if (m >= k) {
              break;
            }
            k = m + 1;
            arrayOfInt[m] = ((int)(arrayOfLong1[k] - arrayOfLong1[m]));
            arrayOfLong2[k] -= arrayOfLong2[m];
            m = k;
          }
          arrayOfInt[k] = ((int)(segmentContentPosition + segmentContentSize - arrayOfLong1[k]));
          localObject[k] = (durationUs - arrayOfLong2[k]);
          cueTimesUs = null;
          cueClusterPositions = null;
          return new ChunkIndex(arrayOfInt, arrayOfLong1, (long[])localObject, arrayOfLong2);
        }
      }
    }
    cueTimesUs = null;
    cueClusterPositions = null;
    return new SeekMap.Unseekable(durationUs);
  }
  
  private void commitSampleToOutput(Track paramTrack, long paramLong)
  {
    TrueHdSampleRechunker localTrueHdSampleRechunker = trueHdSampleRechunker;
    if (localTrueHdSampleRechunker != null)
    {
      localTrueHdSampleRechunker.sampleMetadata(paramTrack, paramLong);
    }
    else
    {
      if ("S_TEXT/UTF8".equals(codecId)) {
        commitSubtitleSample(paramTrack, "%02d:%02d:%02d,%03d", 19, 1000L, SUBRIP_TIMECODE_EMPTY);
      } else if ("S_TEXT/ASS".equals(codecId)) {
        commitSubtitleSample(paramTrack, "%01d:%02d:%02d:%02d", 21, 10000L, SSA_TIMECODE_EMPTY);
      }
      output.sampleMetadata(paramLong, blockFlags, sampleBytesWritten, 0, cryptoData);
    }
    sampleRead = true;
    resetSample();
  }
  
  private void commitSubtitleSample(Track paramTrack, String paramString, int paramInt, long paramLong, byte[] paramArrayOfByte)
  {
    setSampleDuration(subtitleSample.data, blockDurationUs, paramString, paramInt, paramLong, paramArrayOfByte);
    paramTrack = output;
    paramString = subtitleSample;
    paramTrack.sampleData(paramString, paramString.limit());
    paramInt = sampleBytesWritten;
    sampleBytesWritten = (subtitleSample.limit() + paramInt);
  }
  
  private static int[] ensureArrayCapacity(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt == null) {
      return new int[paramInt];
    }
    if (paramArrayOfInt.length >= paramInt) {
      return paramArrayOfInt;
    }
    return new int[Math.max(paramArrayOfInt.length * 2, paramInt)];
  }
  
  private static boolean isCodecSupported(String paramString)
  {
    boolean bool;
    if ((!"V_VP8".equals(paramString)) && (!"V_VP9".equals(paramString)) && (!"V_MPEG2".equals(paramString)) && (!"V_MPEG4/ISO/SP".equals(paramString)) && (!"V_MPEG4/ISO/ASP".equals(paramString)) && (!"V_MPEG4/ISO/AP".equals(paramString)) && (!"V_MPEG4/ISO/AVC".equals(paramString)) && (!"V_MPEGH/ISO/HEVC".equals(paramString)) && (!"V_MS/VFW/FOURCC".equals(paramString)) && (!"V_THEORA".equals(paramString)) && (!"A_OPUS".equals(paramString)) && (!"A_VORBIS".equals(paramString)) && (!"A_AAC".equals(paramString)) && (!"A_MPEG/L2".equals(paramString)) && (!"A_MPEG/L3".equals(paramString)) && (!"A_AC3".equals(paramString)) && (!"A_EAC3".equals(paramString)) && (!"A_TRUEHD".equals(paramString)) && (!"A_DTS".equals(paramString)) && (!"A_DTS/EXPRESS".equals(paramString)) && (!"A_DTS/LOSSLESS".equals(paramString)) && (!"A_FLAC".equals(paramString)) && (!"A_MS/ACM".equals(paramString)) && (!"A_PCM/INT/LIT".equals(paramString)) && (!"S_TEXT/UTF8".equals(paramString)) && (!"S_TEXT/ASS".equals(paramString)) && (!"S_VOBSUB".equals(paramString)) && (!"S_HDMV/PGS".equals(paramString)) && (!"S_DVBSUB".equals(paramString))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private boolean maybeSeekForCues(PositionHolder paramPositionHolder, long paramLong)
  {
    if (seekForCues)
    {
      seekPositionAfterBuildingCues = paramLong;
      position = cuesContentPosition;
      seekForCues = false;
      return true;
    }
    if (sentSeekMap)
    {
      paramLong = seekPositionAfterBuildingCues;
      if (paramLong != -1L)
      {
        position = paramLong;
        seekPositionAfterBuildingCues = -1L;
        return true;
      }
    }
    return false;
  }
  
  private void readScratch(ExtractorInput paramExtractorInput, int paramInt)
    throws IOException, InterruptedException
  {
    if (scratch.limit() >= paramInt) {
      return;
    }
    if (scratch.capacity() < paramInt)
    {
      localParsableByteArray = scratch;
      byte[] arrayOfByte = data;
      localParsableByteArray.reset(Arrays.copyOf(arrayOfByte, Math.max(arrayOfByte.length * 2, paramInt)), scratch.limit());
    }
    ParsableByteArray localParsableByteArray = scratch;
    paramExtractorInput.readFully(data, localParsableByteArray.limit(), paramInt - scratch.limit());
    scratch.setLimit(paramInt);
  }
  
  private int readToOutput(ExtractorInput paramExtractorInput, TrackOutput paramTrackOutput, int paramInt)
    throws IOException, InterruptedException
  {
    int i = sampleStrippedBytes.bytesLeft();
    if (i > 0)
    {
      paramInt = Math.min(paramInt, i);
      paramTrackOutput.sampleData(sampleStrippedBytes, paramInt);
    }
    else
    {
      paramInt = paramTrackOutput.sampleData(paramExtractorInput, paramInt, false);
    }
    sampleBytesRead += paramInt;
    sampleBytesWritten += paramInt;
    return paramInt;
  }
  
  private void readToTarget(ExtractorInput paramExtractorInput, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException, InterruptedException
  {
    int i = Math.min(paramInt2, sampleStrippedBytes.bytesLeft());
    paramExtractorInput.readFully(paramArrayOfByte, paramInt1 + i, paramInt2 - i);
    if (i > 0) {
      sampleStrippedBytes.readBytes(paramArrayOfByte, paramInt1, i);
    }
    sampleBytesRead += paramInt2;
  }
  
  private void resetSample()
  {
    sampleBytesRead = 0;
    sampleBytesWritten = 0;
    sampleCurrentNalBytesRemaining = 0;
    sampleEncodingHandled = false;
    sampleSignalByteRead = false;
    samplePartitionCountRead = false;
    samplePartitionCount = 0;
    sampleSignalByte = ((byte)0);
    sampleInitializationVectorRead = false;
    sampleStrippedBytes.reset();
  }
  
  private long scaleTimecodeToUs(long paramLong)
    throws ParserException
  {
    long l = timecodeScale;
    if (l != -9223372036854775807L) {
      return Util.scaleLargeTimestamp(paramLong, l, 1000L);
    }
    throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
  }
  
  private static void setSampleDuration(byte[] paramArrayOfByte1, long paramLong1, String paramString, int paramInt, long paramLong2, byte[] paramArrayOfByte2)
  {
    if (paramLong1 == -9223372036854775807L)
    {
      paramString = paramArrayOfByte2;
    }
    else
    {
      int i = (int)(paramLong1 / 3600000000L);
      paramLong1 -= i * 3600 * 1000000L;
      int j = (int)(paramLong1 / 60000000L);
      paramLong1 -= j * 60 * 1000000L;
      int k = (int)(paramLong1 / 1000000L);
      int m = (int)((paramLong1 - k * 1000000L) / paramLong2);
      paramString = Util.getUtf8Bytes(String.format(Locale.US, paramString, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) }));
    }
    System.arraycopy(paramString, 0, paramArrayOfByte1, paramInt, paramArrayOfByte2.length);
  }
  
  private void writeSampleData(ExtractorInput paramExtractorInput, Track paramTrack, int paramInt)
    throws IOException, InterruptedException
  {
    if ("S_TEXT/UTF8".equals(codecId))
    {
      writeSubtitleSampleData(paramExtractorInput, SUBRIP_PREFIX, paramInt);
      return;
    }
    if ("S_TEXT/ASS".equals(codecId))
    {
      writeSubtitleSampleData(paramExtractorInput, SSA_PREFIX, paramInt);
      return;
    }
    TrackOutput localTrackOutput = output;
    boolean bool1 = sampleEncodingHandled;
    boolean bool2 = true;
    int j;
    if (!bool1)
    {
      if (hasContentEncryption)
      {
        blockFlags &= 0xBFFFFFFF;
        bool1 = sampleSignalByteRead;
        i = 128;
        if (!bool1)
        {
          paramExtractorInput.readFully(scratch.data, 0, 1);
          sampleBytesRead += 1;
          j = scratch.data[0];
          if ((j & 0x80) != 128)
          {
            sampleSignalByte = ((byte)j);
            sampleSignalByteRead = true;
          }
          else
          {
            throw new ParserException("Extension bit is set in signal byte");
          }
        }
        int k = sampleSignalByte;
        if ((k & 0x1) == 1) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0)
        {
          if ((k & 0x2) == 2) {
            j = 1;
          } else {
            j = 0;
          }
          blockFlags |= 0x40000000;
          if (!sampleInitializationVectorRead)
          {
            paramExtractorInput.readFully(encryptionInitializationVector.data, 0, 8);
            sampleBytesRead += 8;
            sampleInitializationVectorRead = true;
            localObject = scratch;
            byte[] arrayOfByte = data;
            if (j == 0) {
              i = 0;
            }
            arrayOfByte[0] = ((byte)(byte)(i | 0x8));
            ((ParsableByteArray)localObject).setPosition(0);
            localTrackOutput.sampleData(scratch, 1);
            sampleBytesWritten += 1;
            encryptionInitializationVector.setPosition(0);
            localTrackOutput.sampleData(encryptionInitializationVector, 8);
            sampleBytesWritten += 8;
          }
          if (j != 0)
          {
            if (!samplePartitionCountRead)
            {
              paramExtractorInput.readFully(scratch.data, 0, 1);
              sampleBytesRead += 1;
              scratch.setPosition(0);
              samplePartitionCount = scratch.readUnsignedByte();
              samplePartitionCountRead = true;
            }
            j = samplePartitionCount * 4;
            scratch.reset(j);
            paramExtractorInput.readFully(scratch.data, 0, j);
            sampleBytesRead += j;
            short s = (short)(samplePartitionCount / 2 + 1);
            int m = s * 6 + 2;
            localObject = encryptionSubsampleDataBuffer;
            if ((localObject == null) || (((Buffer)localObject).capacity() < m)) {
              encryptionSubsampleDataBuffer = ByteBuffer.allocate(m);
            }
            encryptionSubsampleDataBuffer.position(0);
            encryptionSubsampleDataBuffer.putShort(s);
            i = 0;
            for (j = i;; j = k)
            {
              k = samplePartitionCount;
              if (i >= k) {
                break;
              }
              k = scratch.readUnsignedIntToInt();
              if (i % 2 == 0) {
                encryptionSubsampleDataBuffer.putShort((short)(k - j));
              } else {
                encryptionSubsampleDataBuffer.putInt(k - j);
              }
              i++;
            }
            j = paramInt - sampleBytesRead - j;
            if (k % 2 == 1)
            {
              encryptionSubsampleDataBuffer.putInt(j);
            }
            else
            {
              encryptionSubsampleDataBuffer.putShort((short)j);
              encryptionSubsampleDataBuffer.putInt(0);
            }
            encryptionSubsampleData.reset(encryptionSubsampleDataBuffer.array(), m);
            localTrackOutput.sampleData(encryptionSubsampleData, m);
            sampleBytesWritten += m;
          }
        }
      }
      else
      {
        localObject = sampleStrippedBytes;
        if (localObject != null) {
          sampleStrippedBytes.reset((byte[])localObject, localObject.length);
        }
      }
      sampleEncodingHandled = true;
    }
    paramInt = sampleStrippedBytes.limit() + paramInt;
    if ((!"V_MPEG4/ISO/AVC".equals(codecId)) && (!"V_MPEGH/ISO/HEVC".equals(codecId)))
    {
      if (trueHdSampleRechunker != null)
      {
        if (sampleStrippedBytes.limit() != 0) {
          bool2 = false;
        }
        Assertions.checkState(bool2);
        trueHdSampleRechunker.startSample(paramExtractorInput, blockFlags, paramInt);
      }
      for (;;)
      {
        j = sampleBytesRead;
        if (j >= paramInt) {
          break;
        }
        readToOutput(paramExtractorInput, localTrackOutput, paramInt - j);
      }
    }
    Object localObject = nalLength.data;
    localObject[0] = ((byte)0);
    localObject[1] = ((byte)0);
    localObject[2] = ((byte)0);
    int i = nalUnitLengthFieldLength;
    while (sampleBytesRead < paramInt)
    {
      j = sampleCurrentNalBytesRemaining;
      if (j == 0)
      {
        readToTarget(paramExtractorInput, (byte[])localObject, 4 - i, i);
        nalLength.setPosition(0);
        sampleCurrentNalBytesRemaining = nalLength.readUnsignedIntToInt();
        nalStartCode.setPosition(0);
        localTrackOutput.sampleData(nalStartCode, 4);
        sampleBytesWritten += 4;
      }
      else
      {
        sampleCurrentNalBytesRemaining = (j - readToOutput(paramExtractorInput, localTrackOutput, j));
      }
    }
    if ("A_VORBIS".equals(codecId))
    {
      vorbisNumPageSamples.setPosition(0);
      localTrackOutput.sampleData(vorbisNumPageSamples, 4);
      sampleBytesWritten += 4;
    }
  }
  
  private void writeSubtitleSampleData(ExtractorInput paramExtractorInput, byte[] paramArrayOfByte, int paramInt)
    throws IOException, InterruptedException
  {
    int i = paramArrayOfByte.length + paramInt;
    if (subtitleSample.capacity() < i) {
      subtitleSample.data = Arrays.copyOf(paramArrayOfByte, i + paramInt);
    } else {
      System.arraycopy(paramArrayOfByte, 0, subtitleSample.data, 0, paramArrayOfByte.length);
    }
    paramExtractorInput.readFully(subtitleSample.data, paramArrayOfByte.length, paramInt);
    subtitleSample.reset(i);
  }
  
  public void binaryElement(int paramInt1, int paramInt2, ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    int i = 0;
    Object localObject1;
    Object localObject2;
    if ((paramInt1 != 161) && (paramInt1 != 163))
    {
      if (paramInt1 != 16981)
      {
        if (paramInt1 != 18402)
        {
          if (paramInt1 != 21419)
          {
            if (paramInt1 != 25506)
            {
              if (paramInt1 == 30322)
              {
                localObject1 = currentTrack;
                localObject2 = new byte[paramInt2];
                projectionData = ((byte[])localObject2);
                paramExtractorInput.readFully((byte[])localObject2, 0, paramInt2);
              }
              else
              {
                throw new ParserException(a.f("Unexpected id: ", paramInt1));
              }
            }
            else
            {
              localObject1 = currentTrack;
              localObject2 = new byte[paramInt2];
              codecPrivate = ((byte[])localObject2);
              paramExtractorInput.readFully((byte[])localObject2, 0, paramInt2);
            }
          }
          else
          {
            Arrays.fill(seekEntryIdBytes.data, (byte)0);
            paramExtractorInput.readFully(seekEntryIdBytes.data, 4 - paramInt2, paramInt2);
            seekEntryIdBytes.setPosition(0);
            seekEntryId = ((int)seekEntryIdBytes.readUnsignedInt());
          }
        }
        else
        {
          localObject2 = new byte[paramInt2];
          paramExtractorInput.readFully((byte[])localObject2, 0, paramInt2);
          currentTrack.cryptoData = new TrackOutput.CryptoData(1, (byte[])localObject2, 0, 0);
        }
      }
      else
      {
        localObject2 = currentTrack;
        localObject1 = new byte[paramInt2];
        sampleStrippedBytes = ((byte[])localObject1);
        paramExtractorInput.readFully((byte[])localObject1, 0, paramInt2);
      }
    }
    else
    {
      if (blockState == 0)
      {
        blockTrackNumber = ((int)varintReader.readUnsignedVarint(paramExtractorInput, false, true, 8));
        blockTrackNumberLength = varintReader.getLastLength();
        blockDurationUs = -9223372036854775807L;
        blockState = 1;
        scratch.reset();
      }
      localObject2 = (Track)tracks.get(blockTrackNumber);
      if (localObject2 == null)
      {
        paramExtractorInput.skipFully(paramInt2 - blockTrackNumberLength);
        blockState = 0;
        return;
      }
      if (blockState == 1)
      {
        readScratch(paramExtractorInput, 3);
        int j = (scratch.data[2] & 0x6) >> 1;
        if (j == 0)
        {
          blockLacingSampleCount = 1;
          localObject1 = ensureArrayCapacity(blockLacingSampleSizes, 1);
          blockLacingSampleSizes = ((int[])localObject1);
          localObject1[0] = (paramInt2 - blockTrackNumberLength - 3);
        }
        else
        {
          if (paramInt1 != 163) {
            break label1160;
          }
          k = 4;
          readScratch(paramExtractorInput, 4);
          int m = (scratch.data[3] & 0xFF) + 1;
          blockLacingSampleCount = m;
          localObject1 = ensureArrayCapacity(blockLacingSampleSizes, m);
          blockLacingSampleSizes = ((int[])localObject1);
          if (j == 2)
          {
            k = blockTrackNumberLength;
            m = blockLacingSampleCount;
            Arrays.fill((int[])localObject1, 0, m, (paramInt2 - k - 4) / m);
          }
          else
          {
            int n;
            int i1;
            if (j == 1)
            {
              i = 0;
              m = i;
              for (;;)
              {
                j = blockLacingSampleCount;
                if (i >= j - 1) {
                  break;
                }
                blockLacingSampleSizes[i] = 0;
                j = k;
                do
                {
                  k = j + 1;
                  readScratch(paramExtractorInput, k);
                  n = scratch.data[(k - 1)] & 0xFF;
                  localObject1 = blockLacingSampleSizes;
                  i1 = localObject1[i] + n;
                  localObject1[i] = i1;
                  j = k;
                } while (n == 255);
                m += i1;
                i++;
              }
              blockLacingSampleSizes[(j - 1)] = (paramInt2 - blockTrackNumberLength - k - m);
            }
            else
            {
              if (j != 3) {
                break label1144;
              }
              m = 0;
              for (;;)
              {
                j = 0;
                n = blockLacingSampleCount;
                if (i >= n - 1) {
                  break label976;
                }
                blockLacingSampleSizes[i] = 0;
                n = k + 1;
                readScratch(paramExtractorInput, n);
                localObject1 = scratch.data;
                i1 = n - 1;
                if (localObject1[i1] == 0) {
                  break label965;
                }
                long l1 = 0L;
                long l2;
                for (;;)
                {
                  k = n;
                  l2 = l1;
                  if (j >= 8) {
                    break;
                  }
                  int i2 = 1 << 7 - j;
                  if ((scratch.data[i1] & i2) != 0)
                  {
                    n += j;
                    readScratch(paramExtractorInput, n);
                    localObject1 = scratch.data;
                    k = i1 + 1;
                    l2 = i2 & localObject1[i1] & 0xFF;
                    while (k < n)
                    {
                      l2 = l2 << 8 | 0xFF & scratch.data[k];
                      k++;
                    }
                    if (i > 0)
                    {
                      l2 -= (1L << j * 7 + 6) - 1L;
                      k = n;
                      break;
                    }
                    k = n;
                    break;
                  }
                  j++;
                }
                if ((l2 < -2147483648L) || (l2 > 2147483647L)) {
                  break;
                }
                j = (int)l2;
                localObject1 = blockLacingSampleSizes;
                if (i != 0) {
                  j += localObject1[(i - 1)];
                }
                localObject1[i] = j;
                m += j;
                i++;
              }
              throw new ParserException("EBML lacing sample size out of range.");
              label965:
              throw new ParserException("No valid varint length mask found");
              label976:
              blockLacingSampleSizes[(n - 1)] = (paramInt2 - blockTrackNumberLength - k - m);
            }
          }
        }
        localObject1 = scratch.data;
        paramInt2 = localObject1[0];
        int k = localObject1[1];
        blockTimeUs = (clusterTimecodeUs + scaleTimecodeToUs(k & 0xFF | paramInt2 << 8));
        k = scratch.data[2];
        if ((k & 0x8) == 8) {
          paramInt2 = 1;
        } else {
          paramInt2 = 0;
        }
        if ((type != 2) && ((paramInt1 != 163) || ((k & 0x80) != 128))) {
          k = 0;
        } else {
          k = 1;
        }
        if (paramInt2 != 0) {
          paramInt2 = Integer.MIN_VALUE;
        } else {
          paramInt2 = 0;
        }
        blockFlags = (k | paramInt2);
        blockState = 2;
        blockLacingSampleIndex = 0;
        break label1171;
        label1144:
        throw new ParserException(a.f("Unexpected lacing value: ", j));
        label1160:
        throw new ParserException("Lacing only supported in SimpleBlocks.");
      }
      label1171:
      if (paramInt1 == 163)
      {
        for (;;)
        {
          paramInt1 = blockLacingSampleIndex;
          if (paramInt1 >= blockLacingSampleCount) {
            break;
          }
          writeSampleData(paramExtractorInput, (Track)localObject2, blockLacingSampleSizes[paramInt1]);
          commitSampleToOutput((Track)localObject2, blockTimeUs + blockLacingSampleIndex * defaultSampleDurationNs / 1000);
          blockLacingSampleIndex += 1;
        }
        blockState = 0;
      }
      else
      {
        writeSampleData(paramExtractorInput, (Track)localObject2, blockLacingSampleSizes[0]);
      }
    }
  }
  
  public void endMasterElement(int paramInt)
    throws ParserException
  {
    if (paramInt != 160)
    {
      Object localObject;
      if (paramInt != 174)
      {
        long l;
        if (paramInt != 19899)
        {
          if (paramInt != 25152)
          {
            if (paramInt != 28032)
            {
              if (paramInt != 357149030)
              {
                if (paramInt != 374648427)
                {
                  if ((paramInt == 475249515) && (!sentSeekMap))
                  {
                    extractorOutput.seekMap(buildSeekMap());
                    sentSeekMap = true;
                  }
                }
                else if (tracks.size() != 0) {
                  extractorOutput.endTracks();
                } else {
                  throw new ParserException("No valid tracks were found");
                }
              }
              else
              {
                if (timecodeScale == -9223372036854775807L) {
                  timecodeScale = 1000000L;
                }
                l = durationTimecode;
                if (l != -9223372036854775807L) {
                  durationUs = scaleTimecodeToUs(l);
                }
              }
            }
            else
            {
              localObject = currentTrack;
              if ((hasContentEncryption) && (sampleStrippedBytes != null)) {
                throw new ParserException("Combining encryption and compression is not supported");
              }
            }
          }
          else
          {
            localObject = currentTrack;
            if (hasContentEncryption) {
              if (cryptoData != null) {
                drmInitData = new DrmInitData(new DrmInitData.SchemeData[] { new DrmInitData.SchemeData(C.UUID_NIL, "video/webm", currentTrack.cryptoData.encryptionKey) });
              } else {
                throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
              }
            }
          }
        }
        else
        {
          paramInt = seekEntryId;
          if (paramInt != -1)
          {
            l = seekEntryPosition;
            if (l != -1L)
            {
              if (paramInt != 475249515) {
                return;
              }
              cuesContentPosition = l;
              return;
            }
          }
          throw new ParserException("Mandatory element SeekID or SeekPosition not found");
        }
      }
      else
      {
        if (isCodecSupported(currentTrack.codecId))
        {
          localObject = currentTrack;
          ((Track)localObject).initializeOutput(extractorOutput, number);
          localObject = tracks;
          Track localTrack = currentTrack;
          ((SparseArray)localObject).put(number, localTrack);
        }
        currentTrack = null;
      }
    }
    else
    {
      if (blockState != 2) {
        return;
      }
      if (!sampleSeenReferenceBlock) {
        blockFlags |= 0x1;
      }
      commitSampleToOutput((Track)tracks.get(blockTrackNumber), blockTimeUs);
      blockState = 0;
    }
  }
  
  public void floatElement(int paramInt, double paramDouble)
  {
    if (paramInt != 181)
    {
      if (paramInt != 17545) {
        switch (paramInt)
        {
        default: 
          break;
        case 21978: 
          currentTrack.minMasteringLuminance = ((float)paramDouble);
          break;
        case 21977: 
          currentTrack.maxMasteringLuminance = ((float)paramDouble);
          break;
        case 21976: 
          currentTrack.whitePointChromaticityY = ((float)paramDouble);
          break;
        case 21975: 
          currentTrack.whitePointChromaticityX = ((float)paramDouble);
          break;
        case 21974: 
          currentTrack.primaryBChromaticityY = ((float)paramDouble);
          break;
        case 21973: 
          currentTrack.primaryBChromaticityX = ((float)paramDouble);
          break;
        case 21972: 
          currentTrack.primaryGChromaticityY = ((float)paramDouble);
          break;
        case 21971: 
          currentTrack.primaryGChromaticityX = ((float)paramDouble);
          break;
        case 21970: 
          currentTrack.primaryRChromaticityY = ((float)paramDouble);
          break;
        case 21969: 
          currentTrack.primaryRChromaticityX = ((float)paramDouble);
          break;
        }
      } else {
        durationTimecode = (paramDouble);
      }
    }
    else {
      currentTrack.sampleRate = ((int)paramDouble);
    }
  }
  
  public void init(ExtractorOutput paramExtractorOutput)
  {
    extractorOutput = paramExtractorOutput;
  }
  
  public void integerElement(int paramInt, long paramLong)
    throws ParserException
  {
    if (paramInt != 20529)
    {
      if (paramInt != 20530)
      {
        boolean bool1 = false;
        boolean bool2 = false;
        Track localTrack;
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          }
          break;
        case 2807729: 
          timecodeScale = paramLong;
          break;
        case 2352003: 
          currentTrack.defaultSampleDurationNs = ((int)paramLong);
          break;
        case 25188: 
          currentTrack.audioBitDepth = ((int)paramLong);
          break;
        case 22203: 
          currentTrack.seekPreRollNs = paramLong;
          break;
        case 22186: 
          currentTrack.codecDelayNs = paramLong;
          break;
        case 21930: 
          localTrack = currentTrack;
          if (paramLong == 1L) {
            bool2 = true;
          }
          flagForced = bool2;
          break;
        case 21690: 
          currentTrack.displayHeight = ((int)paramLong);
          break;
        case 21682: 
          currentTrack.displayUnit = ((int)paramLong);
          break;
        case 21680: 
          currentTrack.displayWidth = ((int)paramLong);
          break;
        case 21432: 
          paramInt = (int)paramLong;
          if (paramInt != 0)
          {
            if (paramInt != 1)
            {
              if (paramInt != 3)
              {
                if (paramInt == 15) {
                  currentTrack.stereoMode = 3;
                }
              }
              else {
                currentTrack.stereoMode = 1;
              }
            }
            else {
              currentTrack.stereoMode = 2;
            }
          }
          else {
            currentTrack.stereoMode = 0;
          }
          break;
        case 21420: 
          seekEntryPosition = (paramLong + segmentContentPosition);
          break;
        case 18408: 
          if (paramLong == 1L) {
            break;
          }
          throw new ParserException(a.i("AESSettingsCipherMode ", paramLong, " not supported"));
        case 18401: 
          if (paramLong == 5L) {
            break;
          }
          throw new ParserException(a.i("ContentEncAlgo ", paramLong, " not supported"));
        case 17143: 
          if (paramLong == 1L) {
            break;
          }
          throw new ParserException(a.i("EBMLReadVersion ", paramLong, " not supported"));
        case 17029: 
          if ((paramLong >= 1L) && (paramLong <= 2L)) {
            break;
          }
          throw new ParserException(a.i("DocTypeReadVersion ", paramLong, " not supported"));
        case 16980: 
          if (paramLong == 3L) {
            break;
          }
          throw new ParserException(a.i("ContentCompAlgo ", paramLong, " not supported"));
        case 251: 
          sampleSeenReferenceBlock = true;
          break;
        case 241: 
          if (seenClusterPositionForCurrentCuePoint) {
            break;
          }
          cueClusterPositions.add(paramLong);
          seenClusterPositionForCurrentCuePoint = true;
          break;
        case 231: 
          clusterTimecodeUs = scaleTimecodeToUs(paramLong);
          break;
        case 215: 
          currentTrack.number = ((int)paramLong);
          break;
        case 186: 
          currentTrack.height = ((int)paramLong);
          break;
        case 179: 
          cueTimesUs.add(scaleTimecodeToUs(paramLong));
          break;
        case 176: 
          currentTrack.width = ((int)paramLong);
          break;
        case 159: 
          currentTrack.channelCount = ((int)paramLong);
          break;
        case 155: 
          blockDurationUs = scaleTimecodeToUs(paramLong);
          break;
        case 136: 
          localTrack = currentTrack;
          bool2 = bool1;
          if (paramLong == 1L) {
            bool2 = true;
          }
          flagDefault = bool2;
          break;
        case 131: 
          currentTrack.type = ((int)paramLong);
          break;
          currentTrack.maxFrameAverageLuminance = ((int)paramLong);
          break;
          currentTrack.maxContentLuminance = ((int)paramLong);
          break;
          localTrack = currentTrack;
          hasColorInfo = true;
          paramInt = (int)paramLong;
          if (paramInt != 1)
          {
            if (paramInt != 9)
            {
              if ((paramInt == 4) || (paramInt == 5) || (paramInt == 6) || (paramInt == 7)) {
                colorSpace = 2;
              }
            }
            else {
              colorSpace = 6;
            }
          }
          else
          {
            colorSpace = 1;
            break;
            paramInt = (int)paramLong;
            if (paramInt != 1) {
              if (paramInt != 16)
              {
                if (paramInt != 18)
                {
                  if ((paramInt != 6) && (paramInt != 7)) {
                    break;
                  }
                }
                else
                {
                  currentTrack.colorTransfer = 7;
                  break;
                }
              }
              else
              {
                currentTrack.colorTransfer = 6;
                break;
              }
            }
            currentTrack.colorTransfer = 3;
            break;
            paramInt = (int)paramLong;
            if (paramInt != 1)
            {
              if (paramInt == 2) {
                currentTrack.colorRange = 1;
              }
            }
            else {
              currentTrack.colorRange = 2;
            }
          }
          break;
        }
      }
      else if (paramLong != 1L)
      {
        throw new ParserException(a.i("ContentEncodingScope ", paramLong, " not supported"));
      }
    }
    else {
      if (paramLong != 0L) {
        break label1036;
      }
    }
    return;
    label1036:
    throw new ParserException(a.i("ContentEncodingOrder ", paramLong, " not supported"));
  }
  
  public int read(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    int i = 0;
    sampleRead = false;
    int j = 1;
    while ((j != 0) && (!sampleRead))
    {
      boolean bool = reader.read(paramExtractorInput);
      j = bool;
      if (bool)
      {
        j = bool;
        if (maybeSeekForCues(paramPositionHolder, paramExtractorInput.getPosition())) {
          return 1;
        }
      }
    }
    if (j == 0)
    {
      while (i < tracks.size())
      {
        ((Track)tracks.valueAt(i)).outputPendingSampleMetadata();
        i++;
      }
      return -1;
    }
    return 0;
  }
  
  public void release() {}
  
  public void seek(long paramLong1, long paramLong2)
  {
    clusterTimecodeUs = -9223372036854775807L;
    int i = 0;
    blockState = 0;
    reader.reset();
    varintReader.reset();
    resetSample();
    while (i < tracks.size())
    {
      ((Track)tracks.valueAt(i)).reset();
      i++;
    }
  }
  
  public boolean sniff(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    return new Sniffer().sniff(paramExtractorInput);
  }
  
  public void startMasterElement(int paramInt, long paramLong1, long paramLong2)
    throws ParserException
  {
    if (paramInt != 160)
    {
      if (paramInt != 174)
      {
        if (paramInt != 187)
        {
          if (paramInt != 19899)
          {
            if (paramInt != 20533)
            {
              if (paramInt != 21968)
              {
                if (paramInt != 408125543)
                {
                  if (paramInt != 475249515)
                  {
                    if ((paramInt == 524531317) && (!sentSeekMap)) {
                      if ((seekForCuesEnabled) && (cuesContentPosition != -1L))
                      {
                        seekForCues = true;
                      }
                      else
                      {
                        extractorOutput.seekMap(new SeekMap.Unseekable(durationUs));
                        sentSeekMap = true;
                      }
                    }
                  }
                  else
                  {
                    cueTimesUs = new LongArray();
                    cueClusterPositions = new LongArray();
                  }
                }
                else
                {
                  long l = segmentContentPosition;
                  if ((l != -1L) && (l != paramLong1)) {
                    throw new ParserException("Multiple Segment elements not supported");
                  }
                  segmentContentPosition = paramLong1;
                  segmentContentSize = paramLong2;
                }
              }
              else {
                currentTrack.hasColorInfo = true;
              }
            }
            else {
              currentTrack.hasContentEncryption = true;
            }
          }
          else
          {
            seekEntryId = -1;
            seekEntryPosition = -1L;
          }
        }
        else {
          seenClusterPositionForCurrentCuePoint = false;
        }
      }
      else {
        currentTrack = new Track(null);
      }
    }
    else {
      sampleSeenReferenceBlock = false;
    }
  }
  
  public void stringElement(int paramInt, String paramString)
    throws ParserException
  {
    if (paramInt != 134)
    {
      if (paramInt != 17026)
      {
        if (paramInt != 21358)
        {
          if (paramInt == 2274716) {
            Track.access$202(currentTrack, paramString);
          }
        }
        else {
          currentTrack.name = paramString;
        }
      }
      else if ((!"webm".equals(paramString)) && (!"matroska".equals(paramString))) {
        throw new ParserException(z2.p("DocType ", paramString, " not supported"));
      }
    }
    else {
      currentTrack.codecId = paramString;
    }
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Flags {}
  
  public final class InnerEbmlReaderOutput
    implements EbmlReaderOutput
  {
    private InnerEbmlReaderOutput() {}
    
    public void binaryElement(int paramInt1, int paramInt2, ExtractorInput paramExtractorInput)
      throws IOException, InterruptedException
    {
      MatroskaExtractor.this.binaryElement(paramInt1, paramInt2, paramExtractorInput);
    }
    
    public void endMasterElement(int paramInt)
      throws ParserException
    {
      MatroskaExtractor.this.endMasterElement(paramInt);
    }
    
    public void floatElement(int paramInt, double paramDouble)
      throws ParserException
    {
      MatroskaExtractor.this.floatElement(paramInt, paramDouble);
    }
    
    public int getElementType(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return 0;
      case 181: 
      case 17545: 
      case 21969: 
      case 21970: 
      case 21971: 
      case 21972: 
      case 21973: 
      case 21974: 
      case 21975: 
      case 21976: 
      case 21977: 
      case 21978: 
        return 5;
      case 161: 
      case 163: 
      case 16981: 
      case 18402: 
      case 21419: 
      case 25506: 
      case 30322: 
        return 4;
      case 160: 
      case 174: 
      case 183: 
      case 187: 
      case 224: 
      case 225: 
      case 18407: 
      case 19899: 
      case 20532: 
      case 20533: 
      case 21936: 
      case 21968: 
      case 25152: 
      case 28032: 
      case 30320: 
      case 290298740: 
      case 357149030: 
      case 374648427: 
      case 408125543: 
      case 440786851: 
      case 475249515: 
      case 524531317: 
        return 1;
      case 134: 
      case 17026: 
      case 21358: 
      case 2274716: 
        return 3;
      }
      return 2;
    }
    
    public void integerElement(int paramInt, long paramLong)
      throws ParserException
    {
      MatroskaExtractor.this.integerElement(paramInt, paramLong);
    }
    
    public boolean isLevel1Element(int paramInt)
    {
      boolean bool;
      if ((paramInt != 357149030) && (paramInt != 524531317) && (paramInt != 475249515) && (paramInt != 374648427)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void startMasterElement(int paramInt, long paramLong1, long paramLong2)
      throws ParserException
    {
      MatroskaExtractor.this.startMasterElement(paramInt, paramLong1, paramLong2);
    }
    
    public void stringElement(int paramInt, String paramString)
      throws ParserException
    {
      MatroskaExtractor.this.stringElement(paramInt, paramString);
    }
  }
  
  public static final class Track
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
  
  public static final class TrueHdSampleRechunker
  {
    private int blockFlags;
    private int chunkSize;
    private boolean foundSyncframe;
    private int sampleCount;
    private final byte[] syncframePrefix = new byte[10];
    private long timeUs;
    
    public void outputPendingSampleMetadata(MatroskaExtractor.Track paramTrack)
    {
      if ((foundSyncframe) && (sampleCount > 0))
      {
        output.sampleMetadata(timeUs, blockFlags, chunkSize, 0, cryptoData);
        sampleCount = 0;
      }
    }
    
    public void reset()
    {
      foundSyncframe = false;
    }
    
    public void sampleMetadata(MatroskaExtractor.Track paramTrack, long paramLong)
    {
      if (!foundSyncframe) {
        return;
      }
      int i = sampleCount;
      int j = i + 1;
      sampleCount = j;
      if (i == 0) {
        timeUs = paramLong;
      }
      if (j < 16) {
        return;
      }
      output.sampleMetadata(timeUs, blockFlags, chunkSize, 0, cryptoData);
      sampleCount = 0;
    }
    
    public void startSample(ExtractorInput paramExtractorInput, int paramInt1, int paramInt2)
      throws IOException, InterruptedException
    {
      if (!foundSyncframe)
      {
        paramExtractorInput.peekFully(syncframePrefix, 0, 10);
        paramExtractorInput.resetPeekPosition();
        if (Ac3Util.parseTrueHdSyncframeAudioSampleCount(syncframePrefix) == 0) {
          return;
        }
        foundSyncframe = true;
        sampleCount = 0;
      }
      if (sampleCount == 0)
      {
        blockFlags = paramInt1;
        chunkSize = 0;
      }
      chunkSize += paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */