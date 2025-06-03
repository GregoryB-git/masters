.class final Lcom/google/android/gms/internal/firebase-auth-api/zzalr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzamc;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzamc<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final zza:[I

.field private static final zzb:Lsun/misc/Unsafe;


# instance fields
.field private final zzc:[I

.field private final zzd:[Ljava/lang/Object;

.field private final zze:I

.field private final zzf:I

.field private final zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

.field private final zzh:Z

.field private final zzi:Z

.field private final zzj:Z

.field private final zzk:[I

.field private final zzl:I

.field private final zzm:I

.field private final zzn:Lcom/google/android/gms/internal/firebase-auth-api/zzalv;

.field private final zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

.field private final zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamv<",
            "**>;"
        }
    .end annotation
.end field

.field private final zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzajx<",
            "*>;"
        }
    .end annotation
.end field

.field private final zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza:[I

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzb()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    return-void
.end method

.method private constructor <init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/firebase-auth-api/zzaln;Z[IIILcom/google/android/gms/internal/firebase-auth-api/zzalv;Lcom/google/android/gms/internal/firebase-auth-api/zzakx;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Lcom/google/android/gms/internal/firebase-auth-api/zzajx;Lcom/google/android/gms/internal/firebase-auth-api/zzalg;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I[",
            "Ljava/lang/Object;",
            "II",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaln;",
            "Z[III",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzalv;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzakx;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamv<",
            "**>;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzajx<",
            "*>;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzalg;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd:[Ljava/lang/Object;

    iput p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze:I

    iput p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzf:I

    instance-of p1, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;

    iput-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzi:Z

    const/4 p1, 0x0

    if-eqz p13, :cond_0

    invoke-virtual {p13, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaln;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    move p2, p1

    :goto_0
    iput-boolean p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzh:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzj:Z

    iput-object p7, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzk:[I

    iput p8, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzl:I

    iput p9, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzm:I

    iput-object p10, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzn:Lcom/google/android/gms/internal/firebase-auth-api/zzalv;

    iput-object p11, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    iput-object p12, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    iput-object p13, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    iput-object p14, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    return-void
.end method

.method private static zza(Ljava/lang/Object;J)D
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)D"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method private final zza(I)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzf:I

    if-gt p1, v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method private final zza(II)I
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x3

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-gt p2, v0, :cond_2

    add-int v1, v0, p2

    ushr-int/lit8 v1, v1, 0x1

    mul-int/lit8 v2, v1, 0x3

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v3, v3, v2

    if-ne p1, v3, :cond_0

    return v2

    :cond_0
    if-ge p1, v3, :cond_1

    add-int/lit8 v0, v1, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 p2, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method private static zza([BIILcom/google/android/gms/internal/firebase-auth-api/zzanh;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzanh;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;",
            ")I"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzalq;->zza:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    packed-switch p3, :pswitch_data_0

    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "unsupported field type."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzb([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p0

    goto/16 :goto_6

    :pswitch_1
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p0

    iget-wide p1, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaji;->zza(J)J

    move-result-wide p1

    goto :goto_0

    :pswitch_2
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p0

    iget p1, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaji;->zza(I)I

    move-result p1

    goto :goto_1

    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzaly;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzaly;

    move-result-object p3

    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzaly;->zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object p3

    invoke-static {p3, p0, p1, p2, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p0

    goto :goto_6

    :pswitch_4
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p0

    iget-wide p1, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_2

    :pswitch_5
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p0

    iget p1, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_2
    iput-object p1, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    goto :goto_6

    :pswitch_6
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzb([BI)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    goto :goto_3

    :pswitch_7
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BI)J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    goto :goto_4

    :pswitch_8
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BI)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :goto_3
    iput-object p0, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    add-int/lit8 p0, p1, 0x4

    goto :goto_6

    :pswitch_9
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza([BI)D

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    :goto_4
    iput-object p0, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    add-int/lit8 p0, p1, 0x8

    goto :goto_6

    :pswitch_a
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p0

    goto :goto_6

    :pswitch_b
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result p0

    iget-wide p1, p5, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_5

    :cond_0
    const/4 p1, 0x0

    :goto_5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_2

    :goto_6
    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static zza(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzall;Lcom/google/android/gms/internal/firebase-auth-api/zzalv;Lcom/google/android/gms/internal/firebase-auth-api/zzakx;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Lcom/google/android/gms/internal/firebase-auth-api/zzajx;Lcom/google/android/gms/internal/firebase-auth-api/zzalg;)Lcom/google/android/gms/internal/firebase-auth-api/zzalr;
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzall;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzalv;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzakx;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamv<",
            "**>;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzajx<",
            "*>;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzalg;",
            ")",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzalr<",
            "TT;>;"
        }
    .end annotation

    move-object/from16 v0, p1

    instance-of v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzama;

    if-eqz v1, :cond_37

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzama;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzama;->zzd()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v5, 0xd800

    const/4 v6, 0x1

    if-lt v4, v5, :cond_0

    move v4, v6

    :goto_0
    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_1

    move v4, v7

    goto :goto_0

    :cond_0
    move v7, v6

    :cond_1
    add-int/lit8 v4, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_3

    and-int/lit16 v7, v7, 0x1fff

    const/16 v9, 0xd

    :goto_1
    add-int/lit8 v10, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_2

    and-int/lit16 v4, v4, 0x1fff

    shl-int/2addr v4, v9

    or-int/2addr v7, v4

    add-int/lit8 v9, v9, 0xd

    move v4, v10

    goto :goto_1

    :cond_2
    shl-int/2addr v4, v9

    or-int/2addr v7, v4

    move v4, v10

    :cond_3
    if-nez v7, :cond_4

    sget-object v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza:[I

    move v9, v3

    move v11, v9

    move v12, v11

    move v13, v12

    move v14, v13

    move/from16 v17, v14

    move-object/from16 v16, v7

    move/from16 v7, v17

    goto/16 :goto_a

    :cond_4
    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_6

    and-int/lit16 v4, v4, 0x1fff

    const/16 v9, 0xd

    :goto_2
    add-int/lit8 v10, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_5

    and-int/lit16 v7, v7, 0x1fff

    shl-int/2addr v7, v9

    or-int/2addr v4, v7

    add-int/lit8 v9, v9, 0xd

    move v7, v10

    goto :goto_2

    :cond_5
    shl-int/2addr v7, v9

    or-int/2addr v4, v7

    move v7, v10

    :cond_6
    add-int/lit8 v9, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_8

    and-int/lit16 v7, v7, 0x1fff

    const/16 v10, 0xd

    :goto_3
    add-int/lit8 v11, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_7

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v10

    or-int/2addr v7, v9

    add-int/lit8 v10, v10, 0xd

    move v9, v11

    goto :goto_3

    :cond_7
    shl-int/2addr v9, v10

    or-int/2addr v7, v9

    move v9, v11

    :cond_8
    add-int/lit8 v10, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_a

    and-int/lit16 v9, v9, 0x1fff

    const/16 v11, 0xd

    :goto_4
    add-int/lit8 v12, v10, 0x1

    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v5, :cond_9

    and-int/lit16 v10, v10, 0x1fff

    shl-int/2addr v10, v11

    or-int/2addr v9, v10

    add-int/lit8 v11, v11, 0xd

    move v10, v12

    goto :goto_4

    :cond_9
    shl-int/2addr v10, v11

    or-int/2addr v9, v10

    move v10, v12

    :cond_a
    add-int/lit8 v11, v10, 0x1

    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v5, :cond_c

    and-int/lit16 v10, v10, 0x1fff

    const/16 v12, 0xd

    :goto_5
    add-int/lit8 v13, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_b

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_5

    :cond_b
    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    move v11, v13

    :cond_c
    add-int/lit8 v12, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_e

    and-int/lit16 v11, v11, 0x1fff

    const/16 v13, 0xd

    :goto_6
    add-int/lit8 v14, v12, 0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_d

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_6

    :cond_d
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_e
    add-int/lit8 v13, v12, 0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_10

    and-int/lit16 v12, v12, 0x1fff

    const/16 v14, 0xd

    :goto_7
    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_f

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_7

    :cond_f
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_10
    add-int/lit8 v14, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_12

    and-int/lit16 v13, v13, 0x1fff

    const/16 v15, 0xd

    :goto_8
    add-int/lit8 v16, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_11

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_8

    :cond_11
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_12
    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_14

    and-int/lit16 v14, v14, 0x1fff

    const/16 v16, 0xd

    :goto_9
    add-int/lit8 v17, v15, 0x1

    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v5, :cond_13

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_9

    :cond_13
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_14
    add-int v16, v14, v12

    add-int v13, v16, v13

    new-array v13, v13, [I

    shl-int/lit8 v16, v4, 0x1

    add-int v16, v16, v7

    move v7, v4

    move/from16 v17, v14

    move v4, v15

    move v14, v10

    move-object/from16 v32, v13

    move v13, v9

    move/from16 v9, v16

    move-object/from16 v16, v32

    :goto_a
    sget-object v10, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzama;->zze()[Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzama;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    mul-int/lit8 v8, v11, 0x3

    new-array v8, v8, [I

    shl-int/2addr v11, v6

    new-array v11, v11, [Ljava/lang/Object;

    add-int v18, v17, v12

    move/from16 v20, v17

    move/from16 v21, v18

    const/4 v12, 0x0

    const/16 v19, 0x0

    :goto_b
    if-ge v4, v2, :cond_36

    add-int/lit8 v22, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_16

    and-int/lit16 v4, v4, 0x1fff

    move/from16 v6, v22

    const/16 v22, 0xd

    :goto_c
    add-int/lit8 v24, v6, 0x1

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_15

    and-int/lit16 v6, v6, 0x1fff

    shl-int v6, v6, v22

    or-int/2addr v4, v6

    add-int/lit8 v22, v22, 0xd

    move/from16 v6, v24

    goto :goto_c

    :cond_15
    shl-int v6, v6, v22

    or-int/2addr v4, v6

    move/from16 v6, v24

    goto :goto_d

    :cond_16
    move/from16 v6, v22

    :goto_d
    add-int/lit8 v22, v6, 0x1

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_18

    and-int/lit16 v6, v6, 0x1fff

    move/from16 v5, v22

    const/16 v22, 0xd

    :goto_e
    add-int/lit8 v25, v5, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    move/from16 v26, v2

    const v2, 0xd800

    if-lt v5, v2, :cond_17

    and-int/lit16 v2, v5, 0x1fff

    shl-int v2, v2, v22

    or-int/2addr v6, v2

    add-int/lit8 v22, v22, 0xd

    move/from16 v5, v25

    move/from16 v2, v26

    goto :goto_e

    :cond_17
    shl-int v2, v5, v22

    or-int/2addr v6, v2

    move/from16 v2, v25

    goto :goto_f

    :cond_18
    move/from16 v26, v2

    move/from16 v2, v22

    :goto_f
    and-int/lit16 v5, v6, 0xff

    move/from16 v22, v14

    and-int/lit16 v14, v6, 0x400

    if-eqz v14, :cond_19

    add-int/lit8 v14, v19, 0x1

    aput v12, v16, v19

    move/from16 v19, v14

    :cond_19
    const/16 v14, 0x33

    move/from16 v28, v13

    if-lt v5, v14, :cond_22

    add-int/lit8 v14, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const v13, 0xd800

    if-lt v2, v13, :cond_1b

    and-int/lit16 v2, v2, 0x1fff

    const/16 v30, 0xd

    :goto_10
    add-int/lit8 v31, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v13, :cond_1a

    and-int/lit16 v13, v14, 0x1fff

    shl-int v13, v13, v30

    or-int/2addr v2, v13

    add-int/lit8 v30, v30, 0xd

    move/from16 v14, v31

    const v13, 0xd800

    goto :goto_10

    :cond_1a
    shl-int v13, v14, v30

    or-int/2addr v2, v13

    move/from16 v14, v31

    :cond_1b
    add-int/lit8 v13, v5, -0x33

    move/from16 v30, v14

    const/16 v14, 0x9

    if-eq v13, v14, :cond_1f

    const/16 v14, 0x11

    if-ne v13, v14, :cond_1c

    goto :goto_11

    :cond_1c
    const/16 v14, 0xc

    if-ne v13, v14, :cond_1e

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzama;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzalz;

    move-result-object v13

    sget-object v14, Lcom/google/android/gms/internal/firebase-auth-api/zzalz;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzalz;

    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1d

    and-int/lit16 v13, v6, 0x800

    if-eqz v13, :cond_1e

    :cond_1d
    div-int/lit8 v13, v12, 0x3

    const/4 v14, 0x1

    shl-int/2addr v13, v14

    add-int/2addr v13, v14

    add-int/lit8 v23, v9, 0x1

    aget-object v9, v15, v9

    aput-object v9, v11, v13

    goto :goto_12

    :cond_1e
    const/4 v14, 0x1

    goto :goto_13

    :cond_1f
    :goto_11
    const/4 v14, 0x1

    div-int/lit8 v13, v12, 0x3

    shl-int/2addr v13, v14

    add-int/2addr v13, v14

    add-int/lit8 v23, v9, 0x1

    aget-object v9, v15, v9

    aput-object v9, v11, v13

    :goto_12
    move/from16 v9, v23

    :goto_13
    shl-int/2addr v2, v14

    aget-object v13, v15, v2

    instance-of v14, v13, Ljava/lang/reflect/Field;

    if-eqz v14, :cond_20

    check-cast v13, Ljava/lang/reflect/Field;

    goto :goto_14

    :cond_20
    check-cast v13, Ljava/lang/String;

    invoke-static {v3, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v13

    aput-object v13, v15, v2

    :goto_14
    invoke-virtual {v10, v13}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v13

    long-to-int v13, v13

    add-int/lit8 v2, v2, 0x1

    aget-object v14, v15, v2

    move/from16 v25, v9

    instance-of v9, v14, Ljava/lang/reflect/Field;

    if-eqz v9, :cond_21

    check-cast v14, Ljava/lang/reflect/Field;

    goto :goto_15

    :cond_21
    check-cast v14, Ljava/lang/String;

    invoke-static {v3, v14}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v14

    aput-object v14, v15, v2

    :goto_15
    move v2, v13

    invoke-virtual {v10, v14}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v13

    long-to-int v9, v13

    move-object/from16 v27, v1

    move v13, v2

    move/from16 v29, v25

    const/4 v2, 0x0

    const/16 v23, 0x1

    move-object/from16 v25, v0

    move v0, v9

    move/from16 v9, v30

    goto/16 :goto_20

    :cond_22
    add-int/lit8 v13, v9, 0x1

    aget-object v9, v15, v9

    check-cast v9, Ljava/lang/String;

    invoke-static {v3, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v9

    const/16 v14, 0x9

    if-eq v5, v14, :cond_2b

    const/16 v14, 0x11

    if-ne v5, v14, :cond_23

    goto/16 :goto_19

    :cond_23
    const/16 v14, 0x1b

    if-eq v5, v14, :cond_2a

    const/16 v14, 0x31

    if-ne v5, v14, :cond_24

    goto :goto_17

    :cond_24
    const/16 v14, 0xc

    if-eq v5, v14, :cond_28

    const/16 v14, 0x1e

    if-eq v5, v14, :cond_28

    const/16 v14, 0x2c

    if-ne v5, v14, :cond_25

    goto :goto_16

    :cond_25
    const/16 v14, 0x32

    if-ne v5, v14, :cond_27

    add-int/lit8 v14, v20, 0x1

    aput v12, v16, v20

    div-int/lit8 v20, v12, 0x3

    const/16 v23, 0x1

    shl-int/lit8 v20, v20, 0x1

    add-int/lit8 v25, v13, 0x1

    aget-object v13, v15, v13

    aput-object v13, v11, v20

    and-int/lit16 v13, v6, 0x800

    if-eqz v13, :cond_26

    add-int/lit8 v20, v20, 0x1

    add-int/lit8 v13, v25, 0x1

    aget-object v25, v15, v25

    aput-object v25, v11, v20

    move-object/from16 v25, v0

    move v0, v13

    move/from16 v20, v14

    goto :goto_1b

    :cond_26
    move/from16 v20, v14

    move/from16 v32, v25

    move-object/from16 v25, v0

    move/from16 v0, v32

    goto :goto_1b

    :cond_27
    move-object/from16 v25, v0

    goto :goto_1a

    :cond_28
    :goto_16
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzama;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzalz;

    move-result-object v14

    move-object/from16 v25, v0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzalz;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzalz;

    if-eq v14, v0, :cond_29

    and-int/lit16 v0, v6, 0x800

    if-eqz v0, :cond_2c

    :cond_29
    div-int/lit8 v0, v12, 0x3

    const/4 v14, 0x1

    shl-int/2addr v0, v14

    add-int/2addr v0, v14

    add-int/lit8 v23, v13, 0x1

    aget-object v13, v15, v13

    aput-object v13, v11, v0

    goto :goto_18

    :cond_2a
    :goto_17
    move-object/from16 v25, v0

    const/4 v14, 0x1

    div-int/lit8 v0, v12, 0x3

    shl-int/2addr v0, v14

    add-int/2addr v0, v14

    add-int/lit8 v23, v13, 0x1

    aget-object v13, v15, v13

    aput-object v13, v11, v0

    :goto_18
    move/from16 v0, v23

    goto :goto_1b

    :cond_2b
    :goto_19
    move-object/from16 v25, v0

    const/4 v14, 0x1

    div-int/lit8 v0, v12, 0x3

    shl-int/2addr v0, v14

    add-int/2addr v0, v14

    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v14

    aput-object v14, v11, v0

    :cond_2c
    :goto_1a
    move v0, v13

    :goto_1b
    invoke-virtual {v10, v9}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v13

    long-to-int v13, v13

    and-int/lit16 v9, v6, 0x1000

    if-eqz v9, :cond_2d

    const/4 v14, 0x1

    goto :goto_1c

    :cond_2d
    const/4 v14, 0x0

    :goto_1c
    if-eqz v14, :cond_31

    const/16 v9, 0x11

    if-gt v5, v9, :cond_31

    add-int/lit8 v9, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const v14, 0xd800

    if-lt v2, v14, :cond_2f

    and-int/lit16 v2, v2, 0x1fff

    const/16 v24, 0xd

    :goto_1d
    add-int/lit8 v27, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v14, :cond_2e

    and-int/lit16 v9, v9, 0x1fff

    shl-int v9, v9, v24

    or-int/2addr v2, v9

    add-int/lit8 v24, v24, 0xd

    move/from16 v9, v27

    goto :goto_1d

    :cond_2e
    shl-int v9, v9, v24

    or-int/2addr v2, v9

    move/from16 v9, v27

    :cond_2f
    const/16 v23, 0x1

    shl-int/lit8 v24, v7, 0x1

    div-int/lit8 v27, v2, 0x20

    add-int v27, v27, v24

    aget-object v14, v15, v27

    move/from16 v29, v0

    instance-of v0, v14, Ljava/lang/reflect/Field;

    if-eqz v0, :cond_30

    check-cast v14, Ljava/lang/reflect/Field;

    goto :goto_1e

    :cond_30
    check-cast v14, Ljava/lang/String;

    invoke-static {v3, v14}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v14

    aput-object v14, v15, v27

    :goto_1e
    move-object/from16 v27, v1

    invoke-virtual {v10, v14}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    long-to-int v0, v0

    rem-int/lit8 v2, v2, 0x20

    goto :goto_1f

    :cond_31
    move/from16 v29, v0

    move-object/from16 v27, v1

    const/16 v23, 0x1

    const v0, 0xfffff

    move v9, v2

    const/4 v2, 0x0

    :goto_1f
    const/16 v1, 0x12

    if-lt v5, v1, :cond_32

    const/16 v1, 0x31

    if-gt v5, v1, :cond_32

    add-int/lit8 v1, v21, 0x1

    aput v13, v16, v21

    move/from16 v21, v1

    :cond_32
    :goto_20
    add-int/lit8 v1, v12, 0x1

    aput v4, v8, v12

    add-int/lit8 v4, v1, 0x1

    and-int/lit16 v12, v6, 0x200

    if-eqz v12, :cond_33

    const/high16 v12, 0x20000000

    goto :goto_21

    :cond_33
    const/4 v12, 0x0

    :goto_21
    and-int/lit16 v14, v6, 0x100

    if-eqz v14, :cond_34

    const/high16 v14, 0x10000000

    goto :goto_22

    :cond_34
    const/4 v14, 0x0

    :goto_22
    or-int/2addr v12, v14

    and-int/lit16 v6, v6, 0x800

    if-eqz v6, :cond_35

    const/high16 v6, -0x80000000

    goto :goto_23

    :cond_35
    const/4 v6, 0x0

    :goto_23
    or-int/2addr v6, v12

    shl-int/lit8 v5, v5, 0x14

    or-int/2addr v5, v6

    or-int/2addr v5, v13

    aput v5, v8, v1

    add-int/lit8 v12, v4, 0x1

    shl-int/lit8 v1, v2, 0x14

    or-int/2addr v0, v1

    aput v0, v8, v4

    move v4, v9

    move/from16 v14, v22

    move/from16 v6, v23

    move-object/from16 v0, v25

    move/from16 v2, v26

    move-object/from16 v1, v27

    move/from16 v13, v28

    move/from16 v9, v29

    const v5, 0xd800

    goto/16 :goto_b

    :cond_36
    move-object/from16 v25, v0

    move/from16 v28, v13

    move/from16 v22, v14

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;

    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/internal/firebase-auth-api/zzama;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    move-result-object v14

    const/4 v15, 0x0

    move-object v9, v0

    move-object v10, v8

    move/from16 v12, v28

    move/from16 v13, v22

    move-object/from16 v19, p2

    move-object/from16 v20, p3

    move-object/from16 v21, p4

    move-object/from16 v22, p5

    move-object/from16 v23, p6

    invoke-direct/range {v9 .. v23}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;-><init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/firebase-auth-api/zzaln;Z[IIILcom/google/android/gms/internal/firebase-auth-api/zzalv;Lcom/google/android/gms/internal/firebase-auth-api/zzakx;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Lcom/google/android/gms/internal/firebase-auth-api/zzajx;Lcom/google/android/gms/internal/firebase-auth-api/zzalg;)V

    return-object v0

    :cond_37
    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzamp;

    new-instance v0, Ljava/lang/NoSuchMethodError;

    invoke-direct {v0}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw v0
.end method

.method private final zza(IILjava/util/Map;Lcom/google/android/gms/internal/firebase-auth-api/zzakk;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            "UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(II",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzakk;",
            "TUB;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamv<",
            "TUT;TUB;>;",
            "Ljava/lang/Object;",
            ")TUB;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzf(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzale;

    move-result-object p1

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakk;->zza(I)Z

    move-result v1

    if-nez v1, :cond_0

    if-nez p5, :cond_1

    invoke-virtual {p6, p7}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzale;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzajf;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajf;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzajo;

    move-result-object v2

    :try_start_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, p1, v3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzajo;Lcom/google/android/gms/internal/firebase-auth-api/zzale;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajf;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    move-result-object v0

    invoke-virtual {p6, p5, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zza(Ljava/lang/Object;ILcom/google/android/gms/internal/firebase-auth-api/zzaiw;)V

    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    return-object p5
.end method

.method private final zza(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method private final zza(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result p3

    const v1, 0xfffff

    and-int/2addr p3, v1

    int-to-long v1, p3

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method private final zza(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "ITUB;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamv<",
            "TUT;TUB;>;",
            "Ljava/lang/Object;",
            ")TUB;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v3, v0, p2

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p3

    :cond_0
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakk;

    move-result-object v5

    if-nez v5, :cond_1

    return-object p3

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zze(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v4

    move-object v1, p0

    move v2, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(IILjava/util/Map;Lcom/google/android/gms/internal/firebase-auth-api/zzakk;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Field "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static zza(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;)V
    .locals 1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(ILjava/lang/String;)V

    return-void

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(ILcom/google/android/gms/internal/firebase-auth-api/zzaiw;)V

    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamv<",
            "TUT;TUB;>;TT;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzanm;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzd(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;)V

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzanm;ILjava/lang/Object;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzanm;",
            "I",
            "Ljava/lang/Object;",
            "I)V"
        }
    .end annotation

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-direct {p0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzf(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzale;

    move-result-object p4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zzd(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p3

    invoke-interface {p1, p2, p4, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(ILcom/google/android/gms/internal/firebase-auth-api/zzale;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method private final zza(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(Ljava/lang/Object;II)V

    return-void
.end method

.method private final zza(Ljava/lang/Object;ILcom/google/android/gms/internal/firebase-auth-api/zzamd;)V
    .locals 2

    invoke-static {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg(I)Z

    move-result v0

    const v1, 0xfffff

    if-eqz v0, :cond_0

    and-int/2addr p2, v1

    int-to-long v0, p2

    invoke-interface {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzr()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzi:Z

    and-int/2addr p2, v1

    if-eqz v0, :cond_1

    int-to-long v0, p2

    invoke-interface {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzq()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_1
    int-to-long v0, p2

    invoke-interface {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzp()Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    move-result-object p2

    goto :goto_0
.end method

.method private final zza(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(Ljava/lang/Object;I)V

    return-void
.end method

.method private final zza(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)V"
        }
    .end annotation

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    invoke-virtual {v2, p2, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object p2

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2, p1, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(Ljava/lang/Object;I)V

    return-void

    :cond_2
    invoke-virtual {v2, p1, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v4

    :cond_3
    invoke-interface {p2, p3, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget p3, v0, p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Source subfield "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final zza(Ljava/lang/Object;IIII)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;IIII)Z"
        }
    .end annotation

    const v0, 0xfffff

    if-ne p3, v0, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result p1

    return p1

    :cond_0
    and-int p1, p4, p5

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private static zza(Ljava/lang/Object;ILcom/google/android/gms/internal/firebase-auth-api/zzamc;)Z
    .locals 2

    const v0, 0xfffff

    and-int/2addr p1, v0

    int-to-long v0, p1

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zze(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static zzb(Ljava/lang/Object;J)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)F"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0
.end method

.method private final zzb(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method private final zzb(Ljava/lang/Object;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(I)I

    move-result p2

    const v0, 0xfffff

    and-int/2addr v0, p2

    int-to-long v0, v0

    const-wide/32 v2, 0xfffff

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x1

    ushr-int/lit8 p2, p2, 0x14

    shl-int p2, v2, p2

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v2

    or-int/2addr p2, v2

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JI)V

    return-void
.end method

.method private final zzb(Ljava/lang/Object;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)V"
        }
    .end annotation

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JI)V

    return-void
.end method

.method private final zzb(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, p3

    invoke-direct {p0, p2, v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    invoke-virtual {v3, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object p2

    invoke-direct {p0, p1, v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v3, p1, v1, v2, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p2, v5, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v1, v2, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-direct {p0, p1, v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(Ljava/lang/Object;II)V

    return-void

    :cond_2
    invoke-virtual {v3, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v1, v2, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v0

    :cond_3
    invoke-interface {p2, p3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget p3, v0, p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Source subfield "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final zzc(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method private static zzc(Ljava/lang/Object;J)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)I"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzamy;
    .locals 2

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzamy;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzamy;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzamy;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzamy;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzamy;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzamy;

    :cond_0
    return-object v0
.end method

.method private final zzc(Ljava/lang/Object;I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)Z"
        }
    .end annotation

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(I)I

    move-result v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const-wide/32 v4, 0xfffff

    cmp-long v4, v2, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_14

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result p2

    and-int v0, p2, v1

    int-to-long v0, v0

    const/high16 v2, 0xff00000

    and-int/2addr p2, v2

    ushr-int/lit8 p2, p2, 0x14

    const-wide/16 v2, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return v6

    :cond_0
    return v5

    :pswitch_1
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    return v6

    :cond_1
    return v5

    :pswitch_2
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    return v6

    :cond_2
    return v5

    :pswitch_3
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    return v6

    :cond_3
    return v5

    :pswitch_4
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    return v6

    :cond_4
    return v5

    :pswitch_5
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    return v6

    :cond_5
    return v5

    :pswitch_6
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    return v6

    :cond_6
    return v5

    :pswitch_7
    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v6

    :cond_7
    return v5

    :pswitch_8
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    return v6

    :cond_8
    return v5

    :pswitch_9
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_a

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_9

    return v6

    :cond_9
    return v5

    :cond_a
    instance-of p2, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    if-eqz p2, :cond_c

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v6

    :cond_b
    return v5

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_a
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzh(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_d

    return v6

    :cond_d
    return v5

    :pswitch_c
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_e

    return v6

    :cond_e
    return v5

    :pswitch_d
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_f

    return v6

    :cond_f
    return v5

    :pswitch_e
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_10

    return v6

    :cond_10
    return v5

    :pswitch_f
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_11

    return v6

    :cond_11
    return v5

    :pswitch_10
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzb(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_12

    return v6

    :cond_12
    return v5

    :pswitch_11
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_13

    return v6

    :cond_13
    return v5

    :cond_14
    ushr-int/lit8 p2, v0, 0x14

    shl-int p2, v6, p2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result p1

    and-int/2addr p1, p2

    if-eqz p1, :cond_15

    return v6

    :cond_15
    return v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zzc(Ljava/lang/Object;II)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)Z"
        }
    .end annotation

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)Z"
        }
    .end annotation

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result p1

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private static zzd(Ljava/lang/Object;J)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)J"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method private final zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x1

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzakk;

    return-object p1
.end method

.method private final zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;
    .locals 3

    div-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd:[Ljava/lang/Object;

    aget-object v0, v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzaly;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzaly;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    aget-object v1, v1, v2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaly;->zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd:[Ljava/lang/Object;

    aput-object v0, v1, p1

    return-object v0
.end method

.method private static zze(Ljava/lang/Object;J)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)Z"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private final zzf(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    return-object p1
.end method

.method private static zzf(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v1, "Mutating immutable message: "

    .line 15
    .line 16
    invoke-static {v1, p0}, Lf;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
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

.method private static zzg(I)Z
    .locals 1

    const/high16 v0, 0x20000000

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static zzg(Ljava/lang/Object;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;->zzw()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)I
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    sget-object v8, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    const v9, 0xfffff

    const/4 v10, 0x0

    move v0, v9

    move v1, v10

    move v11, v1

    move v12, v11

    :goto_0
    iget-object v2, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    array-length v2, v2

    if-ge v11, v2, :cond_9

    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v2

    const/high16 v3, 0xff00000

    and-int/2addr v3, v2

    ushr-int/lit8 v3, v3, 0x14

    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v13, v4, v11

    add-int/lit8 v5, v11, 0x2

    aget v4, v4, v5

    and-int v5, v4, v9

    const/16 v14, 0x11

    const/4 v15, 0x1

    if-gt v3, v14, :cond_2

    if-eq v5, v0, :cond_1

    if-ne v5, v9, :cond_0

    move v0, v10

    goto :goto_1

    :cond_0
    int-to-long v0, v5

    invoke-virtual {v8, v7, v0, v1}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    :goto_1
    move v1, v0

    move v0, v5

    :cond_1
    ushr-int/lit8 v4, v4, 0x14

    shl-int v4, v15, v4

    move v14, v0

    move/from16 v16, v1

    move v5, v4

    goto :goto_2

    :cond_2
    move v14, v0

    move/from16 v16, v1

    move v5, v10

    :goto_2
    and-int v0, v2, v9

    int-to-long v1, v0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzakd;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzakd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakd;->zza()I

    move-result v0

    if-lt v3, v0, :cond_3

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzakd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzakd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakd;->zza()I

    move-result v0

    :cond_3
    move/from16 v17, v5

    const-wide/16 v4, 0x0

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_7

    :pswitch_0
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(ILcom/google/android/gms/internal/firebase-auth-api/zzaln;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)I

    move-result v0

    goto/16 :goto_4

    :pswitch_1
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzd(IJ)I

    move-result v0

    goto/16 :goto_4

    :pswitch_2
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v0

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zze(II)I

    move-result v0

    goto/16 :goto_4

    :pswitch_3
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v13, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzc(IJ)I

    move-result v0

    goto/16 :goto_4

    :pswitch_4
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v13, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzd(II)I

    move-result v0

    goto/16 :goto_4

    :pswitch_5
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v0

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(II)I

    move-result v0

    goto/16 :goto_4

    :pswitch_6
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v0

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzf(II)I

    move-result v0

    goto/16 :goto_4

    :pswitch_7
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(ILcom/google/android/gms/internal/firebase-auth-api/zzaiw;)I

    move-result v0

    goto/16 :goto_4

    :pswitch_8
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)I

    move-result v0

    goto/16 :goto_6

    :pswitch_9
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    check-cast v0, Ljava/lang/String;

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(ILjava/lang/String;)I

    move-result v0

    goto :goto_4

    :pswitch_a
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v13, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(IZ)I

    move-result v0

    goto :goto_4

    :pswitch_b
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v13, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(II)I

    move-result v0

    goto :goto_4

    :pswitch_c
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v13, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(IJ)I

    move-result v0

    goto :goto_4

    :pswitch_d
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v0

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzc(II)I

    move-result v0

    goto :goto_4

    :pswitch_e
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zze(IJ)I

    move-result v0

    goto :goto_4

    :pswitch_f
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(IJ)I

    move-result v0

    goto :goto_4

    :pswitch_10
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v4, 0x0

    invoke-static {v13, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(IF)I

    move-result v0

    goto :goto_4

    :pswitch_11
    invoke-direct {v6, v7, v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_5

    const-wide/16 v4, 0x0

    invoke-static {v13, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(ID)I

    move-result v0

    :goto_4
    add-int/2addr v12, v0

    goto/16 :goto_7

    :pswitch_12
    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzf(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v13, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zza(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_6

    :pswitch_13
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)I

    move-result v0

    goto/16 :goto_6

    :pswitch_14
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzh(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_5

    goto/16 :goto_5

    :pswitch_15
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzg(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_5

    goto/16 :goto_5

    :pswitch_16
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzd(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_5

    goto/16 :goto_5

    :pswitch_17
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzc(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_5

    goto/16 :goto_5

    :pswitch_18
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzb(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_5

    goto/16 :goto_5

    :pswitch_19
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzi(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_5

    goto/16 :goto_5

    :pswitch_1a
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_5

    goto :goto_5

    :pswitch_1b
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzc(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_5

    goto :goto_5

    :pswitch_1c
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzd(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_5

    goto :goto_5

    :pswitch_1d
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zze(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_5

    goto :goto_5

    :pswitch_1e
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzj(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_5

    goto :goto_5

    :pswitch_1f
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzf(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_5

    goto :goto_5

    :pswitch_20
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzc(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_5

    goto :goto_5

    :pswitch_21
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzd(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_5

    :goto_5
    invoke-static {v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzg(I)I

    move-result v1

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzh(I)I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v2, v0

    add-int/2addr v12, v2

    goto/16 :goto_7

    :pswitch_22
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzh(ILjava/util/List;Z)I

    move-result v0

    goto/16 :goto_6

    :pswitch_23
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzg(ILjava/util/List;Z)I

    move-result v0

    goto/16 :goto_6

    :pswitch_24
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzb(ILjava/util/List;Z)I

    move-result v0

    goto/16 :goto_6

    :pswitch_25
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzi(ILjava/util/List;Z)I

    move-result v0

    goto :goto_6

    :pswitch_26
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(ILjava/util/List;)I

    move-result v0

    goto :goto_6

    :pswitch_27
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)I

    move-result v0

    goto :goto_6

    :pswitch_28
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzb(ILjava/util/List;)I

    move-result v0

    goto :goto_6

    :pswitch_29
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(ILjava/util/List;Z)I

    move-result v0

    goto :goto_6

    :pswitch_2a
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zze(ILjava/util/List;Z)I

    move-result v0

    goto :goto_6

    :pswitch_2b
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzj(ILjava/util/List;Z)I

    move-result v0

    goto :goto_6

    :pswitch_2c
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzf(ILjava/util/List;Z)I

    move-result v0

    goto :goto_6

    :pswitch_2d
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzc(ILjava/util/List;Z)I

    move-result v0

    goto :goto_6

    :pswitch_2e
    invoke-virtual {v8, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v13, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzd(ILjava/util/List;Z)I

    move-result v0

    :goto_6
    add-int/2addr v12, v0

    :cond_5
    :goto_7
    move v15, v10

    goto/16 :goto_c

    :pswitch_2f
    move-object/from16 v0, p0

    move-wide v4, v1

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move-wide v9, v4

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(ILcom/google/android/gms/internal/firebase-auth-api/zzaln;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)I

    move-result v0

    goto/16 :goto_9

    :pswitch_30
    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzd(IJ)I

    move-result v0

    goto/16 :goto_9

    :pswitch_31
    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zze(II)I

    move-result v0

    goto/16 :goto_9

    :pswitch_32
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move-wide v9, v4

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {v13, v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzc(IJ)I

    move-result v0

    goto/16 :goto_9

    :pswitch_33
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v0, 0x0

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzd(II)I

    move-result v1

    add-int/2addr v12, v1

    goto/16 :goto_a

    :pswitch_34
    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(II)I

    move-result v0

    goto/16 :goto_9

    :pswitch_35
    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzf(II)I

    move-result v0

    goto/16 :goto_9

    :pswitch_36
    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    :goto_8
    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(ILcom/google/android/gms/internal/firebase-auth-api/zzaiw;)I

    move-result v0

    goto :goto_9

    :pswitch_37
    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)I

    move-result v0

    add-int/2addr v12, v0

    goto :goto_a

    :pswitch_38
    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    if-eqz v1, :cond_6

    goto :goto_8

    :cond_6
    check-cast v0, Ljava/lang/String;

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(ILjava/lang/String;)I

    move-result v0

    goto :goto_9

    :pswitch_39
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {v13, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(IZ)I

    move-result v0

    :goto_9
    add-int/2addr v12, v0

    :cond_7
    :goto_a
    const/4 v15, 0x0

    goto/16 :goto_c

    :pswitch_3a
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v15, 0x0

    invoke-static {v13, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(II)I

    move-result v0

    goto/16 :goto_b

    :pswitch_3b
    move v15, v10

    move-wide v9, v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {v13, v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(IJ)I

    move-result v0

    goto/16 :goto_b

    :pswitch_3c
    move v15, v10

    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzc(II)I

    move-result v0

    goto/16 :goto_b

    :pswitch_3d
    move v15, v10

    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zze(IJ)I

    move-result v0

    goto :goto_b

    :pswitch_3e
    move v15, v10

    move-wide v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v8, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zzb(IJ)I

    move-result v0

    goto :goto_b

    :pswitch_3f
    move v15, v10

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move v9, v4

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {v13, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(IF)I

    move-result v0

    goto :goto_b

    :pswitch_40
    move v15, v10

    const-wide/16 v4, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v14

    move-wide v9, v4

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {v13, v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzajo;->zza(ID)I

    move-result v0

    :goto_b
    add-int/2addr v12, v0

    :cond_8
    :goto_c
    add-int/lit8 v11, v11, 0x3

    move v0, v14

    move v10, v15

    move/from16 v1, v16

    const v9, 0xfffff

    goto/16 :goto_0

    :cond_9
    move v15, v10

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzd(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zza(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v12, v0

    iget-boolean v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzh:Z

    if-eqz v0, :cond_c

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzajy;

    move-result-object v0

    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzamh;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamh;->zzb()I

    move-result v1

    move v10, v15

    :goto_d
    if-ge v10, v1, :cond_a

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzamh;

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzamh;->zza(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/zzaka;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaka;Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v15, v2

    add-int/lit8 v10, v10, 0x1

    goto :goto_d

    :cond_a
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzamh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzamh;->zzc()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaka;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaka;Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v15, v1

    goto :goto_e

    :cond_b
    add-int/2addr v12, v15

    :cond_c
    return v12

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_2e
        :pswitch_2d
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_2d
        :pswitch_2e
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zza(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[BIII",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;",
            ")I"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v15, p1

    move-object/from16 v14, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v2, p6

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzf(Ljava/lang/Object;)V

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    const/16 v16, 0x0

    move/from16 v7, p3

    move/from16 v9, v16

    move v10, v9

    move v12, v10

    const/4 v8, -0x1

    const v13, 0xfffff

    :goto_0
    if-ge v7, v4, :cond_72

    add-int/lit8 v10, v7, 0x1

    aget-byte v7, v14, v7

    if-gez v7, :cond_0

    invoke-static {v7, v14, v10, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I[BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v7

    iget v10, v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    move v11, v10

    move v10, v7

    goto :goto_1

    :cond_0
    move v11, v7

    :goto_1
    ushr-int/lit8 v7, v11, 0x3

    and-int/lit8 v0, v11, 0x7

    const/4 v1, 0x3

    if-le v7, v8, :cond_2

    div-int/2addr v9, v1

    iget v8, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze:I

    if-lt v7, v8, :cond_1

    iget v8, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzf:I

    if-gt v7, v8, :cond_1

    invoke-direct {v6, v7, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(II)I

    move-result v8

    goto :goto_2

    :cond_1
    const/4 v8, -0x1

    goto :goto_2

    :cond_2
    invoke-direct {v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(I)I

    move-result v8

    :goto_2
    move v9, v8

    const/4 v8, -0x1

    if-ne v9, v8, :cond_3

    move-object/from16 v28, v3

    move v3, v7

    move/from16 v17, v8

    move v0, v11

    move/from16 v25, v12

    move/from16 v26, v13

    move/from16 v19, v16

    move-object v7, v2

    move-object v11, v6

    move v2, v10

    move v6, v5

    goto/16 :goto_4b

    :cond_3
    iget-object v8, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    add-int/lit8 v19, v9, 0x1

    aget v1, v8, v19

    const/high16 v19, 0xff00000

    and-int v19, v1, v19

    ushr-int/lit8 v4, v19, 0x14

    const v17, 0xfffff

    and-int v5, v1, v17

    move/from16 v19, v1

    int-to-long v1, v5

    const-string v5, ""

    const-wide/16 v21, 0x0

    move-wide/from16 v23, v1

    const/4 v2, 0x1

    const/16 v1, 0x11

    if-gt v4, v1, :cond_14

    add-int/lit8 v1, v9, 0x2

    aget v1, v8, v1

    ushr-int/lit8 v8, v1, 0x14

    shl-int v20, v2, v8

    const v8, 0xfffff

    and-int/2addr v1, v8

    move/from16 v17, v9

    if-eq v1, v13, :cond_6

    if-eq v13, v8, :cond_4

    int-to-long v8, v13

    invoke-virtual {v3, v15, v8, v9, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const v8, 0xfffff

    :cond_4
    if-ne v1, v8, :cond_5

    move/from16 v12, v16

    goto :goto_3

    :cond_5
    int-to-long v12, v1

    invoke-virtual {v3, v15, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v9

    move v12, v9

    :goto_3
    move/from16 v26, v1

    move/from16 v25, v12

    goto :goto_4

    :cond_6
    move/from16 v25, v12

    move/from16 v26, v13

    :goto_4
    packed-switch v4, :pswitch_data_0

    :cond_7
    move/from16 v12, p4

    move/from16 v13, p5

    move/from16 v23, v7

    move/from16 v18, v11

    move-object/from16 v7, p6

    move-object v11, v3

    move/from16 v3, v17

    const/16 v17, -0x1

    goto/16 :goto_10

    :pswitch_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_7

    move/from16 v0, v17

    invoke-direct {v6, v15, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    shl-int/lit8 v2, v7, 0x3

    or-int/lit8 v12, v2, 0x4

    invoke-direct {v6, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v2

    move v4, v7

    move-object v7, v1

    move/from16 v17, v8

    const/4 v5, -0x1

    move-object v8, v2

    move v2, v0

    move-object/from16 v9, p2

    move v0, v11

    move/from16 v11, p4

    move-object/from16 v13, p6

    invoke-static/range {v7 .. v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v7

    invoke-direct {v6, v15, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;ILjava/lang/Object;)V

    or-int v12, v25, v20

    move/from16 v5, p5

    move v10, v0

    move v9, v2

    move v8, v4

    move/from16 v13, v26

    move/from16 v4, p4

    move-object/from16 v2, p6

    goto/16 :goto_0

    :pswitch_1
    move v4, v7

    move/from16 v2, v17

    const/4 v5, -0x1

    move/from16 v17, v8

    move-object/from16 v7, p6

    if-nez v0, :cond_8

    move-wide/from16 v8, v23

    invoke-static {v14, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v10

    iget-wide v0, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaji;->zza(J)J

    move-result-wide v12

    move/from16 v1, v17

    move-object v0, v3

    move/from16 v17, v5

    move v5, v1

    move-object/from16 v1, p1

    move/from16 v27, v2

    move/from16 v18, v11

    move-object v11, v3

    move-wide v2, v8

    move/from16 v8, p4

    move/from16 v9, p5

    move/from16 v23, v4

    move-wide v4, v12

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v12, v25, v20

    move-object v2, v7

    move v4, v8

    move v5, v9

    move v7, v10

    move-object v3, v11

    move/from16 v10, v18

    move/from16 v8, v23

    move/from16 v13, v26

    move/from16 v9, v27

    goto/16 :goto_0

    :cond_8
    move/from16 v23, v4

    move/from16 v17, v5

    move/from16 v18, v11

    move-object v11, v3

    move/from16 v12, p4

    move/from16 v13, p5

    move v3, v2

    goto/16 :goto_10

    :pswitch_2
    move/from16 v12, p4

    move/from16 v13, p5

    move/from16 v18, v11

    move/from16 v27, v17

    move-wide/from16 v8, v23

    const/16 v17, -0x1

    move-object v11, v3

    move/from16 v23, v7

    move-object/from16 v7, p6

    if-nez v0, :cond_c

    invoke-static {v14, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaji;->zza(I)I

    move-result v1

    invoke-virtual {v11, v15, v8, v9, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    or-int v1, v25, v20

    move-object v2, v7

    move-object v3, v11

    move v4, v12

    move v5, v13

    move/from16 v10, v18

    move/from16 v8, v23

    move/from16 v13, v26

    move/from16 v9, v27

    goto/16 :goto_f

    :pswitch_3
    move/from16 v12, p4

    move/from16 v13, p5

    move/from16 v18, v11

    move/from16 v27, v17

    move-wide/from16 v8, v23

    const/16 v17, -0x1

    move-object v11, v3

    move/from16 v23, v7

    move-object/from16 v7, p6

    if-nez v0, :cond_c

    invoke-static {v14, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    move/from16 v5, v27

    invoke-direct {v6, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakk;

    move-result-object v3

    const/high16 v4, -0x80000000

    and-int v4, v19, v4

    if-eqz v4, :cond_9

    goto :goto_5

    :cond_9
    move/from16 v2, v16

    :goto_5
    if-eqz v2, :cond_b

    if-eqz v3, :cond_b

    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakk;->zza(I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_6

    :cond_a
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzamy;

    move-result-object v2

    int-to-long v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move/from16 v4, v18

    invoke-virtual {v2, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamy;->zza(ILjava/lang/Object;)V

    move v10, v4

    move v9, v5

    move-object v2, v7

    move-object v3, v11

    move v4, v12

    move v5, v13

    move/from16 v8, v23

    move/from16 v12, v25

    move/from16 v13, v26

    goto/16 :goto_36

    :cond_b
    :goto_6
    move/from16 v4, v18

    invoke-virtual {v11, v15, v8, v9, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_7

    :cond_c
    move/from16 v3, v27

    goto/16 :goto_10

    :pswitch_4
    move/from16 v12, p4

    move/from16 v13, p5

    move v4, v11

    move/from16 v5, v17

    move-wide/from16 v8, v23

    const/4 v1, 0x2

    const/16 v17, -0x1

    move-object v11, v3

    move/from16 v23, v7

    move-object/from16 v7, p6

    if-ne v0, v1, :cond_d

    invoke-static {v14, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    invoke-virtual {v11, v15, v8, v9, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_7
    or-int v1, v25, v20

    move v10, v4

    move v9, v5

    move-object v2, v7

    move-object v3, v11

    move v4, v12

    move v5, v13

    goto/16 :goto_e

    :pswitch_5
    move/from16 v12, p4

    move/from16 v13, p5

    move/from16 v23, v7

    move v4, v11

    move/from16 v5, v17

    const/4 v1, 0x2

    const/16 v17, -0x1

    move-object/from16 v7, p6

    move-object v11, v3

    if-ne v0, v1, :cond_d

    invoke-direct {v6, v15, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v8

    invoke-direct {v6, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    move-object v0, v8

    move-object/from16 v2, p2

    move v3, v10

    move/from16 v18, v4

    move/from16 v4, p4

    move v9, v5

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    invoke-direct {v6, v15, v9, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;ILjava/lang/Object;)V

    or-int v1, v25, v20

    goto/16 :goto_c

    :cond_d
    move/from16 v18, v4

    move v3, v5

    goto/16 :goto_10

    :pswitch_6
    move/from16 v12, p4

    move/from16 v13, p5

    move/from16 v18, v11

    move/from16 v4, v17

    move-wide/from16 v8, v23

    const/4 v1, 0x2

    const/16 v17, -0x1

    move-object v11, v3

    move/from16 v23, v7

    move-object/from16 v7, p6

    if-ne v0, v1, :cond_12

    invoke-static/range {v19 .. v19}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg(I)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v14, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzb([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    goto :goto_8

    :cond_e
    invoke-static {v14, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ltz v1, :cond_10

    if-nez v1, :cond_f

    iput-object v5, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    goto :goto_8

    :cond_f
    new-instance v2, Ljava/lang/String;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzaki;->zza:Ljava/nio/charset/Charset;

    invoke-direct {v2, v14, v0, v1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput-object v2, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    add-int/2addr v0, v1

    :goto_8
    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    invoke-virtual {v11, v15, v8, v9, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_a

    :cond_10
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :pswitch_7
    move/from16 v12, p4

    move/from16 v13, p5

    move/from16 v18, v11

    move/from16 v4, v17

    move-wide/from16 v8, v23

    const/16 v17, -0x1

    move-object v11, v3

    move/from16 v23, v7

    move-object/from16 v7, p6

    if-nez v0, :cond_12

    invoke-static {v14, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget-wide v2, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    cmp-long v1, v2, v21

    if-eqz v1, :cond_11

    const/4 v2, 0x1

    goto :goto_9

    :cond_11
    move/from16 v2, v16

    :goto_9
    invoke-static {v15, v8, v9, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;JZ)V

    goto/16 :goto_a

    :pswitch_8
    move/from16 v12, p4

    move/from16 v13, p5

    move/from16 v18, v11

    move/from16 v4, v17

    move-wide/from16 v8, v23

    const/4 v1, 0x5

    const/16 v17, -0x1

    move-object v11, v3

    move/from16 v23, v7

    move-object/from16 v7, p6

    if-ne v0, v1, :cond_12

    invoke-static {v14, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BI)I

    move-result v0

    invoke-virtual {v11, v15, v8, v9, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v0, v10, 0x4

    goto :goto_a

    :pswitch_9
    move/from16 v12, p4

    move/from16 v13, p5

    move v1, v2

    move/from16 v18, v11

    move/from16 v4, v17

    move-wide/from16 v8, v23

    const/16 v17, -0x1

    move-object v11, v3

    move/from16 v23, v7

    move-object/from16 v7, p6

    if-ne v0, v1, :cond_12

    invoke-static {v14, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BI)J

    move-result-wide v21

    move-object v0, v11

    move-object/from16 v1, p1

    move-wide v2, v8

    move v8, v4

    move-wide/from16 v4, v21

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    add-int/lit8 v0, v10, 0x8

    or-int v1, v25, v20

    move-object v2, v7

    move v9, v8

    goto/16 :goto_d

    :pswitch_a
    move/from16 v12, p4

    move/from16 v13, p5

    move/from16 v18, v11

    move/from16 v4, v17

    move-wide/from16 v8, v23

    const/16 v17, -0x1

    move-object v11, v3

    move/from16 v23, v7

    move-object/from16 v7, p6

    if-nez v0, :cond_12

    invoke-static {v14, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    invoke-virtual {v11, v15, v8, v9, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_a
    or-int v1, v25, v20

    move v9, v4

    goto/16 :goto_c

    :pswitch_b
    move/from16 v12, p4

    move/from16 v13, p5

    move/from16 v18, v11

    move/from16 v4, v17

    move-wide/from16 v8, v23

    const/16 v17, -0x1

    move-object v11, v3

    move/from16 v23, v7

    move-object/from16 v7, p6

    if-nez v0, :cond_12

    invoke-static {v14, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v10

    iget-wide v2, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    move-object v0, v11

    move-object/from16 v1, p1

    move-wide/from16 v21, v2

    move-wide v2, v8

    move v8, v4

    move-wide/from16 v4, v21

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v0, v25, v20

    move-object v2, v7

    move v9, v8

    move v7, v10

    move-object v3, v11

    move v4, v12

    move v5, v13

    move/from16 v10, v18

    move/from16 v8, v23

    move/from16 v13, v26

    move v12, v0

    goto/16 :goto_0

    :cond_12
    move v3, v4

    goto :goto_10

    :pswitch_c
    move/from16 v12, p4

    move/from16 v13, p5

    move/from16 v18, v11

    move-wide/from16 v8, v23

    const/4 v1, 0x5

    move-object v11, v3

    move/from16 v23, v7

    move/from16 v3, v17

    const/16 v17, -0x1

    move-object/from16 v7, p6

    if-ne v0, v1, :cond_13

    invoke-static {v14, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzb([BI)F

    move-result v0

    invoke-static {v15, v8, v9, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JF)V

    add-int/lit8 v0, v10, 0x4

    goto :goto_b

    :pswitch_d
    move/from16 v12, p4

    move/from16 v13, p5

    move v1, v2

    move/from16 v18, v11

    move-wide/from16 v8, v23

    move-object v11, v3

    move/from16 v23, v7

    move/from16 v3, v17

    const/16 v17, -0x1

    move-object/from16 v7, p6

    if-ne v0, v1, :cond_13

    invoke-static {v14, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza([BI)D

    move-result-wide v0

    invoke-static {v15, v8, v9, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JD)V

    add-int/lit8 v0, v10, 0x8

    :goto_b
    or-int v1, v25, v20

    move v9, v3

    :goto_c
    move-object v2, v7

    :goto_d
    move-object v3, v11

    move v4, v12

    move v5, v13

    move/from16 v10, v18

    :goto_e
    move/from16 v8, v23

    move/from16 v13, v26

    :goto_f
    move v7, v0

    move v12, v1

    goto/16 :goto_0

    :cond_13
    :goto_10
    move/from16 v19, v3

    move v2, v10

    move-object/from16 v28, v11

    move v4, v12

    move/from16 v0, v18

    move/from16 v3, v23

    move-object v11, v6

    move v6, v13

    goto/16 :goto_4b

    :cond_14
    move/from16 v2, p4

    move/from16 v1, p5

    move/from16 v18, v11

    move/from16 v25, v12

    move/from16 v20, v13

    move-wide/from16 v12, v23

    const/16 v17, -0x1

    move-object v11, v3

    move/from16 v23, v7

    move v3, v9

    move-object/from16 v7, p6

    const/16 v9, 0x1b

    if-ne v4, v9, :cond_18

    const/4 v9, 0x2

    if-ne v0, v9, :cond_17

    invoke-virtual {v11, v15, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzakn;

    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakn;->zzc()Z

    move-result v4

    if-nez v4, :cond_16

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_15

    const/16 v4, 0xa

    goto :goto_11

    :cond_15
    shl-int/lit8 v4, v4, 0x1

    :goto_11
    invoke-interface {v0, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzakn;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakn;

    move-result-object v0

    invoke-virtual {v11, v15, v12, v13, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_16
    move-object v12, v0

    invoke-direct {v6, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v0

    move-object v4, v7

    move-object v7, v0

    move/from16 v8, v18

    move-object/from16 v9, p2

    move-object v0, v11

    move/from16 v5, v18

    move/from16 v11, p4

    move/from16 v26, v20

    move-object/from16 v13, p6

    invoke-static/range {v7 .. v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzamc;I[BIILcom/google/android/gms/internal/firebase-auth-api/zzakn;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v7

    move v9, v3

    move v10, v5

    move/from16 v8, v23

    move/from16 v12, v25

    move/from16 v13, v26

    move-object v3, v0

    move v5, v1

    move-object/from16 v29, v4

    move v4, v2

    move-object/from16 v2, v29

    goto/16 :goto_0

    :cond_17
    move/from16 v26, v20

    move v9, v10

    move-object/from16 v28, v11

    move/from16 v20, v18

    move v11, v3

    move-object v10, v7

    move v7, v2

    goto/16 :goto_3c

    :cond_18
    move-object v9, v11

    move/from16 v26, v20

    move-object v11, v7

    move/from16 v7, v18

    const/16 v1, 0x31

    if-gt v4, v1, :cond_55

    move/from16 v18, v7

    move/from16 v1, v19

    int-to-long v7, v1

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    invoke-virtual {v1, v15, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v9

    move-object/from16 v9, v19

    check-cast v9, Lcom/google/android/gms/internal/firebase-auth-api/zzakn;

    invoke-interface {v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzakn;->zzc()Z

    move-result v19

    if-nez v19, :cond_19

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v19

    move/from16 v27, v10

    const/16 v24, 0x1

    shl-int/lit8 v10, v19, 0x1

    invoke-interface {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzakn;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakn;

    move-result-object v9

    invoke-virtual {v1, v15, v12, v13, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_12

    :cond_19
    move/from16 v27, v10

    :goto_12
    move-object v12, v9

    packed-switch v4, :pswitch_data_1

    :cond_1a
    move v7, v2

    move v8, v3

    move-object v10, v11

    move/from16 v15, v18

    move-object/from16 v13, v20

    move/from16 v9, v27

    move/from16 v11, p5

    goto/16 :goto_34

    :pswitch_e
    const/4 v1, 0x3

    if-ne v0, v1, :cond_1a

    invoke-direct {v6, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v7

    move/from16 v5, v18

    move v8, v5

    move-object/from16 v4, v20

    move-object/from16 v9, p2

    move/from16 v1, v27

    move v10, v1

    move-object v0, v11

    move/from16 v11, p4

    move-object/from16 v13, p6

    invoke-static/range {v7 .. v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamc;I[BIILcom/google/android/gms/internal/firebase-auth-api/zzakn;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v7

    move/from16 v11, p5

    move-object v10, v0

    move v9, v1

    move v8, v3

    move-object v13, v4

    move v15, v5

    goto/16 :goto_1c

    :pswitch_f
    move-object v13, v11

    move/from16 v5, v18

    move-object/from16 v4, v20

    move/from16 v1, v27

    const/4 v7, 0x2

    if-ne v0, v7, :cond_1d

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    invoke-static {v14, v1, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v7, v13, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    add-int/2addr v7, v0

    :goto_13
    if-ge v0, v7, :cond_1b

    invoke-static {v14, v0, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget-wide v8, v13, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    invoke-static {v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzaji;->zza(J)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zza(J)V

    goto :goto_13

    :cond_1b
    if-ne v0, v7, :cond_1c

    goto/16 :goto_17

    :cond_1c
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_1d
    if-nez v0, :cond_22

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    invoke-static {v14, v1, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    :goto_14
    iget-wide v7, v13, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    invoke-static {v7, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzaji;->zza(J)J

    move-result-wide v7

    invoke-virtual {v12, v7, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zza(J)V

    if-ge v0, v2, :cond_21

    invoke-static {v14, v0, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v7

    iget v8, v13, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ne v5, v8, :cond_21

    invoke-static {v14, v7, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    goto :goto_14

    :pswitch_10
    move-object v13, v11

    move/from16 v5, v18

    move-object/from16 v4, v20

    move/from16 v1, v27

    const/4 v7, 0x2

    if-ne v0, v7, :cond_20

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    invoke-static {v14, v1, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v7, v13, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    add-int/2addr v7, v0

    :goto_15
    if-ge v0, v7, :cond_1e

    invoke-static {v14, v0, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v8, v13, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    invoke-static {v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzaji;->zza(I)I

    move-result v8

    invoke-virtual {v12, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzc(I)V

    goto :goto_15

    :cond_1e
    if-ne v0, v7, :cond_1f

    goto :goto_17

    :cond_1f
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_20
    if-nez v0, :cond_22

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    invoke-static {v14, v1, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    :goto_16
    iget v7, v13, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    invoke-static {v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzaji;->zza(I)I

    move-result v7

    invoke-virtual {v12, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzc(I)V

    if-ge v0, v2, :cond_21

    invoke-static {v14, v0, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v7

    iget v8, v13, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ne v5, v8, :cond_21

    invoke-static {v14, v7, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    goto :goto_16

    :cond_21
    :goto_17
    move/from16 v11, p5

    move v9, v1

    move v7, v2

    move v8, v3

    move v15, v5

    move-object v10, v13

    goto/16 :goto_2d

    :cond_22
    move/from16 v11, p5

    move v9, v1

    move v7, v2

    move v8, v3

    move v15, v5

    goto/16 :goto_19

    :pswitch_11
    move-object v13, v11

    move/from16 v5, v18

    move-object/from16 v4, v20

    move/from16 v1, v27

    const/4 v7, 0x2

    if-ne v0, v7, :cond_23

    invoke-static {v14, v1, v12, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza([BILcom/google/android/gms/internal/firebase-auth-api/zzakn;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    move/from16 v11, p5

    move/from16 v18, v0

    move v10, v1

    move v9, v2

    move v8, v3

    move-object v7, v4

    move v15, v5

    goto :goto_18

    :cond_23
    if-nez v0, :cond_25

    move v0, v5

    move/from16 v11, p5

    move v10, v1

    move-object/from16 v1, p2

    move v9, v2

    move v2, v10

    move v8, v3

    move/from16 v3, p4

    move-object v7, v4

    move-object v4, v12

    move v15, v5

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I[BIILcom/google/android/gms/internal/firebase-auth-api/zzakn;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    move/from16 v18, v0

    :goto_18
    invoke-direct {v6, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakk;

    move-result-object v3

    const/4 v4, 0x0

    iget-object v5, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    move-object/from16 v0, p1

    move/from16 v1, v23

    move-object v2, v12

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Ljava/lang/Object;ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzakk;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;)Ljava/lang/Object;

    move/from16 v0, v18

    :cond_24
    move-object/from16 v29, v13

    move-object v13, v7

    move v7, v9

    move v9, v10

    move-object/from16 v10, v29

    goto/16 :goto_35

    :cond_25
    move v15, v5

    move/from16 v11, p5

    move v9, v1

    move v7, v2

    move v8, v3

    :goto_19
    move-object v10, v13

    goto/16 :goto_23

    :pswitch_12
    move v9, v2

    move v8, v3

    move-object v13, v11

    move/from16 v15, v18

    move-object/from16 v7, v20

    move/from16 v10, v27

    const/4 v1, 0x2

    move/from16 v11, p5

    if-ne v0, v1, :cond_2b

    invoke-static {v14, v10, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v1, v13, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ltz v1, :cond_2a

    array-length v2, v14

    sub-int/2addr v2, v0

    if-gt v1, v2, :cond_29

    if-nez v1, :cond_26

    :goto_1a
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1b

    :cond_26
    invoke-static {v14, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;->zza([BII)Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    move-result-object v2

    invoke-interface {v12, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v0, v1

    :goto_1b
    if-ge v0, v9, :cond_24

    invoke-static {v14, v0, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v1

    iget v2, v13, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ne v15, v2, :cond_24

    invoke-static {v14, v1, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v1, v13, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ltz v1, :cond_28

    array-length v2, v14

    sub-int/2addr v2, v0

    if-gt v1, v2, :cond_27

    if-nez v1, :cond_26

    goto :goto_1a

    :cond_27
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_28
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_29
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_2a
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :pswitch_13
    move v9, v2

    move v8, v3

    move-object v13, v11

    move/from16 v15, v18

    move-object/from16 v7, v20

    move/from16 v10, v27

    const/4 v1, 0x2

    move/from16 v11, p5

    if-ne v0, v1, :cond_2b

    invoke-direct {v6, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v0

    move-object v4, v7

    move-object v7, v0

    move v3, v8

    move v8, v15

    move v2, v9

    move-object/from16 v9, p2

    move v1, v10

    move v0, v11

    move/from16 v11, p4

    move-object v5, v13

    move-object/from16 v13, p6

    invoke-static/range {v7 .. v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzamc;I[BIILcom/google/android/gms/internal/firebase-auth-api/zzakn;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v7

    move v11, v0

    move v9, v1

    move v8, v3

    move-object v13, v4

    move-object v10, v5

    :goto_1c
    move v0, v7

    move v7, v2

    goto/16 :goto_35

    :cond_2b
    move-object/from16 v29, v13

    move-object v13, v7

    move v7, v9

    move v9, v10

    move-object/from16 v10, v29

    goto/16 :goto_34

    :pswitch_14
    move-object v10, v11

    move/from16 v15, v18

    move-object/from16 v4, v20

    move/from16 v1, v27

    const/4 v9, 0x2

    move/from16 v11, p5

    if-ne v0, v9, :cond_37

    const-wide/32 v18, 0x20000000

    and-long v7, v7, v18

    cmp-long v0, v7, v21

    if-nez v0, :cond_30

    invoke-static {v14, v1, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v7, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ltz v7, :cond_2f

    if-nez v7, :cond_2c

    :goto_1d
    invoke-interface {v12, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    :cond_2c
    new-instance v8, Ljava/lang/String;

    sget-object v9, Lcom/google/android/gms/internal/firebase-auth-api/zzaki;->zza:Ljava/nio/charset/Charset;

    invoke-direct {v8, v14, v0, v7, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :goto_1e
    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v0, v7

    :goto_1f
    if-ge v0, v2, :cond_45

    invoke-static {v14, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v7

    iget v8, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ne v15, v8, :cond_45

    invoke-static {v14, v7, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v7, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ltz v7, :cond_2e

    if-nez v7, :cond_2d

    goto :goto_1d

    :cond_2d
    new-instance v8, Ljava/lang/String;

    sget-object v9, Lcom/google/android/gms/internal/firebase-auth-api/zzaki;->zza:Ljava/nio/charset/Charset;

    invoke-direct {v8, v14, v0, v7, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_1e

    :cond_2e
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_2f
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_30
    invoke-static {v14, v1, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v7, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ltz v7, :cond_36

    if-nez v7, :cond_31

    :goto_20
    invoke-interface {v12, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_22

    :cond_31
    add-int v8, v0, v7

    invoke-static {v14, v0, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzanb;->zzc([BII)Z

    move-result v9

    if-eqz v9, :cond_35

    new-instance v9, Ljava/lang/String;

    sget-object v13, Lcom/google/android/gms/internal/firebase-auth-api/zzaki;->zza:Ljava/nio/charset/Charset;

    invoke-direct {v9, v14, v0, v7, v13}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :goto_21
    invoke-interface {v12, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, v8

    :goto_22
    if-ge v0, v2, :cond_45

    invoke-static {v14, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v7

    iget v8, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ne v15, v8, :cond_45

    invoke-static {v14, v7, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v7, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ltz v7, :cond_34

    if-nez v7, :cond_32

    goto :goto_20

    :cond_32
    add-int v8, v0, v7

    invoke-static {v14, v0, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzanb;->zzc([BII)Z

    move-result v9

    if-eqz v9, :cond_33

    new-instance v9, Ljava/lang/String;

    sget-object v13, Lcom/google/android/gms/internal/firebase-auth-api/zzaki;->zza:Ljava/nio/charset/Charset;

    invoke-direct {v9, v14, v0, v7, v13}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_21

    :cond_33
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_34
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_35
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_36
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_37
    move v9, v1

    move v7, v2

    move v8, v3

    :goto_23
    move-object v13, v4

    goto/16 :goto_34

    :pswitch_15
    move-object v10, v11

    move/from16 v15, v18

    move-object/from16 v4, v20

    move/from16 v1, v27

    const/4 v5, 0x2

    move/from16 v11, p5

    if-ne v0, v5, :cond_3b

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzaiu;

    invoke-static {v14, v1, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v5, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    add-int/2addr v5, v0

    :goto_24
    if-ge v0, v5, :cond_39

    invoke-static {v14, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget-wide v7, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    cmp-long v7, v7, v21

    if-eqz v7, :cond_38

    const/4 v7, 0x1

    goto :goto_25

    :cond_38
    move/from16 v7, v16

    :goto_25
    invoke-virtual {v12, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiu;->zza(Z)V

    goto :goto_24

    :cond_39
    if-ne v0, v5, :cond_3a

    goto/16 :goto_2c

    :cond_3a
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_3b
    if-nez v0, :cond_37

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzaiu;

    invoke-static {v14, v1, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget-wide v7, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    cmp-long v5, v7, v21

    if-eqz v5, :cond_3c

    :goto_26
    const/4 v5, 0x1

    goto :goto_27

    :cond_3c
    move/from16 v5, v16

    :goto_27
    invoke-virtual {v12, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzaiu;->zza(Z)V

    if-ge v0, v2, :cond_45

    invoke-static {v14, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v5

    iget v7, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ne v15, v7, :cond_45

    invoke-static {v14, v5, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget-wide v7, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    cmp-long v5, v7, v21

    if-eqz v5, :cond_3c

    goto :goto_26

    :pswitch_16
    move-object v10, v11

    move/from16 v15, v18

    move-object/from16 v4, v20

    move/from16 v1, v27

    const/4 v5, 0x2

    move/from16 v11, p5

    if-ne v0, v5, :cond_40

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    invoke-static {v14, v1, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v5, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    add-int v7, v0, v5

    array-length v8, v14

    if-gt v7, v8, :cond_3f

    invoke-virtual {v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->size()I

    move-result v8

    div-int/lit8 v5, v5, 0x4

    add-int/2addr v5, v8

    invoke-virtual {v12, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzd(I)V

    :goto_28
    if-ge v0, v7, :cond_3d

    invoke-static {v14, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BI)I

    move-result v5

    invoke-virtual {v12, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzc(I)V

    add-int/lit8 v0, v0, 0x4

    goto :goto_28

    :cond_3d
    if-ne v0, v7, :cond_3e

    goto/16 :goto_2c

    :cond_3e
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_3f
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_40
    const/4 v5, 0x5

    if-ne v0, v5, :cond_37

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;

    invoke-static {v14, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BI)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzc(I)V

    add-int/lit8 v0, v1, 0x4

    :goto_29
    if-ge v0, v2, :cond_45

    invoke-static {v14, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v5

    iget v7, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ne v15, v7, :cond_45

    invoke-static {v14, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BI)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzc(I)V

    add-int/lit8 v0, v5, 0x4

    goto :goto_29

    :pswitch_17
    move-object v10, v11

    move/from16 v15, v18

    move-object/from16 v4, v20

    move/from16 v1, v27

    const/4 v5, 0x2

    move/from16 v11, p5

    if-ne v0, v5, :cond_44

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    invoke-static {v14, v1, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v5, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    add-int v7, v0, v5

    array-length v8, v14

    if-gt v7, v8, :cond_43

    invoke-virtual {v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->size()I

    move-result v8

    div-int/lit8 v5, v5, 0x8

    add-int/2addr v5, v8

    invoke-virtual {v12, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zzc(I)V

    :goto_2a
    if-ge v0, v7, :cond_41

    invoke-static {v14, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BI)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zza(J)V

    add-int/lit8 v0, v0, 0x8

    goto :goto_2a

    :cond_41
    if-ne v0, v7, :cond_42

    goto :goto_2c

    :cond_42
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_43
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_44
    const/4 v5, 0x1

    if-ne v0, v5, :cond_37

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    invoke-static {v14, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BI)J

    move-result-wide v7

    invoke-virtual {v12, v7, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zza(J)V

    add-int/lit8 v0, v1, 0x8

    :goto_2b
    if-ge v0, v2, :cond_45

    invoke-static {v14, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v5

    iget v7, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ne v15, v7, :cond_45

    invoke-static {v14, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BI)J

    move-result-wide v7

    invoke-virtual {v12, v7, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zza(J)V

    add-int/lit8 v0, v5, 0x8

    goto :goto_2b

    :pswitch_18
    move-object v10, v11

    move/from16 v15, v18

    move-object/from16 v4, v20

    move/from16 v1, v27

    const/4 v5, 0x2

    move/from16 v11, p5

    if-ne v0, v5, :cond_46

    invoke-static {v14, v1, v12, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza([BILcom/google/android/gms/internal/firebase-auth-api/zzakn;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    :cond_45
    :goto_2c
    move v9, v1

    move v7, v2

    move v8, v3

    :goto_2d
    move-object v13, v4

    goto/16 :goto_35

    :cond_46
    if-nez v0, :cond_37

    move v0, v15

    move v9, v1

    move-object/from16 v1, p2

    move v7, v2

    move v2, v9

    move v8, v3

    move/from16 v3, p4

    move-object v13, v4

    move-object v4, v12

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I[BIILcom/google/android/gms/internal/firebase-auth-api/zzakn;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    goto/16 :goto_35

    :pswitch_19
    move v7, v2

    move v8, v3

    move-object v10, v11

    move/from16 v15, v18

    move-object/from16 v13, v20

    move/from16 v9, v27

    const/4 v1, 0x2

    move/from16 v11, p5

    if-ne v0, v1, :cond_49

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    invoke-static {v14, v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v1, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    add-int/2addr v1, v0

    :goto_2e
    if-ge v0, v1, :cond_47

    invoke-static {v14, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget-wide v2, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    invoke-virtual {v12, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zza(J)V

    goto :goto_2e

    :cond_47
    if-ne v0, v1, :cond_48

    goto/16 :goto_35

    :cond_48
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_49
    if-nez v0, :cond_52

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;

    invoke-static {v14, v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    :goto_2f
    iget-wide v1, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    invoke-virtual {v12, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaky;->zza(J)V

    if-ge v0, v7, :cond_53

    invoke-static {v14, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v1

    iget v2, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ne v15, v2, :cond_53

    invoke-static {v14, v1, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    goto :goto_2f

    :pswitch_1a
    move v7, v2

    move v8, v3

    move-object v10, v11

    move/from16 v15, v18

    move-object/from16 v13, v20

    move/from16 v9, v27

    const/4 v1, 0x2

    move/from16 v11, p5

    if-ne v0, v1, :cond_4d

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzake;

    invoke-static {v14, v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v1, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    add-int v2, v0, v1

    array-length v3, v14

    if-gt v2, v3, :cond_4c

    invoke-virtual {v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzake;->size()I

    move-result v3

    div-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v3

    invoke-virtual {v12, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzake;->zzc(I)V

    :goto_30
    if-ge v0, v2, :cond_4a

    invoke-static {v14, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzb([BI)F

    move-result v1

    invoke-virtual {v12, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzake;->zza(F)V

    add-int/lit8 v0, v0, 0x4

    goto :goto_30

    :cond_4a
    if-ne v0, v2, :cond_4b

    goto/16 :goto_35

    :cond_4b
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_4c
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_4d
    const/4 v1, 0x5

    if-ne v0, v1, :cond_52

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzake;

    invoke-static {v14, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzb([BI)F

    move-result v0

    invoke-virtual {v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzake;->zza(F)V

    add-int/lit8 v0, v9, 0x4

    :goto_31
    if-ge v0, v7, :cond_53

    invoke-static {v14, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v1

    iget v2, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ne v15, v2, :cond_53

    invoke-static {v14, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzb([BI)F

    move-result v0

    invoke-virtual {v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzake;->zza(F)V

    add-int/lit8 v0, v1, 0x4

    goto :goto_31

    :pswitch_1b
    move v7, v2

    move v8, v3

    move-object v10, v11

    move/from16 v15, v18

    move-object/from16 v13, v20

    move/from16 v9, v27

    const/4 v1, 0x2

    move/from16 v11, p5

    if-ne v0, v1, :cond_51

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;

    invoke-static {v14, v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v1, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    add-int v2, v0, v1

    array-length v3, v14

    if-gt v2, v3, :cond_50

    invoke-virtual {v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;->size()I

    move-result v3

    div-int/lit8 v1, v1, 0x8

    add-int/2addr v1, v3

    invoke-virtual {v12, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;->zzc(I)V

    :goto_32
    if-ge v0, v2, :cond_4e

    invoke-static {v14, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza([BI)D

    move-result-wide v3

    invoke-virtual {v12, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;->zza(D)V

    add-int/lit8 v0, v0, 0x8

    goto :goto_32

    :cond_4e
    if-ne v0, v2, :cond_4f

    goto :goto_35

    :cond_4f
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_50
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_51
    const/4 v1, 0x1

    if-ne v0, v1, :cond_52

    check-cast v12, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;

    invoke-static {v14, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza([BI)D

    move-result-wide v0

    invoke-virtual {v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;->zza(D)V

    add-int/lit8 v0, v9, 0x8

    :goto_33
    if-ge v0, v7, :cond_53

    invoke-static {v14, v0, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v1

    iget v2, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ne v15, v2, :cond_53

    invoke-static {v14, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza([BI)D

    move-result-wide v2

    invoke-virtual {v12, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;->zza(D)V

    add-int/lit8 v0, v1, 0x8

    goto :goto_33

    :cond_52
    :goto_34
    move v0, v9

    :cond_53
    :goto_35
    if-ne v0, v9, :cond_54

    move v2, v0

    move v4, v7

    move/from16 v19, v8

    move-object v7, v10

    move-object/from16 v28, v13

    move v0, v15

    move/from16 v3, v23

    move-object/from16 v15, p1

    move/from16 v29, v11

    move-object v11, v6

    move/from16 v6, v29

    goto/16 :goto_4b

    :cond_54
    move v4, v7

    move v9, v8

    move-object v2, v10

    move v5, v11

    move-object v3, v13

    move v10, v15

    move/from16 v8, v23

    move/from16 v12, v25

    move/from16 v13, v26

    move-object/from16 v15, p1

    :goto_36
    move v7, v0

    goto/16 :goto_0

    :cond_55
    move v15, v7

    move-object/from16 v20, v9

    move v9, v10

    move-object v10, v11

    move/from16 v1, v19

    move/from16 v11, p5

    move v7, v2

    move v2, v3

    const/16 v3, 0x32

    if-ne v4, v3, :cond_61

    const/4 v3, 0x2

    if-ne v0, v3, :cond_60

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    invoke-direct {v6, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzf(I)Ljava/lang/Object;

    move-result-object v1

    move v8, v15

    move-object/from16 v15, p1

    invoke-virtual {v0, v15, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zzf(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_56

    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v5, v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v15, v12, v13, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v3, v4

    :cond_56
    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzale;

    move-result-object v12

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zze(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v13

    invoke-static {v14, v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v1, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-ltz v1, :cond_5f

    sub-int v3, v7, v0

    if-gt v1, v3, :cond_5f

    add-int v5, v0, v1

    iget-object v1, v12, Lcom/google/android/gms/internal/firebase-auth-api/zzale;->zzb:Ljava/lang/Object;

    iget-object v3, v12, Lcom/google/android/gms/internal/firebase-auth-api/zzale;->zzd:Ljava/lang/Object;

    move-object v4, v1

    :goto_37
    if-ge v0, v5, :cond_5c

    add-int/lit8 v1, v0, 0x1

    aget-byte v0, v14, v0

    if-gez v0, :cond_57

    invoke-static {v0, v14, v1, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I[BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v1, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    move/from16 v29, v1

    move v1, v0

    move/from16 v0, v29

    :cond_57
    move/from16 v27, v2

    ushr-int/lit8 v2, v0, 0x3

    move-object/from16 p3, v3

    and-int/lit8 v3, v0, 0x7

    move-object/from16 v18, v4

    const/4 v4, 0x1

    if-eq v2, v4, :cond_5a

    const/4 v4, 0x2

    if-eq v2, v4, :cond_58

    move-object/from16 v3, p3

    move v6, v5

    move-object/from16 v28, v20

    move/from16 v11, v27

    move/from16 v20, v8

    move-object/from16 v8, v18

    goto/16 :goto_39

    :cond_58
    iget-object v2, v12, Lcom/google/android/gms/internal/firebase-auth-api/zzale;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzanh;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzanh;->zza()I

    move-result v2

    if-ne v3, v2, :cond_59

    iget-object v3, v12, Lcom/google/android/gms/internal/firebase-auth-api/zzale;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzanh;

    iget-object v0, v12, Lcom/google/android/gms/internal/firebase-auth-api/zzale;->zzd:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v19

    move-object/from16 v0, p2

    move/from16 v11, v27

    move/from16 v2, p4

    move-object/from16 v28, v20

    move/from16 v20, v8

    move-object/from16 v8, v18

    move-object/from16 v4, v19

    move v6, v5

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza([BIILcom/google/android/gms/internal/firebase-auth-api/zzanh;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget-object v3, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    goto :goto_3a

    :cond_59
    move v6, v5

    move-object/from16 v28, v20

    move/from16 v11, v27

    move/from16 v20, v8

    move-object/from16 v8, v18

    goto :goto_38

    :cond_5a
    move v6, v5

    move-object/from16 v28, v20

    move/from16 v11, v27

    move/from16 v20, v8

    move-object/from16 v8, v18

    iget-object v2, v12, Lcom/google/android/gms/internal/firebase-auth-api/zzale;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzanh;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzanh;->zza()I

    move-result v2

    if-ne v3, v2, :cond_5b

    iget-object v3, v12, Lcom/google/android/gms/internal/firebase-auth-api/zzale;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzanh;

    const/4 v4, 0x0

    move-object/from16 v0, p2

    move/from16 v2, p4

    move-object/from16 v8, p3

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza([BIILcom/google/android/gms/internal/firebase-auth-api/zzanh;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget-object v4, v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    move v5, v6

    move-object v3, v8

    goto :goto_3b

    :cond_5b
    :goto_38
    move-object/from16 v3, p3

    :goto_39
    invoke-static {v0, v14, v1, v7, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I[BIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    :goto_3a
    move v5, v6

    move-object v4, v8

    :goto_3b
    move v2, v11

    move/from16 v8, v20

    move-object/from16 v20, v28

    move-object/from16 v6, p0

    move/from16 v11, p5

    goto/16 :goto_37

    :cond_5c
    move v11, v2

    move v6, v5

    move-object/from16 v28, v20

    move/from16 v20, v8

    move-object v8, v4

    if-ne v0, v6, :cond_5e

    invoke-interface {v13, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-ne v6, v9, :cond_5d

    move v2, v6

    move v4, v7

    move-object v7, v10

    move/from16 v19, v11

    move/from16 v0, v20

    move/from16 v3, v23

    move-object/from16 v11, p0

    move/from16 v6, p5

    goto/16 :goto_4b

    :cond_5d
    move/from16 v5, p5

    move v4, v7

    move-object v2, v10

    move v9, v11

    move/from16 v10, v20

    move/from16 v8, v23

    move/from16 v12, v25

    move/from16 v13, v26

    move-object/from16 v3, v28

    move v7, v6

    move-object/from16 v6, p0

    goto/16 :goto_0

    :cond_5e
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_5f
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzj()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_60
    move v11, v2

    move-object/from16 v28, v20

    move/from16 v20, v15

    move-object/from16 v15, p1

    :goto_3c
    move/from16 v6, p5

    move v4, v7

    move v2, v9

    move-object v7, v10

    move/from16 v19, v11

    move/from16 v0, v20

    move/from16 v3, v23

    move-object/from16 v11, p0

    goto/16 :goto_4b

    :cond_61
    move v11, v2

    move v6, v15

    move-object/from16 v28, v20

    move-object/from16 v15, p1

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    add-int/lit8 v3, v11, 0x2

    aget v3, v8, v3

    const v8, 0xfffff

    and-int/2addr v3, v8

    move/from16 v27, v9

    int-to-long v8, v3

    packed-switch v4, :pswitch_data_2

    move/from16 v18, v6

    move v4, v7

    :goto_3d
    move-object v7, v10

    move/from16 v19, v11

    move/from16 v3, v23

    move/from16 v10, v27

    move-object/from16 v11, p0

    goto/16 :goto_49

    :pswitch_1c
    const/4 v3, 0x3

    if-ne v0, v3, :cond_62

    move-object/from16 v5, p0

    move/from16 v4, v23

    invoke-direct {v5, v15, v4, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v0

    and-int/lit8 v1, v6, -0x8

    or-int/lit8 v12, v1, 0x4

    invoke-direct {v5, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v8

    move v3, v7

    move-object v7, v0

    const v1, 0xfffff

    move/from16 v2, v27

    move-object/from16 v9, p2

    move-object v13, v10

    move v10, v2

    move v3, v11

    move/from16 v11, p4

    move-object v1, v13

    move-object/from16 v13, p6

    invoke-static/range {v7 .. v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v7

    invoke-direct {v5, v15, v4, v3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IILjava/lang/Object;)V

    move/from16 v19, v3

    move v3, v4

    move-object v11, v5

    move/from16 v18, v6

    move v0, v7

    move/from16 v4, p4

    move-object v7, v1

    goto/16 :goto_4a

    :cond_62
    move/from16 v4, p4

    move/from16 v18, v6

    goto :goto_3d

    :pswitch_1d
    move-object/from16 v5, p0

    move-object v1, v10

    move v3, v11

    move/from16 v4, v23

    move/from16 v10, v27

    if-nez v0, :cond_63

    invoke-static {v14, v10, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    move/from16 v18, v6

    iget-wide v6, v1, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    invoke-static {v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzaji;->zza(J)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_3e

    :cond_63
    move-object v7, v1

    move/from16 v19, v3

    move v3, v4

    move-object v11, v5

    move/from16 v18, v6

    goto/16 :goto_42

    :pswitch_1e
    move-object/from16 v5, p0

    move/from16 v18, v6

    move-object v1, v10

    move v3, v11

    move/from16 v4, v23

    move/from16 v10, v27

    if-nez v0, :cond_66

    invoke-static {v14, v10, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v6, v1, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    invoke-static {v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzaji;->zza(I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_3e
    invoke-virtual {v2, v15, v12, v13, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v2, v15, v8, v9, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move-object v7, v1

    move/from16 v19, v3

    move v3, v4

    move-object v11, v5

    move/from16 v4, p4

    goto/16 :goto_4a

    :pswitch_1f
    move-object/from16 v5, p0

    move/from16 v18, v6

    move-object v1, v10

    move v3, v11

    move/from16 v4, v23

    move/from16 v10, v27

    if-nez v0, :cond_66

    invoke-static {v14, v10, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v6, v1, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    invoke-direct {v5, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakk;

    move-result-object v7

    if-eqz v7, :cond_65

    invoke-interface {v7, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzakk;->zza(I)Z

    move-result v7

    if-eqz v7, :cond_64

    goto :goto_3f

    :cond_64
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzamy;

    move-result-object v2

    int-to-long v6, v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    move/from16 v11, v18

    invoke-virtual {v2, v11, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzamy;->zza(ILjava/lang/Object;)V

    goto :goto_41

    :cond_65
    :goto_3f
    move/from16 v11, v18

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_40

    :cond_66
    move-object v7, v1

    move/from16 v19, v3

    move v3, v4

    move-object v11, v5

    goto/16 :goto_42

    :pswitch_20
    move-object/from16 v5, p0

    move-object v1, v10

    move v3, v11

    move/from16 v4, v23

    move/from16 v10, v27

    move v11, v6

    const/4 v6, 0x2

    if-ne v0, v6, :cond_67

    invoke-static {v14, v10, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget-object v6, v1, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzc:Ljava/lang/Object;

    :goto_40
    invoke-virtual {v2, v15, v12, v13, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v2, v15, v8, v9, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_41
    move-object v7, v1

    move/from16 v19, v3

    move v3, v4

    move/from16 v18, v11

    move/from16 v4, p4

    move-object v11, v5

    goto/16 :goto_4a

    :cond_67
    move-object v7, v1

    move/from16 v19, v3

    move v3, v4

    move/from16 v18, v11

    move/from16 v4, p4

    move-object v11, v5

    goto/16 :goto_49

    :pswitch_21
    move-object/from16 v5, p0

    move-object v1, v10

    move v3, v11

    move/from16 v4, v23

    move/from16 v10, v27

    move v11, v6

    const/4 v6, 0x2

    if-ne v0, v6, :cond_68

    invoke-direct {v5, v15, v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v6

    invoke-direct {v5, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v2

    move-object v0, v6

    move-object v7, v1

    const v8, 0xfffff

    move-object v1, v2

    move-object/from16 v2, p2

    move/from16 v9, p4

    move v12, v3

    move v3, v10

    move v13, v4

    move/from16 v4, p4

    move/from16 v18, v11

    move-object v11, v5

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;[BIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    invoke-direct {v11, v15, v13, v12, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IILjava/lang/Object;)V

    move v4, v9

    move/from16 v19, v12

    move v3, v13

    goto/16 :goto_4a

    :cond_68
    move-object v7, v1

    move/from16 v18, v11

    move-object v11, v5

    move/from16 v19, v3

    move v3, v4

    :goto_42
    move/from16 v4, p4

    goto/16 :goto_49

    :pswitch_22
    move/from16 v18, v6

    move v4, v7

    move-object v7, v10

    move/from16 v19, v11

    move/from16 v3, v23

    move/from16 v10, v27

    const/4 v6, 0x2

    move-object/from16 v11, p0

    if-ne v0, v6, :cond_6d

    invoke-static {v14, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v6, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    if-nez v6, :cond_69

    invoke-virtual {v2, v15, v12, v13, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_48

    :cond_69
    const/high16 v5, 0x20000000

    and-int/2addr v1, v5

    if-eqz v1, :cond_6b

    add-int v1, v0, v6

    invoke-static {v14, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanb;->zzc([BII)Z

    move-result v1

    if-eqz v1, :cond_6a

    goto :goto_43

    :cond_6a
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_6b
    :goto_43
    new-instance v1, Ljava/lang/String;

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzaki;->zza:Ljava/nio/charset/Charset;

    invoke-direct {v1, v14, v0, v6, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v2, v15, v12, v13, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v0, v6

    goto/16 :goto_48

    :pswitch_23
    move/from16 v18, v6

    move v4, v7

    move-object v7, v10

    move/from16 v19, v11

    move/from16 v3, v23

    move/from16 v10, v27

    move-object/from16 v11, p0

    if-nez v0, :cond_6d

    invoke-static {v14, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget-wide v5, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    cmp-long v1, v5, v21

    if-eqz v1, :cond_6c

    const/16 v24, 0x1

    goto :goto_44

    :cond_6c
    move/from16 v24, v16

    :goto_44
    invoke-static/range {v24 .. v24}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto/16 :goto_45

    :pswitch_24
    move/from16 v18, v6

    move v4, v7

    move-object v7, v10

    move/from16 v19, v11

    move/from16 v3, v23

    move/from16 v10, v27

    const/4 v1, 0x5

    move-object/from16 v11, p0

    if-ne v0, v1, :cond_6d

    invoke-static {v14, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_46

    :pswitch_25
    move/from16 v18, v6

    move v4, v7

    move-object v7, v10

    move/from16 v19, v11

    move/from16 v3, v23

    move/from16 v10, v27

    const/4 v1, 0x1

    move-object/from16 v11, p0

    if-ne v0, v1, :cond_6d

    invoke-static {v14, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto/16 :goto_47

    :pswitch_26
    move/from16 v18, v6

    move v4, v7

    move-object v7, v10

    move/from16 v19, v11

    move/from16 v3, v23

    move/from16 v10, v27

    move-object/from16 v11, p0

    if-nez v0, :cond_6d

    invoke-static {v14, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzc([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zza:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_45

    :pswitch_27
    move/from16 v18, v6

    move v4, v7

    move-object v7, v10

    move/from16 v19, v11

    move/from16 v3, v23

    move/from16 v10, v27

    move-object/from16 v11, p0

    if-nez v0, :cond_6d

    invoke-static {v14, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzd([BILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v0

    iget-wide v5, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzb:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_45
    invoke-virtual {v2, v15, v12, v13, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_48

    :pswitch_28
    move/from16 v18, v6

    move v4, v7

    move-object v7, v10

    move/from16 v19, v11

    move/from16 v3, v23

    move/from16 v10, v27

    const/4 v1, 0x5

    move-object/from16 v11, p0

    if-ne v0, v1, :cond_6d

    invoke-static {v14, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzb([BI)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :goto_46
    invoke-virtual {v2, v15, v12, v13, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v0, v10, 0x4

    goto :goto_48

    :pswitch_29
    move/from16 v18, v6

    move v4, v7

    move-object v7, v10

    move/from16 v19, v11

    move/from16 v3, v23

    move/from16 v10, v27

    const/4 v1, 0x1

    move-object/from16 v11, p0

    if-ne v0, v1, :cond_6d

    invoke-static {v14, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza([BI)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :goto_47
    invoke-virtual {v2, v15, v12, v13, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v0, v10, 0x8

    :goto_48
    invoke-virtual {v2, v15, v8, v9, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_4a

    :cond_6d
    :goto_49
    move v0, v10

    :goto_4a
    if-ne v0, v10, :cond_71

    move/from16 v6, p5

    move v2, v0

    move/from16 v0, v18

    :goto_4b
    if-ne v0, v6, :cond_6f

    if-nez v6, :cond_6e

    goto :goto_4c

    :cond_6e
    move v10, v0

    move v7, v2

    move v9, v4

    move/from16 v12, v25

    move/from16 v13, v26

    goto/16 :goto_4e

    :cond_6f
    :goto_4c
    iget-boolean v1, v11, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzh:Z

    if-eqz v1, :cond_70

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzajv;

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzajv;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzajv;

    if-eq v1, v5, :cond_70

    iget-object v12, v11, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    iget-object v13, v11, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    move v7, v0

    move-object/from16 v8, p2

    move v9, v2

    move/from16 v10, p4

    move/from16 v18, v0

    move-object v5, v11

    move-object/from16 v11, p1

    move-object/from16 v14, p6

    invoke-static/range {v7 .. v14}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I[BIILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzaln;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v7

    move-object/from16 v14, p2

    move-object/from16 v2, p6

    move v8, v3

    move/from16 v10, v18

    move/from16 v9, v19

    move/from16 v12, v25

    move/from16 v13, v26

    move-object/from16 v3, v28

    move/from16 v29, v6

    move-object v6, v5

    move/from16 v5, v29

    goto/16 :goto_0

    :cond_70
    move/from16 v18, v0

    move-object v5, v11

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzamy;

    move-result-object v7

    move/from16 v0, v18

    move-object/from16 v1, p2

    move v8, v3

    move/from16 v3, p4

    move v9, v4

    move-object v4, v7

    move-object v11, v5

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zza(I[BIILcom/google/android/gms/internal/firebase-auth-api/zzamy;Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    move-result v7

    move-object/from16 v14, p2

    move-object/from16 v2, p6

    move v5, v6

    move v4, v9

    :goto_4d
    move-object v6, v11

    move/from16 v10, v18

    move/from16 v9, v19

    move/from16 v12, v25

    move/from16 v13, v26

    move-object/from16 v3, v28

    goto/16 :goto_0

    :cond_71
    move v8, v3

    move-object/from16 v14, p2

    move/from16 v5, p5

    move-object/from16 v2, p6

    move v7, v0

    goto :goto_4d

    :cond_72
    move-object/from16 v28, v3

    move v9, v4

    move-object v11, v6

    move/from16 v25, v12

    move/from16 v26, v13

    move v6, v5

    :goto_4e
    const v0, 0xfffff

    if-eq v13, v0, :cond_73

    int-to-long v0, v13

    move-object/from16 v2, v28

    invoke-virtual {v2, v15, v0, v1, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_73
    const/4 v0, 0x0

    iget v1, v11, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzl:I

    move-object v3, v0

    move v8, v1

    :goto_4f
    iget v0, v11, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzm:I

    if-ge v8, v0, :cond_74

    iget-object v0, v11, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzk:[I

    aget v2, v0, v8

    iget-object v4, v11, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/zzamy;

    add-int/lit8 v8, v8, 0x1

    goto :goto_4f

    :cond_74
    if-eqz v3, :cond_75

    iget-object v0, v11, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    invoke-virtual {v0, v15, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzb(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_75
    if-nez v6, :cond_77

    if-ne v7, v9, :cond_76

    goto :goto_50

    :cond_76
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :cond_77
    if-gt v7, v9, :cond_78

    if-ne v10, v6, :cond_78

    :goto_50
    return v7

    :cond_78
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakm;->zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzakm;

    move-result-object v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x12
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_18
        :pswitch_11
        :pswitch_16
        :pswitch_17
        :pswitch_10
        :pswitch_f
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_18
        :pswitch_11
        :pswitch_16
        :pswitch_17
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x33
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_26
        :pswitch_1f
        :pswitch_24
        :pswitch_25
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
    .end packed-switch
.end method

.method public final zza()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzn:Lcom/google/android/gms/internal/firebase-auth-api/zzalv;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalv;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamd;Lcom/google/android/gms/internal/firebase-auth-api/zzajv;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzamd;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzajv;",
            ")V"
        }
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v15, p1

    move-object/from16 v0, p2

    move-object/from16 v6, p3

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzf(Ljava/lang/Object;)V

    iget-object v14, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    iget-object v5, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    const/16 v16, 0x0

    move-object/from16 v4, v16

    move-object v8, v4

    :goto_0
    :try_start_0
    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzc()I

    move-result v2

    invoke-direct {v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(I)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const/4 v9, 0x0

    if-gez v1, :cond_a

    const v1, 0x7fffffff

    if-ne v2, v1, :cond_2

    iget v0, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzl:I

    :goto_1
    iget v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzm:I

    if-ge v0, v1, :cond_0

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzk:[I

    aget v3, v1, v0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v5, v14

    move-object/from16 v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    if-eqz v4, :cond_1

    invoke-virtual {v14, v15, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzb(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void

    :cond_2
    :try_start_1
    iget-boolean v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzh:Z

    if-nez v1, :cond_3

    move-object/from16 v11, v16

    goto :goto_2

    :cond_3
    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    invoke-virtual {v5, v6, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzajv;Lcom/google/android/gms/internal/firebase-auth-api/zzaln;I)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    :goto_2
    if-eqz v11, :cond_6

    if-nez v8, :cond_4

    invoke-virtual {v5, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzajy;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :cond_4
    move-object v1, v8

    :goto_3
    move-object v8, v5

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v12, p3

    move-object v13, v1

    move-object v3, v14

    move-object v14, v4

    move-object v2, v15

    move-object v15, v3

    :try_start_2
    invoke-virtual/range {v8 .. v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamd;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzajv;Lcom/google/android/gms/internal/firebase-auth-api/zzajy;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v1

    :cond_5
    move-object v15, v2

    move-object v14, v3

    goto :goto_0

    :cond_6
    move-object v3, v14

    move-object v2, v15

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamd;)Z

    if-nez v4, :cond_7

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    :cond_7
    invoke-virtual {v3, v4, v0, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamd;I)Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v1, :cond_5

    iget v0, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzl:I

    :goto_4
    iget v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzm:I

    if-ge v0, v1, :cond_8

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzk:[I

    aget v5, v1, v0

    move-object/from16 v1, p0

    move-object v10, v2

    move-object/from16 v2, p1

    move-object v11, v3

    move v3, v5

    move-object v5, v11

    move-object/from16 v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    move-object v2, v10

    move-object v3, v11

    goto :goto_4

    :cond_8
    move-object v10, v2

    move-object v11, v3

    if-eqz v4, :cond_9

    invoke-virtual {v11, v10, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzb(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_9
    return-void

    :catchall_0
    move-exception v0

    move-object v10, v2

    move-object v11, v3

    goto/16 :goto_20

    :catchall_1
    move-exception v0

    move-object v11, v14

    move-object v10, v15

    goto/16 :goto_20

    :cond_a
    move-object v11, v14

    move-object v10, v15

    :try_start_3
    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    const/high16 v12, 0xff00000

    and-int/2addr v12, v3

    ushr-int/lit8 v12, v12, 0x14

    const v13, 0xfffff

    packed-switch v12, :pswitch_data_0

    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    if-nez v14, :cond_12

    :try_start_4
    invoke-virtual {v11, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_4
    .catch Lcom/google/android/gms/internal/firebase-auth-api/zzakp; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto/16 :goto_18

    :pswitch_0
    :try_start_5
    invoke-direct {v7, v10, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v12

    invoke-interface {v0, v3, v12, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;Lcom/google/android/gms/internal/firebase-auth-api/zzajv;)V

    :goto_5
    invoke-direct {v7, v10, v2, v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IILjava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_1
    and-int/2addr v3, v13

    int-to-long v12, v3

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzn()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_2
    and-int/2addr v3, v13

    int-to-long v12, v3

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzi()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_6
    invoke-direct {v7, v10, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(Ljava/lang/Object;II)V

    goto :goto_8

    :pswitch_3
    and-int/2addr v3, v13

    int-to-long v12, v3

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzm()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_4
    and-int/2addr v3, v13

    int-to-long v12, v3

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzh()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_5
    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zze()I

    move-result v12

    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakk;

    move-result-object v14

    if-eqz v14, :cond_c

    invoke-interface {v14, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzakk;->zza(I)Z

    move-result v14

    if-eqz v14, :cond_b

    goto :goto_7

    :cond_b
    invoke-static {v10, v2, v12, v4, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_17

    :cond_c
    :goto_7
    and-int/2addr v3, v13

    int-to-long v13, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v10, v13, v14, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_6
    and-int/2addr v3, v13

    int-to-long v12, v3

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzj()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_7
    and-int/2addr v3, v13

    int-to-long v12, v3

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzp()Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    move-result-object v3

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_8
    invoke-direct {v7, v10, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v12

    invoke-interface {v0, v3, v12, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;Lcom/google/android/gms/internal/firebase-auth-api/zzajv;)V

    goto/16 :goto_5

    :pswitch_9
    invoke-direct {v7, v10, v3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;ILcom/google/android/gms/internal/firebase-auth-api/zzamd;)V

    goto :goto_6

    :goto_8
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    goto/16 :goto_16

    :pswitch_a
    and-int/2addr v3, v13

    int-to-long v12, v3

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzs()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_b
    and-int/2addr v3, v13

    int-to-long v12, v3

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzf()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_c
    and-int/2addr v3, v13

    int-to-long v12, v3

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzk()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_d
    and-int/2addr v3, v13

    int-to-long v12, v3

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzg()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_e
    and-int/2addr v3, v13

    int-to-long v12, v3

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzo()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_f
    and-int/2addr v3, v13

    int-to-long v12, v3

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzl()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_10
    and-int/2addr v3, v13

    int-to-long v12, v3

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzb()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_11
    and-int/2addr v3, v13

    int-to-long v12, v3

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zza()D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_12
    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzf(I)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v1

    and-int/2addr v1, v13

    int-to-long v12, v1

    invoke-static {v10, v12, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_d

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v10, v12, v13, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_9

    :cond_d
    iget-object v3, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zzf(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    iget-object v3, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iget-object v14, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v14, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v1, v3

    :cond_e
    :goto_9
    iget-object v3, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zze(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    iget-object v3, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzale;

    move-result-object v2

    invoke-interface {v0, v1, v2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zza(Ljava/util/Map;Lcom/google/android/gms/internal/firebase-auth-api/zzale;Lcom/google/android/gms/internal/firebase-auth-api/zzajv;)V

    goto/16 :goto_8

    :pswitch_13
    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    iget-object v12, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    invoke-interface {v12, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2, v1, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zza(Ljava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;Lcom/google/android/gms/internal/firebase-auth-api/zzajv;)V

    goto/16 :goto_8

    :pswitch_14
    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzm(Ljava/util/List;)V

    goto/16 :goto_8

    :pswitch_15
    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzl(Ljava/util/List;)V

    goto/16 :goto_8

    :pswitch_16
    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzk(Ljava/util/List;)V

    goto/16 :goto_8

    :pswitch_17
    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzj(Ljava/util/List;)V
    :try_end_5
    .catch Lcom/google/android/gms/internal/firebase-auth-api/zzakp; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto/16 :goto_8

    :catchall_2
    move-exception v0

    goto/16 :goto_20

    :pswitch_18
    :try_start_6
    iget-object v12, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int/2addr v3, v13

    int-to-long v13, v3

    invoke-interface {v12, v10, v13, v14}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzd(Ljava/util/List;)V

    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakk;

    move-result-object v12
    :try_end_6
    .catch Lcom/google/android/gms/internal/firebase-auth-api/zzakp; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    move-object/from16 v1, p1

    move-object v14, v4

    move-object v4, v12

    move-object v12, v5

    move-object v5, v14

    move-object v15, v6

    move-object v6, v11

    :try_start_7
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Ljava/lang/Object;ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzakk;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_1c

    :catch_0
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    goto/16 :goto_19

    :pswitch_19
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_a
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzp(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_1a
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_b
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zza(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_1b
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_c
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zze(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_1c
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_d
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzf(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_1d
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_e
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzh(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_1e
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_f
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzq(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_1f
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_10
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzi(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_20
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_11
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzg(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_21
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_12
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzc(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_22
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzm(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_23
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzl(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_24
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzk(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_25
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzj(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_26
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v4, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int/2addr v3, v13

    int-to-long v5, v3

    invoke-interface {v4, v10, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzd(Ljava/util/List;)V

    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakk;

    move-result-object v4

    move-object/from16 v1, p1

    move-object v5, v14

    move-object v6, v11

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Ljava/lang/Object;ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzakk;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_1c

    :pswitch_27
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_a

    :pswitch_28
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzb(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_29
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    and-int v2, v3, v13

    int-to-long v2, v2

    iget-object v4, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    invoke-interface {v4, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2, v1, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzb(Ljava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;Lcom/google/android/gms/internal/firebase-auth-api/zzajv;)V

    goto/16 :goto_16

    :pswitch_2a
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    invoke-static {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg(I)Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzo(Ljava/util/List;)V

    goto/16 :goto_16

    :cond_f
    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzn(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_2b
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_b

    :pswitch_2c
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_c

    :pswitch_2d
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_d

    :pswitch_2e
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_e

    :pswitch_2f
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_f

    :pswitch_30
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_10

    :pswitch_31
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_11

    :pswitch_32
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface {v1, v10, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_12

    :pswitch_33
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    invoke-direct {v7, v10, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v3

    invoke-interface {v0, v2, v3, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;Lcom/google/android/gms/internal/firebase-auth-api/zzajv;)V

    :goto_13
    invoke-direct {v7, v10, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_16

    :pswitch_34
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzn()J

    move-result-wide v4

    invoke-static {v10, v2, v3, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JJ)V

    :goto_14
    invoke-direct {v7, v10, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(Ljava/lang/Object;I)V

    goto/16 :goto_16

    :pswitch_35
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzi()I

    move-result v4

    invoke-static {v10, v2, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JI)V

    goto :goto_14

    :pswitch_36
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzm()J

    move-result-wide v4

    invoke-static {v10, v2, v3, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JJ)V

    goto :goto_14

    :pswitch_37
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzh()I

    move-result v4

    invoke-static {v10, v2, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JI)V

    goto :goto_14

    :pswitch_38
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zze()I

    move-result v4

    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzakk;

    move-result-object v5

    if-eqz v5, :cond_11

    invoke-interface {v5, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzakk;->zza(I)Z

    move-result v5

    if-eqz v5, :cond_10

    goto :goto_15

    :cond_10
    invoke-static {v10, v2, v4, v14, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_1c

    :cond_11
    :goto_15
    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-static {v10, v2, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JI)V

    goto :goto_14

    :pswitch_39
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzj()I

    move-result v4

    invoke-static {v10, v2, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JI)V

    goto :goto_14

    :pswitch_3a
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzp()Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    move-result-object v4

    invoke-static {v10, v2, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_14

    :pswitch_3b
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    invoke-direct {v7, v10, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaln;

    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v3

    invoke-interface {v0, v2, v3, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;Lcom/google/android/gms/internal/firebase-auth-api/zzajv;)V

    goto/16 :goto_13

    :pswitch_3c
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    invoke-direct {v7, v10, v3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;ILcom/google/android/gms/internal/firebase-auth-api/zzamd;)V

    goto/16 :goto_14

    :pswitch_3d
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzs()Z

    move-result v4

    invoke-static {v10, v2, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;JZ)V

    goto/16 :goto_14

    :pswitch_3e
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzf()I

    move-result v4

    invoke-static {v10, v2, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JI)V

    goto/16 :goto_14

    :pswitch_3f
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzk()J

    move-result-wide v4

    invoke-static {v10, v2, v3, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JJ)V

    goto/16 :goto_14

    :pswitch_40
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzg()I

    move-result v4

    invoke-static {v10, v2, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JI)V

    goto/16 :goto_14

    :pswitch_41
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzo()J

    move-result-wide v4

    invoke-static {v10, v2, v3, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JJ)V

    goto/16 :goto_14

    :pswitch_42
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzl()J

    move-result-wide v4

    invoke-static {v10, v2, v3, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JJ)V

    goto/16 :goto_14

    :pswitch_43
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zzb()F

    move-result v4

    invoke-static {v10, v2, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JF)V

    goto/16 :goto_14

    :pswitch_44
    move-object v14, v4

    move-object v12, v5

    move-object v15, v6

    and-int v2, v3, v13

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamd;->zza()D

    move-result-wide v4

    invoke-static {v10, v2, v3, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JD)V
    :try_end_7
    .catch Lcom/google/android/gms/internal/firebase-auth-api/zzakp; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto/16 :goto_14

    :goto_16
    move-object v5, v12

    move-object v4, v14

    move-object v6, v15

    :goto_17
    move-object v15, v10

    move-object v14, v11

    goto/16 :goto_0

    :catchall_3
    move-exception v0

    move-object v4, v14

    goto/16 :goto_20

    :goto_18
    move-object v4, v1

    goto :goto_1a

    :catch_1
    :goto_19
    move-object v4, v14

    goto :goto_1d

    :cond_12
    move-object v4, v14

    :goto_1a
    :try_start_8
    invoke-virtual {v11, v4, v0, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamd;I)Z

    move-result v1
    :try_end_8
    .catch Lcom/google/android/gms/internal/firebase-auth-api/zzakp; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    if-nez v1, :cond_15

    iget v0, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzl:I

    :goto_1b
    iget v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzm:I

    if-ge v0, v1, :cond_13

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzk:[I

    aget v3, v1, v0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v5, v11

    move-object/from16 v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1b

    :cond_13
    if-eqz v4, :cond_14

    invoke-virtual {v11, v10, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzb(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_14
    return-void

    :cond_15
    :goto_1c
    move-object v14, v11

    move-object v5, v12

    move-object v6, v15

    move-object v15, v10

    goto/16 :goto_0

    :catch_2
    :goto_1d
    :try_start_9
    invoke-virtual {v11, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamd;)Z

    if-nez v4, :cond_16

    invoke-virtual {v11, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    :cond_16
    invoke-virtual {v11, v4, v0, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamd;I)Z

    move-result v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    if-nez v1, :cond_15

    iget v0, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzl:I

    :goto_1e
    iget v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzm:I

    if-ge v0, v1, :cond_17

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzk:[I

    aget v3, v1, v0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v5, v11

    move-object/from16 v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1e

    :cond_17
    if-eqz v4, :cond_18

    invoke-virtual {v11, v10, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzb(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_18
    return-void

    :catchall_4
    move-exception v0

    goto :goto_1f

    :catchall_5
    move-exception v0

    move-object v11, v14

    move-object v10, v15

    :goto_1f
    move-object v14, v4

    :goto_20
    iget v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzl:I

    move v8, v1

    :goto_21
    iget v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzm:I

    if-ge v8, v1, :cond_19

    iget-object v1, v7, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzk:[I

    aget v3, v1, v8

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v5, v11

    move-object/from16 v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v8, v8, 0x1

    goto :goto_21

    :cond_19
    if-eqz v4, :cond_1a

    invoke-virtual {v11, v10, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzb(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1a
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zza(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzanm;",
            ")V"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    invoke-interface/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza()I

    move-result v0

    const/high16 v9, 0xff00000

    const/4 v1, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    const v13, 0xfffff

    if-ne v0, v1, :cond_7

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    invoke-static {v0, v7, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;)V

    iget-boolean v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzh:Z

    if-eqz v0, :cond_0

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzajy;

    move-result-object v0

    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzamh;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zzc()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    array-length v2, v2

    add-int/lit8 v2, v2, -0x3

    :goto_1
    if-ltz v2, :cond_4

    invoke-direct {v6, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v3

    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    :goto_2
    if-eqz v1, :cond_2

    iget-object v5, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Ljava/util/Map$Entry;)I

    move-result v5

    if-le v5, v4, :cond_2

    iget-object v5, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-virtual {v5, v8, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    and-int v5, v3, v9

    ushr-int/lit8 v5, v5, 0x14

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_15

    :pswitch_0
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_3

    :pswitch_1
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(Ljava/lang/Object;J)J

    move-result-wide v14

    goto/16 :goto_4

    :pswitch_2
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_5

    :pswitch_3
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(Ljava/lang/Object;J)J

    move-result-wide v14

    goto/16 :goto_6

    :pswitch_4
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_7

    :pswitch_5
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_8

    :pswitch_6
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_9

    :pswitch_7
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_a

    :pswitch_8
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_b

    :pswitch_9
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_c

    :pswitch_a
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(Ljava/lang/Object;J)Z

    move-result v3

    goto/16 :goto_d

    :pswitch_b
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_e

    :pswitch_c
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(Ljava/lang/Object;J)J

    move-result-wide v14

    goto/16 :goto_f

    :pswitch_d
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_10

    :pswitch_e
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(Ljava/lang/Object;J)J

    move-result-wide v14

    goto/16 :goto_11

    :pswitch_f
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(Ljava/lang/Object;J)J

    move-result-wide v14

    goto/16 :goto_12

    :pswitch_10
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(Ljava/lang/Object;J)F

    move-result v3

    goto/16 :goto_13

    :pswitch_11
    invoke-direct {v6, v7, v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;J)D

    move-result-wide v14

    goto/16 :goto_14

    :pswitch_12
    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v6, v8, v4, v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzanm;ILjava/lang/Object;I)V

    goto/16 :goto_15

    :pswitch_13
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-direct {v6, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v5

    invoke-static {v4, v3, v8, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V

    goto/16 :goto_15

    :pswitch_14
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzl(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_15
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzk(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_16
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzj(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_17
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzi(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_18
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_19
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzm(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_1a
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_1b
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_1c
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zze(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_1d
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzg(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_1e
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzn(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_1f
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzh(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_20
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzf(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_21
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_22
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzl(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_23
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzk(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_24
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzj(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_25
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzi(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_26
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_27
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzm(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_28
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;)V

    goto/16 :goto_15

    :pswitch_29
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-direct {v6, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v5

    invoke-static {v4, v3, v8, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V

    goto/16 :goto_15

    :pswitch_2a
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;)V

    goto/16 :goto_15

    :pswitch_2b
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_2c
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_2d
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zze(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_2e
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzg(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_2f
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzn(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_30
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzh(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_31
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzf(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_32
    iget-object v4, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v2

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_15

    :pswitch_33
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_3
    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v6, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v5

    invoke-interface {v8, v4, v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V

    goto/16 :goto_15

    :pswitch_34
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v14

    :goto_4
    invoke-interface {v8, v4, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzd(IJ)V

    goto/16 :goto_15

    :pswitch_35
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v3

    :goto_5
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zze(II)V

    goto/16 :goto_15

    :pswitch_36
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v14

    :goto_6
    invoke-interface {v8, v4, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzc(IJ)V

    goto/16 :goto_15

    :pswitch_37
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v3

    :goto_7
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzd(II)V

    goto/16 :goto_15

    :pswitch_38
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v3

    :goto_8
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(II)V

    goto/16 :goto_15

    :pswitch_39
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v3

    :goto_9
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzf(II)V

    goto/16 :goto_15

    :pswitch_3a
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_a
    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(ILcom/google/android/gms/internal/firebase-auth-api/zzaiw;)V

    goto/16 :goto_15

    :pswitch_3b
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_b
    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v6, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v5

    invoke-interface {v8, v4, v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V

    goto/16 :goto_15

    :pswitch_3c
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_c
    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4, v3, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;)V

    goto/16 :goto_15

    :pswitch_3d
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzh(Ljava/lang/Object;J)Z

    move-result v3

    :goto_d
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(IZ)V

    goto/16 :goto_15

    :pswitch_3e
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v3

    :goto_e
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzb(II)V

    goto :goto_15

    :pswitch_3f
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v14

    :goto_f
    invoke-interface {v8, v4, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(IJ)V

    goto :goto_15

    :pswitch_40
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v3

    :goto_10
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzc(II)V

    goto :goto_15

    :pswitch_41
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v14

    :goto_11
    invoke-interface {v8, v4, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zze(IJ)V

    goto :goto_15

    :pswitch_42
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v14

    :goto_12
    invoke-interface {v8, v4, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzb(IJ)V

    goto :goto_15

    :pswitch_43
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzb(Ljava/lang/Object;J)F

    move-result v3

    :goto_13
    invoke-interface {v8, v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(IF)V

    goto :goto_15

    :pswitch_44
    invoke-direct {v6, v7, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_3

    and-int/2addr v3, v13

    int-to-long v14, v3

    invoke-static {v7, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;J)D

    move-result-wide v14

    :goto_14
    invoke-interface {v8, v4, v14, v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(ID)V

    :cond_3
    :goto_15
    add-int/lit8 v2, v2, -0x3

    goto/16 :goto_1

    :cond_4
    :goto_16
    if-eqz v1, :cond_6

    iget-object v2, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-virtual {v2, v8, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    goto :goto_16

    :cond_5
    const/4 v1, 0x0

    goto :goto_16

    :cond_6
    return-void

    :cond_7
    iget-boolean v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzh:Z

    if-eqz v0, :cond_8

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzajy;

    move-result-object v0

    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzamh;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zzd()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    move-object v14, v0

    goto :goto_17

    :cond_8
    const/4 v1, 0x0

    const/4 v14, 0x0

    :goto_17
    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    array-length v15, v0

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    move v2, v12

    move v4, v2

    move v0, v13

    :goto_18
    if-ge v4, v15, :cond_11

    invoke-direct {v6, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v3

    iget-object v10, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v12, v10, v4

    and-int v17, v3, v9

    ushr-int/lit8 v9, v17, 0x14

    const/16 v11, 0x11

    if-gt v9, v11, :cond_b

    add-int/lit8 v11, v4, 0x2

    aget v10, v10, v11

    and-int v11, v10, v13

    move-object/from16 v19, v14

    if-eq v11, v0, :cond_a

    if-ne v11, v13, :cond_9

    const/4 v2, 0x0

    goto :goto_19

    :cond_9
    int-to-long v13, v11

    invoke-virtual {v5, v7, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    move v2, v0

    :goto_19
    move v0, v11

    :cond_a
    ushr-int/lit8 v10, v10, 0x14

    const/4 v11, 0x1

    shl-int v10, v11, v10

    move-object v11, v1

    move v13, v2

    move v14, v10

    move v10, v0

    goto :goto_1a

    :cond_b
    move-object/from16 v19, v14

    move v10, v0

    move-object v11, v1

    move v13, v2

    const/4 v14, 0x0

    :goto_1a
    if-eqz v11, :cond_d

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-virtual {v0, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Ljava/util/Map$Entry;)I

    move-result v0

    if-gt v0, v12, :cond_d

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-virtual {v0, v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Ljava/util/Map$Entry;)V

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    move-object v11, v0

    goto :goto_1a

    :cond_c
    const/4 v11, 0x0

    goto :goto_1a

    :cond_d
    const v18, 0xfffff

    and-int v0, v3, v18

    int-to-long v2, v0

    packed-switch v9, :pswitch_data_1

    :cond_e
    :goto_1b
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    :goto_1c
    move v11, v4

    move-object v15, v5

    goto/16 :goto_1f

    :pswitch_45
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V

    goto :goto_1b

    :pswitch_46
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzd(IJ)V

    goto :goto_1b

    :pswitch_47
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zze(II)V

    goto :goto_1b

    :pswitch_48
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzc(IJ)V

    goto :goto_1b

    :pswitch_49
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzd(II)V

    goto :goto_1b

    :pswitch_4a
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(II)V

    goto :goto_1b

    :pswitch_4b
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzf(II)V

    goto :goto_1b

    :pswitch_4c
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(ILcom/google/android/gms/internal/firebase-auth-api/zzaiw;)V

    goto/16 :goto_1b

    :pswitch_4d
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V

    goto/16 :goto_1b

    :pswitch_4e
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12, v0, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;)V

    goto/16 :goto_1b

    :pswitch_4f
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(Ljava/lang/Object;J)Z

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(IZ)V

    goto/16 :goto_1b

    :pswitch_50
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzb(II)V

    goto/16 :goto_1b

    :pswitch_51
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(IJ)V

    goto/16 :goto_1b

    :pswitch_52
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzc(II)V

    goto/16 :goto_1b

    :pswitch_53
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zze(IJ)V

    goto/16 :goto_1b

    :pswitch_54
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzb(IJ)V

    goto/16 :goto_1b

    :pswitch_55
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(Ljava/lang/Object;J)F

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(IF)V

    goto/16 :goto_1b

    :pswitch_56
    invoke-direct {v6, v7, v12, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;J)D

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(ID)V

    goto/16 :goto_1b

    :pswitch_57
    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v8, v12, v0, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzanm;ILjava/lang/Object;I)V

    goto/16 :goto_1b

    :pswitch_58
    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-direct {v6, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v2

    invoke-static {v0, v1, v8, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V

    goto/16 :goto_1b

    :pswitch_59
    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v9, 0x1

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzl(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1b

    :pswitch_5a
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzk(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1b

    :pswitch_5b
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzj(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1b

    :pswitch_5c
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzi(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1b

    :pswitch_5d
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1b

    :pswitch_5e
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzm(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1b

    :pswitch_5f
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1b

    :pswitch_60
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1b

    :pswitch_61
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zze(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1b

    :pswitch_62
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzg(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1b

    :pswitch_63
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzn(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1b

    :pswitch_64
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzh(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1b

    :pswitch_65
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzf(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1b

    :pswitch_66
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1b

    :pswitch_67
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v12, 0x0

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzl(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1d

    :pswitch_68
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzk(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1d

    :pswitch_69
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzj(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1d

    :pswitch_6a
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzi(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1d

    :pswitch_6b
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1d

    :pswitch_6c
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzm(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto/16 :goto_1d

    :pswitch_6d
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;)V

    goto/16 :goto_1b

    :pswitch_6e
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-direct {v6, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v2

    invoke-static {v0, v1, v8, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V

    goto/16 :goto_1b

    :pswitch_6f
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;)V

    goto/16 :goto_1b

    :pswitch_70
    const/4 v9, 0x1

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v12, 0x0

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto :goto_1d

    :pswitch_71
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto :goto_1d

    :pswitch_72
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zze(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto :goto_1d

    :pswitch_73
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzg(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto :goto_1d

    :pswitch_74
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzn(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto :goto_1d

    :pswitch_75
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzh(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto :goto_1d

    :pswitch_76
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzf(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    goto :goto_1d

    :pswitch_77
    const/4 v9, 0x1

    const/4 v12, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v0, v0, v4

    invoke-virtual {v5, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Z)V

    :goto_1d
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v16, v12

    move/from16 v21, v15

    goto/16 :goto_1c

    :pswitch_78
    const/4 v9, 0x1

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v8, v2

    move v2, v4

    move v3, v10

    move-object/from16 v20, v11

    move v11, v4

    move v4, v13

    move/from16 v21, v15

    move-object v15, v5

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {v15, v7, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    move-object/from16 v8, p2

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V

    goto :goto_1e

    :cond_f
    move-object/from16 v8, p2

    :goto_1e
    move/from16 v22, v10

    goto/16 :goto_1f

    :pswitch_79
    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move v11, v4

    move-object v15, v5

    move-wide v4, v2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move v3, v10

    move/from16 v22, v10

    move-wide v9, v4

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzd(IJ)V

    goto/16 :goto_1f

    :pswitch_7a
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zze(II)V

    goto/16 :goto_1f

    :pswitch_7b
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzc(IJ)V

    goto/16 :goto_1f

    :pswitch_7c
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzd(II)V

    goto/16 :goto_1f

    :pswitch_7d
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(II)V

    goto/16 :goto_1f

    :pswitch_7e
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzf(II)V

    goto/16 :goto_1f

    :pswitch_7f
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaiw;

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(ILcom/google/android/gms/internal/firebase-auth-api/zzaiw;)V

    goto/16 :goto_1f

    :pswitch_80
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzamc;)V

    goto/16 :goto_1f

    :pswitch_81
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12, v0, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;)V

    goto/16 :goto_1f

    :pswitch_82
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {v7, v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzh(Ljava/lang/Object;J)Z

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(IZ)V

    goto/16 :goto_1f

    :pswitch_83
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzb(II)V

    goto/16 :goto_1f

    :pswitch_84
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(IJ)V

    goto/16 :goto_1f

    :pswitch_85
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzc(II)V

    goto/16 :goto_1f

    :pswitch_86
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zze(IJ)V

    goto/16 :goto_1f

    :pswitch_87
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v15, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zzb(IJ)V

    goto :goto_1f

    :pswitch_88
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {v7, v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzb(Ljava/lang/Object;J)F

    move-result v0

    invoke-interface {v8, v12, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(IF)V

    goto :goto_1f

    :pswitch_89
    move/from16 v22, v10

    move-object/from16 v20, v11

    move/from16 v21, v15

    const/16 v16, 0x0

    move-wide v9, v2

    move v11, v4

    move-object v15, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v11

    move/from16 v3, v22

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {v7, v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;J)D

    move-result-wide v0

    invoke-interface {v8, v12, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanm;->zza(ID)V

    :cond_10
    :goto_1f
    add-int/lit8 v4, v11, 0x3

    move v2, v13

    move-object v5, v15

    move/from16 v12, v16

    move/from16 v13, v18

    move-object/from16 v14, v19

    move-object/from16 v1, v20

    move/from16 v15, v21

    move/from16 v0, v22

    const/high16 v9, 0xff00000

    const/4 v11, 0x1

    goto/16 :goto_18

    :cond_11
    move-object/from16 v19, v14

    :goto_20
    if-eqz v1, :cond_13

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-virtual {v0, v8, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzanm;Ljava/util/Map$Entry;)V

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    move-object v1, v0

    goto :goto_20

    :cond_12
    const/4 v1, 0x0

    goto :goto_20

    :cond_13
    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    invoke-static {v0, v7, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzanm;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
    .end packed-switch
.end method

.method public final zza(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)V"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzf(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v2, v1

    int-to-long v2, v2

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v0

    const/high16 v5, 0xff00000

    and-int/2addr v1, v5

    ushr-int/lit8 v1, v1, 0x14

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_7

    :pswitch_0
    invoke-direct {p0, p2, v4, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :pswitch_1
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_7

    :pswitch_2
    invoke-direct {p0, p2, v4, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-direct {p0, p1, v4, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(Ljava/lang/Object;II)V

    goto/16 :goto_7

    :pswitch_3
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-static {v1, p1, p2, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzalg;Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_7

    :pswitch_4
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    invoke-interface {v1, p1, p2, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zza(Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_7

    :pswitch_5
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    :pswitch_6
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :pswitch_7
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    :pswitch_8
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :pswitch_9
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_2
    goto :goto_4

    :pswitch_a
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_b
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_3

    :pswitch_c
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_7

    :pswitch_d
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_3
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_e
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzh(Ljava/lang/Object;J)Z

    move-result v1

    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;JZ)V

    goto :goto_6

    :pswitch_f
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_10
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_5

    :pswitch_11
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_4
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JI)V

    goto :goto_6

    :pswitch_12
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_5

    :pswitch_13
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_5
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JJ)V

    goto :goto_6

    :pswitch_14
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzb(Ljava/lang/Object;J)F

    move-result v1

    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JF)V

    goto :goto_6

    :pswitch_15
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;J)D

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;JD)V

    :goto_6
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(Ljava/lang/Object;I)V

    :cond_0
    :goto_7
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamv;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzh:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzajx;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_c
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final zza(Ljava/lang/Object;[BIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[BII",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaiv;",
            ")V"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/firebase-auth-api/zzaiv;)I

    return-void
.end method

.method public final zzb(Ljava/lang/Object;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v4, v4, v1

    const v5, 0xfffff

    and-int/2addr v5, v3

    int-to-long v5, v5

    const/high16 v7, 0xff00000

    and-int/2addr v3, v7

    ushr-int/lit8 v3, v3, 0x14

    const/16 v7, 0x25

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_f

    :pswitch_0
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :pswitch_1
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_2
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :pswitch_3
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_4
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :pswitch_5
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    goto :goto_3

    :pswitch_6
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_3

    :pswitch_7
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_5

    :pswitch_8
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_2
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    mul-int/lit8 v2, v2, 0x35

    goto/16 :goto_6

    :pswitch_9
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_8

    :pswitch_a
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(Ljava/lang/Object;J)Z

    move-result v3

    goto/16 :goto_9

    :pswitch_b
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_3

    :pswitch_c
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_4

    :pswitch_d
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_3
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_a

    :pswitch_e
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_4

    :pswitch_f
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_4
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzd(Ljava/lang/Object;J)J

    move-result-wide v3

    goto/16 :goto_d

    :pswitch_10
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(Ljava/lang/Object;J)F

    move-result v3

    goto :goto_b

    :pswitch_11
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;J)D

    move-result-wide v3

    goto :goto_c

    :pswitch_12
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_7

    :goto_5
    :pswitch_13
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    :goto_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_e

    :pswitch_14
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    :goto_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    :cond_0
    mul-int/lit8 v2, v2, 0x35

    add-int/2addr v2, v7

    goto :goto_f

    :goto_8
    :pswitch_15
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_e

    :pswitch_16
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzh(Ljava/lang/Object;J)Z

    move-result v3

    :goto_9
    invoke-static {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaki;->zza(Z)I

    move-result v3

    goto :goto_e

    :pswitch_17
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v3

    :goto_a
    add-int/2addr v2, v3

    goto :goto_f

    :pswitch_18
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v3

    goto :goto_d

    :pswitch_19
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzb(Ljava/lang/Object;J)F

    move-result v3

    :goto_b
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto :goto_e

    :pswitch_1a
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;J)D

    move-result-wide v3

    :goto_c
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    :goto_d
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzaki;->zza(J)I

    move-result v3

    :goto_e
    add-int/2addr v3, v2

    move v2, v3

    :cond_1
    :goto_f
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_2
    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzd(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    iget-boolean v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzh:Z

    if-eqz v1, :cond_3

    mul-int/lit8 v0, v0, 0x35

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzajy;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_3
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_18
        :pswitch_17
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_18
        :pswitch_17
        :pswitch_18
        :pswitch_12
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzb(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_3

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v4

    const v5, 0xfffff

    and-int v6, v4, v5

    int-to-long v6, v6

    const/high16 v8, 0xff00000

    and-int/2addr v4, v8

    ushr-int/lit8 v4, v4, 0x14

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb(I)I

    move-result v4

    and-int/2addr v4, v5

    int-to-long v4, v4

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v8

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v4

    if-ne v8, v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_1

    :pswitch_1
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    goto/16 :goto_3

    :pswitch_2
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_2

    :pswitch_3
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-eqz v4, :cond_1

    goto/16 :goto_1

    :pswitch_4
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v5

    if-eq v4, v5, :cond_1

    goto/16 :goto_2

    :pswitch_5
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-eqz v4, :cond_1

    goto/16 :goto_1

    :pswitch_6
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v5

    if-eq v4, v5, :cond_1

    goto/16 :goto_2

    :pswitch_7
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v5

    if-eq v4, v5, :cond_1

    goto/16 :goto_1

    :pswitch_8
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v5

    if-eq v4, v5, :cond_1

    goto/16 :goto_2

    :pswitch_9
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_1

    :pswitch_a
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_2

    :pswitch_b
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzame;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_1

    :pswitch_c
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzh(Ljava/lang/Object;J)Z

    move-result v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzh(Ljava/lang/Object;J)Z

    move-result v5

    if-eq v4, v5, :cond_1

    goto/16 :goto_2

    :pswitch_d
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v5

    if-eq v4, v5, :cond_1

    goto :goto_1

    :pswitch_e
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-eqz v4, :cond_1

    goto :goto_2

    :pswitch_f
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzc(Ljava/lang/Object;J)I

    move-result v5

    if-eq v4, v5, :cond_1

    goto :goto_1

    :pswitch_10
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-eqz v4, :cond_1

    goto :goto_2

    :pswitch_11
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzd(Ljava/lang/Object;J)J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-eqz v4, :cond_1

    goto :goto_1

    :pswitch_12
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzb(Ljava/lang/Object;J)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zzb(Ljava/lang/Object;J)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v5

    if-eq v4, v5, :cond_1

    :goto_1
    goto :goto_2

    :pswitch_13
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;J)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zza(Ljava/lang/Object;J)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-eqz v4, :cond_1

    :cond_0
    :goto_2
    move v3, v1

    :cond_1
    :goto_3
    if-nez v3, :cond_2

    return v1

    :cond_2
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzd(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzd(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzh:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzajy;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzajy;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final zzd(Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzg(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;

    const v2, 0x7fffffff

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;->zzb(I)V

    iput v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzain;->zza:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakg;->zzu()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    array-length v0, v0

    :goto_0
    if-ge v1, v0, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    int-to-long v3, v3

    const/high16 v5, 0xff00000

    and-int/2addr v2, v5

    ushr-int/lit8 v2, v2, 0x14

    const/16 v5, 0x9

    if-eq v2, v5, :cond_3

    const/16 v5, 0x3c

    if-eq v2, v5, :cond_2

    const/16 v5, 0x44

    if-eq v2, v5, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v6, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zzc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_2

    :pswitch_1
    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzo:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    invoke-interface {v2, p1, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzakx;->zzb(Ljava/lang/Object;J)V

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v2, v2, v1

    invoke-direct {p0, p1, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_3
    :pswitch_2
    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_4

    :goto_1
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zzd(Ljava/lang/Object;)V

    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzp:Lcom/google/android/gms/internal/firebase-auth-api/zzamv;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzamv;->zzf(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzh:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zzc(Ljava/lang/Object;)V

    :cond_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zze(Ljava/lang/Object;)Z
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const v8, 0xfffff

    const/4 v9, 0x0

    move v0, v8

    move v1, v9

    move v10, v1

    :goto_0
    iget v2, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzl:I

    const/4 v11, 0x1

    if-ge v10, v2, :cond_e

    iget-object v2, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzk:[I

    aget v12, v2, v10

    iget-object v2, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    aget v13, v2, v12

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(I)I

    move-result v14

    iget-object v2, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc:[I

    add-int/lit8 v3, v12, 0x2

    aget v2, v2, v3

    and-int v3, v2, v8

    ushr-int/lit8 v2, v2, 0x14

    shl-int v15, v11, v2

    if-eq v3, v0, :cond_1

    if-eq v3, v8, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzb:Lsun/misc/Unsafe;

    int-to-long v1, v3

    invoke-virtual {v0, v7, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    :cond_0
    move/from16 v17, v1

    move/from16 v16, v3

    goto :goto_1

    :cond_1
    move/from16 v16, v0

    move/from16 v17, v1

    :goto_1
    const/high16 v0, 0x10000000

    and-int/2addr v0, v14

    if-eqz v0, :cond_2

    move v0, v11

    goto :goto_2

    :cond_2
    move v0, v9

    :goto_2
    if-eqz v0, :cond_3

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    move/from16 v3, v16

    move/from16 v4, v17

    move v5, v15

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-nez v0, :cond_3

    return v9

    :cond_3
    const/high16 v0, 0xff00000

    and-int/2addr v0, v14

    ushr-int/lit8 v0, v0, 0x14

    const/16 v1, 0x9

    if-eq v0, v1, :cond_c

    const/16 v1, 0x11

    if-eq v0, v1, :cond_c

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_9

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_8

    const/16 v1, 0x44

    if-eq v0, v1, :cond_8

    const/16 v1, 0x31

    if-eq v0, v1, :cond_9

    const/16 v1, 0x32

    if-eq v0, v1, :cond_4

    goto/16 :goto_5

    :cond_4
    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    and-int v1, v14, v8

    int-to-long v1, v1

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zzd(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzf(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzr:Lcom/google/android/gms/internal/firebase-auth-api/zzalg;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzalg;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzale;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/firebase-auth-api/zzale;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzanh;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzanh;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzank;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzank;->zzi:Lcom/google/android/gms/internal/firebase-auth-api/zzank;

    if-ne v1, v2, :cond_7

    const/4 v1, 0x0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_6

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzaly;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzaly;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaly;->zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    :cond_6
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zze(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v11, v9

    :cond_7
    if-nez v11, :cond_d

    return v9

    :cond_8
    invoke-direct {v6, v7, v13, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzc(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v0

    invoke-static {v7, v14, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;ILcom/google/android/gms/internal/firebase-auth-api/zzamc;)Z

    move-result v0

    if-nez v0, :cond_d

    return v9

    :cond_9
    and-int v0, v14, v8

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzana;->zze(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v1

    move v2, v9

    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_b

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzamc;->zze(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    move v11, v9

    goto :goto_4

    :cond_a
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_b
    :goto_4
    if-nez v11, :cond_d

    return v9

    :cond_c
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    move/from16 v3, v16

    move/from16 v4, v17

    move v5, v15

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zze(I)Lcom/google/android/gms/internal/firebase-auth-api/zzamc;

    move-result-object v0

    invoke-static {v7, v14, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zza(Ljava/lang/Object;ILcom/google/android/gms/internal/firebase-auth-api/zzamc;)Z

    move-result v0

    if-nez v0, :cond_d

    return v9

    :cond_d
    :goto_5
    add-int/lit8 v10, v10, 0x1

    move/from16 v0, v16

    move/from16 v1, v17

    goto/16 :goto_0

    :cond_e
    iget-boolean v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzh:Z

    if-eqz v0, :cond_f

    iget-object v0, v6, Lcom/google/android/gms/internal/firebase-auth-api/zzalr;->zzq:Lcom/google/android/gms/internal/firebase-auth-api/zzajx;

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzajx;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzajy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zzg()Z

    move-result v0

    if-nez v0, :cond_f

    return v9

    :cond_f
    return v11
.end method
