package f9;

import g9.e0;
import g9.f0;
import j9.l;
import j9.m;
import j9.n;
import j9.o;
import j9.q;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import ka.d0;
import org.json.JSONArray;
import org.json.JSONObject;
import p2.m0;

/* loaded from: classes.dex */
public final class f {
    public static final Charset f = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final g f5495a;

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f5496b;

    /* renamed from: c, reason: collision with root package name */
    public e f5497c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f5498d;

    /* renamed from: e, reason: collision with root package name */
    public long f5499e;

    public f(g gVar, InputStream inputStream) {
        this.f5495a = gVar;
        this.f5496b = inputStream;
        new InputStreamReader(inputStream);
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        this.f5498d = allocate;
        allocate.flip();
    }

    public final void a(String str) {
        this.f5496b.close();
        throw new IllegalArgumentException(defpackage.g.d("Invalid bundle: ", str));
    }

    public final e b() {
        e eVar = this.f5497c;
        if (eVar != null) {
            return eVar;
        }
        c d10 = d();
        if (!(d10 instanceof e)) {
            a("Expected first element in bundle to be a metadata object");
            throw null;
        }
        e eVar2 = (e) d10;
        this.f5497c = eVar2;
        this.f5499e = 0L;
        return eVar2;
    }

    public final boolean c() {
        this.f5498d.compact();
        int read = this.f5496b.read(this.f5498d.array(), this.f5498d.position() + this.f5498d.arrayOffset(), this.f5498d.remaining());
        boolean z10 = read > 0;
        if (z10) {
            ByteBuffer byteBuffer = this.f5498d;
            byteBuffer.position(byteBuffer.position() + read);
        }
        this.f5498d.flip();
        return z10;
    }

    public final c d() {
        int i10;
        int i11;
        String charBuffer;
        c cVar;
        String str;
        boolean z10;
        g9.e eVar;
        int i12;
        do {
            this.f5498d.mark();
            i10 = 0;
            i11 = 0;
            while (true) {
                try {
                    if (i11 >= this.f5498d.remaining()) {
                        i11 = -1;
                        break;
                    }
                    if (this.f5498d.get() == 123) {
                        break;
                    }
                    i11++;
                } finally {
                    this.f5498d.reset();
                }
            }
            if (i11 != -1) {
                break;
            }
        } while (c());
        if (this.f5498d.remaining() == 0) {
            charBuffer = null;
        } else {
            if (i11 == -1) {
                a("Reached the end of bundle when a length string is expected.");
                throw null;
            }
            byte[] bArr = new byte[i11];
            this.f5498d.get(bArr);
            charBuffer = f.decode(ByteBuffer.wrap(bArr)).toString();
        }
        if (charBuffer == null) {
            return null;
        }
        int parseInt = Integer.parseInt(charBuffer);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i13 = parseInt;
        while (i13 > 0) {
            if (this.f5498d.remaining() == 0 && !c()) {
                a("Reached the end of bundle when more data was expected.");
                throw null;
            }
            int min = Math.min(i13, this.f5498d.remaining());
            byteArrayOutputStream.write(this.f5498d.array(), this.f5498d.position() + this.f5498d.arrayOffset(), min);
            ByteBuffer byteBuffer = this.f5498d;
            byteBuffer.position(byteBuffer.position() + min);
            i13 -= min;
        }
        String byteArrayOutputStream2 = byteArrayOutputStream.toString(f.name());
        this.f5499e += charBuffer.getBytes(r6).length + parseInt;
        JSONObject jSONObject = new JSONObject(byteArrayOutputStream2);
        if (jSONObject.has("metadata")) {
            g gVar = this.f5495a;
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            gVar.getClass();
            e eVar2 = new e(jSONObject2.getString("id"), jSONObject2.getInt("version"), new q(gVar.e(jSONObject2.get("createTime"))), jSONObject2.getInt("totalDocuments"), jSONObject2.getLong("totalBytes"));
            m0.y(1, "BundleElement", "BundleMetadata element loaded", new Object[0]);
            return eVar2;
        }
        if (jSONObject.has("namedQuery")) {
            g gVar2 = this.f5495a;
            JSONObject jSONObject3 = jSONObject.getJSONObject("namedQuery");
            gVar2.getClass();
            String string = jSONObject3.getString("name");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("bundledQuery");
            JSONObject jSONObject5 = jSONObject4.getJSONObject("structuredQuery");
            if (jSONObject5.has("select")) {
                throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
            }
            o c10 = gVar2.c(jSONObject4.getString("parent"));
            JSONArray jSONArray = jSONObject5.getJSONArray("from");
            if (jSONArray.length() != 1) {
                throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
            }
            JSONObject jSONObject6 = jSONArray.getJSONObject(0);
            boolean optBoolean = jSONObject6.optBoolean("allDescendants", false);
            String string2 = jSONObject6.getString("collectionId");
            if (optBoolean) {
                str = string2;
            } else {
                str = null;
                c10 = c10.g(string2);
            }
            JSONObject optJSONObject = jSONObject5.optJSONObject("where");
            ArrayList arrayList = new ArrayList();
            if (optJSONObject != null) {
                gVar2.a(arrayList, optJSONObject);
            }
            JSONArray optJSONArray = jSONObject5.optJSONArray("orderBy");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null) {
                while (i10 < optJSONArray.length()) {
                    JSONObject jSONObject7 = optJSONArray.getJSONObject(i10);
                    JSONArray jSONArray2 = optJSONArray;
                    arrayList2.add(new e0(jSONObject7.optString("direction", "ASCENDING").equals("ASCENDING") ? 1 : 2, l.t(jSONObject7.getJSONObject("field").getString("fieldPath"))));
                    i10++;
                    optJSONArray = jSONArray2;
                }
            }
            JSONObject optJSONObject2 = jSONObject5.optJSONObject("startAt");
            if (optJSONObject2 != null) {
                z10 = false;
                eVar = new g9.e(gVar2.d(optJSONObject2), optJSONObject2.optBoolean("before", false));
            } else {
                z10 = false;
                eVar = null;
            }
            JSONObject optJSONObject3 = jSONObject5.optJSONObject("endAt");
            g9.e eVar3 = optJSONObject3 != null ? new g9.e(gVar2.d(optJSONObject3), !optJSONObject3.optBoolean("before", z10)) : null;
            if (jSONObject5.has("offset")) {
                throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
            }
            JSONObject optJSONObject4 = jSONObject5.optJSONObject("limit");
            int optInt = optJSONObject4 != null ? optJSONObject4.optInt("value", -1) : jSONObject5.optInt("limit", -1);
            String optString = jSONObject4.optString("limitType", "FIRST");
            if (optString.equals("FIRST")) {
                i12 = 1;
            } else {
                if (!optString.equals("LAST")) {
                    throw new IllegalArgumentException(defpackage.g.d("Invalid limit type for bundle query: ", optString));
                }
                i12 = 2;
            }
            c jVar = new j(string, new i(new f0(c10, str, arrayList, arrayList2, optInt, 1, eVar, eVar3).i(), i12), new q(gVar2.e(jSONObject3.get("readTime"))));
            m0.y(1, "BundleElement", defpackage.g.d("Query loaded: ", string), new Object[0]);
            cVar = jVar;
        } else if (jSONObject.has("documentMetadata")) {
            g gVar3 = this.f5495a;
            JSONObject jSONObject8 = jSONObject.getJSONObject("documentMetadata");
            gVar3.getClass();
            j9.i iVar = new j9.i(gVar3.c(jSONObject8.getString("name")));
            q qVar = new q(gVar3.e(jSONObject8.get("readTime")));
            boolean optBoolean2 = jSONObject8.optBoolean("exists", false);
            JSONArray optJSONArray2 = jSONObject8.optJSONArray("queries");
            ArrayList arrayList3 = new ArrayList();
            if (optJSONArray2 != null) {
                for (int i14 = 0; i14 < optJSONArray2.length(); i14++) {
                    arrayList3.add(optJSONArray2.getString(i14));
                }
            }
            c hVar = new h(iVar, qVar, optBoolean2, arrayList3);
            m0.y(1, "BundleElement", "Document metadata loaded: " + iVar, new Object[0]);
            cVar = hVar;
        } else {
            if (!jSONObject.has("document")) {
                a("Cannot decode unknown Bundle element: " + byteArrayOutputStream2);
                throw null;
            }
            g gVar4 = this.f5495a;
            JSONObject jSONObject9 = jSONObject.getJSONObject("document");
            gVar4.getClass();
            j9.i iVar2 = new j9.i(gVar4.c(jSONObject9.getString("name")));
            q qVar2 = new q(gVar4.e(jSONObject9.get("updateTime")));
            d0.a d02 = d0.d0();
            gVar4.b(d02, jSONObject9.getJSONObject("fields"));
            n e10 = n.e(((d0) d02.f11120b).Y().J());
            m mVar = new m(iVar2);
            mVar.k(qVar2, e10);
            b bVar = new b(mVar);
            StringBuilder l10 = defpackage.f.l("Document loaded: ");
            l10.append(bVar.f5483a.f8693b);
            m0.y(1, "BundleElement", l10.toString(), new Object[0]);
            cVar = bVar;
        }
        return cVar;
    }
}
