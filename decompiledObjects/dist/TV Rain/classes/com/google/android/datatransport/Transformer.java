package com.google.android.datatransport;

public abstract interface Transformer<T, U>
{
  public abstract U apply(T paramT);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.Transformer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */