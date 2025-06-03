.class public abstract Lcom/google/android/play/core/review/internal/zzg;
.super Lcom/google/android/play/core/review/internal/zzb;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/play/core/review/internal/zzb;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(ILandroid/os/Parcel;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    if-ne p1, v1, :cond_3

    .line 4
    .line 5
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 6
    .line 7
    sget v1, Lk7/a;->a:I

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroid/os/Parcelable;

    .line 22
    .line 23
    :goto_0
    check-cast p1, Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/os/Parcel;->dataAvail()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-gtz p2, :cond_2

    .line 30
    .line 31
    move-object p2, p0

    .line 32
    check-cast p2, Lj7/g;

    .line 33
    .line 34
    iget-object v1, p2, Lj7/g;->c:Lj7/h;

    .line 35
    .line 36
    iget-object v1, v1, Lj7/h;->a:Lk7/n;

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v2, p2, Lj7/g;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 41
    .line 42
    iget-object v3, v1, Lk7/n;->f:Ljava/lang/Object;

    .line 43
    .line 44
    monitor-enter v3

    .line 45
    :try_start_0
    iget-object v4, v1, Lk7/n;->e:Ljava/util/HashSet;

    .line 46
    .line 47
    invoke-virtual {v4, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    new-instance v2, Lk7/i;

    .line 52
    .line 53
    invoke-direct {v2, v1}, Lk7/i;-><init>(Lk7/n;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lk7/n;->a()Landroid/os/Handler;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw p1

    .line 67
    :cond_1
    :goto_1
    iget-object v1, p2, Lj7/g;->a:Lk7/d;

    .line 68
    .line 69
    const-string v2, "onGetLaunchReviewFlowInfo"

    .line 70
    .line 71
    new-array v0, v0, [Ljava/lang/Object;

    .line 72
    .line 73
    invoke-virtual {v1, v2, v0}, Lk7/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    const-string v0, "confirmation_intent"

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Landroid/app/PendingIntent;

    .line 83
    .line 84
    const-string v1, "is_review_no_op"

    .line 85
    .line 86
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    new-instance v1, Lj7/c;

    .line 91
    .line 92
    invoke-direct {v1, v0, p1}, Lj7/c;-><init>(Landroid/app/PendingIntent;Z)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p2, Lj7/g;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 96
    .line 97
    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    const/4 p1, 0x1

    .line 101
    return p1

    .line 102
    :cond_2
    new-instance p1, Landroid/os/BadParcelableException;

    .line 103
    .line 104
    const-string v0, "Parcel data not fully consumed, unread size: "

    .line 105
    .line 106
    invoke-static {v0, p2}, Lf;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-direct {p1, p2}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :cond_3
    return v0
    .line 115
.end method
