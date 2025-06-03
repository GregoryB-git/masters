package a2;

import O1.P;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import x1.C2148a;
import x1.C2162o;
import x1.F;
import x1.L;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0743a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0743a f8070a = new C0743a();

    public static final F a(C2148a c2148a, Uri imageUri, F.b bVar) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        String path = imageUri.getPath();
        if (P.a0(imageUri) && path != null) {
            return b(c2148a, new File(path), bVar);
        }
        if (!P.X(imageUri)) {
            throw new C2162o("The image Uri must be either a file:// or content:// Uri");
        }
        F.f fVar = new F.f(imageUri, "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", fVar);
        return new F(c2148a, "me/staging_resources", bundle, L.POST, bVar, null, 32, null);
    }

    public static final F b(C2148a c2148a, File file, F.b bVar) {
        F.f fVar = new F.f(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", fVar);
        return new F(c2148a, "me/staging_resources", bundle, L.POST, bVar, null, 32, null);
    }
}
