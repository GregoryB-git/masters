.class final Lcom/google/android/gms/internal/measurement/zzed$zzd;
.super Lcom/google/android/gms/internal/measurement/zzdv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzed;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zzd"
.end annotation


# instance fields
.field private final zza:Le7/j3;


# direct methods
.method public constructor <init>(Le7/j3;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzdv;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzed$zzd;->zza:Le7/j3;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzed$zzd;->zza:Le7/j3;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzed$zzd;->zza:Le7/j3;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Le7/j3;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-void
.end method
