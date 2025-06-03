/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.net.URI
 *  java.nio.charset.Charset
 *  java.util.HashMap
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Set
 */
package e4;

import android.util.Base64;
import e4.e;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class f {
    public URI a;
    public String b;
    public String c = null;
    public Map d;

    public f(URI uRI, String string2, Map map) {
        this.a = uRI;
        this.b = string2;
        this.d = map;
        this.c = this.a();
    }

    public final String a() {
        byte[] arrby = new byte[16];
        for (int i8 = 0; i8 < 16; ++i8) {
            arrby[i8] = (byte)this.d(0, 255);
        }
        return Base64.encodeToString((byte[])arrby, (int)2);
    }

    public final String b(LinkedHashMap linkedHashMap) {
        String string2 = new String();
        for (String string3 : linkedHashMap.keySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(string3);
            stringBuilder.append(": ");
            stringBuilder.append((String)linkedHashMap.get((Object)string3));
            stringBuilder.append("\r\n");
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    public byte[] c() {
        String string2 = this.a.getPath();
        byte[] arrby = this.a.getQuery();
        byte[] arrby2 = new StringBuilder();
        arrby2.append(string2);
        if (arrby == null) {
            arrby = "";
        } else {
            string2 = new StringBuilder();
            string2.append("?");
            string2.append((String)arrby);
            arrby = string2.toString();
        }
        arrby2.append((String)arrby);
        string2 = arrby2.toString();
        arrby2 = this.a.getHost();
        arrby = arrby2;
        if (this.a.getPort() != -1) {
            arrby = new StringBuilder();
            arrby.append((String)arrby2);
            arrby.append(":");
            arrby.append(this.a.getPort());
            arrby = arrby.toString();
        }
        arrby2 = new LinkedHashMap();
        arrby2.put((Object)"Host", (Object)arrby);
        arrby2.put((Object)"Upgrade", (Object)"websocket");
        arrby2.put((Object)"Connection", (Object)"Upgrade");
        arrby2.put((Object)"Sec-WebSocket-Version", (Object)"13");
        arrby2.put((Object)"Sec-WebSocket-Key", (Object)this.c);
        arrby = this.b;
        if (arrby != null) {
            arrby2.put((Object)"Sec-WebSocket-Protocol", (Object)arrby);
        }
        if ((arrby = this.d) != null) {
            for (String string3 : arrby.keySet()) {
                if (arrby2.containsKey((Object)string3)) continue;
                arrby2.put((Object)string3, (Object)((String)this.d.get((Object)string3)));
            }
        }
        arrby = new StringBuilder();
        arrby.append("GET ");
        arrby.append(string2);
        arrby.append(" HTTP/1.1\r\n");
        arrby = arrby.toString();
        string2 = new StringBuilder();
        string2.append((String)arrby);
        string2.append(this.b((LinkedHashMap)arrby2));
        arrby = string2.toString();
        arrby2 = new StringBuilder();
        arrby2.append((String)arrby);
        arrby2.append("\r\n");
        arrby = arrby2.toString().getBytes(Charset.defaultCharset());
        arrby2 = new byte[arrby.length];
        System.arraycopy((Object)arrby, (int)0, (Object)arrby2, (int)0, (int)arrby.length);
        return arrby2;
    }

    public final int d(int n8, int n9) {
        return (int)(Math.random() * (double)n9 + (double)n8);
    }

    public void e(HashMap hashMap) {
        if ("websocket".equals(hashMap.get((Object)"upgrade"))) {
            if ("upgrade".equals(hashMap.get((Object)"connection"))) {
                return;
            }
            throw new e("connection failed: missing header field in server handshake: Connection");
        }
        throw new e("connection failed: missing header field in server handshake: Upgrade");
    }

    public void f(String string2) {
        int n8 = Integer.parseInt((String)string2.substring(9, 12));
        if (n8 != 407) {
            if (n8 != 404) {
                if (n8 == 101) {
                    return;
                }
                string2 = new StringBuilder();
                string2.append("connection failed: unknown status code ");
                string2.append(n8);
                throw new e(string2.toString());
            }
            throw new e("connection failed: 404 not found");
        }
        throw new e("connection failed: proxy authentication not supported");
    }
}

