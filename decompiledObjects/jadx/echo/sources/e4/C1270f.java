package e4;

import android.util.Base64;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: e4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1270f {

    /* renamed from: a, reason: collision with root package name */
    public URI f13980a;

    /* renamed from: b, reason: collision with root package name */
    public String f13981b;

    /* renamed from: c, reason: collision with root package name */
    public String f13982c;

    /* renamed from: d, reason: collision with root package name */
    public Map f13983d;

    public C1270f(URI uri, String str, Map map) {
        this.f13982c = null;
        this.f13980a = uri;
        this.f13981b = str;
        this.f13983d = map;
        this.f13982c = a();
    }

    public final String a() {
        byte[] bArr = new byte[16];
        for (int i7 = 0; i7 < 16; i7++) {
            bArr[i7] = (byte) d(0, 255);
        }
        return Base64.encodeToString(bArr, 2);
    }

    public final String b(LinkedHashMap linkedHashMap) {
        String str = new String();
        for (String str2 : linkedHashMap.keySet()) {
            str = str + str2 + ": " + ((String) linkedHashMap.get(str2)) + "\r\n";
        }
        return str;
    }

    public byte[] c() {
        String path = this.f13980a.getPath();
        String query = this.f13980a.getQuery();
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append(query == null ? "" : "?" + query);
        String sb2 = sb.toString();
        String host = this.f13980a.getHost();
        if (this.f13980a.getPort() != -1) {
            host = host + ":" + this.f13980a.getPort();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", this.f13982c);
        String str = this.f13981b;
        if (str != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", str);
        }
        Map map = this.f13983d;
        if (map != null) {
            for (String str2 : map.keySet()) {
                if (!linkedHashMap.containsKey(str2)) {
                    linkedHashMap.put(str2, (String) this.f13983d.get(str2));
                }
            }
        }
        byte[] bytes = ((("GET " + sb2 + " HTTP/1.1\r\n") + b(linkedHashMap)) + "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public final int d(int i7, int i8) {
        return (int) ((Math.random() * i8) + i7);
    }

    public void e(HashMap hashMap) {
        if (!"websocket".equals(hashMap.get("upgrade"))) {
            throw new C1269e("connection failed: missing header field in server handshake: Upgrade");
        }
        if (!"upgrade".equals(hashMap.get("connection"))) {
            throw new C1269e("connection failed: missing header field in server handshake: Connection");
        }
    }

    public void f(String str) {
        int parseInt = Integer.parseInt(str.substring(9, 12));
        if (parseInt == 407) {
            throw new C1269e("connection failed: proxy authentication not supported");
        }
        if (parseInt == 404) {
            throw new C1269e("connection failed: 404 not found");
        }
        if (parseInt == 101) {
            return;
        }
        throw new C1269e("connection failed: unknown status code " + parseInt);
    }
}
