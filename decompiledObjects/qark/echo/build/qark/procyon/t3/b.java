// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t3;

import android.text.TextUtils;
import java.util.ArrayList;
import java.text.ParseException;
import java.util.Map;
import w3.a;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;

public class b
{
    public static final String[] g;
    public static final DateFormat h;
    public final String a;
    public final String b;
    public final String c;
    public final Date d;
    public final long e;
    public final long f;
    
    static {
        g = new String[] { "experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId" };
        h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    }
    
    public b(final String a, final String b, final String c, final Date d, final long e, final long f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static b a(final a.c c) {
        String d = c.d;
        if (d == null) {
            d = "";
        }
        return new b(c.b, String.valueOf(c.c), d, new Date(c.m), c.e, c.j);
    }
    
    public static b b(final Map map) {
        while (true) {
            g(map);
            while (true) {
                Label_0157: {
                    while (true) {
                        try {
                            final Date parse = b.h.parse(map.get("experimentStartTime"));
                            final long long1 = Long.parseLong(map.get("triggerTimeoutMillis"));
                            final long long2 = Long.parseLong(map.get("timeToLiveMillis"));
                            final String s = map.get("experimentId");
                            final String s2 = map.get("variantId");
                            if (map.containsKey("triggerEvent")) {
                                final String s3 = map.get("triggerEvent");
                                return new b(s, s2, s3, parse, long1, long2);
                            }
                            break Label_0157;
                            final ParseException ex;
                            throw new t3.a("Could not process experiment: parsing experiment start time failed.", ex);
                        }
                        catch (NumberFormatException ex3) {}
                        catch (ParseException ex2) {}
                        final ParseException ex2;
                        final ParseException ex = ex2;
                        continue;
                    }
                }
                final String s3 = "";
                continue;
            }
        }
    }
    
    public static void g(final Map map) {
        final ArrayList<String> list = new ArrayList<String>();
        final String[] g = b.g;
        for (int length = g.length, i = 0; i < length; ++i) {
            final String s = g[i];
            if (!map.containsKey(s)) {
                list.add(s);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        throw new t3.a(String.format("The following keys are missing from the experiment info map: %s", list));
    }
    
    public String c() {
        return this.a;
    }
    
    public long d() {
        return this.d.getTime();
    }
    
    public String e() {
        return this.b;
    }
    
    public a.c f(String c) {
        final a.c c2 = new a.c();
        c2.a = c;
        c2.m = this.d();
        c2.b = this.a;
        c2.c = this.b;
        if (TextUtils.isEmpty((CharSequence)this.c)) {
            c = null;
        }
        else {
            c = this.c;
        }
        c2.d = c;
        c2.e = this.e;
        c2.j = this.f;
        return c2;
    }
}
