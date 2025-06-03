.class public Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-rc"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LB3/F;LB3/e;)LP4/x;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->lambda$getComponents$0(LB3/F;LB3/e;)LP4/x;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(LB3/F;LB3/e;)LP4/x;
    .locals 8

    .line 1
    new-instance v7, LP4/x;

    .line 2
    .line 3
    const-class v0, Landroid/content/Context;

    .line 4
    .line 5
    invoke-interface {p1, v0}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Landroid/content/Context;

    .line 11
    .line 12
    invoke-interface {p1, p0}, LB3/e;->h(LB3/F;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    move-object v2, p0

    .line 17
    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 18
    .line 19
    const-class p0, Ls3/e;

    .line 20
    .line 21
    invoke-interface {p1, p0}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    move-object v3, p0

    .line 26
    check-cast v3, Ls3/e;

    .line 27
    .line 28
    const-class p0, Ls4/i;

    .line 29
    .line 30
    invoke-interface {p1, p0}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    move-object v4, p0

    .line 35
    check-cast v4, Ls4/i;

    .line 36
    .line 37
    const-class p0, Lu3/a;

    .line 38
    .line 39
    invoke-interface {p1, p0}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lu3/a;

    .line 44
    .line 45
    const-string v0, "frc"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lu3/a;->b(Ljava/lang/String;)Lt3/c;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    const-class p0, Lw3/a;

    .line 52
    .line 53
    invoke-interface {p1, p0}, LB3/e;->g(Ljava/lang/Class;)Lr4/b;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    move-object v0, v7

    .line 58
    invoke-direct/range {v0 .. v6}, LP4/x;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Ls3/e;Ls4/i;Lt3/c;Lr4/b;)V

    .line 59
    .line 60
    .line 61
    return-object v7
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LB3/c;",
            ">;"
        }
    .end annotation

    const-class v0, Ly3/b;

    const-class v1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v0

    const-class v1, LP4/x;

    invoke-static {v1}, LB3/c;->e(Ljava/lang/Class;)LB3/c$b;

    move-result-object v1

    const-string v2, "fire-rc"

    invoke-virtual {v1, v2}, LB3/c$b;->h(Ljava/lang/String;)LB3/c$b;

    move-result-object v1

    const-class v3, Landroid/content/Context;

    invoke-static {v3}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v3

    invoke-virtual {v1, v3}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    invoke-static {v0}, LB3/r;->j(LB3/F;)LB3/r;

    move-result-object v3

    invoke-virtual {v1, v3}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    const-class v3, Ls3/e;

    invoke-static {v3}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v3

    invoke-virtual {v1, v3}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    const-class v3, Ls4/i;

    invoke-static {v3}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v3

    invoke-virtual {v1, v3}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    const-class v3, Lu3/a;

    invoke-static {v3}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v3

    invoke-virtual {v1, v3}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    const-class v3, Lw3/a;

    invoke-static {v3}, LB3/r;->i(Ljava/lang/Class;)LB3/r;

    move-result-object v3

    invoke-virtual {v1, v3}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    new-instance v3, LP4/y;

    invoke-direct {v3, v0}, LP4/y;-><init>(LB3/F;)V

    invoke-virtual {v1, v3}, LB3/c$b;->f(LB3/h;)LB3/c$b;

    move-result-object v0

    invoke-virtual {v0}, LB3/c$b;->e()LB3/c$b;

    move-result-object v0

    invoke-virtual {v0}, LB3/c$b;->d()LB3/c;

    move-result-object v0

    const-string v1, "21.5.0"

    invoke-static {v2, v1}, LO4/h;->b(Ljava/lang/String;Ljava/lang/String;)LB3/c;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [LB3/c;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
