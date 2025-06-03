.class public final LR2/C2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/T7;


# instance fields
.field public final synthetic a:LR2/x2;


# direct methods
.method public constructor <init>(LR2/x2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/C2;->a:LR2/x2;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/Q7;Ljava/lang/String;Ljava/util/List;ZZ)V
    .locals 3

    .line 1
    sget-object v0, LR2/E2;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    const/4 v1, 0x2

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq p1, v2, :cond_7

    .line 13
    .line 14
    if-eq p1, v1, :cond_4

    .line 15
    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    const/4 p4, 0x4

    .line 19
    if-eq p1, p4, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, LR2/C2;->a:LR2/x2;

    .line 22
    .line 23
    invoke-virtual {p1}, LR2/m3;->j()LR2/Y1;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, LR2/Y1;->J()LR2/a2;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p1, p0, LR2/C2;->a:LR2/x2;

    .line 33
    .line 34
    invoke-virtual {p1}, LR2/m3;->j()LR2/Y1;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, LR2/Y1;->K()LR2/a2;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object p1, p0, LR2/C2;->a:LR2/x2;

    .line 44
    .line 45
    invoke-virtual {p1}, LR2/m3;->j()LR2/Y1;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p4, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, LR2/Y1;->N()LR2/a2;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    if-nez p5, :cond_3

    .line 57
    .line 58
    invoke-virtual {p1}, LR2/Y1;->M()LR2/a2;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    invoke-virtual {p1}, LR2/Y1;->L()LR2/a2;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto :goto_0

    .line 68
    :cond_4
    iget-object p1, p0, LR2/C2;->a:LR2/x2;

    .line 69
    .line 70
    invoke-virtual {p1}, LR2/m3;->j()LR2/Y1;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eqz p4, :cond_5

    .line 75
    .line 76
    invoke-virtual {p1}, LR2/Y1;->I()LR2/a2;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    goto :goto_0

    .line 81
    :cond_5
    if-nez p5, :cond_6

    .line 82
    .line 83
    invoke-virtual {p1}, LR2/Y1;->H()LR2/a2;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    goto :goto_0

    .line 88
    :cond_6
    invoke-virtual {p1}, LR2/Y1;->G()LR2/a2;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    goto :goto_0

    .line 93
    :cond_7
    iget-object p1, p0, LR2/C2;->a:LR2/x2;

    .line 94
    .line 95
    invoke-virtual {p1}, LR2/m3;->j()LR2/Y1;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1}, LR2/Y1;->F()LR2/a2;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result p4

    .line 107
    const/4 p5, 0x0

    .line 108
    if-eq p4, v2, :cond_a

    .line 109
    .line 110
    if-eq p4, v1, :cond_9

    .line 111
    .line 112
    if-eq p4, v0, :cond_8

    .line 113
    .line 114
    invoke-virtual {p1, p2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_8
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p4

    .line 122
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p5

    .line 126
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    invoke-virtual {p1, p2, p4, p5, p3}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_9
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p4

    .line 138
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    invoke-virtual {p1, p2, p4, p3}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_a
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p3

    .line 150
    invoke-virtual {p1, p2, p3}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    return-void
.end method
