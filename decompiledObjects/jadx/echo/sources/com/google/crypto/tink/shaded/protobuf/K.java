package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.H;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class K implements J {
    public static int i(int i7, Object obj, Object obj2) {
        I i8 = (I) obj;
        android.support.v4.media.a.a(obj2);
        if (i8.isEmpty()) {
            return 0;
        }
        Iterator it = i8.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
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

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public int b(int i7, Object obj, Object obj2) {
        return i(i7, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Object c(Object obj) {
        ((I) obj).o();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public H.a d(Object obj) {
        android.support.v4.media.a.a(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Map e(Object obj) {
        return (I) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Object f(Object obj) {
        return I.f().s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public boolean g(Object obj) {
        return !((I) obj).n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Map h(Object obj) {
        return (I) obj;
    }
}
