.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-installations"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LB3/e;)Ls4/i;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(LB3/e;)Ls4/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(LB3/e;)Ls4/i;
    .locals 6

    .line 1
    new-instance v0, Ls4/h;

    .line 2
    .line 3
    const-class v1, Ls3/e;

    .line 4
    .line 5
    invoke-interface {p0, v1}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ls3/e;

    .line 10
    .line 11
    const-class v2, Lo4/i;

    .line 12
    .line 13
    invoke-interface {p0, v2}, LB3/e;->g(Ljava/lang/Class;)Lr4/b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-class v3, Ly3/a;

    .line 18
    .line 19
    const-class v4, Ljava/util/concurrent/ExecutorService;

    .line 20
    .line 21
    invoke-static {v3, v4}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {p0, v3}, LB3/e;->h(LB3/F;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/util/concurrent/ExecutorService;

    .line 30
    .line 31
    const-class v4, Ly3/b;

    .line 32
    .line 33
    const-class v5, Ljava/util/concurrent/Executor;

    .line 34
    .line 35
    invoke-static {v4, v5}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {p0, v4}, LB3/e;->h(LB3/F;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    invoke-static {p0}, LC3/z;->b(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, v1, v2, v3, p0}, Ls4/h;-><init>(Ls3/e;Lr4/b;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LB3/c;",
            ">;"
        }
    .end annotation

    const-class v0, Ls4/i;

    invoke-static {v0}, LB3/c;->e(Ljava/lang/Class;)LB3/c$b;

    move-result-object v0

    const-string v1, "fire-installations"

    invoke-virtual {v0, v1}, LB3/c$b;->h(Ljava/lang/String;)LB3/c$b;

    move-result-object v0

    const-class v2, Ls3/e;

    invoke-static {v2}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v2

    invoke-virtual {v0, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    const-class v2, Lo4/i;

    invoke-static {v2}, LB3/r;->i(Ljava/lang/Class;)LB3/r;

    move-result-object v2

    invoke-virtual {v0, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    const-class v2, Ly3/a;

    const-class v3, Ljava/util/concurrent/ExecutorService;

    invoke-static {v2, v3}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v2

    invoke-static {v2}, LB3/r;->j(LB3/F;)LB3/r;

    move-result-object v2

    invoke-virtual {v0, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    const-class v2, Ly3/b;

    const-class v3, Ljava/util/concurrent/Executor;

    invoke-static {v2, v3}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v2

    invoke-static {v2}, LB3/r;->j(LB3/F;)LB3/r;

    move-result-object v2

    invoke-virtual {v0, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    new-instance v2, Ls4/k;

    invoke-direct {v2}, Ls4/k;-><init>()V

    invoke-virtual {v0, v2}, LB3/c$b;->f(LB3/h;)LB3/c$b;

    move-result-object v0

    invoke-virtual {v0}, LB3/c$b;->d()LB3/c;

    move-result-object v0

    invoke-static {}, Lo4/h;->a()LB3/c;

    move-result-object v2

    const-string v3, "17.2.0"

    invoke-static {v1, v3}, LO4/h;->b(Ljava/lang/String;Ljava/lang/String;)LB3/c;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [LB3/c;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
