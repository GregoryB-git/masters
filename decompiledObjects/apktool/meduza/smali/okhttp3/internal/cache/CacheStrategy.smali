.class public final Lokhttp3/internal/cache/CacheStrategy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/cache/CacheStrategy$Factory;
    }
.end annotation


# instance fields
.field public final a:Lokhttp3/Request;

.field public final b:Lokhttp3/Response;


# direct methods
.method public constructor <init>(Lokhttp3/Request;Lokhttp3/Response;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/cache/CacheStrategy;->a:Lokhttp3/Request;

    iput-object p2, p0, Lokhttp3/internal/cache/CacheStrategy;->b:Lokhttp3/Response;

    return-void
.end method

.method public static a(Lokhttp3/Request;Lokhttp3/Response;)Z
    .locals 3

    .line 1
    iget v0, p1, Lokhttp3/Response;->c:I

    .line 2
    .line 3
    const/16 v1, 0xc8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    const/16 v1, 0x19a

    .line 9
    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    const/16 v1, 0x19e

    .line 13
    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    const/16 v1, 0x1f5

    .line 17
    .line 18
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    const/16 v1, 0xcb

    .line 21
    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    const/16 v1, 0xcc

    .line 25
    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    const/16 v1, 0x133

    .line 29
    .line 30
    if-eq v0, v1, :cond_0

    .line 31
    .line 32
    const/16 v1, 0x134

    .line 33
    .line 34
    if-eq v0, v1, :cond_2

    .line 35
    .line 36
    const/16 v1, 0x194

    .line 37
    .line 38
    if-eq v0, v1, :cond_2

    .line 39
    .line 40
    const/16 v1, 0x195

    .line 41
    .line 42
    if-eq v0, v1, :cond_2

    .line 43
    .line 44
    packed-switch v0, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    :pswitch_0
    const-string v0, "Expires"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lokhttp3/Response;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {p1}, Lokhttp3/Response;->f()Lokhttp3/CacheControl;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget v0, v0, Lokhttp3/CacheControl;->c:I

    .line 61
    .line 62
    const/4 v1, -0x1

    .line 63
    if-ne v0, v1, :cond_2

    .line 64
    .line 65
    invoke-virtual {p1}, Lokhttp3/Response;->f()Lokhttp3/CacheControl;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-boolean v0, v0, Lokhttp3/CacheControl;->f:Z

    .line 70
    .line 71
    if-nez v0, :cond_2

    .line 72
    .line 73
    invoke-virtual {p1}, Lokhttp3/Response;->f()Lokhttp3/CacheControl;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-boolean v0, v0, Lokhttp3/CacheControl;->e:Z

    .line 78
    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    :goto_0
    return v2

    .line 83
    :cond_2
    :goto_1
    :pswitch_1
    invoke-virtual {p1}, Lokhttp3/Response;->f()Lokhttp3/CacheControl;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iget-boolean p1, p1, Lokhttp3/CacheControl;->b:Z

    .line 88
    .line 89
    if-nez p1, :cond_4

    .line 90
    .line 91
    iget-object p1, p0, Lokhttp3/Request;->f:Lokhttp3/CacheControl;

    .line 92
    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    iget-object p1, p0, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 97
    .line 98
    invoke-static {p1}, Lokhttp3/CacheControl;->a(Lokhttp3/Headers;)Lokhttp3/CacheControl;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iput-object p1, p0, Lokhttp3/Request;->f:Lokhttp3/CacheControl;

    .line 103
    .line 104
    :goto_2
    iget-boolean p0, p1, Lokhttp3/CacheControl;->b:Z

    .line 105
    .line 106
    if-nez p0, :cond_4

    .line 107
    .line 108
    const/4 v2, 0x1

    .line 109
    :cond_4
    return v2

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 112
    .line 113
    .line 114
    .line 115
.end method
