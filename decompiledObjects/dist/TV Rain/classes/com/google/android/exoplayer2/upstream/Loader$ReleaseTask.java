package com.google.android.exoplayer2.upstream;

final class Loader$ReleaseTask
  implements Runnable
{
  private final Loader.ReleaseCallback callback;
  
  public Loader$ReleaseTask(Loader.ReleaseCallback paramReleaseCallback)
  {
    callback = paramReleaseCallback;
  }
  
  public void run()
  {
    callback.onLoaderReleased();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.Loader.ReleaseTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */