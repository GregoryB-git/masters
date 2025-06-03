.class public final Lz2/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final o:Lz2/U;

.field public final synthetic p:Lz2/X;


# direct methods
.method public constructor <init>(Lz2/X;Lz2/U;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/W;->p:Lz2/X;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lz2/W;->o:Lz2/U;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lz2/W;->p:Lz2/X;

    .line 2
    .line 3
    iget-boolean v0, v0, Lz2/X;->p:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lz2/W;->o:Lz2/U;

    .line 9
    .line 10
    invoke-virtual {v0}, Lz2/U;->b()Lx2/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lx2/b;->g()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lz2/W;->p:Lz2/X;

    .line 21
    .line 22
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->o:Lz2/g;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0}, Lx2/b;->f()Landroid/app/PendingIntent;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/app/PendingIntent;

    .line 37
    .line 38
    iget-object v3, p0, Lz2/W;->o:Lz2/U;

    .line 39
    .line 40
    invoke-virtual {v3}, Lz2/U;->a()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-static {v1, v0, v3, v4}, Lcom/google/android/gms/common/api/GoogleApiActivity;->a(Landroid/content/Context;Landroid/app/PendingIntent;IZ)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-interface {v2, v0, v1}, Lz2/g;->startActivityForResult(Landroid/content/Intent;I)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    iget-object v1, p0, Lz2/W;->p:Lz2/X;

    .line 55
    .line 56
    iget-object v2, v1, Lz2/X;->s:Lx2/j;

    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0}, Lx2/b;->a()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/4 v4, 0x0

    .line 67
    invoke-virtual {v2, v1, v3, v4}, Lx2/j;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    iget-object v1, p0, Lz2/W;->p:Lz2/X;

    .line 74
    .line 75
    iget-object v2, v1, Lz2/X;->s:Lx2/j;

    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    iget-object v1, p0, Lz2/W;->p:Lz2/X;

    .line 82
    .line 83
    iget-object v4, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->o:Lz2/g;

    .line 84
    .line 85
    invoke-virtual {v0}, Lx2/b;->a()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    const/4 v6, 0x2

    .line 90
    iget-object v7, p0, Lz2/W;->p:Lz2/X;

    .line 91
    .line 92
    invoke-virtual/range {v2 .. v7}, Lx2/j;->v(Landroid/app/Activity;Lz2/g;IILandroid/content/DialogInterface$OnCancelListener;)Z

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_2
    invoke-virtual {v0}, Lx2/b;->a()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    const/16 v2, 0x12

    .line 101
    .line 102
    if-ne v1, v2, :cond_3

    .line 103
    .line 104
    iget-object v0, p0, Lz2/W;->p:Lz2/X;

    .line 105
    .line 106
    iget-object v1, v0, Lz2/X;->s:Lx2/j;

    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iget-object v2, p0, Lz2/W;->p:Lz2/X;

    .line 113
    .line 114
    invoke-virtual {v1, v0, v2}, Lx2/j;->q(Landroid/app/Activity;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v1, p0, Lz2/W;->p:Lz2/X;

    .line 119
    .line 120
    iget-object v2, v1, Lz2/X;->s:Lx2/j;

    .line 121
    .line 122
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    new-instance v3, Lz2/V;

    .line 131
    .line 132
    invoke-direct {v3, p0, v0}, Lz2/V;-><init>(Lz2/W;Landroid/app/Dialog;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v1, v3}, Lx2/j;->r(Landroid/content/Context;Lz2/D;)Lz2/E;

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_3
    iget-object v1, p0, Lz2/W;->p:Lz2/X;

    .line 140
    .line 141
    iget-object v2, p0, Lz2/W;->o:Lz2/U;

    .line 142
    .line 143
    invoke-virtual {v2}, Lz2/U;->a()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    invoke-static {v1, v0, v2}, Lz2/X;->q(Lz2/X;Lx2/b;I)V

    .line 148
    .line 149
    .line 150
    return-void
.end method
