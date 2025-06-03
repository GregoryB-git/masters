.class public interface abstract Lnc/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/h$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnc/j1$a;,
        Lnc/j1$b;
    }
.end annotation


# static fields
.field public static final synthetic k:I


# virtual methods
.method public abstract attachChild(Lnc/q;)Lnc/o;
.end method

.method public abstract synthetic cancel()V
.end method

.method public abstract cancel(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract synthetic cancel(Ljava/lang/Throwable;)Z
.end method

.method public abstract getCancellationException()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract getChildren()Lkc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkc/b<",
            "Lnc/j1;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getOnJoin()Luc/a;
.end method

.method public abstract getParent()Lnc/j1;
.end method

.method public abstract invokeOnCompletion(Ldc/l;)Lnc/t0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lrb/h;",
            ">;)",
            "Lnc/t0;"
        }
    .end annotation
.end method

.method public abstract invokeOnCompletion(ZZLdc/l;)Lnc/t0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ldc/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lrb/h;",
            ">;)",
            "Lnc/t0;"
        }
    .end annotation
.end method

.method public abstract isActive()Z
.end method

.method public abstract isCancelled()Z
.end method

.method public abstract isCompleted()Z
.end method

.method public abstract join(Lub/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract plus(Lnc/j1;)Lnc/j1;
.end method

.method public abstract start()Z
.end method
