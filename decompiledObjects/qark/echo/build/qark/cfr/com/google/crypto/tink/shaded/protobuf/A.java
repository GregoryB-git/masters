/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.O;
import java.io.IOException;

public class A
extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public O o = null;
    public boolean p;

    public A(IOException iOException) {
        super(iOException.getMessage(), (Throwable)iOException);
    }

    public A(String string2) {
        super(string2);
    }

    public static A b() {
        return new A("Protocol message end-group tag did not match expected tag.");
    }

    public static A c() {
        return new A("Protocol message contained an invalid tag (zero).");
    }

    public static A d() {
        return new A("Protocol message had invalid UTF-8.");
    }

    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static A f() {
        return new A("CodedInputStream encountered a malformed varint.");
    }

    public static A g() {
        return new A("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static A h() {
        return new A("Failed to parse the message.");
    }

    public static A i() {
        return new A("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static A l() {
        return new A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static A m() {
        return new A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean a() {
        return this.p;
    }

    public void j() {
        this.p = true;
    }

    public A k(O o8) {
        this.o = o8;
        return this;
    }

    public static class a
    extends A {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String string2) {
            super(string2);
        }
    }

}

