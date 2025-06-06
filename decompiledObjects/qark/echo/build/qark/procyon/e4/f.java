// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e4;

import java.util.HashMap;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import android.util.Base64;
import java.util.Map;
import java.net.URI;

public class f
{
    public URI a;
    public String b;
    public String c;
    public Map d;
    
    public f(final URI a, final String b, final Map d) {
        this.c = null;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = this.a();
    }
    
    public final String a() {
        final byte[] array = new byte[16];
        for (int i = 0; i < 16; ++i) {
            array[i] = (byte)this.d(0, 255);
        }
        return Base64.encodeToString(array, 2);
    }
    
    public final String b(final LinkedHashMap linkedHashMap) {
        String string = new String();
        for (final String s : linkedHashMap.keySet()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(s);
            sb.append(": ");
            sb.append((String)linkedHashMap.get(s));
            sb.append("\r\n");
            string = sb.toString();
        }
        return string;
    }
    
    public byte[] c() {
        final String path = this.a.getPath();
        final String query = this.a.getQuery();
        final StringBuilder sb = new StringBuilder();
        sb.append(path);
        String string;
        if (query == null) {
            string = "";
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("?");
            sb2.append(query);
            string = sb2.toString();
        }
        sb.append(string);
        final String string2 = sb.toString();
        String s = this.a.getHost();
        if (this.a.getPort() != -1) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(s);
            sb3.append(":");
            sb3.append(this.a.getPort());
            s = sb3.toString();
        }
        final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("Host", s);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", this.c);
        final String b = this.b;
        if (b != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", b);
        }
        final Map d = this.d;
        if (d != null) {
            for (final String s2 : d.keySet()) {
                if (!linkedHashMap.containsKey(s2)) {
                    linkedHashMap.put(s2, (String)this.d.get(s2));
                }
            }
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("GET ");
        sb4.append(string2);
        sb4.append(" HTTP/1.1\r\n");
        final String string3 = sb4.toString();
        final StringBuilder sb5 = new StringBuilder();
        sb5.append(string3);
        sb5.append(this.b(linkedHashMap));
        final String string4 = sb5.toString();
        final StringBuilder sb6 = new StringBuilder();
        sb6.append(string4);
        sb6.append("\r\n");
        final byte[] bytes = sb6.toString().getBytes(Charset.defaultCharset());
        final byte[] array = new byte[bytes.length];
        System.arraycopy(bytes, 0, array, 0, bytes.length);
        return array;
    }
    
    public final int d(final int n, final int n2) {
        return (int)(Math.random() * n2 + n);
    }
    
    public void e(final HashMap hashMap) {
        if (!"websocket".equals(hashMap.get("upgrade"))) {
            throw new e("connection failed: missing header field in server handshake: Upgrade");
        }
        if ("upgrade".equals(hashMap.get("connection"))) {
            return;
        }
        throw new e("connection failed: missing header field in server handshake: Connection");
    }
    
    public void f(final String s) {
        final int int1 = Integer.parseInt(s.substring(9, 12));
        if (int1 == 407) {
            throw new e("connection failed: proxy authentication not supported");
        }
        if (int1 == 404) {
            throw new e("connection failed: 404 not found");
        }
        if (int1 == 101) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("connection failed: unknown status code ");
        sb.append(int1);
        throw new e(sb.toString());
    }
}
