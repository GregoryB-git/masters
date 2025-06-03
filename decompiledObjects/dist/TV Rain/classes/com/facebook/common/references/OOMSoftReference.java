package com.facebook.common.references;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class OOMSoftReference<T>
{
  public SoftReference<T> softRef1 = null;
  public SoftReference<T> softRef2 = null;
  public SoftReference<T> softRef3 = null;
  
  public void clear()
  {
    SoftReference localSoftReference = softRef1;
    if (localSoftReference != null)
    {
      localSoftReference.clear();
      softRef1 = null;
    }
    localSoftReference = softRef2;
    if (localSoftReference != null)
    {
      localSoftReference.clear();
      softRef2 = null;
    }
    localSoftReference = softRef3;
    if (localSoftReference != null)
    {
      localSoftReference.clear();
      softRef3 = null;
    }
  }
  
  @Nullable
  public T get()
  {
    Object localObject = softRef1;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((SoftReference)localObject).get();
    }
    return (T)localObject;
  }
  
  public void set(@Nonnull T paramT)
  {
    softRef1 = new SoftReference(paramT);
    softRef2 = new SoftReference(paramT);
    softRef3 = new SoftReference(paramT);
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.references.OOMSoftReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */