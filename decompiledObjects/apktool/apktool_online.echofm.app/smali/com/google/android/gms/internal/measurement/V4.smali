.class public final enum Lcom/google/android/gms/internal/measurement/V4;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum o:Lcom/google/android/gms/internal/measurement/V4;

.field public static final enum p:Lcom/google/android/gms/internal/measurement/V4;

.field public static final enum q:Lcom/google/android/gms/internal/measurement/V4;

.field public static final synthetic r:[Lcom/google/android/gms/internal/measurement/V4;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/measurement/V4;

    const-string v1, "PROTO2"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/V4;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/V4;->o:Lcom/google/android/gms/internal/measurement/V4;

    new-instance v1, Lcom/google/android/gms/internal/measurement/V4;

    const-string v3, "PROTO3"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/V4;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/V4;->p:Lcom/google/android/gms/internal/measurement/V4;

    new-instance v3, Lcom/google/android/gms/internal/measurement/V4;

    const-string v5, "EDITIONS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/google/android/gms/internal/measurement/V4;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/google/android/gms/internal/measurement/V4;->q:Lcom/google/android/gms/internal/measurement/V4;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/google/android/gms/internal/measurement/V4;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/google/android/gms/internal/measurement/V4;->r:[Lcom/google/android/gms/internal/measurement/V4;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/measurement/V4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/V4;->r:[Lcom/google/android/gms/internal/measurement/V4;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/V4;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/V4;

    return-object v0
.end method
