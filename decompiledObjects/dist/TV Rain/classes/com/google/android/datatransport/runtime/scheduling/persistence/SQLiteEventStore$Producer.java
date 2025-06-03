package com.google.android.datatransport.runtime.scheduling.persistence;

abstract interface SQLiteEventStore$Producer<T>
{
  public abstract T produce();
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */