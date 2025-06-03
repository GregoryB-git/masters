.class public final Le7/j1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final a:Le7/i6;

.field public b:Z

.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Le7/j1;

    return-void
.end method

.method public constructor <init>(Le7/i6;)V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p1, p0, Le7/j1;->a:Le7/i6;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Le7/j1;->a:Le7/i6;

    .line 2
    .line 3
    invoke-virtual {v0}, Le7/i6;->d0()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le7/j1;->a:Le7/i6;

    .line 7
    .line 8
    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Le7/e2;->l()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Le7/j1;->a:Le7/i6;

    .line 16
    .line 17
    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Le7/e2;->l()V

    .line 22
    .line 23
    .line 24
    iget-boolean v0, p0, Le7/j1;->b:Z

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v0, p0, Le7/j1;->a:Le7/i6;

    .line 30
    .line 31
    invoke-virtual {v0}, Le7/i6;->zzj()Le7/a1;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v0, v0, Le7/a1;->w:Le7/b1;

    .line 36
    .line 37
    const-string v1, "Unregistering connectivity change receiver"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    iput-boolean v0, p0, Le7/j1;->b:Z

    .line 44
    .line 45
    iput-boolean v0, p0, Le7/j1;->c:Z

    .line 46
    .line 47
    iget-object v0, p0, Le7/j1;->a:Le7/i6;

    .line 48
    .line 49
    iget-object v0, v0, Le7/i6;->t:Le7/j2;

    .line 50
    .line 51
    iget-object v0, v0, Le7/j2;->a:Landroid/content/Context;

    .line 52
    .line 53
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catch_0
    move-exception v0

    .line 58
    iget-object v1, p0, Le7/j1;->a:Le7/i6;

    .line 59
    .line 60
    invoke-virtual {v1}, Le7/i6;->zzj()Le7/a1;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v1, v1, Le7/a1;->o:Le7/b1;

    .line 65
    .line 66
    const-string v2, "Failed to unregister the network broadcast receiver"

    .line 67
    .line 68
    invoke-virtual {v1, v2, v0}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-void
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

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object p1, p0, Le7/j1;->a:Le7/i6;

    .line 2
    .line 3
    invoke-virtual {p1}, Le7/i6;->d0()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p2, p0, Le7/j1;->a:Le7/i6;

    .line 11
    .line 12
    invoke-virtual {p2}, Le7/i6;->zzj()Le7/a1;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    iget-object p2, p2, Le7/a1;->w:Le7/b1;

    .line 17
    .line 18
    const-string v0, "NetworkBroadcastReceiver received action"

    .line 19
    .line 20
    invoke-virtual {p2, v0, p1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const-string p2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 24
    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, Le7/j1;->a:Le7/i6;

    .line 32
    .line 33
    iget-object p1, p1, Le7/i6;->b:Le7/g1;

    .line 34
    .line 35
    invoke-static {p1}, Le7/i6;->q(Le7/h6;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Le7/g1;->u()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iget-boolean p2, p0, Le7/j1;->c:Z

    .line 43
    .line 44
    if-eq p2, p1, :cond_0

    .line 45
    .line 46
    iput-boolean p1, p0, Le7/j1;->c:Z

    .line 47
    .line 48
    iget-object p2, p0, Le7/j1;->a:Le7/i6;

    .line 49
    .line 50
    invoke-virtual {p2}, Le7/i6;->zzl()Le7/e2;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    new-instance v0, Le7/m1;

    .line 55
    .line 56
    invoke-direct {v0, p0, p1}, Le7/m1;-><init>(Le7/j1;Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v0}, Le7/e2;->u(Ljava/lang/Runnable;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    return-void

    .line 63
    :cond_1
    iget-object p2, p0, Le7/j1;->a:Le7/i6;

    .line 64
    .line 65
    invoke-virtual {p2}, Le7/i6;->zzj()Le7/a1;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    iget-object p2, p2, Le7/a1;->r:Le7/b1;

    .line 70
    .line 71
    const-string v0, "NetworkBroadcastReceiver received unknown action"

    .line 72
    .line 73
    invoke-virtual {p2, v0, p1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
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
