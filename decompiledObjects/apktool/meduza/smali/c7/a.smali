.class public final Lc7/a;
.super Ln6/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc7/a$a;,
        Lc7/a$b;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc7/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lc7/a$a;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc7/g;

    invoke-direct {v0}, Lc7/g;-><init>()V

    sput-object v0, Lc7/a;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lc7/a;

    invoke-direct {v0}, Lc7/a;-><init>()V

    new-instance v0, Lc7/a;

    const-string v1, "unavailable"

    invoke-direct {v0, v1}, Lc7/a;-><init>(Ljava/lang/String;)V

    new-instance v0, Lc7/a;

    const-string v1, "unused"

    invoke-direct {v0, v1}, Lc7/a;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ln6/a;-><init>()V

    sget-object v0, Lc7/a$a;->b:Lc7/a$a;

    iput-object v0, p0, Lc7/a;->a:Lc7/a$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lc7/a;->c:Ljava/lang/String;

    iput-object v0, p0, Lc7/a;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Ln6/a;-><init>()V

    .line 1
    :try_start_0
    invoke-static {}, Lc7/a$a;->values()[Lc7/a$a;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    iget v4, v3, Lc7/a$a;->a:I

    if-ne p1, v4, :cond_0

    .line 3
    iput-object v3, p0, Lc7/a;->a:Lc7/a$a;
    :try_end_0
    .catch Lc7/a$b; {:try_start_0 .. :try_end_0} :catch_0

    iput-object p2, p0, Lc7/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lc7/a;->c:Ljava/lang/String;

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_1
    :try_start_1
    new-instance p2, Lc7/a$b;

    invoke-direct {p2, p1}, Lc7/a$b;-><init>(I)V

    throw p2
    :try_end_1
    .catch Lc7/a$b; {:try_start_1 .. :try_end_1} :catch_0

    .line 5
    :goto_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ln6/a;-><init>()V

    iput-object p1, p0, Lc7/a;->b:Ljava/lang/String;

    sget-object p1, Lc7/a$a;->c:Lc7/a$a;

    iput-object p1, p0, Lc7/a;->a:Lc7/a$a;

    const/4 p1, 0x0

    iput-object p1, p0, Lc7/a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc7/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc7/a;

    iget-object v1, p0, Lc7/a;->a:Lc7/a$a;

    iget-object v3, p1, Lc7/a;->a:Lc7/a$a;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lc7/a;->a:Lc7/a$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_5

    if-eq v1, v0, :cond_4

    const/4 v0, 0x2

    if-eq v1, v0, :cond_3

    return v2

    :cond_3
    iget-object v0, p0, Lc7/a;->c:Ljava/lang/String;

    iget-object p1, p1, Lc7/a;->c:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    iget-object v0, p0, Lc7/a;->b:Ljava/lang/String;

    iget-object p1, p1, Lc7/a;->b:Ljava/lang/String;

    goto :goto_0

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lc7/a;->a:Lc7/a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc7/a;->a:Lc7/a$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    return v0

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc7/a;->c:Ljava/lang/String;

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1

    :cond_1
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc7/a;->b:Ljava/lang/String;

    goto :goto_0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

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
    const/4 v0, 0x2

    .line 8
    iget-object v1, p0, Lc7/a;->a:Lc7/a$a;

    .line 9
    .line 10
    iget v1, v1, Lc7/a$a;->a:I

    .line 11
    .line 12
    invoke-static {p1, v0, v1}, Lb/z;->z(Landroid/os/Parcel;II)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    iget-object v1, p0, Lc7/a;->b:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {p1, v0, v1, v2}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    iget-object v1, p0, Lc7/a;->c:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p1, v0, v1, v2}, Lb/z;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    invoke-static {p2, p1}, Lb/z;->L(ILandroid/os/Parcel;)V

    .line 29
    .line 30
    .line 31
    return-void
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
