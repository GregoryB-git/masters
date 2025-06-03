package h4;

import defpackage.g;
import h4.b;
import o7.l0;
import o7.t;
import org.xmlpull.v1.XmlPullParser;
import p2.m0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f7091a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f7092b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f7093c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (java.lang.Integer.parseInt(r10) == 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r7 == (-1)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h4.b a(java.lang.String r19) {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r19
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = p2.m0.V(r0, r1)
            r3 = 0
            if (r2 == 0) goto Ld2
            o7.t$b r2 = o7.t.f12050b
            o7.l0 r2 = o7.l0.f12009e
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = p2.m0.V(r0, r8)
            if (r8 == 0) goto La2
            java.lang.String[] r2 = h4.e.f7091a
            r6 = 0
            r7 = r6
        L37:
            r8 = 4
            r9 = 1
            if (r7 >= r8) goto L4d
            r10 = r2[r7]
            java.lang.String r10 = p2.m0.G(r0, r10)
            if (r10 == 0) goto L4a
            int r2 = java.lang.Integer.parseInt(r10)
            if (r2 != r9) goto L4d
            goto L4e
        L4a:
            int r7 = r7 + 1
            goto L37
        L4d:
            r9 = r6
        L4e:
            if (r9 != 0) goto L51
            return r3
        L51:
            java.lang.String[] r2 = h4.e.f7092b
            r7 = r6
        L54:
            if (r7 >= r8) goto L6c
            r9 = r2[r7]
            java.lang.String r9 = p2.m0.G(r0, r9)
            if (r9 == 0) goto L69
            long r7 = java.lang.Long.parseLong(r9)
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L6d
            goto L6c
        L69:
            int r7 = r7 + 1
            goto L54
        L6c:
            r7 = r4
        L6d:
            java.lang.String[] r2 = h4.e.f7093c
        L6f:
            r9 = 2
            if (r6 >= r9) goto L9c
            r9 = r2[r6]
            java.lang.String r9 = p2.m0.G(r0, r9)
            if (r9 == 0) goto L99
            long r11 = java.lang.Long.parseLong(r9)
            h4.b$a r2 = new h4.b$a
            r14 = 0
            r16 = 0
            java.lang.String r18 = "image/jpeg"
            r13 = r2
            r13.<init>(r14, r16, r18)
            h4.b$a r6 = new h4.b$a
            r13 = 0
            java.lang.String r15 = "video/mp4"
            r10 = r6
            r10.<init>(r11, r13, r15)
            o7.l0 r2 = o7.t.u(r2, r6)
            goto La0
        L99:
            int r6 = r6 + 1
            goto L6f
        L9c:
            o7.t$b r2 = o7.t.f12050b
            o7.l0 r2 = o7.l0.f12009e
        La0:
            r6 = r7
            goto Lbf
        La2:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = p2.m0.V(r0, r8)
            if (r8 == 0) goto Laf
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            goto Lbb
        Laf:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = p2.m0.V(r0, r8)
            if (r8 == 0) goto Lbf
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
        Lbb:
            o7.l0 r2 = b(r0, r2, r8)
        Lbf:
            boolean r8 = p2.m0.T(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lcc
            return r3
        Lcc:
            h4.b r0 = new h4.b
            r0.<init>(r6, r2)
            return r0
        Ld2:
            java.lang.String r0 = "Couldn't find xmp metadata"
            v3.a1 r0 = v3.a1.a(r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.a(java.lang.String):h4.b");
    }

    public static l0 b(XmlPullParser xmlPullParser, String str, String str2) {
        t.b bVar = t.f12050b;
        t.a aVar = new t.a();
        String d10 = g.d(str, ":Item");
        String d11 = g.d(str, ":Directory");
        do {
            xmlPullParser.next();
            if (m0.V(xmlPullParser, d10)) {
                String d12 = g.d(str2, ":Mime");
                String d13 = g.d(str2, ":Semantic");
                String d14 = g.d(str2, ":Length");
                String d15 = g.d(str2, ":Padding");
                String G = m0.G(xmlPullParser, d12);
                String G2 = m0.G(xmlPullParser, d13);
                String G3 = m0.G(xmlPullParser, d14);
                String G4 = m0.G(xmlPullParser, d15);
                if (G == null || G2 == null) {
                    return l0.f12009e;
                }
                aVar.c(new b.a(G3 != null ? Long.parseLong(G3) : 0L, G4 != null ? Long.parseLong(G4) : 0L, G));
            }
        } while (!m0.T(xmlPullParser, d11));
        return aVar.e();
    }
}
