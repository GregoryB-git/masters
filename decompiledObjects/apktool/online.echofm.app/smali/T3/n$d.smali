.class public LT3/n$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT3/n$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT3/n;->w0(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:LT3/n;


# direct methods
.method public constructor <init>(LT3/n;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LT3/n$d;->b:LT3/n;

    .line 2
    .line 3
    iput-boolean p2, p0, LT3/n$d;->a:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 5

    .line 1
    const-string v0, "s"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "ok"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, LT3/n$d;->b:LT3/n;

    .line 19
    .line 20
    sget-object v0, LT3/n$k;->s:LT3/n$k;

    .line 21
    .line 22
    invoke-static {p1, v0}, LT3/n;->P(LT3/n;LT3/n$k;)LT3/n$k;

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, LT3/n$d;->b:LT3/n;

    .line 26
    .line 27
    invoke-static {p1, v2}, LT3/n;->y(LT3/n;I)I

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, LT3/n$d;->b:LT3/n;

    .line 31
    .line 32
    iget-boolean v0, p0, LT3/n$d;->a:Z

    .line 33
    .line 34
    invoke-static {p1, v0}, LT3/n;->A(LT3/n;Z)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :cond_0
    iget-object v1, p0, LT3/n$d;->b:LT3/n;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {v1, v3}, LT3/n;->B(LT3/n;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, LT3/n$d;->b:LT3/n;

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    invoke-static {v1, v3}, LT3/n;->C(LT3/n;Z)Z

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, LT3/n$d;->b:LT3/n;

    .line 52
    .line 53
    invoke-static {v1}, LT3/n;->D(LT3/n;)LT3/h$a;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1, v2}, LT3/h$a;->e(Z)V

    .line 58
    .line 59
    .line 60
    const-string v1, "d"

    .line 61
    .line 62
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Ljava/lang/String;

    .line 67
    .line 68
    iget-object v1, p0, LT3/n$d;->b:LT3/n;

    .line 69
    .line 70
    invoke-static {v1}, LT3/n;->E(LT3/n;)Lc4/c;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    new-instance v3, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v4, "Authentication failed: "

    .line 80
    .line 81
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v4, " ("

    .line 88
    .line 89
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p1, ")"

    .line 96
    .line 97
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-array v2, v2, [Ljava/lang/Object;

    .line 105
    .line 106
    invoke-virtual {v1, p1, v2}, Lc4/c;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, LT3/n$d;->b:LT3/n;

    .line 110
    .line 111
    invoke-static {p1}, LT3/n;->F(LT3/n;)LT3/b;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p1}, LT3/b;->c()V

    .line 116
    .line 117
    .line 118
    const-string p1, "invalid_token"

    .line 119
    .line 120
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_1

    .line 125
    .line 126
    iget-object p1, p0, LT3/n$d;->b:LT3/n;

    .line 127
    .line 128
    invoke-static {p1}, LT3/n;->z(LT3/n;)I

    .line 129
    .line 130
    .line 131
    iget-object p1, p0, LT3/n$d;->b:LT3/n;

    .line 132
    .line 133
    invoke-static {p1}, LT3/n;->x(LT3/n;)I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    int-to-long v0, p1

    .line 138
    const-wide/16 v2, 0x3

    .line 139
    .line 140
    cmp-long p1, v0, v2

    .line 141
    .line 142
    if-ltz p1, :cond_1

    .line 143
    .line 144
    iget-object p1, p0, LT3/n$d;->b:LT3/n;

    .line 145
    .line 146
    invoke-static {p1}, LT3/n;->G(LT3/n;)LU3/a;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p1}, LU3/a;->d()V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, LT3/n$d;->b:LT3/n;

    .line 154
    .line 155
    invoke-static {p1}, LT3/n;->E(LT3/n;)Lc4/c;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    const-string v0, "Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/."

    .line 160
    .line 161
    invoke-virtual {p1, v0}, Lc4/c;->i(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_1
    :goto_0
    return-void
.end method
