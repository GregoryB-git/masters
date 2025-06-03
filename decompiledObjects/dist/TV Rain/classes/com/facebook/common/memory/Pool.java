package com.facebook.common.memory;

import com.facebook.common.references.ResourceReleaser;

public abstract interface Pool<V>
  extends ResourceReleaser<V>, MemoryTrimmable
{
  public abstract V get(int paramInt);
  
  public abstract void release(V paramV);
}

/* Location:
 * Qualified Name:     com.facebook.common.memory.Pool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */