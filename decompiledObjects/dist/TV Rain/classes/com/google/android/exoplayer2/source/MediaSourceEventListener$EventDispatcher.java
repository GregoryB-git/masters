package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import b1;
import b3;
import c3;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import d3;
import e3;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class MediaSourceEventListener$EventDispatcher
{
  private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;
  @Nullable
  public final MediaSource.MediaPeriodId mediaPeriodId;
  private final long mediaTimeOffsetMs;
  public final int windowIndex;
  
  public MediaSourceEventListener$EventDispatcher()
  {
    this(new CopyOnWriteArrayList(), 0, null, 0L);
  }
  
  private MediaSourceEventListener$EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> paramCopyOnWriteArrayList, int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, long paramLong)
  {
    listenerAndHandlers = paramCopyOnWriteArrayList;
    windowIndex = paramInt;
    mediaPeriodId = paramMediaPeriodId;
    mediaTimeOffsetMs = paramLong;
  }
  
  private long adjustMediaTime(long paramLong)
  {
    long l = C.usToMs(paramLong);
    paramLong = -9223372036854775807L;
    if (l != -9223372036854775807L) {
      paramLong = mediaTimeOffsetMs + l;
    }
    return paramLong;
  }
  
  private void postOrRun(Handler paramHandler, Runnable paramRunnable)
  {
    if (paramHandler.getLooper() == Looper.myLooper()) {
      paramRunnable.run();
    } else {
      paramHandler.post(paramRunnable);
    }
  }
  
  public void addEventListener(Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
  {
    boolean bool;
    if ((paramHandler != null) && (paramMediaSourceEventListener != null)) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    listenerAndHandlers.add(new ListenerAndHandler(paramHandler, paramMediaSourceEventListener));
  }
  
  public void downstreamFormatChanged(int paramInt1, @Nullable Format paramFormat, int paramInt2, @Nullable Object paramObject, long paramLong)
  {
    downstreamFormatChanged(new MediaSourceEventListener.MediaLoadData(1, paramInt1, paramFormat, paramInt2, paramObject, adjustMediaTime(paramLong), -9223372036854775807L));
  }
  
  public void downstreamFormatChanged(MediaSourceEventListener.MediaLoadData paramMediaLoadData)
  {
    Iterator localIterator = listenerAndHandlers.iterator();
    while (localIterator.hasNext())
    {
      ListenerAndHandler localListenerAndHandler = (ListenerAndHandler)localIterator.next();
      MediaSourceEventListener localMediaSourceEventListener = listener;
      postOrRun(handler, new b3(this, localMediaSourceEventListener, paramMediaLoadData, 0));
    }
  }
  
  public void loadCanceled(MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
  {
    Iterator localIterator = listenerAndHandlers.iterator();
    while (localIterator.hasNext())
    {
      ListenerAndHandler localListenerAndHandler = (ListenerAndHandler)localIterator.next();
      MediaSourceEventListener localMediaSourceEventListener = listener;
      postOrRun(handler, new e3(this, localMediaSourceEventListener, paramLoadEventInfo, paramMediaLoadData, 2));
    }
  }
  
  public void loadCanceled(DataSpec paramDataSpec, Uri paramUri, Map<String, List<String>> paramMap, int paramInt1, int paramInt2, @Nullable Format paramFormat, int paramInt3, @Nullable Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    loadCanceled(new MediaSourceEventListener.LoadEventInfo(paramDataSpec, paramUri, paramMap, paramLong3, paramLong4, paramLong5), new MediaSourceEventListener.MediaLoadData(paramInt1, paramInt2, paramFormat, paramInt3, paramObject, adjustMediaTime(paramLong1), adjustMediaTime(paramLong2)));
  }
  
  public void loadCanceled(DataSpec paramDataSpec, Uri paramUri, Map<String, List<String>> paramMap, int paramInt, long paramLong1, long paramLong2, long paramLong3)
  {
    loadCanceled(paramDataSpec, paramUri, paramMap, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, paramLong3);
  }
  
  public void loadCompleted(MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
  {
    Iterator localIterator = listenerAndHandlers.iterator();
    while (localIterator.hasNext())
    {
      ListenerAndHandler localListenerAndHandler = (ListenerAndHandler)localIterator.next();
      MediaSourceEventListener localMediaSourceEventListener = listener;
      postOrRun(handler, new e3(this, localMediaSourceEventListener, paramLoadEventInfo, paramMediaLoadData, 1));
    }
  }
  
  public void loadCompleted(DataSpec paramDataSpec, Uri paramUri, Map<String, List<String>> paramMap, int paramInt1, int paramInt2, @Nullable Format paramFormat, int paramInt3, @Nullable Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    loadCompleted(new MediaSourceEventListener.LoadEventInfo(paramDataSpec, paramUri, paramMap, paramLong3, paramLong4, paramLong5), new MediaSourceEventListener.MediaLoadData(paramInt1, paramInt2, paramFormat, paramInt3, paramObject, adjustMediaTime(paramLong1), adjustMediaTime(paramLong2)));
  }
  
  public void loadCompleted(DataSpec paramDataSpec, Uri paramUri, Map<String, List<String>> paramMap, int paramInt, long paramLong1, long paramLong2, long paramLong3)
  {
    loadCompleted(paramDataSpec, paramUri, paramMap, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, paramLong3);
  }
  
  public void loadError(MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData, IOException paramIOException, boolean paramBoolean)
  {
    Iterator localIterator = listenerAndHandlers.iterator();
    while (localIterator.hasNext())
    {
      ListenerAndHandler localListenerAndHandler = (ListenerAndHandler)localIterator.next();
      MediaSourceEventListener localMediaSourceEventListener = listener;
      postOrRun(handler, new c3(this, localMediaSourceEventListener, paramLoadEventInfo, paramMediaLoadData, paramIOException, paramBoolean));
    }
  }
  
  public void loadError(DataSpec paramDataSpec, Uri paramUri, Map<String, List<String>> paramMap, int paramInt1, int paramInt2, @Nullable Format paramFormat, int paramInt3, @Nullable Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, IOException paramIOException, boolean paramBoolean)
  {
    loadError(new MediaSourceEventListener.LoadEventInfo(paramDataSpec, paramUri, paramMap, paramLong3, paramLong4, paramLong5), new MediaSourceEventListener.MediaLoadData(paramInt1, paramInt2, paramFormat, paramInt3, paramObject, adjustMediaTime(paramLong1), adjustMediaTime(paramLong2)), paramIOException, paramBoolean);
  }
  
  public void loadError(DataSpec paramDataSpec, Uri paramUri, Map<String, List<String>> paramMap, int paramInt, long paramLong1, long paramLong2, long paramLong3, IOException paramIOException, boolean paramBoolean)
  {
    loadError(paramDataSpec, paramUri, paramMap, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, paramLong3, paramIOException, paramBoolean);
  }
  
  public void loadStarted(MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
  {
    Iterator localIterator = listenerAndHandlers.iterator();
    while (localIterator.hasNext())
    {
      ListenerAndHandler localListenerAndHandler = (ListenerAndHandler)localIterator.next();
      MediaSourceEventListener localMediaSourceEventListener = listener;
      postOrRun(handler, new e3(this, localMediaSourceEventListener, paramLoadEventInfo, paramMediaLoadData, 0));
    }
  }
  
  public void loadStarted(DataSpec paramDataSpec, int paramInt1, int paramInt2, @Nullable Format paramFormat, int paramInt3, @Nullable Object paramObject, long paramLong1, long paramLong2, long paramLong3)
  {
    loadStarted(new MediaSourceEventListener.LoadEventInfo(paramDataSpec, uri, Collections.emptyMap(), paramLong3, 0L, 0L), new MediaSourceEventListener.MediaLoadData(paramInt1, paramInt2, paramFormat, paramInt3, paramObject, adjustMediaTime(paramLong1), adjustMediaTime(paramLong2)));
  }
  
  public void loadStarted(DataSpec paramDataSpec, int paramInt, long paramLong)
  {
    loadStarted(paramDataSpec, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, paramLong);
  }
  
  public void mediaPeriodCreated()
  {
    MediaSource.MediaPeriodId localMediaPeriodId = (MediaSource.MediaPeriodId)Assertions.checkNotNull(mediaPeriodId);
    Iterator localIterator = listenerAndHandlers.iterator();
    while (localIterator.hasNext())
    {
      ListenerAndHandler localListenerAndHandler = (ListenerAndHandler)localIterator.next();
      MediaSourceEventListener localMediaSourceEventListener = listener;
      postOrRun(handler, new d3(this, localMediaSourceEventListener, localMediaPeriodId, 0));
    }
  }
  
  public void mediaPeriodReleased()
  {
    MediaSource.MediaPeriodId localMediaPeriodId = (MediaSource.MediaPeriodId)Assertions.checkNotNull(mediaPeriodId);
    Iterator localIterator = listenerAndHandlers.iterator();
    while (localIterator.hasNext())
    {
      ListenerAndHandler localListenerAndHandler = (ListenerAndHandler)localIterator.next();
      MediaSourceEventListener localMediaSourceEventListener = listener;
      postOrRun(handler, new d3(this, localMediaSourceEventListener, localMediaPeriodId, 2));
    }
  }
  
  public void readingStarted()
  {
    MediaSource.MediaPeriodId localMediaPeriodId = (MediaSource.MediaPeriodId)Assertions.checkNotNull(mediaPeriodId);
    Iterator localIterator = listenerAndHandlers.iterator();
    while (localIterator.hasNext())
    {
      ListenerAndHandler localListenerAndHandler = (ListenerAndHandler)localIterator.next();
      MediaSourceEventListener localMediaSourceEventListener = listener;
      postOrRun(handler, new d3(this, localMediaSourceEventListener, localMediaPeriodId, 1));
    }
  }
  
  public void removeEventListener(MediaSourceEventListener paramMediaSourceEventListener)
  {
    Iterator localIterator = listenerAndHandlers.iterator();
    while (localIterator.hasNext())
    {
      ListenerAndHandler localListenerAndHandler = (ListenerAndHandler)localIterator.next();
      if (listener == paramMediaSourceEventListener) {
        listenerAndHandlers.remove(localListenerAndHandler);
      }
    }
  }
  
  public void upstreamDiscarded(int paramInt, long paramLong1, long paramLong2)
  {
    upstreamDiscarded(new MediaSourceEventListener.MediaLoadData(1, paramInt, null, 3, null, adjustMediaTime(paramLong1), adjustMediaTime(paramLong2)));
  }
  
  public void upstreamDiscarded(MediaSourceEventListener.MediaLoadData paramMediaLoadData)
  {
    MediaSource.MediaPeriodId localMediaPeriodId = (MediaSource.MediaPeriodId)Assertions.checkNotNull(mediaPeriodId);
    Iterator localIterator = listenerAndHandlers.iterator();
    while (localIterator.hasNext())
    {
      ListenerAndHandler localListenerAndHandler = (ListenerAndHandler)localIterator.next();
      MediaSourceEventListener localMediaSourceEventListener = listener;
      postOrRun(handler, new b1(1, this, localMediaSourceEventListener, localMediaPeriodId, paramMediaLoadData));
    }
  }
  
  @CheckResult
  public EventDispatcher withParameters(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, long paramLong)
  {
    return new EventDispatcher(listenerAndHandlers, paramInt, paramMediaPeriodId, paramLong);
  }
  
  public static final class ListenerAndHandler
  {
    public final Handler handler;
    public final MediaSourceEventListener listener;
    
    public ListenerAndHandler(Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
    {
      handler = paramHandler;
      listener = paramMediaSourceEventListener;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */