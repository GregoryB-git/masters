.class public abstract LA2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA2/c$a;,
        LA2/c$b;,
        LA2/c$d;,
        LA2/c$c;,
        LA2/c$e;
    }
.end annotation


# static fields
.field public static final D:[Ljava/lang/String;

.field public static final E:[Lx2/d;


# instance fields
.field public A:Z

.field public volatile B:LA2/a0;

.field public C:Ljava/util/concurrent/atomic/AtomicInteger;

.field public a:I

.field public b:J

.field public c:J

.field public d:I

.field public e:J

.field public volatile f:Ljava/lang/String;

.field public g:LA2/m0;

.field public final h:Landroid/content/Context;

.field public final i:Landroid/os/Looper;

.field public final j:LA2/h;

.field public final k:Lx2/k;

.field public final l:Landroid/os/Handler;

.field public final m:Ljava/lang/Object;

.field public final n:Ljava/lang/Object;

.field public o:LA2/k;

.field public p:LA2/c$c;

.field public q:Landroid/os/IInterface;

.field public final r:Ljava/util/ArrayList;

.field public s:LA2/X;

.field public t:I

.field public final u:LA2/c$a;

.field public final v:LA2/c$b;

.field public final w:I

.field public final x:Ljava/lang/String;

.field public volatile y:Ljava/lang/String;

.field public z:Lx2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lx2/d;

    .line 3
    .line 4
    sput-object v0, LA2/c;->E:[Lx2/d;

    .line 5
    .line 6
    const-string v0, "service_esmobile"

    .line 7
    .line 8
    const-string v1, "service_googleme"

    .line 9
    .line 10
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, LA2/c;->D:[Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILA2/c$a;LA2/c$b;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-static {p1}, LA2/h;->b(Landroid/content/Context;)LA2/h;

    move-result-object v3

    invoke-static {}, Lx2/k;->f()Lx2/k;

    move-result-object v4

    invoke-static {p4}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, LA2/c;-><init>(Landroid/content/Context;Landroid/os/Looper;LA2/h;Lx2/k;ILA2/c$a;LA2/c$b;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;LA2/h;Lx2/k;ILA2/c$a;LA2/c$b;Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LA2/c;->f:Ljava/lang/String;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, LA2/c;->m:Ljava/lang/Object;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, LA2/c;->n:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LA2/c;->r:Ljava/util/ArrayList;

    const/4 v1, 0x1

    iput v1, p0, LA2/c;->t:I

    iput-object v0, p0, LA2/c;->z:Lx2/b;

    const/4 v1, 0x0

    iput-boolean v1, p0, LA2/c;->A:Z

    iput-object v0, p0, LA2/c;->B:LA2/a0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, LA2/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v0, "Context must not be null"

    invoke-static {p1, v0}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LA2/c;->h:Landroid/content/Context;

    const-string p1, "Looper must not be null"

    invoke-static {p2, p1}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, LA2/c;->i:Landroid/os/Looper;

    const-string p1, "Supervisor must not be null"

    invoke-static {p3, p1}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, LA2/c;->j:LA2/h;

    const-string p1, "API availability must not be null"

    invoke-static {p4, p1}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p4, p0, LA2/c;->k:Lx2/k;

    new-instance p1, LA2/U;

    invoke-direct {p1, p0, p2}, LA2/U;-><init>(LA2/c;Landroid/os/Looper;)V

    iput-object p1, p0, LA2/c;->l:Landroid/os/Handler;

    iput p5, p0, LA2/c;->w:I

    iput-object p6, p0, LA2/c;->u:LA2/c$a;

    iput-object p7, p0, LA2/c;->v:LA2/c$b;

    iput-object p8, p0, LA2/c;->x:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic T(LA2/c;)Lx2/b;
    .locals 0

    .line 1
    iget-object p0, p0, LA2/c;->z:Lx2/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic U(LA2/c;)LA2/c$a;
    .locals 0

    .line 1
    iget-object p0, p0, LA2/c;->u:LA2/c$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic V(LA2/c;)LA2/c$b;
    .locals 0

    .line 1
    iget-object p0, p0, LA2/c;->v:LA2/c$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic W(LA2/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, LA2/c;->n:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic Y(LA2/c;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, LA2/c;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic Z(LA2/c;Lx2/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA2/c;->z:Lx2/b;

    .line 2
    .line 3
    return-void
.end method

.method public static bridge synthetic a0(LA2/c;LA2/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA2/c;->o:LA2/k;

    .line 2
    .line 3
    return-void
.end method

.method public static bridge synthetic b0(LA2/c;ILandroid/os/IInterface;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p0, p1, p2}, LA2/c;->i0(ILandroid/os/IInterface;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static bridge synthetic c0(LA2/c;LA2/a0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA2/c;->B:LA2/a0;

    .line 2
    .line 3
    invoke-virtual {p0}, LA2/c;->S()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    iget-object p0, p1, LA2/a0;->r:LA2/e;

    .line 10
    .line 11
    invoke-static {}, LA2/o;->b()LA2/o;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, LA2/e;->k()LA2/p;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-virtual {p1, p0}, LA2/o;->c(LA2/p;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public static bridge synthetic d0(LA2/c;I)V
    .locals 2

    .line 1
    iget-object p1, p0, LA2/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget v0, p0, LA2/c;->t:I

    .line 5
    .line 6
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    const/4 p1, 0x3

    .line 8
    if-ne v0, p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, LA2/c;->A:Z

    .line 12
    .line 13
    const/4 p1, 0x5

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x4

    .line 16
    :goto_0
    iget-object v0, p0, LA2/c;->l:Landroid/os/Handler;

    .line 17
    .line 18
    iget-object p0, p0, LA2/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    const/16 v1, 0x10

    .line 25
    .line 26
    invoke-virtual {v0, p1, p0, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v0, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw p0
.end method

.method public static bridge synthetic f0(LA2/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LA2/c;->A:Z

    .line 2
    .line 3
    return p0
.end method

.method public static bridge synthetic g0(LA2/c;IILandroid/os/IInterface;)Z
    .locals 2

    .line 1
    iget-object v0, p0, LA2/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, LA2/c;->t:I

    .line 5
    .line 6
    if-eq v1, p1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    const/4 p0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0, p2, p3}, LA2/c;->i0(ILandroid/os/IInterface;)V

    .line 14
    .line 15
    .line 16
    monitor-exit v0

    .line 17
    const/4 p0, 0x1

    .line 18
    :goto_0
    return p0

    .line 19
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw p0
.end method

.method public static bridge synthetic h0(LA2/c;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, LA2/c;->A:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, LA2/c;->E()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {p0}, LA2/c;->B()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    :try_start_0
    invoke-virtual {p0}, LA2/c;->E()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    :catch_0
    :goto_0
    return v1
.end method


# virtual methods
.method public A()Landroid/os/Bundle;
    .locals 1

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public B()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public C()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final D()Landroid/os/IInterface;
    .locals 3

    .line 1
    iget-object v0, p0, LA2/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, LA2/c;->t:I

    .line 5
    .line 6
    const/4 v2, 0x5

    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, LA2/c;->r()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, LA2/c;->q:Landroid/os/IInterface;

    .line 13
    .line 14
    const-string v2, "Client is connected but service is null"

    .line 15
    .line 16
    invoke-static {v1, v2}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-object v1

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v1, Landroid/os/DeadObjectException;

    .line 24
    .line 25
    invoke-direct {v1}, Landroid/os/DeadObjectException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw v1

    .line 29
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v1
.end method

.method public abstract E()Ljava/lang/String;
.end method

.method public abstract F()Ljava/lang/String;
.end method

.method public G()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms"

    .line 2
    .line 3
    return-object v0
.end method

.method public H()LA2/e;
    .locals 1

    .line 1
    iget-object v0, p0, LA2/c;->B:LA2/a0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v0, v0, LA2/a0;->r:LA2/e;

    .line 8
    .line 9
    return-object v0
.end method

.method public I()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LA2/c;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xc9e4920

    .line 6
    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public J()Z
    .locals 1

    .line 1
    iget-object v0, p0, LA2/c;->B:LA2/a0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public K(Landroid/os/IInterface;)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, LA2/c;->c:J

    .line 6
    .line 7
    return-void
.end method

.method public L(Lx2/b;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lx2/b;->a()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, LA2/c;->d:I

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iput-wide v0, p0, LA2/c;->e:J

    .line 12
    .line 13
    return-void
.end method

.method public M(I)V
    .locals 2

    .line 1
    iput p1, p0, LA2/c;->a:I

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, LA2/c;->b:J

    .line 8
    .line 9
    return-void
.end method

.method public N(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    .locals 2

    .line 1
    iget-object v0, p0, LA2/c;->l:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, LA2/Y;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2, p3}, LA2/Y;-><init>(LA2/c;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    const/4 p2, -0x1

    .line 10
    invoke-virtual {v0, p1, p4, p2, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public O()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public P(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA2/c;->y:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public Q(I)V
    .locals 3

    .line 1
    iget-object v0, p0, LA2/c;->l:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, LA2/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x6

    .line 10
    invoke-virtual {v0, v2, v1, p1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public R(LA2/c$c;ILandroid/app/PendingIntent;)V
    .locals 2

    .line 1
    const-string v0, "Connection progress callbacks cannot be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LA2/c;->p:LA2/c$c;

    .line 7
    .line 8
    iget-object p1, p0, LA2/c;->l:Landroid/os/Handler;

    .line 9
    .line 10
    iget-object v0, p0, LA2/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x3

    .line 17
    invoke-virtual {p1, v1, v0, p2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public S()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final X()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LA2/c;->x:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LA2/c;->h:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    return-object v0
.end method

.method public a()Z
    .locals 3

    .line 1
    iget-object v0, p0, LA2/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, LA2/c;->t:I

    .line 5
    .line 6
    const/4 v2, 0x4

    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    monitor-exit v0

    .line 13
    return v1

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw v1
.end method

.method public b(LA2/c$e;)V
    .locals 0

    .line 1
    invoke-interface {p1}, LA2/c$e;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public c()V
    .locals 4

    .line 1
    iget-object v0, p0, LA2/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA2/c;->r:Ljava/util/ArrayList;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, LA2/c;->r:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_0

    .line 17
    .line 18
    iget-object v3, p0, LA2/c;->r:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, LA2/V;

    .line 25
    .line 26
    invoke-virtual {v3}, LA2/V;->d()V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iget-object v1, p0, LA2/c;->r:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 37
    .line 38
    .line 39
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    iget-object v1, p0, LA2/c;->n:Ljava/lang/Object;

    .line 41
    .line 42
    monitor-enter v1

    .line 43
    const/4 v0, 0x0

    .line 44
    :try_start_1
    iput-object v0, p0, LA2/c;->o:LA2/k;

    .line 45
    .line 46
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-virtual {p0, v1, v0}, LA2/c;->i0(ILandroid/os/IInterface;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catchall_1
    move-exception v0

    .line 53
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 54
    throw v0

    .line 55
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 56
    throw v1
.end method

.method public final e0(ILandroid/os/Bundle;I)V
    .locals 2

    .line 1
    iget-object p2, p0, LA2/c;->l:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v0, LA2/Z;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, p1, v1}, LA2/Z;-><init>(LA2/c;ILandroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x7

    .line 10
    const/4 v1, -0x1

    .line 11
    invoke-virtual {p2, p1, p3, v1, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA2/c;->f:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, LA2/c;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public abstract h()I
.end method

.method public i()Z
    .locals 4

    .line 1
    iget-object v0, p0, LA2/c;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, LA2/c;->t:I

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x1

    .line 8
    if-eq v1, v2, :cond_1

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v3, 0x0

    .line 15
    :cond_1
    :goto_0
    monitor-exit v0

    .line 16
    return v3

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v1
.end method

.method public final i0(ILandroid/os/IInterface;)V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x4

    .line 4
    if-eq p1, v2, :cond_0

    .line 5
    .line 6
    move v3, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v3, v1

    .line 9
    :goto_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    move v4, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    move v4, v1

    .line 14
    :goto_1
    if-ne v3, v4, :cond_2

    .line 15
    .line 16
    move v0, v1

    .line 17
    :cond_2
    invoke-static {v0}, LA2/n;->a(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, LA2/c;->m:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v0

    .line 23
    :try_start_0
    iput p1, p0, LA2/c;->t:I

    .line 24
    .line 25
    iput-object p2, p0, LA2/c;->q:Landroid/os/IInterface;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    if-eq p1, v1, :cond_9

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    const/4 v4, 0x3

    .line 32
    if-eq p1, v1, :cond_4

    .line 33
    .line 34
    if-eq p1, v4, :cond_4

    .line 35
    .line 36
    if-eq p1, v2, :cond_3

    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_3
    invoke-static {p2}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p2}, LA2/c;->K(Landroid/os/IInterface;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_4
    iget-object v9, p0, LA2/c;->s:LA2/X;

    .line 52
    .line 53
    if-eqz v9, :cond_5

    .line 54
    .line 55
    iget-object p1, p0, LA2/c;->g:LA2/m0;

    .line 56
    .line 57
    if-eqz p1, :cond_5

    .line 58
    .line 59
    const-string p2, "GmsClient"

    .line 60
    .line 61
    invoke-virtual {p1}, LA2/m0;->c()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {p1}, LA2/m0;->b()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v5, "Calling connect() while still connected, missing disconnect() for "

    .line 75
    .line 76
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, " on "

    .line 83
    .line 84
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    iget-object v5, p0, LA2/c;->j:LA2/h;

    .line 98
    .line 99
    iget-object p1, p0, LA2/c;->g:LA2/m0;

    .line 100
    .line 101
    invoke-virtual {p1}, LA2/m0;->c()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-static {v6}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, LA2/c;->g:LA2/m0;

    .line 109
    .line 110
    invoke-virtual {p1}, LA2/m0;->b()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    iget-object p1, p0, LA2/c;->g:LA2/m0;

    .line 115
    .line 116
    invoke-virtual {p1}, LA2/m0;->a()I

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    invoke-virtual {p0}, LA2/c;->X()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    iget-object p1, p0, LA2/c;->g:LA2/m0;

    .line 125
    .line 126
    invoke-virtual {p1}, LA2/m0;->d()Z

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    invoke-virtual/range {v5 .. v11}, LA2/h;->e(Ljava/lang/String;Ljava/lang/String;ILandroid/content/ServiceConnection;Ljava/lang/String;Z)V

    .line 131
    .line 132
    .line 133
    iget-object p1, p0, LA2/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 136
    .line 137
    .line 138
    :cond_5
    new-instance p1, LA2/X;

    .line 139
    .line 140
    iget-object p2, p0, LA2/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 141
    .line 142
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    invoke-direct {p1, p0, p2}, LA2/X;-><init>(LA2/c;I)V

    .line 147
    .line 148
    .line 149
    iput-object p1, p0, LA2/c;->s:LA2/X;

    .line 150
    .line 151
    iget p2, p0, LA2/c;->t:I

    .line 152
    .line 153
    if-ne p2, v4, :cond_6

    .line 154
    .line 155
    invoke-virtual {p0}, LA2/c;->B()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    if-eqz p2, :cond_6

    .line 160
    .line 161
    new-instance p2, LA2/m0;

    .line 162
    .line 163
    invoke-virtual {p0}, LA2/c;->y()Landroid/content/Context;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {p0}, LA2/c;->B()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-static {}, LA2/h;->a()I

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    const/4 v9, 0x0

    .line 180
    const/4 v7, 0x1

    .line 181
    move-object v4, p2

    .line 182
    invoke-direct/range {v4 .. v9}, LA2/m0;-><init>(Ljava/lang/String;Ljava/lang/String;ZIZ)V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_6
    new-instance p2, LA2/m0;

    .line 187
    .line 188
    invoke-virtual {p0}, LA2/c;->G()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-virtual {p0}, LA2/c;->F()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-static {}, LA2/h;->a()I

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    invoke-virtual {p0}, LA2/c;->I()Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    const/4 v7, 0x0

    .line 205
    move-object v4, p2

    .line 206
    invoke-direct/range {v4 .. v9}, LA2/m0;-><init>(Ljava/lang/String;Ljava/lang/String;ZIZ)V

    .line 207
    .line 208
    .line 209
    :goto_2
    iput-object p2, p0, LA2/c;->g:LA2/m0;

    .line 210
    .line 211
    invoke-virtual {p2}, LA2/m0;->d()Z

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    if-eqz p2, :cond_8

    .line 216
    .line 217
    invoke-virtual {p0}, LA2/c;->h()I

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    const v1, 0x1110e58

    .line 222
    .line 223
    .line 224
    if-lt p2, v1, :cond_7

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 228
    .line 229
    const-string p2, "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "

    .line 230
    .line 231
    iget-object v1, p0, LA2/c;->g:LA2/m0;

    .line 232
    .line 233
    invoke-virtual {v1}, LA2/m0;->c()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {p2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw p1

    .line 249
    :cond_8
    :goto_3
    iget-object p2, p0, LA2/c;->j:LA2/h;

    .line 250
    .line 251
    iget-object v1, p0, LA2/c;->g:LA2/m0;

    .line 252
    .line 253
    invoke-virtual {v1}, LA2/m0;->c()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-static {v1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    iget-object v2, p0, LA2/c;->g:LA2/m0;

    .line 261
    .line 262
    invoke-virtual {v2}, LA2/m0;->b()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    iget-object v4, p0, LA2/c;->g:LA2/m0;

    .line 267
    .line 268
    invoke-virtual {v4}, LA2/m0;->a()I

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    invoke-virtual {p0}, LA2/c;->X()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    iget-object v6, p0, LA2/c;->g:LA2/m0;

    .line 277
    .line 278
    invoke-virtual {v6}, LA2/m0;->d()Z

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    invoke-virtual {p0}, LA2/c;->w()Ljava/util/concurrent/Executor;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    new-instance v8, LA2/e0;

    .line 287
    .line 288
    invoke-direct {v8, v1, v2, v4, v6}, LA2/e0;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p2, v8, p1, v5, v7}, LA2/h;->f(LA2/e0;Landroid/content/ServiceConnection;Ljava/lang/String;Ljava/util/concurrent/Executor;)Z

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    if-nez p1, :cond_a

    .line 296
    .line 297
    iget-object p1, p0, LA2/c;->g:LA2/m0;

    .line 298
    .line 299
    invoke-virtual {p1}, LA2/m0;->c()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    iget-object p2, p0, LA2/c;->g:LA2/m0;

    .line 304
    .line 305
    invoke-virtual {p2}, LA2/m0;->b()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    new-instance v1, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 312
    .line 313
    .line 314
    const-string v2, "unable to connect to service: "

    .line 315
    .line 316
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    const-string p1, " on "

    .line 323
    .line 324
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    const-string p1, "GmsClient"

    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object p2

    .line 336
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 337
    .line 338
    .line 339
    iget-object p1, p0, LA2/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 340
    .line 341
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 342
    .line 343
    .line 344
    move-result p1

    .line 345
    const/16 p2, 0x10

    .line 346
    .line 347
    invoke-virtual {p0, p2, v3, p1}, LA2/c;->e0(ILandroid/os/Bundle;I)V

    .line 348
    .line 349
    .line 350
    goto :goto_4

    .line 351
    :cond_9
    iget-object v8, p0, LA2/c;->s:LA2/X;

    .line 352
    .line 353
    if-eqz v8, :cond_a

    .line 354
    .line 355
    iget-object v4, p0, LA2/c;->j:LA2/h;

    .line 356
    .line 357
    iget-object p1, p0, LA2/c;->g:LA2/m0;

    .line 358
    .line 359
    invoke-virtual {p1}, LA2/m0;->c()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    invoke-static {v5}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    iget-object p1, p0, LA2/c;->g:LA2/m0;

    .line 367
    .line 368
    invoke-virtual {p1}, LA2/m0;->b()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v6

    .line 372
    iget-object p1, p0, LA2/c;->g:LA2/m0;

    .line 373
    .line 374
    invoke-virtual {p1}, LA2/m0;->a()I

    .line 375
    .line 376
    .line 377
    move-result v7

    .line 378
    invoke-virtual {p0}, LA2/c;->X()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v9

    .line 382
    iget-object p1, p0, LA2/c;->g:LA2/m0;

    .line 383
    .line 384
    invoke-virtual {p1}, LA2/m0;->d()Z

    .line 385
    .line 386
    .line 387
    move-result v10

    .line 388
    invoke-virtual/range {v4 .. v10}, LA2/h;->e(Ljava/lang/String;Ljava/lang/String;ILandroid/content/ServiceConnection;Ljava/lang/String;Z)V

    .line 389
    .line 390
    .line 391
    iput-object v3, p0, LA2/c;->s:LA2/X;

    .line 392
    .line 393
    :cond_a
    :goto_4
    monitor-exit v0

    .line 394
    return-void

    .line 395
    :goto_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 396
    throw p1
.end method

.method public final j()[Lx2/d;
    .locals 1

    .line 1
    iget-object v0, p0, LA2/c;->B:LA2/a0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v0, v0, LA2/a0;->p:[Lx2/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, LA2/c;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LA2/c;->g:LA2/m0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, LA2/m0;->b()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 17
    .line 18
    const-string v1, "Failed to connect when checking package"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LA2/c;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public m()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public o(LA2/i;Ljava/util/Set;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, LA2/c;->A()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v15, LA2/f;

    .line 10
    .line 11
    iget v5, v1, LA2/c;->w:I

    .line 12
    .line 13
    iget-object v14, v1, LA2/c;->y:Ljava/lang/String;

    .line 14
    .line 15
    sget v6, Lx2/k;->a:I

    .line 16
    .line 17
    sget-object v9, LA2/f;->C:[Lcom/google/android/gms/common/api/Scope;

    .line 18
    .line 19
    new-instance v10, Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v13, LA2/f;->D:[Lx2/d;

    .line 25
    .line 26
    const/16 v16, 0x0

    .line 27
    .line 28
    const/16 v17, 0x0

    .line 29
    .line 30
    const/4 v4, 0x6

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v11, 0x0

    .line 34
    const/16 v18, 0x1

    .line 35
    .line 36
    move-object v3, v15

    .line 37
    move-object v12, v13

    .line 38
    move-object/from16 v19, v14

    .line 39
    .line 40
    move/from16 v14, v18

    .line 41
    .line 42
    move-object/from16 v20, v15

    .line 43
    .line 44
    move/from16 v15, v16

    .line 45
    .line 46
    move/from16 v16, v17

    .line 47
    .line 48
    move-object/from16 v17, v19

    .line 49
    .line 50
    invoke-direct/range {v3 .. v17}, LA2/f;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lx2/d;[Lx2/d;ZIZLjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v3, v1, LA2/c;->h:Landroid/content/Context;

    .line 54
    .line 55
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    move-object/from16 v4, v20

    .line 60
    .line 61
    iput-object v3, v4, LA2/f;->r:Ljava/lang/String;

    .line 62
    .line 63
    iput-object v2, v4, LA2/f;->u:Landroid/os/Bundle;

    .line 64
    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    new-array v2, v2, [Lcom/google/android/gms/common/api/Scope;

    .line 69
    .line 70
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, [Lcom/google/android/gms/common/api/Scope;

    .line 75
    .line 76
    iput-object v0, v4, LA2/f;->t:[Lcom/google/android/gms/common/api/Scope;

    .line 77
    .line 78
    :cond_0
    invoke-virtual/range {p0 .. p0}, LA2/c;->m()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    invoke-virtual/range {p0 .. p0}, LA2/c;->u()Landroid/accounts/Account;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-nez v0, :cond_1

    .line 89
    .line 90
    new-instance v0, Landroid/accounts/Account;

    .line 91
    .line 92
    const-string v2, "<<default account>>"

    .line 93
    .line 94
    const-string v3, "com.google"

    .line 95
    .line 96
    invoke-direct {v0, v2, v3}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_1
    iput-object v0, v4, LA2/f;->v:Landroid/accounts/Account;

    .line 100
    .line 101
    if-eqz p1, :cond_3

    .line 102
    .line 103
    invoke-interface/range {p1 .. p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, v4, LA2/f;->s:Landroid/os/IBinder;

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_2
    invoke-virtual/range {p0 .. p0}, LA2/c;->O()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    invoke-virtual/range {p0 .. p0}, LA2/c;->u()Landroid/accounts/Account;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iput-object v0, v4, LA2/f;->v:Landroid/accounts/Account;

    .line 121
    .line 122
    :cond_3
    :goto_0
    sget-object v0, LA2/c;->E:[Lx2/d;

    .line 123
    .line 124
    iput-object v0, v4, LA2/f;->w:[Lx2/d;

    .line 125
    .line 126
    invoke-virtual/range {p0 .. p0}, LA2/c;->v()[Lx2/d;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v0, v4, LA2/f;->x:[Lx2/d;

    .line 131
    .line 132
    invoke-virtual/range {p0 .. p0}, LA2/c;->S()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_4

    .line 137
    .line 138
    const/4 v0, 0x1

    .line 139
    iput-boolean v0, v4, LA2/f;->A:Z

    .line 140
    .line 141
    :cond_4
    :try_start_0
    iget-object v2, v1, LA2/c;->n:Ljava/lang/Object;

    .line 142
    .line 143
    monitor-enter v2
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    :try_start_1
    iget-object v0, v1, LA2/c;->o:LA2/k;

    .line 145
    .line 146
    if-eqz v0, :cond_5

    .line 147
    .line 148
    new-instance v3, LA2/W;

    .line 149
    .line 150
    iget-object v5, v1, LA2/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 151
    .line 152
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    invoke-direct {v3, v1, v5}, LA2/W;-><init>(LA2/c;I)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v0, v3, v4}, LA2/k;->h0(LA2/j;LA2/f;)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :catchall_0
    move-exception v0

    .line 164
    goto :goto_2

    .line 165
    :cond_5
    const-string v0, "GmsClient"

    .line 166
    .line 167
    const-string v3, "mServiceBroker is null, client disconnected"

    .line 168
    .line 169
    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 170
    .line 171
    .line 172
    :goto_1
    monitor-exit v2

    .line 173
    return-void

    .line 174
    :goto_2
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 175
    :try_start_2
    throw v0
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 176
    :catch_0
    move-exception v0

    .line 177
    goto :goto_3

    .line 178
    :catch_1
    move-exception v0

    .line 179
    goto :goto_3

    .line 180
    :catch_2
    move-exception v0

    .line 181
    goto :goto_4

    .line 182
    :catch_3
    move-exception v0

    .line 183
    goto :goto_5

    .line 184
    :goto_3
    const-string v2, "GmsClient"

    .line 185
    .line 186
    const-string v3, "IGmsServiceBroker.getService failed"

    .line 187
    .line 188
    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 189
    .line 190
    .line 191
    iget-object v0, v1, LA2/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    const/16 v2, 0x8

    .line 198
    .line 199
    const/4 v3, 0x0

    .line 200
    invoke-virtual {v1, v2, v3, v3, v0}, LA2/c;->N(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :goto_4
    throw v0

    .line 205
    :goto_5
    const-string v2, "GmsClient"

    .line 206
    .line 207
    const-string v3, "IGmsServiceBroker.getService failed"

    .line 208
    .line 209
    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 210
    .line 211
    .line 212
    const/4 v0, 0x3

    .line 213
    invoke-virtual {v1, v0}, LA2/c;->Q(I)V

    .line 214
    .line 215
    .line 216
    return-void
.end method

.method public p(LA2/c$c;)V
    .locals 1

    .line 1
    const-string v0, "Connection progress callbacks cannot be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LA2/c;->p:LA2/c$c;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, p1, v0}, LA2/c;->i0(ILandroid/os/IInterface;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public q()V
    .locals 3

    .line 1
    iget-object v0, p0, LA2/c;->k:Lx2/k;

    .line 2
    .line 3
    iget-object v1, p0, LA2/c;->h:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {p0}, LA2/c;->h()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {v0, v1, v2}, Lx2/k;->h(Landroid/content/Context;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p0, v1, v2}, LA2/c;->i0(ILandroid/os/IInterface;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, LA2/c$d;

    .line 21
    .line 22
    invoke-direct {v1, p0}, LA2/c$d;-><init>(LA2/c;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v1, v0, v2}, LA2/c;->R(LA2/c$c;ILandroid/app/PendingIntent;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-instance v0, LA2/c$d;

    .line 30
    .line 31
    invoke-direct {v0, p0}, LA2/c$d;-><init>(LA2/c;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, LA2/c;->p(LA2/c$c;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final r()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LA2/c;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v1, "Not connected. Call connect() and wait for onConnected() to be called."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method

.method public abstract s(Landroid/os/IBinder;)Landroid/os/IInterface;
.end method

.method public t()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public u()Landroid/accounts/Account;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public v()[Lx2/d;
    .locals 1

    .line 1
    sget-object v0, LA2/c;->E:[Lx2/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public w()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public x()Landroid/os/Bundle;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final y()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, LA2/c;->h:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public z()I
    .locals 1

    .line 1
    iget v0, p0, LA2/c;->w:I

    .line 2
    .line 3
    return v0
.end method
