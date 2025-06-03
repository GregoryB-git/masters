package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap.Unseekable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import z3;

public final class TsExtractor
  implements Extractor
{
  private static final long AC3_FORMAT_IDENTIFIER = Util.getIntegerCodeForString("AC-3");
  private static final int BUFFER_SIZE = 9400;
  private static final long E_AC3_FORMAT_IDENTIFIER = Util.getIntegerCodeForString("EAC3");
  public static final ExtractorsFactory FACTORY = new z3(23);
  private static final long HEVC_FORMAT_IDENTIFIER = Util.getIntegerCodeForString("HEVC");
  private static final int MAX_PID_PLUS_ONE = 8192;
  public static final int MODE_HLS = 2;
  public static final int MODE_MULTI_PMT = 0;
  public static final int MODE_SINGLE_PMT = 1;
  private static final int SNIFF_TS_PACKET_COUNT = 5;
  public static final int TS_PACKET_SIZE = 188;
  private static final int TS_PAT_PID = 0;
  public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
  public static final int TS_STREAM_TYPE_AAC_LATM = 17;
  public static final int TS_STREAM_TYPE_AC3 = 129;
  public static final int TS_STREAM_TYPE_DTS = 138;
  public static final int TS_STREAM_TYPE_DVBSUBS = 89;
  public static final int TS_STREAM_TYPE_E_AC3 = 135;
  public static final int TS_STREAM_TYPE_H262 = 2;
  public static final int TS_STREAM_TYPE_H264 = 27;
  public static final int TS_STREAM_TYPE_H265 = 36;
  public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
  public static final int TS_STREAM_TYPE_ID3 = 21;
  public static final int TS_STREAM_TYPE_MPA = 3;
  public static final int TS_STREAM_TYPE_MPA_LSF = 4;
  public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
  public static final int TS_SYNC_BYTE = 71;
  private int bytesSinceLastSync;
  private final SparseIntArray continuityCounters;
  private final TsDurationReader durationReader;
  private boolean hasOutputSeekMap;
  private TsPayloadReader id3Reader;
  private final int mode;
  private ExtractorOutput output;
  private final TsPayloadReader.Factory payloadReaderFactory;
  private int pcrPid;
  private boolean pendingSeekToStart;
  private int remainingPmts;
  private final List<TimestampAdjuster> timestampAdjusters;
  private final SparseBooleanArray trackIds;
  private final SparseBooleanArray trackPids;
  private boolean tracksEnded;
  private TsBinarySearchSeeker tsBinarySearchSeeker;
  private final ParsableByteArray tsPacketBuffer;
  private final SparseArray<TsPayloadReader> tsPayloadReaders;
  
  public TsExtractor()
  {
    this(0);
  }
  
  public TsExtractor(int paramInt)
  {
    this(1, paramInt);
  }
  
  public TsExtractor(int paramInt1, int paramInt2)
  {
    this(paramInt1, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(paramInt2));
  }
  
  public TsExtractor(int paramInt, TimestampAdjuster paramTimestampAdjuster, TsPayloadReader.Factory paramFactory)
  {
    payloadReaderFactory = ((TsPayloadReader.Factory)Assertions.checkNotNull(paramFactory));
    mode = paramInt;
    if ((paramInt != 1) && (paramInt != 2))
    {
      paramFactory = new ArrayList();
      timestampAdjusters = paramFactory;
      paramFactory.add(paramTimestampAdjuster);
    }
    else
    {
      timestampAdjusters = Collections.singletonList(paramTimestampAdjuster);
    }
    tsPacketBuffer = new ParsableByteArray(new byte['Ⓒ'], 0);
    trackIds = new SparseBooleanArray();
    trackPids = new SparseBooleanArray();
    tsPayloadReaders = new SparseArray();
    continuityCounters = new SparseIntArray();
    durationReader = new TsDurationReader();
    pcrPid = -1;
    resetPayloadReaders();
  }
  
  private boolean fillBufferWithAtLeastOnePacket(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    ParsableByteArray localParsableByteArray = tsPacketBuffer;
    byte[] arrayOfByte = data;
    int i;
    if (9400 - localParsableByteArray.getPosition() < 188)
    {
      i = tsPacketBuffer.bytesLeft();
      if (i > 0) {
        System.arraycopy(arrayOfByte, tsPacketBuffer.getPosition(), arrayOfByte, 0, i);
      }
      tsPacketBuffer.reset(arrayOfByte, i);
    }
    while (tsPacketBuffer.bytesLeft() < 188)
    {
      i = tsPacketBuffer.limit();
      int j = paramExtractorInput.read(arrayOfByte, i, 9400 - i);
      if (j == -1) {
        return false;
      }
      tsPacketBuffer.setLimit(i + j);
    }
    return true;
  }
  
  private int findEndOfFirstTsPacketInBuffer()
    throws ParserException
  {
    int i = tsPacketBuffer.getPosition();
    int j = tsPacketBuffer.limit();
    int k = TsUtil.findSyncBytePosition(tsPacketBuffer.data, i, j);
    tsPacketBuffer.setPosition(k);
    int m = k + 188;
    if (m > j)
    {
      i = k - i + bytesSinceLastSync;
      bytesSinceLastSync = i;
      if ((mode == 2) && (i > 376)) {
        throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
      }
    }
    else
    {
      bytesSinceLastSync = 0;
    }
    return m;
  }
  
  private void maybeOutputSeekMap(long paramLong)
  {
    if (!hasOutputSeekMap)
    {
      hasOutputSeekMap = true;
      if (durationReader.getDurationUs() != -9223372036854775807L)
      {
        TsBinarySearchSeeker localTsBinarySearchSeeker = new TsBinarySearchSeeker(durationReader.getPcrTimestampAdjuster(), durationReader.getDurationUs(), paramLong, pcrPid);
        tsBinarySearchSeeker = localTsBinarySearchSeeker;
        output.seekMap(localTsBinarySearchSeeker.getSeekMap());
      }
      else
      {
        output.seekMap(new SeekMap.Unseekable(durationReader.getDurationUs()));
      }
    }
  }
  
  private void resetPayloadReaders()
  {
    trackIds.clear();
    tsPayloadReaders.clear();
    SparseArray localSparseArray = payloadReaderFactory.createInitialPayloadReaders();
    int i = localSparseArray.size();
    for (int j = 0; j < i; j++) {
      tsPayloadReaders.put(localSparseArray.keyAt(j), localSparseArray.valueAt(j));
    }
    tsPayloadReaders.put(0, new SectionReader(new PatReader()));
    id3Reader = null;
  }
  
  private boolean shouldConsumePacketPayload(int paramInt)
  {
    int i = mode;
    boolean bool = false;
    if ((i == 2) || (tracksEnded) || (!trackPids.get(paramInt, false))) {
      bool = true;
    }
    return bool;
  }
  
  public void init(ExtractorOutput paramExtractorOutput)
  {
    output = paramExtractorOutput;
  }
  
  public int read(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    long l = paramExtractorInput.getLength();
    boolean bool1 = tracksEnded;
    Object localObject = null;
    int i;
    if (bool1)
    {
      if ((l != -1L) && (mode != 2)) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i != 0) && (!durationReader.isDurationReadFinished())) {
        return durationReader.readDuration(paramExtractorInput, paramPositionHolder, pcrPid);
      }
      maybeOutputSeekMap(l);
      if (pendingSeekToStart)
      {
        pendingSeekToStart = false;
        seek(0L, 0L);
        if (paramExtractorInput.getPosition() != 0L)
        {
          position = 0L;
          return 1;
        }
      }
      TsBinarySearchSeeker localTsBinarySearchSeeker = tsBinarySearchSeeker;
      if ((localTsBinarySearchSeeker != null) && (localTsBinarySearchSeeker.isSeeking())) {
        return tsBinarySearchSeeker.handlePendingSeek(paramExtractorInput, paramPositionHolder, null);
      }
    }
    if (!fillBufferWithAtLeastOnePacket(paramExtractorInput)) {
      return -1;
    }
    int j = findEndOfFirstTsPacketInBuffer();
    int k = tsPacketBuffer.limit();
    if (j > k) {
      return 0;
    }
    int m = tsPacketBuffer.readInt();
    if ((0x800000 & m) != 0)
    {
      tsPacketBuffer.setPosition(j);
      return 0;
    }
    if ((0x400000 & m) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    int n = (0x1FFF00 & m) >> 8;
    if ((m & 0x20) != 0) {
      i = 1;
    } else {
      i = 0;
    }
    int i1;
    if ((m & 0x10) != 0) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    paramExtractorInput = (ExtractorInput)localObject;
    if (i1 != 0) {
      paramExtractorInput = (TsPayloadReader)tsPayloadReaders.get(n);
    }
    if (paramExtractorInput == null)
    {
      tsPacketBuffer.setPosition(j);
      return 0;
    }
    if (mode != 2)
    {
      i1 = m & 0xF;
      m = continuityCounters.get(n, i1 - 1);
      continuityCounters.put(n, i1);
      if (m == i1)
      {
        tsPacketBuffer.setPosition(j);
        return 0;
      }
      if (i1 != (m + 1 & 0xF)) {
        paramExtractorInput.seek();
      }
    }
    if (i != 0)
    {
      i = tsPacketBuffer.readUnsignedByte();
      tsPacketBuffer.skipBytes(i);
    }
    boolean bool2 = tracksEnded;
    if (shouldConsumePacketPayload(n))
    {
      tsPacketBuffer.setLimit(j);
      paramExtractorInput.consume(tsPacketBuffer, bool1);
      tsPacketBuffer.setLimit(k);
    }
    if ((mode != 2) && (!bool2) && (tracksEnded) && (l != -1L)) {
      pendingSeekToStart = true;
    }
    tsPacketBuffer.setPosition(j);
    return 0;
  }
  
  public void release() {}
  
  public void seek(long paramLong1, long paramLong2)
  {
    boolean bool;
    if (mode != 2) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    int i = timestampAdjusters.size();
    Object localObject;
    for (int j = 0; j < i; j++)
    {
      localObject = (TimestampAdjuster)timestampAdjusters.get(j);
      int k;
      if (((TimestampAdjuster)localObject).getTimestampOffsetUs() == -9223372036854775807L) {
        k = 1;
      } else {
        k = 0;
      }
      if ((k != 0) || ((((TimestampAdjuster)localObject).getTimestampOffsetUs() != 0L) && (((TimestampAdjuster)localObject).getFirstSampleTimestampUs() != paramLong2)))
      {
        ((TimestampAdjuster)localObject).reset();
        ((TimestampAdjuster)localObject).setFirstSampleTimestampUs(paramLong2);
      }
    }
    if (paramLong2 != 0L)
    {
      localObject = tsBinarySearchSeeker;
      if (localObject != null) {
        ((BinarySearchSeeker)localObject).setSeekTargetUs(paramLong2);
      }
    }
    tsPacketBuffer.reset();
    continuityCounters.clear();
    for (j = 0; j < tsPayloadReaders.size(); j++) {
      ((TsPayloadReader)tsPayloadReaders.valueAt(j)).seek();
    }
    bytesSinceLastSync = 0;
  }
  
  public boolean sniff(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    byte[] arrayOfByte = tsPacketBuffer.data;
    paramExtractorInput.peekFully(arrayOfByte, 0, 940);
    for (int i = 0; i < 188; i++)
    {
      for (int j = 0; j < 5; j++) {
        if (arrayOfByte[(j * 188 + i)] != 71)
        {
          j = 0;
          break label67;
        }
      }
      j = 1;
      label67:
      if (j != 0)
      {
        paramExtractorInput.skipFully(i);
        return true;
      }
    }
    return false;
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Mode {}
  
  public class PatReader
    implements SectionPayloadReader
  {
    private final ParsableBitArray patScratch = new ParsableBitArray(new byte[4]);
    
    public PatReader() {}
    
    public void consume(ParsableByteArray paramParsableByteArray)
    {
      if (paramParsableByteArray.readUnsignedByte() != 0) {
        return;
      }
      paramParsableByteArray.skipBytes(7);
      int i = paramParsableByteArray.bytesLeft() / 4;
      for (int j = 0; j < i; j++)
      {
        paramParsableByteArray.readBytes(patScratch, 4);
        int k = patScratch.readBits(16);
        patScratch.skipBits(3);
        if (k == 0)
        {
          patScratch.skipBits(13);
        }
        else
        {
          k = patScratch.readBits(13);
          TsExtractor.access$000(TsExtractor.this).put(k, new SectionReader(new TsExtractor.PmtReader(TsExtractor.this, k)));
          TsExtractor.access$108(TsExtractor.this);
        }
      }
      if (TsExtractor.access$200(TsExtractor.this) != 2) {
        TsExtractor.access$000(TsExtractor.this).remove(0);
      }
    }
    
    public void init(TimestampAdjuster paramTimestampAdjuster, ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator) {}
  }
  
  public class PmtReader
    implements SectionPayloadReader
  {
    private static final int TS_PMT_DESC_AC3 = 106;
    private static final int TS_PMT_DESC_DTS = 123;
    private static final int TS_PMT_DESC_DVBSUBS = 89;
    private static final int TS_PMT_DESC_EAC3 = 122;
    private static final int TS_PMT_DESC_ISO639_LANG = 10;
    private static final int TS_PMT_DESC_REGISTRATION = 5;
    private final int pid;
    private final ParsableBitArray pmtScratch = new ParsableBitArray(new byte[5]);
    private final SparseIntArray trackIdToPidScratch = new SparseIntArray();
    private final SparseArray<TsPayloadReader> trackIdToReaderScratch = new SparseArray();
    
    public PmtReader(int paramInt)
    {
      pid = paramInt;
    }
    
    private TsPayloadReader.EsInfo readEsInfo(ParsableByteArray paramParsableByteArray, int paramInt)
    {
      int i = paramParsableByteArray.getPosition();
      int j = paramInt + i;
      Object localObject1 = null;
      paramInt = -1;
      Object localObject4;
      for (Object localObject2 = null; paramParsableByteArray.getPosition() < j; localObject2 = localObject4)
      {
        int k = paramParsableByteArray.readUnsignedByte();
        int m = paramParsableByteArray.readUnsignedByte();
        m = paramParsableByteArray.getPosition() + m;
        if (k == 5)
        {
          long l = paramParsableByteArray.readUnsignedInt();
          if (l != TsExtractor.access$1100())
          {
            if (l == TsExtractor.access$1200()) {
              break label144;
            }
            localObject3 = localObject1;
            localObject4 = localObject2;
            if (l != TsExtractor.access$1300()) {
              break label294;
            }
            paramInt = 36;
            localObject3 = localObject1;
            localObject4 = localObject2;
            break label294;
          }
        }
        else
        {
          if (k != 106) {
            break label137;
          }
        }
        paramInt = 129;
        Object localObject3 = localObject1;
        localObject4 = localObject2;
        break label294;
        label137:
        if (k == 122)
        {
          label144:
          paramInt = 135;
          localObject3 = localObject1;
          localObject4 = localObject2;
        }
        else if (k == 123)
        {
          paramInt = 138;
          localObject3 = localObject1;
          localObject4 = localObject2;
        }
        else if (k == 10)
        {
          localObject3 = paramParsableByteArray.readString(3).trim();
          localObject4 = localObject2;
        }
        else
        {
          localObject3 = localObject1;
          localObject4 = localObject2;
          if (k == 89)
          {
            localObject4 = new ArrayList();
            while (paramParsableByteArray.getPosition() < m)
            {
              localObject3 = paramParsableByteArray.readString(3).trim();
              paramInt = paramParsableByteArray.readUnsignedByte();
              localObject2 = new byte[4];
              paramParsableByteArray.readBytes((byte[])localObject2, 0, 4);
              ((ArrayList)localObject4).add(new TsPayloadReader.DvbSubtitleInfo((String)localObject3, paramInt, (byte[])localObject2));
            }
            paramInt = 89;
            localObject3 = localObject1;
          }
        }
        label294:
        paramParsableByteArray.skipBytes(m - paramParsableByteArray.getPosition());
        localObject1 = localObject3;
      }
      paramParsableByteArray.setPosition(j);
      return new TsPayloadReader.EsInfo(paramInt, (String)localObject1, (List)localObject2, Arrays.copyOfRange(data, i, j));
    }
    
    public void consume(ParsableByteArray paramParsableByteArray)
    {
      if (paramParsableByteArray.readUnsignedByte() != 2) {
        return;
      }
      int i = TsExtractor.access$200(TsExtractor.this);
      int j = 0;
      TimestampAdjuster localTimestampAdjuster;
      if ((i != 1) && (TsExtractor.access$200(TsExtractor.this) != 2) && (TsExtractor.access$100(TsExtractor.this) != 1))
      {
        localTimestampAdjuster = new TimestampAdjuster(((TimestampAdjuster)TsExtractor.access$300(TsExtractor.this).get(0)).getFirstSampleTimestampUs());
        TsExtractor.access$300(TsExtractor.this).add(localTimestampAdjuster);
      }
      else
      {
        localTimestampAdjuster = (TimestampAdjuster)TsExtractor.access$300(TsExtractor.this).get(0);
      }
      paramParsableByteArray.skipBytes(2);
      int k = paramParsableByteArray.readUnsignedShort();
      paramParsableByteArray.skipBytes(3);
      paramParsableByteArray.readBytes(pmtScratch, 2);
      pmtScratch.skipBits(3);
      TsExtractor.access$402(TsExtractor.this, pmtScratch.readBits(13));
      paramParsableByteArray.readBytes(pmtScratch, 2);
      pmtScratch.skipBits(4);
      paramParsableByteArray.skipBytes(pmtScratch.readBits(12));
      Object localObject;
      if ((TsExtractor.access$200(TsExtractor.this) == 2) && (TsExtractor.access$500(TsExtractor.this) == null))
      {
        localObject = new TsPayloadReader.EsInfo(21, null, null, Util.EMPTY_BYTE_ARRAY);
        TsExtractor localTsExtractor = TsExtractor.this;
        TsExtractor.access$502(localTsExtractor, TsExtractor.access$600(localTsExtractor).createPayloadReader(21, (TsPayloadReader.EsInfo)localObject));
        TsExtractor.access$500(TsExtractor.this).init(localTimestampAdjuster, TsExtractor.access$700(TsExtractor.this), new TsPayloadReader.TrackIdGenerator(k, 21, 8192));
      }
      trackIdToReaderScratch.clear();
      trackIdToPidScratch.clear();
      int n;
      int i1;
      for (int m = paramParsableByteArray.bytesLeft(); m > 0; m = n)
      {
        paramParsableByteArray.readBytes(pmtScratch, 5);
        n = pmtScratch.readBits(8);
        pmtScratch.skipBits(3);
        i1 = pmtScratch.readBits(13);
        pmtScratch.skipBits(4);
        int i2 = pmtScratch.readBits(12);
        localObject = readEsInfo(paramParsableByteArray, i2);
        i = n;
        if (n == 6) {
          i = streamType;
        }
        n = m - (i2 + 5);
        if (TsExtractor.access$200(TsExtractor.this) == 2) {
          m = i;
        } else {
          m = i1;
        }
        if (!TsExtractor.access$800(TsExtractor.this).get(m))
        {
          if ((TsExtractor.access$200(TsExtractor.this) == 2) && (i == 21)) {
            localObject = TsExtractor.access$500(TsExtractor.this);
          } else {
            localObject = TsExtractor.access$600(TsExtractor.this).createPayloadReader(i, (TsPayloadReader.EsInfo)localObject);
          }
          if ((TsExtractor.access$200(TsExtractor.this) != 2) || (i1 < trackIdToPidScratch.get(m, 8192)))
          {
            trackIdToPidScratch.put(m, i1);
            trackIdToReaderScratch.put(m, localObject);
          }
        }
      }
      m = trackIdToPidScratch.size();
      for (i = 0; i < m; i++)
      {
        i1 = trackIdToPidScratch.keyAt(i);
        n = trackIdToPidScratch.valueAt(i);
        TsExtractor.access$800(TsExtractor.this).put(i1, true);
        TsExtractor.access$900(TsExtractor.this).put(n, true);
        paramParsableByteArray = (TsPayloadReader)trackIdToReaderScratch.valueAt(i);
        if (paramParsableByteArray != null)
        {
          if (paramParsableByteArray != TsExtractor.access$500(TsExtractor.this)) {
            paramParsableByteArray.init(localTimestampAdjuster, TsExtractor.access$700(TsExtractor.this), new TsPayloadReader.TrackIdGenerator(k, i1, 8192));
          }
          TsExtractor.access$000(TsExtractor.this).put(n, paramParsableByteArray);
        }
      }
      if (TsExtractor.access$200(TsExtractor.this) == 2)
      {
        if (!TsExtractor.access$1000(TsExtractor.this))
        {
          TsExtractor.access$700(TsExtractor.this).endTracks();
          TsExtractor.access$102(TsExtractor.this, 0);
          TsExtractor.access$1002(TsExtractor.this, true);
        }
      }
      else
      {
        TsExtractor.access$000(TsExtractor.this).remove(pid);
        paramParsableByteArray = TsExtractor.this;
        if (TsExtractor.access$200(paramParsableByteArray) == 1) {
          i = j;
        } else {
          i = TsExtractor.access$100(TsExtractor.this) - 1;
        }
        TsExtractor.access$102(paramParsableByteArray, i);
        if (TsExtractor.access$100(TsExtractor.this) == 0)
        {
          TsExtractor.access$700(TsExtractor.this).endTracks();
          TsExtractor.access$1002(TsExtractor.this, true);
        }
      }
    }
    
    public void init(TimestampAdjuster paramTimestampAdjuster, ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator) {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.TsExtractor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */