package com.facebook.common.memory;

public abstract interface MemoryTrimmableRegistry
{
  public abstract void registerMemoryTrimmable(MemoryTrimmable paramMemoryTrimmable);
  
  public abstract void unregisterMemoryTrimmable(MemoryTrimmable paramMemoryTrimmable);
}

/* Location:
 * Qualified Name:     com.facebook.common.memory.MemoryTrimmableRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */