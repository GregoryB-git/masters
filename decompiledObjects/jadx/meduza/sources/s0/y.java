package s0;

import java.io.IOException;

/* loaded from: classes.dex */
public class y extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14121a = 0;

    public static class a extends y {
        public a() {
            super("Protocol message tag had invalid wire type.");
        }
    }

    public y(String str) {
        super(str);
    }

    public static y a() {
        return new y("Protocol message had invalid UTF-8.");
    }

    public static a b() {
        return new a();
    }

    public static y c() {
        return new y("CodedInputStream encountered a malformed varint.");
    }

    public static y d() {
        return new y("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static y e() {
        return new y("Failed to parse the message.");
    }

    public static y f() {
        return new y("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
