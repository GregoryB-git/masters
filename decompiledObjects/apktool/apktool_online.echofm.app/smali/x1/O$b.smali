.class public final Lx1/O$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/O;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx1/O$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    sget-object v0, Lx1/a;->z:Lx1/a$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/a$c;->e()Lx1/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {v0}, Lx1/a$c;->g()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Lx1/O$b;->c(Lx1/O;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    sget-object v0, LO1/P;->a:LO1/P;

    .line 22
    .line 23
    invoke-virtual {v1}, Lx1/a;->l()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Lx1/O$b$a;

    .line 28
    .line 29
    invoke-direct {v1}, Lx1/O$b$a;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, LO1/P;->G(Ljava/lang/String;LO1/P$a;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final b()Lx1/O;
    .locals 1

    .line 1
    sget-object v0, Lx1/Q;->d:Lx1/Q$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/Q$a;->a()Lx1/Q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lx1/Q;->c()Lx1/O;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final c(Lx1/O;)V
    .locals 1

    .line 1
    sget-object v0, Lx1/Q;->d:Lx1/Q$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/Q$a;->a()Lx1/Q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lx1/Q;->f(Lx1/O;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
