// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import java.util.Locale;

public final class X extends Exception
{
    public final int o;
    
    public X(final String message) {
        super(message);
        this.o = this.a(message);
    }
    
    public final int a(String lowerCase) {
        if (lowerCase == null) {
            return 0;
        }
        lowerCase = lowerCase.toLowerCase(Locale.US);
        lowerCase.hashCode();
        final int hashCode = lowerCase.hashCode();
        int n = -1;
        switch (hashCode) {
            case -95047692: {
                if (!lowerCase.equals("missing_to")) {
                    break;
                }
                n = 4;
                break;
            }
            case -617027085: {
                if (!lowerCase.equals("messagetoobig")) {
                    break;
                }
                n = 3;
                break;
            }
            case -920906446: {
                if (!lowerCase.equals("invalid_parameters")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1290953729: {
                if (!lowerCase.equals("toomanymessages")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1743242157: {
                if (!lowerCase.equals("service_not_available")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
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
            case 0: {
                return 3;
            }
        }
    }
}
