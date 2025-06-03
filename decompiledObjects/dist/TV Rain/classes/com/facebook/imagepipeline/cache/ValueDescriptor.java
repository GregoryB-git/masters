package com.facebook.imagepipeline.cache;

public abstract interface ValueDescriptor<V>
{
  public abstract int getSizeInBytes(V paramV);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.ValueDescriptor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */