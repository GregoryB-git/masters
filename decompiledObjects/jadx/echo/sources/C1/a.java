package C1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: j, reason: collision with root package name */
    public static final b f871j = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f872a;

    /* renamed from: b, reason: collision with root package name */
    public final c f873b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC0012a f874c;

    /* renamed from: d, reason: collision with root package name */
    public final String f875d;

    /* renamed from: e, reason: collision with root package name */
    public final List f876e;

    /* renamed from: f, reason: collision with root package name */
    public final List f877f;

    /* renamed from: g, reason: collision with root package name */
    public final String f878g;

    /* renamed from: h, reason: collision with root package name */
    public final String f879h;

    /* renamed from: i, reason: collision with root package name */
    public final String f880i;

    /* renamed from: C1.a$a, reason: collision with other inner class name */
    public enum EnumC0012a {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0012a[] valuesCustom() {
            EnumC0012a[] valuesCustom = values();
            return (EnumC0012a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final a a(JSONObject mapping) {
            int length;
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            String eventName = mapping.getString("event_name");
            String string = mapping.getString("method");
            Intrinsics.checkNotNullExpressionValue(string, "mapping.getString(\"method\")");
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = string.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            c valueOf = c.valueOf(upperCase);
            String string2 = mapping.getString("event_type");
            Intrinsics.checkNotNullExpressionValue(string2, "mapping.getString(\"event_type\")");
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase2 = string2.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            EnumC0012a valueOf2 = EnumC0012a.valueOf(upperCase2);
            String appVersion = mapping.getString("app_version");
            JSONArray jSONArray = mapping.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i7 = 0;
            if (length2 > 0) {
                int i8 = 0;
                while (true) {
                    int i9 = i8 + 1;
                    JSONObject jsonPath = jSONArray.getJSONObject(i8);
                    Intrinsics.checkNotNullExpressionValue(jsonPath, "jsonPath");
                    arrayList.add(new C1.c(jsonPath));
                    if (i9 >= length2) {
                        break;
                    }
                    i8 = i9;
                }
            }
            String pathType = mapping.optString("path_type", "absolute");
            JSONArray optJSONArray = mapping.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i10 = i7 + 1;
                    JSONObject jsonParameter = optJSONArray.getJSONObject(i7);
                    Intrinsics.checkNotNullExpressionValue(jsonParameter, "jsonParameter");
                    arrayList2.add(new C1.b(jsonParameter));
                    if (i10 >= length) {
                        break;
                    }
                    i7 = i10;
                }
            }
            String componentId = mapping.optString("component_id");
            String activityName = mapping.optString("activity_name");
            Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
            Intrinsics.checkNotNullExpressionValue(appVersion, "appVersion");
            Intrinsics.checkNotNullExpressionValue(componentId, "componentId");
            Intrinsics.checkNotNullExpressionValue(pathType, "pathType");
            Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
            return new a(eventName, valueOf, valueOf2, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }

        public final List b(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i7 = 0;
                        while (true) {
                            int i8 = i7 + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i7);
                            Intrinsics.checkNotNullExpressionValue(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(a(jSONObject));
                            if (i8 >= length) {
                                break;
                            }
                            i7 = i8;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    public enum c {
        MANUAL,
        INFERENCE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public a(String eventName, c method, EnumC0012a type, String appVersion, List path, List parameters, String componentId, String pathType, String activityName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.f872a = eventName;
        this.f873b = method;
        this.f874c = type;
        this.f875d = appVersion;
        this.f876e = path;
        this.f877f = parameters;
        this.f878g = componentId;
        this.f879h = pathType;
        this.f880i = activityName;
    }

    public final String a() {
        return this.f880i;
    }

    public final String b() {
        return this.f872a;
    }

    public final List c() {
        List unmodifiableList = Collections.unmodifiableList(this.f877f);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    public final List d() {
        List unmodifiableList = Collections.unmodifiableList(this.f876e);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }
}
