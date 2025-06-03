.class public Li5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$c;
.implements LA5/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li5/e$a;,
        Li5/e$b;
    }
.end annotation


# instance fields
.field public a:LE5/k;

.field public b:Li5/a;

.field public c:Landroid/os/HandlerThread;

.field public d:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Li5/e;)Li5/a;
    .locals 0

    .line 1
    iget-object p0, p0, Li5/e;->b:Li5/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Li5/e;LE5/j;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li5/e;->e(LE5/j;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Li5/e;LE5/j;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li5/e;->f(LE5/j;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Li5/e;->b:Li5/a;

    .line 7
    .line 8
    iget-object v1, v1, Li5/a;->d:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "_"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public final e(LE5/j;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/Map;

    .line 4
    .line 5
    const-string v0, "key"

    .line 6
    .line 7
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Li5/e;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final f(LE5/j;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/Map;

    .line 4
    .line 5
    const-string v0, "value"

    .line 6
    .line 7
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/String;

    .line 12
    .line 13
    return-object p1
.end method

.method public g(LE5/c;Landroid/content/Context;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Li5/a;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Li5/a;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Li5/e;->b:Li5/a;

    .line 7
    .line 8
    new-instance p2, Landroid/os/HandlerThread;

    .line 9
    .line 10
    const-string v0, "com.it_nomads.fluttersecurestorage.worker"

    .line 11
    .line 12
    invoke-direct {p2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Li5/e;->c:Landroid/os/HandlerThread;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 18
    .line 19
    .line 20
    new-instance p2, Landroid/os/Handler;

    .line 21
    .line 22
    iget-object v0, p0, Li5/e;->c:Landroid/os/HandlerThread;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 29
    .line 30
    .line 31
    iput-object p2, p0, Li5/e;->d:Landroid/os/Handler;

    .line 32
    .line 33
    new-instance p2, LE5/k;

    .line 34
    .line 35
    const-string v0, "plugins.it_nomads.com/flutter_secure_storage"

    .line 36
    .line 37
    invoke-direct {p2, p1, v0}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, Li5/e;->a:LE5/k;

    .line 41
    .line 42
    invoke-virtual {p2, p0}, LE5/k;->e(LE5/k$c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    move-exception p1

    .line 47
    const-string p2, "FlutterSecureStoragePl"

    .line 48
    .line 49
    const-string v0, "Registration failed"

    .line 50
    .line 51
    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 52
    .line 53
    .line 54
    :goto_0
    return-void
.end method

.method public onAttachedToEngine(LA5/a$b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LA5/a$b;->b()LE5/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, LA5/a$b;->a()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, v0, p1}, Li5/e;->g(LE5/c;Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onDetachedFromEngine(LA5/a$b;)V
    .locals 1

    .line 1
    iget-object p1, p0, Li5/e;->a:LE5/k;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Li5/e;->c:Landroid/os/HandlerThread;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Li5/e;->c:Landroid/os/HandlerThread;

    .line 12
    .line 13
    iget-object p1, p0, Li5/e;->a:LE5/k;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, LE5/k;->e(LE5/k$c;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Li5/e;->a:LE5/k;

    .line 19
    .line 20
    :cond_0
    iput-object v0, p0, Li5/e;->b:Li5/a;

    .line 21
    .line 22
    return-void
.end method

.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 2

    .line 1
    new-instance v0, Li5/e$a;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Li5/e$a;-><init>(LE5/k$d;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Li5/e;->d:Landroid/os/Handler;

    .line 7
    .line 8
    new-instance v1, Li5/e$b;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1, v0}, Li5/e$b;-><init>(Li5/e;LE5/j;LE5/k$d;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method
