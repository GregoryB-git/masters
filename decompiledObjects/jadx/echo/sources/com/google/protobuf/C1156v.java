package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1156v extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: o, reason: collision with root package name */
    public K f12256o;

    /* renamed from: com.google.protobuf.v$a */
    public static class a extends C1156v {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String str) {
            super(str);
        }
    }

    public C1156v(String str) {
        super(str);
        this.f12256o = null;
    }

    public static a a() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static C1156v b() {
        return new C1156v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C1156v c() {
        return new C1156v("Failed to parse the message.");
    }

    public static C1156v d() {
        return new C1156v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
