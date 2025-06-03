/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.onesignal;

import com.onesignal.UserState;

class UserStateEmail
extends UserState {
    private static final String EMAIL = "email";

    public UserStateEmail(String string2, boolean bl) {
        super(z2.o(EMAIL, string2), bl);
    }

    @Override
    public void addDependFields() {
    }

    @Override
    public boolean isSubscribed() {
        return true;
    }

    @Override
    public UserState newInstance(String string2) {
        return new UserStateEmail(string2, false);
    }
}

