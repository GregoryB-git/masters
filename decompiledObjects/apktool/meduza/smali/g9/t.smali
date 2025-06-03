.class public final synthetic Lg9/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lg9/u;

.field public final synthetic b:Ld9/x0;

.field public final synthetic c:Ln9/i;


# direct methods
.method public synthetic constructor <init>(Ld9/x0;Lg9/u;Ln9/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lg9/t;->a:Lg9/u;

    iput-object p1, p0, Lg9/t;->b:Ld9/x0;

    iput-object p3, p0, Lg9/t;->c:Ln9/i;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lg9/t;->a:Lg9/u;

    .line 2
    .line 3
    iget-object v1, p0, Lg9/t;->b:Ld9/x0;

    .line 4
    .line 5
    iget-object v2, p0, Lg9/t;->c:Ln9/i;

    .line 6
    .line 7
    iget-object v3, v0, Lg9/u;->i:Lg9/j0;

    .line 8
    .line 9
    iget-object v0, v0, Lg9/u;->d:Ln9/a;

    .line 10
    .line 11
    new-instance v4, Lg9/n0;

    .line 12
    .line 13
    iget-object v3, v3, Lg9/j0;->b:Lm9/h0;

    .line 14
    .line 15
    invoke-direct {v4, v0, v3, v1, v2}, Lg9/n0;-><init>(Ln9/a;Lm9/h0;Ld9/x0;Ln9/i;)V

    .line 16
    .line 17
    .line 18
    iget v0, v4, Lg9/n0;->d:I

    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    iput v0, v4, Lg9/n0;->d:I

    .line 23
    .line 24
    iget-object v0, v4, Lg9/n0;->e:Ln9/g;

    .line 25
    .line 26
    new-instance v1, Lb/d;

    .line 27
    .line 28
    const/16 v2, 0xf

    .line 29
    .line 30
    invoke-direct {v1, v4, v2}, Lb/d;-><init>(Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ln9/g;->a(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, v4, Lg9/n0;->f:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
