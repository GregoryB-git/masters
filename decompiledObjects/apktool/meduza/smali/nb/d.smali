.class public abstract Lnb/d;
.super Leb/k0$i;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leb/k0$i;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Leb/u;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lnb/d;->j()Leb/k0$i;

    move-result-object v0

    invoke-virtual {v0}, Leb/k0$i;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final d()Leb/d;
    .locals 1

    invoke-virtual {p0}, Lnb/d;->j()Leb/k0$i;

    move-result-object v0

    invoke-virtual {v0}, Leb/k0$i;->d()Leb/d;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnb/d;->j()Leb/k0$i;

    move-result-object v0

    invoke-virtual {v0}, Leb/k0$i;->e()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 1

    invoke-virtual {p0}, Lnb/d;->j()Leb/k0$i;

    move-result-object v0

    invoke-virtual {v0}, Leb/k0$i;->f()V

    return-void
.end method

.method public g()V
    .locals 1

    invoke-virtual {p0}, Lnb/d;->j()Leb/k0$i;

    move-result-object v0

    invoke-virtual {v0}, Leb/k0$i;->g()V

    return-void
.end method

.method public i(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Leb/u;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lnb/d;->j()Leb/k0$i;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/k0$i;->i(Ljava/util/List;)V

    return-void
.end method

.method public abstract j()Leb/k0$i;
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    move-result-object v0

    invoke-virtual {p0}, Lnb/d;->j()Leb/k0$i;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
