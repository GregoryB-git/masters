package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.EmptySampleStream;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaPeriod.Callback;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.SequenceableLoader.Callback;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream.ReleaseCallback;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Descriptor;
import com.google.android.exoplayer2.source.dash.manifest.EventStream;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import z2;

final class DashMediaPeriod
  implements MediaPeriod, SequenceableLoader.Callback<ChunkSampleStream<DashChunkSource>>, ChunkSampleStream.ReleaseCallback<DashChunkSource>
{
  private final Allocator allocator;
  @Nullable
  private MediaPeriod.Callback callback;
  private final DashChunkSource.Factory chunkSourceFactory;
  private SequenceableLoader compositeSequenceableLoader;
  private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
  private final long elapsedRealtimeOffset;
  private final MediaSourceEventListener.EventDispatcher eventDispatcher;
  private EventSampleStream[] eventSampleStreams;
  private List<EventStream> eventStreams;
  public final int id;
  private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
  private DashManifest manifest;
  private final LoaderErrorThrower manifestLoaderErrorThrower;
  private boolean notifiedReadingStarted;
  private int periodIndex;
  private final PlayerEmsgHandler playerEmsgHandler;
  private ChunkSampleStream<DashChunkSource>[] sampleStreams;
  private final IdentityHashMap<ChunkSampleStream<DashChunkSource>, PlayerEmsgHandler.PlayerTrackEmsgHandler> trackEmsgHandlerBySampleStream;
  private final TrackGroupInfo[] trackGroupInfos;
  private final TrackGroupArray trackGroups;
  @Nullable
  private final TransferListener transferListener;
  
  public DashMediaPeriod(int paramInt1, DashManifest paramDashManifest, int paramInt2, DashChunkSource.Factory paramFactory, @Nullable TransferListener paramTransferListener, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher paramEventDispatcher, long paramLong, LoaderErrorThrower paramLoaderErrorThrower, Allocator paramAllocator, CompositeSequenceableLoaderFactory paramCompositeSequenceableLoaderFactory, PlayerEmsgHandler.PlayerEmsgCallback paramPlayerEmsgCallback)
  {
    id = paramInt1;
    manifest = paramDashManifest;
    periodIndex = paramInt2;
    chunkSourceFactory = paramFactory;
    transferListener = paramTransferListener;
    loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
    eventDispatcher = paramEventDispatcher;
    elapsedRealtimeOffset = paramLong;
    manifestLoaderErrorThrower = paramLoaderErrorThrower;
    allocator = paramAllocator;
    compositeSequenceableLoaderFactory = paramCompositeSequenceableLoaderFactory;
    playerEmsgHandler = new PlayerEmsgHandler(paramDashManifest, paramPlayerEmsgCallback, paramAllocator);
    sampleStreams = newSampleStreamArray(0);
    eventSampleStreams = new EventSampleStream[0];
    trackEmsgHandlerBySampleStream = new IdentityHashMap();
    compositeSequenceableLoader = paramCompositeSequenceableLoaderFactory.createCompositeSequenceableLoader(sampleStreams);
    paramFactory = paramDashManifest.getPeriod(paramInt2);
    paramDashManifest = eventStreams;
    eventStreams = paramDashManifest;
    paramDashManifest = buildTrackGroups(adaptationSets, paramDashManifest);
    trackGroups = ((TrackGroupArray)first);
    trackGroupInfos = ((TrackGroupInfo[])second);
    paramEventDispatcher.mediaPeriodCreated();
  }
  
  private static void buildManifestEventTrackGroupInfos(List<EventStream> paramList, TrackGroup[] paramArrayOfTrackGroup, TrackGroupInfo[] paramArrayOfTrackGroupInfo, int paramInt)
  {
    int i = 0;
    while (i < paramList.size())
    {
      paramArrayOfTrackGroup[paramInt] = new TrackGroup(new Format[] { Format.createSampleFormat(((EventStream)paramList.get(i)).id(), "application/x-emsg", null, -1, null) });
      paramArrayOfTrackGroupInfo[paramInt] = TrackGroupInfo.mpdEventTrack(i);
      i++;
      paramInt++;
    }
  }
  
  private static int buildPrimaryAndEmbeddedTrackGroupInfos(List<AdaptationSet> paramList, int[][] paramArrayOfInt, int paramInt, boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2, TrackGroup[] paramArrayOfTrackGroup, TrackGroupInfo[] paramArrayOfTrackGroupInfo)
  {
    int i = 0;
    int m;
    for (int j = i; i < paramInt; j = m)
    {
      int[] arrayOfInt = paramArrayOfInt[i];
      Object localObject = new ArrayList();
      int k = arrayOfInt.length;
      for (m = 0; m < k; m++) {
        ((ArrayList)localObject).addAll(getrepresentations);
      }
      k = ((ArrayList)localObject).size();
      Format[] arrayOfFormat = new Format[k];
      for (m = 0; m < k; m++) {
        arrayOfFormat[m] = getformat;
      }
      localObject = (AdaptationSet)paramList.get(arrayOfInt[0]);
      m = j + 1;
      if (paramArrayOfBoolean1[i] != 0)
      {
        k = m;
        m++;
      }
      else
      {
        k = -1;
      }
      int i1;
      if (paramArrayOfBoolean2[i] != 0)
      {
        int n = m + 1;
        i1 = m;
        m = n;
      }
      else
      {
        i1 = -1;
      }
      paramArrayOfTrackGroup[j] = new TrackGroup(arrayOfFormat);
      paramArrayOfTrackGroupInfo[j] = TrackGroupInfo.primaryTrack(type, arrayOfInt, j, k, i1);
      if (k != -1)
      {
        paramArrayOfTrackGroup[k] = new TrackGroup(new Format[] { Format.createSampleFormat(z2.q(new StringBuilder(), id, ":emsg"), "application/x-emsg", null, -1, null) });
        paramArrayOfTrackGroupInfo[k] = TrackGroupInfo.embeddedEmsgTrack(arrayOfInt, j);
      }
      if (i1 != -1)
      {
        paramArrayOfTrackGroup[i1] = new TrackGroup(new Format[] { Format.createTextSampleFormat(z2.q(new StringBuilder(), id, ":cea608"), "application/cea-608", 0, null) });
        paramArrayOfTrackGroupInfo[i1] = TrackGroupInfo.embeddedCea608Track(arrayOfInt, j);
      }
      i++;
    }
    return j;
  }
  
  private ChunkSampleStream<DashChunkSource> buildSampleStream(TrackGroupInfo paramTrackGroupInfo, TrackSelection paramTrackSelection, long paramLong)
  {
    int[] arrayOfInt = new int[2];
    Format[] arrayOfFormat = new Format[2];
    int i = embeddedEventMessageTrackGroupIndex;
    boolean bool1;
    if (i != -1) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    if (bool1)
    {
      arrayOfFormat[0] = trackGroups.get(i).getFormat(0);
      arrayOfInt[0] = 4;
      i = 1;
    }
    else
    {
      i = 0;
    }
    int j = embeddedCea608TrackGroupIndex;
    boolean bool2;
    if (j != -1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    int k = i;
    if (bool2)
    {
      arrayOfFormat[i] = trackGroups.get(j).getFormat(0);
      arrayOfInt[i] = 3;
      k = i + 1;
    }
    if (k < 2)
    {
      arrayOfFormat = (Format[])Arrays.copyOf(arrayOfFormat, k);
      arrayOfInt = Arrays.copyOf(arrayOfInt, k);
    }
    PlayerEmsgHandler.PlayerTrackEmsgHandler localPlayerTrackEmsgHandler;
    if ((manifest.dynamic) && (bool1)) {
      localPlayerTrackEmsgHandler = playerEmsgHandler.newPlayerTrackEmsgHandler();
    } else {
      localPlayerTrackEmsgHandler = null;
    }
    paramTrackSelection = chunkSourceFactory.createDashChunkSource(manifestLoaderErrorThrower, manifest, periodIndex, adaptationSetIndices, paramTrackSelection, trackType, elapsedRealtimeOffset, bool1, bool2, localPlayerTrackEmsgHandler, transferListener);
    paramTrackGroupInfo = new ChunkSampleStream(trackType, arrayOfInt, arrayOfFormat, paramTrackSelection, this, allocator, paramLong, loadErrorHandlingPolicy, eventDispatcher);
    try
    {
      trackEmsgHandlerBySampleStream.put(paramTrackGroupInfo, localPlayerTrackEmsgHandler);
      return paramTrackGroupInfo;
    }
    finally {}
  }
  
  private static Pair<TrackGroupArray, TrackGroupInfo[]> buildTrackGroups(List<AdaptationSet> paramList, List<EventStream> paramList1)
  {
    int[][] arrayOfInt = getGroupedAdaptationSetIndices(paramList);
    int i = arrayOfInt.length;
    boolean[] arrayOfBoolean1 = new boolean[i];
    boolean[] arrayOfBoolean2 = new boolean[i];
    int j = identifyEmbeddedTracks(i, paramList, arrayOfInt, arrayOfBoolean1, arrayOfBoolean2);
    j = paramList1.size() + (j + i);
    TrackGroup[] arrayOfTrackGroup = new TrackGroup[j];
    TrackGroupInfo[] arrayOfTrackGroupInfo = new TrackGroupInfo[j];
    buildManifestEventTrackGroupInfos(paramList1, arrayOfTrackGroup, arrayOfTrackGroupInfo, buildPrimaryAndEmbeddedTrackGroupInfos(paramList, arrayOfInt, i, arrayOfBoolean1, arrayOfBoolean2, arrayOfTrackGroup, arrayOfTrackGroupInfo));
    return Pair.create(new TrackGroupArray(arrayOfTrackGroup), arrayOfTrackGroupInfo);
  }
  
  private static Descriptor findAdaptationSetSwitchingProperty(List<Descriptor> paramList)
  {
    for (int i = 0; i < paramList.size(); i++)
    {
      Descriptor localDescriptor = (Descriptor)paramList.get(i);
      if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(schemeIdUri)) {
        return localDescriptor;
      }
    }
    return null;
  }
  
  private static int[][] getGroupedAdaptationSetIndices(List<AdaptationSet> paramList)
  {
    int i = paramList.size();
    SparseIntArray localSparseIntArray = new SparseIntArray(i);
    for (int j = 0; j < i; j++) {
      localSparseIntArray.put(getid, j);
    }
    int[][] arrayOfInt = new int[i][];
    boolean[] arrayOfBoolean = new boolean[i];
    int k = 0;
    j = k;
    while (k < i)
    {
      if (arrayOfBoolean[k] == 0)
      {
        arrayOfBoolean[k] = true;
        Object localObject = findAdaptationSetSwitchingProperty(getsupplementalProperties);
        if (localObject == null)
        {
          arrayOfInt[j] = { k };
          j++;
        }
        else
        {
          String[] arrayOfString = value.split(",");
          localObject = new int[arrayOfString.length + 1];
          localObject[0] = k;
          int m = 0;
          while (m < arrayOfString.length)
          {
            int n = localSparseIntArray.get(Integer.parseInt(arrayOfString[m]));
            arrayOfBoolean[n] = true;
            m++;
            localObject[m] = n;
          }
          arrayOfInt[j] = localObject;
          j++;
        }
      }
      k++;
    }
    paramList = arrayOfInt;
    if (j < i) {
      paramList = (int[][])Arrays.copyOf(arrayOfInt, j);
    }
    return paramList;
  }
  
  private int getPrimaryStreamIndex(int paramInt, int[] paramArrayOfInt)
  {
    paramInt = paramArrayOfInt[paramInt];
    if (paramInt == -1) {
      return -1;
    }
    int i = trackGroupInfos[paramInt].primaryTrackGroupIndex;
    for (paramInt = 0; paramInt < paramArrayOfInt.length; paramInt++)
    {
      int j = paramArrayOfInt[paramInt];
      if ((j == i) && (trackGroupInfos[j].trackGroupCategory == 0)) {
        return paramInt;
      }
    }
    return -1;
  }
  
  private int[] getStreamIndexToTrackGroupIndex(TrackSelection[] paramArrayOfTrackSelection)
  {
    int[] arrayOfInt = new int[paramArrayOfTrackSelection.length];
    for (int i = 0; i < paramArrayOfTrackSelection.length; i++)
    {
      TrackSelection localTrackSelection = paramArrayOfTrackSelection[i];
      if (localTrackSelection != null) {
        arrayOfInt[i] = trackGroups.indexOf(localTrackSelection.getTrackGroup());
      } else {
        arrayOfInt[i] = -1;
      }
    }
    return arrayOfInt;
  }
  
  private static boolean hasCea608Track(List<AdaptationSet> paramList, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
    {
      List localList = getaccessibilityDescriptors;
      for (int k = 0; k < localList.size(); k++) {
        if ("urn:scte:dash:cc:cea-608:2015".equals(getschemeIdUri)) {
          return true;
        }
      }
    }
    return false;
  }
  
  private static boolean hasEventMessageTrack(List<AdaptationSet> paramList, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
    {
      List localList = getrepresentations;
      for (int k = 0; k < localList.size(); k++) {
        if (!getinbandEventStreams.isEmpty()) {
          return true;
        }
      }
    }
    return false;
  }
  
  private static int identifyEmbeddedTracks(int paramInt, List<AdaptationSet> paramList, int[][] paramArrayOfInt, boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    int i = 0;
    int j = 0;
    while (i < paramInt)
    {
      int k = j;
      if (hasEventMessageTrack(paramList, paramArrayOfInt[i]))
      {
        paramArrayOfBoolean1[i] = true;
        k = j + 1;
      }
      j = k;
      if (hasCea608Track(paramList, paramArrayOfInt[i]))
      {
        paramArrayOfBoolean2[i] = true;
        j = k + 1;
      }
      i++;
    }
    return j;
  }
  
  private static ChunkSampleStream<DashChunkSource>[] newSampleStreamArray(int paramInt)
  {
    return new ChunkSampleStream[paramInt];
  }
  
  private void releaseDisabledStreams(TrackSelection[] paramArrayOfTrackSelection, boolean[] paramArrayOfBoolean, SampleStream[] paramArrayOfSampleStream)
  {
    for (int i = 0; i < paramArrayOfTrackSelection.length; i++) {
      if ((paramArrayOfTrackSelection[i] == null) || (paramArrayOfBoolean[i] == 0))
      {
        SampleStream localSampleStream = paramArrayOfSampleStream[i];
        if ((localSampleStream instanceof ChunkSampleStream)) {
          ((ChunkSampleStream)localSampleStream).release(this);
        } else if ((localSampleStream instanceof ChunkSampleStream.EmbeddedSampleStream)) {
          ((ChunkSampleStream.EmbeddedSampleStream)localSampleStream).release();
        }
        paramArrayOfSampleStream[i] = null;
      }
    }
  }
  
  private void releaseOrphanEmbeddedStreams(TrackSelection[] paramArrayOfTrackSelection, SampleStream[] paramArrayOfSampleStream, int[] paramArrayOfInt)
  {
    for (int i = 0; i < paramArrayOfTrackSelection.length; i++)
    {
      SampleStream localSampleStream = paramArrayOfSampleStream[i];
      if (((localSampleStream instanceof EmptySampleStream)) || ((localSampleStream instanceof ChunkSampleStream.EmbeddedSampleStream)))
      {
        int j = getPrimaryStreamIndex(i, paramArrayOfInt);
        boolean bool;
        if (j == -1)
        {
          bool = paramArrayOfSampleStream[i] instanceof EmptySampleStream;
        }
        else
        {
          localSampleStream = paramArrayOfSampleStream[i];
          if (((localSampleStream instanceof ChunkSampleStream.EmbeddedSampleStream)) && (parent == paramArrayOfSampleStream[j])) {
            bool = true;
          } else {
            bool = false;
          }
        }
        if (!bool)
        {
          localSampleStream = paramArrayOfSampleStream[i];
          if ((localSampleStream instanceof ChunkSampleStream.EmbeddedSampleStream)) {
            ((ChunkSampleStream.EmbeddedSampleStream)localSampleStream).release();
          }
          paramArrayOfSampleStream[i] = null;
        }
      }
    }
  }
  
  private void selectNewStreams(TrackSelection[] paramArrayOfTrackSelection, SampleStream[] paramArrayOfSampleStream, boolean[] paramArrayOfBoolean, long paramLong, int[] paramArrayOfInt)
  {
    int i = 0;
    int k;
    for (int j = 0;; j++)
    {
      k = i;
      if (j >= paramArrayOfTrackSelection.length) {
        break;
      }
      if (paramArrayOfSampleStream[j] == null)
      {
        TrackSelection localTrackSelection = paramArrayOfTrackSelection[j];
        if (localTrackSelection != null)
        {
          paramArrayOfBoolean[j] = true;
          k = paramArrayOfInt[j];
          TrackGroupInfo localTrackGroupInfo = trackGroupInfos[k];
          k = trackGroupCategory;
          if (k == 0) {
            paramArrayOfSampleStream[j] = buildSampleStream(localTrackGroupInfo, localTrackSelection, paramLong);
          } else if (k == 2) {
            paramArrayOfSampleStream[j] = new EventSampleStream((EventStream)eventStreams.get(eventStreamGroupIndex), paramArrayOfTrackSelection[j].getTrackGroup().getFormat(0), manifest.dynamic);
          }
        }
      }
    }
    while (k < paramArrayOfTrackSelection.length)
    {
      if ((paramArrayOfSampleStream[k] == null) && (paramArrayOfTrackSelection[k] != null))
      {
        j = paramArrayOfInt[k];
        paramArrayOfBoolean = trackGroupInfos[j];
        if (trackGroupCategory == 1)
        {
          j = getPrimaryStreamIndex(k, paramArrayOfInt);
          if (j == -1) {
            paramArrayOfSampleStream[k] = new EmptySampleStream();
          } else {
            paramArrayOfSampleStream[k] = ((ChunkSampleStream)paramArrayOfSampleStream[j]).selectEmbeddedTrack(paramLong, trackType);
          }
        }
      }
      k++;
    }
  }
  
  public boolean continueLoading(long paramLong)
  {
    return compositeSequenceableLoader.continueLoading(paramLong);
  }
  
  public void discardBuffer(long paramLong, boolean paramBoolean)
  {
    ChunkSampleStream[] arrayOfChunkSampleStream = sampleStreams;
    int i = arrayOfChunkSampleStream.length;
    for (int j = 0; j < i; j++) {
      arrayOfChunkSampleStream[j].discardBuffer(paramLong, paramBoolean);
    }
  }
  
  public long getAdjustedSeekPositionUs(long paramLong, SeekParameters paramSeekParameters)
  {
    for (ChunkSampleStream localChunkSampleStream : sampleStreams) {
      if (primaryTrackType == 2) {
        return localChunkSampleStream.getAdjustedSeekPositionUs(paramLong, paramSeekParameters);
      }
    }
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
    manifestLoaderErrorThrower.maybeThrowError();
  }
  
  public void onContinueLoadingRequested(ChunkSampleStream<DashChunkSource> paramChunkSampleStream)
  {
    callback.onContinueLoadingRequested(this);
  }
  
  public void onSampleStreamReleased(ChunkSampleStream<DashChunkSource> paramChunkSampleStream)
  {
    try
    {
      paramChunkSampleStream = (PlayerEmsgHandler.PlayerTrackEmsgHandler)trackEmsgHandlerBySampleStream.remove(paramChunkSampleStream);
      if (paramChunkSampleStream != null) {
        paramChunkSampleStream.release();
      }
      return;
    }
    finally {}
  }
  
  public void prepare(MediaPeriod.Callback paramCallback, long paramLong)
  {
    callback = paramCallback;
    paramCallback.onPrepared(this);
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
    playerEmsgHandler.release();
    ChunkSampleStream[] arrayOfChunkSampleStream = sampleStreams;
    int i = arrayOfChunkSampleStream.length;
    for (int j = 0; j < i; j++) {
      arrayOfChunkSampleStream[j].release(this);
    }
    callback = null;
    eventDispatcher.mediaPeriodReleased();
  }
  
  public long seekToUs(long paramLong)
  {
    Object localObject = sampleStreams;
    int i = localObject.length;
    int j = 0;
    for (int k = 0; k < i; k++) {
      localObject[k].seekToUs(paramLong);
    }
    localObject = eventSampleStreams;
    i = localObject.length;
    for (k = j; k < i; k++) {
      localObject[k].seekToUs(paramLong);
    }
    return paramLong;
  }
  
  public long selectTracks(TrackSelection[] paramArrayOfTrackSelection, boolean[] paramArrayOfBoolean1, SampleStream[] paramArrayOfSampleStream, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    int[] arrayOfInt = getStreamIndexToTrackGroupIndex(paramArrayOfTrackSelection);
    releaseDisabledStreams(paramArrayOfTrackSelection, paramArrayOfBoolean1, paramArrayOfSampleStream);
    releaseOrphanEmbeddedStreams(paramArrayOfTrackSelection, paramArrayOfSampleStream, arrayOfInt);
    selectNewStreams(paramArrayOfTrackSelection, paramArrayOfSampleStream, paramArrayOfBoolean2, paramLong, arrayOfInt);
    paramArrayOfBoolean1 = new ArrayList();
    paramArrayOfTrackSelection = new ArrayList();
    int i = paramArrayOfSampleStream.length;
    for (int j = 0; j < i; j++)
    {
      paramArrayOfBoolean2 = paramArrayOfSampleStream[j];
      if ((paramArrayOfBoolean2 instanceof ChunkSampleStream)) {
        paramArrayOfBoolean1.add((ChunkSampleStream)paramArrayOfBoolean2);
      } else if ((paramArrayOfBoolean2 instanceof EventSampleStream)) {
        paramArrayOfTrackSelection.add((EventSampleStream)paramArrayOfBoolean2);
      }
    }
    paramArrayOfSampleStream = newSampleStreamArray(paramArrayOfBoolean1.size());
    sampleStreams = paramArrayOfSampleStream;
    paramArrayOfBoolean1.toArray(paramArrayOfSampleStream);
    paramArrayOfBoolean1 = new EventSampleStream[paramArrayOfTrackSelection.size()];
    eventSampleStreams = paramArrayOfBoolean1;
    paramArrayOfTrackSelection.toArray(paramArrayOfBoolean1);
    compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(sampleStreams);
    return paramLong;
  }
  
  public void updateManifest(DashManifest paramDashManifest, int paramInt)
  {
    manifest = paramDashManifest;
    periodIndex = paramInt;
    playerEmsgHandler.updateManifest(paramDashManifest);
    Object localObject = sampleStreams;
    int i;
    int j;
    if (localObject != null)
    {
      i = localObject.length;
      for (j = 0; j < i; j++) {
        ((DashChunkSource)localObject[j].getChunkSource()).updateManifest(paramDashManifest, paramInt);
      }
      callback.onContinueLoadingRequested(this);
    }
    eventStreams = getPeriodeventStreams;
    for (EventSampleStream localEventSampleStream : eventSampleStreams)
    {
      localObject = eventStreams.iterator();
      while (((Iterator)localObject).hasNext())
      {
        EventStream localEventStream = (EventStream)((Iterator)localObject).next();
        if (localEventStream.id().equals(localEventSampleStream.eventStreamId()))
        {
          int k = paramDashManifest.getPeriodCount();
          boolean bool = true;
          if ((!dynamic) || (paramInt != k - 1)) {
            bool = false;
          }
          localEventSampleStream.updateEventStream(localEventStream, bool);
        }
      }
    }
  }
  
  public static final class TrackGroupInfo
  {
    private static final int CATEGORY_EMBEDDED = 1;
    private static final int CATEGORY_MANIFEST_EVENTS = 2;
    private static final int CATEGORY_PRIMARY = 0;
    public final int[] adaptationSetIndices;
    public final int embeddedCea608TrackGroupIndex;
    public final int embeddedEventMessageTrackGroupIndex;
    public final int eventStreamGroupIndex;
    public final int primaryTrackGroupIndex;
    public final int trackGroupCategory;
    public final int trackType;
    
    private TrackGroupInfo(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
    {
      trackType = paramInt1;
      adaptationSetIndices = paramArrayOfInt;
      trackGroupCategory = paramInt2;
      primaryTrackGroupIndex = paramInt3;
      embeddedEventMessageTrackGroupIndex = paramInt4;
      embeddedCea608TrackGroupIndex = paramInt5;
      eventStreamGroupIndex = paramInt6;
    }
    
    public static TrackGroupInfo embeddedCea608Track(int[] paramArrayOfInt, int paramInt)
    {
      return new TrackGroupInfo(3, 1, paramArrayOfInt, paramInt, -1, -1, -1);
    }
    
    public static TrackGroupInfo embeddedEmsgTrack(int[] paramArrayOfInt, int paramInt)
    {
      return new TrackGroupInfo(4, 1, paramArrayOfInt, paramInt, -1, -1, -1);
    }
    
    public static TrackGroupInfo mpdEventTrack(int paramInt)
    {
      return new TrackGroupInfo(4, 2, null, -1, -1, -1, paramInt);
    }
    
    public static TrackGroupInfo primaryTrack(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4)
    {
      return new TrackGroupInfo(paramInt1, 0, paramArrayOfInt, paramInt2, paramInt3, paramInt4, -1);
    }
    
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public static @interface TrackGroupCategory {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaPeriod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */