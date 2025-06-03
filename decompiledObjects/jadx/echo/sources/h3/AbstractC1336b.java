package h3;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1336b {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f14582a = Logger.getLogger(AbstractC1336b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f14583b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: h3.b$b, reason: collision with other inner class name */
    public static abstract class EnumC0213b {

        /* renamed from: o, reason: collision with root package name */
        public static final EnumC0213b f14584o;

        /* renamed from: p, reason: collision with root package name */
        public static final EnumC0213b f14585p;

        /* renamed from: q, reason: collision with root package name */
        public static final /* synthetic */ EnumC0213b[] f14586q;

        /* renamed from: h3.b$b$a */
        public enum a extends EnumC0213b {
            public a(String str, int i7) {
                super(str, i7);
            }

            @Override // h3.AbstractC1336b.EnumC0213b
            public boolean c() {
                return !AbstractC1336b.c();
            }
        }

        /* renamed from: h3.b$b$b, reason: collision with other inner class name */
        public enum C0214b extends EnumC0213b {
            public C0214b(String str, int i7) {
                super(str, i7);
            }

            @Override // h3.AbstractC1336b.EnumC0213b
            public boolean c() {
                return !AbstractC1336b.c() || AbstractC1336b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f14584o = aVar;
            C0214b c0214b = new C0214b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f14585p = c0214b;
            f14586q = new EnumC0213b[]{aVar, c0214b};
        }

        public EnumC0213b(String str, int i7) {
        }

        public static EnumC0213b valueOf(String str) {
            return (EnumC0213b) Enum.valueOf(EnumC0213b.class, str);
        }

        public static EnumC0213b[] values() {
            return (EnumC0213b[]) f14586q.clone();
        }

        public abstract boolean c();
    }

    public static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f14582a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return AbstractC1335a.a() || f14583b.get();
    }
}
