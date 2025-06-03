package O1;

import Y1.AbstractC0711d;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import q.c;
import x1.C2146B;

/* renamed from: O1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0442e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f3839b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public Uri f3840a;

    /* renamed from: O1.e$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public Uri a(String action, Bundle bundle) {
            Intrinsics.checkNotNullParameter(action, "action");
            P p7 = P.f3756a;
            return P.g(H.b(), C2146B.w() + "/dialog/" + action, bundle);
        }
    }

    public C0442e(String action, Bundle bundle) {
        Uri a7;
        Intrinsics.checkNotNullParameter(action, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        EnumC0459w[] valuesCustom = EnumC0459w.valuesCustom();
        ArrayList arrayList = new ArrayList(valuesCustom.length);
        for (EnumC0459w enumC0459w : valuesCustom) {
            arrayList.add(enumC0459w.e());
        }
        if (arrayList.contains(action)) {
            P p7 = P.f3756a;
            a7 = P.g(H.g(), Intrinsics.i("/dialog/", action), bundle);
        } else {
            a7 = f3839b.a(action, bundle);
        }
        this.f3840a = a7;
    }

    public final boolean a(Activity activity, String str) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            AbstractC0711d.f7392a.a();
            q.c a7 = new c.b(null).a();
            a7.f18592a.setPackage(str);
            try {
                a7.a(activity, this.f3840a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final void b(Uri uri) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(uri, "<set-?>");
            this.f3840a = uri;
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
