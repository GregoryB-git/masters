.class public abstract Lcom/google/android/gms/common/internal/c;
.super Lcom/google/android/gms/common/internal/a;
.source "SourceFile"

# interfaces
.implements Lk6/a$f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/os/IInterface;",
        ">",
        "Lcom/google/android/gms/common/internal/a<",
        "TT;>;",
        "Lk6/a$f;"
    }
.end annotation


# static fields
.field private static volatile zaa:Ljava/util/concurrent/Executor;


# instance fields
.field private final zab:Lm6/a;

.field private final zac:Ljava/util/Set;

.field private final zad:Landroid/accounts/Account;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;ILm6/a;)V
    .locals 8

    invoke-static {p1}, Lm6/c;->a(Landroid/content/Context;)Lm6/s0;

    move-result-object v3

    .line 1
    sget-object v4, Lj6/e;->d:Lj6/e;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    .line 2
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/common/internal/a;-><init>(Landroid/content/Context;Landroid/os/Handler;Lm6/c;Lj6/f;ILcom/google/android/gms/common/internal/a$a;Lcom/google/android/gms/common/internal/a$b;)V

    invoke-static {p4}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object p4, p0, Lcom/google/android/gms/common/internal/c;->zab:Lm6/a;

    .line 3
    iget-object p1, p4, Lm6/a;->a:Landroid/accounts/Account;

    .line 4
    iput-object p1, p0, Lcom/google/android/gms/common/internal/c;->zad:Landroid/accounts/Account;

    .line 5
    iget-object p1, p4, Lm6/a;->c:Ljava/util/Set;

    .line 6
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/internal/c;->zaa(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/common/internal/c;->zac:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILm6/a;)V
    .locals 9

    invoke-static {p1}, Lm6/c;->a(Landroid/content/Context;)Lm6/s0;

    move-result-object v3

    .line 7
    sget-object v4, Lj6/e;->d:Lj6/e;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    move-object v6, p4

    .line 8
    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/common/internal/c;-><init>(Landroid/content/Context;Landroid/os/Looper;Lm6/c;Lj6/e;ILm6/a;Ll6/c;Ll6/j;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILm6/a;Lk6/e$a;Lk6/e$b;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/common/internal/c;-><init>(Landroid/content/Context;Landroid/os/Looper;ILm6/a;Ll6/c;Ll6/j;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILm6/a;Ll6/c;Ll6/j;)V
    .locals 9

    invoke-static {p1}, Lm6/c;->a(Landroid/content/Context;)Lm6/s0;

    move-result-object v3

    .line 9
    sget-object v4, Lj6/e;->d:Lj6/e;

    .line 10
    invoke-static {p5}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p6}, Lm6/j;->i(Ljava/lang/Object;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/common/internal/c;-><init>(Landroid/content/Context;Landroid/os/Looper;Lm6/c;Lj6/e;ILm6/a;Ll6/c;Ll6/j;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lm6/c;Lj6/e;ILm6/a;Ll6/c;Ll6/j;)V
    .locals 11

    move-object v9, p0

    move-object/from16 v10, p6

    move-object/from16 v0, p7

    move-object/from16 v1, p8

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/google/android/gms/common/internal/d;

    invoke-direct {v3, v0}, Lcom/google/android/gms/common/internal/d;-><init>(Ll6/c;)V

    move-object v6, v3

    :goto_0
    if-nez v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    new-instance v0, Lcom/google/android/gms/common/internal/e;

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/internal/e;-><init>(Ll6/j;)V

    move-object v7, v0

    .line 11
    :goto_1
    iget-object v8, v10, Lm6/a;->f:Ljava/lang/String;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move/from16 v5, p5

    .line 12
    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/common/internal/a;-><init>(Landroid/content/Context;Landroid/os/Looper;Lm6/c;Lj6/f;ILcom/google/android/gms/common/internal/a$a;Lcom/google/android/gms/common/internal/a$b;Ljava/lang/String;)V

    iput-object v10, v9, Lcom/google/android/gms/common/internal/c;->zab:Lm6/a;

    .line 13
    iget-object v0, v10, Lm6/a;->a:Landroid/accounts/Account;

    .line 14
    iput-object v0, v9, Lcom/google/android/gms/common/internal/c;->zad:Landroid/accounts/Account;

    .line 15
    iget-object v0, v10, Lm6/a;->c:Ljava/util/Set;

    .line 16
    invoke-direct {p0, v0}, Lcom/google/android/gms/common/internal/c;->zaa(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, v9, Lcom/google/android/gms/common/internal/c;->zac:Ljava/util/Set;

    return-void
.end method

.method private final zaa(Ljava/util/Set;)Ljava/util/Set;
    .locals 3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/internal/c;->validateScopes(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/common/api/Scope;

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Expanding scopes is not permitted, use implied scopes instead"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final getAccount()Landroid/accounts/Account;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/c;->zad:Landroid/accounts/Account;

    return-object v0
.end method

.method public getBindServiceExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getClientSettings()Lm6/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/c;->zab:Lm6/a;

    return-object v0
.end method

.method public getRequiredFeatures()[Lj6/d;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lj6/d;

    return-object v0
.end method

.method public final getScopes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/internal/c;->zac:Ljava/util/Set;

    return-object v0
.end method

.method public getScopesForConnectionlessNonSignIn()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->requiresSignIn()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/internal/c;->zac:Ljava/util/Set;

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public validateScopes(Ljava/util/Set;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;)",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    return-object p1
.end method
