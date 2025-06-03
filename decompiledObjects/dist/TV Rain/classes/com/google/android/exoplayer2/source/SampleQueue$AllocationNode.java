package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.Allocation;

final class SampleQueue$AllocationNode
{
  @Nullable
  public Allocation allocation;
  public final long endPosition;
  @Nullable
  public AllocationNode next;
  public final long startPosition;
  public boolean wasInitialized;
  
  public SampleQueue$AllocationNode(long paramLong, int paramInt)
  {
    startPosition = paramLong;
    endPosition = (paramLong + paramInt);
  }
  
  public AllocationNode clear()
  {
    allocation = null;
    AllocationNode localAllocationNode = next;
    next = null;
    return localAllocationNode;
  }
  
  public void initialize(Allocation paramAllocation, AllocationNode paramAllocationNode)
  {
    allocation = paramAllocation;
    next = paramAllocationNode;
    wasInitialized = true;
  }
  
  public int translateOffset(long paramLong)
  {
    return (int)(paramLong - startPosition) + allocation.offset;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.SampleQueue.AllocationNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */