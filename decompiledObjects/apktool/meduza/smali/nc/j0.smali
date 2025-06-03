.class public interface abstract Lnc/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnc/j1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnc/j1;"
    }
.end annotation


# virtual methods
.method public abstract await(Lub/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getCompleted()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract getCompletionExceptionOrNull()Ljava/lang/Throwable;
.end method

.method public abstract getOnAwait()Luc/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Luc/c<",
            "TT;>;"
        }
    .end annotation
.end method
