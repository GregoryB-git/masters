package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TsExtractor$PmtReader
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
  
  public TsExtractor$PmtReader(TsExtractor paramTsExtractor, int paramInt)
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
    int i = TsExtractor.access$200(this$0);
    int j = 0;
    TimestampAdjuster localTimestampAdjuster;
    if ((i != 1) && (TsExtractor.access$200(this$0) != 2) && (TsExtractor.access$100(this$0) != 1))
    {
      localTimestampAdjuster = new TimestampAdjuster(((TimestampAdjuster)TsExtractor.access$300(this$0).get(0)).getFirstSampleTimestampUs());
      TsExtractor.access$300(this$0).add(localTimestampAdjuster);
    }
    else
    {
      localTimestampAdjuster = (TimestampAdjuster)TsExtractor.access$300(this$0).get(0);
    }
    paramParsableByteArray.skipBytes(2);
    int k = paramParsableByteArray.readUnsignedShort();
    paramParsableByteArray.skipBytes(3);
    paramParsableByteArray.readBytes(pmtScratch, 2);
    pmtScratch.skipBits(3);
    TsExtractor.access$402(this$0, pmtScratch.readBits(13));
    paramParsableByteArray.readBytes(pmtScratch, 2);
    pmtScratch.skipBits(4);
    paramParsableByteArray.skipBytes(pmtScratch.readBits(12));
    Object localObject;
    if ((TsExtractor.access$200(this$0) == 2) && (TsExtractor.access$500(this$0) == null))
    {
      localObject = new TsPayloadReader.EsInfo(21, null, null, Util.EMPTY_BYTE_ARRAY);
      TsExtractor localTsExtractor = this$0;
      TsExtractor.access$502(localTsExtractor, TsExtractor.access$600(localTsExtractor).createPayloadReader(21, (TsPayloadReader.EsInfo)localObject));
      TsExtractor.access$500(this$0).init(localTimestampAdjuster, TsExtractor.access$700(this$0), new TsPayloadReader.TrackIdGenerator(k, 21, 8192));
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
      if (TsExtractor.access$200(this$0) == 2) {
        m = i;
      } else {
        m = i1;
      }
      if (!TsExtractor.access$800(this$0).get(m))
      {
        if ((TsExtractor.access$200(this$0) == 2) && (i == 21)) {
          localObject = TsExtractor.access$500(this$0);
        } else {
          localObject = TsExtractor.access$600(this$0).createPayloadReader(i, (TsPayloadReader.EsInfo)localObject);
        }
        if ((TsExtractor.access$200(this$0) != 2) || (i1 < trackIdToPidScratch.get(m, 8192)))
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
      TsExtractor.access$800(this$0).put(i1, true);
      TsExtractor.access$900(this$0).put(n, true);
      paramParsableByteArray = (TsPayloadReader)trackIdToReaderScratch.valueAt(i);
      if (paramParsableByteArray != null)
      {
        if (paramParsableByteArray != TsExtractor.access$500(this$0)) {
          paramParsableByteArray.init(localTimestampAdjuster, TsExtractor.access$700(this$0), new TsPayloadReader.TrackIdGenerator(k, i1, 8192));
        }
        TsExtractor.access$000(this$0).put(n, paramParsableByteArray);
      }
    }
    if (TsExtractor.access$200(this$0) == 2)
    {
      if (!TsExtractor.access$1000(this$0))
      {
        TsExtractor.access$700(this$0).endTracks();
        TsExtractor.access$102(this$0, 0);
        TsExtractor.access$1002(this$0, true);
      }
    }
    else
    {
      TsExtractor.access$000(this$0).remove(pid);
      paramParsableByteArray = this$0;
      if (TsExtractor.access$200(paramParsableByteArray) == 1) {
        i = j;
      } else {
        i = TsExtractor.access$100(this$0) - 1;
      }
      TsExtractor.access$102(paramParsableByteArray, i);
      if (TsExtractor.access$100(this$0) == 0)
      {
        TsExtractor.access$700(this$0).endTracks();
        TsExtractor.access$1002(this$0, true);
      }
    }
  }
  
  public void init(TimestampAdjuster paramTimestampAdjuster, ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator) {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.TsExtractor.PmtReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */