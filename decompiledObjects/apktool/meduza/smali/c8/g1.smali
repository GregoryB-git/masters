.class public final Lc8/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/b;


# instance fields
.field public final a:I

.field public final b:Ln7/f;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzahg;)V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;->zzg()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;->zzc()Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;->zzb()Ljava/lang/String;

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;->zzb()Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;->zzh()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    if-nez v0, :cond_1

    iput v2, p0, Lc8/g1;->a:I

    iput-object v1, p0, Lc8/g1;->b:Ln7/f;

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;->zzd()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v5, 0x5

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x4

    sparse-switch v4, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v4, "RECOVER_EMAIL"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move v3, v5

    goto :goto_1

    :sswitch_1
    const-string v4, "EMAIL_SIGNIN"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move v3, v9

    goto :goto_1

    :sswitch_2
    const-string v4, "VERIFY_AND_CHANGE_EMAIL"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    move v3, v2

    goto :goto_1

    :sswitch_3
    const-string v4, "VERIFY_EMAIL"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    move v3, v6

    goto :goto_1

    :sswitch_4
    const-string v4, "PASSWORD_RESET"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    move v3, v7

    goto :goto_1

    :sswitch_5
    const-string v4, "REVERT_SECOND_FACTOR_ADDITION"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    move v3, v8

    :goto_1
    packed-switch v3, :pswitch_data_0

    move v5, v2

    goto :goto_2

    :pswitch_0
    move v5, v6

    goto :goto_2

    :pswitch_1
    move v5, v9

    goto :goto_2

    :pswitch_2
    move v5, v7

    goto :goto_2

    :pswitch_3
    move v5, v8

    goto :goto_2

    :pswitch_4
    const/4 v5, 0x6

    :goto_2
    :pswitch_5
    iput v5, p0, Lc8/g1;->a:I

    if-eq v5, v9, :cond_c

    if-ne v5, v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;->zzf()Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance v1, Lc8/e1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzagz;

    move-result-object p1

    invoke-static {p1}, Lx6/b;->F0(Lcom/google/android/gms/internal/firebase-auth-api/zzagz;)Lb8/x;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lc8/e1;-><init>(Ljava/lang/String;Lb8/x;)V

    goto :goto_3

    :cond_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;->zzg()Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v1, Lc8/f1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;->zzb()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lc8/f1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_a
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;->zze()Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v1, Lc8/e1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;->zzb()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lc8/e1;-><init>(Ljava/lang/String;)V

    :cond_b
    :goto_3
    iput-object v1, p0, Lc8/g1;->b:Ln7/f;

    return-void

    :cond_c
    :goto_4
    iput-object v1, p0, Lc8/g1;->b:Ln7/f;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6fbac124 -> :sswitch_5
        -0x56916d75 -> :sswitch_4
        -0x4ffacbca -> :sswitch_3
        -0x4183d145 -> :sswitch_2
        0x33e669c5 -> :sswitch_1
        0x39d86cc1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lc8/g1;->a:I

    return v0
.end method

.method public final b()Ln7/f;
    .locals 1

    iget-object v0, p0, Lc8/g1;->b:Ln7/f;

    return-object v0
.end method
