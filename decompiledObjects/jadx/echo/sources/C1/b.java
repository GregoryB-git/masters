package C1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f888e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f889a;

    /* renamed from: b, reason: collision with root package name */
    public final String f890b;

    /* renamed from: c, reason: collision with root package name */
    public final List f891c;

    /* renamed from: d, reason: collision with root package name */
    public final String f892d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public b(JSONObject component) {
        int length;
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f889a = string;
        String optString = component.optString("value");
        Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f890b = optString;
        String optString2 = component.optString("path_type", "absolute");
        Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f892d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = component.optJSONArray("path");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                JSONObject jSONObject = optJSONArray.getJSONObject(i7);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new c(jSONObject));
                if (i8 >= length) {
                    break;
                } else {
                    i7 = i8;
                }
            }
        }
        this.f891c = arrayList;
    }

    public final String a() {
        return this.f889a;
    }

    public final List b() {
        return this.f891c;
    }

    public final String c() {
        return this.f892d;
    }

    public final String d() {
        return this.f890b;
    }
}
