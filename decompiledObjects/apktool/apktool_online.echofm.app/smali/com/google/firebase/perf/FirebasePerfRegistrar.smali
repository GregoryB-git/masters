.class public Lcom/google/firebase/perf/FirebasePerfRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final EARLY_LIBRARY_NAME:Ljava/lang/String; = "fire-perf-early"

.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-perf"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LS4/a;->a:LS4/a;

    sget-object v1, LS4/b$a;->p:LS4/b$a;

    invoke-virtual {v0, v1}, LS4/a;->a(LS4/b$a;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LB3/e;)LA4/e;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->providesFirebasePerformance(LB3/e;)LA4/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(LB3/F;LB3/e;)LA4/b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->lambda$getComponents$0(LB3/F;LB3/e;)LA4/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(LB3/F;LB3/e;)LA4/b;
    .locals 4

    .line 1
    new-instance v0, LA4/b;

    .line 2
    .line 3
    const-class v1, Ls3/e;

    .line 4
    .line 5
    invoke-interface {p1, v1}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ls3/e;

    .line 10
    .line 11
    const-class v2, LR4/l;

    .line 12
    .line 13
    invoke-interface {p1, v2}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, LR4/l;

    .line 18
    .line 19
    const-class v3, Ls3/n;

    .line 20
    .line 21
    invoke-interface {p1, v3}, LB3/e;->g(Ljava/lang/Class;)Lr4/b;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, Lr4/b;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ls3/n;

    .line 30
    .line 31
    invoke-interface {p1, p0}, LB3/e;->h(LB3/F;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/util/concurrent/Executor;

    .line 36
    .line 37
    invoke-direct {v0, v1, v2, v3, p0}, LA4/b;-><init>(Ls3/e;LR4/l;Ls3/n;Ljava/util/concurrent/Executor;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method private static providesFirebasePerformance(LB3/e;)LA4/e;
    .locals 6

    .line 1
    const-class v0, LA4/b;

    .line 2
    .line 3
    invoke-interface {p0, v0}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {}, LD4/a;->b()LD4/a$b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, LE4/a;

    .line 11
    .line 12
    const-class v2, Ls3/e;

    .line 13
    .line 14
    invoke-interface {p0, v2}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ls3/e;

    .line 19
    .line 20
    const-class v3, Ls4/i;

    .line 21
    .line 22
    invoke-interface {p0, v3}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ls4/i;

    .line 27
    .line 28
    const-class v4, LP4/x;

    .line 29
    .line 30
    invoke-interface {p0, v4}, LB3/e;->g(Ljava/lang/Class;)Lr4/b;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    const-class v5, Lc2/g;

    .line 35
    .line 36
    invoke-interface {p0, v5}, LB3/e;->g(Ljava/lang/Class;)Lr4/b;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-direct {v1, v2, v3, v4, p0}, LE4/a;-><init>(Ls3/e;Ls4/i;Lr4/b;Lr4/b;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, LD4/a$b;->b(LE4/a;)LD4/a$b;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, LD4/a$b;->a()LD4/b;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-interface {p0}, LD4/b;->a()LA4/e;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LB3/c;",
            ">;"
        }
    .end annotation

    const-class v0, Ly3/d;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, LB3/F;->a(Ljava/lang/Class;Ljava/lang/Class;)LB3/F;

    move-result-object v0

    const-class v1, LA4/e;

    invoke-static {v1}, LB3/c;->e(Ljava/lang/Class;)LB3/c$b;

    move-result-object v1

    const-string v2, "fire-perf"

    invoke-virtual {v1, v2}, LB3/c$b;->h(Ljava/lang/String;)LB3/c$b;

    move-result-object v1

    const-class v3, Ls3/e;

    invoke-static {v3}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v4

    invoke-virtual {v1, v4}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    const-class v4, LP4/x;

    invoke-static {v4}, LB3/r;->m(Ljava/lang/Class;)LB3/r;

    move-result-object v4

    invoke-virtual {v1, v4}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    const-class v4, Ls4/i;

    invoke-static {v4}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v4

    invoke-virtual {v1, v4}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    const-class v4, Lc2/g;

    invoke-static {v4}, LB3/r;->m(Ljava/lang/Class;)LB3/r;

    move-result-object v4

    invoke-virtual {v1, v4}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    const-class v4, LA4/b;

    invoke-static {v4}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v5

    invoke-virtual {v1, v5}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    new-instance v5, LA4/c;

    invoke-direct {v5}, LA4/c;-><init>()V

    invoke-virtual {v1, v5}, LB3/c$b;->f(LB3/h;)LB3/c$b;

    move-result-object v1

    invoke-virtual {v1}, LB3/c$b;->d()LB3/c;

    move-result-object v1

    invoke-static {v4}, LB3/c;->e(Ljava/lang/Class;)LB3/c$b;

    move-result-object v4

    const-string v5, "fire-perf-early"

    invoke-virtual {v4, v5}, LB3/c$b;->h(Ljava/lang/String;)LB3/c$b;

    move-result-object v4

    invoke-static {v3}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v3

    invoke-virtual {v4, v3}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v3

    const-class v4, LR4/l;

    invoke-static {v4}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v4

    invoke-virtual {v3, v4}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v3

    const-class v4, Ls3/n;

    invoke-static {v4}, LB3/r;->i(Ljava/lang/Class;)LB3/r;

    move-result-object v4

    invoke-virtual {v3, v4}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v3

    invoke-static {v0}, LB3/r;->j(LB3/F;)LB3/r;

    move-result-object v4

    invoke-virtual {v3, v4}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v3

    invoke-virtual {v3}, LB3/c$b;->e()LB3/c$b;

    move-result-object v3

    new-instance v4, LA4/d;

    invoke-direct {v4, v0}, LA4/d;-><init>(LB3/F;)V

    invoke-virtual {v3, v4}, LB3/c$b;->f(LB3/h;)LB3/c$b;

    move-result-object v0

    invoke-virtual {v0}, LB3/c$b;->d()LB3/c;

    move-result-object v0

    const-string v3, "20.5.0"

    invoke-static {v2, v3}, LO4/h;->b(Ljava/lang/String;Ljava/lang/String;)LB3/c;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [LB3/c;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
