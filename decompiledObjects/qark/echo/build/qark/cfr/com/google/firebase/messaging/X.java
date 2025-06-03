/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
package com.google.firebase.messaging;

import java.util.Locale;

public final class X
extends Exception {
    public final int o;

    public X(String string2) {
        super(string2);
        this.o = this.a(string2);
    }

    public final int a(String string2) {
        if (string2 == null) {
            return 0;
        }
        string2 = string2.toLowerCase(Locale.US);
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case -95047692: {
                if (!string2.equals((Object)"missing_to")) break;
                n9 = 4;
                break;
            }
            case -617027085: {
                if (!string2.equals((Object)"messagetoobig")) break;
                n9 = 3;
                break;
            }
            case -920906446: {
                if (!string2.equals((Object)"invalid_parameters")) break;
                n9 = 2;
                break;
            }
            case -1290953729: {
                if (!string2.equals((Object)"toomanymessages")) break;
                n9 = 1;
                break;
            }
            case -1743242157: {
                if (!string2.equals((Object)"service_not_available")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return 0;
            }
            case 3: {
                return 2;
            }
            case 2: 
            case 4: {
                return 1;
            }
            case 1: {
                return 4;
            }
            case 0: 
        }
        return 3;
    }
}

