// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import t5.b;
import org.json.JSONObject;
import E5.f;
import E5.c;
import E5.a;

public class i
{
    public final E5.a a;
    
    public i(final c c) {
        this.a = new E5.a(c, "flutter/keyevent", f.a);
    }
    
    public static E5.a.e b(final a a) {
        return new h(a);
    }
    
    public final Map c(final b b, final boolean b2) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        String s;
        if (b2) {
            s = "keyup";
        }
        else {
            s = "keydown";
        }
        hashMap.put("type", s);
        hashMap.put("keymap", "android");
        hashMap.put("flags", (String)b.a.getFlags());
        hashMap.put("plainCodePoint", (String)b.a.getUnicodeChar(0));
        hashMap.put("codePoint", (String)b.a.getUnicodeChar());
        hashMap.put("keyCode", (String)b.a.getKeyCode());
        hashMap.put("scanCode", (String)b.a.getScanCode());
        hashMap.put("metaState", (String)b.a.getMetaState());
        final Character b3 = b.b;
        if (b3 != null) {
            hashMap.put("character", b3.toString());
        }
        hashMap.put("source", (String)b.a.getSource());
        hashMap.put("deviceId", (String)b.a.getDeviceId());
        hashMap.put("repeatCount", (String)b.a.getRepeatCount());
        return hashMap;
    }
    
    public void e(final b b, final boolean b2, final a a) {
        this.a.d(this.c(b, b2), b(a));
    }
    
    public interface a
    {
        void a(final boolean p0);
    }
    
    public static class b
    {
        public final KeyEvent a;
        public final Character b;
        
        public b(final KeyEvent a, final Character b) {
            this.a = a;
            this.b = b;
        }
    }
}
