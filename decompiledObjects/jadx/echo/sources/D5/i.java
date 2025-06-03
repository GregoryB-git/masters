package D5;

import D5.i;
import E5.a;
import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final E5.a f1286a;

    public interface a {
        void a(boolean z7);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final KeyEvent f1287a;

        /* renamed from: b, reason: collision with root package name */
        public final Character f1288b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f1287a = keyEvent;
            this.f1288b = ch;
        }
    }

    public i(E5.c cVar) {
        this.f1286a = new E5.a(cVar, "flutter/keyevent", E5.f.f1668a);
    }

    public static a.e b(final a aVar) {
        return new a.e() { // from class: D5.h
            @Override // E5.a.e
            public final void a(Object obj) {
                i.d(i.a.this, obj);
            }
        };
    }

    public static /* synthetic */ void d(a aVar, Object obj) {
        boolean z7 = false;
        if (obj != null) {
            try {
                z7 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e7) {
                AbstractC1995b.b("KeyEventChannel", "Unable to unpack JSON message: " + e7);
            }
        }
        aVar.a(z7);
    }

    public final Map c(b bVar, boolean z7) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z7 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f1287a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f1287a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f1287a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f1287a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f1287a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f1287a.getMetaState()));
        Character ch = bVar.f1288b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f1287a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f1287a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f1287a.getRepeatCount()));
        return hashMap;
    }

    public void e(b bVar, boolean z7, a aVar) {
        this.f1286a.d(c(bVar, z7), b(aVar));
    }
}
