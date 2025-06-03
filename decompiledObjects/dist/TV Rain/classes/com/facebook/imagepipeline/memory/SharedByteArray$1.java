package com.facebook.imagepipeline.memory;

import com.facebook.common.references.ResourceReleaser;
import java.util.concurrent.Semaphore;

class SharedByteArray$1
  implements ResourceReleaser<byte[]>
{
  public SharedByteArray$1(SharedByteArray paramSharedByteArray) {}
  
  public void release(byte[] paramArrayOfByte)
  {
    this$0.mSemaphore.release();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.SharedByteArray.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */