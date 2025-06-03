package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes.dex */
public final class X extends Exception {

    /* renamed from: o, reason: collision with root package name */
    public final int f11693o;

    public X(String str) {
        super(str);
        this.f11693o = a(str);
    }

    public final int a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase) {
        }
        return 0;
    }
}
