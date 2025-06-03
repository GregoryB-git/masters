package C1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final a f893i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f894a;

    /* renamed from: b, reason: collision with root package name */
    public final int f895b;

    /* renamed from: c, reason: collision with root package name */
    public final int f896c;

    /* renamed from: d, reason: collision with root package name */
    public final String f897d;

    /* renamed from: e, reason: collision with root package name */
    public final String f898e;

    /* renamed from: f, reason: collision with root package name */
    public final String f899f;

    /* renamed from: g, reason: collision with root package name */
    public final String f900g;

    /* renamed from: h, reason: collision with root package name */
    public final int f901h;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public enum b {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);


        /* renamed from: o, reason: collision with root package name */
        public final int f908o;

        b(int i7) {
            this.f908o = i7;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final int e() {
            return this.f908o;
        }
    }

    public c(JSONObject component) {
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("class_name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f894a = string;
        this.f895b = component.optInt("index", -1);
        this.f896c = component.optInt("id");
        String optString = component.optString("text");
        Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PATH_TEXT_KEY)");
        this.f897d = optString;
        String optString2 = component.optString("tag");
        Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(PATH_TAG_KEY)");
        this.f898e = optString2;
        String optString3 = component.optString("description");
        Intrinsics.checkNotNullExpressionValue(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f899f = optString3;
        String optString4 = component.optString("hint");
        Intrinsics.checkNotNullExpressionValue(optString4, "component.optString(PATH_HINT_KEY)");
        this.f900g = optString4;
        this.f901h = component.optInt("match_bitmask");
    }

    public final String a() {
        return this.f894a;
    }

    public final String b() {
        return this.f899f;
    }

    public final String c() {
        return this.f900g;
    }

    public final int d() {
        return this.f896c;
    }

    public final int e() {
        return this.f895b;
    }

    public final int f() {
        return this.f901h;
    }

    public final String g() {
        return this.f898e;
    }

    public final String h() {
        return this.f897d;
    }
}
