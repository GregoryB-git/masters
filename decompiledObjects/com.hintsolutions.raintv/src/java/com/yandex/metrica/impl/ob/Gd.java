/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.ResponseValidityChecker;

public final class gd
implements ResponseValidityChecker {
    @Override
    public boolean isResponseValid(int n2) {
        boolean bl2 = n2 != 400 && n2 != 500;
        return bl2;
    }
}

