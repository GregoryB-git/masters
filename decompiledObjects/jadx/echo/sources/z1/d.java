package z1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.s;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final a f21628d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final Set f21629e = new CopyOnWriteArraySet();

    /* renamed from: a, reason: collision with root package name */
    public final String f21630a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21631b;

    /* renamed from: c, reason: collision with root package name */
    public final List f21632c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(JSONObject jSONObject) {
            List V6;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(key);
                if (optJSONObject != null) {
                    String k7 = optJSONObject.optString("k");
                    String v7 = optJSONObject.optString("v");
                    Intrinsics.checkNotNullExpressionValue(k7, "k");
                    if (k7.length() != 0) {
                        Set a7 = d.a();
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        V6 = s.V(k7, new String[]{","}, false, 0, 6, null);
                        Intrinsics.checkNotNullExpressionValue(v7, "v");
                        a7.add(new d(key, V6, v7, null));
                    }
                }
            }
        }

        public final Set b() {
            HashSet hashSet = new HashSet();
            Iterator it = d.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((d) it.next()).c());
            }
            return hashSet;
        }

        public final Set c() {
            return new HashSet(d.a());
        }

        public final void d(String rulesFromServer) {
            Intrinsics.checkNotNullParameter(rulesFromServer, "rulesFromServer");
            try {
                d.a().clear();
                a(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        }
    }

    public d(String str, List list, String str2) {
        this.f21630a = str;
        this.f21631b = str2;
        this.f21632c = list;
    }

    public static final /* synthetic */ Set a() {
        if (T1.a.d(d.class)) {
            return null;
        }
        try {
            return f21629e;
        } catch (Throwable th) {
            T1.a.b(th, d.class);
            return null;
        }
    }

    public final List b() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f21632c);
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final String c() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return this.f21630a;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final String d() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return this.f21631b;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public /* synthetic */ d(String str, List list, String str2, g gVar) {
        this(str, list, str2);
    }
}
