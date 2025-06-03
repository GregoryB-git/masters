/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firebase.messaging;

import V2.j;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.W;
import com.google.firebase.messaging.b0;

public final class w
implements W.a {
    public final /* synthetic */ FirebaseMessaging a;
    public final /* synthetic */ String b;
    public final /* synthetic */ b0.a c;

    public /* synthetic */ w(FirebaseMessaging firebaseMessaging, String string2, b0.a a8) {
        this.a = firebaseMessaging;
        this.b = string2;
        this.c = a8;
    }

    @Override
    public final j start() {
        return FirebaseMessaging.g(this.a, this.b, this.c);
    }
}

