package com.facebook.drawee.components;

import java.util.Iterator;
import java.util.Set;

class DeferredReleaser$1
  implements Runnable
{
  public DeferredReleaser$1(DeferredReleaser paramDeferredReleaser) {}
  
  public void run()
  {
    DeferredReleaser.access$000();
    Iterator localIterator = DeferredReleaser.access$100(this$0).iterator();
    while (localIterator.hasNext()) {
      ((DeferredReleaser.Releasable)localIterator.next()).release();
    }
    DeferredReleaser.access$100(this$0).clear();
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.components.DeferredReleaser.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */