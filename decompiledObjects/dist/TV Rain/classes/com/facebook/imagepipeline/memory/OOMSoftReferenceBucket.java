package com.facebook.imagepipeline.memory;

import com.facebook.common.references.OOMSoftReference;
import java.util.LinkedList;
import java.util.Queue;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
class OOMSoftReferenceBucket<V>
  extends Bucket<V>
{
  private LinkedList<OOMSoftReference<V>> mSpareReferences = new LinkedList();
  
  public OOMSoftReferenceBucket(int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramInt2, paramInt3);
  }
  
  public void addToFreeList(V paramV)
  {
    OOMSoftReference localOOMSoftReference1 = (OOMSoftReference)mSpareReferences.poll();
    OOMSoftReference localOOMSoftReference2 = localOOMSoftReference1;
    if (localOOMSoftReference1 == null) {
      localOOMSoftReference2 = new OOMSoftReference();
    }
    localOOMSoftReference2.set(paramV);
    mFreeList.add(localOOMSoftReference2);
  }
  
  public V pop()
  {
    OOMSoftReference localOOMSoftReference = (OOMSoftReference)mFreeList.poll();
    Object localObject = localOOMSoftReference.get();
    localOOMSoftReference.clear();
    mSpareReferences.add(localOOMSoftReference);
    return (V)localObject;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.OOMSoftReferenceBucket
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */