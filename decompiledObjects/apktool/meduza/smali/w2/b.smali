.class public final Lw2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroidx/work/impl/foreground/a;


# direct methods
.method public constructor <init>(Landroidx/work/impl/foreground/a;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lw2/b;->b:Landroidx/work/impl/foreground/a;

    iput-object p2, p0, Lw2/b;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lw2/b;->b:Landroidx/work/impl/foreground/a;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/work/impl/foreground/a;->a:Lp2/k0;

    .line 4
    .line 5
    iget-object v0, v0, Lp2/k0;->f:Lp2/r;

    .line 6
    .line 7
    iget-object v1, p0, Lw2/b;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, v0, Lp2/r;->k:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v2

    .line 12
    :try_start_0
    invoke-virtual {v0, v1}, Lp2/r;->c(Ljava/lang/String;)Lp2/q0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, v0, Lp2/q0;->c:Lx2/s;

    .line 19
    .line 20
    monitor-exit v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    :goto_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Lx2/s;->b()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Lw2/b;->b:Landroidx/work/impl/foreground/a;

    .line 33
    .line 34
    iget-object v1, v1, Landroidx/work/impl/foreground/a;->c:Ljava/lang/Object;

    .line 35
    .line 36
    monitor-enter v1

    .line 37
    :try_start_1
    iget-object v2, p0, Lw2/b;->b:Landroidx/work/impl/foreground/a;

    .line 38
    .line 39
    iget-object v2, v2, Landroidx/work/impl/foreground/a;->f:Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-static {v0}, Lb/a0;->s(Lx2/s;)Lx2/l;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Lw2/b;->b:Landroidx/work/impl/foreground/a;

    .line 49
    .line 50
    iget-object v3, v2, Landroidx/work/impl/foreground/a;->p:Lt2/e;

    .line 51
    .line 52
    iget-object v2, v2, Landroidx/work/impl/foreground/a;->b:La3/b;

    .line 53
    .line 54
    invoke-interface {v2}, La3/b;->a()Lnc/c1;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget-object v4, p0, Lw2/b;->b:Landroidx/work/impl/foreground/a;

    .line 59
    .line 60
    invoke-static {v3, v0, v2, v4}, Lt2/h;->a(Lt2/e;Lx2/s;Lnc/a0;Lt2/d;)Lnc/m1;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget-object v3, p0, Lw2/b;->b:Landroidx/work/impl/foreground/a;

    .line 65
    .line 66
    iget-object v3, v3, Landroidx/work/impl/foreground/a;->o:Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-static {v0}, Lb/a0;->s(Lx2/s;)Lx2/l;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v3, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    monitor-exit v1

    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    throw v0

    .line 80
    :cond_1
    :goto_1
    return-void

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 83
    throw v0
.end method
