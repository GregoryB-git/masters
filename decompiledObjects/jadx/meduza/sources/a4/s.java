package a4;

import a4.b;
import a4.o;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrm$PlaybackComponent;
import android.media.metrics.LogSessionId;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v5.e0;
import w3.a0;

/* loaded from: classes.dex */
public final class s implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final defpackage.g f198d = new defpackage.g();

    /* renamed from: a, reason: collision with root package name */
    public final UUID f199a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f200b;

    /* renamed from: c, reason: collision with root package name */
    public int f201c;

    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, a0 a0Var) {
            a0.a aVar = a0Var.f16196a;
            aVar.getClass();
            LogSessionId logSessionId = aVar.f16198a;
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            MediaDrm$PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            playbackComponent.setLogSessionId(logSessionId);
        }
    }

    public s(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = v3.h.f15395b;
        x6.b.o("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f199a = uuid;
        MediaDrm mediaDrm = new MediaDrm((e0.f15881a >= 27 || !v3.h.f15396c.equals(uuid)) ? uuid : uuid2);
        this.f200b = mediaDrm;
        this.f201c = 1;
        if (v3.h.f15397d.equals(uuid) && "ASUS_Z00AD".equals(e0.f15884d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // a4.o
    public final Map<String, String> a(byte[] bArr) {
        return this.f200b.queryKeyStatus(bArr);
    }

    @Override // a4.o
    public final o.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f200b.getProvisionRequest();
        return new o.d(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // a4.o
    public final z3.b c(byte[] bArr) {
        int i10 = e0.f15881a;
        boolean z10 = i10 < 21 && v3.h.f15397d.equals(this.f199a) && "L3".equals(this.f200b.getPropertyString("securityLevel"));
        UUID uuid = this.f199a;
        if (i10 < 27 && v3.h.f15396c.equals(uuid)) {
            uuid = v3.h.f15395b;
        }
        return new p(uuid, bArr, z10);
    }

    @Override // a4.o
    public final byte[] d() {
        return this.f200b.openSession();
    }

    @Override // a4.o
    public final void e(byte[] bArr, byte[] bArr2) {
        this.f200b.restoreKeys(bArr, bArr2);
    }

    @Override // a4.o
    public final void f(byte[] bArr) {
        this.f200b.closeSession(bArr);
    }

    @Override // a4.o
    public final void g(final b.a aVar) {
        this.f200b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: a4.q
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                s sVar = s.this;
                o.b bVar = aVar;
                sVar.getClass();
                b.HandlerC0004b handlerC0004b = b.this.f154y;
                handlerC0004b.getClass();
                handlerC0004b.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override // a4.o
    public final byte[] h(byte[] bArr, byte[] bArr2) {
        if (v3.h.f15396c.equals(this.f199a) && e0.f15881a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(e0.n(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = e0.B(sb2.toString());
            } catch (JSONException e10) {
                StringBuilder l10 = defpackage.f.l("Failed to adjust response data: ");
                l10.append(e0.n(bArr2));
                v5.m.d("ClearKeyUtil", l10.toString(), e10);
            }
        }
        return this.f200b.provideKeyResponse(bArr, bArr2);
    }

    @Override // a4.o
    public final void i(byte[] bArr) {
        this.f200b.provideProvisionResponse(bArr);
    }

    @Override // a4.o
    public final void j(byte[] bArr, a0 a0Var) {
        if (e0.f15881a >= 31) {
            try {
                a.b(this.f200b, bArr, a0Var);
            } catch (UnsupportedOperationException unused) {
                v5.m.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a5, code lost:
    
        if (r4 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019f, code lost:
    
        if ("AFTT".equals(r4) == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0189  */
    @Override // a4.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a4.o.a k(byte[] r17, java.util.List<a4.d.b> r18, int r19, java.util.HashMap<java.lang.String, java.lang.String> r20) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.s.k(byte[], java.util.List, int, java.util.HashMap):a4.o$a");
    }

    @Override // a4.o
    public final int l() {
        return 2;
    }

    @Override // a4.o
    public final boolean m(String str, byte[] bArr) {
        if (e0.f15881a >= 31) {
            return a.a(this.f200b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f199a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // a4.o
    public final synchronized void release() {
        int i10 = this.f201c - 1;
        this.f201c = i10;
        if (i10 == 0) {
            this.f200b.release();
        }
    }
}
