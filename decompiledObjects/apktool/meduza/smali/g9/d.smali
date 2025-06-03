.class public final Lg9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld9/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ld9/l<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ld9/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld9/l<",
            "TT;>;"
        }
    .end annotation
.end field

.field public volatile c:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ld9/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ld9/l<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg9/d;->c:Z

    iput-object p1, p0, Lg9/d;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lg9/d;->b:Ld9/l;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/firebase/firestore/f;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lg9/d;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lt0/d;

    const/4 v2, 0x5

    invoke-direct {v1, p0, p1, p2, v2}, Lt0/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
