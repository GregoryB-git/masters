package com.google.android.exoplayer2.source.hls;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaPeriod.Callback;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.SequenceableLoader.Callback;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import z2;

public final class HlsMediaPeriod
  implements MediaPeriod, HlsSampleStreamWrapper.Callback, HlsPlaylistTracker.PlaylistEventListener
{
  private final Allocator allocator;
  private final boolean allowChunklessPreparation;
  @Nullable
  private MediaPeriod.Callback callback;
  private SequenceableLoader compositeSequenceableLoader;
  private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
  private final HlsDataSourceFactory dataSourceFactory;
  private HlsSampleStreamWrapper[] enabledSampleStreamWrappers;
  private final MediaSourceEventListener.EventDispatcher eventDispatcher;
  private final HlsExtractorFactory extractorFactory;
  private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
  @Nullable
  private final TransferListener mediaTransferListener;
  private boolean notifiedReadingStarted;
  private int pendingPrepareCount;
  private final HlsPlaylistTracker playlistTracker;
  private HlsSampleStreamWrapper[] sampleStreamWrappers;
  private final IdentityHashMap<SampleStream, Integer> streamWrapperIndices;
  private final TimestampAdjusterProvider timestampAdjusterProvider;
  private TrackGroupArray trackGroups;
  
  public HlsMediaPeriod(HlsExtractorFactory paramHlsExtractorFactory, HlsPlaylistTracker paramHlsPlaylistTracker, HlsDataSourceFactory paramHlsDataSourceFactory, @Nullable TransferListener paramTransferListener, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher paramEventDispatcher, Allocator paramAllocator, CompositeSequenceableLoaderFactory paramCompositeSequenceableLoaderFactory, boolean paramBoolean)
  {
    extractorFactory = paramHlsExtractorFactory;
    playlistTracker = paramHlsPlaylistTracker;
    dataSourceFactory = paramHlsDataSourceFactory;
    mediaTransferListener = paramTransferListener;
    loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
    eventDispatcher = paramEventDispatcher;
    allocator = paramAllocator;
    compositeSequenceableLoaderFactory = paramCompositeSequenceableLoaderFactory;
    allowChunklessPreparation = paramBoolean;
    compositeSequenceableLoader = paramCompositeSequenceableLoaderFactory.createCompositeSequenceableLoader(new SequenceableLoader[0]);
    streamWrapperIndices = new IdentityHashMap();
    timestampAdjusterProvider = new TimestampAdjusterProvider();
    sampleStreamWrappers = new HlsSampleStreamWrapper[0];
    enabledSampleStreamWrappers = new HlsSampleStreamWrapper[0];
    paramEventDispatcher.mediaPeriodCreated();
  }
  
  private void buildAndPrepareMainSampleStreamWrapper(HlsMasterPlaylist paramHlsMasterPlaylist, long paramLong)
  {
    Object localObject1 = new ArrayList(variants);
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = new ArrayList();
    for (int i = 0; i < ((ArrayList)localObject1).size(); i++)
    {
      localObject3 = (HlsMasterPlaylist.HlsUrl)((ArrayList)localObject1).get(i);
      localObject4 = format;
      if ((height <= 0) && (Util.getCodecsOfType(codecs, 2) == null))
      {
        if (Util.getCodecsOfType(codecs, 1) != null) {
          ((ArrayList)localObject2).add(localObject3);
        }
      }
      else {
        localArrayList.add(localObject3);
      }
    }
    if (!localArrayList.isEmpty()) {
      localObject1 = localArrayList;
    } else if (((ArrayList)localObject2).size() < ((ArrayList)localObject1).size()) {
      ((ArrayList)localObject1).removeAll((Collection)localObject2);
    }
    Assertions.checkArgument(((List)localObject1).isEmpty() ^ true);
    Object localObject4 = (HlsMasterPlaylist.HlsUrl[])((List)localObject1).toArray(new HlsMasterPlaylist.HlsUrl[0]);
    Object localObject3 = 0format.codecs;
    localObject2 = buildSampleStreamWrapper(0, (HlsMasterPlaylist.HlsUrl[])localObject4, muxedAudioFormat, muxedCaptionFormats, paramLong);
    sampleStreamWrappers[0] = localObject2;
    if ((allowChunklessPreparation) && (localObject3 != null))
    {
      int j;
      if (Util.getCodecsOfType((String)localObject3, 2) != null) {
        j = 1;
      } else {
        j = 0;
      }
      if (Util.getCodecsOfType((String)localObject3, 1) != null) {
        i = 1;
      } else {
        i = 0;
      }
      localArrayList = new ArrayList();
      if (j != 0)
      {
        int k = ((List)localObject1).size();
        localObject1 = new Format[k];
        for (j = 0; j < k; j++) {
          localObject1[j] = deriveVideoFormat(format);
        }
        localArrayList.add(new TrackGroup((Format[])localObject1));
        if ((i != 0) && ((muxedAudioFormat != null) || (audios.isEmpty()))) {
          localArrayList.add(new TrackGroup(new Format[] { deriveAudioFormat(0format, muxedAudioFormat, false) }));
        }
        paramHlsMasterPlaylist = muxedCaptionFormats;
        if (paramHlsMasterPlaylist != null) {
          for (i = 0; i < paramHlsMasterPlaylist.size(); i++) {
            localArrayList.add(new TrackGroup(new Format[] { (Format)paramHlsMasterPlaylist.get(i) }));
          }
        }
      }
      else
      {
        if (i == 0) {
          break label617;
        }
        j = ((List)localObject1).size();
        localObject1 = new Format[j];
        for (i = 0; i < j; i++) {
          localObject1[i] = deriveAudioFormat(format, muxedAudioFormat, true);
        }
        localArrayList.add(new TrackGroup((Format[])localObject1));
      }
      paramHlsMasterPlaylist = new TrackGroup(new Format[] { Format.createSampleFormat("ID3", "application/id3", null, -1, null) });
      localArrayList.add(paramHlsMasterPlaylist);
      ((HlsSampleStreamWrapper)localObject2).prepareWithMasterPlaylistInfo(new TrackGroupArray((TrackGroup[])localArrayList.toArray(new TrackGroup[0])), 0, new TrackGroupArray(new TrackGroup[] { paramHlsMasterPlaylist }));
      return;
      label617:
      throw new IllegalArgumentException(z2.o("Unexpected codecs attribute: ", (String)localObject3));
    }
    else
    {
      ((HlsSampleStreamWrapper)localObject2).setIsTimestampMaster(true);
      ((HlsSampleStreamWrapper)localObject2).continuePreparing();
    }
  }
  
  private void buildAndPrepareSampleStreamWrappers(long paramLong)
  {
    Object localObject1 = playlistTracker.getMasterPlaylist();
    Object localObject2 = audios;
    List localList = subtitles;
    int i = ((List)localObject2).size();
    i = localList.size() + (i + 1);
    sampleStreamWrappers = new HlsSampleStreamWrapper[i];
    pendingPrepareCount = i;
    buildAndPrepareMainSampleStreamWrapper((HlsMasterPlaylist)localObject1, paramLong);
    i = 1;
    int j = 0;
    while (j < ((List)localObject2).size())
    {
      localObject1 = (HlsMasterPlaylist.HlsUrl)((List)localObject2).get(j);
      Object localObject3 = Collections.emptyList();
      localObject3 = buildSampleStreamWrapper(1, new HlsMasterPlaylist.HlsUrl[] { localObject1 }, null, (List)localObject3, paramLong);
      sampleStreamWrappers[i] = localObject3;
      Format localFormat = format;
      if ((allowChunklessPreparation) && (codecs != null)) {
        ((HlsSampleStreamWrapper)localObject3).prepareWithMasterPlaylistInfo(new TrackGroupArray(new TrackGroup[] { new TrackGroup(new Format[] { format }) }), 0, TrackGroupArray.EMPTY);
      } else {
        ((HlsSampleStreamWrapper)localObject3).continuePreparing();
      }
      j++;
      i++;
    }
    j = 0;
    while (j < localList.size())
    {
      localObject2 = (HlsMasterPlaylist.HlsUrl)localList.get(j);
      localObject1 = Collections.emptyList();
      localObject1 = buildSampleStreamWrapper(3, new HlsMasterPlaylist.HlsUrl[] { localObject2 }, null, (List)localObject1, paramLong);
      sampleStreamWrappers[i] = localObject1;
      ((HlsSampleStreamWrapper)localObject1).prepareWithMasterPlaylistInfo(new TrackGroupArray(new TrackGroup[] { new TrackGroup(new Format[] { format }) }), 0, TrackGroupArray.EMPTY);
      j++;
      i++;
    }
    enabledSampleStreamWrappers = sampleStreamWrappers;
  }
  
  private HlsSampleStreamWrapper buildSampleStreamWrapper(int paramInt, HlsMasterPlaylist.HlsUrl[] paramArrayOfHlsUrl, Format paramFormat, List<Format> paramList, long paramLong)
  {
    return new HlsSampleStreamWrapper(paramInt, this, new HlsChunkSource(extractorFactory, playlistTracker, paramArrayOfHlsUrl, dataSourceFactory, mediaTransferListener, timestampAdjusterProvider, paramList), allocator, paramLong, paramFormat, loadErrorHandlingPolicy, eventDispatcher);
  }
  
  private static Format deriveAudioFormat(Format paramFormat1, Format paramFormat2, boolean paramBoolean)
  {
    int i = -1;
    String str1;
    int j;
    int k;
    Object localObject;
    if (paramFormat2 != null)
    {
      str1 = codecs;
      j = channelCount;
      k = selectionFlags;
      localObject = language;
      paramFormat2 = label;
    }
    else
    {
      str1 = Util.getCodecsOfType(codecs, 1);
      if (paramBoolean)
      {
        j = channelCount;
        k = selectionFlags;
        paramFormat2 = label;
        localObject = paramFormat2;
      }
      else
      {
        k = 0;
        paramFormat2 = null;
        localObject = paramFormat2;
        j = -1;
      }
    }
    String str2 = MimeTypes.getMediaMimeType(str1);
    if (paramBoolean) {
      i = bitrate;
    }
    return Format.createAudioContainerFormat(id, paramFormat2, containerMimeType, str2, str1, i, j, -1, null, k, (String)localObject);
  }
  
  private static Format deriveVideoFormat(Format paramFormat)
  {
    String str1 = Util.getCodecsOfType(codecs, 2);
    String str2 = MimeTypes.getMediaMimeType(str1);
    return Format.createVideoContainerFormat(id, label, containerMimeType, str2, str1, bitrate, width, height, frameRate, null, selectionFlags);
  }
  
  public boolean continueLoading(long paramLong)
  {
    if (trackGroups == null)
    {
      HlsSampleStreamWrapper[] arrayOfHlsSampleStreamWrapper = sampleStreamWrappers;
      int i = arrayOfHlsSampleStreamWrapper.length;
      for (int j = 0; j < i; j++) {
        arrayOfHlsSampleStreamWrapper[j].continuePreparing();
      }
      return false;
    }
    return compositeSequenceableLoader.continueLoading(paramLong);
  }
  
  public void discardBuffer(long paramLong, boolean paramBoolean)
  {
    HlsSampleStreamWrapper[] arrayOfHlsSampleStreamWrapper = enabledSampleStreamWrappers;
    int i = arrayOfHlsSampleStreamWrapper.length;
    for (int j = 0; j < i; j++) {
      arrayOfHlsSampleStreamWrapper[j].discardBuffer(paramLong, paramBoolean);
    }
  }
  
  public long getAdjustedSeekPositionUs(long paramLong, SeekParameters paramSeekParameters)
  {
    return paramLong;
  }
  
  public long getBufferedPositionUs()
  {
    return compositeSequenceableLoader.getBufferedPositionUs();
  }
  
  public long getNextLoadPositionUs()
  {
    return compositeSequenceableLoader.getNextLoadPositionUs();
  }
  
  public TrackGroupArray getTrackGroups()
  {
    return trackGroups;
  }
  
  public void maybeThrowPrepareError()
    throws IOException
  {
    HlsSampleStreamWrapper[] arrayOfHlsSampleStreamWrapper = sampleStreamWrappers;
    int i = arrayOfHlsSampleStreamWrapper.length;
    for (int j = 0; j < i; j++) {
      arrayOfHlsSampleStreamWrapper[j].maybeThrowPrepareError();
    }
  }
  
  public void onContinueLoadingRequested(HlsSampleStreamWrapper paramHlsSampleStreamWrapper)
  {
    callback.onContinueLoadingRequested(this);
  }
  
  public void onPlaylistChanged()
  {
    callback.onContinueLoadingRequested(this);
  }
  
  public boolean onPlaylistError(HlsMasterPlaylist.HlsUrl paramHlsUrl, long paramLong)
  {
    HlsSampleStreamWrapper[] arrayOfHlsSampleStreamWrapper = sampleStreamWrappers;
    int i = arrayOfHlsSampleStreamWrapper.length;
    boolean bool = true;
    for (int j = 0; j < i; j++) {
      bool &= arrayOfHlsSampleStreamWrapper[j].onPlaylistError(paramHlsUrl, paramLong);
    }
    callback.onContinueLoadingRequested(this);
    return bool;
  }
  
  public void onPlaylistRefreshRequired(HlsMasterPlaylist.HlsUrl paramHlsUrl)
  {
    playlistTracker.refreshPlaylist(paramHlsUrl);
  }
  
  public void onPrepared()
  {
    int i = pendingPrepareCount - 1;
    pendingPrepareCount = i;
    if (i > 0) {
      return;
    }
    HlsSampleStreamWrapper[] arrayOfHlsSampleStreamWrapper1 = sampleStreamWrappers;
    int j = arrayOfHlsSampleStreamWrapper1.length;
    int k = 0;
    i = k;
    while (k < j)
    {
      i += getTrackGroupslength;
      k++;
    }
    TrackGroup[] arrayOfTrackGroup = new TrackGroup[i];
    HlsSampleStreamWrapper[] arrayOfHlsSampleStreamWrapper2 = sampleStreamWrappers;
    int m = arrayOfHlsSampleStreamWrapper2.length;
    i = 0;
    k = i;
    while (i < m)
    {
      arrayOfHlsSampleStreamWrapper1 = arrayOfHlsSampleStreamWrapper2[i];
      int n = getTrackGroupslength;
      j = 0;
      while (j < n)
      {
        arrayOfTrackGroup[k] = arrayOfHlsSampleStreamWrapper1.getTrackGroups().get(j);
        j++;
        k++;
      }
      i++;
    }
    trackGroups = new TrackGroupArray(arrayOfTrackGroup);
    callback.onPrepared(this);
  }
  
  public void prepare(MediaPeriod.Callback paramCallback, long paramLong)
  {
    callback = paramCallback;
    playlistTracker.addListener(this);
    buildAndPrepareSampleStreamWrappers(paramLong);
  }
  
  public long readDiscontinuity()
  {
    if (!notifiedReadingStarted)
    {
      eventDispatcher.readingStarted();
      notifiedReadingStarted = true;
    }
    return -9223372036854775807L;
  }
  
  public void reevaluateBuffer(long paramLong)
  {
    compositeSequenceableLoader.reevaluateBuffer(paramLong);
  }
  
  public void release()
  {
    playlistTracker.removeListener(this);
    HlsSampleStreamWrapper[] arrayOfHlsSampleStreamWrapper = sampleStreamWrappers;
    int i = arrayOfHlsSampleStreamWrapper.length;
    for (int j = 0; j < i; j++) {
      arrayOfHlsSampleStreamWrapper[j].release();
    }
    callback = null;
    eventDispatcher.mediaPeriodReleased();
  }
  
  public long seekToUs(long paramLong)
  {
    HlsSampleStreamWrapper[] arrayOfHlsSampleStreamWrapper = enabledSampleStreamWrappers;
    if (arrayOfHlsSampleStreamWrapper.length > 0)
    {
      boolean bool = arrayOfHlsSampleStreamWrapper[0].seekToUs(paramLong, false);
      for (int i = 1;; i++)
      {
        arrayOfHlsSampleStreamWrapper = enabledSampleStreamWrappers;
        if (i >= arrayOfHlsSampleStreamWrapper.length) {
          break;
        }
        arrayOfHlsSampleStreamWrapper[i].seekToUs(paramLong, bool);
      }
      if (bool) {
        timestampAdjusterProvider.reset();
      }
    }
    return paramLong;
  }
  
  public long selectTracks(TrackSelection[] paramArrayOfTrackSelection, boolean[] paramArrayOfBoolean1, SampleStream[] paramArrayOfSampleStream, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    int[] arrayOfInt1 = new int[paramArrayOfTrackSelection.length];
    int[] arrayOfInt2 = new int[paramArrayOfTrackSelection.length];
    for (int i = 0; i < paramArrayOfTrackSelection.length; i++)
    {
      localObject1 = paramArrayOfSampleStream[i];
      if (localObject1 == null) {
        j = -1;
      } else {
        j = ((Integer)streamWrapperIndices.get(localObject1)).intValue();
      }
      arrayOfInt1[i] = j;
      arrayOfInt2[i] = -1;
      localObject1 = paramArrayOfTrackSelection[i];
      if (localObject1 != null)
      {
        localObject1 = ((TrackSelection)localObject1).getTrackGroup();
        for (j = 0;; j++)
        {
          arrayOfHlsSampleStreamWrapper = sampleStreamWrappers;
          if (j >= arrayOfHlsSampleStreamWrapper.length) {
            break;
          }
          if (arrayOfHlsSampleStreamWrapper[j].getTrackGroups().indexOf((TrackGroup)localObject1) != -1)
          {
            arrayOfInt2[i] = j;
            break;
          }
        }
      }
    }
    streamWrapperIndices.clear();
    int k = paramArrayOfTrackSelection.length;
    SampleStream[] arrayOfSampleStream1 = new SampleStream[k];
    SampleStream[] arrayOfSampleStream2 = new SampleStream[paramArrayOfTrackSelection.length];
    Object localObject1 = new TrackSelection[paramArrayOfTrackSelection.length];
    HlsSampleStreamWrapper[] arrayOfHlsSampleStreamWrapper = new HlsSampleStreamWrapper[sampleStreamWrappers.length];
    i = 0;
    int j = 0;
    boolean bool1 = false;
    Object localObject2;
    for (;;)
    {
      localObject2 = paramArrayOfSampleStream;
      if (j >= sampleStreamWrappers.length) {
        break;
      }
      Object localObject4;
      for (int m = 0; m < paramArrayOfTrackSelection.length; m++)
      {
        n = arrayOfInt1[m];
        Object localObject3 = null;
        if (n == j) {
          localObject4 = localObject2[m];
        } else {
          localObject4 = null;
        }
        arrayOfSampleStream2[m] = localObject4;
        localObject4 = localObject3;
        if (arrayOfInt2[m] == j) {
          localObject4 = paramArrayOfTrackSelection[m];
        }
        localObject1[m] = localObject4;
      }
      localObject2 = sampleStreamWrappers[j];
      boolean bool2 = ((HlsSampleStreamWrapper)localObject2).selectTracks((TrackSelection[])localObject1, paramArrayOfBoolean1, arrayOfSampleStream2, paramArrayOfBoolean2, paramLong, bool1);
      int n = 0;
      int i1;
      for (m = 0;; m = i1)
      {
        i1 = paramArrayOfTrackSelection.length;
        boolean bool3 = true;
        if (n >= i1) {
          break;
        }
        if (arrayOfInt2[n] == j)
        {
          if (arrayOfSampleStream2[n] != null) {
            bool3 = true;
          } else {
            bool3 = false;
          }
          Assertions.checkState(bool3);
          arrayOfSampleStream1[n] = arrayOfSampleStream2[n];
          streamWrapperIndices.put(arrayOfSampleStream2[n], Integer.valueOf(j));
          i1 = 1;
        }
        else
        {
          i1 = m;
          if (arrayOfInt1[n] == j)
          {
            if (arrayOfSampleStream2[n] != null) {
              bool3 = false;
            }
            Assertions.checkState(bool3);
            i1 = m;
          }
        }
        n++;
      }
      if (m != 0)
      {
        arrayOfHlsSampleStreamWrapper[i] = localObject2;
        m = i + 1;
        if (i == 0)
        {
          ((HlsSampleStreamWrapper)localObject2).setIsTimestampMaster(true);
          if (!bool2)
          {
            localObject4 = enabledSampleStreamWrappers;
            if (localObject4.length != 0)
            {
              i = m;
              if (localObject2 == localObject4[0]) {
                break label541;
              }
            }
          }
          timestampAdjusterProvider.reset();
          bool1 = true;
          i = m;
        }
        else
        {
          ((HlsSampleStreamWrapper)localObject2).setIsTimestampMaster(false);
          i = m;
        }
      }
      label541:
      j++;
    }
    System.arraycopy(arrayOfSampleStream1, 0, localObject2, 0, k);
    paramArrayOfTrackSelection = (HlsSampleStreamWrapper[])Arrays.copyOf(arrayOfHlsSampleStreamWrapper, i);
    enabledSampleStreamWrappers = paramArrayOfTrackSelection;
    compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(paramArrayOfTrackSelection);
    return paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsMediaPeriod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */