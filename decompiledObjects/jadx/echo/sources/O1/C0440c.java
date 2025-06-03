package O1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: O1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0440c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0440c f3818a = new C0440c();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3819b;

    /* renamed from: O1.c$a */
    public static final class a implements h {
        @Override // O1.C0440c.h
        public void a(Bundle bundle, String key, Object value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putBoolean(key, ((Boolean) value).booleanValue());
        }
    }

    /* renamed from: O1.c$b */
    public static final class b implements h {
        @Override // O1.C0440c.h
        public void a(Bundle bundle, String key, Object value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putInt(key, ((Integer) value).intValue());
        }
    }

    /* renamed from: O1.c$c, reason: collision with other inner class name */
    public static final class C0072c implements h {
        @Override // O1.C0440c.h
        public void a(Bundle bundle, String key, Object value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putLong(key, ((Long) value).longValue());
        }
    }

    /* renamed from: O1.c$d */
    public static final class d implements h {
        @Override // O1.C0440c.h
        public void a(Bundle bundle, String key, Object value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putDouble(key, ((Double) value).doubleValue());
        }
    }

    /* renamed from: O1.c$e */
    public static final class e implements h {
        @Override // O1.C0440c.h
        public void a(Bundle bundle, String key, Object value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putString(key, (String) value);
        }
    }

    /* renamed from: O1.c$f */
    public static final class f implements h {
        @Override // O1.C0440c.h
        public void a(Bundle bundle, String key, Object value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: O1.c$g */
    public static final class g implements h {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // O1.C0440c.h
        public void a(Bundle bundle, String key, Object value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONArray jSONArray = (JSONArray) value;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(key, arrayList);
                return;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    Object obj = jSONArray.get(i7);
                    if (!(obj instanceof String)) {
                        throw new IllegalArgumentException(Intrinsics.i("Unexpected type in an array: ", obj.getClass()));
                    }
                    arrayList.add(obj);
                    if (i8 >= length) {
                        break;
                    } else {
                        i7 = i8;
                    }
                }
            }
            bundle.putStringArrayList(key, arrayList);
        }
    }

    /* renamed from: O1.c$h */
    public interface h {
        void a(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        f3819b = hashMap;
        hashMap.put(Boolean.class, new a());
        hashMap.put(Integer.class, new b());
        hashMap.put(Long.class, new C0072c());
        hashMap.put(Double.class, new d());
        hashMap.put(String.class, new e());
        hashMap.put(String[].class, new f());
        hashMap.put(JSONArray.class, new g());
    }

    public static final Bundle a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object value = jsonObject.get(key);
            if (value != JSONObject.NULL) {
                if (value instanceof JSONObject) {
                    bundle.putBundle(key, a((JSONObject) value));
                } else {
                    h hVar = (h) f3819b.get(value.getClass());
                    if (hVar == null) {
                        throw new IllegalArgumentException(Intrinsics.i("Unsupported type: ", value.getClass()));
                    }
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    hVar.a(bundle, key, value);
                }
            }
        }
        return bundle;
    }
}
