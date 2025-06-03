/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package a2;

import O1.P;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import x1.F;
import x1.L;
import x1.o;

public final class a {
    public static final a a = new a();

    public static final F a(x1.a a8, Uri object, F.b b8) {
        Intrinsics.checkNotNullParameter(object, "imageUri");
        String string2 = object.getPath();
        if (P.a0((Uri)object) && string2 != null) {
            return a.b(a8, new File(string2), b8);
        }
        if (P.X((Uri)object)) {
            object = new F.f((Parcelable)object, "image/png");
            string2 = new Bundle(1);
            string2.putParcelable("file", (Parcelable)object);
            return new F(a8, "me/staging_resources", (Bundle)string2, L.p, b8, null, 32, null);
        }
        throw new o("The image Uri must be either a file:// or content:// Uri");
    }

    public static final F b(x1.a a8, File object, F.b b8) {
        object = new F.f((Parcelable)ParcelFileDescriptor.open((File)object, (int)268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", (Parcelable)object);
        return new F(a8, "me/staging_resources", bundle, L.p, b8, null, 32, null);
    }
}

