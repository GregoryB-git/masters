package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.ParserException;
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
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public final class PlayerEmsgHandler
  implements Handler.Callback
{
  private static final int EMSG_MANIFEST_EXPIRED = 2;
  private static final int EMSG_MEDIA_PRESENTATION_ENDED = 1;
  private final Allocator allocator;
  private final EventMessageDecoder decoder;
  private boolean dynamicMediaPresentationEnded;
  private long expiredManifestPublishTimeUs;
  private final Handler handler;
  private boolean isWaitingForManifestRefresh;
  private long lastLoadedChunkEndTimeBeforeRefreshUs;
  private long lastLoadedChunkEndTimeUs;
  private DashManifest manifest;
  private final TreeMap<Long, Long> manifestPublishTimeToExpiryTimeUs;
  private final PlayerEmsgCallback playerEmsgCallback;
  private boolean released;
  
  public PlayerEmsgHandler(DashManifest paramDashManifest, PlayerEmsgCallback paramPlayerEmsgCallback, Allocator paramAllocator)
  {
    manifest = paramDashManifest;
    playerEmsgCallback = paramPlayerEmsgCallback;
    allocator = paramAllocator;
    manifestPublishTimeToExpiryTimeUs = new TreeMap();
    handler = Util.createHandler(this);
    decoder = new EventMessageDecoder();
    lastLoadedChunkEndTimeUs = -9223372036854775807L;
    lastLoadedChunkEndTimeBeforeRefreshUs = -9223372036854775807L;
  }
  
  @Nullable
  private Map.Entry<Long, Long> ceilingExpiryEntryForPublishTime(long paramLong)
  {
    return manifestPublishTimeToExpiryTimeUs.ceilingEntry(Long.valueOf(paramLong));
  }
  
  private static long getManifestPublishTimeMsInEmsg(EventMessage paramEventMessage)
  {
    try
    {
      long l = Util.parseXsDateTime(Util.fromUtf8Bytes(messageData));
      return l;
    }
    catch (ParserException paramEventMessage) {}
    return -9223372036854775807L;
  }
  
  private void handleManifestExpiredMessage(long paramLong1, long paramLong2)
  {
    Long localLong = (Long)manifestPublishTimeToExpiryTimeUs.get(Long.valueOf(paramLong2));
    if (localLong == null) {
      manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(paramLong2), Long.valueOf(paramLong1));
    } else if (localLong.longValue() > paramLong1) {
      manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(paramLong2), Long.valueOf(paramLong1));
    }
  }
  
  private void handleMediaPresentationEndedMessageEncountered()
  {
    dynamicMediaPresentationEnded = true;
    notifySourceMediaPresentationEnded();
  }
  
  private static boolean isMessageSignalingMediaPresentationEnded(EventMessage paramEventMessage)
  {
    boolean bool;
    if ((presentationTimeUs == 0L) && (durationMs == 0L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isPlayerEmsgEvent(String paramString1, String paramString2)
  {
    boolean bool;
    if (("urn:mpeg:dash:event:2012".equals(paramString1)) && (("1".equals(paramString2)) || ("2".equals(paramString2)) || ("3".equals(paramString2)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void maybeNotifyDashManifestRefreshNeeded()
  {
    long l = lastLoadedChunkEndTimeBeforeRefreshUs;
    if ((l != -9223372036854775807L) && (l == lastLoadedChunkEndTimeUs)) {
      return;
    }
    isWaitingForManifestRefresh = true;
    lastLoadedChunkEndTimeBeforeRefreshUs = lastLoadedChunkEndTimeUs;
    playerEmsgCallback.onDashManifestRefreshRequested();
  }
  
  private void notifyManifestPublishTimeExpired()
  {
    playerEmsgCallback.onDashManifestPublishTimeExpired(expiredManifestPublishTimeUs);
  }
  
  private void notifySourceMediaPresentationEnded()
  {
    playerEmsgCallback.onDashLiveMediaPresentationEndSignalEncountered();
  }
  
  private void removePreviouslyExpiredManifestPublishTimeValues()
  {
    Iterator localIterator = manifestPublishTimeToExpiryTimeUs.entrySet().iterator();
    while (localIterator.hasNext()) {
      if (((Long)((Map.Entry)localIterator.next()).getKey()).longValue() < manifest.publishTimeMs) {
        localIterator.remove();
      }
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (released) {
      return true;
    }
    int i = what;
    if (i != 1)
    {
      if (i != 2) {
        return false;
      }
      paramMessage = (ManifestExpiryEventInfo)obj;
      handleManifestExpiredMessage(eventTimeUs, manifestPublishTimeMsInEmsg);
      return true;
    }
    handleMediaPresentationEndedMessageEncountered();
    return true;
  }
  
  public boolean maybeRefreshManifestBeforeLoadingNextChunk(long paramLong)
  {
    Object localObject = manifest;
    boolean bool1 = dynamic;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    if (isWaitingForManifestRefresh) {
      return true;
    }
    if (dynamicMediaPresentationEnded) {}
    for (;;)
    {
      bool1 = true;
      break;
      localObject = ceilingExpiryEntryForPublishTime(publishTimeMs);
      bool1 = bool2;
      if (localObject == null) {
        break;
      }
      bool1 = bool2;
      if (((Long)((Map.Entry)localObject).getValue()).longValue() >= paramLong) {
        break;
      }
      expiredManifestPublishTimeUs = ((Long)((Map.Entry)localObject).getKey()).longValue();
      notifyManifestPublishTimeExpired();
    }
    if (bool1) {
      maybeNotifyDashManifestRefreshNeeded();
    }
    return bool1;
  }
  
  public boolean maybeRefreshManifestOnLoadingError(Chunk paramChunk)
  {
    if (!manifest.dynamic) {
      return false;
    }
    if (isWaitingForManifestRefresh) {
      return true;
    }
    long l = lastLoadedChunkEndTimeUs;
    int i;
    if ((l != -9223372036854775807L) && (l < startTimeUs)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      maybeNotifyDashManifestRefreshNeeded();
      return true;
    }
    return false;
  }
  
  public PlayerTrackEmsgHandler newPlayerTrackEmsgHandler()
  {
    return new PlayerTrackEmsgHandler(new SampleQueue(allocator));
  }
  
  public void onChunkLoadCompleted(Chunk paramChunk)
  {
    long l = lastLoadedChunkEndTimeUs;
    if ((l != -9223372036854775807L) || (endTimeUs > l)) {
      lastLoadedChunkEndTimeUs = endTimeUs;
    }
  }
  
  public void release()
  {
    released = true;
    handler.removeCallbacksAndMessages(null);
  }
  
  public void updateManifest(DashManifest paramDashManifest)
  {
    isWaitingForManifestRefresh = false;
    expiredManifestPublishTimeUs = -9223372036854775807L;
    manifest = paramDashManifest;
    removePreviouslyExpiredManifestPublishTimeValues();
  }
  
  public static final class ManifestExpiryEventInfo
  {
    public final long eventTimeUs;
    public final long manifestPublishTimeMsInEmsg;
    
    public ManifestExpiryEventInfo(long paramLong1, long paramLong2)
    {
      eventTimeUs = paramLong1;
      manifestPublishTimeMsInEmsg = paramLong2;
    }
  }
  
  public static abstract interface PlayerEmsgCallback
  {
    public abstract void onDashLiveMediaPresentationEndSignalEncountered();
    
    public abstract void onDashManifestPublishTimeExpired(long paramLong);
    
    public abstract void onDashManifestRefreshRequested();
  }
  
  public final class PlayerTrackEmsgHandler
    implements TrackOutput
  {
    private final MetadataInputBuffer buffer;
    private final FormatHolder formatHolder;
    private final SampleQueue sampleQueue;
    
    public PlayerTrackEmsgHandler(SampleQueue paramSampleQueue)
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
      PlayerEmsgHandler.access$300(PlayerEmsgHandler.this).sendMessage(PlayerEmsgHandler.access$300(PlayerEmsgHandler.this).obtainMessage(2, localManifestExpiryEventInfo));
    }
    
    private void onMediaPresentationEndedMessageEncountered()
    {
      PlayerEmsgHandler.access$300(PlayerEmsgHandler.this).sendMessage(PlayerEmsgHandler.access$300(PlayerEmsgHandler.this).obtainMessage(1));
    }
    
    private void parseAndDiscardSamples()
    {
      while (sampleQueue.hasNextSample())
      {
        Object localObject = dequeueSample();
        if (localObject != null)
        {
          long l = timeUs;
          localObject = (EventMessage)PlayerEmsgHandler.access$000(PlayerEmsgHandler.this).decode((MetadataInputBuffer)localObject).get(0);
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
      return PlayerEmsgHandler.this.maybeRefreshManifestBeforeLoadingNextChunk(paramLong);
    }
    
    public boolean maybeRefreshManifestOnLoadingError(Chunk paramChunk)
    {
      return PlayerEmsgHandler.this.maybeRefreshManifestOnLoadingError(paramChunk);
    }
    
    public void onChunkLoadCompleted(Chunk paramChunk)
    {
      PlayerEmsgHandler.this.onChunkLoadCompleted(paramChunk);
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.PlayerEmsgHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */