.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzaih;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Ljava/lang/String;

.field private zzc:Ljava/lang/String;

.field private zzd:Ljava/lang/String;

.field private zze:Ljava/lang/String;

.field private zzf:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zza(Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/internal/firebase-auth-api/zzaih;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;-><init>()V

    invoke-static {p0}, Lm6/j;->e(Ljava/lang/String;)V

    iput-object p0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;->zzb:Ljava/lang/String;

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    iput-object p1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;->zzc:Ljava/lang/String;

    iput-boolean p2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;->zzf:Z

    return-object v0
.end method

.method public static zzb(Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/internal/firebase-auth-api/zzaih;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;-><init>()V

    invoke-static {p0}, Lm6/j;->e(Ljava/lang/String;)V

    iput-object p0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;->zza:Ljava/lang/String;

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    iput-object p1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;->zzd:Ljava/lang/String;

    iput-boolean p2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;->zzf:Z

    return-object v0
.end method


# virtual methods
.method public final zza()Ljava/lang/String;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;->zzd:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;->zza:Ljava/lang/String;

    const-string v2, "phoneNumber"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;->zzd:Ljava/lang/String;

    const-string v2, "temporaryProof"

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;->zzb:Ljava/lang/String;

    const-string v2, "sessionInfo"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;->zzc:Ljava/lang/String;

    const-string v2, "code"

    :goto_0
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;->zze:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v2, "idToken"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;->zzf:Z

    if-nez v1, :cond_2

    const/4 v1, 0x2

    const-string v2, "operation"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_2
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaih;->zze:Ljava/lang/String;

    return-void
.end method
