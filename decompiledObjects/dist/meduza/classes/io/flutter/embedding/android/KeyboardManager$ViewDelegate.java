package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.plugin.common.BinaryMessenger;

public abstract interface KeyboardManager$ViewDelegate
{
  public abstract BinaryMessenger getBinaryMessenger();
  
  public abstract boolean onTextInputKeyEvent(KeyEvent paramKeyEvent);
  
  public abstract void redispatch(KeyEvent paramKeyEvent);
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.KeyboardManager.ViewDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */