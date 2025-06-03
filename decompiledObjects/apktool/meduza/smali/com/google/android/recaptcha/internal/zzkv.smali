.class final Lcom/google/android/recaptcha/internal/zzkv;
.super Lcom/google/android/recaptcha/internal/zzkr;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lcom/google/android/recaptcha/internal/zzor;


# static fields
.field private static final zza:[Z


# instance fields
.field private zzb:[Z

.field private zzc:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Z

    sput-object v1, Lcom/google/android/recaptcha/internal/zzkv;->zza:[Z

    new-instance v2, Lcom/google/android/recaptcha/internal/zzkv;

    invoke-direct {v2, v1, v0, v0}, Lcom/google/android/recaptcha/internal/zzkv;-><init>([ZIZ)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    sget-object v0, Lcom/google/android/recaptcha/internal/zzkv;->zza:[Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/recaptcha/internal/zzkv;-><init>([ZIZ)V

    return-void
.end method

.method private constructor <init>([ZIZ)V
    .locals 0

    invoke-direct {p0, p3}, Lcom/google/android/recaptcha/internal/zzkr;-><init>(Z)V

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    iput p2, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    return-void
.end method

.method private static zzg(I)I
    .locals 1

    mul-int/lit8 p0, p0, 0x3

    div-int/lit8 p0, p0, 0x2

    add-int/lit8 p0, p0, 0x1

    const/16 v0, 0xa

    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method private final zzh(I)Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    .line 2
    .line 3
    const-string v1, "Index:"

    .line 4
    .line 5
    const-string v2, ", Size:"

    .line 6
    .line 7
    invoke-static {v1, p1, v2, v0}, Lf;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method private final zzi(I)V
    .locals 1

    if-ltz p1, :cond_0

    iget v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0, p1}, Lcom/google/android/recaptcha/internal/zzkv;->zzh(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final synthetic add(ILjava/lang/Object;)V
    .locals 4

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzkr;->zza()V

    if-ltz p1, :cond_1

    iget v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    if-gt p1, v0, :cond_1

    add-int/lit8 v1, p1, 0x1

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    array-length v3, v2

    if-ge v0, v3, :cond_0

    sub-int/2addr v0, p1

    invoke-static {v2, p1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    invoke-static {v3}, Lcom/google/android/recaptcha/internal/zzkv;->zzg(I)I

    move-result v0

    new-array v0, v0, [Z

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    iget v3, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    sub-int/2addr v3, p1

    invoke-static {v2, p1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    :goto_0
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    aput-boolean p2, v0, p1

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0, p1}, Lcom/google/android/recaptcha/internal/zzkv;->zzh(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzkv;->zze(Z)V

    const/4 p1, 0x1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzkr;->zza()V

    sget-object v0, Lcom/google/android/recaptcha/internal/zznl;->zza:Ljava/nio/charset/Charset;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, Lcom/google/android/recaptcha/internal/zzkv;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lcom/google/android/recaptcha/internal/zzkr;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    :cond_0
    check-cast p1, Lcom/google/android/recaptcha/internal/zzkv;

    iget v0, p1, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget v2, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    const v3, 0x7fffffff

    sub-int/2addr v3, v2

    if-lt v3, v0, :cond_3

    add-int/2addr v2, v0

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    array-length v3, v0

    if-le v2, v3, :cond_2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    :cond_2
    iget-object v0, p1, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    iget v4, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    iget p1, p1, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    invoke-static {v0, v1, v3, v4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v2, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return v0

    :cond_3
    new-instance p1, Ljava/lang/OutOfMemoryError;

    invoke-direct {p1}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/recaptcha/internal/zzkv;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/recaptcha/internal/zzkv;

    if-nez v1, :cond_1

    invoke-super {p0, p1}, Lcom/google/android/recaptcha/internal/zzkr;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    check-cast p1, Lcom/google/android/recaptcha/internal/zzkv;

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    iget v2, p1, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    :cond_2
    iget-object p1, p1, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    move v1, v3

    :goto_0
    iget v2, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    if-ge v1, v2, :cond_4

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    aget-boolean v2, v2, v1

    aget-boolean v4, p1, v1

    if-eq v2, v4, :cond_3

    return v3

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public final synthetic get(I)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/recaptcha/internal/zzkv;->zzi(I)V

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    aget-boolean p1, v0, p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    if-ge v1, v2, :cond_0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    aget-boolean v2, v2, v1

    invoke-static {v2}, Lcom/google/android/recaptcha/internal/zznl;->zza(Z)I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 4

    instance-of v0, p1, Ljava/lang/Boolean;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    aget-boolean v3, v3, v2

    if-ne v3, p1, :cond_1

    return v2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final bridge synthetic remove(I)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzkr;->zza()V

    invoke-direct {p0, p1}, Lcom/google/android/recaptcha/internal/zzkv;->zzi(I)V

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    aget-boolean v1, v0, p1

    iget v2, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    add-int/lit8 v3, v2, -0x1

    if-ge p1, v3, :cond_0

    add-int/lit8 v3, p1, 0x1

    sub-int/2addr v2, p1

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, v3, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    iget p1, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final removeRange(II)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzkr;->zza()V

    if-lt p2, p1, :cond_0

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    sub-int/2addr v1, p2

    invoke-static {v0, p2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    sub-int/2addr p2, p1

    sub-int/2addr v0, p2

    iput v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "toIndex < fromIndex"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzkr;->zza()V

    invoke-direct {p0, p1}, Lcom/google/android/recaptcha/internal/zzkv;->zzi(I)V

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    aget-boolean v1, v0, p1

    aput-boolean p2, v0, p1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    return v0
.end method

.method public final bridge synthetic zzd(I)Lcom/google/android/recaptcha/internal/zznk;
    .locals 3

    iget v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    if-lt p1, v0, :cond_1

    if-nez p1, :cond_0

    sget-object p1, Lcom/google/android/recaptcha/internal/zzkv;->zza:[Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    :goto_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzkv;

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/recaptcha/internal/zzkv;-><init>([ZIZ)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final zze(Z)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzkr;->zza()V

    iget v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    array-length v1, v1

    if-ne v0, v1, :cond_0

    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzkv;->zzg(I)I

    move-result v0

    new-array v0, v0, [Z

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    iget v2, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzc:I

    aput-boolean p1, v0, v1

    return-void
.end method

.method public final zzf(I)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/recaptcha/internal/zzkv;->zzi(I)V

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzkv;->zzb:[Z

    aget-boolean p1, v0, p1

    return p1
.end method
