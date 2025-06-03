/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.CopyOnWriteArraySet
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package z1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.i;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {
    public static final a d = new a(null);
    public static final Set e = new CopyOnWriteArraySet();
    public final String a;
    public final String b;
    public final List c;

    public d(String string2, List list, String string3) {
        this.a = string2;
        this.b = string3;
        this.c = list;
    }

    public /* synthetic */ d(String string2, List list, String string3, g g8) {
        this(string2, list, string3);
    }

    public static final /* synthetic */ Set a() {
        if (T1.a.d(d.class)) {
            return null;
        }
        try {
            Set set = e;
            return set;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, d.class);
            return null;
        }
    }

    public final List b() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList((Collection)this.c);
            return arrayList;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return null;
        }
    }

    public final String c() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            String string2 = this.a;
            return string2;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return null;
        }
    }

    public final String d() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            String string2 = this.b;
            return string2;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return null;
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final void a(JSONObject jSONObject) {
            Iterator iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                Object object = jSONObject.optJSONObject(string2);
                if (object == null) continue;
                String string3 = object.optString("k");
                object = object.optString("v");
                Intrinsics.checkNotNullExpressionValue(string3, "k");
                if (string3.length() == 0) continue;
                Set set = d.a();
                Intrinsics.checkNotNullExpressionValue(string2, "key");
                string3 = i.V(string3, new String[]{","}, false, 0, 6, null);
                Intrinsics.checkNotNullExpressionValue(object, "v");
                set.add((Object)new d(string2, (List)string3, (String)object, null));
            }
        }

        public final Set b() {
            HashSet hashSet = new HashSet();
            Iterator iterator = d.a().iterator();
            while (iterator.hasNext()) {
                hashSet.add((Object)((d)iterator.next()).c());
            }
            return hashSet;
        }

        public final Set c() {
            return new HashSet((Collection)d.a());
        }

        public final void d(String string2) {
            Intrinsics.checkNotNullParameter(string2, "rulesFromServer");
            try {
                d.a().clear();
                this.a(new JSONObject(string2));
                return;
            }
            catch (JSONException jSONException) {
                return;
            }
        }
    }

}

