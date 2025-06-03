package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.MetadataDecoder;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class SpliceInfoDecoder
  implements MetadataDecoder
{
  private static final int TYPE_PRIVATE_COMMAND = 255;
  private static final int TYPE_SPLICE_INSERT = 5;
  private static final int TYPE_SPLICE_NULL = 0;
  private static final int TYPE_SPLICE_SCHEDULE = 4;
  private static final int TYPE_TIME_SIGNAL = 6;
  private final ParsableByteArray sectionData = new ParsableByteArray();
  private final ParsableBitArray sectionHeader = new ParsableBitArray();
  private TimestampAdjuster timestampAdjuster;
  
  public Metadata decode(MetadataInputBuffer paramMetadataInputBuffer)
  {
    Object localObject = timestampAdjuster;
    if ((localObject == null) || (subsampleOffsetUs != ((TimestampAdjuster)localObject).getTimestampOffsetUs()))
    {
      localObject = new TimestampAdjuster(timeUs);
      timestampAdjuster = ((TimestampAdjuster)localObject);
      ((TimestampAdjuster)localObject).adjustSampleTimestamp(timeUs - subsampleOffsetUs);
    }
    paramMetadataInputBuffer = data;
    localObject = paramMetadataInputBuffer.array();
    int i = paramMetadataInputBuffer.limit();
    sectionData.reset((byte[])localObject, i);
    sectionHeader.reset((byte[])localObject, i);
    sectionHeader.skipBits(39);
    long l = sectionHeader.readBits(1) << 32 | sectionHeader.readBits(32);
    sectionHeader.skipBits(20);
    int j = sectionHeader.readBits(12);
    i = sectionHeader.readBits(8);
    paramMetadataInputBuffer = null;
    sectionData.skipBytes(14);
    if (i != 0)
    {
      if (i != 255)
      {
        if (i != 4)
        {
          if (i != 5)
          {
            if (i == 6) {
              paramMetadataInputBuffer = TimeSignalCommand.parseFromSection(sectionData, l, timestampAdjuster);
            }
          }
          else {
            paramMetadataInputBuffer = SpliceInsertCommand.parseFromSection(sectionData, l, timestampAdjuster);
          }
        }
        else {
          paramMetadataInputBuffer = SpliceScheduleCommand.parseFromSection(sectionData);
        }
      }
      else {
        paramMetadataInputBuffer = PrivateCommand.parseFromSection(sectionData, j, l);
      }
    }
    else {
      paramMetadataInputBuffer = new SpliceNullCommand();
    }
    if (paramMetadataInputBuffer == null) {
      paramMetadataInputBuffer = new Metadata(new Metadata.Entry[0]);
    } else {
      paramMetadataInputBuffer = new Metadata(new Metadata.Entry[] { paramMetadataInputBuffer });
    }
    return paramMetadataInputBuffer;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.SpliceInfoDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */