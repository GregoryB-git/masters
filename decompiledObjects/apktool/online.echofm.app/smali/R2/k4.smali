.class public final LR2/k4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final synthetic o:LR2/C3;


# direct methods
.method public constructor <init>(LR2/C3;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/k4;->o:LR2/C3;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(LR2/k4;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    move-object/from16 v0, p3

    move-object/from16 v2, p4

    iget-object v3, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v3}, LR2/m3;->n()V

    :try_start_0
    iget-object v3, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v3}, LR2/m3;->k()LR2/S5;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/y7;->a()Z

    move-result v4

    const/4 v6, 0x1

    if-eqz v4, :cond_0

    iget-object v4, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v4}, LR2/m3;->f()LR2/g;

    move-result-object v4

    sget-object v7, LR2/K;->E0:LR2/P1;

    invoke-virtual {v4, v7}, LR2/g;->s(LR2/P1;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v6

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/H6;->a()Z

    move-result v7

    if-eqz v7, :cond_1

    iget-object v7, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v7}, LR2/m3;->f()LR2/g;

    move-result-object v7

    sget-object v8, LR2/K;->Z0:LR2/P1;

    invoke-virtual {v7, v8}, LR2/g;->s(LR2/P1;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v6

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    :goto_1
    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v9, "_cis"

    const-string v10, "Activity created with data \'referrer\' without required params"

    const-string v11, "utm_medium"

    const-string v12, "utm_source"

    const-string v13, "utm_campaign"

    const-string v15, "gclid"

    if-eqz v8, :cond_2

    :goto_2
    const/4 v3, 0x0

    goto :goto_3

    :cond_2
    :try_start_1
    invoke-virtual {v2, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    if-eqz v7, :cond_3

    const-string v8, "gbraid"

    invoke-virtual {v2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    :cond_3
    invoke-virtual {v2, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v2, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v2, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "utm_id"

    invoke-virtual {v2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "dclid"

    invoke-virtual {v2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "srsltid"

    invoke-virtual {v2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    if-eqz v4, :cond_4

    const-string v8, "sfmc_id"

    invoke-virtual {v2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    :cond_4
    invoke-virtual {v3}, LR2/m3;->j()LR2/Y1;

    move-result-object v3

    invoke-virtual {v3}, LR2/Y1;->F()LR2/a2;

    move-result-object v3

    invoke-virtual {v3, v10}, LR2/a2;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v14, "https://google.com/search?"

    invoke-direct {v8, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    invoke-virtual {v3, v8, v4, v7}, LR2/S5;->D(Landroid/net/Uri;ZZ)Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_6

    const-string v4, "referrer"

    invoke-virtual {v3, v9, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_6
    :goto_3
    const-string v4, "_cmp"

    if-eqz p1, :cond_a

    :try_start_2
    iget-object v7, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v7}, LR2/m3;->k()LR2/S5;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/measurement/y7;->a()Z

    move-result v8

    if-eqz v8, :cond_7

    iget-object v8, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v8}, LR2/m3;->f()LR2/g;

    move-result-object v8

    sget-object v14, LR2/K;->E0:LR2/P1;

    invoke-virtual {v8, v14}, LR2/g;->s(LR2/P1;)Z

    move-result v8

    if-eqz v8, :cond_7

    move v8, v6

    goto :goto_4

    :cond_7
    const/4 v8, 0x0

    :goto_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/H6;->a()Z

    move-result v14

    if-eqz v14, :cond_8

    iget-object v14, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v14}, LR2/m3;->f()LR2/g;

    move-result-object v14

    sget-object v5, LR2/K;->Z0:LR2/P1;

    invoke-virtual {v14, v5}, LR2/g;->s(LR2/P1;)Z

    move-result v5

    if-eqz v5, :cond_8

    move-object/from16 v5, p2

    move v14, v6

    goto :goto_5

    :cond_8
    move-object/from16 v5, p2

    const/4 v14, 0x0

    :goto_5
    invoke-virtual {v7, v5, v8, v14}, LR2/S5;->D(Landroid/net/Uri;ZZ)Landroid/os/Bundle;

    move-result-object v5

    if-eqz v5, :cond_a

    const-string v7, "intent"

    invoke-virtual {v5, v9, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v15}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_9

    if-eqz v3, :cond_9

    invoke-virtual {v3, v15}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_9

    const-string v7, "_cer"

    const-string v8, "gclid=%s"

    new-array v9, v6, [Ljava/lang/Object;

    invoke-virtual {v3, v15}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const/16 v16, 0x0

    aput-object v14, v9, v16

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    iget-object v7, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v7, v0, v4, v5}, LR2/C3;->z0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v7, v1, LR2/k4;->o:LR2/C3;

    iget-object v7, v7, LR2/C3;->n:LR2/c6;

    invoke-virtual {v7, v0, v5}, LR2/c6;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_a
    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_b

    return-void

    :cond_b
    iget-object v5, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v5}, LR2/m3;->j()LR2/Y1;

    move-result-object v5

    invoke-virtual {v5}, LR2/Y1;->F()LR2/a2;

    move-result-object v5

    const-string v7, "Activity created with referrer"

    invoke-virtual {v5, v7, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v5, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v5}, LR2/m3;->f()LR2/g;

    move-result-object v5

    sget-object v7, LR2/K;->l0:LR2/P1;

    invoke-virtual {v5, v7}, LR2/g;->s(LR2/P1;)Z

    move-result v5
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    const-string v7, "_ldl"

    const-string v8, "auto"

    if-eqz v5, :cond_d

    if-eqz v3, :cond_c

    :try_start_3
    iget-object v2, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v2, v0, v4, v3}, LR2/C3;->z0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v2, v1, LR2/k4;->o:LR2/C3;

    iget-object v2, v2, LR2/C3;->n:LR2/c6;

    invoke-virtual {v2, v0, v3}, LR2/c6;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_6

    :cond_c
    iget-object v0, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    move-result-object v0

    const-string v3, "Referrer does not contain valid parameters"

    invoke-virtual {v0, v3, v2}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_6
    iget-object v0, v1, LR2/k4;->o:LR2/C3;

    const/4 v2, 0x0

    invoke-virtual {v0, v8, v7, v2, v6}, LR2/C3;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void

    :cond_d
    invoke-virtual {v2, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v2, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual {v2, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual {v2, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    const-string v0, "utm_term"

    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    const-string v0, "utm_content"

    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_10

    :cond_e
    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v0, v8, v7, v2, v6}, LR2/C3;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    :cond_f
    return-void

    :cond_10
    iget-object v0, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    move-result-object v0

    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    move-result-object v0

    invoke-virtual {v0, v10}, LR2/a2;->a(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    :goto_7
    iget-object v1, v1, LR2/k4;->o:LR2/C3;

    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    move-result-object v1

    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    move-result-object v1

    const-string v2, "Throwable caught in handleReferrerForOnActivityCreated"

    invoke-virtual {v1, v2, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, LR2/k4;->o:LR2/C3;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "onActivityCreated"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    :cond_0
    :goto_0
    iget-object v0, p0, LR2/k4;->o:LR2/C3;

    .line 23
    .line 24
    invoke-virtual {v0}, LR2/G1;->s()LR2/v4;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0, p1, p2}, LR2/v4;->M(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/net/Uri;->isHierarchical()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    :goto_1
    move-object v5, v1

    .line 45
    goto :goto_2

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto/16 :goto_8

    .line 48
    .line 49
    :catch_0
    move-exception v0

    .line 50
    goto :goto_7

    .line 51
    :cond_2
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    const-string v2, "com.android.vending.referral_url"

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_3

    .line 68
    .line 69
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    const/4 v1, 0x0

    .line 75
    goto :goto_1

    .line 76
    :goto_2
    if-eqz v5, :cond_0

    .line 77
    .line 78
    invoke-virtual {v5}, Landroid/net/Uri;->isHierarchical()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_4

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    iget-object v1, p0, LR2/k4;->o:LR2/C3;

    .line 86
    .line 87
    invoke-virtual {v1}, LR2/m3;->k()LR2/S5;

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, LR2/S5;->e0(Landroid/content/Intent;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    const-string v0, "gs"

    .line 97
    .line 98
    :goto_3
    move-object v6, v0

    .line 99
    goto :goto_4

    .line 100
    :cond_5
    const-string v0, "auto"

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :goto_4
    const-string v0, "referrer"

    .line 104
    .line 105
    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    if-nez p2, :cond_6

    .line 110
    .line 111
    const/4 v0, 0x1

    .line 112
    :goto_5
    move v4, v0

    .line 113
    goto :goto_6

    .line 114
    :cond_6
    const/4 v0, 0x0

    .line 115
    goto :goto_5

    .line 116
    :goto_6
    iget-object v0, p0, LR2/k4;->o:LR2/C3;

    .line 117
    .line 118
    invoke-virtual {v0}, LR2/m3;->e()LR2/G2;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-instance v1, LR2/o4;

    .line 123
    .line 124
    move-object v2, v1

    .line 125
    move-object v3, p0

    .line 126
    invoke-direct/range {v2 .. v7}, LR2/o4;-><init>(LR2/k4;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, LR2/G2;->D(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :goto_7
    :try_start_2
    iget-object v1, p0, LR2/k4;->o:LR2/C3;

    .line 134
    .line 135
    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    const-string v2, "Throwable caught in onActivityCreated"

    .line 144
    .line 145
    invoke-virtual {v1, v2, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :goto_8
    iget-object v1, p0, LR2/k4;->o:LR2/C3;

    .line 150
    .line 151
    invoke-virtual {v1}, LR2/G1;->s()LR2/v4;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1, p1, p2}, LR2/v4;->M(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 156
    .line 157
    .line 158
    throw v0
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR2/k4;->o:LR2/C3;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/G1;->s()LR2/v4;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, LR2/v4;->K(Landroid/app/Activity;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 4

    .line 1
    iget-object v0, p0, LR2/k4;->o:LR2/C3;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/G1;->s()LR2/v4;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, LR2/v4;->Q(Landroid/app/Activity;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LR2/k4;->o:LR2/C3;

    .line 11
    .line 12
    invoke-virtual {p1}, LR2/G1;->u()LR2/l5;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, LR2/m3;->b()LE2/e;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, LE2/e;->b()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-virtual {p1}, LR2/m3;->e()LR2/G2;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v3, LR2/n5;

    .line 29
    .line 30
    invoke-direct {v3, p1, v0, v1}, LR2/n5;-><init>(LR2/l5;J)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 5

    .line 1
    iget-object v0, p0, LR2/k4;->o:LR2/C3;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/G1;->u()LR2/l5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LR2/m3;->b()LE2/e;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, LE2/e;->b()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {v0}, LR2/m3;->e()LR2/G2;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    new-instance v4, LR2/o5;

    .line 20
    .line 21
    invoke-direct {v4, v0, v1, v2}, LR2/o5;-><init>(LR2/l5;J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v4}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, LR2/k4;->o:LR2/C3;

    .line 28
    .line 29
    invoke-virtual {v0}, LR2/G1;->s()LR2/v4;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0, p1}, LR2/v4;->S(Landroid/app/Activity;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR2/k4;->o:LR2/C3;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/G1;->s()LR2/v4;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1, p2}, LR2/v4;->R(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method
