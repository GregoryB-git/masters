/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package D5;

import D5.h;
import E5.a;
import E5.c;
import E5.f;
import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class i {
    public final E5.a a;

    public i(c c8) {
        this.a = new E5.a(c8, "flutter/keyevent", f.a);
    }

    public static /* synthetic */ void a(a a8, Object object) {
        i.d(a8, object);
    }

    public static a.e b(a a8) {
        return new h(a8);
    }

    public static /* synthetic */ void d(a a8, Object object) {
        boolean bl;
        boolean bl2 = bl = false;
        if (object != null) {
            try {
                bl2 = ((JSONObject)object).getBoolean("handled");
            }
            catch (JSONException jSONException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to unpack JSON message: ");
                stringBuilder.append((Object)jSONException);
                t5.b.b("KeyEventChannel", stringBuilder.toString());
                bl2 = bl;
            }
        }
        a8.a(bl2);
    }

    public final Map c(b b8, boolean bl) {
        HashMap hashMap = new HashMap();
        String string2 = bl ? "keyup" : "keydown";
        hashMap.put((Object)"type", (Object)string2);
        hashMap.put((Object)"keymap", (Object)"android");
        hashMap.put((Object)"flags", (Object)b8.a.getFlags());
        hashMap.put((Object)"plainCodePoint", (Object)b8.a.getUnicodeChar(0));
        hashMap.put((Object)"codePoint", (Object)b8.a.getUnicodeChar());
        hashMap.put((Object)"keyCode", (Object)b8.a.getKeyCode());
        hashMap.put((Object)"scanCode", (Object)b8.a.getScanCode());
        hashMap.put((Object)"metaState", (Object)b8.a.getMetaState());
        string2 = b8.b;
        if (string2 != null) {
            hashMap.put((Object)"character", (Object)string2.toString());
        }
        hashMap.put((Object)"source", (Object)b8.a.getSource());
        hashMap.put((Object)"deviceId", (Object)b8.a.getDeviceId());
        hashMap.put((Object)"repeatCount", (Object)b8.a.getRepeatCount());
        return hashMap;
    }

    public void e(b b8, boolean bl, a a8) {
        this.a.d((Object)this.c(b8, bl), i.b(a8));
    }

    public static interface a {
        public void a(boolean var1);
    }

    public static class b {
        public final KeyEvent a;
        public final Character b;

        public b(KeyEvent keyEvent, Character c8) {
            this.a = keyEvent;
            this.b = c8;
        }
    }

}

