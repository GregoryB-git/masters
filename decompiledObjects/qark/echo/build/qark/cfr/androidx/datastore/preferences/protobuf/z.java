/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.String
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.O;
import java.io.IOException;

public class z
extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public O o = null;

    public z(String string2) {
        super(string2);
    }

    public static z a() {
        return new z("Protocol message end-group tag did not match expected tag.");
    }

    public static z b() {
        return new z("Protocol message contained an invalid tag (zero).");
    }

    public static z c() {
        return new z("Protocol message had invalid UTF-8.");
    }

    public static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static z e() {
        return new z("CodedInputStream encountered a malformed varint.");
    }

    public static z f() {
        return new z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static z g() {
        return new z("Failed to parse the message.");
    }

    public static z h() {
        return new z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static z j() {
        return new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static z k() {
        return new z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public z i(O o8) {
        this.o = o8;
        return this;
    }

    public static class a
    extends z {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String string2) {
            super(string2);
        }
    }

}

