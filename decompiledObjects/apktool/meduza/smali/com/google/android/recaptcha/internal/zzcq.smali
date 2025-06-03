.class public final Lcom/google/android/recaptcha/internal/zzcq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static zza:Lcom/google/android/recaptcha/internal/zzcv;


# direct methods
.method public static final zza(Landroid/app/Application;)Lcom/google/android/recaptcha/internal/zzcv;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzcq;->zza:Lcom/google/android/recaptcha/internal/zzcv;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/recaptcha/internal/zzcv;

    invoke-direct {v0, p0}, Lcom/google/android/recaptcha/internal/zzcv;-><init>(Landroid/app/Application;)V

    :cond_0
    sget-object p0, Lcom/google/android/recaptcha/internal/zzcq;->zza:Lcom/google/android/recaptcha/internal/zzcv;

    if-nez p0, :cond_1

    sput-object v0, Lcom/google/android/recaptcha/internal/zzcq;->zza:Lcom/google/android/recaptcha/internal/zzcv;

    :cond_1
    return-object v0
.end method

.method public static final zzb(Landroid/app/Application;Ljava/lang/String;JLub/e;)Ljava/lang/Object;
    .locals 10

    invoke-static {p0}, Lcom/google/android/recaptcha/internal/zzcq;->zza(Landroid/app/Application;)Lcom/google/android/recaptcha/internal/zzcv;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x1c

    const/4 v9, 0x0

    move-object v1, p1

    move-wide v2, p2

    move-object v7, p4

    invoke-static/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzcv;->zzh(Lcom/google/android/recaptcha/internal/zzcv;Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzcn;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzch;Lub/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final zzc(Landroid/app/Application;Ljava/lang/String;J)Lcom/google/android/gms/tasks/Task;
    .locals 8

    invoke-static {p0}, Lcom/google/android/recaptcha/internal/zzcq;->zza(Landroid/app/Application;)Lcom/google/android/recaptcha/internal/zzcv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzcv;->zzd()Lcom/google/android/recaptcha/internal/zzbi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzbi;->zza()Lnc/d0;

    move-result-object v0

    new-instance v7, Lcom/google/android/recaptcha/internal/zzco;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    invoke-direct/range {v1 .. v6}, Lcom/google/android/recaptcha/internal/zzco;-><init>(Landroid/app/Application;Ljava/lang/String;JLub/e;)V

    invoke-static {v0, v7}, Lx6/b;->h(Lnc/d0;Ldc/p;)Lnc/k0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/recaptcha/internal/zzas;->zza(Lnc/j0;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static final zzd(Landroid/app/Application;Ljava/lang/String;Lub/e;)Ljava/lang/Object;
    .locals 7

    invoke-static {p0}, Lcom/google/android/recaptcha/internal/zzcq;->zza(Landroid/app/Application;)Lcom/google/android/recaptcha/internal/zzcv;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p1

    move-object v4, p2

    invoke-static/range {v0 .. v6}, Lcom/google/android/recaptcha/internal/zzcv;->zzf(Lcom/google/android/recaptcha/internal/zzcv;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzcn;Lcom/google/android/recaptcha/internal/zzbi;Lub/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final zze(Landroid/app/Application;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    invoke-static {p0}, Lcom/google/android/recaptcha/internal/zzcq;->zza(Landroid/app/Application;)Lcom/google/android/recaptcha/internal/zzcv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzcv;->zzd()Lcom/google/android/recaptcha/internal/zzbi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzbi;->zza()Lnc/d0;

    move-result-object v0

    new-instance v1, Lcom/google/android/recaptcha/internal/zzcp;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/google/android/recaptcha/internal/zzcp;-><init>(Landroid/app/Application;Ljava/lang/String;Lub/e;)V

    invoke-static {v0, v1}, Lx6/b;->h(Lnc/d0;Ldc/p;)Lnc/k0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/recaptcha/internal/zzas;->zza(Lnc/j0;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method
