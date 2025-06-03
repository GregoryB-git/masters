package nc;

/* loaded from: classes.dex */
public interface j0<T> extends j1 {
    Object await(ub.e<? super T> eVar);

    T getCompleted();

    Throwable getCompletionExceptionOrNull();

    uc.c<T> getOnAwait();
}
