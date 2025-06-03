/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.measurement.P2;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.q7;

public final class t7
implements q7 {
    public static final S2 a = new a3(P2.a("com.google.android.gms.measurement")).f().e().d("measurement.sessionid.enable_client_session_id", true);

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return (Boolean)a.f();
    }
}

