// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z1;

import org.json.JSONException;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.text.i;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import java.util.Collection;
import java.util.ArrayList;
import T1.a;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.g;
import java.util.List;
import java.util.Set;

public final class d
{
    public static final a d;
    public static final Set e;
    public final String a;
    public final String b;
    public final List c;
    
    static {
        d = new a(null);
        e = new CopyOnWriteArraySet();
    }
    
    public d(final String a, final List c, final String b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static final /* synthetic */ Set a() {
        if (T1.a.d(d.class)) {
            return null;
        }
        try {
            return z1.d.e;
        }
        finally {
            final Throwable t;
            T1.a.b(t, d.class);
            return null;
        }
    }
    
    public final List b() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.c);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final String c() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return this.a;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final String d() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return this.b;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public static final class a
    {
        public final void a(final JSONObject jsonObject) {
            final Iterator keys = jsonObject.keys();
            while (keys.hasNext()) {
                final String s = keys.next();
                final JSONObject optJSONObject = jsonObject.optJSONObject(s);
                if (optJSONObject == null) {
                    continue;
                }
                final String optString = optJSONObject.optString("k");
                final String optString2 = optJSONObject.optString("v");
                Intrinsics.checkNotNullExpressionValue(optString, "k");
                if (optString.length() == 0) {
                    continue;
                }
                final Set a = z1.d.a();
                Intrinsics.checkNotNullExpressionValue(s, "key");
                final List v = i.V(optString, new String[] { "," }, false, 0, 6, null);
                Intrinsics.checkNotNullExpressionValue(optString2, "v");
                a.add(new d(s, v, optString2, null));
            }
        }
        
        public final Set b() {
            final HashSet<String> set = new HashSet<String>();
            final Iterator<d> iterator = z1.d.a().iterator();
            while (iterator.hasNext()) {
                set.add(iterator.next().c());
            }
            return set;
        }
        
        public final Set c() {
            return new HashSet(z1.d.a());
        }
        
        public final void d(final String s) {
            Intrinsics.checkNotNullParameter(s, "rulesFromServer");
            try {
                z1.d.a().clear();
                this.a(new JSONObject(s));
            }
            catch (JSONException ex) {}
        }
    }
}
