.class public abstract Lnb/b;
.super Leb/k0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leb/k0;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    invoke-virtual {p0}, Lnb/b;->g()Leb/k0;

    move-result-object v0

    invoke-virtual {v0}, Leb/k0;->b()Z

    move-result v0

    return v0
.end method

.method public final c(Leb/e1;)V
    .locals 1

    invoke-virtual {p0}, Lnb/b;->g()Leb/k0;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/k0;->c(Leb/e1;)V

    return-void
.end method

.method public final d(Leb/k0$h;)V
    .locals 1

    invoke-virtual {p0}, Lnb/b;->g()Leb/k0;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/k0;->d(Leb/k0$h;)V

    return-void
.end method

.method public final e()V
    .locals 1

    invoke-virtual {p0}, Lnb/b;->g()Leb/k0;

    move-result-object v0

    invoke-virtual {v0}, Leb/k0;->e()V

    return-void
.end method

.method public abstract g()Leb/k0;
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    move-result-object v0

    invoke-virtual {p0}, Lnb/b;->g()Leb/k0;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
