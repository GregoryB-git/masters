package m3;

import h3.AbstractC1336b;
import java.security.GeneralSecurityException;
import l3.g;
import l3.i;

/* renamed from: m3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1672c implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1336b.EnumC0213b f17743b = AbstractC1336b.EnumC0213b.f14585p;

    /* renamed from: a, reason: collision with root package name */
    public final i f17744a;

    public C1672c(i iVar) {
        if (!f17743b.c()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f17744a = iVar;
    }
}
