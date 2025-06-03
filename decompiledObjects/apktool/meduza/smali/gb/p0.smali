.class public abstract Lgb/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/x;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lgb/x;
.end method

.method public c(Leb/e1;)V
    .locals 1

    invoke-virtual {p0}, Lgb/p0;->a()Lgb/x;

    move-result-object v0

    invoke-interface {v0, p1}, Lgb/h2;->c(Leb/e1;)V

    return-void
.end method

.method public final e(Lgb/o1$c$a;)V
    .locals 1

    invoke-virtual {p0}, Lgb/p0;->a()Lgb/x;

    move-result-object v0

    invoke-interface {v0, p1}, Lgb/u;->e(Lgb/o1$c$a;)V

    return-void
.end method

.method public final f()Leb/f0;
    .locals 1

    invoke-virtual {p0}, Lgb/p0;->a()Lgb/x;

    move-result-object v0

    invoke-interface {v0}, Leb/e0;->f()Leb/f0;

    move-result-object v0

    return-object v0
.end method

.method public final g(Lgb/h2$a;)Ljava/lang/Runnable;
    .locals 1

    invoke-virtual {p0}, Lgb/p0;->a()Lgb/x;

    move-result-object v0

    invoke-interface {v0, p1}, Lgb/h2;->g(Lgb/h2$a;)Ljava/lang/Runnable;

    move-result-object p1

    return-object p1
.end method

.method public final getAttributes()Leb/a;
    .locals 1

    invoke-virtual {p0}, Lgb/p0;->a()Lgb/x;

    move-result-object v0

    invoke-interface {v0}, Lgb/x;->getAttributes()Leb/a;

    move-result-object v0

    return-object v0
.end method

.method public h(Leb/e1;)V
    .locals 1

    invoke-virtual {p0}, Lgb/p0;->a()Lgb/x;

    move-result-object v0

    invoke-interface {v0, p1}, Lgb/h2;->h(Leb/e1;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    move-result-object v0

    invoke-virtual {p0}, Lgb/p0;->a()Lgb/x;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
