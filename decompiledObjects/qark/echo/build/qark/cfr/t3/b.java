/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.text.DateFormat
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.Locale
 *  java.util.Map
 */
package t3;

import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import t3.a;
import w3.a;

public class b {
    public static final String[] g = new String[]{"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final DateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    public final String a;
    public final String b;
    public final String c;
    public final Date d;
    public final long e;
    public final long f;

    public b(String string2, String string3, String string4, Date date, long l8, long l9) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = date;
        this.e = l8;
        this.f = l9;
    }

    public static b a(a.c c8) {
        String string2;
        block0 : {
            string2 = c8.d;
            if (string2 != null) break block0;
            string2 = "";
        }
        return new b(c8.b, String.valueOf((Object)c8.c), string2, new Date(c8.m), c8.e, c8.j);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static b b(Map object) {
        String string2;
        Date date;
        long l8;
        String string3;
        long l9;
        b.g((Map)object);
        try {
            date = h.parse((String)object.get((Object)"experimentStartTime"));
            l8 = Long.parseLong((String)((String)object.get((Object)"triggerTimeoutMillis")));
            l9 = Long.parseLong((String)((String)object.get((Object)"timeToLiveMillis")));
            string2 = (String)object.get((Object)"experimentId");
            string3 = (String)object.get((Object)"variantId");
            if (object.containsKey((Object)"triggerEvent")) {
                object = (String)object.get((Object)"triggerEvent");
                do {
                    return new b(string2, string3, (String)object, date, l8, l9);
                    break;
                } while (true);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", (Exception)numberFormatException);
        }
        catch (ParseException parseException) {
            throw new a("Could not process experiment: parsing experiment start time failed.", (Exception)parseException);
        }
        object = "";
        return new b(string2, string3, (String)object, date, l8, l9);
    }

    public static void g(Map map) {
        ArrayList arrayList = new ArrayList();
        for (String string2 : g) {
            if (map.containsKey((Object)string2)) continue;
            arrayList.add((Object)string2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        throw new a(String.format((String)"The following keys are missing from the experiment info map: %s", (Object[])new Object[]{arrayList}));
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

    public a.c f(String string2) {
        a.c c8 = new a.c();
        c8.a = string2;
        c8.m = this.d();
        c8.b = this.a;
        c8.c = this.b;
        string2 = TextUtils.isEmpty((CharSequence)this.c) ? null : this.c;
        c8.d = string2;
        c8.e = this.e;
        c8.j = this.f;
        return c8;
    }
}

