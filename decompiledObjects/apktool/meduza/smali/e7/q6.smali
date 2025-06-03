.class public final Le7/q6;
.super Ln6/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Le7/q6;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Ljava/lang/Long;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final o:Ljava/lang/Double;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le7/p6;

    invoke-direct {v0}, Le7/p6;-><init>()V

    sput-object v0, Le7/q6;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;JLjava/lang/Long;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V
    .locals 0

    invoke-direct {p0}, Ln6/a;-><init>()V

    iput p1, p0, Le7/q6;->a:I

    iput-object p2, p0, Le7/q6;->b:Ljava/lang/String;

    iput-wide p3, p0, Le7/q6;->c:J

    iput-object p5, p0, Le7/q6;->d:Ljava/lang/Long;

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    if-eqz p6, :cond_0

    invoke-virtual {p6}, Ljava/lang/Float;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Le7/q6;->o:Ljava/lang/Double;

    goto :goto_1

    :cond_1
    iput-object p9, p0, Le7/q6;->o:Ljava/lang/Double;

    :goto_1
    iput-object p7, p0, Le7/q6;->e:Ljava/lang/String;

    iput-object p8, p0, Le7/q6;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Le7/s6;)V
    .locals 6

    iget-object v1, p1, Le7/s6;->c:Ljava/lang/String;

    iget-wide v3, p1, Le7/s6;->d:J

    iget-object v5, p1, Le7/s6;->e:Ljava/lang/Object;

    iget-object v2, p1, Le7/s6;->b:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Le7/q6;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ln6/a;-><init>()V

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    const/4 v0, 0x2

    iput v0, p0, Le7/q6;->a:I

    iput-object p1, p0, Le7/q6;->b:Ljava/lang/String;

    iput-wide p3, p0, Le7/q6;->c:J

    iput-object p2, p0, Le7/q6;->f:Ljava/lang/String;

    const/4 p1, 0x0

    if-nez p5, :cond_0

    iput-object p1, p0, Le7/q6;->d:Ljava/lang/Long;

    iput-object p1, p0, Le7/q6;->o:Ljava/lang/Double;

    iput-object p1, p0, Le7/q6;->e:Ljava/lang/String;

    return-void

    :cond_0
    instance-of p2, p5, Ljava/lang/Long;

    if-eqz p2, :cond_1

    check-cast p5, Ljava/lang/Long;

    iput-object p5, p0, Le7/q6;->d:Ljava/lang/Long;

    iput-object p1, p0, Le7/q6;->o:Ljava/lang/Double;

    iput-object p1, p0, Le7/q6;->e:Ljava/lang/String;

    return-void

    :cond_1
    instance-of p2, p5, Ljava/lang/String;

    if-eqz p2, :cond_2

    iput-object p1, p0, Le7/q6;->d:Ljava/lang/Long;

    iput-object p1, p0, Le7/q6;->o:Ljava/lang/Double;

    check-cast p5, Ljava/lang/String;

    iput-object p5, p0, Le7/q6;->e:Ljava/lang/String;

    return-void

    :cond_2
    instance-of p2, p5, Ljava/lang/Double;

    if-eqz p2, :cond_3

    iput-object p1, p0, Le7/q6;->d:Ljava/lang/Long;

    check-cast p5, Ljava/lang/Double;

    iput-object p5, p0, Le7/q6;->o:Ljava/lang/Double;

    iput-object p1, p0, Le7/q6;->e:Ljava/lang/String;

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "User attribute given of un-supported type"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final D()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le7/q6;->d:Ljava/lang/Long;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Le7/q6;->o:Ljava/lang/Double;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Le7/q6;->e:Ljava/lang/String;

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 p2, 0x4f45

    .line 2
    .line 3
    invoke-static {p2, p1}, Lb/z;->J(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    iget v0, p0, Le7/q6;->a:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-static {p1, v1, v0}, Lb/z;->z(Landroid/os/Parcel;II)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Le7/q6;->b:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {p1, v1, v0, v2}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    iget-wide v0, p0, Le7/q6;->c:J

    .line 21
    .line 22
    const/4 v3, 0x3

    .line 23
    invoke-static {p1, v3, v0, v1}, Lb/z;->C(Landroid/os/Parcel;IJ)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Le7/q6;->d:Ljava/lang/Long;

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    invoke-static {p1, v1, v0}, Lb/z;->D(Landroid/os/Parcel;ILjava/lang/Long;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Le7/q6;->e:Ljava/lang/String;

    .line 33
    .line 34
    const/4 v1, 0x6

    .line 35
    invoke-static {p1, v1, v0, v2}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Le7/q6;->f:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v1, 0x7

    .line 41
    invoke-static {p1, v1, v0, v2}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Le7/q6;->o:Ljava/lang/Double;

    .line 45
    .line 46
    const/16 v1, 0x8

    .line 47
    .line 48
    invoke-static {p1, v1, v0}, Lb/z;->x(Landroid/os/Parcel;ILjava/lang/Double;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2, p1}, Lb/z;->L(ILandroid/os/Parcel;)V

    .line 52
    .line 53
    .line 54
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method
