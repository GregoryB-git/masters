package w;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import w.h;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f20289a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f20290b = new Object();

    public static Bundle a(h.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d7 = aVar.d();
        bundle.putInt("icon", d7 != null ? d7.g() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    public static Bundle b(l lVar) {
        new Bundle();
        throw null;
    }

    public static Bundle[] c(l[] lVarArr) {
        if (lVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[lVarArr.length];
        for (int i7 = 0; i7 < lVarArr.length; i7++) {
            l lVar = lVarArr[i7];
            bundleArr[i7] = b(null);
        }
        return bundleArr;
    }
}
