package jc;

/* loaded from: classes.dex */
public interface e<R> extends b<R>, rb.a<R> {
    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // jc.b
    boolean isSuspend();
}
