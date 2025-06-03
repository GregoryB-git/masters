.class public final Lcom/google/android/gms/internal/measurement/F3;
.super Lcom/google/android/gms/internal/measurement/G3;
.source "SourceFile"


# instance fields
.field public final e:[B

.field public final f:Z

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I


# direct methods
.method public constructor <init>([BIIZ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/G3;-><init>(Lcom/google/android/gms/internal/measurement/H3;)V

    const v0, 0x7fffffff

    iput v0, p0, Lcom/google/android/gms/internal/measurement/F3;->k:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/F3;->e:[B

    add-int/2addr p3, p2

    iput p3, p0, Lcom/google/android/gms/internal/measurement/F3;->g:I

    iput p2, p0, Lcom/google/android/gms/internal/measurement/F3;->i:I

    iput p2, p0, Lcom/google/android/gms/internal/measurement/F3;->j:I

    iput-boolean p4, p0, Lcom/google/android/gms/internal/measurement/F3;->f:Z

    return-void
.end method

.method public synthetic constructor <init>([BIIZLcom/google/android/gms/internal/measurement/I3;)V
    .locals 0

    .line 2
    const/4 p2, 0x0

    invoke-direct {p0, p1, p2, p3, p2}, Lcom/google/android/gms/internal/measurement/F3;-><init>([BIIZ)V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .line 1
    if-ltz p1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/G3;->d()I

    move-result v0

    add-int/2addr p1, v0

    if-ltz p1, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/F3;->k:I

    if-gt p1, v0, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/measurement/F3;->k:I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/F3;->f()V

    return v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->f()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p1

    throw p1

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->e()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p1

    throw p1

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->d()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p1

    throw p1
.end method

.method public final d()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/F3;->i:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/F3;->j:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final f()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/F3;->g:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/F3;->h:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/F3;->g:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/F3;->j:I

    sub-int v1, v0, v1

    iget v2, p0, Lcom/google/android/gms/internal/measurement/F3;->k:I

    if-le v1, v2, :cond_0

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/google/android/gms/internal/measurement/F3;->h:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/F3;->g:I

    return-void

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/F3;->h:I

    return-void
.end method
