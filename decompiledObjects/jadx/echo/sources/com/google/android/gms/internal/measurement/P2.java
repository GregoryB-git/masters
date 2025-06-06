package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import t.C1958a;

/* loaded from: classes.dex */
public abstract class P2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1958a f10541a = new C1958a();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (P2.class) {
            C1958a c1958a = f10541a;
            uri = (Uri) c1958a.get(str);
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
                c1958a.put(str, uri);
            }
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
        }
        return str + "#" + context.getPackageName();
    }
}
