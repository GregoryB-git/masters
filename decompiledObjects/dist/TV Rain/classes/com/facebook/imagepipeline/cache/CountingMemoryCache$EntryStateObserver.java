package com.facebook.imagepipeline.cache;

public abstract interface CountingMemoryCache$EntryStateObserver<K>
{
  public abstract void onExclusivityChanged(K paramK, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.CountingMemoryCache.EntryStateObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */