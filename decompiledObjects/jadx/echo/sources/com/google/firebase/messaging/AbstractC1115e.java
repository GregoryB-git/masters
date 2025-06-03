package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import t.C1958a;

/* renamed from: com.google.firebase.messaging.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1115e {

    /* renamed from: a, reason: collision with root package name */
    public static final long f11747a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.e$a */
    public static final class a {
        public static C1958a a(Bundle bundle) {
            C1958a c1958a = new C1958a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c1958a.put(str, str2);
                    }
                }
            }
            return c1958a;
        }
    }
}
