package io.flutter.embedding.android;

import android.view.KeyEvent;

public abstract interface KeyboardManager$Responder
{
  public abstract void handleEvent(KeyEvent paramKeyEvent, OnKeyEventHandledCallback paramOnKeyEventHandledCallback);
  
  public static abstract interface OnKeyEventHandledCallback
  {
    public abstract void onKeyEventHandled(boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.KeyboardManager.Responder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */