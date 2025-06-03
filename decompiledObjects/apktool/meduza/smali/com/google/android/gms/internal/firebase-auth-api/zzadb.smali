.class final Lcom/google/android/gms/internal/firebase-auth-api/zzadb;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzaeg;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/firebase-auth-api/zzaeg<",
        "Ljava/lang/Void;",
        "Lc8/z0;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzaa:Ljava/lang/String;

.field private final zzab:Ljava/lang/String;

.field private final zzac:Ljava/lang/String;

.field private final zzad:Z

.field private final zzu:Ljava/lang/String;

.field private final zzv:Ljava/lang/String;

.field private final zzw:Ljava/lang/String;

.field private final zzx:J

.field private final zzy:Z

.field private final zzz:Z


# direct methods
.method public constructor <init>(Lc8/n;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaeg;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Lc8/n;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzu:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzv:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzw:Ljava/lang/String;

    .line 22
    .line 23
    iput-wide p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzx:J

    .line 24
    .line 25
    iput-boolean p6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzy:Z

    .line 26
    .line 27
    iput-boolean p7, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzz:Z

    .line 28
    .line 29
    iput-object p8, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzaa:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p9, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzab:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p10, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzac:Ljava/lang/String;

    .line 34
    .line 35
    iput-boolean p11, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzad:Z

    .line 36
    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method


# virtual methods
.method public final zza()Ljava/lang/String;
    .locals 1

    const-string v0, "startMfaEnrollment"

    return-object v0
.end method

.method public final zza(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/internal/firebase-auth-api/zzado;)V
    .locals 15

    move-object v0, p0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzaeq;

    move-object/from16 v2, p1

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaeq;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzaeg;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaeg;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzaeh;

    iget-object v3, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzu:Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzv:Ljava/lang/String;

    iget-object v5, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzw:Ljava/lang/String;

    iget-wide v6, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzx:J

    iget-boolean v8, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzy:Z

    iget-boolean v9, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzz:Z

    iget-object v10, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzaa:Ljava/lang/String;

    iget-object v11, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzab:Ljava/lang/String;

    iget-object v12, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzac:Ljava/lang/String;

    iget-boolean v13, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadb;->zzad:Z

    iget-object v14, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaeg;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzaei;

    move-object/from16 v2, p2

    invoke-virtual/range {v2 .. v14}, Lcom/google/android/gms/internal/firebase-auth-api/zzado;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/firebase-auth-api/zzadm;)V

    return-void
.end method

.method public final zzb()V
    .locals 0

    return-void
.end method
