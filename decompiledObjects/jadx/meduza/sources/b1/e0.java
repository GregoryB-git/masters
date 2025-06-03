package b1;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import s1.c;

/* loaded from: classes.dex */
public final class e0 {
    public static final Class<? extends Object>[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1725a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1726b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1727c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1728d;

    /* renamed from: e, reason: collision with root package name */
    public final c.b f1729e;

    public static final class a {
        public static e0 a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new e0();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    ec.i.d(str, Constants.KEY);
                    hashMap.put(str, bundle2.get(str));
                }
                return new e0(hashMap);
            }
            ClassLoader classLoader = e0.class.getClassLoader();
            ec.i.b(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                ec.i.c(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new e0(linkedHashMap);
        }
    }

    public e0() {
        this.f1725a = new LinkedHashMap();
        this.f1726b = new LinkedHashMap();
        this.f1727c = new LinkedHashMap();
        this.f1728d = new LinkedHashMap();
        this.f1729e = new x0.j(this, 2);
    }

    public e0(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f1725a = linkedHashMap;
        this.f1726b = new LinkedHashMap();
        this.f1727c = new LinkedHashMap();
        this.f1728d = new LinkedHashMap();
        this.f1729e = new c.b() { // from class: b1.d0
            @Override // s1.c.b
            public final Bundle a() {
                return e0.a(e0.this);
            }
        };
        linkedHashMap.putAll(hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.os.Bundle a(b1.e0 r10) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.e0.a(b1.e0):android.os.Bundle");
    }
}
