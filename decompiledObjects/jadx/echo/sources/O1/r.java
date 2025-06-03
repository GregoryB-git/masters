package O1;

import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: w, reason: collision with root package name */
    public static final a f3915w = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3916a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3917b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3918c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3919d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumSet f3920e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f3921f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3922g;

    /* renamed from: h, reason: collision with root package name */
    public final C0447j f3923h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3924i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3925j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3926k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3927l;

    /* renamed from: m, reason: collision with root package name */
    public final JSONArray f3928m;

    /* renamed from: n, reason: collision with root package name */
    public final String f3929n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3930o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3931p;

    /* renamed from: q, reason: collision with root package name */
    public final String f3932q;

    /* renamed from: r, reason: collision with root package name */
    public final String f3933r;

    /* renamed from: s, reason: collision with root package name */
    public final String f3934s;

    /* renamed from: t, reason: collision with root package name */
    public final JSONArray f3935t;

    /* renamed from: u, reason: collision with root package name */
    public final JSONArray f3936u;

    /* renamed from: v, reason: collision with root package name */
    public final Map f3937v;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final a f3938e = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f3939a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3940b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f3941c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f3942d;

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final b a(JSONObject dialogConfigJSON) {
                List V6;
                Intrinsics.checkNotNullParameter(dialogConfigJSON, "dialogConfigJSON");
                String dialogNameWithFeature = dialogConfigJSON.optString("name");
                if (P.c0(dialogNameWithFeature)) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(dialogNameWithFeature, "dialogNameWithFeature");
                V6 = kotlin.text.s.V(dialogNameWithFeature, new String[]{"|"}, false, 0, 6, null);
                if (V6.size() != 2) {
                    return null;
                }
                String str = (String) W5.w.r(V6);
                String str2 = (String) W5.w.z(V6);
                if (P.c0(str) || P.c0(str2)) {
                    return null;
                }
                String optString = dialogConfigJSON.optString("url");
                return new b(str, str2, P.c0(optString) ? null : Uri.parse(optString), b(dialogConfigJSON.optJSONArray("versions")), null);
            }

            public final int[] b(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                if (length <= 0) {
                    return iArr;
                }
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    int i9 = -1;
                    int optInt = jSONArray.optInt(i7, -1);
                    if (optInt == -1) {
                        String versionString = jSONArray.optString(i7);
                        if (!P.c0(versionString)) {
                            try {
                                Intrinsics.checkNotNullExpressionValue(versionString, "versionString");
                                i9 = Integer.parseInt(versionString);
                            } catch (NumberFormatException e7) {
                                P.i0("FacebookSDK", e7);
                            }
                            optInt = i9;
                        }
                    }
                    iArr[i7] = optInt;
                    if (i8 >= length) {
                        return iArr;
                    }
                    i7 = i8;
                }
            }
        }

        public b(String str, String str2, Uri uri, int[] iArr) {
            this.f3939a = str;
            this.f3940b = str2;
            this.f3941c = uri;
            this.f3942d = iArr;
        }

        public final String a() {
            return this.f3939a;
        }

        public final String b() {
            return this.f3940b;
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, kotlin.jvm.internal.g gVar) {
            this(str, str2, uri, iArr);
        }
    }

    public r(boolean z7, String nuxContent, boolean z8, int i7, EnumSet smartLoginOptions, Map dialogConfigurations, boolean z9, C0447j errorClassification, String smartLoginBookmarkIconURL, String smartLoginMenuIconURL, boolean z10, boolean z11, JSONArray jSONArray, String sdkUpdateMessage, boolean z12, boolean z13, String str, String str2, String str3, JSONArray jSONArray2, JSONArray jSONArray3, Map map) {
        Intrinsics.checkNotNullParameter(nuxContent, "nuxContent");
        Intrinsics.checkNotNullParameter(smartLoginOptions, "smartLoginOptions");
        Intrinsics.checkNotNullParameter(dialogConfigurations, "dialogConfigurations");
        Intrinsics.checkNotNullParameter(errorClassification, "errorClassification");
        Intrinsics.checkNotNullParameter(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        Intrinsics.checkNotNullParameter(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        Intrinsics.checkNotNullParameter(sdkUpdateMessage, "sdkUpdateMessage");
        this.f3916a = z7;
        this.f3917b = nuxContent;
        this.f3918c = z8;
        this.f3919d = i7;
        this.f3920e = smartLoginOptions;
        this.f3921f = dialogConfigurations;
        this.f3922g = z9;
        this.f3923h = errorClassification;
        this.f3924i = smartLoginBookmarkIconURL;
        this.f3925j = smartLoginMenuIconURL;
        this.f3926k = z10;
        this.f3927l = z11;
        this.f3928m = jSONArray;
        this.f3929n = sdkUpdateMessage;
        this.f3930o = z12;
        this.f3931p = z13;
        this.f3932q = str;
        this.f3933r = str2;
        this.f3934s = str3;
        this.f3935t = jSONArray2;
        this.f3936u = jSONArray3;
        this.f3937v = map;
    }

    public final boolean a() {
        return this.f3922g;
    }

    public final boolean b() {
        return this.f3927l;
    }

    public final C0447j c() {
        return this.f3923h;
    }

    public final JSONArray d() {
        return this.f3928m;
    }

    public final boolean e() {
        return this.f3926k;
    }

    public final JSONArray f() {
        return this.f3936u;
    }

    public final JSONArray g() {
        return this.f3935t;
    }

    public final String h() {
        return this.f3932q;
    }

    public final String i() {
        return this.f3934s;
    }

    public final String j() {
        return this.f3929n;
    }

    public final int k() {
        return this.f3919d;
    }

    public final EnumSet l() {
        return this.f3920e;
    }

    public final String m() {
        return this.f3933r;
    }

    public final boolean n() {
        return this.f3916a;
    }
}
