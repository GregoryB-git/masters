.class public final enum Lcom/google/android/gms/internal/measurement/I1$d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/e4;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/I1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field public static final enum p:Lcom/google/android/gms/internal/measurement/I1$d;

.field public static final enum q:Lcom/google/android/gms/internal/measurement/I1$d;

.field public static final enum r:Lcom/google/android/gms/internal/measurement/I1$d;

.field public static final s:Lcom/google/android/gms/internal/measurement/d4;

.field public static final synthetic t:[Lcom/google/android/gms/internal/measurement/I1$d;


# instance fields
.field public final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/measurement/I1$d;

    const-string v1, "CONSENT_STATUS_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/measurement/I1$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/I1$d;->p:Lcom/google/android/gms/internal/measurement/I1$d;

    new-instance v1, Lcom/google/android/gms/internal/measurement/I1$d;

    const-string v3, "GRANTED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/measurement/I1$d;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/I1$d;->q:Lcom/google/android/gms/internal/measurement/I1$d;

    new-instance v3, Lcom/google/android/gms/internal/measurement/I1$d;

    const-string v5, "DENIED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/google/android/gms/internal/measurement/I1$d;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/measurement/I1$d;->r:Lcom/google/android/gms/internal/measurement/I1$d;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/google/android/gms/internal/measurement/I1$d;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/google/android/gms/internal/measurement/I1$d;->t:[Lcom/google/android/gms/internal/measurement/I1$d;

    new-instance v0, Lcom/google/android/gms/internal/measurement/P1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/P1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/I1$d;->s:Lcom/google/android/gms/internal/measurement/d4;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/measurement/I1$d;->o:I

    return-void
.end method

.method public static c(I)Lcom/google/android/gms/internal/measurement/I1$d;
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/measurement/I1$d;->r:Lcom/google/android/gms/internal/measurement/I1$d;

    return-object p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/measurement/I1$d;->q:Lcom/google/android/gms/internal/measurement/I1$d;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/measurement/I1$d;->p:Lcom/google/android/gms/internal/measurement/I1$d;

    return-object p0
.end method

.method public static e()Lcom/google/android/gms/internal/measurement/g4;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/Q1;->a:Lcom/google/android/gms/internal/measurement/g4;

    return-object v0
.end method

.method public static values()[Lcom/google/android/gms/internal/measurement/I1$d;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/I1$d;->t:[Lcom/google/android/gms/internal/measurement/I1$d;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/I1$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/I1$d;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/I1$d;->o:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, Lcom/google/android/gms/internal/measurement/I1$d;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/gms/internal/measurement/I1$d;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
