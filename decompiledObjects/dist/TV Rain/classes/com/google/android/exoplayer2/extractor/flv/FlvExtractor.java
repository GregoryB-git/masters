package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap.Unseekable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import z3;

public final class FlvExtractor
  implements Extractor
{
  public static final ExtractorsFactory FACTORY = new z3(13);
  private static final int FLV_HEADER_SIZE = 9;
  private static final int FLV_TAG = Util.getIntegerCodeForString("FLV");
  private static final int FLV_TAG_HEADER_SIZE = 11;
  private static final int STATE_READING_FLV_HEADER = 1;
  private static final int STATE_READING_TAG_DATA = 4;
  private static final int STATE_READING_TAG_HEADER = 3;
  private static final int STATE_SKIPPING_TO_TAG_HEADER = 2;
  private static final int TAG_TYPE_AUDIO = 8;
  private static final int TAG_TYPE_SCRIPT_DATA = 18;
  private static final int TAG_TYPE_VIDEO = 9;
  private AudioTagPayloadReader audioReader;
  private int bytesToNextTagHeader;
  private ExtractorOutput extractorOutput;
  private final ParsableByteArray headerBuffer = new ParsableByteArray(9);
  private long mediaTagTimestampOffsetUs = -9223372036854775807L;
  private final ScriptTagPayloadReader metadataReader = new ScriptTagPayloadReader();
  private boolean outputSeekMap;
  private final ParsableByteArray scratch = new ParsableByteArray(4);
  private int state = 1;
  private final ParsableByteArray tagData = new ParsableByteArray();
  private int tagDataSize;
  private final ParsableByteArray tagHeaderBuffer = new ParsableByteArray(11);
  private long tagTimestampUs;
  private int tagType;
  private VideoTagPayloadReader videoReader;
  
  private void ensureReadyForMediaOutput()
  {
    if (!outputSeekMap)
    {
      extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
      outputSeekMap = true;
    }
    if (mediaTagTimestampOffsetUs == -9223372036854775807L)
    {
      long l;
      if (metadataReader.getDurationUs() == -9223372036854775807L) {
        l = -tagTimestampUs;
      } else {
        l = 0L;
      }
      mediaTagTimestampOffsetUs = l;
    }
  }
  
  private ParsableByteArray prepareTagData(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    if (tagDataSize > tagData.capacity())
    {
      ParsableByteArray localParsableByteArray = tagData;
      localParsableByteArray.reset(new byte[Math.max(localParsableByteArray.capacity() * 2, tagDataSize)], 0);
    }
    else
    {
      tagData.setPosition(0);
    }
    tagData.setLimit(tagDataSize);
    paramExtractorInput.readFully(tagData.data, 0, tagDataSize);
    return tagData;
  }
  
  private boolean readFlvHeader(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    byte[] arrayOfByte = headerBuffer.data;
    int i = 0;
    if (!paramExtractorInput.readFully(arrayOfByte, 0, 9, true)) {
      return false;
    }
    headerBuffer.setPosition(0);
    headerBuffer.skipBytes(4);
    int j = headerBuffer.readUnsignedByte();
    int k;
    if ((j & 0x4) != 0) {
      k = 1;
    } else {
      k = 0;
    }
    if ((j & 0x1) != 0) {
      i = 1;
    }
    if ((k != 0) && (audioReader == null)) {
      audioReader = new AudioTagPayloadReader(extractorOutput.track(8, 1));
    }
    if ((i != 0) && (videoReader == null)) {
      videoReader = new VideoTagPayloadReader(extractorOutput.track(9, 2));
    }
    extractorOutput.endTracks();
    bytesToNextTagHeader = (headerBuffer.readInt() - 9 + 4);
    state = 2;
    return true;
  }
  
  private boolean readTagData(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    int i = tagType;
    boolean bool1 = true;
    boolean bool2;
    if ((i == 8) && (audioReader != null))
    {
      ensureReadyForMediaOutput();
      audioReader.consume(prepareTagData(paramExtractorInput), mediaTagTimestampOffsetUs + tagTimestampUs);
      bool2 = bool1;
    }
    else if ((i == 9) && (videoReader != null))
    {
      ensureReadyForMediaOutput();
      videoReader.consume(prepareTagData(paramExtractorInput), mediaTagTimestampOffsetUs + tagTimestampUs);
      bool2 = bool1;
    }
    else if ((i == 18) && (!outputSeekMap))
    {
      metadataReader.consume(prepareTagData(paramExtractorInput), tagTimestampUs);
      long l = metadataReader.getDurationUs();
      bool2 = bool1;
      if (l != -9223372036854775807L)
      {
        extractorOutput.seekMap(new SeekMap.Unseekable(l));
        outputSeekMap = true;
        bool2 = bool1;
      }
    }
    else
    {
      paramExtractorInput.skipFully(tagDataSize);
      bool2 = false;
    }
    bytesToNextTagHeader = 4;
    state = 2;
    return bool2;
  }
  
  private boolean readTagHeader(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    if (!paramExtractorInput.readFully(tagHeaderBuffer.data, 0, 11, true)) {
      return false;
    }
    tagHeaderBuffer.setPosition(0);
    tagType = tagHeaderBuffer.readUnsignedByte();
    tagDataSize = tagHeaderBuffer.readUnsignedInt24();
    tagTimestampUs = tagHeaderBuffer.readUnsignedInt24();
    tagTimestampUs = ((tagHeaderBuffer.readUnsignedByte() << 24 | tagTimestampUs) * 1000L);
    tagHeaderBuffer.skipBytes(3);
    state = 4;
    return true;
  }
  
  private void skipToTagHeader(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    paramExtractorInput.skipFully(bytesToNextTagHeader);
    bytesToNextTagHeader = 0;
    state = 3;
  }
  
  public void init(ExtractorOutput paramExtractorOutput)
  {
    extractorOutput = paramExtractorOutput;
  }
  
  public int read(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    do
    {
      for (;;)
      {
        int i = state;
        if (i == 1) {
          break;
        }
        if (i != 2)
        {
          if (i != 3)
          {
            if (i == 4)
            {
              if (readTagData(paramExtractorInput)) {
                return 0;
              }
            }
            else {
              throw new IllegalStateException();
            }
          }
          else if (!readTagHeader(paramExtractorInput)) {
            return -1;
          }
        }
        else {
          skipToTagHeader(paramExtractorInput);
        }
      }
    } while (readFlvHeader(paramExtractorInput));
    return -1;
  }
  
  public void release() {}
  
  public void seek(long paramLong1, long paramLong2)
  {
    state = 1;
    mediaTagTimestampOffsetUs = -9223372036854775807L;
    bytesToNextTagHeader = 0;
  }
  
  public boolean sniff(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    byte[] arrayOfByte = scratch.data;
    boolean bool = false;
    paramExtractorInput.peekFully(arrayOfByte, 0, 3);
    scratch.setPosition(0);
    if (scratch.readUnsignedInt24() != FLV_TAG) {
      return false;
    }
    paramExtractorInput.peekFully(scratch.data, 0, 2);
    scratch.setPosition(0);
    if ((scratch.readUnsignedShort() & 0xFA) != 0) {
      return false;
    }
    paramExtractorInput.peekFully(scratch.data, 0, 4);
    scratch.setPosition(0);
    int i = scratch.readInt();
    paramExtractorInput.resetPeekPosition();
    paramExtractorInput.advancePeekPosition(i);
    paramExtractorInput.peekFully(scratch.data, 0, 4);
    scratch.setPosition(0);
    if (scratch.readInt() == 0) {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.flv.FlvExtractor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */