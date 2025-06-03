.class public final Lgb/r1$l;
.super Leb/u0$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "l"
.end annotation


# instance fields
.field public final a:Lgb/r1$k;

.field public final b:Leb/u0;

.field public final synthetic c:Lgb/r1;


# direct methods
.method public constructor <init>(Lgb/r1;Lgb/r1$k;Leb/u0;)V
    .locals 0

    iput-object p1, p0, Lgb/r1$l;->c:Lgb/r1;

    invoke-direct {p0}, Leb/u0$d;-><init>()V

    iput-object p2, p0, Lgb/r1$l;->a:Lgb/r1$k;

    const-string p1, "resolver"

    invoke-static {p3, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Lgb/r1$l;->b:Leb/u0;

    return-void
.end method


# virtual methods
.method public final a(Leb/e1;)V
    .locals 2

    invoke-virtual {p1}, Leb/e1;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "the error status must not be OK"

    invoke-static {v1, v0}, Lx6/b;->s(Ljava/lang/String;Z)V

    iget-object v0, p0, Lgb/r1$l;->c:Lgb/r1;

    iget-object v0, v0, Lgb/r1;->n:Leb/h1;

    new-instance v1, Lgb/r1$l$a;

    invoke-direct {v1, p0, p1}, Lgb/r1$l$a;-><init>(Lgb/r1$l;Leb/e1;)V

    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Leb/u0$e;)V
    .locals 2

    iget-object v0, p0, Lgb/r1$l;->c:Lgb/r1;

    iget-object v0, v0, Lgb/r1;->n:Leb/h1;

    new-instance v1, Lgb/r1$l$b;

    invoke-direct {v1, p0, p1}, Lgb/r1$l$b;-><init>(Lgb/r1$l;Leb/u0$e;)V

    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
