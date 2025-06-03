.class public abstract Leb/v;
.super Leb/o0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Leb/o0<",
        "TT;>;>",
        "Leb/o0<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leb/o0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Leb/n0;
    .locals 1

    invoke-virtual {p0}, Leb/v;->d()Leb/o0;

    move-result-object v0

    invoke-virtual {v0}, Leb/o0;->a()Leb/n0;

    move-result-object v0

    return-object v0
.end method

.method public abstract d()Leb/o0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Leb/o0<",
            "*>;"
        }
    .end annotation
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    move-result-object v0

    invoke-virtual {p0}, Leb/v;->d()Leb/o0;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
