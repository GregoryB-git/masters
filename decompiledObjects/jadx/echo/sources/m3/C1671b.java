package m3;

import h3.AbstractC1336b;
import java.security.GeneralSecurityException;
import l3.C1604a;
import l3.g;

/* renamed from: m3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1671b implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1336b.EnumC0213b f17741b = AbstractC1336b.EnumC0213b.f14584o;

    /* renamed from: a, reason: collision with root package name */
    public final C1604a f17742a;

    public C1671b(C1604a c1604a) {
        if (!f17741b.c()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f17742a = c1604a;
    }
}
