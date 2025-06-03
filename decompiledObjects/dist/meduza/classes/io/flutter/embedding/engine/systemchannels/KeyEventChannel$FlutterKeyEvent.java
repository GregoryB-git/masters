package io.flutter.embedding.engine.systemchannels;

import android.view.KeyEvent;

public class KeyEventChannel$FlutterKeyEvent
{
  public final Character complexCharacter;
  public final KeyEvent event;
  
  public KeyEventChannel$FlutterKeyEvent(KeyEvent paramKeyEvent)
  {
    this(paramKeyEvent, null);
  }
  
  public KeyEventChannel$FlutterKeyEvent(KeyEvent paramKeyEvent, Character paramCharacter)
  {
    event = paramKeyEvent;
    complexCharacter = paramCharacter;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.KeyEventChannel.FlutterKeyEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */