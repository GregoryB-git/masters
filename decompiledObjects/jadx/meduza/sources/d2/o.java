package d2;

import android.content.Context;
import android.util.TypedValue;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public Context f3402a;

    public o(Context context) {
        this.f3402a = context;
    }

    public static String a(File file) {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) ? defpackage.g.d(canonicalPath, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) : canonicalPath;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005d, code lost:
    
        if (r5.equals("mhtml") == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.o.b(java.lang.String):java.lang.String");
    }

    public final InputStream c(String str) {
        if (str.length() > 1 && str.charAt(0) == '/') {
            str = str.substring(1);
        }
        String[] split = str.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, -1);
        if (split.length != 2) {
            throw new IllegalArgumentException(defpackage.g.d("Incorrect resource path: ", str));
        }
        String str2 = split[0];
        String str3 = split[1];
        int lastIndexOf = str3.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str3 = str3.substring(0, lastIndexOf);
        }
        int identifier = this.f3402a.getResources().getIdentifier(str3, str2, this.f3402a.getPackageName());
        TypedValue typedValue = new TypedValue();
        this.f3402a.getResources().getValue(identifier, typedValue, true);
        int i10 = typedValue.type;
        if (i10 != 3) {
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", str, Integer.valueOf(i10)));
        }
        InputStream openRawResource = this.f3402a.getResources().openRawResource(identifier);
        return str.endsWith(".svgz") ? new GZIPInputStream(openRawResource) : openRawResource;
    }
}
