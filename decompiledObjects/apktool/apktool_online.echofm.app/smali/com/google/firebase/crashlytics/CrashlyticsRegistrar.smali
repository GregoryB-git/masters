.class public Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LS4/a;->a:LS4/a;

    sget-object v1, LS4/b$a;->o:LS4/b$a;

    invoke-virtual {v0, v1}, LS4/a;->a(LS4/b$a;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;LB3/e;)LD3/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b(LB3/e;)LD3/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final b(LB3/e;)LD3/g;
    .locals 5

    .line 1
    const-class v0, Ls3/e;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ls3/e;

    .line 8
    .line 9
    const-class v1, LE3/a;

    .line 10
    .line 11
    invoke-interface {p1, v1}, LB3/e;->i(Ljava/lang/Class;)Lr4/a;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-class v2, Lw3/a;

    .line 16
    .line 17
    invoke-interface {p1, v2}, LB3/e;->i(Ljava/lang/Class;)Lr4/a;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-class v3, Ls4/i;

    .line 22
    .line 23
    invoke-interface {p1, v3}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ls4/i;

    .line 28
    .line 29
    const-class v4, LR4/l;

    .line 30
    .line 31
    invoke-interface {p1, v4}, LB3/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, LR4/l;

    .line 36
    .line 37
    invoke-static {v0, v3, p1, v1, v2}, LD3/g;->e(Ls3/e;Ls4/i;LR4/l;Lr4/a;Lr4/a;)LD3/g;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method

.method public getComponents()Ljava/util/List;
    .locals 4

    const-class v0, LD3/g;

    invoke-static {v0}, LB3/c;->e(Ljava/lang/Class;)LB3/c$b;

    move-result-object v0

    const-string v1, "fire-cls"

    invoke-virtual {v0, v1}, LB3/c$b;->h(Ljava/lang/String;)LB3/c$b;

    move-result-object v0

    const-class v2, Ls3/e;

    invoke-static {v2}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v2

    invoke-virtual {v0, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    const-class v2, Ls4/i;

    invoke-static {v2}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v2

    invoke-virtual {v0, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    const-class v2, LR4/l;

    invoke-static {v2}, LB3/r;->k(Ljava/lang/Class;)LB3/r;

    move-result-object v2

    invoke-virtual {v0, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    const-class v2, LE3/a;

    invoke-static {v2}, LB3/r;->a(Ljava/lang/Class;)LB3/r;

    move-result-object v2

    invoke-virtual {v0, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    const-class v2, Lw3/a;

    invoke-static {v2}, LB3/r;->a(Ljava/lang/Class;)LB3/r;

    move-result-object v2

    invoke-virtual {v0, v2}, LB3/c$b;->b(LB3/r;)LB3/c$b;

    move-result-object v0

    new-instance v2, LD3/f;

    invoke-direct {v2, p0}, LD3/f;-><init>(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;)V

    invoke-virtual {v0, v2}, LB3/c$b;->f(LB3/h;)LB3/c$b;

    move-result-object v0

    invoke-virtual {v0}, LB3/c$b;->e()LB3/c$b;

    move-result-object v0

    invoke-virtual {v0}, LB3/c$b;->d()LB3/c;

    move-result-object v0

    const-string v2, "18.5.1"

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
