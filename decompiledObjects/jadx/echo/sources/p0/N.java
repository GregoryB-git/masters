package p0;

import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import d0.AbstractC1184g;
import d0.C1190m;
import g0.AbstractC1297a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import l0.y1;
import p0.F;

/* loaded from: classes.dex */
public final class N implements F {

    /* renamed from: d, reason: collision with root package name */
    public static final F.c f18228d = new F.c() { // from class: p0.H
        @Override // p0.F.c
        public final F a(UUID uuid) {
            F B7;
            B7 = N.B(uuid);
            return B7;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final UUID f18229a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f18230b;

    /* renamed from: c, reason: collision with root package name */
    public int f18231c;

    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, y1 y1Var) {
            LogSessionId logSessionId;
            boolean equals;
            MediaDrm.PlaybackComponent playbackComponent;
            LogSessionId a7 = y1Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a7.equals(logSessionId);
            if (equals) {
                return;
            }
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            K.a(AbstractC1297a.e(playbackComponent)).setLogSessionId(a7);
        }
    }

    public N(UUID uuid) {
        AbstractC1297a.e(uuid);
        AbstractC1297a.b(!AbstractC1184g.f12616b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f18229a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f18230b = mediaDrm;
        this.f18231c = 1;
        if (AbstractC1184g.f12618d.equals(uuid) && C()) {
            w(mediaDrm);
        }
    }

    public static /* synthetic */ F B(UUID uuid) {
        try {
            return D(uuid);
        } catch (T unused) {
            g0.o.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C();
        }
    }

    public static boolean C() {
        return "ASUS_Z00AD".equals(g0.M.f14264d);
    }

    public static N D(UUID uuid) {
        try {
            return new N(uuid);
        } catch (UnsupportedSchemeException e7) {
            throw new T(1, e7);
        } catch (Exception e8) {
            throw new T(2, e8);
        }
    }

    public static byte[] p(byte[] bArr) {
        g0.z zVar = new g0.z(bArr);
        int t7 = zVar.t();
        short v7 = zVar.v();
        short v8 = zVar.v();
        if (v7 != 1 || v8 != 1) {
            g0.o.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short v9 = zVar.v();
        Charset charset = W2.e.f6823e;
        String E6 = zVar.E(v9, charset);
        if (E6.contains("<LA_URL>")) {
            return bArr;
        }
        int indexOf = E6.indexOf("</DATA>");
        if (indexOf == -1) {
            g0.o.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = E6.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + E6.substring(indexOf);
        int i7 = t7 + 52;
        ByteBuffer allocate = ByteBuffer.allocate(i7);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i7);
        allocate.putShort(v7);
        allocate.putShort(v8);
        allocate.putShort((short) (str.length() * 2));
        allocate.put(str.getBytes(charset));
        return allocate.array();
    }

    public static byte[] r(UUID uuid, byte[] bArr) {
        return AbstractC1184g.f12617c.equals(uuid) ? AbstractC1769a.a(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if ("AFTT".equals(r0) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = d0.AbstractC1184g.f12619e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = Z0.o.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = p(r4)
            byte[] r4 = Z0.o.a(r0, r4)
        L18:
            int r1 = g0.M.f14261a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = d0.AbstractC1184g.f12618d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = g0.M.f14263c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            java.lang.String r0 = g0.M.f14264d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = Z0.o.e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.N.s(java.util.UUID, byte[]):byte[]");
    }

    public static String t(UUID uuid, String str) {
        return (g0.M.f14261a < 26 && AbstractC1184g.f12617c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    public static UUID u(UUID uuid) {
        return (g0.M.f14261a >= 27 || !AbstractC1184g.f12617c.equals(uuid)) ? uuid : AbstractC1184g.f12616b;
    }

    public static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static C1190m.b y(UUID uuid, List list) {
        if (AbstractC1184g.f12618d.equals(uuid)) {
            if (g0.M.f14261a >= 28 && list.size() > 1) {
                C1190m.b bVar = (C1190m.b) list.get(0);
                int i7 = 0;
                for (int i8 = 0; i8 < list.size(); i8++) {
                    C1190m.b bVar2 = (C1190m.b) list.get(i8);
                    byte[] bArr = (byte[]) AbstractC1297a.e(bVar2.f12663s);
                    if (g0.M.c(bVar2.f12662r, bVar.f12662r) && g0.M.c(bVar2.f12661q, bVar.f12661q) && Z0.o.c(bArr)) {
                        i7 += bArr.length;
                    }
                }
                byte[] bArr2 = new byte[i7];
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    byte[] bArr3 = (byte[]) AbstractC1297a.e(((C1190m.b) list.get(i10)).f12663s);
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i9, length);
                    i9 += length;
                }
                return bVar.b(bArr2);
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                C1190m.b bVar3 = (C1190m.b) list.get(i11);
                int g7 = Z0.o.g((byte[]) AbstractC1297a.e(bVar3.f12663s));
                int i12 = g0.M.f14261a;
                if (i12 < 23 && g7 == 0) {
                    return bVar3;
                }
                if (i12 >= 23 && g7 == 1) {
                    return bVar3;
                }
            }
        }
        return (C1190m.b) list.get(0);
    }

    public final /* synthetic */ void A(F.b bVar, MediaDrm mediaDrm, byte[] bArr, int i7, int i8, byte[] bArr2) {
        bVar.a(this, bArr, i7, i8, bArr2);
    }

    public final boolean E() {
        return g0.M.f14261a < 21 && AbstractC1184g.f12618d.equals(this.f18229a) && "L3".equals(x("securityLevel"));
    }

    @Override // p0.F
    public void a(final F.b bVar) {
        this.f18230b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: p0.I
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i7, int i8, byte[] bArr2) {
                N.this.A(bVar, mediaDrm, bArr, i7, i8, bArr2);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r4 != false) goto L22;
     */
    @Override // p0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(byte[] r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = g0.M.f14261a
            r1 = 31
            if (r0 < r1) goto L13
            boolean r0 = r3.z()
            if (r0 == 0) goto L13
            android.media.MediaDrm r4 = r3.f18230b
            boolean r4 = p0.N.a.a(r4, r5)
            goto L22
        L13:
            r0 = 0
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch: java.lang.Throwable -> L2a android.media.MediaCryptoException -> L31
            java.util.UUID r2 = r3.f18229a     // Catch: java.lang.Throwable -> L2a android.media.MediaCryptoException -> L31
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L2a android.media.MediaCryptoException -> L31
            boolean r4 = r1.requiresSecureDecoderComponent(r5)     // Catch: java.lang.Throwable -> L25 android.media.MediaCryptoException -> L28
            r1.release()
        L22:
            if (r4 == 0) goto L3e
            goto L36
        L25:
            r4 = move-exception
            r0 = r1
            goto L2b
        L28:
            r0 = r1
            goto L31
        L2a:
            r4 = move-exception
        L2b:
            if (r0 == 0) goto L30
            r0.release()
        L30:
            throw r4
        L31:
            if (r0 == 0) goto L36
            r0.release()
        L36:
            boolean r4 = r3.E()
            if (r4 != 0) goto L3e
            r4 = 1
            goto L3f
        L3e:
            r4 = 0
        L3f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.N.b(byte[], java.lang.String):boolean");
    }

    @Override // p0.F
    public void c(byte[] bArr, byte[] bArr2) {
        this.f18230b.restoreKeys(bArr, bArr2);
    }

    @Override // p0.F
    public Map d(byte[] bArr) {
        return this.f18230b.queryKeyStatus(bArr);
    }

    @Override // p0.F
    public void e(byte[] bArr) {
        this.f18230b.closeSession(bArr);
    }

    @Override // p0.F
    public void f(byte[] bArr, y1 y1Var) {
        if (g0.M.f14261a >= 31) {
            try {
                a.b(this.f18230b, bArr, y1Var);
            } catch (UnsupportedOperationException unused) {
                g0.o.h("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // p0.F
    public byte[] g(byte[] bArr, byte[] bArr2) {
        if (AbstractC1184g.f12617c.equals(this.f18229a)) {
            bArr2 = AbstractC1769a.b(bArr2);
        }
        return this.f18230b.provideKeyResponse(bArr, bArr2);
    }

    @Override // p0.F
    public F.d h() {
        MediaDrm.ProvisionRequest provisionRequest = this.f18230b.getProvisionRequest();
        return new F.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // p0.F
    public void i(byte[] bArr) {
        this.f18230b.provideProvisionResponse(bArr);
    }

    @Override // p0.F
    public F.a j(byte[] bArr, List list, int i7, HashMap hashMap) {
        C1190m.b bVar;
        byte[] bArr2;
        String str;
        if (list != null) {
            bVar = y(this.f18229a, list);
            bArr2 = s(this.f18229a, (byte[]) AbstractC1297a.e(bVar.f12663s));
            str = t(this.f18229a, bVar.f12662r);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f18230b.getKeyRequest(bArr, bArr2, str, i7, hashMap);
        byte[] r7 = r(this.f18229a, keyRequest.getData());
        String q7 = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(q7) && bVar != null && !TextUtils.isEmpty(bVar.f12661q)) {
            q7 = bVar.f12661q;
        }
        return new F.a(r7, q7, g0.M.f14261a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // p0.F
    public int k() {
        return 2;
    }

    @Override // p0.F
    public byte[] m() {
        return this.f18230b.openSession();
    }

    public final String q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (g0.M.f14261a >= 33 && "https://default.url".equals(str)) {
            String x7 = x("version");
            if (Objects.equals(x7, "1.2") || Objects.equals(x7, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    @Override // p0.F
    public synchronized void release() {
        int i7 = this.f18231c - 1;
        this.f18231c = i7;
        if (i7 == 0) {
            this.f18230b.release();
        }
    }

    @Override // p0.F
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public G l(byte[] bArr) {
        return new G(u(this.f18229a), bArr, E());
    }

    public String x(String str) {
        return this.f18230b.getPropertyString(str);
    }

    public final boolean z() {
        if (!this.f18229a.equals(AbstractC1184g.f12618d)) {
            return this.f18229a.equals(AbstractC1184g.f12617c);
        }
        String x7 = x("version");
        return (x7.startsWith("v5.") || x7.startsWith("14.") || x7.startsWith("15.") || x7.startsWith("16.0")) ? false : true;
    }
}
