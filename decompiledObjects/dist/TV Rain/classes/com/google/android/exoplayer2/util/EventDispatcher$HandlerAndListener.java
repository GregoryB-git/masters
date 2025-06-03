package com.google.android.exoplayer2.util;

import android.os.Handler;

final class EventDispatcher$HandlerAndListener<T>
{
  private final Handler handler;
  private final T listener;
  private boolean released;
  
  public EventDispatcher$HandlerAndListener(Handler paramHandler, T paramT)
  {
    handler = paramHandler;
    listener = paramT;
  }
  
  public void dispatch(EventDispatcher.Event<T> paramEvent)
  {
    handler.post(new a(this, paramEvent));
  }
  
  public void release()
  {
    released = true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.EventDispatcher.HandlerAndListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */