package f9;

import android.util.Base64;
import g9.l;
import j9.o;
import j9.s;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import ka.b;
import ka.d0;
import ka.u;
import m9.e0;
import ma.h;
import ma.n1;
import oa.a;
import org.json.JSONArray;
import org.json.JSONObject;
import u7.m;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f5500a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f5501b;

    public g(e0 e0Var) {
        this.f5501b = e0Var;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.f5500a = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    public final void a(ArrayList arrayList, JSONObject jSONObject) {
        l.a aVar;
        l.a aVar2;
        j9.l t;
        String string;
        d0 d0Var;
        l e10;
        d0 d0Var2;
        if (jSONObject.has("compositeFilter")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("compositeFilter");
            if (!jSONObject2.getString("op").equals("AND")) {
                throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
            }
            JSONArray optJSONArray = jSONObject2.optJSONArray("filters");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    a(arrayList, optJSONArray.getJSONObject(i10));
                }
                return;
            }
            return;
        }
        if (jSONObject.has("fieldFilter")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("fieldFilter");
            arrayList.add(l.e(j9.l.t(jSONObject3.getJSONObject("field").getString("fieldPath")), l.a.valueOf(jSONObject3.getString("op")), f(jSONObject3.getJSONObject("value"))));
            return;
        }
        if (jSONObject.has("unaryFilter")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("unaryFilter");
            aVar = l.a.NOT_EQUAL;
            aVar2 = l.a.EQUAL;
            t = j9.l.t(jSONObject4.getJSONObject("field").getString("fieldPath"));
            string = jSONObject4.getString("op");
            string.getClass();
            string.hashCode();
            switch (string) {
                case "IS_NAN":
                    d0Var = s.f8707a;
                    e10 = l.e(t, aVar2, d0Var);
                    arrayList.add(e10);
                    return;
                case "IS_NULL":
                    d0Var = s.f8708b;
                    e10 = l.e(t, aVar2, d0Var);
                    arrayList.add(e10);
                    return;
                case "IS_NOT_NAN":
                    d0Var2 = s.f8707a;
                    e10 = l.e(t, aVar, d0Var2);
                    arrayList.add(e10);
                    return;
                case "IS_NOT_NULL":
                    d0Var2 = s.f8708b;
                    e10 = l.e(t, aVar, d0Var2);
                    arrayList.add(e10);
                    return;
                default:
                    throw new IllegalArgumentException(defpackage.g.d("Unexpected unary filter: ", string));
            }
        }
    }

    public final void b(d0.a aVar, JSONObject jSONObject) {
        u.a M = u.M();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                M.p(f(jSONObject.getJSONObject(next)), next);
            }
        }
        aVar.t(M);
    }

    public final o c(String str) {
        o t = o.t(str);
        e0 e0Var = this.f5501b;
        e0Var.getClass();
        if (e0.q(t) && t.n(1).equals(e0Var.f10778a.f8678a) && t.n(3).equals(e0Var.f10778a.f8679b)) {
            return (o) t.r();
        }
        throw new IllegalArgumentException(defpackage.g.d("Resource name is not valid for current instance: ", str));
    }

    public final ArrayList d(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(f(optJSONArray.getJSONObject(i10)));
            }
        }
        return arrayList;
    }

    public final m e(Object obj) {
        int i10;
        if (!(obj instanceof String)) {
            if (!(obj instanceof JSONObject)) {
                throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
            }
            JSONObject jSONObject = (JSONObject) obj;
            return new m(jSONObject.optInt("nanos"), jSONObject.optLong("seconds"));
        }
        String str = (String) obj;
        try {
            int indexOf = str.indexOf(84);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Invalid timestamp: " + str);
            }
            int indexOf2 = str.indexOf(90, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(43, indexOf);
            }
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(45, indexOf);
            }
            if (indexOf2 == -1) {
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: " + str);
            }
            String substring = str.substring(0, indexOf2);
            String str2 = "";
            int indexOf3 = substring.indexOf(46);
            if (indexOf3 != -1) {
                String substring2 = substring.substring(0, indexOf3);
                str2 = substring.substring(indexOf3 + 1);
                substring = substring2;
            }
            long time = this.f5500a.parse(substring).getTime() / 1000;
            if (str2.isEmpty()) {
                i10 = 0;
            } else {
                i10 = 0;
                for (int i11 = 0; i11 < 9; i11++) {
                    i10 *= 10;
                    if (i11 < str2.length()) {
                        if (str2.charAt(i11) < '0' || str2.charAt(i11) > '9') {
                            throw new IllegalArgumentException("Invalid nanoseconds: " + str2);
                        }
                        i10 = (str2.charAt(i11) - '0') + i10;
                    }
                }
            }
            if (str.charAt(indexOf2) != 'Z') {
                String substring3 = str.substring(indexOf2 + 1);
                int indexOf4 = substring3.indexOf(58);
                if (indexOf4 == -1) {
                    throw new IllegalArgumentException("Invalid offset value: " + substring3);
                }
                long parseLong = (Long.parseLong(substring3.substring(indexOf4 + 1)) + (Long.parseLong(substring3.substring(0, indexOf4)) * 60)) * 60;
                time = str.charAt(indexOf2) == '+' ? time - parseLong : time + parseLong;
            } else if (str.length() != indexOf2 + 1) {
                throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(indexOf2) + "\"");
            }
            return new m(i10, time);
        } catch (ParseException e10) {
            throw new IllegalArgumentException("Failed to parse timestamp", e10);
        }
    }

    public final d0 f(JSONObject jSONObject) {
        d0.a d02 = d0.d0();
        if (jSONObject.has("nullValue")) {
            d02.m();
            d0.N((d0) d02.f11120b);
        } else {
            if (jSONObject.has("booleanValue")) {
                boolean optBoolean = jSONObject.optBoolean("booleanValue", false);
                d02.m();
                d0.O((d0) d02.f11120b, optBoolean);
            } else if (jSONObject.has("integerValue")) {
                d02.s(jSONObject.optLong("integerValue"));
            } else if (jSONObject.has("doubleValue")) {
                d02.q(jSONObject.optDouble("doubleValue"));
            } else if (jSONObject.has("timestampValue")) {
                m e10 = e(jSONObject.get("timestampValue"));
                n1.a L = n1.L();
                L.p(e10.f15102a);
                int i10 = e10.f15103b;
                L.m();
                n1.H((n1) L.f11120b, i10);
                d02.w(L);
            } else if (jSONObject.has("stringValue")) {
                d02.v(jSONObject.optString("stringValue", ""));
            } else if (jSONObject.has("bytesValue")) {
                byte[] decode = Base64.decode(jSONObject.getString("bytesValue"), 0);
                h.C0164h c0164h = ma.h.f10961b;
                h.C0164h m10 = ma.h.m(decode, 0, decode.length);
                d02.m();
                d0.I((d0) d02.f11120b, m10);
            } else if (jSONObject.has("referenceValue")) {
                String string = jSONObject.getString("referenceValue");
                d02.m();
                d0.J((d0) d02.f11120b, string);
            } else if (jSONObject.has("geoPointValue")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("geoPointValue");
                a.C0190a L2 = oa.a.L();
                double optDouble = jSONObject2.optDouble("latitude");
                L2.m();
                oa.a.G((oa.a) L2.f11120b, optDouble);
                double optDouble2 = jSONObject2.optDouble("longitude");
                L2.m();
                oa.a.H((oa.a) L2.f11120b, optDouble2);
                d02.r(L2);
            } else if (jSONObject.has("arrayValue")) {
                JSONArray optJSONArray = jSONObject.getJSONObject("arrayValue").optJSONArray("values");
                b.a M = ka.b.M();
                if (optJSONArray != null) {
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        d0 f = f(optJSONArray.getJSONObject(i11));
                        M.m();
                        ka.b.G((ka.b) M.f11120b, f);
                    }
                }
                d02.p(M);
            } else {
                if (!jSONObject.has("mapValue")) {
                    throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
                }
                b(d02, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
            }
        }
        return d02.k();
    }
}
