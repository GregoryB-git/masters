.class public Lio/flutter/embedding/engine/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/g$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/engine/a$b;
    }
.end annotation


# instance fields
.field public final a:Lio/flutter/embedding/engine/FlutterJNI;

.field public final b:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

.field public final c:Lw5/a;

.field public final d:Lv5/b;

.field public final e:LF5/e;

.field public final f:LD5/a;

.field public final g:LD5/g;

.field public final h:LD5/k;

.field public final i:LD5/l;

.field public final j:LD5/m;

.field public final k:LD5/n;

.field public final l:LD5/f;

.field public final m:LD5/s;

.field public final n:LD5/o;

.field public final o:LD5/r;

.field public final p:LD5/t;

.field public final q:LD5/u;

.field public final r:LD5/v;

.field public final s:LD5/w;

.field public final t:Lio/flutter/plugin/platform/r;

.field public final u:Ljava/util/Set;

.field public final v:Lio/flutter/embedding/engine/a$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ly5/f;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/r;[Ljava/lang/String;Z)V
    .locals 8

    .line 2
    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v7}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Ly5/f;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/r;[Ljava/lang/String;ZZ)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ly5/f;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/r;[Ljava/lang/String;ZZ)V
    .locals 9

    .line 3
    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Ly5/f;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/r;[Ljava/lang/String;ZZLio/flutter/embedding/engine/b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ly5/f;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/r;[Ljava/lang/String;ZZLio/flutter/embedding/engine/b;)V
    .locals 5

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/a;->u:Ljava/util/Set;

    new-instance v0, Lio/flutter/embedding/engine/a$a;

    invoke-direct {v0, p0}, Lio/flutter/embedding/engine/a$a;-><init>(Lio/flutter/embedding/engine/a;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/a;->v:Lio/flutter/embedding/engine/a$b;

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    :goto_0
    invoke-static {}, Lt5/a;->e()Lt5/a;

    move-result-object v1

    if-nez p3, :cond_0

    invoke-virtual {v1}, Lt5/a;->d()Lio/flutter/embedding/engine/FlutterJNI$c;

    move-result-object p3

    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI$c;->a()Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    new-instance v2, Lw5/a;

    invoke-direct {v2, p3, v0}, Lw5/a;-><init>(Lio/flutter/embedding/engine/FlutterJNI;Landroid/content/res/AssetManager;)V

    iput-object v2, p0, Lio/flutter/embedding/engine/a;->c:Lw5/a;

    invoke-virtual {v2}, Lw5/a;->n()V

    invoke-static {}, Lt5/a;->e()Lt5/a;

    move-result-object v0

    invoke-virtual {v0}, Lt5/a;->a()Lx5/a;

    new-instance v0, LD5/a;

    invoke-direct {v0, v2, p3}, LD5/a;-><init>(Lw5/a;Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/a;->f:LD5/a;

    new-instance v0, LD5/g;

    invoke-direct {v0, v2}, LD5/g;-><init>(Lw5/a;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/a;->g:LD5/g;

    new-instance v0, LD5/k;

    invoke-direct {v0, v2}, LD5/k;-><init>(Lw5/a;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/a;->h:LD5/k;

    new-instance v0, LD5/l;

    invoke-direct {v0, v2}, LD5/l;-><init>(Lw5/a;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/a;->i:LD5/l;

    new-instance v3, LD5/m;

    invoke-direct {v3, v2}, LD5/m;-><init>(Lw5/a;)V

    iput-object v3, p0, Lio/flutter/embedding/engine/a;->j:LD5/m;

    new-instance v3, LD5/n;

    invoke-direct {v3, v2}, LD5/n;-><init>(Lw5/a;)V

    iput-object v3, p0, Lio/flutter/embedding/engine/a;->k:LD5/n;

    new-instance v3, LD5/f;

    invoke-direct {v3, v2}, LD5/f;-><init>(Lw5/a;)V

    iput-object v3, p0, Lio/flutter/embedding/engine/a;->l:LD5/f;

    new-instance v3, LD5/o;

    invoke-direct {v3, v2}, LD5/o;-><init>(Lw5/a;)V

    iput-object v3, p0, Lio/flutter/embedding/engine/a;->n:LD5/o;

    new-instance v3, LD5/r;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-direct {v3, v2, v4}, LD5/r;-><init>(Lw5/a;Landroid/content/pm/PackageManager;)V

    iput-object v3, p0, Lio/flutter/embedding/engine/a;->o:LD5/r;

    new-instance v3, LD5/s;

    invoke-direct {v3, v2, p7}, LD5/s;-><init>(Lw5/a;Z)V

    iput-object v3, p0, Lio/flutter/embedding/engine/a;->m:LD5/s;

    new-instance p7, LD5/t;

    invoke-direct {p7, v2}, LD5/t;-><init>(Lw5/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->p:LD5/t;

    new-instance p7, LD5/u;

    invoke-direct {p7, v2}, LD5/u;-><init>(Lw5/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->q:LD5/u;

    new-instance p7, LD5/v;

    invoke-direct {p7, v2}, LD5/v;-><init>(Lw5/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->r:LD5/v;

    new-instance p7, LD5/w;

    invoke-direct {p7, v2}, LD5/w;-><init>(Lw5/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->s:LD5/w;

    new-instance p7, LF5/e;

    invoke-direct {p7, p1, v0}, LF5/e;-><init>(Landroid/content/Context;LD5/l;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->e:LF5/e;

    if-nez p2, :cond_1

    invoke-virtual {v1}, Lt5/a;->c()Ly5/f;

    move-result-object p2

    :cond_1
    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0}, Ly5/f;->p(Landroid/content/Context;)V

    invoke-virtual {p2, p1, p5}, Ly5/f;->h(Landroid/content/Context;[Ljava/lang/String;)V

    :cond_2
    iget-object p5, p0, Lio/flutter/embedding/engine/a;->v:Lio/flutter/embedding/engine/a$b;

    invoke-virtual {p3, p5}, Lio/flutter/embedding/engine/FlutterJNI;->addEngineLifecycleListener(Lio/flutter/embedding/engine/a$b;)V

    invoke-virtual {p3, p4}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformViewsController(Lio/flutter/plugin/platform/r;)V

    invoke-virtual {p3, p7}, Lio/flutter/embedding/engine/FlutterJNI;->setLocalizationPlugin(LF5/e;)V

    invoke-virtual {v1}, Lt5/a;->a()Lx5/a;

    const/4 p5, 0x0

    invoke-virtual {p3, p5}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lx5/a;)V

    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result p5

    if-nez p5, :cond_3

    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->f()V

    :cond_3
    new-instance p5, Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    invoke-direct {p5, p3}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object p5, p0, Lio/flutter/embedding/engine/a;->b:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    iput-object p4, p0, Lio/flutter/embedding/engine/a;->t:Lio/flutter/plugin/platform/r;

    invoke-virtual {p4}, Lio/flutter/plugin/platform/r;->R()V

    new-instance p3, Lv5/b;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p4

    invoke-direct {p3, p4, p0, p2, p8}, Lv5/b;-><init>(Landroid/content/Context;Lio/flutter/embedding/engine/a;Ly5/f;Lio/flutter/embedding/engine/b;)V

    iput-object p3, p0, Lio/flutter/embedding/engine/a;->d:Lv5/b;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    invoke-virtual {p4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p4

    invoke-virtual {p7, p4}, LF5/e;->d(Landroid/content/res/Configuration;)V

    if-eqz p6, :cond_4

    invoke-virtual {p2}, Ly5/f;->g()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {p0}, LC5/a;->a(Lio/flutter/embedding/engine/a;)V

    :cond_4
    invoke-static {p1, p0}, LT5/g;->a(Landroid/content/Context;LT5/g$a;)V

    new-instance p1, LH5/a;

    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->s()LD5/r;

    move-result-object p2

    invoke-direct {p1, p2}, LH5/a;-><init>(LD5/r;)V

    invoke-virtual {p3, p1}, Lv5/b;->c(LA5/a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ly5/f;Lio/flutter/embedding/engine/FlutterJNI;[Ljava/lang/String;Z)V
    .locals 7

    .line 5
    new-instance v4, Lio/flutter/plugin/platform/r;

    invoke-direct {v4}, Lio/flutter/plugin/platform/r;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Ly5/f;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/r;[Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 6

    .line 6
    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Ly5/f;Lio/flutter/embedding/engine/FlutterJNI;[Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/embedding/engine/a;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/flutter/embedding/engine/a;->u:Ljava/util/Set;

    return-object p0
.end method

.method public static synthetic c(Lio/flutter/embedding/engine/a;)Lio/flutter/plugin/platform/r;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/flutter/embedding/engine/a;->t:Lio/flutter/plugin/platform/r;

    return-object p0
.end method

.method public static synthetic d(Lio/flutter/embedding/engine/a;)LD5/s;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/flutter/embedding/engine/a;->m:LD5/s;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public A(Landroid/content/Context;Lw5/a$c;Ljava/lang/String;Ljava/util/List;Lio/flutter/plugin/platform/r;ZZ)Lio/flutter/embedding/engine/a;
    .locals 12

    .line 1
    move-object v0, p2

    .line 2
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->z()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    move-object v1, p0

    .line 9
    iget-object v2, v1, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 10
    .line 11
    iget-object v3, v0, Lw5/a$c;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v0, v0, Lw5/a$c;->b:Ljava/lang/String;

    .line 14
    .line 15
    move-object v4, p3

    .line 16
    move-object/from16 v5, p4

    .line 17
    .line 18
    invoke-virtual {v2, v3, v0, p3, v5}, Lio/flutter/embedding/engine/FlutterJNI;->spawn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/flutter/embedding/engine/FlutterJNI;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    new-instance v0, Lio/flutter/embedding/engine/a;

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v9, 0x0

    .line 26
    move-object v4, v0

    .line 27
    move-object v5, p1

    .line 28
    move-object/from16 v8, p5

    .line 29
    .line 30
    move/from16 v10, p6

    .line 31
    .line 32
    move/from16 v11, p7

    .line 33
    .line 34
    invoke-direct/range {v4 .. v11}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Ly5/f;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/r;[Ljava/lang/String;ZZ)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_0
    move-object v1, p0

    .line 39
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v2, "Spawn can only be called on a fully constructed FlutterEngine"

    .line 42
    .line 43
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0
.end method

.method public a(FFF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2, p3}, Lio/flutter/embedding/engine/FlutterJNI;->updateDisplayMetrics(IFFF)V

    return-void
.end method

.method public e(Lio/flutter/embedding/engine/a$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->u:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    const-string v0, "FlutterEngine"

    const-string v1, "Attaching to JNI."

    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->attachToNative()V

    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "FlutterEngine failed to attach to its native Object reference."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()V
    .locals 2

    .line 1
    const-string v0, "FlutterEngine"

    const-string v1, "Destroying."

    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->u:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/a$b;

    invoke-interface {v1}, Lio/flutter/embedding/engine/a$b;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lv5/b;

    invoke-virtual {v0}, Lv5/b;->k()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->t:Lio/flutter/plugin/platform/r;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/r;->T()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->c:Lw5/a;

    invoke-virtual {v0}, Lw5/a;->o()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    iget-object v1, p0, Lio/flutter/embedding/engine/a;->v:Lio/flutter/embedding/engine/a$b;

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->removeEngineLifecycleListener(Lio/flutter/embedding/engine/a$b;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lx5/a;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->detachFromNativeAndReleaseResources()V

    invoke-static {}, Lt5/a;->e()Lt5/a;

    move-result-object v0

    invoke-virtual {v0}, Lt5/a;->a()Lx5/a;

    return-void
.end method

.method public h()LD5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->f:LD5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()LB5/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lv5/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()LD5/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->l:LD5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Lw5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->c:Lw5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()LD5/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->h:LD5/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public m()LF5/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->e:LF5/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()LD5/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->j:LD5/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public o()LD5/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->k:LD5/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()LD5/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->n:LD5/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public q()Lio/flutter/plugin/platform/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->t:Lio/flutter/plugin/platform/r;

    return-object v0
.end method

.method public r()LA5/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lv5/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()LD5/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->o:LD5/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public t()Lio/flutter/embedding/engine/renderer/FlutterRenderer;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->b:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    return-object v0
.end method

.method public u()LD5/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->m:LD5/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public v()LD5/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->p:LD5/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public w()LD5/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->q:LD5/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()LD5/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->r:LD5/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public y()LD5/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->s:LD5/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v0

    return v0
.end method
