package com.google.android.exoplayer2.util;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class EventDispatcher<T>
{
  private final CopyOnWriteArrayList<HandlerAndListener<T>> listeners = new CopyOnWriteArrayList();
  
  public void addListener(Handler paramHandler, T paramT)
  {
    boolean bool;
    if ((paramHandler != null) && (paramT != null)) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    removeListener(paramT);
    listeners.add(new HandlerAndListener(paramHandler, paramT));
  }
  
  public void dispatch(Event<T> paramEvent)
  {
    Iterator localIterator = listeners.iterator();
    while (localIterator.hasNext()) {
      ((HandlerAndListener)localIterator.next()).dispatch(paramEvent);
    }
  }
  
  public void removeListener(T paramT)
  {
    Iterator localIterator = listeners.iterator();
    while (localIterator.hasNext())
    {
      HandlerAndListener localHandlerAndListener = (HandlerAndListener)localIterator.next();
      if (HandlerAndListener.access$000(localHandlerAndListener) == paramT)
      {
        localHandlerAndListener.release();
        listeners.remove(localHandlerAndListener);
      }
    }
  }
  
  public static abstract interface Event<T>
  {
    public abstract void sendTo(T paramT);
  }
  
  public static final class HandlerAndListener<T>
  {
    private final Handler handler;
    private final T listener;
    private boolean released;
    
    public HandlerAndListener(Handler paramHandler, T paramT)
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.EventDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */