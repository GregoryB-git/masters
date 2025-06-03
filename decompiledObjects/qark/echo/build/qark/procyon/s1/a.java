// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s1;

import c3.m;
import c3.l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.nio.charset.Charset;
import java.nio.ByteBuffer;
import android.content.SharedPreferences$Editor;
import android.util.Pair;
import java.security.GeneralSecurityException;
import java.nio.charset.StandardCharsets;
import c3.n;
import i3.b;
import android.content.Context;
import c3.e;
import java.util.concurrent.CopyOnWriteArrayList;
import android.content.SharedPreferences;

public final class a implements SharedPreferences
{
    public final SharedPreferences a;
    public final CopyOnWriteArrayList b;
    public final String c;
    public final String d;
    public final c3.a e;
    public final c3.e f;
    
    public a(final String c, final String d, final SharedPreferences a, final c3.a e, final c3.e f) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.b = new CopyOnWriteArrayList();
    }
    
    public static SharedPreferences a(final Context context, final String s, final s1.c c, final d d, final e e) {
        return b(s, c.a(), context, d, e);
    }
    
    public static SharedPreferences b(final String s, final String s2, Context applicationContext, final d d, final e e) {
        i3.b.a();
        d3.a.b();
        applicationContext = applicationContext.getApplicationContext();
        final j3.a.b n = new j3.a.b().l(d.e()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", s);
        final StringBuilder sb = new StringBuilder();
        sb.append("android-keystore://");
        sb.append(s2);
        final n d2 = n.m(sb.toString()).f().d();
        final j3.a.b n2 = new j3.a.b().l(e.e()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", s);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("android-keystore://");
        sb2.append(s2);
        return (SharedPreferences)new a(s, s2, applicationContext.getSharedPreferences(s, 0), (c3.a)n2.m(sb2.toString()).f().d().k(c3.a.class), (c3.e)d2.k(c3.e.class));
    }
    
    public String c(String s) {
        try {
            s = new String(this.f.b(q3.e.a(s, 0), this.c.getBytes()), StandardCharsets.UTF_8);
            if (s.equals("__NULL__")) {
                s = null;
            }
            return s;
        }
        catch (GeneralSecurityException cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not decrypt key. ");
            sb.append(cause.getMessage());
            throw new SecurityException(sb.toString(), cause);
        }
    }
    
    public boolean contains(String d) {
        if (!this.g(d)) {
            d = this.d(d);
            return this.a.contains(d);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append(" is a reserved key for the encryption keyset.");
        throw new SecurityException(sb.toString());
    }
    
    public String d(String d) {
        String s = d;
        if (d == null) {
            s = "__NULL__";
        }
        try {
            d = q3.e.d(this.f.a(s.getBytes(StandardCharsets.UTF_8), this.c.getBytes()));
            return d;
        }
        catch (GeneralSecurityException cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not encrypt key. ");
            sb.append(cause.getMessage());
            throw new SecurityException(sb.toString(), cause);
        }
    }
    
    public Pair e(String d, final byte[] array) {
        d = this.d(d);
        return new Pair((Object)d, (Object)q3.e.d(this.e.a(array, d.getBytes(StandardCharsets.UTF_8))));
    }
    
    public SharedPreferences$Editor edit() {
        return (SharedPreferences$Editor)new b(this, this.a.edit());
    }
    
    public final Object f(String str) {
        while (true) {
            Label_0438: {
                if (this.g(str)) {
                    break Label_0438;
                }
                String s;
                if ((s = str) == null) {
                    s = "__NULL__";
                }
                try {
                    final String d = this.d(s);
                    str = this.a.getString(d, (String)null);
                    if (str == null) {
                        return null;
                    }
                    boolean b = false;
                    final byte[] a = q3.e.a(str, 0);
                    final c3.a e = this.e;
                    final Charset utf_8 = StandardCharsets.UTF_8;
                    final ByteBuffer wrap = ByteBuffer.wrap(e.b(a, d.getBytes(utf_8)));
                    wrap.position(0);
                    final int int1 = wrap.getInt();
                    final c e2 = s1.a.c.e(int1);
                    if (e2 == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unknown type ID for encrypted pref value: ");
                        sb.append(int1);
                        throw new SecurityException(sb.toString());
                    }
                    switch (a$a.a[e2.ordinal()]) {
                        case 6: {
                            final t.b b2 = new t.b();
                            while (wrap.hasRemaining()) {
                                final int int2 = wrap.getInt();
                                final ByteBuffer slice = wrap.slice();
                                slice.limit(int2);
                                wrap.position(wrap.position() + int2);
                                b2.add(StandardCharsets.UTF_8.decode(slice).toString());
                            }
                            if (b2.size() == 1 && "__NULL__".equals(b2.s(0))) {
                                return null;
                            }
                            return b2;
                        }
                        case 5: {
                            if (wrap.get() != 0) {
                                b = true;
                            }
                            return b;
                        }
                        case 4: {
                            return wrap.getFloat();
                        }
                        case 3: {
                            return wrap.getLong();
                        }
                        case 2: {
                            return wrap.getInt();
                        }
                        case 1: {
                            final int int3 = wrap.getInt();
                            final ByteBuffer slice2 = wrap.slice();
                            wrap.limit(int3);
                            str = utf_8.decode(slice2).toString();
                            if (str.equals("__NULL__")) {
                                return null;
                            }
                            return str;
                        }
                        default: {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unhandled type for encrypted pref value: ");
                            sb2.append(e2);
                            throw new SecurityException(sb2.toString());
                        }
                    }
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Could not decrypt value. ");
                    final GeneralSecurityException cause;
                    sb3.append(cause.getMessage());
                    throw new SecurityException(sb3.toString(), cause);
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(" is a reserved key for the encryption keyset.");
                    throw new SecurityException(sb4.toString());
                }
                catch (GeneralSecurityException ex) {}
            }
            final GeneralSecurityException ex;
            final GeneralSecurityException cause = ex;
            continue;
        }
    }
    
    public boolean g(final String s) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(s) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(s);
    }
    
    public Map getAll() {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (final Map.Entry<String, V> entry : this.a.getAll().entrySet()) {
            if (!this.g(entry.getKey())) {
                final String c = this.c(entry.getKey());
                hashMap.put(c, this.f(c));
            }
        }
        return hashMap;
    }
    
    public boolean getBoolean(final String s, boolean booleanValue) {
        final Object f = this.f(s);
        if (f instanceof Boolean) {
            booleanValue = (boolean)f;
        }
        return booleanValue;
    }
    
    public float getFloat(final String s, float floatValue) {
        final Object f = this.f(s);
        if (f instanceof Float) {
            floatValue = (float)f;
        }
        return floatValue;
    }
    
    public int getInt(final String s, int intValue) {
        final Object f = this.f(s);
        if (f instanceof Integer) {
            intValue = (int)f;
        }
        return intValue;
    }
    
    public long getLong(final String s, long longValue) {
        final Object f = this.f(s);
        if (f instanceof Long) {
            longValue = (long)f;
        }
        return longValue;
    }
    
    public String getString(final String s, String s2) {
        final Object f = this.f(s);
        if (f instanceof String) {
            s2 = (String)f;
        }
        return s2;
    }
    
    public Set getStringSet(final String s, Set set) {
        final Object f = this.f(s);
        Set set2;
        if (f instanceof Set) {
            set2 = (Set)f;
        }
        else {
            set2 = new t.b();
        }
        if (set2.size() > 0) {
            set = set2;
        }
        return set;
    }
    
    public void registerOnSharedPreferenceChangeListener(final SharedPreferences$OnSharedPreferenceChangeListener e) {
        this.b.add(e);
    }
    
    public void unregisterOnSharedPreferenceChangeListener(final SharedPreferences$OnSharedPreferenceChangeListener o) {
        this.b.remove(o);
    }
    
    public static final class b implements SharedPreferences$Editor
    {
        public final a a;
        public final SharedPreferences$Editor b;
        public final List c;
        public final AtomicBoolean d;
        
        public b(final a a, final SharedPreferences$Editor b) {
            this.d = new AtomicBoolean(false);
            this.a = a;
            this.b = b;
            this.c = new CopyOnWriteArrayList();
        }
        
        public final void a() {
            if (this.d.getAndSet(false)) {
                for (final String s : this.a.getAll().keySet()) {
                    if (!this.c.contains(s) && !this.a.g(s)) {
                        this.b.remove(this.a.d(s));
                    }
                }
            }
        }
        
        public void apply() {
            this.a();
            this.b.apply();
            this.b();
            this.c.clear();
        }
        
        public final void b() {
            for (final SharedPreferences$OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener : this.a.b) {
                final Iterator<String> iterator2 = (Iterator<String>)this.c.iterator();
                while (iterator2.hasNext()) {
                    sharedPreferences$OnSharedPreferenceChangeListener.onSharedPreferenceChanged((SharedPreferences)this.a, (String)iterator2.next());
                }
            }
        }
        
        public final void c(final String str, final byte[] array) {
            if (!this.a.g(str)) {
                this.c.add(str);
                String s;
                if ((s = str) == null) {
                    s = "__NULL__";
                }
                try {
                    final Pair e = this.a.e(s, array);
                    this.b.putString((String)e.first, (String)e.second);
                    return;
                }
                catch (GeneralSecurityException cause) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Could not encrypt data: ");
                    sb.append(cause.getMessage());
                    throw new SecurityException(sb.toString(), cause);
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" is a reserved key for the encryption keyset.");
            throw new SecurityException(sb2.toString());
        }
        
        public SharedPreferences$Editor clear() {
            this.d.set(true);
            return (SharedPreferences$Editor)this;
        }
        
        public boolean commit() {
            this.a();
            try {
                return this.b.commit();
            }
            finally {
                this.b();
                this.c.clear();
            }
        }
        
        public SharedPreferences$Editor putBoolean(final String s, final boolean b) {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
        
        public SharedPreferences$Editor putFloat(final String s, final float n) {
            final ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(s1.a.c.t.h());
            allocate.putFloat(n);
            this.c(s, allocate.array());
            return (SharedPreferences$Editor)this;
        }
        
        public SharedPreferences$Editor putInt(final String s, final int n) {
            final ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(s1.a.c.r.h());
            allocate.putInt(n);
            this.c(s, allocate.array());
            return (SharedPreferences$Editor)this;
        }
        
        public SharedPreferences$Editor putLong(final String s, final long n) {
            final ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(s1.a.c.s.h());
            allocate.putLong(n);
            this.c(s, allocate.array());
            return (SharedPreferences$Editor)this;
        }
        
        public SharedPreferences$Editor putString(final String s, final String s2) {
            String s3 = s2;
            if (s2 == null) {
                s3 = "__NULL__";
            }
            final byte[] bytes = s3.getBytes(StandardCharsets.UTF_8);
            final int length = bytes.length;
            final ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(s1.a.c.p.h());
            allocate.putInt(length);
            allocate.put(bytes);
            this.c(s, allocate.array());
            return (SharedPreferences$Editor)this;
        }
        
        public SharedPreferences$Editor putStringSet(final String s, final Set set) {
            Set<String> set2 = (Set<String>)set;
            if (set == null) {
                set2 = (Set<String>)new t.b();
                set2.add("__NULL__");
            }
            final ArrayList list = new ArrayList<Object>(set2.size());
            int n = set2.size() * 4;
            final Iterator<String> iterator = set2.iterator();
            while (iterator.hasNext()) {
                final byte[] bytes = iterator.next().getBytes(StandardCharsets.UTF_8);
                list.add(bytes);
                n += bytes.length;
            }
            final ByteBuffer allocate = ByteBuffer.allocate(n + 4);
            allocate.putInt(s1.a.c.q.h());
            for (final byte[] src : list) {
                allocate.putInt(src.length);
                allocate.put(src);
            }
            this.c(s, allocate.array());
            return (SharedPreferences$Editor)this;
        }
        
        public SharedPreferences$Editor remove(final String str) {
            if (!this.a.g(str)) {
                this.b.remove(this.a.d(str));
                this.c.add(str);
                return (SharedPreferences$Editor)this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is a reserved key for the encryption keyset.");
            throw new SecurityException(sb.toString());
        }
    }
    
    public enum c
    {
        p("STRING", 0, 0), 
        q("STRING_SET", 1, 1), 
        r("INT", 2, 2), 
        s("LONG", 3, 3), 
        t("FLOAT", 4, 4), 
        u("BOOLEAN", 5, 5);
        
        public final int o;
        
        static {
            v = c();
        }
        
        public c(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static /* synthetic */ c[] c() {
            return new c[] { c.p, c.q, c.r, c.s, c.t, c.u };
        }
        
        public static c e(final int n) {
            if (n == 0) {
                return c.p;
            }
            if (n == 1) {
                return c.q;
            }
            if (n == 2) {
                return c.r;
            }
            if (n == 3) {
                return c.s;
            }
            if (n == 4) {
                return c.t;
            }
            if (n != 5) {
                return null;
            }
            return c.u;
        }
        
        public int h() {
            return this.o;
        }
    }
    
    public enum d
    {
        p("AES256_SIV", 0, "AES256_SIV");
        
        public final String o;
        
        static {
            q = c();
        }
        
        public d(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public static /* synthetic */ d[] c() {
            return new d[] { d.p };
        }
        
        public l e() {
            return m.a(this.o);
        }
    }
    
    public enum e
    {
        p("AES256_GCM", 0, "AES256_GCM");
        
        public final String o;
        
        static {
            q = c();
        }
        
        public e(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public static /* synthetic */ e[] c() {
            return new e[] { e.p };
        }
        
        public l e() {
            return m.a(this.o);
        }
    }
}
