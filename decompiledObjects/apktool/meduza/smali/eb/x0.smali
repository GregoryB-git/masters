.class public abstract Leb/x0;
.super Leb/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Leb/e<",
        "TReqT;TRespT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leb/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Leb/x0;->f()Leb/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Leb/e;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public b()V
    .locals 1

    invoke-virtual {p0}, Leb/x0;->f()Leb/e;

    move-result-object v0

    invoke-virtual {v0}, Leb/e;->b()V

    return-void
.end method

.method public final c(I)V
    .locals 1

    invoke-virtual {p0}, Leb/x0;->f()Leb/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/e;->c(I)V

    return-void
.end method

.method public abstract f()Leb/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Leb/e<",
            "**>;"
        }
    .end annotation
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    move-result-object v0

    invoke-virtual {p0}, Leb/x0;->f()Leb/e;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
