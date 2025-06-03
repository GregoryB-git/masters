package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import java.io.Closeable;

@WorkerThread
public abstract interface EventStore
  extends Closeable
{
  public abstract int cleanUp();
  
  public abstract long getNextCallTime(TransportContext paramTransportContext);
  
  public abstract boolean hasPendingEventsFor(TransportContext paramTransportContext);
  
  public abstract Iterable<TransportContext> loadActiveContexts();
  
  public abstract Iterable<PersistedEvent> loadBatch(TransportContext paramTransportContext);
  
  @Nullable
  public abstract PersistedEvent persist(TransportContext paramTransportContext, EventInternal paramEventInternal);
  
  public abstract void recordFailure(Iterable<PersistedEvent> paramIterable);
  
  public abstract void recordNextCallTime(TransportContext paramTransportContext, long paramLong);
  
  public abstract void recordSuccess(Iterable<PersistedEvent> paramIterable);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.EventStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */