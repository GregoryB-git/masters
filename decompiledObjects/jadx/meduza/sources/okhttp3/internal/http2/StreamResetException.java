package okhttp3.internal.http2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class StreamResetException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorCode f12645a;

    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        this.f12645a = errorCode;
    }
}
