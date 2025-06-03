package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

public final class MotionEventTracker
{
  private static MotionEventTracker INSTANCE;
  private static final String TAG = "MotionEventTracker";
  private final LongSparseArray<MotionEvent> eventById = new LongSparseArray();
  private final PriorityQueue<Long> unusedEvents = new PriorityQueue();
  
  public static MotionEventTracker getInstance()
  {
    if (INSTANCE == null) {
      INSTANCE = new MotionEventTracker();
    }
    return INSTANCE;
  }
  
  public MotionEvent pop(MotionEventId paramMotionEventId)
  {
    while ((!unusedEvents.isEmpty()) && (((Long)unusedEvents.peek()).longValue() < MotionEventId.access$000(paramMotionEventId))) {
      eventById.remove(((Long)unusedEvents.poll()).longValue());
    }
    if ((!unusedEvents.isEmpty()) && (((Long)unusedEvents.peek()).longValue() == MotionEventId.access$000(paramMotionEventId))) {
      unusedEvents.poll();
    }
    MotionEvent localMotionEvent = (MotionEvent)eventById.get(MotionEventId.access$000(paramMotionEventId));
    eventById.remove(MotionEventId.access$000(paramMotionEventId));
    return localMotionEvent;
  }
  
  public MotionEventId track(MotionEvent paramMotionEvent)
  {
    MotionEventId localMotionEventId = MotionEventId.createUnique();
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    eventById.put(MotionEventId.access$000(localMotionEventId), paramMotionEvent);
    unusedEvents.add(Long.valueOf(MotionEventId.access$000(localMotionEventId)));
    return localMotionEventId;
  }
  
  public static class MotionEventId
  {
    private static final AtomicLong ID_COUNTER = new AtomicLong(0L);
    private final long id;
    
    private MotionEventId(long paramLong)
    {
      id = paramLong;
    }
    
    public static MotionEventId createUnique()
    {
      return from(ID_COUNTER.incrementAndGet());
    }
    
    public static MotionEventId from(long paramLong)
    {
      return new MotionEventId(paramLong);
    }
    
    public long getId()
    {
      return id;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.MotionEventTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */