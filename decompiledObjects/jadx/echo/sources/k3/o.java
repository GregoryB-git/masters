package k3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import java.security.GeneralSecurityException;
import p3.I;
import p3.y;
import r3.C1919a;

/* loaded from: classes.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final String f16174a;

    /* renamed from: b, reason: collision with root package name */
    public final C1919a f16175b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1093h f16176c;

    /* renamed from: d, reason: collision with root package name */
    public final y.c f16177d;

    /* renamed from: e, reason: collision with root package name */
    public final I f16178e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f16179f;

    public o(String str, AbstractC1093h abstractC1093h, y.c cVar, I i7, Integer num) {
        this.f16174a = str;
        this.f16175b = t.e(str);
        this.f16176c = abstractC1093h;
        this.f16177d = cVar;
        this.f16178e = i7;
        this.f16179f = num;
    }

    public static o b(String str, AbstractC1093h abstractC1093h, y.c cVar, I i7, Integer num) {
        if (i7 == I.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new o(str, abstractC1093h, cVar, i7, num);
    }

    @Override // k3.q
    public C1919a a() {
        return this.f16175b;
    }

    public Integer c() {
        return this.f16179f;
    }

    public y.c d() {
        return this.f16177d;
    }

    public I e() {
        return this.f16178e;
    }

    public String f() {
        return this.f16174a;
    }

    public AbstractC1093h g() {
        return this.f16176c;
    }
}
