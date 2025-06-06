package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap.Unseekable;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import z3;

public final class PsExtractor
  implements Extractor
{
  public static final int AUDIO_STREAM = 192;
  public static final int AUDIO_STREAM_MASK = 224;
  public static final ExtractorsFactory FACTORY = new z3(22);
  private static final long MAX_SEARCH_LENGTH = 1048576L;
  private static final long MAX_SEARCH_LENGTH_AFTER_AUDIO_AND_VIDEO_FOUND = 8192L;
  private static final int MAX_STREAM_ID_PLUS_ONE = 256;
  public static final int MPEG_PROGRAM_END_CODE = 441;
  public static final int PACKET_START_CODE_PREFIX = 1;
  public static final int PACK_START_CODE = 442;
  public static final int PRIVATE_STREAM_1 = 189;
  public static final int SYSTEM_HEADER_START_CODE = 443;
  public static final int VIDEO_STREAM = 224;
  public static final int VIDEO_STREAM_MASK = 240;
  private final PsDurationReader durationReader;
  private boolean foundAllTracks;
  private boolean foundAudioTrack;
  private boolean foundVideoTrack;
  private boolean hasOutputSeekMap;
  private long lastTrackPosition;
  private ExtractorOutput output;
  private PsBinarySearchSeeker psBinarySearchSeeker;
  private final ParsableByteArray psPacketBuffer;
  private final SparseArray<PesReader> psPayloadReaders;
  private final TimestampAdjuster timestampAdjuster;
  
  public PsExtractor()
  {
    this(new TimestampAdjuster(0L));
  }
  
  public PsExtractor(TimestampAdjuster paramTimestampAdjuster)
  {
    timestampAdjuster = paramTimestampAdjuster;
    psPacketBuffer = new ParsableByteArray(4096);
    psPayloadReaders = new SparseArray();
    durationReader = new PsDurationReader();
  }
  
  private void maybeOutputSeekMap(long paramLong)
  {
    if (!hasOutputSeekMap)
    {
      hasOutputSeekMap = true;
      if (durationReader.getDurationUs() != -9223372036854775807L)
      {
        PsBinarySearchSeeker localPsBinarySearchSeeker = new PsBinarySearchSeeker(durationReader.getScrTimestampAdjuster(), durationReader.getDurationUs(), paramLong);
        psBinarySearchSeeker = localPsBinarySearchSeeker;
        output.seekMap(localPsBinarySearchSeeker.getSeekMap());
      }
      else
      {
        output.seekMap(new SeekMap.Unseekable(durationReader.getDurationUs()));
      }
    }
  }
  
  public void init(ExtractorOutput paramExtractorOutput)
  {
    output = paramExtractorOutput;
  }
  
  public int read(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    long l = paramExtractorInput.getLength();
    boolean bool = l < -1L;
    if (bool) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i != 0) && (!durationReader.isDurationReadFinished())) {
      return durationReader.readDuration(paramExtractorInput, paramPositionHolder);
    }
    maybeOutputSeekMap(l);
    Object localObject1 = psBinarySearchSeeker;
    Object localObject2 = null;
    if ((localObject1 != null) && (((BinarySearchSeeker)localObject1).isSeeking())) {
      return psBinarySearchSeeker.handlePendingSeek(paramExtractorInput, paramPositionHolder, null);
    }
    paramExtractorInput.resetPeekPosition();
    if (bool) {
      l -= paramExtractorInput.getPeekPosition();
    } else {
      l = -1L;
    }
    if ((l != -1L) && (l < 4L)) {
      return -1;
    }
    if (!paramExtractorInput.peekFully(psPacketBuffer.data, 0, 4, true)) {
      return -1;
    }
    psPacketBuffer.setPosition(0);
    int i = psPacketBuffer.readInt();
    if (i == 441) {
      return -1;
    }
    if (i == 442)
    {
      paramExtractorInput.peekFully(psPacketBuffer.data, 0, 10);
      psPacketBuffer.setPosition(9);
      paramExtractorInput.skipFully((psPacketBuffer.readUnsignedByte() & 0x7) + 14);
      return 0;
    }
    if (i == 443)
    {
      paramExtractorInput.peekFully(psPacketBuffer.data, 0, 2);
      psPacketBuffer.setPosition(0);
      paramExtractorInput.skipFully(psPacketBuffer.readUnsignedShort() + 6);
      return 0;
    }
    if ((i & 0xFF00) >> 8 != 1)
    {
      paramExtractorInput.skipFully(1);
      return 0;
    }
    i &= 0xFF;
    PesReader localPesReader = (PesReader)psPayloadReaders.get(i);
    paramPositionHolder = localPesReader;
    if (!foundAllTracks)
    {
      localObject1 = localPesReader;
      if (localPesReader == null)
      {
        if (i == 189)
        {
          paramPositionHolder = new Ac3Reader();
          foundAudioTrack = true;
          lastTrackPosition = paramExtractorInput.getPosition();
        }
        else if ((i & 0xE0) == 192)
        {
          paramPositionHolder = new MpegAudioReader();
          foundAudioTrack = true;
          lastTrackPosition = paramExtractorInput.getPosition();
        }
        else
        {
          paramPositionHolder = (PositionHolder)localObject2;
          if ((i & 0xF0) == 224)
          {
            paramPositionHolder = new H262Reader();
            foundVideoTrack = true;
            lastTrackPosition = paramExtractorInput.getPosition();
          }
        }
        localObject1 = localPesReader;
        if (paramPositionHolder != null)
        {
          localObject1 = new TsPayloadReader.TrackIdGenerator(i, 256);
          paramPositionHolder.createTracks(output, (TsPayloadReader.TrackIdGenerator)localObject1);
          localObject1 = new PesReader(paramPositionHolder, timestampAdjuster);
          psPayloadReaders.put(i, localObject1);
        }
      }
      if ((foundAudioTrack) && (foundVideoTrack)) {
        l = lastTrackPosition + 8192L;
      } else {
        l = 1048576L;
      }
      paramPositionHolder = (PositionHolder)localObject1;
      if (paramExtractorInput.getPosition() > l)
      {
        foundAllTracks = true;
        output.endTracks();
        paramPositionHolder = (PositionHolder)localObject1;
      }
    }
    paramExtractorInput.peekFully(psPacketBuffer.data, 0, 2);
    psPacketBuffer.setPosition(0);
    i = psPacketBuffer.readUnsignedShort() + 6;
    if (paramPositionHolder == null)
    {
      paramExtractorInput.skipFully(i);
    }
    else
    {
      psPacketBuffer.reset(i);
      paramExtractorInput.readFully(psPacketBuffer.data, 0, i);
      psPacketBuffer.setPosition(6);
      paramPositionHolder.consume(psPacketBuffer);
      paramExtractorInput = psPacketBuffer;
      paramExtractorInput.setLimit(paramExtractorInput.capacity());
    }
    return 0;
  }
  
  public void release() {}
  
  public void seek(long paramLong1, long paramLong2)
  {
    paramLong1 = timestampAdjuster.getTimestampOffsetUs();
    int i = 0;
    if (paramLong1 == -9223372036854775807L) {
      j = 1;
    } else {
      j = 0;
    }
    if ((j != 0) || ((timestampAdjuster.getFirstSampleTimestampUs() != 0L) && (timestampAdjuster.getFirstSampleTimestampUs() != paramLong2)))
    {
      timestampAdjuster.reset();
      timestampAdjuster.setFirstSampleTimestampUs(paramLong2);
    }
    PsBinarySearchSeeker localPsBinarySearchSeeker = psBinarySearchSeeker;
    int j = i;
    if (localPsBinarySearchSeeker != null) {
      localPsBinarySearchSeeker.setSeekTargetUs(paramLong2);
    }
    for (j = i; j < psPayloadReaders.size(); j++) {
      ((PesReader)psPayloadReaders.valueAt(j)).seek();
    }
  }
  
  public boolean sniff(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    byte[] arrayOfByte = new byte[14];
    boolean bool = false;
    paramExtractorInput.peekFully(arrayOfByte, 0, 14);
    if (442 != ((arrayOfByte[0] & 0xFF) << 24 | (arrayOfByte[1] & 0xFF) << 16 | (arrayOfByte[2] & 0xFF) << 8 | arrayOfByte[3] & 0xFF)) {
      return false;
    }
    if ((arrayOfByte[4] & 0xC4) != 68) {
      return false;
    }
    if ((arrayOfByte[6] & 0x4) != 4) {
      return false;
    }
    if ((arrayOfByte[8] & 0x4) != 4) {
      return false;
    }
    if ((arrayOfByte[9] & 0x1) != 1) {
      return false;
    }
    if ((arrayOfByte[12] & 0x3) != 3) {
      return false;
    }
    paramExtractorInput.advancePeekPosition(arrayOfByte[13] & 0x7);
    paramExtractorInput.peekFully(arrayOfByte, 0, 3);
    if (1 == ((arrayOfByte[0] & 0xFF) << 16 | (arrayOfByte[1] & 0xFF) << 8 | arrayOfByte[2] & 0xFF)) {
      bool = true;
    }
    return bool;
  }
  
  public static final class PesReader
  {
    private static final int PES_SCRATCH_SIZE = 64;
    private boolean dtsFlag;
    private int extendedHeaderLength;
    private final ElementaryStreamReader pesPayloadReader;
    private final ParsableBitArray pesScratch;
    private boolean ptsFlag;
    private boolean seenFirstDts;
    private long timeUs;
    private final TimestampAdjuster timestampAdjuster;
    
    public PesReader(ElementaryStreamReader paramElementaryStreamReader, TimestampAdjuster paramTimestampAdjuster)
    {
      pesPayloadReader = paramElementaryStreamReader;
      timestampAdjuster = paramTimestampAdjuster;
      pesScratch = new ParsableBitArray(new byte[64]);
    }
    
    private void parseHeader()
    {
      pesScratch.skipBits(8);
      ptsFlag = pesScratch.readBit();
      dtsFlag = pesScratch.readBit();
      pesScratch.skipBits(6);
      extendedHeaderLength = pesScratch.readBits(8);
    }
    
    private void parseHeaderExtension()
    {
      timeUs = 0L;
      if (ptsFlag)
      {
        pesScratch.skipBits(4);
        long l1 = pesScratch.readBits(3);
        pesScratch.skipBits(1);
        long l2 = pesScratch.readBits(15) << 15;
        pesScratch.skipBits(1);
        long l3 = pesScratch.readBits(15);
        pesScratch.skipBits(1);
        if ((!seenFirstDts) && (dtsFlag))
        {
          pesScratch.skipBits(4);
          long l4 = pesScratch.readBits(3);
          pesScratch.skipBits(1);
          long l5 = pesScratch.readBits(15) << 15;
          pesScratch.skipBits(1);
          long l6 = pesScratch.readBits(15);
          pesScratch.skipBits(1);
          timestampAdjuster.adjustTsTimestamp(l4 << 30 | l5 | l6);
          seenFirstDts = true;
        }
        timeUs = timestampAdjuster.adjustTsTimestamp(l1 << 30 | l2 | l3);
      }
    }
    
    public void consume(ParsableByteArray paramParsableByteArray)
      throws ParserException
    {
      paramParsableByteArray.readBytes(pesScratch.data, 0, 3);
      pesScratch.setPosition(0);
      parseHeader();
      paramParsableByteArray.readBytes(pesScratch.data, 0, extendedHeaderLength);
      pesScratch.setPosition(0);
      parseHeaderExtension();
      pesPayloadReader.packetStarted(timeUs, true);
      pesPayloadReader.consume(paramParsableByteArray);
      pesPayloadReader.packetFinished();
    }
    
    public void seek()
    {
      seenFirstDts = false;
      pesPayloadReader.seek();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.PsExtractor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */