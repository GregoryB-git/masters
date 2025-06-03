package com.google.android.datatransport.runtime.scheduling.persistence;

abstract interface SQLiteEventStore$Function<T, U>
{
  public abstract U apply(T paramT);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */