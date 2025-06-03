package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0778z extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: o, reason: collision with root package name */
    public O f9203o;

    /* renamed from: androidx.datastore.preferences.protobuf.z$a */
    public static class a extends C0778z {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String str) {
            super(str);
        }
    }

    public C0778z(String str) {
        super(str);
        this.f9203o = null;
    }

    public static C0778z a() {
        return new C0778z("Protocol message end-group tag did not match expected tag.");
    }

    public static C0778z b() {
        return new C0778z("Protocol message contained an invalid tag (zero).");
    }

    public static C0778z c() {
        return new C0778z("Protocol message had invalid UTF-8.");
    }

    public static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static C0778z e() {
        return new C0778z("CodedInputStream encountered a malformed varint.");
    }

    public static C0778z f() {
        return new C0778z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0778z g() {
        return new C0778z("Failed to parse the message.");
    }

    public static C0778z h() {
        return new C0778z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static C0778z j() {
        return new C0778z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static C0778z k() {
        return new C0778z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public C0778z i(O o7) {
        this.f9203o = o7;
        return this;
    }
}
