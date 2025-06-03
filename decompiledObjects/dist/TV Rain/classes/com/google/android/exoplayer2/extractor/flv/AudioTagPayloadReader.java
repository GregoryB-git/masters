package com.google.android.exoplayer2.extractor.flv;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import z2;

final class AudioTagPayloadReader
  extends TagPayloadReader
{
  private static final int AAC_PACKET_TYPE_AAC_RAW = 1;
  private static final int AAC_PACKET_TYPE_SEQUENCE_HEADER = 0;
  private static final int AUDIO_FORMAT_AAC = 10;
  private static final int AUDIO_FORMAT_ALAW = 7;
  private static final int AUDIO_FORMAT_MP3 = 2;
  private static final int AUDIO_FORMAT_ULAW = 8;
  private static final int[] AUDIO_SAMPLING_RATE_TABLE = { 5512, 11025, 22050, 44100 };
  private int audioFormat;
  private boolean hasOutputFormat;
  private boolean hasParsedAudioDataHeader;
  
  public AudioTagPayloadReader(TrackOutput paramTrackOutput)
  {
    super(paramTrackOutput);
  }
  
  public boolean parseHeader(ParsableByteArray paramParsableByteArray)
    throws TagPayloadReader.UnsupportedFormatException
  {
    if (!hasParsedAudioDataHeader)
    {
      int i = paramParsableByteArray.readUnsignedByte();
      int j = i >> 4 & 0xF;
      audioFormat = j;
      if (j == 2)
      {
        paramParsableByteArray = Format.createAudioSampleFormat(null, "audio/mpeg", null, -1, -1, 1, AUDIO_SAMPLING_RATE_TABLE[(i >> 2 & 0x3)], null, null, 0, null);
        output.format(paramParsableByteArray);
        hasOutputFormat = true;
      }
      else if ((j != 7) && (j != 8))
      {
        if (j != 10)
        {
          paramParsableByteArray = z2.t("Audio format not supported: ");
          paramParsableByteArray.append(audioFormat);
          throw new TagPayloadReader.UnsupportedFormatException(paramParsableByteArray.toString());
        }
      }
      else
      {
        if (j == 7) {
          paramParsableByteArray = "audio/g711-alaw";
        } else {
          paramParsableByteArray = "audio/g711-mlaw";
        }
        if ((i & 0x1) == 1) {
          j = 2;
        } else {
          j = 3;
        }
        paramParsableByteArray = Format.createAudioSampleFormat(null, paramParsableByteArray, null, -1, -1, 1, 8000, j, null, null, 0, null);
        output.format(paramParsableByteArray);
        hasOutputFormat = true;
      }
      hasParsedAudioDataHeader = true;
    }
    else
    {
      paramParsableByteArray.skipBytes(1);
    }
    return true;
  }
  
  public void parsePayload(ParsableByteArray paramParsableByteArray, long paramLong)
    throws ParserException
  {
    int i;
    if (audioFormat == 2)
    {
      i = paramParsableByteArray.bytesLeft();
      output.sampleData(paramParsableByteArray, i);
      output.sampleMetadata(paramLong, 1, i, 0, null);
    }
    else
    {
      i = paramParsableByteArray.readUnsignedByte();
      if ((i == 0) && (!hasOutputFormat))
      {
        i = paramParsableByteArray.bytesLeft();
        byte[] arrayOfByte = new byte[i];
        paramParsableByteArray.readBytes(arrayOfByte, 0, i);
        paramParsableByteArray = CodecSpecificDataUtil.parseAacAudioSpecificConfig(arrayOfByte);
        paramParsableByteArray = Format.createAudioSampleFormat(null, "audio/mp4a-latm", null, -1, -1, ((Integer)second).intValue(), ((Integer)first).intValue(), Collections.singletonList(arrayOfByte), null, 0, null);
        output.format(paramParsableByteArray);
        hasOutputFormat = true;
      }
      else if ((audioFormat != 10) || (i == 1))
      {
        i = paramParsableByteArray.bytesLeft();
        output.sampleData(paramParsableByteArray, i);
        output.sampleMetadata(paramLong, 1, i, 0, null);
      }
    }
  }
  
  public void seek() {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.flv.AudioTagPayloadReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */