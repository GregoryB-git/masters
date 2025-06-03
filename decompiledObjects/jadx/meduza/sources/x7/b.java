package x7;

import o7.l0;
import o7.t;
import o7.x;
import p2.m0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final x<String> f17203a;

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f17204b;

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f17205c;

    /* renamed from: d, reason: collision with root package name */
    public static final l0 f17206d;

    static {
        int i10 = x.f12072c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f17203a = x.p(15, objArr);
        t.b bVar = t.f12050b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        x6.b.w(7, objArr2);
        f17204b = t.o(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        x6.b.w(3, objArr3);
        f17205c = t.o(3, objArr3);
        f17206d = t.u("_r", "_dbg");
        t.a aVar = new t.a();
        String[] strArr = m0.f12889a;
        x6.b.w(15, strArr);
        aVar.b(aVar.f12042b + 15);
        System.arraycopy(strArr, 0, aVar.f12041a, aVar.f12042b, 15);
        aVar.f12042b += 15;
        String[] strArr2 = m0.f12890b;
        x6.b.w(15, strArr2);
        aVar.b(aVar.f12042b + 15);
        System.arraycopy(strArr2, 0, aVar.f12041a, aVar.f12042b, 15);
        aVar.f12042b += 15;
        aVar.e();
        t.u("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }
}
