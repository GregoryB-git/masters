package com.google.protobuf;

import com.google.protobuf.D;
import java.util.Map;

/* loaded from: classes.dex */
public class G implements F {
    public static int f(int i7, Object obj, Object obj2) {
        E e7 = (E) obj;
        D d7 = (D) obj2;
        int i8 = 0;
        if (e7.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : e7.entrySet()) {
            i8 += d7.a(i7, entry.getKey(), entry.getValue());
        }
        return i8;
    }

    public static E g(Object obj, Object obj2) {
        E e7 = (E) obj;
        E e8 = (E) obj2;
        if (!e8.isEmpty()) {
            if (!e7.n()) {
                e7 = e7.s();
            }
            e7.p(e8);
        }
        return e7;
    }

    @Override // com.google.protobuf.F
    public Object a(Object obj, Object obj2) {
        return g(obj, obj2);
    }

    @Override // com.google.protobuf.F
    public int b(int i7, Object obj, Object obj2) {
        return f(i7, obj, obj2);
    }

    @Override // com.google.protobuf.F
    public Object c(Object obj) {
        ((E) obj).o();
        return obj;
    }

    @Override // com.google.protobuf.F
    public D.a d(Object obj) {
        return ((D) obj).c();
    }

    @Override // com.google.protobuf.F
    public Map e(Object obj) {
        return (E) obj;
    }
}
