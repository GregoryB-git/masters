package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.H;
import java.util.Map;

/* loaded from: classes.dex */
public class K implements J {
    public static int i(int i7, Object obj, Object obj2) {
        I i8 = (I) obj;
        H h7 = (H) obj2;
        int i9 = 0;
        if (i8.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : i8.entrySet()) {
            i9 += h7.a(i7, entry.getKey(), entry.getValue());
        }
        return i9;
    }

    public static I j(Object obj, Object obj2) {
        I i7 = (I) obj;
        I i8 = (I) obj2;
        if (!i8.isEmpty()) {
            if (!i7.n()) {
                i7 = i7.s();
            }
            i7.p(i8);
        }
        return i7;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public int b(int i7, Object obj, Object obj2) {
        return i(i7, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Object c(Object obj) {
        ((I) obj).o();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public H.a d(Object obj) {
        return ((H) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Map e(Object obj) {
        return (I) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Object f(Object obj) {
        return I.f().s();
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public boolean g(Object obj) {
        return !((I) obj).n();
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Map h(Object obj) {
        return (I) obj;
    }
}
