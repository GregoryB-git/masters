package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class j0 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: o, reason: collision with root package name */
    public final List f11377o;

    public j0(O o7) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f11377o = null;
    }

    public A a() {
        return new A(getMessage());
    }
}
