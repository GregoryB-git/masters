/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.squareup.otto.ThreadEnforcer$1
 *  com.squareup.otto.ThreadEnforcer$2
 *  java.lang.Object
 */
package com.squareup.otto;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

public interface ThreadEnforcer {
    public static final ThreadEnforcer ANY = new 1();
    public static final ThreadEnforcer MAIN = new 2();

    public void enforce(Bus var1);
}

