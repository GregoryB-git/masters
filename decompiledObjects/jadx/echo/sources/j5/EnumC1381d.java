package j5;

import android.content.Context;

/* renamed from: j5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1381d {
    RSA_ECB_PKCS1Padding(new InterfaceC1382e() { // from class: j5.b
        @Override // j5.InterfaceC1382e
        public final InterfaceC1378a a(Context context) {
            return new C1383f(context);
        }
    }, 1),
    RSA_ECB_OAEPwithSHA_256andMGF1Padding(new InterfaceC1382e() { // from class: j5.c
        @Override // j5.InterfaceC1382e
        public final InterfaceC1378a a(Context context) {
            return new C1384g(context);
        }
    }, 23);


    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC1382e f15463o;

    /* renamed from: p, reason: collision with root package name */
    public final int f15464p;

    EnumC1381d(InterfaceC1382e interfaceC1382e, int i7) {
        this.f15463o = interfaceC1382e;
        this.f15464p = i7;
    }
}
