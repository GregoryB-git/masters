.class public final enum Lcom/google/android/gms/internal/measurement/V3;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum p:Lcom/google/android/gms/internal/measurement/V3;

.field public static final enum q:Lcom/google/android/gms/internal/measurement/V3;

.field public static final enum r:Lcom/google/android/gms/internal/measurement/V3;

.field public static final enum s:Lcom/google/android/gms/internal/measurement/V3;

.field public static final synthetic t:[Lcom/google/android/gms/internal/measurement/V3;


# instance fields
.field public final o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/google/android/gms/internal/measurement/V3;

    const-string v1, "SCALAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/measurement/V3;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/V3;->p:Lcom/google/android/gms/internal/measurement/V3;

    new-instance v1, Lcom/google/android/gms/internal/measurement/V3;

    const-string v3, "VECTOR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/measurement/V3;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/V3;->q:Lcom/google/android/gms/internal/measurement/V3;

    new-instance v3, Lcom/google/android/gms/internal/measurement/V3;

    const-string v5, "PACKED_VECTOR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v4}, Lcom/google/android/gms/internal/measurement/V3;-><init>(Ljava/lang/String;IZ)V

    sput-object v3, Lcom/google/android/gms/internal/measurement/V3;->r:Lcom/google/android/gms/internal/measurement/V3;

    new-instance v5, Lcom/google/android/gms/internal/measurement/V3;

    const-string v7, "MAP"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v2}, Lcom/google/android/gms/internal/measurement/V3;-><init>(Ljava/lang/String;IZ)V

    sput-object v5, Lcom/google/android/gms/internal/measurement/V3;->s:Lcom/google/android/gms/internal/measurement/V3;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/google/android/gms/internal/measurement/V3;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/google/android/gms/internal/measurement/V3;->t:[Lcom/google/android/gms/internal/measurement/V3;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lcom/google/android/gms/internal/measurement/V3;->o:Z

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/measurement/V3;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/V3;->t:[Lcom/google/android/gms/internal/measurement/V3;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/V3;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/V3;

    return-object v0
.end method
