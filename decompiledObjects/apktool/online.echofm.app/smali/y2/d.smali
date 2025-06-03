.class public abstract Ly2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly2/d$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ly2/a;

.field public final d:Ly2/a$d;

.field public final e:Lz2/b;

.field public final f:Landroid/os/Looper;

.field public final g:I

.field public final h:Ly2/e;

.field public final i:Lz2/l;

.field public final j:Lz2/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/Activity;Ly2/a;Ly2/a$d;Ly2/d$a;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Null context is not permitted."

    invoke-static {p1, v0}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Api must not be null."

    invoke-static {p3, v0}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    invoke-static {p5, v0}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Ly2/d;->a:Landroid/content/Context;

    invoke-static {}, LE2/l;->k()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    const-class v0, Landroid/content/Context;

    const-string v2, "getAttributionTag"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p1

    :catch_0
    :cond_0
    iput-object v1, p0, Ly2/d;->b:Ljava/lang/String;

    iput-object p3, p0, Ly2/d;->c:Ly2/a;

    iput-object p4, p0, Ly2/d;->d:Ly2/a$d;

    iget-object p1, p5, Ly2/d$a;->b:Landroid/os/Looper;

    iput-object p1, p0, Ly2/d;->f:Landroid/os/Looper;

    invoke-static {p3, p4, v1}, Lz2/b;->a(Ly2/a;Ly2/a$d;Ljava/lang/String;)Lz2/b;

    move-result-object p1

    iput-object p1, p0, Ly2/d;->e:Lz2/b;

    new-instance p3, Lz2/C;

    invoke-direct {p3, p0}, Lz2/C;-><init>(Ly2/d;)V

    iput-object p3, p0, Ly2/d;->h:Ly2/e;

    iget-object p3, p0, Ly2/d;->a:Landroid/content/Context;

    invoke-static {p3}, Lz2/e;->x(Landroid/content/Context;)Lz2/e;

    move-result-object p3

    iput-object p3, p0, Ly2/d;->j:Lz2/e;

    invoke-virtual {p3}, Lz2/e;->m()I

    move-result p4

    iput p4, p0, Ly2/d;->g:I

    iget-object p4, p5, Ly2/d$a;->a:Lz2/l;

    iput-object p4, p0, Ly2/d;->i:Lz2/l;

    if-eqz p2, :cond_1

    instance-of p4, p2, Lcom/google/android/gms/common/api/GoogleApiActivity;

    if-nez p4, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    if-ne p4, p5, :cond_1

    invoke-static {p2, p3, p1}, Lz2/p;->u(Landroid/app/Activity;Lz2/e;Lz2/b;)V

    :cond_1
    invoke-virtual {p3, p0}, Lz2/e;->b(Ly2/d;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ly2/a;Ly2/a$d;Ly2/d$a;)V
    .locals 6

    .line 2
    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ly2/d;-><init>(Landroid/content/Context;Landroid/app/Activity;Ly2/a;Ly2/a$d;Ly2/d$a;)V

    return-void
.end method


# virtual methods
.method public b()LA2/d$a;
    .locals 2

    .line 1
    new-instance v0, LA2/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, LA2/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, LA2/d$a;->d(Landroid/accounts/Account;)LA2/d$a;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, LA2/d$a;->c(Ljava/util/Collection;)LA2/d$a;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Ly2/d;->a:Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, LA2/d$a;->e(Ljava/lang/String;)LA2/d$a;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Ly2/d;->a:Landroid/content/Context;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, LA2/d$a;->b(Ljava/lang/String;)LA2/d$a;

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public c(Lz2/m;)LV2/j;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0, p1}, Ly2/d;->i(ILz2/m;)LV2/j;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public final d()Lz2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/d;->e:Lz2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/d;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Ly2/d;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final g(Landroid/os/Looper;Lz2/x;)Ly2/a$f;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ly2/d;->b()LA2/d$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LA2/d$a;->a()LA2/d;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    iget-object v0, p0, Ly2/d;->c:Ly2/a;

    .line 10
    .line 11
    invoke-virtual {v0}, Ly2/a;->a()Ly2/a$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, Ly2/a$a;

    .line 21
    .line 22
    iget-object v2, p0, Ly2/d;->a:Landroid/content/Context;

    .line 23
    .line 24
    iget-object v5, p0, Ly2/d;->d:Ly2/a$d;

    .line 25
    .line 26
    move-object v3, p1

    .line 27
    move-object v6, p2

    .line 28
    move-object v7, p2

    .line 29
    invoke-virtual/range {v1 .. v7}, Ly2/a$a;->a(Landroid/content/Context;Landroid/os/Looper;LA2/d;Ljava/lang/Object;Ly2/e$a;Ly2/e$b;)Ly2/a$f;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0}, Ly2/d;->e()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    instance-of v0, p1, LA2/c;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    move-object v0, p1

    .line 44
    check-cast v0, LA2/c;

    .line 45
    .line 46
    invoke-virtual {v0, p2}, LA2/c;->P(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    if-eqz p2, :cond_2

    .line 50
    .line 51
    instance-of p2, p1, Lz2/i;

    .line 52
    .line 53
    if-nez p2, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    check-cast p1, Lz2/i;

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    throw p1

    .line 60
    :cond_2
    :goto_0
    return-object p1
.end method

.method public final h(Landroid/content/Context;Landroid/os/Handler;)Lz2/M;
    .locals 2

    .line 1
    new-instance v0, Lz2/M;

    .line 2
    .line 3
    invoke-virtual {p0}, Ly2/d;->b()LA2/d$a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, LA2/d$a;->a()LA2/d;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p1, p2, v1}, Lz2/M;-><init>(Landroid/content/Context;Landroid/os/Handler;LA2/d;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final i(ILz2/m;)LV2/j;
    .locals 7

    .line 1
    new-instance v6, LV2/k;

    .line 2
    .line 3
    invoke-direct {v6}, LV2/k;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly2/d;->j:Lz2/e;

    .line 7
    .line 8
    iget-object v5, p0, Ly2/d;->i:Lz2/l;

    .line 9
    .line 10
    move-object v1, p0

    .line 11
    move v2, p1

    .line 12
    move-object v3, p2

    .line 13
    move-object v4, v6

    .line 14
    invoke-virtual/range {v0 .. v5}, Lz2/e;->D(Ly2/d;ILz2/m;LV2/k;Lz2/l;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v6}, LV2/k;->a()LV2/j;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method
