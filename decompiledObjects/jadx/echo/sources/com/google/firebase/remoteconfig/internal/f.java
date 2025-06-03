package com.google.firebase.remoteconfig.internal;

import P4.q;
import P4.s;

/* loaded from: classes.dex */
public class f implements q {

    /* renamed from: a, reason: collision with root package name */
    public final long f11954a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11955b;

    /* renamed from: c, reason: collision with root package name */
    public final s f11956c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public long f11957a;

        /* renamed from: b, reason: collision with root package name */
        public int f11958b;

        /* renamed from: c, reason: collision with root package name */
        public s f11959c;

        public b() {
        }

        public f a() {
            return new f(this.f11957a, this.f11958b, this.f11959c);
        }

        public b b(s sVar) {
            this.f11959c = sVar;
            return this;
        }

        public b c(int i7) {
            this.f11958b = i7;
            return this;
        }

        public b d(long j7) {
            this.f11957a = j7;
            return this;
        }
    }

    public f(long j7, int i7, s sVar) {
        this.f11954a = j7;
        this.f11955b = i7;
        this.f11956c = sVar;
    }

    public static b d() {
        return new b();
    }

    @Override // P4.q
    public long a() {
        return this.f11954a;
    }

    @Override // P4.q
    public s b() {
        return this.f11956c;
    }

    @Override // P4.q
    public int c() {
        return this.f11955b;
    }
}
