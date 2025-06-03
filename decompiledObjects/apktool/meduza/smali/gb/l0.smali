.class public final Lgb/l0;
.super Lgb/l2;
.source "SourceFile"


# instance fields
.field public b:Z

.field public final c:Leb/e1;

.field public final d:Lgb/t$a;

.field public final e:[Leb/h;


# direct methods
.method public constructor <init>(Leb/e1;Lgb/t$a;[Leb/h;)V
    .locals 2

    invoke-direct {p0}, Lgb/l2;-><init>()V

    invoke-virtual {p1}, Leb/e1;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "error must not be OK"

    invoke-static {v1, v0}, Lx6/b;->s(Ljava/lang/String;Z)V

    iput-object p1, p0, Lgb/l0;->c:Leb/e1;

    iput-object p2, p0, Lgb/l0;->d:Lgb/t$a;

    iput-object p3, p0, Lgb/l0;->e:[Leb/h;

    return-void
.end method

.method public constructor <init>(Leb/e1;[Leb/h;)V
    .locals 1

    sget-object v0, Lgb/t$a;->a:Lgb/t$a;

    invoke-direct {p0, p1, v0, p2}, Lgb/l0;-><init>(Leb/e1;Lgb/t$a;[Leb/h;)V

    return-void
.end method


# virtual methods
.method public final i(Ld2/q;)V
    .locals 2

    iget-object v0, p0, Lgb/l0;->c:Leb/e1;

    const-string v1, "error"

    invoke-virtual {p1, v0, v1}, Ld2/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lgb/l0;->d:Lgb/t$a;

    const-string v1, "progress"

    invoke-virtual {p1, v0, v1}, Ld2/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final l(Lgb/t;)V
    .locals 5

    iget-boolean v0, p0, Lgb/l0;->b:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "already started"

    invoke-static {v0, v2}, Lx6/b;->I(ZLjava/lang/String;)V

    iput-boolean v1, p0, Lgb/l0;->b:Z

    iget-object v0, p0, Lgb/l0;->e:[Leb/h;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    iget-object v4, p0, Lgb/l0;->c:Leb/e1;

    invoke-virtual {v3, v4}, Lm/e;->o(Leb/e1;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lgb/l0;->c:Leb/e1;

    iget-object v1, p0, Lgb/l0;->d:Lgb/t$a;

    new-instance v2, Leb/s0;

    invoke-direct {v2}, Leb/s0;-><init>()V

    invoke-interface {p1, v0, v1, v2}, Lgb/t;->d(Leb/e1;Lgb/t$a;Leb/s0;)V

    return-void
.end method
