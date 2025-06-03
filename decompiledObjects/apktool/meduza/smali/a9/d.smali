.class public final La9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:La9/e;


# direct methods
.method public constructor <init>(La9/e;)V
    .locals 0

    iput-object p1, p0, La9/d;->a:La9/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1, v0}, La9/d;->b(Ljava/lang/Object;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Object;Ljava/io/Writer;)V
    .locals 7

    .line 1
    new-instance v6, La9/f;

    .line 2
    .line 3
    iget-object v0, p0, La9/d;->a:La9/e;

    .line 4
    .line 5
    iget-object v2, v0, La9/e;->a:Ljava/util/HashMap;

    .line 6
    .line 7
    iget-object v3, v0, La9/e;->b:Ljava/util/HashMap;

    .line 8
    .line 9
    iget-object v4, v0, La9/e;->c:La9/a;

    .line 10
    .line 11
    iget-boolean v5, v0, La9/e;->d:Z

    .line 12
    .line 13
    move-object v0, v6

    .line 14
    move-object v1, p2

    .line 15
    invoke-direct/range {v0 .. v5}, La9/f;-><init>(Ljava/io/Writer;Ljava/util/HashMap;Ljava/util/HashMap;La9/a;Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v6, p1}, La9/f;->h(Ljava/lang/Object;)La9/f;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v6}, La9/f;->j()V

    .line 22
    .line 23
    .line 24
    iget-object p1, v6, La9/f;->b:Landroid/util/JsonWriter;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/util/JsonWriter;->flush()V

    .line 27
    .line 28
    .line 29
    return-void
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
