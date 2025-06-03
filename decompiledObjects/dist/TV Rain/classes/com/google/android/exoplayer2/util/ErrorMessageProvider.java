package com.google.android.exoplayer2.util;

import android.util.Pair;

public abstract interface ErrorMessageProvider<T extends Throwable>
{
  public abstract Pair<Integer, String> getErrorMessage(T paramT);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.ErrorMessageProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */