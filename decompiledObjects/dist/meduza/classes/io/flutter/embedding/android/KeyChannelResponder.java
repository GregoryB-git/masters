package io.flutter.embedding.android;

import android.view.KeyEvent;
import e;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel.FlutterKeyEvent;

public class KeyChannelResponder
  implements KeyboardManager.Responder
{
  private static final String TAG = "KeyChannelResponder";
  private final KeyboardManager.CharacterCombiner characterCombiner = new KeyboardManager.CharacterCombiner();
  private final KeyEventChannel keyEventChannel;
  
  public KeyChannelResponder(KeyEventChannel paramKeyEventChannel)
  {
    keyEventChannel = paramKeyEventChannel;
  }
  
  public void handleEvent(KeyEvent paramKeyEvent, KeyboardManager.Responder.OnKeyEventHandledCallback paramOnKeyEventHandledCallback)
  {
    int i = paramKeyEvent.getAction();
    boolean bool = false;
    if ((i != 0) && (i != 1))
    {
      paramOnKeyEventHandledCallback.onKeyEventHandled(false);
      return;
    }
    paramKeyEvent = new KeyEventChannel.FlutterKeyEvent(paramKeyEvent, characterCombiner.applyCombiningCharacterToBaseCharacter(paramKeyEvent.getUnicodeChar()));
    if (i != 0) {
      bool = true;
    }
    keyEventChannel.sendFlutterKeyEvent(paramKeyEvent, bool, new e(paramOnKeyEventHandledCallback, 11));
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.KeyChannelResponder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */