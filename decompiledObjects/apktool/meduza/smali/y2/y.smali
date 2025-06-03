.class public final Ly2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz2/c;

.field public final synthetic b:Ljava/util/UUID;

.field public final synthetic c:Lo2/d;

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Ly2/z;


# direct methods
.method public constructor <init>(Ly2/z;Lz2/c;Ljava/util/UUID;Lo2/d;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ly2/y;->e:Ly2/z;

    iput-object p2, p0, Ly2/y;->a:Lz2/c;

    iput-object p3, p0, Ly2/y;->b:Ljava/util/UUID;

    iput-object p4, p0, Ly2/y;->c:Lo2/d;

    iput-object p5, p0, Ly2/y;->d:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Ly2/y;->a:Lz2/c;

    .line 2
    .line 3
    iget-object v0, v0, Lz2/a;->a:Ljava/lang/Object;

    .line 4
    .line 5
    instance-of v0, v0, Lz2/a$b;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Ly2/y;->b:Ljava/util/UUID;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Ly2/y;->e:Ly2/z;

    .line 16
    .line 17
    iget-object v1, v1, Ly2/z;->c:Lx2/t;

    .line 18
    .line 19
    invoke-interface {v1, v0}, Lx2/t;->t(Ljava/lang/String;)Lx2/s;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v2, v1, Lx2/s;->b:Lo2/o$b;

    .line 26
    .line 27
    invoke-virtual {v2}, Lo2/o$b;->f()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    iget-object v2, p0, Ly2/y;->e:Ly2/z;

    .line 34
    .line 35
    iget-object v2, v2, Ly2/z;->b:Lw2/a;

    .line 36
    .line 37
    iget-object v3, p0, Ly2/y;->c:Lo2/d;

    .line 38
    .line 39
    check-cast v2, Lp2/r;

    .line 40
    .line 41
    invoke-virtual {v2, v0, v3}, Lp2/r;->e(Ljava/lang/String;Lo2/d;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Ly2/y;->d:Landroid/content/Context;

    .line 45
    .line 46
    invoke-static {v1}, Lb/a0;->s(Lx2/s;)Lx2/l;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, Ly2/y;->c:Lo2/d;

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, Landroidx/work/impl/foreground/a;->b(Landroid/content/Context;Lx2/l;Lo2/d;)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v1, p0, Ly2/y;->d:Landroid/content/Context;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const-string v0, "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    .line 63
    .line 64
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v1

    .line 70
    :cond_1
    :goto_0
    iget-object v0, p0, Ly2/y;->a:Lz2/c;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-virtual {v0, v1}, Lz2/c;->i(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    iget-object v1, p0, Ly2/y;->a:Lz2/c;

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Lz2/c;->j(Ljava/lang/Throwable;)Z

    .line 81
    .line 82
    .line 83
    :goto_1
    return-void
.end method
