.class public final Lnc/f;
.super Lnc/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lnc/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final d:Ljava/lang/Thread;

.field public final e:Lnc/x0;


# direct methods
.method public constructor <init>(Lub/h;Ljava/lang/Thread;Lnc/x0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lnc/a;-><init>(Lub/h;Z)V

    iput-object p2, p0, Lnc/f;->d:Ljava/lang/Thread;

    iput-object p3, p0, Lnc/f;->e:Lnc/x0;

    return-void
.end method


# virtual methods
.method public final p(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v0, p0, Lnc/f;->d:Ljava/lang/Thread;

    invoke-static {p1, v0}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lnc/f;->d:Ljava/lang/Thread;

    invoke-static {p1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
