package j5;

import android.content.Context;

/* renamed from: j5.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1389l {
    AES_CBC_PKCS7Padding(new InterfaceC1391n() { // from class: j5.j
        @Override // j5.InterfaceC1391n
        public final InterfaceC1386i a(Context context, InterfaceC1378a interfaceC1378a) {
            return new C1385h(context, interfaceC1378a);
        }
    }, 1),
    AES_GCM_NoPadding(new InterfaceC1391n() { // from class: j5.k
        @Override // j5.InterfaceC1391n
        public final InterfaceC1386i a(Context context, InterfaceC1378a interfaceC1378a) {
            return new C1392o(context, interfaceC1378a);
        }
    }, 23);


    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC1391n f15473o;

    /* renamed from: p, reason: collision with root package name */
    public final int f15474p;

    EnumC1389l(InterfaceC1391n interfaceC1391n, int i7) {
        this.f15473o = interfaceC1391n;
        this.f15474p = i7;
    }
}
