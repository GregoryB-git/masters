.class public final Lgb/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/u;


# instance fields
.field public final a:Leb/e1;

.field public final b:Lgb/t$a;


# direct methods
.method public constructor <init>(Leb/e1;Lgb/t$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Leb/e1;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "error must not be OK"

    invoke-static {v1, v0}, Lx6/b;->s(Ljava/lang/String;Z)V

    iput-object p1, p0, Lgb/m0;->a:Leb/e1;

    iput-object p2, p0, Lgb/m0;->b:Lgb/t$a;

    return-void
.end method


# virtual methods
.method public final d(Leb/t0;Leb/s0;Leb/c;[Leb/h;)Lgb/s;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/t0<",
            "**>;",
            "Leb/s0;",
            "Leb/c;",
            "[",
            "Leb/h;",
            ")",
            "Lgb/s;"
        }
    .end annotation

    new-instance p1, Lgb/l0;

    iget-object p2, p0, Lgb/m0;->a:Leb/e1;

    iget-object p3, p0, Lgb/m0;->b:Lgb/t$a;

    invoke-direct {p1, p2, p3, p4}, Lgb/l0;-><init>(Leb/e1;Lgb/t$a;[Leb/h;)V

    return-object p1
.end method

.method public final f()Leb/f0;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not a real transport"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
