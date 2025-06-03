package s1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import c3.AbstractC0835m;
import c3.C0834l;
import c3.C0836n;
import c3.InterfaceC0823a;
import c3.InterfaceC0827e;
import d3.AbstractC1215a;
import i3.AbstractC1354b;
import j3.C1371a;
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
import q3.AbstractC1889e;
import t.C1959b;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesC1936a implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f19178a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f19179b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final String f19180c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19181d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0823a f19182e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0827e f19183f;

    /* renamed from: s1.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0263a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19184a;

        static {
            int[] iArr = new int[c.values().length];
            f19184a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19184a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19184a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19184a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19184a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19184a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: s1.a$b */
    public static final class b implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        public final SharedPreferencesC1936a f19185a;

        /* renamed from: b, reason: collision with root package name */
        public final SharedPreferences.Editor f19186b;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f19188d = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public final List f19187c = new CopyOnWriteArrayList();

        public b(SharedPreferencesC1936a sharedPreferencesC1936a, SharedPreferences.Editor editor) {
            this.f19185a = sharedPreferencesC1936a;
            this.f19186b = editor;
        }

        public final void a() {
            if (this.f19188d.getAndSet(false)) {
                for (String str : this.f19185a.getAll().keySet()) {
                    if (!this.f19187c.contains(str) && !this.f19185a.g(str)) {
                        this.f19186b.remove(this.f19185a.d(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f19186b.apply();
            b();
            this.f19187c.clear();
        }

        public final void b() {
            Iterator it = this.f19185a.f19179b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
                Iterator it2 = this.f19187c.iterator();
                while (it2.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f19185a, (String) it2.next());
                }
            }
        }

        public final void c(String str, byte[] bArr) {
            if (this.f19185a.g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f19187c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair e7 = this.f19185a.e(str, bArr);
                this.f19186b.putString((String) e7.first, (String) e7.second);
            } catch (GeneralSecurityException e8) {
                throw new SecurityException("Could not encrypt data: " + e8.getMessage(), e8);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f19188d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f19186b.commit();
            } finally {
                b();
                this.f19187c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z7) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.h());
            allocate.put(z7 ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f7) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.h());
            allocate.putFloat(f7);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i7) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.h());
            allocate.putInt(i7);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j7) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.h());
            allocate.putLong(j7);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.h());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            if (set == null) {
                set = new C1959b();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(c.STRING_SET.h());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f19185a.g(str)) {
                this.f19186b.remove(this.f19185a.d(str));
                this.f19187c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* renamed from: s1.a$c */
    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);


        /* renamed from: o, reason: collision with root package name */
        public final int f19196o;

        c(int i7) {
            this.f19196o = i7;
        }

        public static c e(int i7) {
            if (i7 == 0) {
                return STRING;
            }
            if (i7 == 1) {
                return STRING_SET;
            }
            if (i7 == 2) {
                return INT;
            }
            if (i7 == 3) {
                return LONG;
            }
            if (i7 == 4) {
                return FLOAT;
            }
            if (i7 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int h() {
            return this.f19196o;
        }
    }

    /* renamed from: s1.a$d */
    public enum d {
        AES256_SIV("AES256_SIV");


        /* renamed from: o, reason: collision with root package name */
        public final String f19199o;

        d(String str) {
            this.f19199o = str;
        }

        public C0834l e() {
            return AbstractC0835m.a(this.f19199o);
        }
    }

    /* renamed from: s1.a$e */
    public enum e {
        AES256_GCM("AES256_GCM");


        /* renamed from: o, reason: collision with root package name */
        public final String f19202o;

        e(String str) {
            this.f19202o = str;
        }

        public C0834l e() {
            return AbstractC0835m.a(this.f19202o);
        }
    }

    public SharedPreferencesC1936a(String str, String str2, SharedPreferences sharedPreferences, InterfaceC0823a interfaceC0823a, InterfaceC0827e interfaceC0827e) {
        this.f19180c = str;
        this.f19178a = sharedPreferences;
        this.f19181d = str2;
        this.f19182e = interfaceC0823a;
        this.f19183f = interfaceC0827e;
    }

    public static SharedPreferences a(Context context, String str, C1938c c1938c, d dVar, e eVar) {
        return b(str, c1938c.a(), context, dVar, eVar);
    }

    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) {
        AbstractC1354b.a();
        AbstractC1215a.b();
        Context applicationContext = context.getApplicationContext();
        C0836n d7 = new C1371a.b().l(dVar.e()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m("android-keystore://" + str2).f().d();
        C0836n d8 = new C1371a.b().l(eVar.e()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m("android-keystore://" + str2).f().d();
        return new SharedPreferencesC1936a(str, str2, applicationContext.getSharedPreferences(str, 0), (InterfaceC0823a) d8.k(InterfaceC0823a.class), (InterfaceC0827e) d7.k(InterfaceC0827e.class));
    }

    public String c(String str) {
        try {
            String str2 = new String(this.f19183f.b(AbstractC1889e.a(str, 0), this.f19180c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e7) {
            throw new SecurityException("Could not decrypt key. " + e7.getMessage(), e7);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.f19178a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    public String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return AbstractC1889e.d(this.f19183f.a(str.getBytes(StandardCharsets.UTF_8), this.f19180c.getBytes()));
        } catch (GeneralSecurityException e7) {
            throw new SecurityException("Could not encrypt key. " + e7.getMessage(), e7);
        }
    }

    public Pair e(String str, byte[] bArr) {
        String d7 = d(str);
        return new Pair(d7, AbstractC1889e.d(this.f19182e.a(bArr, d7.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.f19178a.edit());
    }

    public final Object f(String str) {
        if (g(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String d7 = d(str);
            String string = this.f19178a.getString(d7, null);
            if (string == null) {
                return null;
            }
            byte[] a7 = AbstractC1889e.a(string, 0);
            InterfaceC0823a interfaceC0823a = this.f19182e;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer wrap = ByteBuffer.wrap(interfaceC0823a.b(a7, d7.getBytes(charset)));
            wrap.position(0);
            int i7 = wrap.getInt();
            c e7 = c.e(i7);
            if (e7 == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i7);
            }
            switch (C0263a.f19184a[e7.ordinal()]) {
                case 1:
                    int i8 = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i8);
                    String charBuffer = charset.decode(slice).toString();
                    if (charBuffer.equals("__NULL__")) {
                        return null;
                    }
                    return charBuffer;
                case 2:
                    return Integer.valueOf(wrap.getInt());
                case 3:
                    return Long.valueOf(wrap.getLong());
                case 4:
                    return Float.valueOf(wrap.getFloat());
                case 5:
                    return Boolean.valueOf(wrap.get() != 0);
                case 6:
                    C1959b c1959b = new C1959b();
                    while (wrap.hasRemaining()) {
                        int i9 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i9);
                        wrap.position(wrap.position() + i9);
                        c1959b.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (c1959b.size() == 1 && "__NULL__".equals(c1959b.s(0))) {
                        return null;
                    }
                    return c1959b;
                default:
                    throw new SecurityException("Unhandled type for encrypted pref value: " + e7);
            }
        } catch (GeneralSecurityException e8) {
            throw new SecurityException("Could not decrypt value. " + e8.getMessage(), e8);
        }
    }

    public boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f19178a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String c7 = c(entry.getKey());
                hashMap.put(c7, f(c7));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z7) {
        Object f7 = f(str);
        return f7 instanceof Boolean ? ((Boolean) f7).booleanValue() : z7;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f7) {
        Object f8 = f(str);
        return f8 instanceof Float ? ((Float) f8).floatValue() : f7;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i7) {
        Object f7 = f(str);
        return f7 instanceof Integer ? ((Integer) f7).intValue() : i7;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j7) {
        Object f7 = f(str);
        return f7 instanceof Long ? ((Long) f7).longValue() : j7;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object f7 = f(str);
        return f7 instanceof String ? (String) f7 : str2;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        Object f7 = f(str);
        Set c1959b = f7 instanceof Set ? (Set) f7 : new C1959b();
        return c1959b.size() > 0 ? c1959b : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f19179b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f19179b.remove(onSharedPreferenceChangeListener);
    }
}
