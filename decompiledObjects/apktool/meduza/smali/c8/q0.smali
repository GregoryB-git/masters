.class public final Lc8/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/b$a;


# instance fields
.field public final synthetic a:Lc8/r0;


# direct methods
.method public constructor <init>(Lc8/r0;)V
    .locals 0

    iput-object p1, p0, Lc8/q0;->a:Lc8/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lc8/q0;->a:Lc8/r0;

    .line 5
    .line 6
    iput-boolean v0, p1, Lc8/r0;->c:Z

    .line 7
    .line 8
    iget-object p1, p0, Lc8/q0;->a:Lc8/r0;

    .line 9
    .line 10
    iget-object p1, p1, Lc8/r0;->b:Lc8/r;

    .line 11
    .line 12
    iget-object v0, p1, Lc8/r;->e:Lcom/google/android/gms/internal/firebase-auth-api/zze;

    .line 13
    .line 14
    iget-object p1, p1, Lc8/r;->f:Li6/t;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object p1, p0, Lc8/q0;->a:Lc8/r0;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput-boolean v1, p1, Lc8/r0;->c:Z

    .line 24
    .line 25
    iget-object p1, p0, Lc8/q0;->a:Lc8/r0;

    .line 26
    .line 27
    iget v2, p1, Lc8/r0;->a:I

    .line 28
    .line 29
    if-lez v2, :cond_1

    .line 30
    .line 31
    iget-boolean p1, p1, Lc8/r0;->c:Z

    .line 32
    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v0, v1

    .line 37
    :goto_0
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object p1, p0, Lc8/q0;->a:Lc8/r0;

    .line 40
    .line 41
    iget-object p1, p1, Lc8/r0;->b:Lc8/r;

    .line 42
    .line 43
    invoke-virtual {p1}, Lc8/r;->a()V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-void
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
