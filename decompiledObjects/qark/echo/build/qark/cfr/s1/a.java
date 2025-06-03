/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.util.Pair
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 *  java.nio.charset.StandardCharsets
 *  java.security.GeneralSecurityException
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.CopyOnWriteArrayList
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package s1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import c3.l;
import c3.m;
import c3.n;
import j3.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a
implements SharedPreferences {
    public final SharedPreferences a;
    public final CopyOnWriteArrayList b;
    public final String c;
    public final String d;
    public final c3.a e;
    public final c3.e f;

    public a(String string2, String string3, SharedPreferences sharedPreferences, c3.a a8, c3.e e8) {
        this.c = string2;
        this.a = sharedPreferences;
        this.d = string3;
        this.e = a8;
        this.f = e8;
        this.b = new CopyOnWriteArrayList();
    }

    public static SharedPreferences a(Context context, String string2, s1.c c8, d d8, e e8) {
        return a.b(string2, c8.a(), context, d8, e8);
    }

    public static SharedPreferences b(String string2, String string3, Context context, d object, e object2) {
        i3.b.a();
        d3.a.b();
        context = context.getApplicationContext();
        object = new a.b().l(object.e()).n(context, "__androidx_security_crypto_encrypted_prefs_key_keyset__", string2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("android-keystore://");
        stringBuilder.append(string3);
        object = object.m(stringBuilder.toString()).f().d();
        object2 = new a.b().l(object2.e()).n(context, "__androidx_security_crypto_encrypted_prefs_value_keyset__", string2);
        stringBuilder = new StringBuilder();
        stringBuilder.append("android-keystore://");
        stringBuilder.append(string3);
        object2 = object2.m(stringBuilder.toString()).f().d();
        object = (c3.e)object.k(c3.e.class);
        object2 = (c3.a)object2.k(c3.a.class);
        return new a(string2, string3, context.getSharedPreferences(string2, 0), (c3.a)object2, (c3.e)object);
    }

    public String c(String string2) {
        try {
            string2 = new String(this.f.b(q3.e.a(string2, 0), this.c.getBytes()), StandardCharsets.UTF_8);
            boolean bl = string2.equals((Object)"__NULL__");
            if (bl) {
                string2 = null;
            }
            return string2;
        }
        catch (GeneralSecurityException generalSecurityException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not decrypt key. ");
            stringBuilder.append(generalSecurityException.getMessage());
            throw new SecurityException(stringBuilder.toString(), (Throwable)generalSecurityException);
        }
    }

    public boolean contains(String string2) {
        if (!this.g(string2)) {
            string2 = this.d(string2);
            return this.a.contains(string2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" is a reserved key for the encryption keyset.");
        throw new SecurityException(stringBuilder.toString());
    }

    public String d(String string2) {
        String string3 = string2;
        if (string2 == null) {
            string3 = "__NULL__";
        }
        try {
            string2 = q3.e.d(this.f.a(string3.getBytes(StandardCharsets.UTF_8), this.c.getBytes()));
            return string2;
        }
        catch (GeneralSecurityException generalSecurityException) {
            string3 = new StringBuilder();
            string3.append("Could not encrypt key. ");
            string3.append(generalSecurityException.getMessage());
            throw new SecurityException(string3.toString(), (Throwable)generalSecurityException);
        }
    }

    public Pair e(String string2, byte[] arrby) {
        string2 = this.d(string2);
        return new Pair((Object)string2, (Object)q3.e.d(this.e.a(arrby, string2.getBytes(StandardCharsets.UTF_8))));
    }

    public SharedPreferences.Editor edit() {
        return new b(this, this.a.edit());
    }

    /*
     * Exception decompiling
     */
    public final Object f(String var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:366)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean g(String string2) {
        if (!"__androidx_security_crypto_encrypted_prefs_key_keyset__".equals((Object)string2) && !"__androidx_security_crypto_encrypted_prefs_value_keyset__".equals((Object)string2)) {
            return false;
        }
        return true;
    }

    public Map getAll() {
        HashMap hashMap = new HashMap();
        Iterator iterator = this.a.getAll().entrySet().iterator();
        while (iterator.hasNext()) {
            Object object = (Map.Entry)iterator.next();
            if (this.g((String)object.getKey())) continue;
            object = this.c((String)object.getKey());
            hashMap.put(object, this.f((String)object));
        }
        return hashMap;
    }

    public boolean getBoolean(String object, boolean bl) {
        if ((object = this.f((String)object)) instanceof Boolean) {
            bl = (Boolean)object;
        }
        return bl;
    }

    public float getFloat(String object, float f8) {
        if ((object = this.f((String)object)) instanceof Float) {
            f8 = ((Float)object).floatValue();
        }
        return f8;
    }

    public int getInt(String object, int n8) {
        if ((object = this.f((String)object)) instanceof Integer) {
            n8 = (Integer)object;
        }
        return n8;
    }

    public long getLong(String object, long l8) {
        if ((object = this.f((String)object)) instanceof Long) {
            l8 = (Long)object;
        }
        return l8;
    }

    public String getString(String object, String string2) {
        if ((object = this.f((String)object)) instanceof String) {
            string2 = (String)object;
        }
        return string2;
    }

    public Set getStringSet(String object, Set object2) {
        object = (object = this.f((String)object)) instanceof Set ? (Set)object : new t.b();
        if (object.size() > 0) {
            object2 = object;
        }
        return object2;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.add((Object)onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.remove((Object)onSharedPreferenceChangeListener);
    }

    public static final class b
    implements SharedPreferences.Editor {
        public final a a;
        public final SharedPreferences.Editor b;
        public final List c;
        public final AtomicBoolean d = new AtomicBoolean(false);

        public b(a a8, SharedPreferences.Editor editor) {
            this.a = a8;
            this.b = editor;
            this.c = new CopyOnWriteArrayList();
        }

        public final void a() {
            if (this.d.getAndSet(false)) {
                for (String string2 : this.a.getAll().keySet()) {
                    if (this.c.contains((Object)string2) || this.a.g(string2)) continue;
                    this.b.remove(this.a.d(string2));
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
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.a.b) {
                for (String string2 : this.c) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged((SharedPreferences)this.a, string2);
                }
            }
        }

        public final void c(String string2, byte[] stringBuilder) {
            if (!this.a.g(string2)) {
                this.c.add((Object)string2);
                String string3 = string2;
                if (string2 == null) {
                    string3 = "__NULL__";
                }
                try {
                    string2 = this.a.e(string3, (byte[])stringBuilder);
                    this.b.putString((String)string2.first, (String)string2.second);
                    return;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not encrypt data: ");
                    stringBuilder.append(generalSecurityException.getMessage());
                    throw new SecurityException(stringBuilder.toString(), (Throwable)generalSecurityException);
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" is a reserved key for the encryption keyset.");
            throw new SecurityException(stringBuilder.toString());
        }

        public SharedPreferences.Editor clear() {
            this.d.set(true);
            return this;
        }

        public boolean commit() {
            this.a();
            try {
                boolean bl = this.b.commit();
                return bl;
            }
            finally {
                this.b();
                this.c.clear();
            }
        }

        public SharedPreferences.Editor putBoolean(String string2, boolean bl) {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

        public SharedPreferences.Editor putFloat(String string2, float f8) {
            ByteBuffer byteBuffer = ByteBuffer.allocate((int)8);
            byteBuffer.putInt(c.t.h());
            byteBuffer.putFloat(f8);
            this.c(string2, byteBuffer.array());
            return this;
        }

        public SharedPreferences.Editor putInt(String string2, int n8) {
            ByteBuffer byteBuffer = ByteBuffer.allocate((int)8);
            byteBuffer.putInt(c.r.h());
            byteBuffer.putInt(n8);
            this.c(string2, byteBuffer.array());
            return this;
        }

        public SharedPreferences.Editor putLong(String string2, long l8) {
            ByteBuffer byteBuffer = ByteBuffer.allocate((int)12);
            byteBuffer.putInt(c.s.h());
            byteBuffer.putLong(l8);
            this.c(string2, byteBuffer.array());
            return this;
        }

        public SharedPreferences.Editor putString(String string2, String byteBuffer) {
            ByteBuffer byteBuffer2 = byteBuffer;
            if (byteBuffer == null) {
                byteBuffer2 = "__NULL__";
            }
            byteBuffer = byteBuffer2.getBytes(StandardCharsets.UTF_8);
            int n8 = byteBuffer.length;
            byteBuffer2 = ByteBuffer.allocate((int)(n8 + 8));
            byteBuffer2.putInt(c.p.h());
            byteBuffer2.putInt(n8);
            byteBuffer2.put((byte[])byteBuffer);
            this.c(string2, byteBuffer2.array());
            return this;
        }

        public SharedPreferences.Editor putStringSet(String string2, Set set) {
            Set set2 = set;
            if (set == null) {
                set2 = new t.b();
                set2.add((Object)"__NULL__");
            }
            set = new ArrayList(set2.size());
            int n8 = set2.size() * 4;
            set2 = set2.iterator();
            while (set2.hasNext()) {
                byte[] arrby = ((String)set2.next()).getBytes(StandardCharsets.UTF_8);
                set.add((Object)arrby);
                n8 += arrby.length;
            }
            set2 = ByteBuffer.allocate((int)(n8 + 4));
            set2.putInt(c.q.h());
            for (byte[] arrby : set) {
                set2.putInt(arrby.length);
                set2.put(arrby);
            }
            this.c(string2, set2.array());
            return this;
        }

        public SharedPreferences.Editor remove(String string2) {
            if (!this.a.g(string2)) {
                this.b.remove(this.a.d(string2));
                this.c.add((Object)string2);
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" is a reserved key for the encryption keyset.");
            throw new SecurityException(stringBuilder.toString());
        }
    }

    public static final class c
    extends Enum {
        public static final /* enum */ c p = new c(0);
        public static final /* enum */ c q = new c(1);
        public static final /* enum */ c r = new c(2);
        public static final /* enum */ c s = new c(3);
        public static final /* enum */ c t = new c(4);
        public static final /* enum */ c u = new c(5);
        public static final /* synthetic */ c[] v;
        public final int o;

        static {
            v = c.c();
        }

        public c(int n9) {
            this.o = n9;
        }

        public static /* synthetic */ c[] c() {
            return new c[]{p, q, r, s, t, u};
        }

        public static c e(int n8) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 != 4) {
                                if (n8 != 5) {
                                    return null;
                                }
                                return u;
                            }
                            return t;
                        }
                        return s;
                    }
                    return r;
                }
                return q;
            }
            return p;
        }

        public static c valueOf(String string2) {
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            return (c[])v.clone();
        }

        public int h() {
            return this.o;
        }
    }

    public static final class d
    extends Enum {
        public static final /* enum */ d p = new d("AES256_SIV");
        public static final /* synthetic */ d[] q;
        public final String o;

        static {
            q = d.c();
        }

        public d(String string3) {
            this.o = string3;
        }

        public static /* synthetic */ d[] c() {
            return new d[]{p};
        }

        public static d valueOf(String string2) {
            return (d)Enum.valueOf(d.class, (String)string2);
        }

        public static d[] values() {
            return (d[])q.clone();
        }

        public l e() {
            return m.a(this.o);
        }
    }

    public static final class e
    extends Enum {
        public static final /* enum */ e p = new e("AES256_GCM");
        public static final /* synthetic */ e[] q;
        public final String o;

        static {
            q = e.c();
        }

        public e(String string3) {
            this.o = string3;
        }

        public static /* synthetic */ e[] c() {
            return new e[]{p};
        }

        public static e valueOf(String string2) {
            return (e)Enum.valueOf(e.class, (String)string2);
        }

        public static e[] values() {
            return (e[])q.clone();
        }

        public l e() {
            return m.a(this.o);
        }
    }

}

