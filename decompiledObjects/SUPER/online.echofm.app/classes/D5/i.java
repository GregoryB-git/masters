package D5;

import E5.a;
import E5.a.e;
import E5.c;
import E5.f;
import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class i
{
  public final a a;
  
  public i(c paramc)
  {
    a = new a(paramc, "flutter/keyevent", f.a);
  }
  
  public static a.e b(a parama)
  {
    return new h(parama);
  }
  
  public final Map c(b paramb, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    if (paramBoolean) {
      localObject = "keyup";
    } else {
      localObject = "keydown";
    }
    localHashMap.put("type", localObject);
    localHashMap.put("keymap", "android");
    localHashMap.put("flags", Integer.valueOf(a.getFlags()));
    localHashMap.put("plainCodePoint", Integer.valueOf(a.getUnicodeChar(0)));
    localHashMap.put("codePoint", Integer.valueOf(a.getUnicodeChar()));
    localHashMap.put("keyCode", Integer.valueOf(a.getKeyCode()));
    localHashMap.put("scanCode", Integer.valueOf(a.getScanCode()));
    localHashMap.put("metaState", Integer.valueOf(a.getMetaState()));
    Object localObject = b;
    if (localObject != null) {
      localHashMap.put("character", ((Character)localObject).toString());
    }
    localHashMap.put("source", Integer.valueOf(a.getSource()));
    localHashMap.put("deviceId", Integer.valueOf(a.getDeviceId()));
    localHashMap.put("repeatCount", Integer.valueOf(a.getRepeatCount()));
    return localHashMap;
  }
  
  public void e(b paramb, boolean paramBoolean, a parama)
  {
    a.d(c(paramb, paramBoolean), b(parama));
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
  
  public static class b
  {
    public final KeyEvent a;
    public final Character b;
    
    public b(KeyEvent paramKeyEvent, Character paramCharacter)
    {
      a = paramKeyEvent;
      b = paramCharacter;
    }
  }
}

/* Location:
 * Qualified Name:     D5.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */