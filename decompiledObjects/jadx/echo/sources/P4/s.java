package P4;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final long f4271a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4272b;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public long f4273a = 60;

        /* renamed from: b, reason: collision with root package name */
        public long f4274b = com.google.firebase.remoteconfig.internal.c.f11905j;

        public s c() {
            return new s(this);
        }

        public b d(long j7) {
            if (j7 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j7)));
            }
            this.f4273a = j7;
            return this;
        }

        public b e(long j7) {
            if (j7 >= 0) {
                this.f4274b = j7;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j7 + " is an invalid argument");
        }
    }

    public s(b bVar) {
        this.f4271a = bVar.f4273a;
        this.f4272b = bVar.f4274b;
    }

    public long a() {
        return this.f4271a;
    }

    public long b() {
        return this.f4272b;
    }
}
