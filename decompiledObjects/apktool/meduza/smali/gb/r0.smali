.class public abstract Lgb/r0;
.super Leb/n0;
.source "SourceFile"


# instance fields
.field public final b:Leb/n0;


# direct methods
.method public constructor <init>(Lgb/r1;)V
    .locals 0

    invoke-direct {p0}, Leb/n0;-><init>()V

    iput-object p1, p0, Lgb/r0;->b:Leb/n0;

    return-void
.end method


# virtual methods
.method public final C(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1

    iget-object v0, p0, Lgb/r0;->b:Leb/n0;

    invoke-virtual {v0, p1, p2, p3}, Leb/n0;->C(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    return p1
.end method

.method public final D()V
    .locals 1

    iget-object v0, p0, Lgb/r0;->b:Leb/n0;

    invoke-virtual {v0}, Leb/n0;->D()V

    return-void
.end method

.method public final E()Leb/n;
    .locals 1

    iget-object v0, p0, Lgb/r0;->b:Leb/n0;

    invoke-virtual {v0}, Leb/n0;->E()Leb/n;

    move-result-object v0

    return-object v0
.end method

.method public final F(Leb/n;Lx0/f;)V
    .locals 1

    iget-object v0, p0, Lgb/r0;->b:Leb/n0;

    invoke-virtual {v0, p1, p2}, Leb/n0;->F(Leb/n;Lx0/f;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgb/r0;->b:Leb/n0;

    invoke-virtual {v0}, Le9/a;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    move-result-object v0

    iget-object v1, p0, Lgb/r0;->b:Leb/n0;

    const-string v2, "delegate"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v(Leb/t0;Leb/c;)Leb/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RequestT:",
            "Ljava/lang/Object;",
            "ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Leb/t0<",
            "TRequestT;TResponseT;>;",
            "Leb/c;",
            ")",
            "Leb/e<",
            "TRequestT;TResponseT;>;"
        }
    .end annotation

    iget-object v0, p0, Lgb/r0;->b:Leb/n0;

    invoke-virtual {v0, p1, p2}, Le9/a;->v(Leb/t0;Leb/c;)Leb/e;

    move-result-object p1

    return-object p1
.end method
