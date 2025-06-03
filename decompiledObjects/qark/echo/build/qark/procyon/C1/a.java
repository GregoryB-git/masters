// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C1;

import org.json.JSONException;
import org.json.JSONArray;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONObject;
import java.util.Arrays;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import java.util.List;

public final class a
{
    public static final b j;
    public final String a;
    public final c b;
    public final a c;
    public final String d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;
    public final String i;
    
    static {
        j = new b(null);
    }
    
    public a(final String a, final c b, final a c, final String d, final List e, final List f, final String g, final String h, final String i) {
        Intrinsics.checkNotNullParameter(a, "eventName");
        Intrinsics.checkNotNullParameter(b, "method");
        Intrinsics.checkNotNullParameter(c, "type");
        Intrinsics.checkNotNullParameter(d, "appVersion");
        Intrinsics.checkNotNullParameter(e, "path");
        Intrinsics.checkNotNullParameter(f, "parameters");
        Intrinsics.checkNotNullParameter(g, "componentId");
        Intrinsics.checkNotNullParameter(h, "pathType");
        Intrinsics.checkNotNullParameter(i, "activityName");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final String a() {
        return this.i;
    }
    
    public final String b() {
        return this.a;
    }
    
    public final List c() {
        final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)this.f);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }
    
    public final List d() {
        final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)this.e);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }
    
    public enum a
    {
        o("CLICK", 0), 
        p("SELECTED", 1), 
        q("TEXT_CHANGED", 2);
        
        static {
            r = c();
        }
        
        public a(final String name, final int ordinal) {
        }
        
        public static final /* synthetic */ a[] c() {
            return new a[] { a.o, a.p, a.q };
        }
    }
    
    public static final class b
    {
        public final a a(final JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "mapping");
            final String string = jsonObject.getString("event_name");
            final String string2 = jsonObject.getString("method");
            Intrinsics.checkNotNullExpressionValue(string2, "mapping.getString(\"method\")");
            final Locale english = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(english, "ENGLISH");
            final String upperCase = string2.toUpperCase(english);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            final c value = C1.a.c.valueOf(upperCase);
            final String string3 = jsonObject.getString("event_type");
            Intrinsics.checkNotNullExpressionValue(string3, "mapping.getString(\"event_type\")");
            Intrinsics.checkNotNullExpressionValue(english, "ENGLISH");
            final String upperCase2 = string3.toUpperCase(english);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            final a value2 = C1.a.a.valueOf(upperCase2);
            final String string4 = jsonObject.getString("app_version");
            final JSONArray jsonArray = jsonObject.getJSONArray("path");
            final ArrayList<C1.c> list = new ArrayList<C1.c>();
            final int length = jsonArray.length();
            final int n = 0;
            if (length > 0) {
                int n2 = 0;
                while (true) {
                    final int n3 = n2 + 1;
                    final JSONObject jsonObject2 = jsonArray.getJSONObject(n2);
                    Intrinsics.checkNotNullExpressionValue(jsonObject2, "jsonPath");
                    list.add(new C1.c(jsonObject2));
                    if (n3 >= length) {
                        break;
                    }
                    n2 = n3;
                }
            }
            final String optString = jsonObject.optString("path_type", "absolute");
            final JSONArray optJSONArray = jsonObject.optJSONArray("parameters");
            final ArrayList<C1.b> list2 = new ArrayList<C1.b>();
            if (optJSONArray != null) {
                final int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int n4 = n;
                    while (true) {
                        final int n5 = n4 + 1;
                        final JSONObject jsonObject3 = optJSONArray.getJSONObject(n4);
                        Intrinsics.checkNotNullExpressionValue(jsonObject3, "jsonParameter");
                        list2.add(new C1.b(jsonObject3));
                        if (n5 >= length2) {
                            break;
                        }
                        n4 = n5;
                    }
                }
            }
            final String optString2 = jsonObject.optString("component_id");
            final String optString3 = jsonObject.optString("activity_name");
            Intrinsics.checkNotNullExpressionValue(string, "eventName");
            Intrinsics.checkNotNullExpressionValue(string4, "appVersion");
            Intrinsics.checkNotNullExpressionValue(optString2, "componentId");
            Intrinsics.checkNotNullExpressionValue(optString, "pathType");
            Intrinsics.checkNotNullExpressionValue(optString3, "activityName");
            return new a(string, value, value2, string4, list, list2, optString2, optString, optString3);
        }
        
        public final List b(final JSONArray jsonArray) {
            final ArrayList<a> list = new ArrayList<a>();
            if (jsonArray == null) {
                return list;
            }
            try {
                final int length = jsonArray.length();
                if (length > 0) {
                    int n = 0;
                    while (true) {
                        final int n2 = n + 1;
                        final JSONObject jsonObject = jsonArray.getJSONObject(n);
                        Intrinsics.checkNotNullExpressionValue(jsonObject, "array.getJSONObject(i)");
                        list.add(this.a(jsonObject));
                        if (n2 >= length) {
                            break;
                        }
                        n = n2;
                    }
                    return list;
                }
                return list;
            }
            catch (JSONException | IllegalArgumentException ex) {
                return list;
            }
        }
    }
    
    public enum c
    {
        o("MANUAL", 0), 
        p("INFERENCE", 1);
        
        static {
            q = c();
        }
        
        public c(final String name, final int ordinal) {
        }
        
        public static final /* synthetic */ c[] c() {
            return new c[] { c.o, c.p };
        }
    }
}
