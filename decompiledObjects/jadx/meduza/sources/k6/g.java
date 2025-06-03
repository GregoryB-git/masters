package k6;

import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;
import k6.j;

/* loaded from: classes.dex */
public abstract class g<R extends j> {

    public interface a {
        void a(Status status);
    }

    public void addStatusListener(a aVar) {
        throw new UnsupportedOperationException();
    }

    @ResultIgnorabilityUnspecified
    public abstract R await();

    @ResultIgnorabilityUnspecified
    public abstract R await(long j10, TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(k<? super R> kVar);

    public abstract void setResultCallback(k<? super R> kVar, long j10, TimeUnit timeUnit);

    public <S extends j> m<S> then(l<? super R, ? extends S> lVar) {
        throw new UnsupportedOperationException();
    }
}
