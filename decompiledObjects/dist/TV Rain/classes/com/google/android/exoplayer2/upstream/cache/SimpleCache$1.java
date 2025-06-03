package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;

class SimpleCache$1
  extends Thread
{
  public SimpleCache$1(SimpleCache paramSimpleCache, String paramString, ConditionVariable paramConditionVariable)
  {
    super(paramString);
  }
  
  public void run()
  {
    synchronized (this$0)
    {
      val$conditionVariable.open();
      SimpleCache.access$000(this$0);
      SimpleCache.access$100(this$0).onCacheInitialized();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.SimpleCache.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */