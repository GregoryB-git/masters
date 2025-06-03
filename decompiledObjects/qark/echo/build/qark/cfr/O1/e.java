/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package O1;

import O1.H;
import O1.P;
import O1.w;
import Y1.d;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import q.c;
import x1.B;

public class e {
    public static final a b = new a(null);
    public Uri a;

    public e(String string2, Bundle object) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Bundle bundle = object;
        if (object == null) {
            bundle = new Bundle();
        }
        object = w.values();
        ArrayList arrayList = new ArrayList(object.length);
        int n8 = object.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.add((Object)object[i8].e());
        }
        if (arrayList.contains((Object)string2)) {
            object = P.a;
            string2 = P.g(H.g(), Intrinsics.i("/dialog/", string2), bundle);
        } else {
            string2 = b.a(string2, bundle);
        }
        this.a = string2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean a(Activity activity, String string2) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            d.a.a();
            c c8 = new c.b(null).a();
            c8.a.setPackage(string2);
            c8.a((Context)activity, this.a);
            return true;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return false;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            return false;
        }
    }

    public final void b(Uri uri) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)uri, "<set-?>");
            this.a = uri;
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public Uri a(String string2, Bundle bundle) {
            Intrinsics.checkNotNullParameter(string2, "action");
            Object object = P.a;
            object = H.b();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(B.w());
            stringBuilder.append("/dialog/");
            stringBuilder.append(string2);
            return P.g((String)object, stringBuilder.toString(), bundle);
        }
    }

}

