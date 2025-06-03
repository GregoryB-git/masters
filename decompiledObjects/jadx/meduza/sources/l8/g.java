package l8;

import io.flutter.plugins.firebase.analytics.Constants;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g extends JSONObject {
    public g(String str) {
        put(Constants.USER_ID, str);
    }
}
