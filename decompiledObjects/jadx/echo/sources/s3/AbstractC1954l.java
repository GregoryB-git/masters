package s3;

import A2.AbstractC0328n;

/* renamed from: s3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1954l extends Exception {
    public AbstractC1954l() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1954l(String str) {
        super(str);
        AbstractC0328n.f(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1954l(String str, Throwable th) {
        super(str, th);
        AbstractC0328n.f(str, "Detail message must not be empty");
    }
}
