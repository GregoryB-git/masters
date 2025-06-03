.class public final Lcom/google/firebase/iid/Registrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/iid/Registrar$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic lambda$getComponents$0$Registrar(LB3/e;)Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/firebase/iid/FirebaseInstanceId;

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
    const-class v2, LO4/i;

    .line 12
    .line 13
    invoke-interface {p0, v2}, LB3/e;->g(Ljava/lang/Class;)Lr4/b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-class v3, Lo4/j;

    .line 18
    .line 19
    invoke-interface {p0, v3}, LB3/e;->g(Ljava/lang/Class;)Lr4/b;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-class v4, Ls4/i;

    .line 24
    .line 25
    invoke-interface {p0, v4}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ls4/i;

    .line 30
    .line 31
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/firebase/iid/FirebaseInstanceId;-><init>(Ls3/e;Lr4/b;Lr4/b;Ls4/i;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public static final synthetic lambda$getComponents$1$Registrar(LB3/e;)Lq4/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/firebase/iid/Registrar$a;

    .line 2
    .line 3
    const-class v1, Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 4
    .line 5
    invoke-interface {p0, v1}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/google/firebase/iid/Registrar$a;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
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

    const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-static {v0}, LB3/c;->e(Ljava/lang/Class;)LB3/c$b;

    move-result-object v1

    const-class v2, Ls3/e;

    invoke-static {v2}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v2

    invoke-virtual {v1, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    const-class v2, LO4/i;

    invoke-static {v2}, LB3/r;->i(Ljava/lang/Class;)LB3/r;

    move-result-object v2

    invoke-virtual {v1, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    const-class v2, Lo4/j;

    invoke-static {v2}, LB3/r;->i(Ljava/lang/Class;)LB3/r;

    move-result-object v2

    invoke-virtual {v1, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    const-class v2, Ls4/i;

    invoke-static {v2}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v2

    invoke-virtual {v1, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v1

    sget-object v2, Lp4/o;->a:LB3/h;

    invoke-virtual {v1, v2}, LB3/c$b;->f(LB3/h;)LB3/c$b;

    move-result-object v1

    invoke-virtual {v1}, LB3/c$b;->c()LB3/c$b;

    move-result-object v1

    invoke-virtual {v1}, LB3/c$b;->d()LB3/c;

    move-result-object v1

    const-class v2, Lq4/a;

    invoke-static {v2}, LB3/c;->e(Ljava/lang/Class;)LB3/c$b;

    move-result-object v2

    invoke-static {v0}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v0

    invoke-virtual {v2, v0}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    sget-object v2, Lp4/p;->a:LB3/h;

    invoke-virtual {v0, v2}, LB3/c$b;->f(LB3/h;)LB3/c$b;

    move-result-object v0

    invoke-virtual {v0}, LB3/c$b;->d()LB3/c;

    move-result-object v0

    const-string v2, "fire-iid"

    const-string v3, "21.1.0"

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
