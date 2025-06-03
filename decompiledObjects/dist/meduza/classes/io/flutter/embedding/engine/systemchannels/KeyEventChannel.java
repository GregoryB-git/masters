package io.flutter.embedding.engine.systemchannels;

import android.view.KeyEvent;
import e;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BasicMessageChannel.Reply;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.JSONMessageCodec;
import java.util.HashMap;
import java.util.Map;

public class KeyEventChannel
{
  private static final String TAG = "KeyEventChannel";
  public final BasicMessageChannel<Object> channel;
  
  public KeyEventChannel(BinaryMessenger paramBinaryMessenger)
  {
    channel = new BasicMessageChannel(paramBinaryMessenger, "flutter/keyevent", JSONMessageCodec.INSTANCE);
  }
  
  private static BasicMessageChannel.Reply<Object> createReplyHandler(EventResponseHandler paramEventResponseHandler)
  {
    return new e(paramEventResponseHandler, 12);
  }
  
  private Map<String, Object> encodeKeyEvent(FlutterKeyEvent paramFlutterKeyEvent, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    if (paramBoolean) {
      localObject = "keyup";
    } else {
      localObject = "keydown";
    }
    localHashMap.put("type", localObject);
    localHashMap.put("keymap", "android");
    localHashMap.put("flags", Integer.valueOf(event.getFlags()));
    localHashMap.put("plainCodePoint", Integer.valueOf(event.getUnicodeChar(0)));
    localHashMap.put("codePoint", Integer.valueOf(event.getUnicodeChar()));
    localHashMap.put("keyCode", Integer.valueOf(event.getKeyCode()));
    localHashMap.put("scanCode", Integer.valueOf(event.getScanCode()));
    localHashMap.put("metaState", Integer.valueOf(event.getMetaState()));
    Object localObject = complexCharacter;
    if (localObject != null) {
      localHashMap.put("character", ((Character)localObject).toString());
    }
    localHashMap.put("source", Integer.valueOf(event.getSource()));
    localHashMap.put("deviceId", Integer.valueOf(event.getDeviceId()));
    localHashMap.put("repeatCount", Integer.valueOf(event.getRepeatCount()));
    return localHashMap;
  }
  
  public void sendFlutterKeyEvent(FlutterKeyEvent paramFlutterKeyEvent, boolean paramBoolean, EventResponseHandler paramEventResponseHandler)
  {
    channel.send(encodeKeyEvent(paramFlutterKeyEvent, paramBoolean), createReplyHandler(paramEventResponseHandler));
  }
  
  public static abstract interface EventResponseHandler
  {
    public abstract void onFrameworkResponse(boolean paramBoolean);
  }
  
  public static class FlutterKeyEvent
  {
    public final Character complexCharacter;
    public final KeyEvent event;
    
    public FlutterKeyEvent(KeyEvent paramKeyEvent)
    {
      this(paramKeyEvent, null);
    }
    
    public FlutterKeyEvent(KeyEvent paramKeyEvent, Character paramCharacter)
    {
      event = paramKeyEvent;
      complexCharacter = paramCharacter;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.KeyEventChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */