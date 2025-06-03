package j5;

import android.content.Context;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: j5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1392o extends C1385h {
    public C1392o(Context context, InterfaceC1378a interfaceC1378a) {
        super(context, interfaceC1378a);
    }

    @Override // j5.C1385h
    public String c() {
        return "VGhpcyBpcyB0aGUga2V5IGZvcihBIHNlY3XyZZBzdG9yYWdlIEFFUyBLZXkK";
    }

    @Override // j5.C1385h
    public Cipher d() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }

    @Override // j5.C1385h
    public int e() {
        return 12;
    }

    @Override // j5.C1385h
    public AlgorithmParameterSpec f(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }
}
