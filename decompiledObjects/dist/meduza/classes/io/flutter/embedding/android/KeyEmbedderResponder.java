package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import x0.g;

public class KeyEmbedderResponder
  implements KeyboardManager.Responder
{
  private static final String TAG = "KeyEmbedderResponder";
  private final KeyboardManager.CharacterCombiner characterCombiner = new KeyboardManager.CharacterCombiner();
  private final BinaryMessenger messenger;
  private final HashMap<Long, Long> pressingRecords = new HashMap();
  private final HashMap<Long, KeyboardMap.TogglingGoal> togglingGoals = new HashMap();
  
  public KeyEmbedderResponder(BinaryMessenger paramBinaryMessenger)
  {
    messenger = paramBinaryMessenger;
    for (Object localObject : KeyboardMap.getTogglingGoals()) {
      togglingGoals.put(Long.valueOf(logicalKey), localObject);
    }
  }
  
  private static KeyData.Type getEventType(KeyEvent paramKeyEvent)
  {
    int i;
    if (paramKeyEvent.getRepeatCount() > 0) {
      i = 1;
    } else {
      i = 0;
    }
    int j = paramKeyEvent.getAction();
    if (j != 0)
    {
      if (j == 1) {
        return KeyData.Type.kUp;
      }
      throw new AssertionError("Unexpected event type");
    }
    if (i != 0) {
      paramKeyEvent = KeyData.Type.kRepeat;
    } else {
      paramKeyEvent = KeyData.Type.kDown;
    }
    return paramKeyEvent;
  }
  
  private Long getLogicalKey(KeyEvent paramKeyEvent)
  {
    Long localLong = (Long)KeyboardMap.keyCodeToLogical.get(Long.valueOf(paramKeyEvent.getKeyCode()));
    if (localLong != null) {
      return localLong;
    }
    return Long.valueOf(keyOfPlane(paramKeyEvent.getKeyCode(), 73014444032L));
  }
  
  private Long getPhysicalKey(KeyEvent paramKeyEvent)
  {
    long l = paramKeyEvent.getScanCode();
    if (l == 0L) {}
    for (int i = paramKeyEvent.getKeyCode();; i = paramKeyEvent.getScanCode())
    {
      return Long.valueOf(keyOfPlane(i, 73014444032L));
      Long localLong = (Long)KeyboardMap.scanCodeToPhysical.get(Long.valueOf(l));
      if (localLong != null) {
        return localLong;
      }
    }
  }
  
  private boolean handleEventImpl(KeyEvent paramKeyEvent, KeyboardManager.Responder.OnKeyEventHandledCallback paramOnKeyEventHandledCallback)
  {
    if ((paramKeyEvent.getScanCode() == 0) && (paramKeyEvent.getKeyCode() == 0)) {
      return false;
    }
    Long localLong1 = getPhysicalKey(paramKeyEvent);
    Long localLong2 = getLogicalKey(paramKeyEvent);
    ArrayList localArrayList = new ArrayList();
    Object localObject2;
    boolean bool;
    for (localObject2 : KeyboardMap.pressingGoals)
    {
      if ((paramKeyEvent.getMetaState() & mask) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      synchronizePressingKey((KeyboardMap.PressingGoal)localObject2, bool, localLong2.longValue(), localLong1.longValue(), paramKeyEvent, localArrayList);
    }
    ??? = togglingGoals.values().iterator();
    while (((Iterator)???).hasNext())
    {
      localObject2 = (KeyboardMap.TogglingGoal)((Iterator)???).next();
      if ((paramKeyEvent.getMetaState() & mask) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      synchronizeTogglingKey((KeyboardMap.TogglingGoal)localObject2, bool, localLong2.longValue(), paramKeyEvent);
    }
    ??? = paramKeyEvent.getAction();
    if (??? != 0)
    {
      if (??? != 1) {
        return false;
      }
      ??? = 0;
    }
    else
    {
      ??? = 1;
    }
    ??? = (Long)pressingRecords.get(localLong1);
    KeyData localKeyData = null;
    if (??? != 0)
    {
      if (??? == null) {}
      for (;;)
      {
        ??? = KeyData.Type.kDown;
        break;
        if (paramKeyEvent.getRepeatCount() > 0)
        {
          ??? = KeyData.Type.kRepeat;
          break;
        }
        synthesizeEvent(false, (Long)???, localLong1, paramKeyEvent.getEventTime());
      }
      char c = characterCombiner.applyCombiningCharacterToBaseCharacter(paramKeyEvent.getUnicodeChar()).charValue();
      localObject2 = ???;
      if (c != 0)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(c);
        str = ((StringBuilder)localObject2).toString();
        localObject2 = ???;
        break label359;
      }
    }
    else
    {
      if (??? == null) {
        return false;
      }
      localObject2 = KeyData.Type.kUp;
    }
    String str = null;
    label359:
    if (localObject2 != KeyData.Type.kRepeat)
    {
      ??? = localKeyData;
      if (??? != 0) {
        ??? = localLong2;
      }
      updatePressingState(localLong1, (Long)???);
    }
    if (localObject2 == KeyData.Type.kDown)
    {
      ??? = (KeyboardMap.TogglingGoal)togglingGoals.get(localLong2);
      if (??? != null) {
        enabled ^= true;
      }
    }
    localKeyData = new KeyData();
    ??? = paramKeyEvent.getSource();
    if (??? != 513) {
      if (??? != 1025) {
        if (??? != 16777232) {
          if (??? != 33554433) {
            ??? = KeyData.DeviceType.kKeyboard;
          }
        }
      }
    }
    for (;;)
    {
      deviceType = ((KeyData.DeviceType)???);
      break;
      ??? = KeyData.DeviceType.kHdmi;
      continue;
      ??? = KeyData.DeviceType.kJoystick;
      continue;
      ??? = KeyData.DeviceType.kGamepad;
      continue;
      ??? = KeyData.DeviceType.kDirectionalPad;
    }
    timestamp = paramKeyEvent.getEventTime();
    type = ((KeyData.Type)localObject2);
    logicalKey = localLong2.longValue();
    physicalKey = localLong1.longValue();
    character = str;
    synthesized = false;
    sendKeyEvent(localKeyData, paramOnKeyEventHandledCallback);
    paramKeyEvent = localArrayList.iterator();
    while (paramKeyEvent.hasNext()) {
      ((Runnable)paramKeyEvent.next()).run();
    }
    return true;
  }
  
  private static long keyOfPlane(long paramLong1, long paramLong2)
  {
    return paramLong1 & 0xFFFFFFFF | paramLong2;
  }
  
  private void sendKeyEvent(KeyData paramKeyData, KeyboardManager.Responder.OnKeyEventHandledCallback paramOnKeyEventHandledCallback)
  {
    if (paramOnKeyEventHandledCallback == null) {
      paramOnKeyEventHandledCallback = null;
    } else {
      paramOnKeyEventHandledCallback = new c(paramOnKeyEventHandledCallback);
    }
    messenger.send("flutter/keydata", paramKeyData.toBytes(), paramOnKeyEventHandledCallback);
  }
  
  private void synthesizeEvent(boolean paramBoolean, Long paramLong1, Long paramLong2, long paramLong)
  {
    KeyData localKeyData = new KeyData();
    timestamp = paramLong;
    KeyData.Type localType;
    if (paramBoolean) {
      localType = KeyData.Type.kDown;
    } else {
      localType = KeyData.Type.kUp;
    }
    type = localType;
    logicalKey = paramLong1.longValue();
    physicalKey = paramLong2.longValue();
    character = null;
    synthesized = true;
    deviceType = KeyData.DeviceType.kKeyboard;
    if ((paramLong2.longValue() != 0L) && (paramLong1.longValue() != 0L))
    {
      if (!paramBoolean) {
        paramLong1 = null;
      }
      updatePressingState(paramLong2, paramLong1);
    }
    sendKeyEvent(localKeyData, null);
  }
  
  public Map<Long, Long> getPressedState()
  {
    return Collections.unmodifiableMap(pressingRecords);
  }
  
  public void handleEvent(KeyEvent paramKeyEvent, KeyboardManager.Responder.OnKeyEventHandledCallback paramOnKeyEventHandledCallback)
  {
    if (!handleEventImpl(paramKeyEvent, paramOnKeyEventHandledCallback))
    {
      synthesizeEvent(true, Long.valueOf(0L), Long.valueOf(0L), 0L);
      paramOnKeyEventHandledCallback.onKeyEventHandled(true);
    }
  }
  
  public void synchronizePressingKey(KeyboardMap.PressingGoal paramPressingGoal, boolean paramBoolean, long paramLong1, long paramLong2, KeyEvent paramKeyEvent, ArrayList<Runnable> paramArrayList)
  {
    Object localObject1 = keys;
    boolean[] arrayOfBoolean = new boolean[localObject1.length];
    localObject1 = new Boolean[localObject1.length];
    int i = 0;
    int j = 0;
    int m;
    for (int k = j;; k++)
    {
      Object localObject2 = keys;
      m = localObject2.length;
      int n = 1;
      if (k >= m) {
        break;
      }
      localObject2 = localObject2[k];
      boolean bool = pressingRecords.containsKey(Long.valueOf(physicalKey));
      arrayOfBoolean[k] = bool;
      if (logicalKey == paramLong1)
      {
        m = 1.$SwitchMap$io$flutter$embedding$android$KeyData$Type[getEventType(paramKeyEvent).ordinal()];
        if (m != 1)
        {
          if (m != 2)
          {
            if (m != 3) {
              continue;
            }
            if (!paramBoolean) {
              paramArrayList.add(new g(this, localObject2, paramKeyEvent, 10));
            }
            localObject1[k] = Boolean.valueOf(arrayOfBoolean[k]);
            m = n;
          }
          else
          {
            localObject1[k] = Boolean.valueOf(arrayOfBoolean[k]);
            continue;
          }
        }
        else
        {
          localObject1[k] = Boolean.FALSE;
          m = n;
          if (!paramBoolean)
          {
            paramArrayList.add(new d(this, (KeyboardMap.KeyPair)localObject2, paramLong2, paramKeyEvent));
            m = n;
          }
        }
      }
      else
      {
        m = n;
        if (j == 0) {
          if (bool) {
            m = n;
          } else {
            m = 0;
          }
        }
      }
      j = m;
    }
    if (paramBoolean)
    {
      for (m = 0; m < keys.length; m++) {
        if (localObject1[m] == null) {
          if (j != 0)
          {
            localObject1[m] = Boolean.valueOf(arrayOfBoolean[m]);
          }
          else
          {
            localObject1[m] = Boolean.TRUE;
            j = 1;
          }
        }
      }
      m = i;
      if (j == 0)
      {
        localObject1[0] = Boolean.TRUE;
        m = i;
      }
    }
    else
    {
      for (j = 0;; j++)
      {
        m = i;
        if (j >= keys.length) {
          break;
        }
        if (localObject1[j] == null) {
          localObject1[j] = Boolean.FALSE;
        }
      }
    }
    while (m < keys.length)
    {
      if (arrayOfBoolean[m] != localObject1[m].booleanValue())
      {
        paramArrayList = keys[m];
        synthesizeEvent(localObject1[m].booleanValue(), Long.valueOf(logicalKey), Long.valueOf(physicalKey), paramKeyEvent.getEventTime());
      }
      m++;
    }
  }
  
  public void synchronizeTogglingKey(KeyboardMap.TogglingGoal paramTogglingGoal, boolean paramBoolean, long paramLong, KeyEvent paramKeyEvent)
  {
    if (logicalKey == paramLong) {
      return;
    }
    if (enabled != paramBoolean)
    {
      paramBoolean = pressingRecords.containsKey(Long.valueOf(physicalKey)) ^ true;
      if (paramBoolean) {
        enabled ^= true;
      }
      synthesizeEvent(paramBoolean, Long.valueOf(logicalKey), Long.valueOf(physicalKey), paramKeyEvent.getEventTime());
      if (!paramBoolean) {
        enabled ^= true;
      }
      synthesizeEvent(paramBoolean ^ true, Long.valueOf(logicalKey), Long.valueOf(physicalKey), paramKeyEvent.getEventTime());
    }
  }
  
  public void updatePressingState(Long paramLong1, Long paramLong2)
  {
    if (paramLong2 != null)
    {
      if ((Long)pressingRecords.put(paramLong1, paramLong2) != null) {
        throw new AssertionError("The key was not empty");
      }
    }
    else {
      if ((Long)pressingRecords.remove(paramLong1) == null) {
        break label48;
      }
    }
    return;
    label48:
    throw new AssertionError("The key was empty");
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.KeyEmbedderResponder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */