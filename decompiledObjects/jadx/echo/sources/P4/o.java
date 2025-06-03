package P4;

import s3.AbstractC1954l;

/* loaded from: classes.dex */
public class o extends AbstractC1954l {

    /* renamed from: o, reason: collision with root package name */
    public final a f4261o;

    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);


        /* renamed from: o, reason: collision with root package name */
        public final int f4268o;

        a(int i7) {
            this.f4268o = i7;
        }
    }

    public o(String str) {
        super(str);
        this.f4261o = a.UNKNOWN;
    }

    public o(String str, a aVar) {
        super(str);
        this.f4261o = aVar;
    }

    public o(String str, Throwable th) {
        super(str, th);
        this.f4261o = a.UNKNOWN;
    }

    public o(String str, Throwable th, a aVar) {
        super(str, th);
        this.f4261o = aVar;
    }
}
