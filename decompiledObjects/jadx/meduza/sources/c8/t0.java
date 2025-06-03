package c8;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class t0 implements b8.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2518a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2519b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2520c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2521d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2522e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public FirebaseAuth f2523g;

    public t0(String str, String str2, int i10, int i11, long j10, String str3, FirebaseAuth firebaseAuth) {
        m6.j.f("sessionInfo cannot be empty.", str3);
        if (firebaseAuth == null) {
            throw new NullPointerException("firebaseAuth cannot be null.");
        }
        m6.j.f("sharedSecretKey cannot be empty. This is required to generate QR code URL.", str);
        this.f2518a = str;
        m6.j.f("hashAlgorithm cannot be empty.", str2);
        this.f2519b = str2;
        this.f2520c = i10;
        this.f2521d = i11;
        this.f2522e = j10;
        this.f = str3;
        this.f2523g = firebaseAuth;
    }

    @Override // b8.m0
    public final String a() {
        return this.f2519b;
    }

    @Override // b8.m0
    public final int b() {
        return this.f2520c;
    }

    @Override // b8.m0
    public final String c(String str, String str2) {
        m6.j.f("accountName cannot be empty.", str);
        m6.j.f("issuer cannot be empty.", str2);
        return String.format(null, "otpauth://totp/%s:%s?secret=%s&issuer=%s&algorithm=%s&digits=%d", str2, str, this.f2518a, str2, this.f2519b, Integer.valueOf(this.f2520c));
    }

    @Override // b8.m0
    public final String d() {
        b8.r rVar = this.f2523g.f;
        m6.j.j(rVar, "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.");
        String A = rVar.A();
        m6.j.f("Email cannot be empty, since verified email is required to use MFA.", A);
        u7.f fVar = this.f2523g.f3057a;
        fVar.a();
        return c(A, fVar.f15085b);
    }

    @Override // b8.m0
    public final long e() {
        return this.f2522e;
    }

    @Override // b8.m0
    public final int f() {
        return this.f2521d;
    }

    @Override // b8.m0
    public final void g(String str) {
        m6.j.f("qrCodeUrl cannot be empty.", str);
        try {
            i(str);
        } catch (ActivityNotFoundException unused) {
            i("https://play.google.com/store/search?q=otpauth&c=apps");
        }
    }

    @Override // b8.m0
    public final String h() {
        return this.f2518a;
    }

    public final void i(String str) {
        u7.f fVar = this.f2523g.f3057a;
        fVar.a();
        fVar.f15084a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }

    @Override // b8.m0
    public final String j() {
        return this.f;
    }
}
