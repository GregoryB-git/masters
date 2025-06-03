package com.google.android.exoplayer2.upstream;

import java.io.IOException;

public abstract interface Loader$Loadable
{
  public abstract void cancelLoad();
  
  public abstract void load()
    throws IOException, InterruptedException;
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.Loader.Loadable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */