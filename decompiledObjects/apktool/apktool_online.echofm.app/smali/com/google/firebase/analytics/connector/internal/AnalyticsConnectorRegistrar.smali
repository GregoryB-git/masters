.class public Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$getComponents$0(LB3/e;)Lw3/a;
    .locals 3

    .line 1
    const-class v0, Ls3/e;

    .line 2
    .line 3
    invoke-interface {p0, v0}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ls3/e;

    .line 8
    .line 9
    const-class v1, Landroid/content/Context;

    .line 10
    .line 11
    invoke-interface {p0, v1}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroid/content/Context;

    .line 16
    .line 17
    const-class v2, Ln4/d;

    .line 18
    .line 19
    invoke-interface {p0, v2}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ln4/d;

    .line 24
    .line 25
    invoke-static {v0, v1, p0}, Lw3/b;->h(Ls3/e;Landroid/content/Context;Ln4/d;)Lw3/a;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LB3/c;",
            ">;"
        }
    .end annotation

    const-class v0, Lw3/a;

    invoke-static {v0}, LB3/c;->e(Ljava/lang/Class;)LB3/c$b;

    move-result-object v0

    const-class v1, Ls3/e;

    invoke-static {v1}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v1

    invoke-virtual {v0, v1}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v1

    invoke-virtual {v0, v1}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    const-class v1, Ln4/d;

    invoke-static {v1}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v1

    invoke-virtual {v0, v1}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    sget-object v1, Lx3/b;->a:Lx3/b;

    invoke-virtual {v0, v1}, LB3/c$b;->f(LB3/h;)LB3/c$b;

    move-result-object v0

    invoke-virtual {v0}, LB3/c$b;->e()LB3/c$b;

    move-result-object v0

    invoke-virtual {v0}, LB3/c$b;->d()LB3/c;

    move-result-object v0

    const-string v1, "fire-analytics"

    const-string v2, "21.5.0"

    invoke-static {v1, v2}, LO4/h;->b(Ljava/lang/String;Ljava/lang/String;)LB3/c;

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
