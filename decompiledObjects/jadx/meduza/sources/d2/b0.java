package d2;

import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import zc.a;

/* loaded from: classes.dex */
public final class b0 implements WebMessageBoundaryInterface {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f3349b = {"WEB_MESSAGE_ARRAY_BUFFER"};

    /* renamed from: a, reason: collision with root package name */
    public c2.j f3350a;

    public b0(c2.j jVar) {
        this.f3350a = jVar;
    }

    public static c2.j a(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        c2.k[] kVarArr = new c2.k[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            kVarArr[i10] = new f0(ports[i10]);
        }
        if (!i0.f3382u.d()) {
            return new c2.j(webMessageBoundaryInterface.getData(), kVarArr);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) zc.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new c2.j(webMessagePayloadBoundaryInterface.getAsString(), kVarArr);
        }
        if (type != 1) {
            return null;
        }
        return new c2.j(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), kVarArr);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Deprecated
    public final String getData() {
        c2.j jVar = this.f3350a;
        jVar.a(0);
        return jVar.f2222b;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler getMessagePayload() {
        e0 e0Var;
        c2.j jVar = this.f3350a;
        int i10 = jVar.f2224d;
        if (i10 == 0) {
            jVar.a(0);
            e0Var = new e0(jVar.f2222b);
        } else {
            if (i10 != 1) {
                StringBuilder l10 = defpackage.f.l("Unknown web message payload type: ");
                l10.append(this.f3350a.f2224d);
                throw new IllegalStateException(l10.toString());
            }
            jVar.a(1);
            Objects.requireNonNull(jVar.f2223c);
            byte[] bArr = jVar.f2223c;
            Objects.requireNonNull(bArr);
            e0Var = new e0(bArr);
        }
        return new a.C0270a(e0Var);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler[] getPorts() {
        c2.k[] kVarArr = this.f3350a.f2221a;
        if (kVarArr == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[kVarArr.length];
        for (int i10 = 0; i10 < kVarArr.length; i10++) {
            invocationHandlerArr[i10] = kVarArr[i10].c();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f3349b;
    }
}
