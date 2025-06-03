package Q4;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import r4.InterfaceC1922b;
import w3.InterfaceC2100a;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1922b f4472a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f4473b = Collections.synchronizedMap(new HashMap());

    public r(InterfaceC1922b interfaceC1922b) {
        this.f4472a = interfaceC1922b;
    }

    public void a(String str, com.google.firebase.remoteconfig.internal.b bVar) {
        JSONObject optJSONObject;
        InterfaceC2100a interfaceC2100a = (InterfaceC2100a) this.f4472a.get();
        if (interfaceC2100a == null) {
            return;
        }
        JSONObject h7 = bVar.h();
        if (h7.length() < 1) {
            return;
        }
        JSONObject f7 = bVar.f();
        if (f7.length() >= 1 && (optJSONObject = h7.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString("choiceId");
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.f4473b) {
                try {
                    if (optString.equals(this.f4473b.get(str))) {
                        return;
                    }
                    this.f4473b.put(str, optString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", f7.optString(str));
                    bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", optJSONObject.optString("group"));
                    interfaceC2100a.e("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", optString);
                    interfaceC2100a.e("fp", "_fpc", bundle2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
