package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.k4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0950k4 extends IOException {

    /* renamed from: o, reason: collision with root package name */
    public I4 f11011o;

    public C0950k4(String str) {
        super(str);
        this.f11011o = null;
    }

    public static C0941j4 a() {
        return new C0941j4("Protocol message tag had invalid wire type.");
    }

    public static C0950k4 b() {
        return new C0950k4("Protocol message contained an invalid tag (zero).");
    }

    public static C0950k4 c() {
        return new C0950k4("Protocol message had invalid UTF-8.");
    }

    public static C0950k4 d() {
        return new C0950k4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0950k4 e() {
        return new C0950k4("Failed to parse the message.");
    }

    public static C0950k4 f() {
        return new C0950k4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
