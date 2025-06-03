.class public final Lj8/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/SuccessContinuation<",
        "Lr8/c;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lj8/n$b;


# direct methods
.method public constructor <init>(Lj8/n$b;)V
    .locals 0

    iput-object p1, p0, Lj8/o;->a:Lj8/n$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    check-cast p1, Lr8/c;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const-string p1, "FirebaseCrashlytics"

    .line 7
    .line 8
    const-string v1, "Received null app settings at app startup. Cannot send cached reports"

    .line 9
    .line 10
    invoke-static {p1, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p1, p0, Lj8/o;->a:Lj8/n$b;

    .line 15
    .line 16
    iget-object p1, p1, Lj8/n$b;->b:Lj8/n;

    .line 17
    .line 18
    invoke-static {p1}, Lj8/n;->a(Lj8/n;)Lcom/google/android/gms/tasks/Task;

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lj8/o;->a:Lj8/n$b;

    .line 22
    .line 23
    iget-object p1, p1, Lj8/n$b;->b:Lj8/n;

    .line 24
    .line 25
    iget-object v1, p1, Lj8/n;->m:Lj8/d0;

    .line 26
    .line 27
    iget-object p1, p1, Lj8/n;->e:Lk8/i;

    .line 28
    .line 29
    iget-object p1, p1, Lk8/i;->a:Lk8/b;

    .line 30
    .line 31
    invoke-virtual {v1, p1, v0}, Lj8/d0;->g(Lk8/b;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lj8/o;->a:Lj8/n$b;

    .line 35
    .line 36
    iget-object p1, p1, Lj8/n$b;->b:Lj8/n;

    .line 37
    .line 38
    iget-object p1, p1, Lj8/n;->r:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
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
