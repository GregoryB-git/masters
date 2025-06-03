package s4;

import s3.AbstractC1954l;

/* loaded from: classes.dex */
public class j extends AbstractC1954l {

    /* renamed from: o, reason: collision with root package name */
    public final a f19300o;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public j(String str, a aVar) {
        super(str);
        this.f19300o = aVar;
    }

    public j(a aVar) {
        this.f19300o = aVar;
    }
}
