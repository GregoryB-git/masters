package com.google.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class f0 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: o, reason: collision with root package name */
    public final List f12057o;

    public f0(K k7) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f12057o = null;
    }
}
