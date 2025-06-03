.class final Lcom/google/android/gms/internal/firebase-auth-api/zzalb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzamf;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzalk;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzalk;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzala;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzala;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzalb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzalk;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzalc;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/android/gms/internal/firebase-auth-api/zzalk;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakh;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzakh;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzalb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzalk;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalc;-><init>([Lcom/google/android/gms/internal/firebase-auth-api/zzalk;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalb;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzalk;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzalk;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaki;->zza(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzalk;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzalk;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamc<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzalk;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalk;->zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzall;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzall;->zzc()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzajz;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    move-result-object v0

    invoke-interface {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzall;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalt;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Lcom/google/android/gms/internal/firebase-auth-api/zzajx;Lcom/google/android/gms/internal/firebase-auth-api/zzaln;)Lcom/google/android/gms/internal/firebase-auth-api/zzalt;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzalx;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzalv;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakz;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    move-result-object v5

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzald;->zza:[I

    invoke-interface {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzall;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzalz;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzajz;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    move-object v6, v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzali;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzall;Lcom/google/android/gms/internal/firebase-auth-api/zzalv;Lcom/google/android/gms/internal/firebase-auth-api/zzakx;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Lcom/google/android/gms/internal/firebase-auth-api/zzajx;Lcom/google/android/gms/internal/firebase-auth-api/zzalg;)Lcom/google/android/gms/internal/firebase-auth-api/zzalr;

    move-result-object p1

    return-object p1
.end method
