package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.O;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1086a implements O {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0172a implements O.a {
        public static j0 l(O o7) {
            return new j0(o7);
        }
    }

    public abstract int e(e0 e0Var);

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public byte[] f() {
        try {
            byte[] bArr = new byte[a()];
            AbstractC1096k U6 = AbstractC1096k.U(bArr);
            g(U6);
            U6.c();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException(h("byte array"), e7);
        }
    }

    public final String h(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public j0 i() {
        return new j0(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public AbstractC1093h j() {
        try {
            AbstractC1093h.C0173h T6 = AbstractC1093h.T(a());
            g(T6.b());
            return T6.a();
        } catch (IOException e7) {
            throw new RuntimeException(h("ByteString"), e7);
        }
    }
}
