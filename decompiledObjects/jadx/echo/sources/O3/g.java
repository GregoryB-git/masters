package O3;

import H3.InterfaceC0401x;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0401x f4003a;

    public g(InterfaceC0401x interfaceC0401x) {
        this.f4003a = interfaceC0401x;
    }

    public static h a(int i7) {
        if (i7 == 3) {
            return new l();
        }
        E3.f.f().d("Could not determine SettingsJsonTransform for settings version " + i7 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f4003a, jSONObject);
    }
}
