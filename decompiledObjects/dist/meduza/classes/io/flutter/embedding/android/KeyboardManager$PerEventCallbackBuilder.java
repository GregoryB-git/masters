package io.flutter.embedding.android;

import android.view.KeyEvent;

class KeyboardManager$PerEventCallbackBuilder
{
  public boolean isEventHandled;
  public final KeyEvent keyEvent;
  public int unrepliedCount;
  
  public KeyboardManager$PerEventCallbackBuilder(KeyboardManager paramKeyboardManager, KeyEvent paramKeyEvent)
  {
    unrepliedCount = responders.length;
    isEventHandled = false;
    keyEvent = paramKeyEvent;
  }
  
  public KeyboardManager.Responder.OnKeyEventHandledCallback buildCallback()
  {
    return new Callback(null);
  }
  
  public class Callback
    implements KeyboardManager.Responder.OnKeyEventHandledCallback
  {
    public boolean isCalled = false;
    
    private Callback() {}
    
    public void onKeyEventHandled(boolean paramBoolean)
    {
      if (!isCalled)
      {
        isCalled = true;
        KeyboardManager.PerEventCallbackBuilder localPerEventCallbackBuilder = KeyboardManager.PerEventCallbackBuilder.this;
        int i = unrepliedCount - 1;
        unrepliedCount = i;
        paramBoolean |= isEventHandled;
        isEventHandled = paramBoolean;
        if ((i == 0) && (!paramBoolean)) {
          KeyboardManager.access$000(this$0, keyEvent);
        }
        return;
      }
      throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.KeyboardManager.PerEventCallbackBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */