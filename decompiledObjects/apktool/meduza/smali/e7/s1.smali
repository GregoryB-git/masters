.class public final Le7/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final a:Ljava/lang/String;

.field public final synthetic b:Le7/t1;


# direct methods
.method public constructor <init>(Le7/t1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Le7/s1;->b:Le7/t1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Le7/s1;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Le7/s1;->b:Le7/t1;

    .line 4
    .line 5
    iget-object p1, p1, Le7/t1;->a:Le7/j2;

    .line 6
    .line 7
    invoke-virtual {p1}, Le7/j2;->zzj()Le7/a1;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, Le7/a1;->r:Le7/b1;

    .line 12
    .line 13
    const-string p2, "Install Referrer connection returned with null binder"

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Le7/b1;->b(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    :try_start_0
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzby;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/measurement/zzbz;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Le7/s1;->b:Le7/t1;

    .line 26
    .line 27
    iget-object p1, p1, Le7/t1;->a:Le7/j2;

    .line 28
    .line 29
    invoke-virtual {p1}, Le7/j2;->zzj()Le7/a1;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object p1, p1, Le7/a1;->r:Le7/b1;

    .line 34
    .line 35
    const-string p2, "Install Referrer Service implementation was not found"

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Le7/b1;->b(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget-object p2, p0, Le7/s1;->b:Le7/t1;

    .line 42
    .line 43
    iget-object p2, p2, Le7/t1;->a:Le7/j2;

    .line 44
    .line 45
    invoke-virtual {p2}, Le7/j2;->zzj()Le7/a1;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iget-object p2, p2, Le7/a1;->w:Le7/b1;

    .line 50
    .line 51
    const-string v0, "Install Referrer Service connected"

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Le7/b1;->b(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p0, Le7/s1;->b:Le7/t1;

    .line 57
    .line 58
    iget-object p2, p2, Le7/t1;->a:Le7/j2;

    .line 59
    .line 60
    invoke-virtual {p2}, Le7/j2;->zzl()Le7/e2;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    new-instance v0, Le7/v1;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-direct {v0, p0, p1, p0, v1}, Le7/v1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, v0}, Le7/e2;->u(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :catch_0
    move-exception p1

    .line 75
    iget-object p2, p0, Le7/s1;->b:Le7/t1;

    .line 76
    .line 77
    iget-object p2, p2, Le7/t1;->a:Le7/j2;

    .line 78
    .line 79
    invoke-virtual {p2}, Le7/j2;->zzj()Le7/a1;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iget-object p2, p2, Le7/a1;->r:Le7/b1;

    .line 84
    .line 85
    const-string v0, "Exception occurred while calling Install Referrer API"

    .line 86
    .line 87
    invoke-virtual {p2, v0, p1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-void
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget-object p1, p0, Le7/s1;->b:Le7/t1;

    .line 2
    .line 3
    iget-object p1, p1, Le7/t1;->a:Le7/j2;

    .line 4
    .line 5
    invoke-virtual {p1}, Le7/j2;->zzj()Le7/a1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p1, p1, Le7/a1;->w:Le7/b1;

    .line 10
    .line 11
    const-string v0, "Install Referrer Service disconnected"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Le7/b1;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
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
