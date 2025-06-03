.class public abstract Lnb/c;
.super Leb/k0$e;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leb/k0$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Leb/k0$b;)Leb/k0$i;
    .locals 1

    invoke-virtual {p0}, Lnb/c;->g()Leb/k0$e;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/k0$e;->a(Leb/k0$b;)Leb/k0$i;

    move-result-object p1

    return-object p1
.end method

.method public final b()Leb/d;
    .locals 1

    invoke-virtual {p0}, Lnb/c;->g()Leb/k0$e;

    move-result-object v0

    invoke-virtual {v0}, Leb/k0$e;->b()Leb/d;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    invoke-virtual {p0}, Lnb/c;->g()Leb/k0$e;

    move-result-object v0

    invoke-virtual {v0}, Leb/k0$e;->c()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public final d()Leb/h1;
    .locals 1

    invoke-virtual {p0}, Lnb/c;->g()Leb/k0$e;

    move-result-object v0

    invoke-virtual {v0}, Leb/k0$e;->d()Leb/h1;

    move-result-object v0

    return-object v0
.end method

.method public final e()V
    .locals 1

    invoke-virtual {p0}, Lnb/c;->g()Leb/k0$e;

    move-result-object v0

    invoke-virtual {v0}, Leb/k0$e;->e()V

    return-void
.end method

.method public f(Leb/n;Leb/k0$j;)V
    .locals 1

    invoke-virtual {p0}, Lnb/c;->g()Leb/k0$e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Leb/k0$e;->f(Leb/n;Leb/k0$j;)V

    return-void
.end method

.method public abstract g()Leb/k0$e;
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    move-result-object v0

    invoke-virtual {p0}, Lnb/c;->g()Leb/k0$e;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
