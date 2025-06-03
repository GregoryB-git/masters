// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import android.os.BaseBundle;
import java.util.Iterator;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;
import kotlin.jvm.internal.Intrinsics;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

public final class c
{
    public static final c a;
    public static final Map b;
    
    static {
        a = new c();
        final HashMap<Class<Boolean>, c$b> b2 = new HashMap<Class<Boolean>, c$b>();
        (b = b2).put(Boolean.class, new h() {
            @Override
            public void a(final Bundle bundle, final String s, final Object o) {
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(s, "key");
                Intrinsics.checkNotNullParameter(o, "value");
                ((BaseBundle)bundle).putBoolean(s, (boolean)o);
            }
        });
        b2.put((Class<Boolean>)Integer.class, new h() {
            @Override
            public void a(final Bundle bundle, final String s, final Object o) {
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(s, "key");
                Intrinsics.checkNotNullParameter(o, "value");
                ((BaseBundle)bundle).putInt(s, (int)o);
            }
        });
        b2.put((Class<Boolean>)Long.class, (c$b)new h() {
            @Override
            public void a(final Bundle bundle, final String s, final Object o) {
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(s, "key");
                Intrinsics.checkNotNullParameter(o, "value");
                ((BaseBundle)bundle).putLong(s, (long)o);
            }
        });
        b2.put((Class<Boolean>)Double.class, (c$b)new h() {
            @Override
            public void a(final Bundle bundle, final String s, final Object o) {
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(s, "key");
                Intrinsics.checkNotNullParameter(o, "value");
                ((BaseBundle)bundle).putDouble(s, (double)o);
            }
        });
        b2.put((Class<Boolean>)String.class, (c$b)new h() {
            @Override
            public void a(final Bundle bundle, final String s, final Object o) {
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(s, "key");
                Intrinsics.checkNotNullParameter(o, "value");
                ((BaseBundle)bundle).putString(s, (String)o);
            }
        });
        b2.put((Class<Boolean>)String[].class, (c$b)new h() {
            @Override
            public void a(final Bundle bundle, final String s, final Object o) {
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(s, "key");
                Intrinsics.checkNotNullParameter(o, "value");
                throw new IllegalArgumentException("Unexpected type from JSON");
            }
        });
        b2.put((Class<Boolean>)JSONArray.class, (c$b)new h() {
            @Override
            public void a(final Bundle bundle, final String s, final Object o) {
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(s, "key");
                Intrinsics.checkNotNullParameter(o, "value");
                final JSONArray jsonArray = (JSONArray)o;
                final ArrayList<Object> list = new ArrayList<Object>();
                if (jsonArray.length() == 0) {
                    bundle.putStringArrayList(s, (ArrayList)list);
                    return;
                }
                final int length = jsonArray.length();
                if (length > 0) {
                    int n = 0;
                    while (true) {
                        final int n2 = n + 1;
                        final Object value = jsonArray.get(n);
                        if (!(value instanceof String)) {
                            throw new IllegalArgumentException(Intrinsics.i("Unexpected type in an array: ", value.getClass()));
                        }
                        list.add(value);
                        if (n2 >= length) {
                            break;
                        }
                        n = n2;
                    }
                }
                bundle.putStringArrayList(s, (ArrayList)list);
            }
        });
    }
    
    public static final Bundle a(final JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        final Bundle bundle = new Bundle();
        final Iterator keys = jsonObject.keys();
        while (keys.hasNext()) {
            final String s = keys.next();
            final Object value = jsonObject.get(s);
            if (value == JSONObject.NULL) {
                continue;
            }
            if (value instanceof JSONObject) {
                bundle.putBundle(s, a((JSONObject)value));
            }
            else {
                final h h = c.b.get(((JSONObject)value).getClass());
                if (h == null) {
                    throw new IllegalArgumentException(Intrinsics.i("Unsupported type: ", ((JSONObject)value).getClass()));
                }
                Intrinsics.checkNotNullExpressionValue(s, "key");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                h.a(bundle, s, value);
            }
        }
        return bundle;
    }
    
    public interface h
    {
        void a(final Bundle p0, final String p1, final Object p2);
    }
}
