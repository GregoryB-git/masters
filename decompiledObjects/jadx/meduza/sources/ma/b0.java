package ma;

import java.io.IOException;

/* loaded from: classes.dex */
public class b0 extends IOException {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10916c = 0;

    /* renamed from: a, reason: collision with root package name */
    public s0 f10917a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10918b;

    public static class a extends b0 {
        public a() {
            super("Protocol message tag had invalid wire type.");
        }
    }

    public b0(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public b0(String str) {
        super(str);
    }

    public static b0 a() {
        return new b0("Protocol message end-group tag did not match expected tag.");
    }

    public static b0 b() {
        return new b0("Protocol message contained an invalid tag (zero).");
    }

    public static b0 c() {
        return new b0("Protocol message had invalid UTF-8.");
    }

    public static a d() {
        return new a();
    }

    public static b0 e() {
        return new b0("CodedInputStream encountered a malformed varint.");
    }

    public static b0 f() {
        return new b0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static b0 g() {
        return new b0("Failed to parse the message.");
    }

    public static b0 h() {
        return new b0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
