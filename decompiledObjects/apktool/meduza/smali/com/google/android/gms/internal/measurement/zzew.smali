.class final Lcom/google/android/gms/internal/measurement/zzew;
.super Lcom/google/android/gms/internal/measurement/zzdu;
.source "SourceFile"


# instance fields
.field private final synthetic zza:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzet;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzew;->zza:Ljava/lang/Runnable;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzdu;-><init>()V

    return-void
.end method


# virtual methods
.method public final a_()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzew;->zza:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
