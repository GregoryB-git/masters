package N3;

import H3.AbstractC0399v;
import H3.H;
import J3.B;
import K3.h;
import O3.i;
import V2.AbstractC0659j;
import android.content.Context;
import c2.C0819b;
import c2.InterfaceC0822e;
import c2.g;
import d2.C1205a;
import f2.u;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final h f3613c = new h();

    /* renamed from: d, reason: collision with root package name */
    public static final String f3614d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e, reason: collision with root package name */
    public static final String f3615e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f, reason: collision with root package name */
    public static final InterfaceC0822e f3616f = new InterfaceC0822e() { // from class: N3.a
        @Override // c2.InterfaceC0822e
        public final Object apply(Object obj) {
            byte[] d7;
            d7 = b.d((B) obj);
            return d7;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final e f3617a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0822e f3618b;

    public b(e eVar, InterfaceC0822e interfaceC0822e) {
        this.f3617a = eVar;
        this.f3618b = interfaceC0822e;
    }

    public static b b(Context context, i iVar, H h7) {
        u.f(context);
        g g7 = u.c().g(new C1205a(f3614d, f3615e));
        C0819b b7 = C0819b.b("json");
        InterfaceC0822e interfaceC0822e = f3616f;
        return new b(new e(g7.a("FIREBASE_CRASHLYTICS_REPORT", B.class, b7, interfaceC0822e), iVar.b(), h7), interfaceC0822e);
    }

    public static /* synthetic */ byte[] d(B b7) {
        return f3613c.G(b7).getBytes(Charset.forName("UTF-8"));
    }

    public static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            sb.append(str.charAt(i7));
            if (str2.length() > i7) {
                sb.append(str2.charAt(i7));
            }
        }
        return sb.toString();
    }

    public AbstractC0659j c(AbstractC0399v abstractC0399v, boolean z7) {
        return this.f3617a.i(abstractC0399v, z7).a();
    }
}
