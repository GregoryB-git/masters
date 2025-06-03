.class public abstract Leb/x;
.super Leb/x0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Leb/x0<",
        "TReqT;TRespT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leb/x0;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TReqT;)V"
        }
    .end annotation

    invoke-virtual {p0}, Leb/x0;->f()Leb/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/e;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public e(Leb/e$a;Leb/s0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/e$a<",
            "TRespT;>;",
            "Leb/s0;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Leb/x0;->f()Leb/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Leb/e;->e(Leb/e$a;Leb/s0;)V

    return-void
.end method
