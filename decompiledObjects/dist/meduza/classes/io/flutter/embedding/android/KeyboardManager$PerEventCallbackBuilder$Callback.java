package io.flutter.embedding.android;

class KeyboardManager$PerEventCallbackBuilder$Callback
  implements KeyboardManager.Responder.OnKeyEventHandledCallback
{
  public boolean isCalled = false;
  
  private KeyboardManager$PerEventCallbackBuilder$Callback(KeyboardManager.PerEventCallbackBuilder paramPerEventCallbackBuilder) {}
  
  public void onKeyEventHandled(boolean paramBoolean)
  {
    if (!isCalled)
    {
      isCalled = true;
      KeyboardManager.PerEventCallbackBuilder localPerEventCallbackBuilder = this$1;
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

/* Location:
 * Qualified Name:     io.flutter.embedding.android.KeyboardManager.PerEventCallbackBuilder.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */