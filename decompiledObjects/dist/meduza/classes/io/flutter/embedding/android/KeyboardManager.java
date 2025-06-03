package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import f;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.embedding.engine.systemchannels.KeyboardChannel;
import io.flutter.embedding.engine.systemchannels.KeyboardChannel.KeyboardMethodHandler;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate;
import java.util.HashSet;
import java.util.Map;

public class KeyboardManager
  implements InputConnectionAdaptor.KeyboardDelegate, KeyboardChannel.KeyboardMethodHandler
{
  private static final String TAG = "KeyboardManager";
  private final HashSet<KeyEvent> redispatchedEvents = new HashSet();
  public final Responder[] responders;
  private final ViewDelegate viewDelegate;
  
  public KeyboardManager(ViewDelegate paramViewDelegate)
  {
    viewDelegate = paramViewDelegate;
    responders = new Responder[] { new KeyEmbedderResponder(paramViewDelegate.getBinaryMessenger()), new KeyChannelResponder(new KeyEventChannel(paramViewDelegate.getBinaryMessenger())) };
    new KeyboardChannel(paramViewDelegate.getBinaryMessenger()).setKeyboardMethodHandler(this);
  }
  
  private void onUnhandled(KeyEvent paramKeyEvent)
  {
    ViewDelegate localViewDelegate = viewDelegate;
    if ((localViewDelegate != null) && (!localViewDelegate.onTextInputKeyEvent(paramKeyEvent)))
    {
      redispatchedEvents.add(paramKeyEvent);
      viewDelegate.redispatch(paramKeyEvent);
      if (redispatchedEvents.remove(paramKeyEvent)) {
        Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
      }
    }
  }
  
  public void destroy()
  {
    int i = redispatchedEvents.size();
    if (i > 0)
    {
      StringBuilder localStringBuilder = f.l("A KeyboardManager was destroyed with ");
      localStringBuilder.append(String.valueOf(i));
      localStringBuilder.append(" unhandled redispatch event(s).");
      Log.w("KeyboardManager", localStringBuilder.toString());
    }
  }
  
  public Map<Long, Long> getKeyboardState()
  {
    return ((KeyEmbedderResponder)responders[0]).getPressedState();
  }
  
  public boolean handleEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = redispatchedEvents.remove(paramKeyEvent);
    int i = 0;
    if (bool) {
      return false;
    }
    if (responders.length > 0)
    {
      PerEventCallbackBuilder localPerEventCallbackBuilder = new PerEventCallbackBuilder(paramKeyEvent);
      Responder[] arrayOfResponder = responders;
      int j = arrayOfResponder.length;
      while (i < j)
      {
        arrayOfResponder[i].handleEvent(paramKeyEvent, localPerEventCallbackBuilder.buildCallback());
        i++;
      }
    }
    onUnhandled(paramKeyEvent);
    return true;
  }
  
  public static class CharacterCombiner
  {
    private int combiningCharacter = 0;
    
    public Character applyCombiningCharacterToBaseCharacter(int paramInt)
    {
      int i = (char)paramInt;
      int j;
      if ((0x80000000 & paramInt) != 0) {
        j = 1;
      } else {
        j = 0;
      }
      int m;
      if (j != 0)
      {
        j = paramInt & 0x7FFFFFFF;
        int k = combiningCharacter;
        paramInt = j;
        if (k != 0) {
          paramInt = KeyCharacterMap.getDeadChar(k, j);
        }
        combiningCharacter = paramInt;
        m = i;
      }
      else
      {
        j = combiningCharacter;
        m = i;
        if (j != 0)
        {
          j = KeyCharacterMap.getDeadChar(j, paramInt);
          paramInt = i;
          if (j > 0) {
            paramInt = (char)j;
          }
          combiningCharacter = 0;
          m = paramInt;
        }
      }
      return Character.valueOf(m);
    }
  }
  
  public class PerEventCallbackBuilder
  {
    public boolean isEventHandled = false;
    public final KeyEvent keyEvent;
    public int unrepliedCount = responders.length;
    
    public PerEventCallbackBuilder(KeyEvent paramKeyEvent)
    {
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
  
  public static abstract interface Responder
  {
    public abstract void handleEvent(KeyEvent paramKeyEvent, OnKeyEventHandledCallback paramOnKeyEventHandledCallback);
    
    public static abstract interface OnKeyEventHandledCallback
    {
      public abstract void onKeyEventHandled(boolean paramBoolean);
    }
  }
  
  public static abstract interface ViewDelegate
  {
    public abstract BinaryMessenger getBinaryMessenger();
    
    public abstract boolean onTextInputKeyEvent(KeyEvent paramKeyEvent);
    
    public abstract void redispatch(KeyEvent paramKeyEvent);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.KeyboardManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */