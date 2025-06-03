.class public interface abstract Lub/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lub/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lub/h$b$a;
    }
.end annotation


# virtual methods
.method public abstract fold(Ljava/lang/Object;Ldc/p;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Ldc/p<",
            "-TR;-",
            "Lub/h$b;",
            "+TR;>;)TR;"
        }
    .end annotation
.end method

.method public abstract get(Lub/h$c;)Lub/h$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lub/h$b;",
            ">(",
            "Lub/h$c<",
            "TE;>;)TE;"
        }
    .end annotation
.end method

.method public abstract getKey()Lub/h$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lub/h$c<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract minusKey(Lub/h$c;)Lub/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/h$c<",
            "*>;)",
            "Lub/h;"
        }
    .end annotation
.end method
