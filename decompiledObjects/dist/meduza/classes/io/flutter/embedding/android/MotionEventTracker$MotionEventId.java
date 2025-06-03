package io.flutter.embedding.android;

import java.util.concurrent.atomic.AtomicLong;

public class MotionEventTracker$MotionEventId
{
  private static final AtomicLong ID_COUNTER = new AtomicLong(0L);
  private final long id;
  
  private MotionEventTracker$MotionEventId(long paramLong)
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

/* Location:
 * Qualified Name:     io.flutter.embedding.android.MotionEventTracker.MotionEventId
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */