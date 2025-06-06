package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap.Unseekable;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.text.webvtt.WebvttParserUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z2;

public final class WebvttExtractor
  implements Extractor
{
  private static final int HEADER_MAX_LENGTH = 9;
  private static final int HEADER_MIN_LENGTH = 6;
  private static final Pattern LOCAL_TIMESTAMP = Pattern.compile("LOCAL:([^,]+)");
  private static final Pattern MEDIA_TIMESTAMP = Pattern.compile("MPEGTS:(\\d+)");
  private final String language;
  private ExtractorOutput output;
  private byte[] sampleData;
  private final ParsableByteArray sampleDataWrapper;
  private int sampleSize;
  private final TimestampAdjuster timestampAdjuster;
  
  public WebvttExtractor(String paramString, TimestampAdjuster paramTimestampAdjuster)
  {
    language = paramString;
    timestampAdjuster = paramTimestampAdjuster;
    sampleDataWrapper = new ParsableByteArray();
    sampleData = new byte['Ѐ'];
  }
  
  private TrackOutput buildTrackOutput(long paramLong)
  {
    TrackOutput localTrackOutput = output.track(0, 3);
    localTrackOutput.format(Format.createTextSampleFormat(null, "text/vtt", null, -1, 0, language, null, paramLong));
    output.endTracks();
    return localTrackOutput;
  }
  
  private void processSample()
    throws ParserException
  {
    ParsableByteArray localParsableByteArray = new ParsableByteArray(sampleData);
    WebvttParserUtil.validateWebvttHeaderLine(localParsableByteArray);
    long l1 = 0L;
    long l2 = l1;
    for (;;)
    {
      localObject = localParsableByteArray.readLine();
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        break label138;
      }
      if (((String)localObject).startsWith("X-TIMESTAMP-MAP"))
      {
        Matcher localMatcher1 = LOCAL_TIMESTAMP.matcher((CharSequence)localObject);
        if (!localMatcher1.find()) {
          break label123;
        }
        Matcher localMatcher2 = MEDIA_TIMESTAMP.matcher((CharSequence)localObject);
        if (!localMatcher2.find()) {
          break;
        }
        l2 = WebvttParserUtil.parseTimestampUs(localMatcher1.group(1));
        l1 = TimestampAdjuster.ptsToUs(Long.parseLong(localMatcher2.group(1)));
      }
    }
    throw new ParserException(z2.o("X-TIMESTAMP-MAP doesn't contain media timestamp: ", (String)localObject));
    label123:
    throw new ParserException(z2.o("X-TIMESTAMP-MAP doesn't contain local timestamp: ", (String)localObject));
    label138:
    Object localObject = WebvttParserUtil.findNextCueHeader(localParsableByteArray);
    if (localObject == null)
    {
      buildTrackOutput(0L);
      return;
    }
    long l3 = WebvttParserUtil.parseTimestampUs(((Matcher)localObject).group(1));
    l2 = timestampAdjuster.adjustTsTimestamp(TimestampAdjuster.usToPts(l1 + l3 - l2));
    localObject = buildTrackOutput(l2 - l3);
    sampleDataWrapper.reset(sampleData, sampleSize);
    ((TrackOutput)localObject).sampleData(sampleDataWrapper, sampleSize);
    ((TrackOutput)localObject).sampleMetadata(l2, 1, sampleSize, 0, null);
  }
  
  public void init(ExtractorOutput paramExtractorOutput)
  {
    output = paramExtractorOutput;
    paramExtractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
  }
  
  public int read(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    int i = (int)paramExtractorInput.getLength();
    int j = sampleSize;
    paramPositionHolder = sampleData;
    if (j == paramPositionHolder.length)
    {
      if (i != -1) {
        j = i;
      } else {
        j = paramPositionHolder.length;
      }
      sampleData = Arrays.copyOf(paramPositionHolder, j * 3 / 2);
    }
    paramPositionHolder = sampleData;
    j = sampleSize;
    j = paramExtractorInput.read(paramPositionHolder, j, paramPositionHolder.length - j);
    if (j != -1)
    {
      j = sampleSize + j;
      sampleSize = j;
      if ((i == -1) || (j != i)) {
        return 0;
      }
    }
    processSample();
    return -1;
  }
  
  public void release() {}
  
  public void seek(long paramLong1, long paramLong2)
  {
    throw new IllegalStateException();
  }
  
  public boolean sniff(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    paramExtractorInput.peekFully(sampleData, 0, 6, false);
    sampleDataWrapper.reset(sampleData, 6);
    if (WebvttParserUtil.isWebvttHeaderLine(sampleDataWrapper)) {
      return true;
    }
    paramExtractorInput.peekFully(sampleData, 6, 3, false);
    sampleDataWrapper.reset(sampleData, 9);
    return WebvttParserUtil.isWebvttHeaderLine(sampleDataWrapper);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.WebvttExtractor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */