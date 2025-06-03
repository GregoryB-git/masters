package m6;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import k6.a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final SparseIntArray f10326a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    public j6.f f10327b;

    public u(j6.f fVar) {
        j.i(fVar);
        this.f10327b = fVar;
    }

    @ResultIgnorabilityUnspecified
    public final int a(Context context, a.f fVar) {
        j.i(context);
        j.i(fVar);
        int i10 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int i11 = this.f10326a.get(minApkVersion, -1);
        if (i11 == -1) {
            int i12 = 0;
            while (true) {
                if (i12 >= this.f10326a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f10326a.keyAt(i12);
                if (keyAt > minApkVersion && this.f10326a.get(keyAt) == 0) {
                    break;
                }
                i12++;
            }
            i11 = i10 == -1 ? this.f10327b.c(context, minApkVersion) : i10;
            this.f10326a.put(minApkVersion, i11);
        }
        return i11;
    }
}
