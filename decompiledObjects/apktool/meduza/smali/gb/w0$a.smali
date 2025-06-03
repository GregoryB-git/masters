.class public final Lgb/w0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lgb/w0;


# direct methods
.method public constructor <init>(Lgb/w0;)V
    .locals 0

    iput-object p1, p0, Lgb/w0$a;->a:Lgb/w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lgb/w0$a;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lgb/w0$a;->a:Lgb/w0;

    .line 2
    .line 3
    iget v1, v0, Lgb/w0;->f:I

    .line 4
    .line 5
    iget v0, v0, Lgb/w0;->e:I

    .line 6
    .line 7
    sub-int/2addr v1, v0

    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lgb/w0$a;->a:Lgb/w0;

    .line 15
    .line 16
    iget-object v2, v1, Lgb/w0;->b:Ljava/util/zip/CRC32;

    .line 17
    .line 18
    iget-object v3, v1, Lgb/w0;->d:[B

    .line 19
    .line 20
    iget v1, v1, Lgb/w0;->e:I

    .line 21
    .line 22
    invoke-virtual {v2, v3, v1, v0}, Ljava/util/zip/CRC32;->update([BII)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lgb/w0$a;->a:Lgb/w0;

    .line 26
    .line 27
    iget v2, v1, Lgb/w0;->e:I

    .line 28
    .line 29
    add-int/2addr v2, v0

    .line 30
    iput v2, v1, Lgb/w0;->e:I

    .line 31
    .line 32
    sub-int v0, p1, v0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v0, p1

    .line 36
    :goto_0
    if-lez v0, :cond_1

    .line 37
    .line 38
    const/16 v1, 0x200

    .line 39
    .line 40
    new-array v2, v1, [B

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    move v4, v3

    .line 44
    :goto_1
    if-ge v4, v0, :cond_1

    .line 45
    .line 46
    sub-int v5, v0, v4

    .line 47
    .line 48
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    iget-object v6, p0, Lgb/w0$a;->a:Lgb/w0;

    .line 53
    .line 54
    iget-object v6, v6, Lgb/w0;->a:Lgb/w;

    .line 55
    .line 56
    invoke-virtual {v6, v2, v3, v5}, Lgb/w;->U([BII)V

    .line 57
    .line 58
    .line 59
    iget-object v6, p0, Lgb/w0$a;->a:Lgb/w0;

    .line 60
    .line 61
    iget-object v6, v6, Lgb/w0;->b:Ljava/util/zip/CRC32;

    .line 62
    .line 63
    invoke-virtual {v6, v2, v3, v5}, Ljava/util/zip/CRC32;->update([BII)V

    .line 64
    .line 65
    .line 66
    add-int/2addr v4, v5

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    iget-object p0, p0, Lgb/w0$a;->a:Lgb/w0;

    .line 69
    .line 70
    iget v0, p0, Lgb/w0;->u:I

    .line 71
    .line 72
    add-int/2addr v0, p1

    .line 73
    iput v0, p0, Lgb/w0;->u:I

    .line 74
    .line 75
    return-void
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


# virtual methods
.method public final b()I
    .locals 3

    .line 1
    iget-object v0, p0, Lgb/w0$a;->a:Lgb/w0;

    .line 2
    .line 3
    iget v1, v0, Lgb/w0;->f:I

    .line 4
    .line 5
    iget v2, v0, Lgb/w0;->e:I

    .line 6
    .line 7
    sub-int/2addr v1, v2

    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    iget-object v1, v0, Lgb/w0;->d:[B

    .line 11
    .line 12
    aget-byte v1, v1, v2

    .line 13
    .line 14
    and-int/lit16 v1, v1, 0xff

    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    iput v2, v0, Lgb/w0;->e:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, v0, Lgb/w0;->a:Lgb/w;

    .line 22
    .line 23
    invoke-virtual {v0}, Lgb/w;->readUnsignedByte()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    :goto_0
    iget-object v0, p0, Lgb/w0$a;->a:Lgb/w0;

    .line 28
    .line 29
    iget-object v0, v0, Lgb/w0;->b:Ljava/util/zip/CRC32;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/zip/CRC32;->update(I)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lgb/w0$a;->a:Lgb/w0;

    .line 35
    .line 36
    iget v2, v0, Lgb/w0;->u:I

    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    iput v2, v0, Lgb/w0;->u:I

    .line 41
    .line 42
    return v1
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
.end method

.method public final c()I
    .locals 2

    invoke-virtual {p0}, Lgb/w0$a;->b()I

    move-result v0

    invoke-virtual {p0}, Lgb/w0$a;->b()I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    return v0
.end method

.method public final d()I
    .locals 3

    .line 1
    iget-object v0, p0, Lgb/w0$a;->a:Lgb/w0;

    .line 2
    .line 3
    iget v1, v0, Lgb/w0;->f:I

    .line 4
    .line 5
    iget v2, v0, Lgb/w0;->e:I

    .line 6
    .line 7
    sub-int/2addr v1, v2

    .line 8
    iget-object v0, v0, Lgb/w0;->a:Lgb/w;

    .line 9
    .line 10
    iget v0, v0, Lgb/w;->c:I

    .line 11
    .line 12
    add-int/2addr v1, v0

    .line 13
    return v1
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
