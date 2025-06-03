package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.PlayerMessage.Target;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.Timeline.Window;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConcatenatingMediaSource
  extends CompositeMediaSource<MediaSourceHolder>
  implements PlayerMessage.Target
{
  private static final int MSG_ADD = 0;
  private static final int MSG_MOVE = 2;
  private static final int MSG_NOTIFY_LISTENER = 4;
  private static final int MSG_ON_COMPLETION = 5;
  private static final int MSG_REMOVE = 1;
  private static final int MSG_SET_SHUFFLE_ORDER = 3;
  private final boolean isAtomic;
  private boolean listenerNotificationScheduled;
  private final Map<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
  private final Map<Object, MediaSourceHolder> mediaSourceByUid;
  private final List<MediaSourceHolder> mediaSourceHolders;
  private final List<MediaSourceHolder> mediaSourcesPublic;
  private final List<Runnable> pendingOnCompletionActions;
  private final Timeline.Period period;
  private int periodCount;
  @Nullable
  private ExoPlayer player;
  @Nullable
  private Handler playerApplicationHandler;
  private ShuffleOrder shuffleOrder;
  private final boolean useLazyPreparation;
  private final Timeline.Window window;
  private int windowCount;
  
  public ConcatenatingMediaSource(boolean paramBoolean, ShuffleOrder paramShuffleOrder, MediaSource... paramVarArgs)
  {
    this(paramBoolean, false, paramShuffleOrder, paramVarArgs);
  }
  
  public ConcatenatingMediaSource(boolean paramBoolean1, boolean paramBoolean2, ShuffleOrder paramShuffleOrder, MediaSource... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++) {
      Assertions.checkNotNull(paramVarArgs[j]);
    }
    ShuffleOrder localShuffleOrder = paramShuffleOrder;
    if (paramShuffleOrder.getLength() > 0) {
      localShuffleOrder = paramShuffleOrder.cloneAndClear();
    }
    shuffleOrder = localShuffleOrder;
    mediaSourceByMediaPeriod = new IdentityHashMap();
    mediaSourceByUid = new HashMap();
    mediaSourcesPublic = new ArrayList();
    mediaSourceHolders = new ArrayList();
    pendingOnCompletionActions = new ArrayList();
    isAtomic = paramBoolean1;
    useLazyPreparation = paramBoolean2;
    window = new Timeline.Window();
    period = new Timeline.Period();
    addMediaSources(Arrays.asList(paramVarArgs));
  }
  
  public ConcatenatingMediaSource(boolean paramBoolean, MediaSource... paramVarArgs)
  {
    this(paramBoolean, new ShuffleOrder.DefaultShuffleOrder(0), paramVarArgs);
  }
  
  public ConcatenatingMediaSource(MediaSource... paramVarArgs)
  {
    this(false, paramVarArgs);
  }
  
  private void addMediaSourceInternal(int paramInt, MediaSourceHolder paramMediaSourceHolder)
  {
    if (paramInt > 0)
    {
      MediaSourceHolder localMediaSourceHolder = (MediaSourceHolder)mediaSourceHolders.get(paramInt - 1);
      int i = firstWindowIndexInChild;
      int j = timeline.getWindowCount();
      int k = firstPeriodIndexInChild;
      paramMediaSourceHolder.reset(paramInt, j + i, timeline.getPeriodCount() + k);
    }
    else
    {
      paramMediaSourceHolder.reset(paramInt, 0, 0);
    }
    correctOffsets(paramInt, 1, timeline.getWindowCount(), timeline.getPeriodCount());
    mediaSourceHolders.add(paramInt, paramMediaSourceHolder);
    mediaSourceByUid.put(uid, paramMediaSourceHolder);
    if (!useLazyPreparation)
    {
      hasStartedPreparing = true;
      prepareChildSource(paramMediaSourceHolder, mediaSource);
    }
  }
  
  private void addMediaSourcesInternal(int paramInt, Collection<MediaSourceHolder> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      addMediaSourceInternal(paramInt, (MediaSourceHolder)paramCollection.next());
      paramInt++;
    }
  }
  
  private void correctOffsets(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    windowCount += paramInt3;
    periodCount += paramInt4;
    while (paramInt1 < mediaSourceHolders.size())
    {
      MediaSourceHolder localMediaSourceHolder = (MediaSourceHolder)mediaSourceHolders.get(paramInt1);
      childIndex += paramInt2;
      localMediaSourceHolder = (MediaSourceHolder)mediaSourceHolders.get(paramInt1);
      firstWindowIndexInChild += paramInt3;
      localMediaSourceHolder = (MediaSourceHolder)mediaSourceHolders.get(paramInt1);
      firstPeriodIndexInChild += paramInt4;
      paramInt1++;
    }
  }
  
  private static Object getChildPeriodUid(MediaSourceHolder paramMediaSourceHolder, Object paramObject)
  {
    Object localObject = AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(paramObject);
    paramObject = localObject;
    if (localObject.equals(DeferredTimeline.access$100())) {
      paramObject = DeferredTimeline.access$200(timeline);
    }
    return paramObject;
  }
  
  private static Object getMediaSourceHolderUid(Object paramObject)
  {
    return AbstractConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(paramObject);
  }
  
  private static Object getPeriodUid(MediaSourceHolder paramMediaSourceHolder, Object paramObject)
  {
    Object localObject = paramObject;
    if (DeferredTimeline.access$200(timeline).equals(paramObject)) {
      localObject = DeferredTimeline.access$100();
    }
    return AbstractConcatenatedTimeline.getConcatenatedUid(uid, localObject);
  }
  
  private void maybeReleaseChildSource(MediaSourceHolder paramMediaSourceHolder)
  {
    if ((isRemoved) && (hasStartedPreparing) && (activeMediaPeriods.isEmpty())) {
      releaseChildSource(paramMediaSourceHolder);
    }
  }
  
  private void moveMediaSourceInternal(int paramInt1, int paramInt2)
  {
    int i = Math.min(paramInt1, paramInt2);
    int j = Math.max(paramInt1, paramInt2);
    int k = mediaSourceHolders.get(i)).firstWindowIndexInChild;
    int m = mediaSourceHolders.get(i)).firstPeriodIndexInChild;
    Object localObject = mediaSourceHolders;
    ((List)localObject).add(paramInt2, ((List)localObject).remove(paramInt1));
    paramInt1 = m;
    paramInt2 = k;
    while (i <= j)
    {
      localObject = (MediaSourceHolder)mediaSourceHolders.get(i);
      firstWindowIndexInChild = paramInt2;
      firstPeriodIndexInChild = paramInt1;
      paramInt2 += timeline.getWindowCount();
      paramInt1 += timeline.getPeriodCount();
      i++;
    }
  }
  
  private void notifyListener()
  {
    listenerNotificationScheduled = false;
    Object localObject;
    if (pendingOnCompletionActions.isEmpty()) {
      localObject = Collections.emptyList();
    } else {
      localObject = new ArrayList(pendingOnCompletionActions);
    }
    pendingOnCompletionActions.clear();
    refreshSourceInfo(new ConcatenatedTimeline(mediaSourceHolders, windowCount, periodCount, shuffleOrder, isAtomic), null);
    if (!((List)localObject).isEmpty()) {
      ((ExoPlayer)Assertions.checkNotNull(player)).createMessage(this).setType(5).setPayload(localObject).send();
    }
  }
  
  private void removeMediaSourceInternal(int paramInt)
  {
    MediaSourceHolder localMediaSourceHolder = (MediaSourceHolder)mediaSourceHolders.remove(paramInt);
    mediaSourceByUid.remove(uid);
    DeferredTimeline localDeferredTimeline = timeline;
    correctOffsets(paramInt, -1, -localDeferredTimeline.getWindowCount(), -localDeferredTimeline.getPeriodCount());
    isRemoved = true;
    maybeReleaseChildSource(localMediaSourceHolder);
  }
  
  private void scheduleListenerNotification(@Nullable Runnable paramRunnable)
  {
    if (!listenerNotificationScheduled)
    {
      ((ExoPlayer)Assertions.checkNotNull(player)).createMessage(this).setType(4).send();
      listenerNotificationScheduled = true;
    }
    if (paramRunnable != null) {
      pendingOnCompletionActions.add(paramRunnable);
    }
  }
  
  private void updateMediaSourceInternal(MediaSourceHolder paramMediaSourceHolder, Timeline paramTimeline)
  {
    if (paramMediaSourceHolder != null)
    {
      Object localObject1 = timeline;
      if (((DeferredTimeline)localObject1).getTimeline() == paramTimeline) {
        return;
      }
      int i = paramTimeline.getWindowCount() - ((ForwardingTimeline)localObject1).getWindowCount();
      int j = paramTimeline.getPeriodCount() - ((ForwardingTimeline)localObject1).getPeriodCount();
      if ((i != 0) || (j != 0)) {
        correctOffsets(childIndex + 1, 0, i, j);
      }
      if (isPrepared)
      {
        timeline = ((DeferredTimeline)localObject1).cloneWithUpdatedTimeline(paramTimeline);
      }
      else if (paramTimeline.isEmpty())
      {
        timeline = DeferredTimeline.createWithRealTimeline(paramTimeline, DeferredTimeline.access$100());
      }
      else
      {
        boolean bool;
        if (activeMediaPeriods.size() <= 1) {
          bool = true;
        } else {
          bool = false;
        }
        Assertions.checkState(bool);
        if (activeMediaPeriods.isEmpty()) {
          localObject1 = null;
        } else {
          localObject1 = (DeferredMediaPeriod)activeMediaPeriods.get(0);
        }
        long l1 = window.getDefaultPositionUs();
        if (localObject1 != null)
        {
          l2 = ((DeferredMediaPeriod)localObject1).getPreparePositionUs();
          if (l2 != 0L) {}
        }
        else
        {
          l2 = l1;
        }
        Pair localPair = paramTimeline.getPeriodPosition(window, period, 0, l2);
        Object localObject2 = first;
        long l2 = ((Long)second).longValue();
        timeline = DeferredTimeline.createWithRealTimeline(paramTimeline, localObject2);
        if (localObject1 != null)
        {
          ((DeferredMediaPeriod)localObject1).overridePreparePositionUs(l2);
          paramTimeline = id;
          ((DeferredMediaPeriod)localObject1).createPeriod(paramTimeline.copyWithPeriodUid(getChildPeriodUid(paramMediaSourceHolder, periodUid)));
        }
      }
      isPrepared = true;
      scheduleListenerNotification(null);
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public final void addMediaSource(int paramInt, MediaSource paramMediaSource)
  {
    try
    {
      addMediaSource(paramInt, paramMediaSource, null);
      return;
    }
    finally
    {
      paramMediaSource = finally;
      throw paramMediaSource;
    }
  }
  
  public final void addMediaSource(int paramInt, MediaSource paramMediaSource, @Nullable Runnable paramRunnable)
  {
    try
    {
      addMediaSources(paramInt, Collections.singletonList(paramMediaSource), paramRunnable);
      return;
    }
    finally
    {
      paramMediaSource = finally;
      throw paramMediaSource;
    }
  }
  
  public final void addMediaSource(MediaSource paramMediaSource)
  {
    try
    {
      addMediaSource(mediaSourcesPublic.size(), paramMediaSource, null);
      return;
    }
    finally
    {
      paramMediaSource = finally;
      throw paramMediaSource;
    }
  }
  
  public final void addMediaSource(MediaSource paramMediaSource, @Nullable Runnable paramRunnable)
  {
    try
    {
      addMediaSource(mediaSourcesPublic.size(), paramMediaSource, paramRunnable);
      return;
    }
    finally
    {
      paramMediaSource = finally;
      throw paramMediaSource;
    }
  }
  
  public final void addMediaSources(int paramInt, Collection<MediaSource> paramCollection)
  {
    try
    {
      addMediaSources(paramInt, paramCollection, null);
      return;
    }
    finally
    {
      paramCollection = finally;
      throw paramCollection;
    }
  }
  
  public final void addMediaSources(int paramInt, Collection<MediaSource> paramCollection, @Nullable Runnable paramRunnable)
  {
    try
    {
      Object localObject1 = paramCollection.iterator();
      while (((Iterator)localObject1).hasNext()) {
        Assertions.checkNotNull((MediaSource)((Iterator)localObject1).next());
      }
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>(paramCollection.size());
      Iterator localIterator = paramCollection.iterator();
      Object localObject2;
      while (localIterator.hasNext())
      {
        MediaSource localMediaSource = (MediaSource)localIterator.next();
        localObject2 = new com/google/android/exoplayer2/source/ConcatenatingMediaSource$MediaSourceHolder;
        ((MediaSourceHolder)localObject2).<init>(localMediaSource);
        ((ArrayList)localObject1).add(localObject2);
      }
      mediaSourcesPublic.addAll(paramInt, (Collection)localObject1);
      if ((player != null) && (!paramCollection.isEmpty()))
      {
        paramCollection = player.createMessage(this).setType(0);
        localObject2 = new com/google/android/exoplayer2/source/ConcatenatingMediaSource$MessageData;
        ((MessageData)localObject2).<init>(paramInt, localObject1, paramRunnable);
        paramCollection.setPayload(localObject2).send();
      }
      else if (paramRunnable != null)
      {
        paramRunnable.run();
      }
      return;
    }
    finally {}
  }
  
  public final void addMediaSources(Collection<MediaSource> paramCollection)
  {
    try
    {
      addMediaSources(mediaSourcesPublic.size(), paramCollection, null);
      return;
    }
    finally
    {
      paramCollection = finally;
      throw paramCollection;
    }
  }
  
  public final void addMediaSources(Collection<MediaSource> paramCollection, @Nullable Runnable paramRunnable)
  {
    try
    {
      addMediaSources(mediaSourcesPublic.size(), paramCollection, paramRunnable);
      return;
    }
    finally
    {
      paramCollection = finally;
      throw paramCollection;
    }
  }
  
  public final void clear()
  {
    try
    {
      clear(null);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void clear(@Nullable Runnable paramRunnable)
  {
    try
    {
      removeMediaSourceRange(0, getSize(), paramRunnable);
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
  
  public final MediaPeriod createPeriod(MediaSource.MediaPeriodId paramMediaPeriodId, Allocator paramAllocator)
  {
    Object localObject = getMediaSourceHolderUid(periodUid);
    MediaSourceHolder localMediaSourceHolder = (MediaSourceHolder)mediaSourceByUid.get(localObject);
    localObject = localMediaSourceHolder;
    if (localMediaSourceHolder == null)
    {
      localObject = new MediaSourceHolder(new DummyMediaSource(null));
      hasStartedPreparing = true;
    }
    paramAllocator = new DeferredMediaPeriod(mediaSource, paramMediaPeriodId, paramAllocator);
    mediaSourceByMediaPeriod.put(paramAllocator, localObject);
    activeMediaPeriods.add(paramAllocator);
    if (!hasStartedPreparing)
    {
      hasStartedPreparing = true;
      prepareChildSource(localObject, mediaSource);
    }
    else if (isPrepared)
    {
      paramAllocator.createPeriod(paramMediaPeriodId.copyWithPeriodUid(getChildPeriodUid((MediaSourceHolder)localObject, periodUid)));
    }
    return paramAllocator;
  }
  
  @Nullable
  public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder paramMediaSourceHolder, MediaSource.MediaPeriodId paramMediaPeriodId)
  {
    for (int i = 0; i < activeMediaPeriods.size(); i++) {
      if (activeMediaPeriods.get(i)).id.windowSequenceNumber == windowSequenceNumber) {
        return paramMediaPeriodId.copyWithPeriodUid(getPeriodUid(paramMediaSourceHolder, periodUid));
      }
    }
    return null;
  }
  
  public final MediaSource getMediaSource(int paramInt)
  {
    try
    {
      MediaSource localMediaSource = mediaSourcesPublic.get(paramInt)).mediaSource;
      return localMediaSource;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int getSize()
  {
    try
    {
      int i = mediaSourcesPublic.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getWindowIndexForChildWindowIndex(MediaSourceHolder paramMediaSourceHolder, int paramInt)
  {
    return paramInt + firstWindowIndexInChild;
  }
  
  public final void handleMessage(int paramInt, @Nullable Object paramObject)
    throws ExoPlaybackException
  {
    if (player == null) {
      return;
    }
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        Object localObject;
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4)
            {
              if (paramInt == 5)
              {
                localObject = (List)Util.castNonNull(paramObject);
                paramObject = (Handler)Assertions.checkNotNull(playerApplicationHandler);
                for (paramInt = 0; paramInt < ((List)localObject).size(); paramInt++) {
                  ((Handler)paramObject).post((Runnable)((List)localObject).get(paramInt));
                }
              }
              throw new IllegalStateException();
            }
            notifyListener();
          }
          else
          {
            paramObject = (MessageData)Util.castNonNull(paramObject);
            shuffleOrder = ((ShuffleOrder)customData);
            scheduleListenerNotification(actionOnCompletion);
          }
        }
        else
        {
          paramObject = (MessageData)Util.castNonNull(paramObject);
          localObject = shuffleOrder.cloneAndRemove(index);
          shuffleOrder = ((ShuffleOrder)localObject);
          shuffleOrder = ((ShuffleOrder)localObject).cloneAndInsert(((Integer)customData).intValue(), 1);
          moveMediaSourceInternal(index, ((Integer)customData).intValue());
          scheduleListenerNotification(actionOnCompletion);
        }
      }
      else
      {
        paramObject = (MessageData)Util.castNonNull(paramObject);
        int i = index;
        int j = ((Integer)customData).intValue();
        if ((i == 0) && (j == shuffleOrder.getLength())) {
          shuffleOrder = shuffleOrder.cloneAndClear();
        } else {
          for (paramInt = j - 1; paramInt >= i; paramInt--) {
            shuffleOrder = shuffleOrder.cloneAndRemove(paramInt);
          }
        }
        for (paramInt = j - 1; paramInt >= i; paramInt--) {
          removeMediaSourceInternal(paramInt);
        }
        scheduleListenerNotification(actionOnCompletion);
      }
    }
    else
    {
      paramObject = (MessageData)Util.castNonNull(paramObject);
      shuffleOrder = shuffleOrder.cloneAndInsert(index, ((Collection)customData).size());
      addMediaSourcesInternal(index, (Collection)customData);
      scheduleListenerNotification(actionOnCompletion);
    }
  }
  
  public void maybeThrowSourceInfoRefreshError()
    throws IOException
  {}
  
  public final void moveMediaSource(int paramInt1, int paramInt2)
  {
    try
    {
      moveMediaSource(paramInt1, paramInt2, null);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void moveMediaSource(int paramInt1, int paramInt2, @Nullable Runnable paramRunnable)
  {
    if (paramInt1 == paramInt2) {
      return;
    }
    try
    {
      Object localObject = mediaSourcesPublic;
      ((List)localObject).add(paramInt2, ((List)localObject).remove(paramInt1));
      localObject = player;
      if (localObject != null)
      {
        PlayerMessage localPlayerMessage = ((ExoPlayer)localObject).createMessage(this).setType(2);
        localObject = new com/google/android/exoplayer2/source/ConcatenatingMediaSource$MessageData;
        ((MessageData)localObject).<init>(paramInt1, Integer.valueOf(paramInt2), paramRunnable);
        localPlayerMessage.setPayload(localObject).send();
      }
      else if (paramRunnable != null)
      {
        paramRunnable.run();
      }
      return;
    }
    finally {}
  }
  
  public final void onChildSourceInfoRefreshed(MediaSourceHolder paramMediaSourceHolder, MediaSource paramMediaSource, Timeline paramTimeline, @Nullable Object paramObject)
  {
    updateMediaSourceInternal(paramMediaSourceHolder, paramTimeline);
  }
  
  public final void prepareSourceInternal(ExoPlayer paramExoPlayer, boolean paramBoolean, @Nullable TransferListener paramTransferListener)
  {
    try
    {
      super.prepareSourceInternal(paramExoPlayer, paramBoolean, paramTransferListener);
      player = paramExoPlayer;
      paramTransferListener = new android/os/Handler;
      paramTransferListener.<init>(paramExoPlayer.getApplicationLooper());
      playerApplicationHandler = paramTransferListener;
      if (mediaSourcesPublic.isEmpty())
      {
        notifyListener();
      }
      else
      {
        shuffleOrder = shuffleOrder.cloneAndInsert(0, mediaSourcesPublic.size());
        addMediaSourcesInternal(0, mediaSourcesPublic);
        scheduleListenerNotification(null);
      }
      return;
    }
    finally {}
  }
  
  public final void releasePeriod(MediaPeriod paramMediaPeriod)
  {
    MediaSourceHolder localMediaSourceHolder = (MediaSourceHolder)Assertions.checkNotNull(mediaSourceByMediaPeriod.remove(paramMediaPeriod));
    ((DeferredMediaPeriod)paramMediaPeriod).releasePeriod();
    activeMediaPeriods.remove(paramMediaPeriod);
    maybeReleaseChildSource(localMediaSourceHolder);
  }
  
  public final void releaseSourceInternal()
  {
    super.releaseSourceInternal();
    mediaSourceHolders.clear();
    mediaSourceByUid.clear();
    player = null;
    playerApplicationHandler = null;
    shuffleOrder = shuffleOrder.cloneAndClear();
    windowCount = 0;
    periodCount = 0;
  }
  
  public final void removeMediaSource(int paramInt)
  {
    try
    {
      removeMediaSource(paramInt, null);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void removeMediaSource(int paramInt, @Nullable Runnable paramRunnable)
  {
    try
    {
      removeMediaSourceRange(paramInt, paramInt + 1, paramRunnable);
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
  
  public final void removeMediaSourceRange(int paramInt1, int paramInt2)
  {
    try
    {
      removeMediaSourceRange(paramInt1, paramInt2, null);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void removeMediaSourceRange(int paramInt1, int paramInt2, @Nullable Runnable paramRunnable)
  {
    try
    {
      Util.removeRange(mediaSourcesPublic, paramInt1, paramInt2);
      if (paramInt1 == paramInt2)
      {
        if (paramRunnable != null) {
          paramRunnable.run();
        }
        return;
      }
      Object localObject = player;
      if (localObject != null)
      {
        PlayerMessage localPlayerMessage = ((ExoPlayer)localObject).createMessage(this).setType(1);
        localObject = new com/google/android/exoplayer2/source/ConcatenatingMediaSource$MessageData;
        ((MessageData)localObject).<init>(paramInt1, Integer.valueOf(paramInt2), paramRunnable);
        localPlayerMessage.setPayload(localObject).send();
      }
      else if (paramRunnable != null)
      {
        paramRunnable.run();
      }
      return;
    }
    finally {}
  }
  
  public final void setShuffleOrder(ShuffleOrder paramShuffleOrder)
  {
    try
    {
      setShuffleOrder(paramShuffleOrder, null);
      return;
    }
    finally
    {
      paramShuffleOrder = finally;
      throw paramShuffleOrder;
    }
  }
  
  public final void setShuffleOrder(ShuffleOrder paramShuffleOrder, @Nullable Runnable paramRunnable)
  {
    try
    {
      Object localObject = player;
      ShuffleOrder localShuffleOrder;
      if (localObject != null)
      {
        int i = getSize();
        localShuffleOrder = paramShuffleOrder;
        if (paramShuffleOrder.getLength() != i) {
          localShuffleOrder = paramShuffleOrder.cloneAndClear().cloneAndInsert(0, i);
        }
        localObject = ((ExoPlayer)localObject).createMessage(this).setType(3);
        paramShuffleOrder = new com/google/android/exoplayer2/source/ConcatenatingMediaSource$MessageData;
        paramShuffleOrder.<init>(0, localShuffleOrder, paramRunnable);
        ((PlayerMessage)localObject).setPayload(paramShuffleOrder).send();
      }
      else
      {
        localShuffleOrder = paramShuffleOrder;
        if (paramShuffleOrder.getLength() > 0) {
          localShuffleOrder = paramShuffleOrder.cloneAndClear();
        }
        shuffleOrder = localShuffleOrder;
        if (paramRunnable != null) {
          paramRunnable.run();
        }
      }
      return;
    }
    finally {}
  }
  
  public static final class ConcatenatedTimeline
    extends AbstractConcatenatedTimeline
  {
    private final HashMap<Object, Integer> childIndexByUid;
    private final int[] firstPeriodInChildIndices;
    private final int[] firstWindowInChildIndices;
    private final int periodCount;
    private final Timeline[] timelines;
    private final Object[] uids;
    private final int windowCount;
    
    public ConcatenatedTimeline(Collection<ConcatenatingMediaSource.MediaSourceHolder> paramCollection, int paramInt1, int paramInt2, ShuffleOrder paramShuffleOrder, boolean paramBoolean)
    {
      super(paramShuffleOrder);
      windowCount = paramInt1;
      periodCount = paramInt2;
      paramInt1 = paramCollection.size();
      firstPeriodInChildIndices = new int[paramInt1];
      firstWindowInChildIndices = new int[paramInt1];
      timelines = new Timeline[paramInt1];
      uids = new Object[paramInt1];
      childIndexByUid = new HashMap();
      paramShuffleOrder = paramCollection.iterator();
      for (paramInt1 = 0; paramShuffleOrder.hasNext(); paramInt1++)
      {
        Object localObject = (ConcatenatingMediaSource.MediaSourceHolder)paramShuffleOrder.next();
        timelines[paramInt1] = timeline;
        firstPeriodInChildIndices[paramInt1] = firstPeriodIndexInChild;
        firstWindowInChildIndices[paramInt1] = firstWindowIndexInChild;
        paramCollection = uids;
        localObject = uid;
        paramCollection[paramInt1] = localObject;
        childIndexByUid.put(localObject, Integer.valueOf(paramInt1));
      }
    }
    
    public int getChildIndexByChildUid(Object paramObject)
    {
      paramObject = (Integer)childIndexByUid.get(paramObject);
      int i;
      if (paramObject == null) {
        i = -1;
      } else {
        i = ((Integer)paramObject).intValue();
      }
      return i;
    }
    
    public int getChildIndexByPeriodIndex(int paramInt)
    {
      return Util.binarySearchFloor(firstPeriodInChildIndices, paramInt + 1, false, false);
    }
    
    public int getChildIndexByWindowIndex(int paramInt)
    {
      return Util.binarySearchFloor(firstWindowInChildIndices, paramInt + 1, false, false);
    }
    
    public Object getChildUidByChildIndex(int paramInt)
    {
      return uids[paramInt];
    }
    
    public int getFirstPeriodIndexByChildIndex(int paramInt)
    {
      return firstPeriodInChildIndices[paramInt];
    }
    
    public int getFirstWindowIndexByChildIndex(int paramInt)
    {
      return firstWindowInChildIndices[paramInt];
    }
    
    public int getPeriodCount()
    {
      return periodCount;
    }
    
    public Timeline getTimelineByChildIndex(int paramInt)
    {
      return timelines[paramInt];
    }
    
    public int getWindowCount()
    {
      return windowCount;
    }
  }
  
  public static final class DeferredTimeline
    extends ForwardingTimeline
  {
    private static final Object DUMMY_ID = new Object();
    private static final ConcatenatingMediaSource.DummyTimeline DUMMY_TIMELINE = new ConcatenatingMediaSource.DummyTimeline(null);
    private final Object replacedId;
    
    public DeferredTimeline()
    {
      this(DUMMY_TIMELINE, DUMMY_ID);
    }
    
    private DeferredTimeline(Timeline paramTimeline, Object paramObject)
    {
      super();
      replacedId = paramObject;
    }
    
    public static DeferredTimeline createWithRealTimeline(Timeline paramTimeline, Object paramObject)
    {
      return new DeferredTimeline(paramTimeline, paramObject);
    }
    
    public DeferredTimeline cloneWithUpdatedTimeline(Timeline paramTimeline)
    {
      return new DeferredTimeline(paramTimeline, replacedId);
    }
    
    public int getIndexOfPeriod(Object paramObject)
    {
      Timeline localTimeline = timeline;
      Object localObject = paramObject;
      if (DUMMY_ID.equals(paramObject)) {
        localObject = replacedId;
      }
      return localTimeline.getIndexOfPeriod(localObject);
    }
    
    public Timeline.Period getPeriod(int paramInt, Timeline.Period paramPeriod, boolean paramBoolean)
    {
      timeline.getPeriod(paramInt, paramPeriod, paramBoolean);
      if (Util.areEqual(uid, replacedId)) {
        uid = DUMMY_ID;
      }
      return paramPeriod;
    }
    
    public Timeline getTimeline()
    {
      return timeline;
    }
    
    public Object getUidOfPeriod(int paramInt)
    {
      Object localObject1 = timeline.getUidOfPeriod(paramInt);
      Object localObject2 = localObject1;
      if (Util.areEqual(localObject1, replacedId)) {
        localObject2 = DUMMY_ID;
      }
      return localObject2;
    }
  }
  
  public static final class DummyMediaSource
    extends BaseMediaSource
  {
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId paramMediaPeriodId, Allocator paramAllocator)
    {
      throw new UnsupportedOperationException();
    }
    
    public void maybeThrowSourceInfoRefreshError()
      throws IOException
    {}
    
    public void prepareSourceInternal(ExoPlayer paramExoPlayer, boolean paramBoolean, @Nullable TransferListener paramTransferListener) {}
    
    public void releasePeriod(MediaPeriod paramMediaPeriod) {}
    
    public void releaseSourceInternal() {}
  }
  
  public static final class DummyTimeline
    extends Timeline
  {
    public int getIndexOfPeriod(Object paramObject)
    {
      int i;
      if (paramObject == ConcatenatingMediaSource.DeferredTimeline.access$100()) {
        i = 0;
      } else {
        i = -1;
      }
      return i;
    }
    
    public Timeline.Period getPeriod(int paramInt, Timeline.Period paramPeriod, boolean paramBoolean)
    {
      return paramPeriod.set(Integer.valueOf(0), ConcatenatingMediaSource.DeferredTimeline.access$100(), 0, -9223372036854775807L, 0L);
    }
    
    public int getPeriodCount()
    {
      return 1;
    }
    
    public Object getUidOfPeriod(int paramInt)
    {
      return ConcatenatingMediaSource.DeferredTimeline.access$100();
    }
    
    public Timeline.Window getWindow(int paramInt, Timeline.Window paramWindow, boolean paramBoolean, long paramLong)
    {
      return paramWindow.set(null, -9223372036854775807L, -9223372036854775807L, false, true, 0L, -9223372036854775807L, 0, 0, 0L);
    }
    
    public int getWindowCount()
    {
      return 1;
    }
  }
  
  public static final class MediaSourceHolder
    implements Comparable<MediaSourceHolder>
  {
    public List<DeferredMediaPeriod> activeMediaPeriods;
    public int childIndex;
    public int firstPeriodIndexInChild;
    public int firstWindowIndexInChild;
    public boolean hasStartedPreparing;
    public boolean isPrepared;
    public boolean isRemoved;
    public final MediaSource mediaSource;
    public ConcatenatingMediaSource.DeferredTimeline timeline;
    public final Object uid;
    
    public MediaSourceHolder(MediaSource paramMediaSource)
    {
      mediaSource = paramMediaSource;
      timeline = new ConcatenatingMediaSource.DeferredTimeline();
      activeMediaPeriods = new ArrayList();
      uid = new Object();
    }
    
    public int compareTo(@NonNull MediaSourceHolder paramMediaSourceHolder)
    {
      return firstPeriodIndexInChild - firstPeriodIndexInChild;
    }
    
    public void reset(int paramInt1, int paramInt2, int paramInt3)
    {
      childIndex = paramInt1;
      firstWindowIndexInChild = paramInt2;
      firstPeriodIndexInChild = paramInt3;
      hasStartedPreparing = false;
      isPrepared = false;
      isRemoved = false;
      activeMediaPeriods.clear();
    }
  }
  
  public static final class MessageData<T>
  {
    @Nullable
    public final Runnable actionOnCompletion;
    public final T customData;
    public final int index;
    
    public MessageData(int paramInt, T paramT, @Nullable Runnable paramRunnable)
    {
      index = paramInt;
      actionOnCompletion = paramRunnable;
      customData = paramT;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ConcatenatingMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */