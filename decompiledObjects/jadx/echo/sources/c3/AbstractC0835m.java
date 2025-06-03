package c3;

import java.security.GeneralSecurityException;

/* renamed from: c3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0835m {
    public static C0834l a(String str) {
        C0834l c0834l = (C0834l) AbstractC0846x.i().get(str);
        if (c0834l != null) {
            return c0834l;
        }
        throw new GeneralSecurityException("cannot find key template: " + str);
    }
}
