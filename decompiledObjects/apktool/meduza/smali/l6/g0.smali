.class public final Ll6/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/a$c;
.implements Ll6/r0;


# instance fields
.field public final a:Lk6/a$f;

.field public final b:Ll6/a;

.field public c:Lcom/google/android/gms/common/internal/IAccountAccessor;

.field public d:Ljava/util/Set;

.field public e:Z

.field public final synthetic f:Ll6/d;


# direct methods
.method public constructor <init>(Ll6/d;Lk6/a$f;Ll6/a;)V
    .locals 0

    iput-object p1, p0, Ll6/g0;->f:Ll6/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Ll6/g0;->c:Lcom/google/android/gms/common/internal/IAccountAccessor;

    iput-object p1, p0, Ll6/g0;->d:Ljava/util/Set;

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll6/g0;->e:Z

    iput-object p2, p0, Ll6/g0;->a:Lk6/a$f;

    iput-object p3, p0, Ll6/g0;->b:Ll6/a;

    return-void
.end method


# virtual methods
.method public final a(Lj6/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll6/g0;->f:Ll6/d;

    .line 2
    .line 3
    iget-object v0, v0, Ll6/d;->v:Lcom/google/android/gms/internal/base/zau;

    .line 4
    .line 5
    new-instance v1, Ll6/f0;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Ll6/f0;-><init>(Ll6/g0;Lj6/b;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final b(Lj6/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll6/g0;->f:Ll6/d;

    .line 2
    .line 3
    iget-object v0, v0, Ll6/d;->r:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    iget-object v1, p0, Ll6/g0;->b:Ll6/a;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ll6/d0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ll6/d0;->p(Lj6/b;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
