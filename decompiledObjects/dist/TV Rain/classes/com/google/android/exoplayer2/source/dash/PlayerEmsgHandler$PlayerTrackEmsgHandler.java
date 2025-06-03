package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput.CryptoData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

public final class PlayerEmsgHandler$PlayerTrackEmsgHandler
  implements TrackOutput
{
  private final MetadataInputBuffer buffer;
  private final FormatHolder formatHolder;
  private final SampleQueue sampleQueue;
  
  public PlayerEmsgHandler$PlayerTrackEmsgHandler(PlayerEmsgHandler paramPlayerEmsgHandler, SampleQueue paramSampleQueue)
  {
    sampleQueue = paramSampleQueue;
    formatHolder = new FormatHolder();
    buffer = new MetadataInputBuffer();
  }
  
  @Nullable
  private MetadataInputBuffer dequeueSample()
  {
    buffer.clear();
    if (sampleQueue.read(formatHolder, buffer, false, false, 0L) == -4)
    {
      buffer.flip();
      return buffer;
    }
    return null;
  }
  
  private void onManifestExpiredMessageEncountered(long paramLong1, long paramLong2)
  {
    PlayerEmsgHandler.ManifestExpiryEventInfo localManifestExpiryEventInfo = new PlayerEmsgHandler.ManifestExpiryEventInfo(paramLong1, paramLong2);
    PlayerEmsgHandler.access$300(this$0).sendMessage(PlayerEmsgHandler.access$300(this$0).obtainMessage(2, localManifestExpiryEventInfo));
  }
  
  private void onMediaPresentationEndedMessageEncountered()
  {
    PlayerEmsgHandler.access$300(this$0).sendMessage(PlayerEmsgHandler.access$300(this$0).obtainMessage(1));
  }
  
  private void parseAndDiscardSamples()
  {
    while (sampleQueue.hasNextSample())
    {
      Object localObject = dequeueSample();
      if (localObject != null)
      {
        long l = timeUs;
        localObject = (EventMessage)PlayerEmsgHandler.access$000(this$0).decode((MetadataInputBuffer)localObject).get(0);
        if (PlayerEmsgHandler.isPlayerEmsgEvent(schemeIdUri, value)) {
          parsePlayerEmsgEvent(l, (EventMessage)localObject);
        }
      }
    }
    sampleQueue.discardToRead();
  }
  
  private void parsePlayerEmsgEvent(long paramLong, EventMessage paramEventMessage)
  {
    long l = PlayerEmsgHandler.access$100(paramEventMessage);
    if (l == -9223372036854775807L) {
      return;
    }
    if (PlayerEmsgHandler.access$200(paramEventMessage)) {
      onMediaPresentationEndedMessageEncountered();
    } else {
      onManifestExpiredMessageEncountered(paramLong, l);
    }
  }
  
  public void format(Format paramFormat)
  {
    sampleQueue.format(paramFormat);
  }
  
  public boolean maybeRefreshManifestBeforeLoadingNextChunk(long paramLong)
  {
    return this$0.maybeRefreshManifestBeforeLoadingNextChunk(paramLong);
  }
  
  public boolean maybeRefreshManifestOnLoadingError(Chunk paramChunk)
  {
    return this$0.maybeRefreshManifestOnLoadingError(paramChunk);
  }
  
  public void onChunkLoadCompleted(Chunk paramChunk)
  {
    this$0.onChunkLoadCompleted(paramChunk);
  }
  
  public void release()
  {
    sampleQueue.reset();
  }
  
  public int sampleData(ExtractorInput paramExtractorInput, int paramInt, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    return sampleQueue.sampleData(paramExtractorInput, paramInt, paramBoolean);
  }
  
  public void sampleData(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    sampleQueue.sampleData(paramParsableByteArray, paramInt);
  }
  
  public void sampleMetadata(long paramLong, int paramInt1, int paramInt2, int paramInt3, @Nullable TrackOutput.CryptoData paramCryptoData)
  {
    sampleQueue.sampleMetadata(paramLong, paramInt1, paramInt2, paramInt3, paramCryptoData);
    parseAndDiscardSamples();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */