.class public final Lnc/o1$a;
.super Lnc/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnc/o1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lnc/l<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final q:Lnc/o1;


# direct methods
.method public constructor <init>(Lub/e;Lnc/o1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-TT;>;",
            "Lnc/o1;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lnc/l;-><init>(ILub/e;)V

    iput-object p2, p0, Lnc/o1$a;->q:Lnc/o1;

    return-void
.end method


# virtual methods
.method public final r(Lnc/o1;)Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, Lnc/o1$a;->q:Lnc/o1;

    invoke-virtual {v0}, Lnc/o1;->F()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lnc/o1$c;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lnc/o1$c;

    invoke-virtual {v1}, Lnc/o1$c;->c()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    instance-of v1, v0, Lnc/u;

    if-eqz v1, :cond_1

    check-cast v0, Lnc/u;

    iget-object p1, v0, Lnc/u;->a:Ljava/lang/Throwable;

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lnc/o1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    const-string v0, "AwaitContinuation"

    return-object v0
.end method
