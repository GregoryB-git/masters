package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0859a3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10813a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f10814b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10815c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10816d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10817e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10818f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10819g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10820h;

    /* renamed from: i, reason: collision with root package name */
    public final W2.g f10821i;

    public C0859a3(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final S2 a(String str, double d7) {
        return S2.c(this, str, Double.valueOf(-3.0d), true);
    }

    public final S2 b(String str, long j7) {
        return S2.d(this, str, Long.valueOf(j7), true);
    }

    public final S2 c(String str, String str2) {
        return S2.e(this, str, str2, true);
    }

    public final S2 d(String str, boolean z7) {
        return S2.b(this, str, Boolean.valueOf(z7), true);
    }

    public final C0859a3 e() {
        return new C0859a3(this.f10813a, this.f10814b, this.f10815c, this.f10816d, this.f10817e, this.f10818f, true, this.f10820h, this.f10821i);
    }

    public final C0859a3 f() {
        if (!this.f10815c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        W2.g gVar = this.f10821i;
        if (gVar == null) {
            return new C0859a3(this.f10813a, this.f10814b, this.f10815c, this.f10816d, true, this.f10818f, this.f10819g, this.f10820h, gVar);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }

    public C0859a3(String str, Uri uri, String str2, String str3, boolean z7, boolean z8, boolean z9, boolean z10, W2.g gVar) {
        this.f10813a = str;
        this.f10814b = uri;
        this.f10815c = str2;
        this.f10816d = str3;
        this.f10817e = z7;
        this.f10818f = z8;
        this.f10819g = z9;
        this.f10820h = z10;
        this.f10821i = gVar;
    }
}
