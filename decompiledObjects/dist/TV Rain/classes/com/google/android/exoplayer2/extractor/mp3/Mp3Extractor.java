package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.Id3Peeker;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import z3;

public final class Mp3Extractor
  implements Extractor
{
  public static final ExtractorsFactory FACTORY = new z3(15);
  public static final int FLAG_DISABLE_ID3_METADATA = 2;
  public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
  private static final int MAX_SNIFF_BYTES = 16384;
  private static final int MAX_SYNC_BYTES = 131072;
  private static final int MPEG_AUDIO_HEADER_MASK = -128000;
  private static final Id3Decoder.FramePredicate REQUIRED_ID3_FRAME_PREDICATE = new z3(16);
  private static final int SCRATCH_LENGTH = 10;
  private static final int SEEK_HEADER_INFO = Util.getIntegerCodeForString("Info");
  private static final int SEEK_HEADER_UNSET = 0;
  private static final int SEEK_HEADER_VBRI = Util.getIntegerCodeForString("VBRI");
  private static final int SEEK_HEADER_XING = Util.getIntegerCodeForString("Xing");
  private long basisTimeUs;
  private ExtractorOutput extractorOutput;
  private final int flags;
  private final long forcedFirstSampleTimestampUs;
  private final GaplessInfoHolder gaplessInfoHolder;
  private final Id3Peeker id3Peeker;
  private Metadata metadata;
  private int sampleBytesRemaining;
  private long samplesRead;
  private final ParsableByteArray scratch;
  private Seeker seeker;
  private final MpegAudioHeader synchronizedHeader;
  private int synchronizedHeaderData;
  private TrackOutput trackOutput;
  
  public Mp3Extractor()
  {
    this(0);
  }
  
  public Mp3Extractor(int paramInt)
  {
    this(paramInt, -9223372036854775807L);
  }
  
  public Mp3Extractor(int paramInt, long paramLong)
  {
    flags = paramInt;
    forcedFirstSampleTimestampUs = paramLong;
    scratch = new ParsableByteArray(10);
    synchronizedHeader = new MpegAudioHeader();
    gaplessInfoHolder = new GaplessInfoHolder();
    basisTimeUs = -9223372036854775807L;
    id3Peeker = new Id3Peeker();
  }
  
  private Seeker getConstantBitrateSeeker(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    paramExtractorInput.peekFully(scratch.data, 0, 4);
    scratch.setPosition(0);
    MpegAudioHeader.populateHeader(scratch.readInt(), synchronizedHeader);
    return new ConstantBitrateSeeker(paramExtractorInput.getLength(), paramExtractorInput.getPosition(), synchronizedHeader);
  }
  
  private static int getSeekFrameHeader(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    if (paramParsableByteArray.limit() >= paramInt + 4)
    {
      paramParsableByteArray.setPosition(paramInt);
      paramInt = paramParsableByteArray.readInt();
      if ((paramInt == SEEK_HEADER_XING) || (paramInt == SEEK_HEADER_INFO)) {
        return paramInt;
      }
    }
    if (paramParsableByteArray.limit() >= 40)
    {
      paramParsableByteArray.setPosition(36);
      paramInt = paramParsableByteArray.readInt();
      int i = SEEK_HEADER_VBRI;
      if (paramInt == i) {
        return i;
      }
    }
    return 0;
  }
  
  private static boolean headersMatch(int paramInt, long paramLong)
  {
    boolean bool;
    if ((paramInt & 0xFFFE0C00) == (paramLong & 0xFFFFFFFFFFFE0C00)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Nullable
  private static MlltSeeker maybeHandleSeekMetadata(Metadata paramMetadata, long paramLong)
  {
    if (paramMetadata != null)
    {
      int i = paramMetadata.length();
      for (int j = 0; j < i; j++)
      {
        Metadata.Entry localEntry = paramMetadata.get(j);
        if ((localEntry instanceof MlltFrame)) {
          return MlltSeeker.create(paramLong, (MlltFrame)localEntry);
        }
      }
    }
    return null;
  }
  
  private Seeker maybeReadSeekFrame(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    Object localObject1 = new ParsableByteArray(synchronizedHeader.frameSize);
    paramExtractorInput.peekFully(data, 0, synchronizedHeader.frameSize);
    Object localObject2 = synchronizedHeader;
    int i = version;
    int j = 21;
    int k = channels;
    if ((i & 0x1) != 0)
    {
      if (k != 1) {
        j = 36;
      }
    }
    else if (k == 1) {
      j = 13;
    }
    k = getSeekFrameHeader((ParsableByteArray)localObject1, j);
    if ((k != SEEK_HEADER_XING) && (k != SEEK_HEADER_INFO))
    {
      if (k == SEEK_HEADER_VBRI)
      {
        localObject1 = VbriSeeker.create(paramExtractorInput.getLength(), paramExtractorInput.getPosition(), synchronizedHeader, (ParsableByteArray)localObject1);
        paramExtractorInput.skipFully(synchronizedHeader.frameSize);
      }
      else
      {
        localObject1 = null;
        paramExtractorInput.resetPeekPosition();
      }
    }
    else
    {
      localObject2 = XingSeeker.create(paramExtractorInput.getLength(), paramExtractorInput.getPosition(), synchronizedHeader, (ParsableByteArray)localObject1);
      if ((localObject2 != null) && (!gaplessInfoHolder.hasGaplessInfo()))
      {
        paramExtractorInput.resetPeekPosition();
        paramExtractorInput.advancePeekPosition(j + 141);
        paramExtractorInput.peekFully(scratch.data, 0, 3);
        scratch.setPosition(0);
        gaplessInfoHolder.setFromXingHeaderValue(scratch.readUnsignedInt24());
      }
      paramExtractorInput.skipFully(synchronizedHeader.frameSize);
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (!((SeekMap)localObject2).isSeekable())
        {
          localObject1 = localObject2;
          if (k == SEEK_HEADER_INFO) {
            return getConstantBitrateSeeker(paramExtractorInput);
          }
        }
      }
    }
    return (Seeker)localObject1;
  }
  
  private boolean peekEndOfStreamOrHeader(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    Seeker localSeeker = seeker;
    boolean bool1 = true;
    boolean bool2;
    if (localSeeker != null)
    {
      bool2 = bool1;
      if (paramExtractorInput.getPeekPosition() == seeker.getDataEndPosition()) {}
    }
    else if (!paramExtractorInput.peekFully(scratch.data, 0, 4, true))
    {
      bool2 = bool1;
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
  
  private int readSample(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    if (sampleBytesRemaining == 0)
    {
      paramExtractorInput.resetPeekPosition();
      if (peekEndOfStreamOrHeader(paramExtractorInput)) {
        return -1;
      }
      scratch.setPosition(0);
      i = scratch.readInt();
      if ((headersMatch(i, synchronizedHeaderData)) && (MpegAudioHeader.getFrameSize(i) != -1))
      {
        MpegAudioHeader.populateHeader(i, synchronizedHeader);
        if (basisTimeUs == -9223372036854775807L)
        {
          basisTimeUs = seeker.getTimeUs(paramExtractorInput.getPosition());
          if (forcedFirstSampleTimestampUs != -9223372036854775807L)
          {
            l1 = seeker.getTimeUs(0L);
            l2 = basisTimeUs;
            basisTimeUs = (forcedFirstSampleTimestampUs - l1 + l2);
          }
        }
        sampleBytesRemaining = synchronizedHeader.frameSize;
      }
      else
      {
        paramExtractorInput.skipFully(1);
        synchronizedHeaderData = 0;
        return 0;
      }
    }
    int i = trackOutput.sampleData(paramExtractorInput, sampleBytesRemaining, true);
    if (i == -1) {
      return -1;
    }
    i = sampleBytesRemaining - i;
    sampleBytesRemaining = i;
    if (i > 0) {
      return 0;
    }
    long l1 = basisTimeUs;
    long l2 = samplesRead;
    paramExtractorInput = synchronizedHeader;
    l2 = l2 * 1000000L / sampleRate;
    trackOutput.sampleMetadata(l2 + l1, 1, frameSize, 0, null);
    samplesRead += synchronizedHeader.samplesPerFrame;
    sampleBytesRemaining = 0;
    return 0;
  }
  
  private boolean synchronize(ExtractorInput paramExtractorInput, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    int i;
    if (paramBoolean) {
      i = 16384;
    } else {
      i = 131072;
    }
    paramExtractorInput.resetPeekPosition();
    int k;
    if (paramExtractorInput.getPosition() == 0L)
    {
      if ((flags & 0x2) == 0) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0) {
        localObject = null;
      } else {
        localObject = REQUIRED_ID3_FRAME_PREDICATE;
      }
      Object localObject = id3Peeker.peekId3Data(paramExtractorInput, (Id3Decoder.FramePredicate)localObject);
      metadata = ((Metadata)localObject);
      if (localObject != null) {
        gaplessInfoHolder.setFromMetadata((Metadata)localObject);
      }
      k = (int)paramExtractorInput.getPeekPosition();
      if (!paramBoolean) {
        paramExtractorInput.skipFully(k);
      }
    }
    else
    {
      k = 0;
    }
    int j = 0;
    int m = 0;
    int n = m;
    for (;;)
    {
      int i2;
      int i3;
      if (peekEndOfStreamOrHeader(paramExtractorInput))
      {
        if (m <= 0) {
          throw new EOFException();
        }
      }
      else
      {
        scratch.setPosition(0);
        int i1 = scratch.readInt();
        if ((j == 0) || (headersMatch(i1, j)))
        {
          i2 = MpegAudioHeader.getFrameSize(i1);
          if (i2 != -1) {}
        }
        else
        {
          j = n + 1;
          if (n == i)
          {
            if (paramBoolean) {
              return false;
            }
            throw new ParserException("Searched too many bytes.");
          }
          if (paramBoolean)
          {
            paramExtractorInput.resetPeekPosition();
            paramExtractorInput.advancePeekPosition(k + j);
          }
          else
          {
            paramExtractorInput.skipFully(1);
          }
          m = 0;
          n = j;
          j = m;
          continue;
        }
        i3 = m + 1;
        if (i3 == 1)
        {
          MpegAudioHeader.populateHeader(i1, synchronizedHeader);
          m = i1;
          break label350;
        }
        m = j;
        if (i3 != 4) {
          break label350;
        }
      }
      if (paramBoolean) {
        paramExtractorInput.skipFully(k + n);
      } else {
        paramExtractorInput.resetPeekPosition();
      }
      synchronizedHeaderData = j;
      return true;
      label350:
      paramExtractorInput.advancePeekPosition(i2 - 4);
      j = m;
      m = i3;
    }
  }
  
  public void init(ExtractorOutput paramExtractorOutput)
  {
    extractorOutput = paramExtractorOutput;
    trackOutput = paramExtractorOutput.track(0, 1);
    extractorOutput.endTracks();
  }
  
  public int read(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    if (synchronizedHeaderData == 0) {
      try
      {
        synchronize(paramExtractorInput, false);
      }
      catch (EOFException paramExtractorInput)
      {
        return -1;
      }
    }
    if (seeker == null)
    {
      Object localObject = maybeReadSeekFrame(paramExtractorInput);
      paramPositionHolder = maybeHandleSeekMetadata(metadata, paramExtractorInput.getPosition());
      if (paramPositionHolder != null) {
        seeker = paramPositionHolder;
      } else if (localObject != null) {
        seeker = ((Seeker)localObject);
      }
      paramPositionHolder = seeker;
      if ((paramPositionHolder == null) || ((!paramPositionHolder.isSeekable()) && ((flags & 0x1) != 0))) {
        seeker = getConstantBitrateSeeker(paramExtractorInput);
      }
      extractorOutput.seekMap(seeker);
      localObject = trackOutput;
      paramPositionHolder = synchronizedHeader;
      String str = mimeType;
      int i = channels;
      int j = sampleRate;
      paramPositionHolder = gaplessInfoHolder;
      int k = encoderDelay;
      int m = encoderPadding;
      if ((flags & 0x2) != 0) {
        paramPositionHolder = null;
      } else {
        paramPositionHolder = metadata;
      }
      ((TrackOutput)localObject).format(Format.createAudioSampleFormat(null, str, null, -1, 4096, i, j, -1, k, m, null, null, 0, null, paramPositionHolder));
    }
    return readSample(paramExtractorInput);
  }
  
  public void release() {}
  
  public void seek(long paramLong1, long paramLong2)
  {
    synchronizedHeaderData = 0;
    basisTimeUs = -9223372036854775807L;
    samplesRead = 0L;
    sampleBytesRemaining = 0;
  }
  
  public boolean sniff(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    return synchronize(paramExtractorInput, true);
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Flags {}
  
  public static abstract interface Seeker
    extends SeekMap
  {
    public abstract long getDataEndPosition();
    
    public abstract long getTimeUs(long paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp3.Mp3Extractor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */