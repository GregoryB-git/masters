// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a2;

import android.os.ParcelFileDescriptor;
import x1.o;
import kotlin.jvm.internal.g;
import x1.L;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.File;
import O1.P;
import kotlin.jvm.internal.Intrinsics;
import x1.F;
import android.net.Uri;

public final class a
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    public static final F a(final x1.a a, final Uri uri, final F.b b) {
        Intrinsics.checkNotNullParameter(uri, "imageUri");
        final String path = uri.getPath();
        if (P.a0(uri) && path != null) {
            return b(a, new File(path), b);
        }
        if (P.X(uri)) {
            final F.f f = new F.f((Parcelable)uri, "image/png");
            final Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", (Parcelable)f);
            return new F(a, "me/staging_resources", bundle, L.p, b, null, 32, null);
        }
        throw new o("The image Uri must be either a file:// or content:// Uri");
    }
    
    public static final F b(final x1.a a, final File file, final F.b b) {
        final F.f f = new F.f((Parcelable)ParcelFileDescriptor.open(file, 268435456), "image/png");
        final Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", (Parcelable)f);
        return new F(a, "me/staging_resources", bundle, L.p, b, null, 32, null);
    }
}
