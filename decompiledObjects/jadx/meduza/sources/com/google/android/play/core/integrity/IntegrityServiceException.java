package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes.dex */
public class IntegrityServiceException extends k6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f2912a;

    public IntegrityServiceException(int i10, Throwable th) {
        super(new Status(i10, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i10), com.google.android.play.core.integrity.model.a.a(i10)), null, null));
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f2912a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f2912a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
