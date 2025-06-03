package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.PooledByteBuffer;

final class EncodedCountingMemoryCacheFactory$1
  implements ValueDescriptor<PooledByteBuffer>
{
  public int getSizeInBytes(PooledByteBuffer paramPooledByteBuffer)
  {
    return paramPooledByteBuffer.size();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.EncodedCountingMemoryCacheFactory.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */