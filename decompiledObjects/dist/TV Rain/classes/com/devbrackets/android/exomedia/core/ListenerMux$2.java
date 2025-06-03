package com.devbrackets.android.exomedia.core;

import com.devbrackets.android.exomedia.listener.OnCompletionListener;

class ListenerMux$2
  implements Runnable
{
  public ListenerMux$2(ListenerMux paramListenerMux) {}
  
  public void run()
  {
    if (ListenerMux.access$100(this$0) != null) {
      ListenerMux.access$100(this$0).onCompletion();
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.ListenerMux.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */